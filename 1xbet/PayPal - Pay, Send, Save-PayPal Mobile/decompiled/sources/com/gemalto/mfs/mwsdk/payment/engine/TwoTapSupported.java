package com.gemalto.mfs.mwsdk.payment.engine;

/* loaded from: classes8.dex */
public enum TwoTapSupported {
    YES((byte) 1),
    NO((byte) 0),
    UNKNOWN((byte) -1);

    private final byte getHighSpeedVideoFpsRanges;

    TwoTapSupported(byte b) {
        this.getHighSpeedVideoFpsRanges = b;
    }

    public final byte[] getCode() {
        return new byte[]{this.getHighSpeedVideoFpsRanges};
    }

    public static com.gemalto.mfs.mwsdk.payment.engine.TwoTapSupported get(byte b) {
        com.gemalto.mfs.mwsdk.payment.engine.TwoTapSupported twoTapSupported = UNKNOWN;
        for (com.gemalto.mfs.mwsdk.payment.engine.TwoTapSupported twoTapSupported2 : values()) {
            if (twoTapSupported2.getHighSpeedVideoFpsRanges == b) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(".get() ");
                sb.append(twoTapSupported2.toString());
                util.h.xy.al.rc.m25018("TwoTapSupported", sb.toString());
                return twoTapSupported2;
            }
        }
        return twoTapSupported;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("");
        sb.append((int) this.getHighSpeedVideoFpsRanges);
        return sb.toString();
    }
}
