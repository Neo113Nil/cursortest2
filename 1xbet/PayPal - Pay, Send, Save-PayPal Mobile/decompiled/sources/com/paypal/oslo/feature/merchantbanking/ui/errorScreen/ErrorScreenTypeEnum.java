package com.paypal.oslo.feature.merchantbanking.ui.errorScreen;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\u0012\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/ui/errorScreen/ErrorScreenTypeEnum;", "", "", "p0", "p1", "p2", "Lcom/paypal/pds/components/AvatarSource;", "p3", "<init>", "(Ljava/lang/String;IIIILcom/paypal/pds/components/AvatarSource;)V", "headerTextResId", com.visa.cbp.getEncExpo.warmup, "getHeaderTextResId", "()I", "bodyTextResId", "getBodyTextResId", "buttonTextResId", "getButtonTextResId", "iconAvatarSource", "Lcom/paypal/pds/components/AvatarSource;", "getIconAvatarSource", "()Lcom/paypal/pds/components/AvatarSource;", com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_INELIGIBLE, "GENERIC_500", "GENERIC_400", com.paypal.oslo.downloads.impl.DownloadStateValue.NO_NETWORK, "RISK_DECLINED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ErrorScreenTypeEnum {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum GENERIC_400;
    public static final com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum GENERIC_500;
    public static final com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum INELIGIBLE;
    public static final com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum NO_NETWORK;
    public static final com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum RISK_DECLINED;
    private static final /* synthetic */ com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum[] getHighResolutionOutputSizeshNQ4ISI;
    private final int bodyTextResId;
    private final int buttonTextResId;
    private final int headerTextResId;
    private final com.paypal.pds.components.AvatarSource iconAvatarSource;

    private ErrorScreenTypeEnum(java.lang.String str, int i, int i2, int i3, int i4, com.paypal.pds.components.AvatarSource avatarSource) {
        this.headerTextResId = i2;
        this.bodyTextResId = i3;
        this.buttonTextResId = i4;
        this.iconAvatarSource = avatarSource;
    }

    public final int getHeaderTextResId() {
        return this.headerTextResId;
    }

    public final int getBodyTextResId() {
        return this.bodyTextResId;
    }

    public final int getButtonTextResId() {
        return this.buttonTextResId;
    }

    public final com.paypal.pds.components.AvatarSource getIconAvatarSource() {
        return this.iconAvatarSource;
    }

    static {
        com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum errorScreenTypeEnum = new com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum(com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_INELIGIBLE, 0, com.paypal.oslo.feature.merchantbanking.R.string.feature_merchant_banking_error_title_something_went_wrong, com.paypal.oslo.feature.merchantbanking.R.string.feature_merchant_banking_error_ineligible_message, com.paypal.oslo.feature.merchantbanking.R.string.feature_merchant_banking_error_button_ok, com.paypal.pds.core.Icon.Warning.INSTANCE.getAvatarSource());
        INELIGIBLE = errorScreenTypeEnum;
        com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum errorScreenTypeEnum2 = new com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum("GENERIC_500", 1, com.paypal.oslo.feature.merchantbanking.R.string.feature_merchant_banking_error_title_something_went_wrong, com.paypal.oslo.feature.merchantbanking.R.string.feature_merchant_banking_error_generic_message, com.paypal.oslo.feature.merchantbanking.R.string.feature_merchant_banking_error_button_try_again, com.paypal.pds.core.Icon.Warning.INSTANCE.getAvatarSource());
        GENERIC_500 = errorScreenTypeEnum2;
        com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum errorScreenTypeEnum3 = new com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum("GENERIC_400", 2, com.paypal.oslo.feature.merchantbanking.R.string.feature_merchant_banking_error_title_something_went_wrong, com.paypal.oslo.feature.merchantbanking.R.string.feature_merchant_banking_error_body_bad_request, com.paypal.oslo.feature.merchantbanking.R.string.feature_merchant_banking_error_button_ok, com.paypal.pds.core.Icon.Warning.INSTANCE.getAvatarSource());
        GENERIC_400 = errorScreenTypeEnum3;
        com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum errorScreenTypeEnum4 = new com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum(com.paypal.oslo.downloads.impl.DownloadStateValue.NO_NETWORK, 3, com.paypal.oslo.feature.merchantbanking.R.string.feature_merchant_banking_error_header_no_network, com.paypal.oslo.feature.merchantbanking.R.string.feature_merchant_banking_error_body_no_network, com.paypal.oslo.feature.merchantbanking.R.string.feature_merchant_banking_error_button_try_again, com.paypal.pds.core.Icon.Warning.INSTANCE.getAvatarSource());
        NO_NETWORK = errorScreenTypeEnum4;
        com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum errorScreenTypeEnum5 = new com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum("RISK_DECLINED", 4, com.paypal.oslo.feature.merchantbanking.R.string.feature_merchant_banking_error_header_contact_customer_service, com.paypal.oslo.feature.merchantbanking.R.string.feature_merchant_banking_error_body_risk_declined, com.paypal.oslo.feature.merchantbanking.R.string.feature_merchant_banking_error_button_contact_us, com.paypal.pds.core.Icon.Phone.INSTANCE.getAvatarSource());
        RISK_DECLINED = errorScreenTypeEnum5;
        com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum[] errorScreenTypeEnumArr = {errorScreenTypeEnum, errorScreenTypeEnum2, errorScreenTypeEnum3, errorScreenTypeEnum4, errorScreenTypeEnum5};
        getHighResolutionOutputSizeshNQ4ISI = errorScreenTypeEnumArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(errorScreenTypeEnumArr);
    }

    public static com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum[] values() {
        return (com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum) java.lang.Enum.valueOf(com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
