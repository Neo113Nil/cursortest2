package com.paypal.oslo.feature.debitcard.servicing.domain.activatecard;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/domain/activatecard/DebitCardActivationInlineErrorType;", "", "<init>", "(Ljava/lang/String;I)V", "CVV_REQUIRED", com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_INVALID_CVV}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardActivationInlineErrorType {
    public static final com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInlineErrorType CVV_REQUIRED;
    private static final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInlineErrorType[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInlineErrorType INVALID_CVV;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private DebitCardActivationInlineErrorType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInlineErrorType debitCardActivationInlineErrorType = new com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInlineErrorType("CVV_REQUIRED", 0);
        CVV_REQUIRED = debitCardActivationInlineErrorType;
        com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInlineErrorType debitCardActivationInlineErrorType2 = new com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInlineErrorType(com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_INVALID_CVV, 1);
        INVALID_CVV = debitCardActivationInlineErrorType2;
        com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInlineErrorType[] debitCardActivationInlineErrorTypeArr = {debitCardActivationInlineErrorType, debitCardActivationInlineErrorType2};
        Camera2StreamConfigurationMap = debitCardActivationInlineErrorTypeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(debitCardActivationInlineErrorTypeArr);
    }

    public static com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInlineErrorType[] values() {
        return (com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInlineErrorType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInlineErrorType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInlineErrorType) java.lang.Enum.valueOf(com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInlineErrorType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInlineErrorType> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
