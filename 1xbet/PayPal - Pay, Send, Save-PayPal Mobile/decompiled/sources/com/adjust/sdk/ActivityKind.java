package com.adjust.sdk;

/* loaded from: classes7.dex */
public enum ActivityKind {
    UNKNOWN,
    SESSION,
    EVENT,
    CLICK,
    ATTRIBUTION,
    REVENUE,
    REATTRIBUTION,
    INFO,
    GDPR,
    AD_REVENUE,
    DISABLE_THIRD_PARTY_SHARING,
    SUBSCRIPTION,
    THIRD_PARTY_SHARING,
    MEASUREMENT_CONSENT,
    PURCHASE_VERIFICATION;

    /* renamed from: com.adjust.sdk.ActivityKind$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] getHighSpeedVideoFpsRangesFor;

        static {
            int[] iArr = new int[com.adjust.sdk.ActivityKind.values().length];
            getHighSpeedVideoFpsRangesFor = iArr;
            try {
                iArr[com.adjust.sdk.ActivityKind.SESSION.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.adjust.sdk.ActivityKind.EVENT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.adjust.sdk.ActivityKind.CLICK.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.adjust.sdk.ActivityKind.ATTRIBUTION.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.adjust.sdk.ActivityKind.INFO.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.adjust.sdk.ActivityKind.GDPR.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.adjust.sdk.ActivityKind.AD_REVENUE.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.adjust.sdk.ActivityKind.SUBSCRIPTION.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.adjust.sdk.ActivityKind.THIRD_PARTY_SHARING.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.adjust.sdk.ActivityKind.MEASUREMENT_CONSENT.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.adjust.sdk.ActivityKind.PURCHASE_VERIFICATION.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
        }
    }

    public static com.adjust.sdk.ActivityKind fromString(java.lang.String str) {
        return "session".equals(str) ? SESSION : "event".equals(str) ? EVENT : com.paypal.oslo.feature.merchantbanking.api.analytics.MerchantBankingAnalytics.AccountNumbersScreen.NAVIGATION_TYPE.equals(str) ? CLICK : "attribution".equals(str) ? ATTRIBUTION : "info".equals(str) ? INFO : "gdpr".equals(str) ? GDPR : "ad_revenue".equals(str) ? AD_REVENUE : "subscription".equals(str) ? SUBSCRIPTION : "third_party_sharing".equals(str) ? THIRD_PARTY_SHARING : "measurement_consent".equals(str) ? MEASUREMENT_CONSENT : "purchase_verification".equals(str) ? PURCHASE_VERIFICATION : UNKNOWN;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        switch (com.adjust.sdk.ActivityKind.AnonymousClass1.getHighSpeedVideoFpsRangesFor[ordinal()]) {
            case 1:
                return "session";
            case 2:
                return "event";
            case 3:
                return com.paypal.oslo.feature.merchantbanking.api.analytics.MerchantBankingAnalytics.AccountNumbersScreen.NAVIGATION_TYPE;
            case 4:
                return "attribution";
            case 5:
                return "info";
            case 6:
                return "gdpr";
            case 7:
                return "ad_revenue";
            case 8:
                return "subscription";
            case 9:
                return "third_party_sharing";
            case 10:
                return "measurement_consent";
            case 11:
                return "purchase_verification";
            default:
                return "unknown";
        }
    }
}
