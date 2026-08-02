package com.gemalto.mfs.mwsdk.payment.engine;

/* loaded from: classes8.dex */
public enum CdcvmSupported {
    YES((byte) 1, util.h.xy.al.ma.f243),
    NO((byte) 0, util.h.xy.al.ma.f238),
    UNKNOWN((byte) -1, util.h.xy.al.ma.f241);

    private final byte getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.String getHighSpeedVideoFpsRanges;

    CdcvmSupported(byte b, java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = b;
        this.getHighSpeedVideoFpsRanges = str;
    }

    public final byte[] getCode() {
        return new byte[]{this.getHighResolutionOutputSizeshNQ4ISI};
    }

    public static com.gemalto.mfs.mwsdk.payment.engine.CdcvmSupported get(byte b) {
        com.gemalto.mfs.mwsdk.payment.engine.CdcvmSupported cdcvmSupported = UNKNOWN;
        for (com.gemalto.mfs.mwsdk.payment.engine.CdcvmSupported cdcvmSupported2 : values()) {
            if (cdcvmSupported2.getHighResolutionOutputSizeshNQ4ISI == b) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(".get() ");
                sb.append(cdcvmSupported2.toString());
                util.h.xy.al.rc.m25018("CdcvmSupported", sb.toString());
                return cdcvmSupported2;
            }
        }
        return cdcvmSupported;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.getHighSpeedVideoFpsRanges;
    }
}
