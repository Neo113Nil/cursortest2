package org.bouncycastle.pqc.crypto.newhope;

/* loaded from: classes17.dex */
public class NHPublicKeyParameters extends org.bouncycastle.crypto.params.AsymmetricKeyParameter {
    final byte[] Camera2StreamConfigurationMap;

    public byte[] getPubData() {
        return org.bouncycastle.util.Arrays.clone(this.Camera2StreamConfigurationMap);
    }

    public NHPublicKeyParameters(byte[] bArr) {
        super(false);
        this.Camera2StreamConfigurationMap = org.bouncycastle.util.Arrays.clone(bArr);
    }
}
