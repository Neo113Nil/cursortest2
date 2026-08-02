package org.bouncycastle.crypto.modes.gcm;

/* loaded from: classes17.dex */
public class Tables1kGCMExponentiator implements org.bouncycastle.crypto.modes.gcm.GCMExponentiator {
    private java.util.Vector getHighSpeedVideoSizes;

    @Override // org.bouncycastle.crypto.modes.gcm.GCMExponentiator
    public void exponentiateX(long j, byte[] bArr) {
        long[] oneAsLongs = org.bouncycastle.crypto.modes.gcm.GCMUtil.oneAsLongs();
        int i = 0;
        while (j > 0) {
            if ((1 & j) != 0) {
                int size = this.getHighSpeedVideoSizes.size() - 1;
                if (size < i) {
                    long[] jArr = (long[]) this.getHighSpeedVideoSizes.elementAt(size);
                    while (true) {
                        long[] jArr2 = new long[2];
                        org.bouncycastle.crypto.modes.gcm.GCMUtil.square(jArr, jArr2);
                        this.getHighSpeedVideoSizes.addElement(jArr2);
                        size++;
                        if (size >= i) {
                            break;
                        } else {
                            jArr = jArr2;
                        }
                    }
                }
                org.bouncycastle.crypto.modes.gcm.GCMUtil.multiply(oneAsLongs, (long[]) this.getHighSpeedVideoSizes.elementAt(i));
            }
            i++;
            j >>>= 1;
        }
        org.bouncycastle.crypto.modes.gcm.GCMUtil.asBytes(oneAsLongs, bArr);
    }

    @Override // org.bouncycastle.crypto.modes.gcm.GCMExponentiator
    public void init(byte[] bArr) {
        long[] asLongs = org.bouncycastle.crypto.modes.gcm.GCMUtil.asLongs(bArr);
        java.util.Vector vector = this.getHighSpeedVideoSizes;
        if (vector == null || 0 == org.bouncycastle.crypto.modes.gcm.GCMUtil.areEqual(asLongs, (long[]) vector.elementAt(0))) {
            java.util.Vector vector2 = new java.util.Vector(8);
            this.getHighSpeedVideoSizes = vector2;
            vector2.addElement(asLongs);
        }
    }
}
