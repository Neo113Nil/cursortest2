package com.gemalto.mfs.mwsdk.payment.engine;

/* loaded from: classes8.dex */
public enum TransactionType {
    PURCHASE((byte) 0, util.h.xy.al.ma.f201),
    CASH((byte) 1, util.h.xy.al.ma.f221),
    PURCHASE_WITH_CASHBACK((byte) 9, util.h.xy.al.ma.f224),
    REFUND((byte) 32, util.h.xy.al.ma.f202),
    TRANSIT((byte) -18, util.h.xy.al.ma.f233),
    UNKNOWN((byte) -1, util.h.xy.al.ma.f228);

    private java.lang.String Camera2StreamConfigurationMap;
    private final byte getHighSpeedVideoFpsRangesFor;

    TransactionType(byte b, java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = b;
        this.Camera2StreamConfigurationMap = str;
    }

    public final byte[] getCode() {
        return new byte[]{this.getHighSpeedVideoFpsRangesFor};
    }

    public static com.gemalto.mfs.mwsdk.payment.engine.TransactionType get(byte b) {
        com.gemalto.mfs.mwsdk.payment.engine.TransactionType transactionType = UNKNOWN;
        for (com.gemalto.mfs.mwsdk.payment.engine.TransactionType transactionType2 : values()) {
            if (transactionType2.getHighSpeedVideoFpsRangesFor == b) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(".get() ");
                sb.append(transactionType2.toString());
                util.h.xy.al.rc.m25018("TransactionType", sb.toString());
                return transactionType2;
            }
        }
        return transactionType;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.Camera2StreamConfigurationMap;
    }
}
