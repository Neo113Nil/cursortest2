package p027d5;

import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import p155w1.C1017n0;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends C1017n0 {
    @Override // p155w1.C1017n0
    public final String o() {
        return "VGhpcyBpcyB0aGUga2V5IGZvcihBIHNlY3XyZZBzdG9yYWdlIEFFUyBLZXkK";
    }

    @Override // p155w1.C1017n0
    public final Cipher p() {
        return Cipher.getInstance("AES/GCM/NoPadding");
    }

    @Override // p155w1.C1017n0
    public final int x() {
        return 12;
    }

    @Override // p155w1.C1017n0
    public final AlgorithmParameterSpec z(byte[] bArr) {
        return new GCMParameterSpec(128, bArr);
    }
}
