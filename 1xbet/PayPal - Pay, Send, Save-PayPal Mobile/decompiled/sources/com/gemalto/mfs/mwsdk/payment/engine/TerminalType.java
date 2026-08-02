package com.gemalto.mfs.mwsdk.payment.engine;

/* loaded from: classes8.dex */
public enum TerminalType {
    BANK_ATTENDED_ONLINE((byte) 17, util.h.xy.al.ma.f247),
    BANK_ATTENDED_OFFLINE_ONLINE((byte) 18, util.h.xy.al.ma.f262),
    BANK_ATTENDED_OFFLINE((byte) 19, util.h.xy.al.ma.f235),
    BANK_UNATTENDED_ONLINE(com.google.common.base.Ascii.DC4, util.h.xy.al.ma.f242),
    BANK_UNATTENDED_OFFLINE_ONLINE(com.google.common.base.Ascii.NAK, util.h.xy.al.ma.f244),
    BANK_UNATTENDED_OFFLINE(com.google.common.base.Ascii.SYN, util.h.xy.al.ma.f237),
    MERCHANT_ATTENDED_ONLINE((byte) 33, util.h.xy.al.ma.f245),
    MERCHANT_ATTENDED_OFFLINE_ONLINE((byte) 34, util.h.xy.al.ma.f246),
    MERCHANT_ATTENDED_OFFLINE((byte) 35, util.h.xy.al.ma.f251),
    MERCHANT_UNATTENDED_ONLINE((byte) 36, util.h.xy.al.ma.f250),
    MERCHANT_UNATTENDED_OFFLINE_ONLINE((byte) 37, util.h.xy.al.ma.f252),
    MERCHANT_UNATTENDED_OFFLINE((byte) 38, util.h.xy.al.ma.f248),
    CARDHOLDER_OPERATED_ONLINE(org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, util.h.xy.al.ma.f257),
    CARDHOLDER_OPERATED_OFFLINE_ONLINE(org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, util.h.xy.al.ma.f200),
    CARDHOLDER_OPERATED_OFFLINE(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, util.h.xy.al.ma.f253),
    UNKNOWN((byte) -1, util.h.xy.al.ma.f269);

    private final byte getHighSpeedVideoFpsRangesFor;
    private java.lang.String getHighSpeedVideoSizes;

    TerminalType(byte b, java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = b;
        this.getHighSpeedVideoSizes = str;
    }

    public final byte[] getCode() {
        return new byte[]{this.getHighSpeedVideoFpsRangesFor};
    }

    public static com.gemalto.mfs.mwsdk.payment.engine.TerminalType get(byte b) {
        com.gemalto.mfs.mwsdk.payment.engine.TerminalType terminalType = UNKNOWN;
        for (com.gemalto.mfs.mwsdk.payment.engine.TerminalType terminalType2 : values()) {
            if (terminalType2.getHighSpeedVideoFpsRangesFor == b) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(".get() ");
                sb.append(terminalType2.toString());
                util.h.xy.al.rc.m25018("terminalType", sb.toString());
                return terminalType2;
            }
        }
        return terminalType;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.getHighSpeedVideoSizes;
    }
}
