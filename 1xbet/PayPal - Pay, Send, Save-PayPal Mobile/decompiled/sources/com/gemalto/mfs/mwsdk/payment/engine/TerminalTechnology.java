package com.gemalto.mfs.mwsdk.payment.engine;

/* loaded from: classes8.dex */
public enum TerminalTechnology {
    CONTACTLESS_EMV((byte) 1, util.h.xy.al.ma.f232),
    CONTACTLESS_MAGSTRIPE((byte) 2, util.h.xy.al.ma.f236),
    DSRP_EMV((byte) 3, util.h.xy.al.ma.f263),
    DSRP_UCAF((byte) 4, util.h.xy.al.ma.f256),
    QRC((byte) 5, util.h.xy.al.ma.f259);

    private java.lang.String Camera2StreamConfigurationMap;
    private final byte getHighResolutionOutputSizeshNQ4ISI;

    TerminalTechnology(byte b, java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = b;
        this.Camera2StreamConfigurationMap = str;
    }

    public final byte[] getCode() {
        return new byte[]{this.getHighResolutionOutputSizeshNQ4ISI};
    }

    public static com.gemalto.mfs.mwsdk.payment.engine.TerminalTechnology get(byte b) {
        for (com.gemalto.mfs.mwsdk.payment.engine.TerminalTechnology terminalTechnology : values()) {
            if (terminalTechnology.getHighResolutionOutputSizeshNQ4ISI == b) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(".get() ");
                sb.append(terminalTechnology.toString());
                util.h.xy.al.rc.m25018("terminalType", sb.toString());
                return terminalTechnology;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.Camera2StreamConfigurationMap;
    }
}
