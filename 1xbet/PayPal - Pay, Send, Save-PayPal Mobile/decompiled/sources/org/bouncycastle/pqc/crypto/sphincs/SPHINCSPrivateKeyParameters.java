package org.bouncycastle.pqc.crypto.sphincs;

/* loaded from: classes17.dex */
public class SPHINCSPrivateKeyParameters extends org.bouncycastle.pqc.crypto.sphincs.SPHINCSKeyParameters {
    private final byte[] getHighResolutionOutputSizeshNQ4ISI;

    public byte[] getKeyData() {
        return org.bouncycastle.util.Arrays.clone(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public SPHINCSPrivateKeyParameters(byte[] bArr, java.lang.String str) {
        super(true, str);
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.util.Arrays.clone(bArr);
    }

    public SPHINCSPrivateKeyParameters(byte[] bArr) {
        super(true, null);
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.util.Arrays.clone(bArr);
    }
}
