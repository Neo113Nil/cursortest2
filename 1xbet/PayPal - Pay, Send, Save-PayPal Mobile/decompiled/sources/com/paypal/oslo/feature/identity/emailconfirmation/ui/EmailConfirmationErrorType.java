package com.paypal.oslo.feature.identity.emailconfirmation.ui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/emailconfirmation/ui/EmailConfirmationErrorType;", "", "<init>", "(Ljava/lang/String;I)V", "CONFIRMATION_FAILED", "NETWORK_ERROR", "INVALID_LINK", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EmailConfirmationErrorType {
    public static final com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType CONFIRMATION_FAILED;
    private static final /* synthetic */ com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType INVALID_LINK;
    public static final com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType NETWORK_ERROR;
    public static final com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType UNKNOWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private EmailConfirmationErrorType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType emailConfirmationErrorType = new com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType("CONFIRMATION_FAILED", 0);
        CONFIRMATION_FAILED = emailConfirmationErrorType;
        com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType emailConfirmationErrorType2 = new com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType("NETWORK_ERROR", 1);
        NETWORK_ERROR = emailConfirmationErrorType2;
        com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType emailConfirmationErrorType3 = new com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType("INVALID_LINK", 2);
        INVALID_LINK = emailConfirmationErrorType3;
        com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType emailConfirmationErrorType4 = new com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType("UNKNOWN", 3);
        UNKNOWN = emailConfirmationErrorType4;
        com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType[] emailConfirmationErrorTypeArr = {emailConfirmationErrorType, emailConfirmationErrorType2, emailConfirmationErrorType3, emailConfirmationErrorType4};
        Camera2StreamConfigurationMap = emailConfirmationErrorTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(emailConfirmationErrorTypeArr);
    }

    public static com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType[] values() {
        return (com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType) java.lang.Enum.valueOf(com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
