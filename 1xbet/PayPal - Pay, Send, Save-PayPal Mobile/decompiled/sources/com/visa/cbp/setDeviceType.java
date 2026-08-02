package com.visa.cbp;

/* loaded from: classes5.dex */
public class setDeviceType {
    private static final int getHighResolutionOutputSizeshNQ4ISI = 4;
    private java.nio.ByteBuffer getHighSpeedVideoFpsRangesFor;

    public setDeviceType(byte[]... bArr) {
        int i = 0;
        for (byte[] bArr2 : bArr) {
            i = i + 4 + bArr2.length;
        }
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(4);
        this.getHighSpeedVideoFpsRangesFor = java.nio.ByteBuffer.allocate(i);
        for (byte[] bArr3 : bArr) {
            allocate.clear();
            allocate.putInt(0, bArr3.length);
            this.getHighSpeedVideoFpsRangesFor.put(allocate);
            this.getHighSpeedVideoFpsRangesFor.put(bArr3);
        }
    }

    public byte[] BuildConfig() {
        return this.getHighSpeedVideoFpsRangesFor.array();
    }
}
