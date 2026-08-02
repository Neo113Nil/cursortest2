package org.bouncycastle.jcajce.spec;

/* loaded from: classes17.dex */
public class OpenSSHPublicKeySpec extends java.security.spec.EncodedKeySpec {
    private static final java.lang.String[] getHighSpeedVideoFpsRangesFor = {"ssh-rsa", "ssh-ed25519", "ssh-dss"};
    private final java.lang.String getHighSpeedVideoSizes;

    public java.lang.String getType() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // java.security.spec.EncodedKeySpec
    public java.lang.String getFormat() {
        return "OpenSSH";
    }

    public OpenSSHPublicKeySpec(byte[] bArr) {
        super(bArr);
        int i = 0;
        int i2 = (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) + 4;
        if (i2 >= bArr.length) {
            throw new java.lang.IllegalArgumentException("invalid public key blob: type field longer than blob");
        }
        java.lang.String fromByteArray = org.bouncycastle.util.Strings.fromByteArray(org.bouncycastle.util.Arrays.copyOfRange(bArr, 4, i2));
        this.getHighSpeedVideoSizes = fromByteArray;
        if (fromByteArray.startsWith("ecdsa")) {
            return;
        }
        while (true) {
            java.lang.String[] strArr = getHighSpeedVideoFpsRangesFor;
            if (i >= strArr.length) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("unrecognised public key type ");
                sb.append(this.getHighSpeedVideoSizes);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            if (strArr[i].equals(this.getHighSpeedVideoSizes)) {
                return;
            } else {
                i++;
            }
        }
    }
}
