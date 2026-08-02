package io.flutter.plugins.firebase.auth;

import androidx.annotation.Nullable;
import com.google.firebase.FirebaseApiNotAvailableException;
import com.google.firebase.FirebaseNetworkException;
import com.google.firebase.FirebaseTooManyRequestsException;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.FirebaseAuthMultiFactorException;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.FirebaseAuthWeakPasswordException;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.MultiFactorResolver;
import com.google.firebase.auth.MultiFactorSession;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/* loaded from: classes3.dex */
public class FlutterFirebaseAuthPluginException {
    public static GeneratedAndroidFirebaseAuth.FlutterError alreadyLinkedProvider() {
        return new GeneratedAndroidFirebaseAuth.FlutterError("PROVIDER_ALREADY_LINKED", "User has already been linked to the given provider.", null);
    }

    public static GeneratedAndroidFirebaseAuth.FlutterError invalidCredential() {
        return new GeneratedAndroidFirebaseAuth.FlutterError("INVALID_CREDENTIAL", "The supplied auth credential is malformed, has expired or is not currently supported.", null);
    }

    public static GeneratedAndroidFirebaseAuth.FlutterError noSuchProvider() {
        return new GeneratedAndroidFirebaseAuth.FlutterError("NO_SUCH_PROVIDER", "User was not linked to an account with the given provider.", null);
    }

    public static GeneratedAndroidFirebaseAuth.FlutterError noUser() {
        return new GeneratedAndroidFirebaseAuth.FlutterError("NO_CURRENT_USER", "No user currently signed in.", null);
    }

    public static GeneratedAndroidFirebaseAuth.FlutterError parserExceptionToFlutter(@Nullable Exception exc) {
        if (exc == null) {
            return new GeneratedAndroidFirebaseAuth.FlutterError("UNKNOWN", null, null);
        }
        String message = exc.getMessage();
        HashMap hashMap = new HashMap();
        if (exc instanceof FirebaseAuthMultiFactorException) {
            FirebaseAuthMultiFactorException firebaseAuthMultiFactorException = (FirebaseAuthMultiFactorException) exc;
            HashMap hashMap2 = new HashMap();
            MultiFactorResolver resolver = firebaseAuthMultiFactorException.getResolver();
            List<MultiFactorInfo> hints = resolver.getHints();
            MultiFactorSession session = resolver.getSession();
            String uuid = UUID.randomUUID().toString();
            FlutterFirebaseMultiFactor.multiFactorSessionMap.put(uuid, session);
            String uuid2 = UUID.randomUUID().toString();
            FlutterFirebaseMultiFactor.multiFactorResolverMap.put(uuid2, resolver);
            List<List<Object>> multiFactorInfoToMap = PigeonParser.multiFactorInfoToMap(hints);
            hashMap2.put(Constants.APP_NAME, firebaseAuthMultiFactorException.getResolver().getFirebaseAuth().getApp().getName());
            hashMap2.put(Constants.MULTI_FACTOR_HINTS, multiFactorInfoToMap);
            hashMap2.put(Constants.MULTI_FACTOR_SESSION_ID, uuid);
            hashMap2.put(Constants.MULTI_FACTOR_RESOLVER_ID, uuid2);
            return new GeneratedAndroidFirebaseAuth.FlutterError(firebaseAuthMultiFactorException.getErrorCode(), firebaseAuthMultiFactorException.getLocalizedMessage(), hashMap2);
        }
        if ((exc instanceof FirebaseNetworkException) || (exc.getCause() != null && (exc.getCause() instanceof FirebaseNetworkException))) {
            return new GeneratedAndroidFirebaseAuth.FlutterError("network-request-failed", "A network error (such as timeout, interrupted connection or unreachable host) has occurred.", null);
        }
        if ((exc instanceof FirebaseApiNotAvailableException) || (exc.getCause() != null && (exc.getCause() instanceof FirebaseApiNotAvailableException))) {
            return new GeneratedAndroidFirebaseAuth.FlutterError("api-not-available", "The requested API is not available.", null);
        }
        if ((exc instanceof FirebaseTooManyRequestsException) || (exc.getCause() != null && (exc.getCause() instanceof FirebaseTooManyRequestsException))) {
            return new GeneratedAndroidFirebaseAuth.FlutterError("too-many-requests", "We have blocked all requests from this device due to unusual activity. Try again later.", null);
        }
        if (exc.getMessage() != null && exc.getMessage().startsWith("Cannot create PhoneAuthCredential without either verificationProof")) {
            return new GeneratedAndroidFirebaseAuth.FlutterError("invalid-verification-code", "The verification ID used to create the phone auth credential is invalid.", null);
        }
        if (message != null && message.contains("User has already been linked to the given provider.")) {
            return alreadyLinkedProvider();
        }
        String errorCode = exc instanceof FirebaseAuthException ? ((FirebaseAuthException) exc).getErrorCode() : "UNKNOWN";
        if (exc instanceof FirebaseAuthWeakPasswordException) {
            message = ((FirebaseAuthWeakPasswordException) exc).getReason();
        }
        if (exc instanceof FirebaseAuthUserCollisionException) {
            FirebaseAuthUserCollisionException firebaseAuthUserCollisionException = (FirebaseAuthUserCollisionException) exc;
            String email = firebaseAuthUserCollisionException.getEmail();
            if (email != null) {
                hashMap.put("email", email);
            }
            AuthCredential updatedCredential = firebaseAuthUserCollisionException.getUpdatedCredential();
            if (updatedCredential != null) {
                hashMap.put("authCredential", PigeonParser.parseAuthCredential(updatedCredential));
            }
        }
        return new GeneratedAndroidFirebaseAuth.FlutterError(errorCode, message, hashMap);
    }
}
