package com.gemalto.mfs.mwsdk.mobilegateway.utils;

/* loaded from: classes3.dex */
public enum TransactionStatus {
    APPROVED,
    DECLINED,
    CLEARED,
    REFUNDED;

    /* renamed from: com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionStatus$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        private static int Camera2StreamConfigurationMap = 1;
        private static int getHighSpeedVideoFpsRanges;
        static final /* synthetic */ int[] getHighSpeedVideoFpsRangesFor;

        static {
            int[] iArr = new int[com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionStatus.values().length];
            getHighSpeedVideoFpsRangesFor = iArr;
            try {
                iArr[com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionStatus.APPROVED.ordinal()] = 1;
                int i = Camera2StreamConfigurationMap + 81;
                getHighSpeedVideoFpsRanges = i % 128;
                if (i % 2 != 0) {
                    int i2 = 4 / 4;
                }
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionStatus.DECLINED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionStatus.CLEARED.ordinal()] = 3;
                int i3 = Camera2StreamConfigurationMap;
                int i4 = (i3 & 47) + (i3 | 47);
                getHighSpeedVideoFpsRanges = i4 % 128;
                int i5 = i4 % 2;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionStatus.REFUNDED.ordinal()] = 4;
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 61) % 128;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    public final java.lang.String getValue() {
        int i = com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionStatus.AnonymousClass1.getHighSpeedVideoFpsRangesFor[ordinal()];
        if (i == 1) {
            return "APPROVED";
        }
        if (i == 2) {
            return "DECLINED";
        }
        if (i == 3) {
            return "CLEARED";
        }
        if (i == 4) {
            return "REFUNDED";
        }
        return "UNKNOWN";
    }
}
