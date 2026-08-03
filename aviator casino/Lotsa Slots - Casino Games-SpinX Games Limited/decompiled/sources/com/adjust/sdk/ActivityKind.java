package com.adjust.sdk;

/* loaded from: classes2.dex */
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

    public static com.adjust.sdk.ActivityKind fromString(java.lang.String str) {
        return "session".equals(str) ? SESSION : androidx.core.app.NotificationCompat.CATEGORY_EVENT.equals(str) ? EVENT : com.ironsource.Y3.d.equals(str) ? CLICK : com.ironsource.Y3.c.equals(str) ? ATTRIBUTION : "info".equals(str) ? INFO : com.inmobi.sdk.InMobiSdk.IM_GDPR_CONSENT_GDPR_APPLIES.equals(str) ? GDPR : "ad_revenue".equals(str) ? AD_REVENUE : "subscription".equals(str) ? SUBSCRIPTION : "third_party_sharing".equals(str) ? THIRD_PARTY_SHARING : "measurement_consent".equals(str) ? MEASUREMENT_CONSENT : "purchase_verification".equals(str) ? PURCHASE_VERIFICATION : UNKNOWN;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        switch (ordinal()) {
            case 1:
                return "session";
            case 2:
                return androidx.core.app.NotificationCompat.CATEGORY_EVENT;
            case 3:
                return com.ironsource.Y3.d;
            case 4:
                return com.ironsource.Y3.c;
            case 5:
            case 6:
            case 10:
            default:
                return "unknown";
            case 7:
                return "info";
            case 8:
                return com.inmobi.sdk.InMobiSdk.IM_GDPR_CONSENT_GDPR_APPLIES;
            case 9:
                return "ad_revenue";
            case 11:
                return "subscription";
            case 12:
                return "third_party_sharing";
            case 13:
                return "measurement_consent";
            case 14:
                return "purchase_verification";
        }
    }
}
