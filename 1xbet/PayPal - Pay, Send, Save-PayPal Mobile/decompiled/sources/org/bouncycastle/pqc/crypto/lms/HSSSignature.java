package org.bouncycastle.pqc.crypto.lms;

/* loaded from: classes17.dex */
public class HSSSignature implements org.bouncycastle.util.Encodable {
    private final org.bouncycastle.pqc.crypto.lms.LMSSignature getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.pqc.crypto.lms.LMSSignedPubKey[] getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;

    public int hashCode() {
        int i = this.getHighSpeedVideoSizes;
        int hashCode = java.util.Arrays.hashCode(this.getHighSpeedVideoFpsRangesFor);
        org.bouncycastle.pqc.crypto.lms.LMSSignature lMSSignature = this.getHighSpeedVideoFpsRanges;
        return (((i * 31) + hashCode) * 31) + (lMSSignature != null ? lMSSignature.hashCode() : 0);
    }

    public int getlMinus1() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.pqc.crypto.lms.LMSSignedPubKey[] getSignedPubKey() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.pqc.crypto.lms.LMSSignature getSignature() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws java.io.IOException {
        org.bouncycastle.pqc.crypto.lms.Composer compose = org.bouncycastle.pqc.crypto.lms.Composer.compose();
        compose.u32str(this.getHighSpeedVideoSizes);
        org.bouncycastle.pqc.crypto.lms.LMSSignedPubKey[] lMSSignedPubKeyArr = this.getHighSpeedVideoFpsRangesFor;
        if (lMSSignedPubKeyArr != null) {
            for (org.bouncycastle.pqc.crypto.lms.LMSSignedPubKey lMSSignedPubKey : lMSSignedPubKeyArr) {
                compose.bytes(lMSSignedPubKey);
            }
        }
        compose.bytes(this.getHighSpeedVideoFpsRanges);
        return compose.build();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            org.bouncycastle.pqc.crypto.lms.HSSSignature hSSSignature = (org.bouncycastle.pqc.crypto.lms.HSSSignature) obj;
            if (this.getHighSpeedVideoSizes != hSSSignature.getHighSpeedVideoSizes || this.getHighSpeedVideoFpsRangesFor.length != hSSSignature.getHighSpeedVideoFpsRangesFor.length) {
                return false;
            }
            int i = 0;
            while (true) {
                org.bouncycastle.pqc.crypto.lms.LMSSignedPubKey[] lMSSignedPubKeyArr = this.getHighSpeedVideoFpsRangesFor;
                if (i >= lMSSignedPubKeyArr.length) {
                    org.bouncycastle.pqc.crypto.lms.LMSSignature lMSSignature = this.getHighSpeedVideoFpsRanges;
                    org.bouncycastle.pqc.crypto.lms.LMSSignature lMSSignature2 = hSSSignature.getHighSpeedVideoFpsRanges;
                    if (lMSSignature != null) {
                        return lMSSignature.equals(lMSSignature2);
                    }
                    if (lMSSignature2 == null) {
                        return true;
                    }
                } else {
                    if (!lMSSignedPubKeyArr[i].equals(hSSSignature.getHighSpeedVideoFpsRangesFor[i])) {
                        return false;
                    }
                    i++;
                }
            }
        }
        return false;
    }

    public static org.bouncycastle.pqc.crypto.lms.HSSSignature getInstance(java.lang.Object obj, int i) throws java.io.IOException {
        java.io.DataInputStream dataInputStream;
        while (!(obj instanceof org.bouncycastle.pqc.crypto.lms.HSSSignature)) {
            if (obj instanceof java.io.DataInputStream) {
                int readInt = ((java.io.DataInputStream) obj).readInt();
                if (readInt != i - 1) {
                    throw new java.lang.IllegalStateException("nspk exceeded maxNspk");
                }
                org.bouncycastle.pqc.crypto.lms.LMSSignedPubKey[] lMSSignedPubKeyArr = new org.bouncycastle.pqc.crypto.lms.LMSSignedPubKey[readInt];
                if (readInt != 0) {
                    for (int i2 = 0; i2 < readInt; i2++) {
                        lMSSignedPubKeyArr[i2] = new org.bouncycastle.pqc.crypto.lms.LMSSignedPubKey(org.bouncycastle.pqc.crypto.lms.LMSSignature.getHighSpeedVideoFpsRanges(obj), org.bouncycastle.pqc.crypto.lms.LMSPublicKeyParameters.getInstance(obj));
                    }
                }
                return new org.bouncycastle.pqc.crypto.lms.HSSSignature(readInt, lMSSignedPubKeyArr, org.bouncycastle.pqc.crypto.lms.LMSSignature.getHighSpeedVideoFpsRanges(obj));
            }
            if (obj instanceof byte[]) {
                try {
                    dataInputStream = new java.io.DataInputStream(new java.io.ByteArrayInputStream((byte[]) obj));
                    try {
                        org.bouncycastle.pqc.crypto.lms.HSSSignature hSSSignature = getInstance(dataInputStream, i);
                        dataInputStream.close();
                        return hSSSignature;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        if (dataInputStream != null) {
                            dataInputStream.close();
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    dataInputStream = null;
                }
            } else {
                if (!(obj instanceof java.io.InputStream)) {
                    throw new java.lang.IllegalArgumentException("cannot parse ".concat(java.lang.String.valueOf(obj)));
                }
                obj = org.bouncycastle.util.io.Streams.readAll((java.io.InputStream) obj);
            }
        }
        return (org.bouncycastle.pqc.crypto.lms.HSSSignature) obj;
    }

    public HSSSignature(int i, org.bouncycastle.pqc.crypto.lms.LMSSignedPubKey[] lMSSignedPubKeyArr, org.bouncycastle.pqc.crypto.lms.LMSSignature lMSSignature) {
        this.getHighSpeedVideoSizes = i;
        this.getHighSpeedVideoFpsRangesFor = lMSSignedPubKeyArr;
        this.getHighSpeedVideoFpsRanges = lMSSignature;
    }
}
