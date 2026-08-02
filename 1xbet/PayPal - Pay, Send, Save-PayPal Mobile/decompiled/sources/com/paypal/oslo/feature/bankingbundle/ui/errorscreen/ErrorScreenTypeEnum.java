package com.paypal.oslo.feature.bankingbundle.ui.errorscreen;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\u0012\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015j\u0002\b\u0016j\u0002\b\u0017"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/ui/errorscreen/ErrorScreenTypeEnum;", "", "", "p0", "p1", "p2", "Lcom/paypal/pds/components/AvatarSource;", "p3", "<init>", "(Ljava/lang/String;IIIILcom/paypal/pds/components/AvatarSource;)V", "headerTextResId", com.visa.cbp.getEncExpo.warmup, "getHeaderTextResId", "()I", "bodyTextResId", "getBodyTextResId", "buttonTextResId", "getButtonTextResId", "iconAvatarSource", "Lcom/paypal/pds/components/AvatarSource;", "getIconAvatarSource", "()Lcom/paypal/pds/components/AvatarSource;", com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_INELIGIBLE, com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.GENERIC_ERROR}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ErrorScreenTypeEnum {
    public static final com.paypal.oslo.feature.bankingbundle.ui.errorscreen.ErrorScreenTypeEnum GENERIC_ERROR;
    public static final com.paypal.oslo.feature.bankingbundle.ui.errorscreen.ErrorScreenTypeEnum INELIGIBLE;
    private static final /* synthetic */ com.paypal.oslo.feature.bankingbundle.ui.errorscreen.ErrorScreenTypeEnum[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
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
        com.paypal.oslo.feature.bankingbundle.ui.errorscreen.ErrorScreenTypeEnum errorScreenTypeEnum = new com.paypal.oslo.feature.bankingbundle.ui.errorscreen.ErrorScreenTypeEnum(com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_INELIGIBLE, 0, com.paypal.oslo.feature.bankingbundle.R.string.feature_banking_bundle_error_title, com.paypal.oslo.feature.bankingbundle.R.string.feature_banking_bundle_error_body_ineligible, com.paypal.oslo.feature.bankingbundle.R.string.feature_banking_bundle_error_ok_button, com.paypal.pds.core.Icon.Warning.INSTANCE.getAvatarSource());
        INELIGIBLE = errorScreenTypeEnum;
        com.paypal.oslo.feature.bankingbundle.ui.errorscreen.ErrorScreenTypeEnum errorScreenTypeEnum2 = new com.paypal.oslo.feature.bankingbundle.ui.errorscreen.ErrorScreenTypeEnum(com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.GENERIC_ERROR, 1, com.paypal.oslo.feature.bankingbundle.R.string.feature_banking_bundle_error_title, com.paypal.oslo.feature.bankingbundle.R.string.feature_banking_bundle_error_body_generic_500, com.paypal.oslo.feature.bankingbundle.R.string.feature_banking_bundle_error_ok_button, com.paypal.pds.core.Icon.Warning.INSTANCE.getAvatarSource());
        GENERIC_ERROR = errorScreenTypeEnum2;
        com.paypal.oslo.feature.bankingbundle.ui.errorscreen.ErrorScreenTypeEnum[] errorScreenTypeEnumArr = {errorScreenTypeEnum, errorScreenTypeEnum2};
        getHighSpeedVideoFpsRanges = errorScreenTypeEnumArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(errorScreenTypeEnumArr);
    }

    public static com.paypal.oslo.feature.bankingbundle.ui.errorscreen.ErrorScreenTypeEnum[] values() {
        return (com.paypal.oslo.feature.bankingbundle.ui.errorscreen.ErrorScreenTypeEnum[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.bankingbundle.ui.errorscreen.ErrorScreenTypeEnum valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bankingbundle.ui.errorscreen.ErrorScreenTypeEnum) java.lang.Enum.valueOf(com.paypal.oslo.feature.bankingbundle.ui.errorscreen.ErrorScreenTypeEnum.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bankingbundle.ui.errorscreen.ErrorScreenTypeEnum> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
