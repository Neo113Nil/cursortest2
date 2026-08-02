package B30;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class p implements Function0 {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KeyGenParameterSpec.Builder userAuthenticationRequired = new KeyGenParameterSpec.Builder("fintech_token_id_key_alias", 3).setBlockModes("CBC").setEncryptionPaddings("PKCS7Padding").setRandomizedEncryptionRequired(false).setUserAuthenticationRequired(true);
        int i11 = Build.VERSION.SDK_INT;
        userAuthenticationRequired.setInvalidatedByBiometricEnrollment(true);
        if (i11 >= 30) {
            userAuthenticationRequired.setUserAuthenticationParameters(7, 2);
        } else {
            userAuthenticationRequired.setUserAuthenticationValidityDurationSeconds(7);
        }
        return userAuthenticationRequired.build();
    }
}
