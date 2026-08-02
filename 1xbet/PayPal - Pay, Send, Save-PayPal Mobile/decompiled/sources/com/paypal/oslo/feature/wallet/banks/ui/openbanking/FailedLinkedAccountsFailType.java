package com.paypal.oslo.feature.wallet.banks.ui.openbanking;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u001f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BA\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0017\u0010\u000fR\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u000fR\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\r\u001a\u0004\b\u001b\u0010\u000fj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/FailedLinkedAccountsFailType;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "<init>", "(Ljava/lang/String;IIIIIIII)V", "titleSingle", com.visa.cbp.getEncExpo.warmup, "getTitleSingle", "()I", "titleMultiple", "getTitleMultiple", "descriptionSingle", "getDescriptionSingle", "descriptionMultiple", "getDescriptionMultiple", "errorMessage", "getErrorMessage", "primaryButtonText", "getPrimaryButtonText", "secondaryButtonText", "getSecondaryButtonText", "INSTRUMENT_SHARING_LIMIT_EXCEEDED", com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_RISK_DENIED, "BAD_INSTRUMENT", "USER_ACCOUNT_LIMITED", "TERMINAL", "ERROR_NOT_MAPPED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FailedLinkedAccountsFailType {
    public static final com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsFailType BAD_INSTRUMENT;
    public static final com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsFailType ERROR_NOT_MAPPED;
    public static final com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsFailType INSTRUMENT_SHARING_LIMIT_EXCEEDED;
    public static final com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsFailType RISK_DENIED;
    public static final com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsFailType TERMINAL;
    public static final com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsFailType USER_ACCOUNT_LIMITED;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsFailType[] getHighSpeedVideoSizes;
    private final int descriptionMultiple;
    private final int descriptionSingle;
    private final int errorMessage;
    private final int primaryButtonText;
    private final int secondaryButtonText;
    private final int titleMultiple;
    private final int titleSingle;

    private FailedLinkedAccountsFailType(java.lang.String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.titleSingle = i2;
        this.titleMultiple = i3;
        this.descriptionSingle = i4;
        this.descriptionMultiple = i5;
        this.errorMessage = i6;
        this.primaryButtonText = i7;
        this.secondaryButtonText = i8;
    }

    public final int getTitleSingle() {
        return this.titleSingle;
    }

    public final int getTitleMultiple() {
        return this.titleMultiple;
    }

    public final int getDescriptionSingle() {
        return this.descriptionSingle;
    }

    public final int getDescriptionMultiple() {
        return this.descriptionMultiple;
    }

    public final int getErrorMessage() {
        return this.errorMessage;
    }

    public final int getPrimaryButtonText() {
        return this.primaryButtonText;
    }

    public final int getSecondaryButtonText() {
        return this.secondaryButtonText;
    }

    static {
        com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsFailType failedLinkedAccountsFailType = new com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsFailType("INSTRUMENT_SHARING_LIMIT_EXCEEDED", 0, com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_account_link_failure_title_single, com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_account_link_failure_title_multiple, com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_account_link_failure_instrument_sharing_limit_description_single, com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_account_link_failure_instrument_sharing_limit_description_multiple, com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_account_link_failure_instrument_sharing_limit_exceeded_error, com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_account_link_failure_link_different_bank, com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_not_now);
        INSTRUMENT_SHARING_LIMIT_EXCEEDED = failedLinkedAccountsFailType;
        com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsFailType failedLinkedAccountsFailType2 = new com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsFailType(com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_RISK_DENIED, 1, com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_account_link_failure_title_single, com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_account_link_failure_title_multiple, com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_account_link_failure_risk_denied_description_single, com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_account_link_failure_risk_denied_description_multiple, com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_account_link_failure_risk_denied_error, com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_account_link_failure_link_different_bank, com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_not_now);
        RISK_DENIED = failedLinkedAccountsFailType2;
        com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsFailType failedLinkedAccountsFailType3 = new com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsFailType("BAD_INSTRUMENT", 2, com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_account_link_failure_title_single, com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_account_link_failure_title_multiple, com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_account_link_failure_bad_instrument_description_single, com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_account_link_failure_bad_instrument_description_multiple, com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_account_link_failure_bad_instrument_error, com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_account_link_failure_link_different_bank, com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_not_now);
        BAD_INSTRUMENT = failedLinkedAccountsFailType3;
        com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsFailType failedLinkedAccountsFailType4 = new com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsFailType("USER_ACCOUNT_LIMITED", 3, com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_account_link_failure_title_single, com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_account_link_failure_title_multiple, com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_account_link_failure_user_account_limited_description_single, com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_account_link_failure_user_account_limited_description_multiple, com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_account_link_failure_user_account_limited_error, com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_account_link_failure_go_to_resolution_center, com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_not_now);
        USER_ACCOUNT_LIMITED = failedLinkedAccountsFailType4;
        com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsFailType failedLinkedAccountsFailType5 = new com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsFailType("TERMINAL", 4, com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_something_went_wrong, com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_something_went_wrong, com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_account_link_failure_terminal_description, com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_account_link_failure_terminal_description, com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_something_went_wrong_please_try_again, com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_try_again, com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_not_now);
        TERMINAL = failedLinkedAccountsFailType5;
        com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsFailType failedLinkedAccountsFailType6 = new com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsFailType("ERROR_NOT_MAPPED", 5, com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_account_link_failure_title_single, com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_account_link_failure_title_multiple, com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_something_went_wrong_please_try_again, com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_something_went_wrong_please_try_again, com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_something_went_wrong_please_try_again, com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_account_link_failure_link_different_bank, com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_not_now);
        ERROR_NOT_MAPPED = failedLinkedAccountsFailType6;
        com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsFailType[] failedLinkedAccountsFailTypeArr = {failedLinkedAccountsFailType, failedLinkedAccountsFailType2, failedLinkedAccountsFailType3, failedLinkedAccountsFailType4, failedLinkedAccountsFailType5, failedLinkedAccountsFailType6};
        getHighSpeedVideoSizes = failedLinkedAccountsFailTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(failedLinkedAccountsFailTypeArr);
    }

    public static com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsFailType[] values() {
        return (com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsFailType[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsFailType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsFailType) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsFailType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsFailType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
