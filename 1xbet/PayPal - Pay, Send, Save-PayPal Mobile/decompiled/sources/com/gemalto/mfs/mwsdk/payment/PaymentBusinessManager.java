package com.gemalto.mfs.mwsdk.payment;

/* loaded from: classes8.dex */
public class PaymentBusinessManager {
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;

    public static com.gemalto.mfs.mwsdk.payment.PaymentBusinessService getPaymentBusinessService() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (i ^ 87) + ((i & 87) << 1);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            Camera2StreamConfigurationMap();
            throw null;
        }
        com.gemalto.mfs.mwsdk.payment.PaymentBusinessService Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
        int i3 = getHighSpeedVideoFpsRangesFor;
        int i4 = (i3 & 47) + (i3 | 47);
        getHighSpeedVideoFpsRanges = i4 % 128;
        if (i4 % 2 == 0) {
            return Camera2StreamConfigurationMap;
        }
        throw null;
    }

    private static com.gemalto.mfs.mwsdk.payment.PaymentBusinessService Camera2StreamConfigurationMap() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i | 71) << 1) - (i ^ 71);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        util.h.xy.bu.mb m25666 = util.h.xy.bu.mb.m25666();
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        int i3 = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = (((i3 | 51) << 1) - (i3 ^ 51)) % 128;
        return m25666;
    }
}
