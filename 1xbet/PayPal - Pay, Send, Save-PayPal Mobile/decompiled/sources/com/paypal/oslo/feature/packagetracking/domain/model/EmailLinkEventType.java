package com.paypal.oslo.feature.packagetracking.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailLinkEventType;", "", "<init>", "(Ljava/lang/String;)V", "RELINK_REMINDER"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EmailLinkEventType {
    public static final com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkEventType RELINK_REMINDER;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkEventType[] getHighSpeedVideoSizes;

    private EmailLinkEventType(java.lang.String str) {
    }

    static {
        com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkEventType emailLinkEventType = new com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkEventType("RELINK_REMINDER");
        RELINK_REMINDER = emailLinkEventType;
        com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkEventType[] emailLinkEventTypeArr = {emailLinkEventType};
        getHighSpeedVideoSizes = emailLinkEventTypeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(emailLinkEventTypeArr);
    }

    public static com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkEventType[] values() {
        return (com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkEventType[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkEventType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkEventType) java.lang.Enum.valueOf(com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkEventType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkEventType> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
