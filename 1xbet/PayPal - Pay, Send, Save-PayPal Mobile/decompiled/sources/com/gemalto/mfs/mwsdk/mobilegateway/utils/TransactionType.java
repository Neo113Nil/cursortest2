package com.gemalto.mfs.mwsdk.mobilegateway.utils;

/* loaded from: classes3.dex */
public enum TransactionType {
    PURCHASE,
    REFUND,
    ATM_WITHDRAWAL,
    ATM_OTHER_SERVICE,
    OTHER;

    /* renamed from: com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionType$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        private static int getHighSpeedVideoFpsRanges = 0;
        private static int getHighSpeedVideoFpsRangesFor = 1;
        static final /* synthetic */ int[] getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionType.values().length];
            getHighSpeedVideoSizes = iArr;
            try {
                iArr[com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionType.REFUND.ordinal()] = 1;
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 9) % 128;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoSizes[com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionType.PURCHASE.ordinal()] = 2;
                int i = getHighSpeedVideoFpsRangesFor;
                getHighSpeedVideoFpsRanges = (((i | 71) << 1) - (i ^ 71)) % 128;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoSizes[com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionType.ATM_WITHDRAWAL.ordinal()] = 3;
                int i2 = getHighSpeedVideoFpsRanges;
                getHighSpeedVideoFpsRangesFor = ((i2 ^ 87) + ((i2 & 87) << 1)) % 128;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoSizes[com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionType.ATM_OTHER_SERVICE.ordinal()] = 4;
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 77) % 128;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            int i3 = getHighSpeedVideoFpsRanges;
            getHighSpeedVideoFpsRangesFor = ((i3 & 89) + (i3 | 89)) % 128;
        }
    }

    public final java.lang.String getValue() {
        int i = com.gemalto.mfs.mwsdk.mobilegateway.utils.TransactionType.AnonymousClass1.getHighSpeedVideoSizes[ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.REFUND;
        }
        if (i == 2) {
            return "PURCHASE";
        }
        if (i == 3) {
            return "ATM_WITHDRAWAL";
        }
        if (i == 4) {
            return "ATM_OTHER_SERVICE";
        }
        return "OTHER";
    }
}
