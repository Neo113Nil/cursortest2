package io.flutter.plugins.firebase.auth;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.auth.TotpSecret;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;

/* loaded from: classes3.dex */
public class FlutterFirebaseTotpSecret implements GeneratedAndroidFirebaseAuth.MultiFactorTotpSecretHostApi {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorTotpSecretHostApi
    public void generateQrCodeUrl(@NonNull String str, @Nullable String str2, @Nullable String str3, @NonNull GeneratedAndroidFirebaseAuth.Result<String> result) {
        TotpSecret totpSecret = FlutterFirebaseTotpMultiFactor.multiFactorSecret.get(str);
        if (str2 == null || str3 == null) {
            result.success(totpSecret.generateQrCodeUrl());
        } else {
            result.success(totpSecret.generateQrCodeUrl(str2, str3));
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorTotpSecretHostApi
    public void openInOtpApp(@NonNull String str, @NonNull String str2, @NonNull GeneratedAndroidFirebaseAuth.VoidResult voidResult) {
        FlutterFirebaseTotpMultiFactor.multiFactorSecret.get(str).openInOtpApp(str2);
        voidResult.success();
    }
}
