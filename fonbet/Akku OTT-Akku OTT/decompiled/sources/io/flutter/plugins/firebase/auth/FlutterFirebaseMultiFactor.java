package io.flutter.plugins.firebase.auth;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.credentials.playservices.q;
import androidx.media3.common.C0332q;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.MultiFactor;
import com.google.firebase.auth.MultiFactorAssertion;
import com.google.firebase.auth.MultiFactorResolver;
import com.google.firebase.auth.MultiFactorSession;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.auth.PhoneMultiFactorGenerator;
import com.google.firebase.internal.api.FirebaseNoSignedInUserException;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes3.dex */
public class FlutterFirebaseMultiFactor implements GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi, GeneratedAndroidFirebaseAuth.MultiFactoResolverHostApi {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final Map<String, Map<String, MultiFactor>> multiFactorUserMap = new HashMap();
    static final Map<String, MultiFactorSession> multiFactorSessionMap = new HashMap();
    static final Map<String, MultiFactorResolver> multiFactorResolverMap = new HashMap();
    static final Map<String, MultiFactorAssertion> multiFactorAssertionMap = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$enrollPhone$0(GeneratedAndroidFirebaseAuth.VoidResult voidResult, Task task) {
        if (task.isSuccessful()) {
            voidResult.success();
        } else {
            voidResult.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$enrollTotp$1(GeneratedAndroidFirebaseAuth.VoidResult voidResult, Task task) {
        if (task.isSuccessful()) {
            voidResult.success();
        } else {
            voidResult.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getSession$2(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (!task.isSuccessful()) {
            androidx.collection.h.d(result, task);
            return;
        }
        MultiFactorSession multiFactorSession = (MultiFactorSession) task.getResult();
        String uuid = UUID.randomUUID().toString();
        multiFactorSessionMap.put(uuid, multiFactorSession);
        result.success(new GeneratedAndroidFirebaseAuth.PigeonMultiFactorSession.Builder().setId(uuid).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$resolveSignIn$4(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseAuthResult((AuthResult) task.getResult()));
        } else {
            androidx.collection.h.d(result, task);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$unenroll$3(GeneratedAndroidFirebaseAuth.VoidResult voidResult, Task task) {
        if (task.isSuccessful()) {
            voidResult.success();
        } else {
            voidResult.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi
    public void enrollPhone(@NonNull GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull GeneratedAndroidFirebaseAuth.PigeonPhoneMultiFactorAssertion pigeonPhoneMultiFactorAssertion, @Nullable String str, @NonNull GeneratedAndroidFirebaseAuth.VoidResult voidResult) {
        try {
            getAppMultiFactor(authPigeonFirebaseApp).enroll(PhoneMultiFactorGenerator.getAssertion(PhoneAuthProvider.getCredential(pigeonPhoneMultiFactorAssertion.getVerificationId(), pigeonPhoneMultiFactorAssertion.getVerificationCode())), str).addOnCompleteListener(new C0332q(voidResult, 3));
        } catch (FirebaseNoSignedInUserException e) {
            voidResult.error(e);
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi
    public void enrollTotp(@NonNull GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull String str, @Nullable String str2, @NonNull GeneratedAndroidFirebaseAuth.VoidResult voidResult) {
        try {
            getAppMultiFactor(authPigeonFirebaseApp).enroll(multiFactorAssertionMap.get(str), str2).addOnCompleteListener(new androidx.credentials.playservices.p(voidResult, 5));
        } catch (FirebaseNoSignedInUserException e) {
            voidResult.error(e);
        }
    }

    public MultiFactor getAppMultiFactor(@NonNull GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp) throws FirebaseNoSignedInUserException {
        FirebaseUser currentUserFromPigeon = FlutterFirebaseAuthUser.getCurrentUserFromPigeon(authPigeonFirebaseApp);
        if (currentUserFromPigeon == null) {
            throw new FirebaseNoSignedInUserException("No user is signed in");
        }
        Map<String, Map<String, MultiFactor>> map = multiFactorUserMap;
        if (map.get(authPigeonFirebaseApp.getAppName()) == null) {
            map.put(authPigeonFirebaseApp.getAppName(), new HashMap());
        }
        Map<String, MultiFactor> map2 = map.get(authPigeonFirebaseApp.getAppName());
        if (map2.get(currentUserFromPigeon.getUid()) == null) {
            map2.put(currentUserFromPigeon.getUid(), currentUserFromPigeon.getMultiFactor());
        }
        return map2.get(currentUserFromPigeon.getUid());
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi
    public void getEnrolledFactors(@NonNull GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull GeneratedAndroidFirebaseAuth.Result<List<GeneratedAndroidFirebaseAuth.PigeonMultiFactorInfo>> result) {
        try {
            result.success(PigeonParser.multiFactorInfoToPigeon(getAppMultiFactor(authPigeonFirebaseApp).getEnrolledFactors()));
        } catch (FirebaseNoSignedInUserException e) {
            result.error(e);
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi
    public void getSession(@NonNull GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonMultiFactorSession> result) {
        try {
            getAppMultiFactor(authPigeonFirebaseApp).getSession().addOnCompleteListener(new defpackage.f(result, 6));
        } catch (FirebaseNoSignedInUserException e) {
            result.error(e);
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactoResolverHostApi
    public void resolveSignIn(@NonNull String str, @Nullable GeneratedAndroidFirebaseAuth.PigeonPhoneMultiFactorAssertion pigeonPhoneMultiFactorAssertion, @Nullable String str2, @NonNull GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> result) {
        MultiFactorResolver multiFactorResolver = multiFactorResolverMap.get(str);
        if (multiFactorResolver == null) {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(new Exception("Resolver not found")));
        } else {
            multiFactorResolver.resolveSignIn(pigeonPhoneMultiFactorAssertion != null ? PhoneMultiFactorGenerator.getAssertion(PhoneAuthProvider.getCredential(pigeonPhoneMultiFactorAssertion.getVerificationId(), pigeonPhoneMultiFactorAssertion.getVerificationCode())) : multiFactorAssertionMap.get(str2)).addOnCompleteListener(new defpackage.e(result, 5));
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi
    public void unenroll(@NonNull GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull String str, @NonNull GeneratedAndroidFirebaseAuth.VoidResult voidResult) {
        try {
            getAppMultiFactor(authPigeonFirebaseApp).unenroll(str).addOnCompleteListener(new q(voidResult, 7));
        } catch (FirebaseNoSignedInUserException e) {
            voidResult.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(e));
        }
    }
}
