package com.paypal.oslo.feature.packagetracking.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailLinkStatus;", "", "<init>", "(Ljava/lang/String;I)V", "LINKED", "LINKED_WITH_INVALID_PERMISSIONS", "UNLINKED_BY_USER", "UNLINKED_BY_SYSTEM"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EmailLinkStatus {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkStatus LINKED;
    public static final com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkStatus LINKED_WITH_INVALID_PERMISSIONS;
    public static final com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkStatus UNLINKED_BY_SYSTEM;
    public static final com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkStatus UNLINKED_BY_USER;
    private static final /* synthetic */ com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkStatus[] getHighSpeedVideoSizes;

    private EmailLinkStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkStatus emailLinkStatus = new com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkStatus("LINKED", 0);
        LINKED = emailLinkStatus;
        com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkStatus emailLinkStatus2 = new com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkStatus("LINKED_WITH_INVALID_PERMISSIONS", 1);
        LINKED_WITH_INVALID_PERMISSIONS = emailLinkStatus2;
        com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkStatus emailLinkStatus3 = new com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkStatus("UNLINKED_BY_USER", 2);
        UNLINKED_BY_USER = emailLinkStatus3;
        com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkStatus emailLinkStatus4 = new com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkStatus("UNLINKED_BY_SYSTEM", 3);
        UNLINKED_BY_SYSTEM = emailLinkStatus4;
        com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkStatus[] emailLinkStatusArr = {emailLinkStatus, emailLinkStatus2, emailLinkStatus3, emailLinkStatus4};
        getHighSpeedVideoSizes = emailLinkStatusArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(emailLinkStatusArr);
    }

    public static com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkStatus[] values() {
        return (com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkStatus[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkStatus> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
