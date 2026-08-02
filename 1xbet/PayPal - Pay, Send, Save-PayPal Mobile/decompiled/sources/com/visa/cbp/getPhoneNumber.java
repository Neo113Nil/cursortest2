package com.visa.cbp;

/* loaded from: classes16.dex */
class getPhoneNumber {
    static final byte Camera2StreamConfigurationMap = 0;
    static final byte getHighSpeedVideoFpsRanges = 1;
    static final byte getHighSpeedVideoFpsRangesFor = 1;
    static final byte getHighSpeedVideoSizes = 0;
    public short getHighResolutionOutputSizeshNQ4ISI;
    short getHighSpeedVideoSizesFor;
    public java.util.Vector<com.visa.cbp.getPhoneNumber> getInputSizeshNQ4ISI;
    byte getOutputFormats;
    byte[] getOutputMinFrameDuration;

    public getPhoneNumber(byte[] bArr, short s, short s2) {
        this.getOutputMinFrameDuration = null;
        this.getOutputFormats = (byte) 0;
        this.getInputSizeshNQ4ISI = null;
        short[] sArr = new short[2];
        short highResolutionOutputSizeshNQ4ISI = new com.visa.cbp.setPhoneNumber().getHighResolutionOutputSizeshNQ4ISI(bArr, s, sArr);
        short s3 = sArr[0];
        this.getHighSpeedVideoSizesFor = s3;
        short s4 = sArr[1];
        this.getHighResolutionOutputSizeshNQ4ISI = s4;
        short s5 = (short) ((s3 >> 8) & 255);
        if (((s5 != 0 ? s5 : s3) & 32) > 0) {
            this.getOutputFormats = (byte) 1;
            this.getInputSizeshNQ4ISI = new java.util.Vector<>();
            int i = s + highResolutionOutputSizeshNQ4ISI;
            while (true) {
                short s6 = (short) i;
                if (s6 >= s2) {
                    return;
                }
                short highResolutionOutputSizeshNQ4ISI2 = new com.visa.cbp.setPhoneNumber().getHighResolutionOutputSizeshNQ4ISI(bArr, s6, sArr);
                this.getInputSizeshNQ4ISI.add(new com.visa.cbp.getPhoneNumber(bArr, s6, (short) (sArr[1] + s6)));
                i = ((short) (s6 + sArr[1])) + highResolutionOutputSizeshNQ4ISI2;
            }
        } else {
            short s7 = (short) (s + highResolutionOutputSizeshNQ4ISI);
            this.getOutputMinFrameDuration = java.util.Arrays.copyOfRange(bArr, (int) s7, s4 + s7);
        }
    }

    public byte[] getHighSpeedVideoFpsRangesFor() {
        byte[] bArr = this.getOutputMinFrameDuration;
        if (bArr != null) {
            return bArr;
        }
        return null;
    }

    public com.visa.cbp.getPhoneNumber getHighSpeedVideoSizes(short s) {
        if (this.getHighSpeedVideoSizesFor == s) {
            return this;
        }
        if (this.getOutputFormats != 1) {
            return null;
        }
        java.util.Iterator<com.visa.cbp.getPhoneNumber> it = this.getInputSizeshNQ4ISI.iterator();
        while (it.hasNext()) {
            com.visa.cbp.getPhoneNumber next = it.next();
            if (next.getHighSpeedVideoSizes(s) != null) {
                return next;
            }
        }
        return null;
    }

    public com.visa.cbp.getPhoneNumber Camera2StreamConfigurationMap(short s, int i) {
        if (this.getHighSpeedVideoSizesFor == s) {
            return this;
        }
        if (this.getOutputFormats != 1 || i <= 0) {
            return null;
        }
        java.util.Iterator<com.visa.cbp.getPhoneNumber> it = this.getInputSizeshNQ4ISI.iterator();
        while (it.hasNext()) {
            com.visa.cbp.getPhoneNumber next = it.next();
            if (next.Camera2StreamConfigurationMap(s, i - 1) != null) {
                return next;
            }
        }
        return null;
    }
}
