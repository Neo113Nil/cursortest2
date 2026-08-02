package org.bouncycastle.pqc.crypto.lms;

/* loaded from: classes17.dex */
class LMOtsSignature implements org.bouncycastle.util.Encodable {
    final byte[] Camera2StreamConfigurationMap;
    final org.bouncycastle.pqc.crypto.lms.LMOtsParameters getHighResolutionOutputSizeshNQ4ISI;
    final byte[] getHighSpeedVideoFpsRangesFor;

    public int hashCode() {
        org.bouncycastle.pqc.crypto.lms.LMOtsParameters lMOtsParameters = this.getHighResolutionOutputSizeshNQ4ISI;
        return ((((lMOtsParameters != null ? lMOtsParameters.hashCode() : 0) * 31) + java.util.Arrays.hashCode(this.Camera2StreamConfigurationMap)) * 31) + java.util.Arrays.hashCode(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws java.io.IOException {
        return org.bouncycastle.pqc.crypto.lms.Composer.compose().u32str(this.getHighResolutionOutputSizeshNQ4ISI.getType()).bytes(this.Camera2StreamConfigurationMap).bytes(this.getHighSpeedVideoFpsRangesFor).build();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        org.bouncycastle.pqc.crypto.lms.LMOtsSignature lMOtsSignature = (org.bouncycastle.pqc.crypto.lms.LMOtsSignature) obj;
        org.bouncycastle.pqc.crypto.lms.LMOtsParameters lMOtsParameters = this.getHighResolutionOutputSizeshNQ4ISI;
        if (lMOtsParameters == null ? lMOtsSignature.getHighResolutionOutputSizeshNQ4ISI != null : !lMOtsParameters.equals(lMOtsSignature.getHighResolutionOutputSizeshNQ4ISI)) {
            return false;
        }
        if (java.util.Arrays.equals(this.Camera2StreamConfigurationMap, lMOtsSignature.Camera2StreamConfigurationMap)) {
            return java.util.Arrays.equals(this.getHighSpeedVideoFpsRangesFor, lMOtsSignature.getHighSpeedVideoFpsRangesFor);
        }
        return false;
    }

    public static org.bouncycastle.pqc.crypto.lms.LMOtsSignature getHighSpeedVideoSizes(java.lang.Object obj) throws java.io.IOException {
        java.io.DataInputStream dataInputStream;
        while (!(obj instanceof org.bouncycastle.pqc.crypto.lms.LMOtsSignature)) {
            if (obj instanceof java.io.DataInputStream) {
                java.io.DataInputStream dataInputStream2 = (java.io.DataInputStream) obj;
                org.bouncycastle.pqc.crypto.lms.LMOtsParameters parametersForType = org.bouncycastle.pqc.crypto.lms.LMOtsParameters.getParametersForType(dataInputStream2.readInt());
                byte[] bArr = new byte[parametersForType.getN()];
                dataInputStream2.readFully(bArr);
                byte[] bArr2 = new byte[parametersForType.getP() * parametersForType.getN()];
                dataInputStream2.readFully(bArr2);
                return new org.bouncycastle.pqc.crypto.lms.LMOtsSignature(parametersForType, bArr, bArr2);
            }
            if (obj instanceof byte[]) {
                try {
                    dataInputStream = new java.io.DataInputStream(new java.io.ByteArrayInputStream((byte[]) obj));
                    try {
                        org.bouncycastle.pqc.crypto.lms.LMOtsSignature highSpeedVideoSizes = getHighSpeedVideoSizes(dataInputStream);
                        dataInputStream.close();
                        return highSpeedVideoSizes;
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
        return (org.bouncycastle.pqc.crypto.lms.LMOtsSignature) obj;
    }

    public LMOtsSignature(org.bouncycastle.pqc.crypto.lms.LMOtsParameters lMOtsParameters, byte[] bArr, byte[] bArr2) {
        this.getHighResolutionOutputSizeshNQ4ISI = lMOtsParameters;
        this.Camera2StreamConfigurationMap = bArr;
        this.getHighSpeedVideoFpsRangesFor = bArr2;
    }
}
