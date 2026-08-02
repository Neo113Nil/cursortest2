package io.flutter.plugins.firebase.auth;

import com.google.firebase.auth.PhoneAuthCredential;
import io.flutter.plugins.firebase.auth.PhoneNumberVerificationStreamHandler;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements PhoneNumberVerificationStreamHandler.OnCredentialsListener {
    @Override // io.flutter.plugins.firebase.auth.PhoneNumberVerificationStreamHandler.OnCredentialsListener
    public final void onCredentialsReceived(PhoneAuthCredential phoneAuthCredential) {
        FlutterFirebaseAuthPlugin.lambda$verifyPhoneNumber$15(phoneAuthCredential);
    }
}
