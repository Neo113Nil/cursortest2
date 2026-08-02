package d5;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.util.Calendar;
import javax.crypto.Cipher;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import javax.security.auth.x500.X500Principal;
import w1.L;
import w1.P2;

/* loaded from: classes2.dex */
public final class b extends P2 {
    @Override // w1.P2
    public final AlgorithmParameterSpec A() {
        return new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA1, PSource.PSpecified.DEFAULT);
    }

    @Override // w1.P2
    public final Cipher B() {
        return Cipher.getInstance("RSA/ECB/OAEPPadding", "AndroidKeyStoreBCWorkaround");
    }

    @Override // w1.P2
    public final KeyGenParameterSpec L(Calendar calendar, Calendar calendar2) {
        String str = (String) this.f17508b;
        return new KeyGenParameterSpec.Builder(str, 3).setCertificateSubject(new X500Principal(L.i("CN=", str))).setDigests("SHA-256").setBlockModes("ECB").setEncryptionPaddings("OAEPPadding").setCertificateSerialNumber(BigInteger.valueOf(1L)).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime()).build();
    }

    @Override // w1.P2
    public final String h() {
        return ((Context) this.f17509c).getPackageName() + ".FlutterSecureStoragePluginKeyOAEP";
    }
}
