package d5;

import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import w1.C1726n0;

/* loaded from: classes2.dex */
public final class d extends C1726n0 {
    @Override // w1.C1726n0
    public final String o() {
        return "VGhpcyBpcyB0aGUga2V5IGZvcihBIHNlY3XyZZBzdG9yYWdlIEFFUyBLZXkK";
    }

    @Override // w1.C1726n0
    public final Cipher p() {
        return Cipher.getInstance("AES/GCM/NoPadding");
    }

    @Override // w1.C1726n0
    public final int x() {
        return 12;
    }

    @Override // w1.C1726n0
    public final AlgorithmParameterSpec z(byte[] bArr) {
        return new GCMParameterSpec(128, bArr);
    }
}
