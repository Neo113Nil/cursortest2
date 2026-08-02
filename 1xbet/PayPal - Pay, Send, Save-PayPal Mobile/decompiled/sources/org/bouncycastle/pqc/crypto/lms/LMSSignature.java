package org.bouncycastle.pqc.crypto.lms;

/* loaded from: classes17.dex */
class LMSSignature implements org.bouncycastle.util.Encodable {
    final org.bouncycastle.pqc.crypto.lms.LMSigParameters Camera2StreamConfigurationMap;
    final org.bouncycastle.pqc.crypto.lms.LMOtsSignature getHighResolutionOutputSizeshNQ4ISI;
    final int getHighSpeedVideoFpsRanges;
    final byte[][] getHighSpeedVideoSizes;

    public int hashCode() {
        int i = this.getHighSpeedVideoFpsRanges;
        org.bouncycastle.pqc.crypto.lms.LMOtsSignature lMOtsSignature = this.getHighResolutionOutputSizeshNQ4ISI;
        int hashCode = lMOtsSignature != null ? lMOtsSignature.hashCode() : 0;
        org.bouncycastle.pqc.crypto.lms.LMSigParameters lMSigParameters = this.Camera2StreamConfigurationMap;
        return (((((i * 31) + hashCode) * 31) + (lMSigParameters != null ? lMSigParameters.hashCode() : 0)) * 31) + java.util.Arrays.deepHashCode(this.getHighSpeedVideoSizes);
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws java.io.IOException {
        return org.bouncycastle.pqc.crypto.lms.Composer.compose().u32str(this.getHighSpeedVideoFpsRanges).bytes(this.getHighResolutionOutputSizeshNQ4ISI.getEncoded()).u32str(this.Camera2StreamConfigurationMap.getType()).bytes(this.getHighSpeedVideoSizes).build();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        org.bouncycastle.pqc.crypto.lms.LMSSignature lMSSignature = (org.bouncycastle.pqc.crypto.lms.LMSSignature) obj;
        if (this.getHighSpeedVideoFpsRanges != lMSSignature.getHighSpeedVideoFpsRanges) {
            return false;
        }
        org.bouncycastle.pqc.crypto.lms.LMOtsSignature lMOtsSignature = this.getHighResolutionOutputSizeshNQ4ISI;
        if (lMOtsSignature == null ? lMSSignature.getHighResolutionOutputSizeshNQ4ISI != null : !lMOtsSignature.equals(lMSSignature.getHighResolutionOutputSizeshNQ4ISI)) {
            return false;
        }
        org.bouncycastle.pqc.crypto.lms.LMSigParameters lMSigParameters = this.Camera2StreamConfigurationMap;
        if (lMSigParameters == null ? lMSSignature.Camera2StreamConfigurationMap == null : lMSigParameters.equals(lMSSignature.Camera2StreamConfigurationMap)) {
            return java.util.Arrays.deepEquals(this.getHighSpeedVideoSizes, lMSSignature.getHighSpeedVideoSizes);
        }
        return false;
    }

    public static org.bouncycastle.pqc.crypto.lms.LMSSignature getHighSpeedVideoFpsRanges(java.lang.Object obj) throws java.io.IOException {
        java.io.DataInputStream dataInputStream;
        while (!(obj instanceof org.bouncycastle.pqc.crypto.lms.LMSSignature)) {
            if (obj instanceof java.io.DataInputStream) {
                java.io.DataInputStream dataInputStream2 = (java.io.DataInputStream) obj;
                int readInt = dataInputStream2.readInt();
                org.bouncycastle.pqc.crypto.lms.LMOtsSignature highSpeedVideoSizes = org.bouncycastle.pqc.crypto.lms.LMOtsSignature.getHighSpeedVideoSizes(obj);
                org.bouncycastle.pqc.crypto.lms.LMSigParameters Camera2StreamConfigurationMap = org.bouncycastle.pqc.crypto.lms.LMSigParameters.Camera2StreamConfigurationMap(dataInputStream2.readInt());
                int h = Camera2StreamConfigurationMap.getH();
                byte[][] bArr = new byte[h][];
                for (int i = 0; i < h; i++) {
                    byte[] bArr2 = new byte[Camera2StreamConfigurationMap.getM()];
                    bArr[i] = bArr2;
                    dataInputStream2.readFully(bArr2);
                }
                return new org.bouncycastle.pqc.crypto.lms.LMSSignature(readInt, highSpeedVideoSizes, Camera2StreamConfigurationMap, bArr);
            }
            if (obj instanceof byte[]) {
                try {
                    dataInputStream = new java.io.DataInputStream(new java.io.ByteArrayInputStream((byte[]) obj));
                    try {
                        org.bouncycastle.pqc.crypto.lms.LMSSignature highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(dataInputStream);
                        dataInputStream.close();
                        return highSpeedVideoFpsRanges;
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
        return (org.bouncycastle.pqc.crypto.lms.LMSSignature) obj;
    }

    public LMSSignature(int i, org.bouncycastle.pqc.crypto.lms.LMOtsSignature lMOtsSignature, org.bouncycastle.pqc.crypto.lms.LMSigParameters lMSigParameters, byte[][] bArr) {
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighResolutionOutputSizeshNQ4ISI = lMOtsSignature;
        this.Camera2StreamConfigurationMap = lMSigParameters;
        this.getHighSpeedVideoSizes = bArr;
    }
}
