package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\u0016\u0017\u0018B)\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\u0082\u0001\u0003\u0019\u001a\u001b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummaryFullScreenErrorUiModel;", "", "Lcom/paypal/pds/core/Icon;", "p0", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "p1", "p2", "p3", "<init>", "(Lcom/paypal/pds/core/Icon;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;)V", "icon", "Lcom/paypal/pds/core/Icon;", "getIcon", "()Lcom/paypal/pds/core/Icon;", "title", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "getTitle", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "getDescription", "buttonLabel", "getButtonLabel", "GenericError", "RequestAppUpdate", "RewardsPaymentPastDue", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummaryFullScreenErrorUiModel$GenericError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummaryFullScreenErrorUiModel$RequestAppUpdate;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummaryFullScreenErrorUiModel$RewardsPaymentPastDue;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class AccountSummaryFullScreenErrorUiModel {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString buttonLabel;
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString description;
    private final com.paypal.pds.core.Icon icon;
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString title;

    private AccountSummaryFullScreenErrorUiModel(com.paypal.pds.core.Icon icon, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString3) {
        this.icon = icon;
        this.title = uiString;
        this.description = uiString2;
        this.buttonLabel = uiString3;
    }

    public final com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getTitle() {
        return this.title;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getDescription() {
        return this.description;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getButtonLabel() {
        return this.buttonLabel;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummaryFullScreenErrorUiModel$GenericError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummaryFullScreenErrorUiModel;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class GenericError extends com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummaryFullScreenErrorUiModel {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummaryFullScreenErrorUiModel.GenericError INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummaryFullScreenErrorUiModel.GenericError();

        public final int hashCode() {
            return -456552390;
        }

        private GenericError() {
            super(com.paypal.pds.core.Icon.Warning.INSTANCE, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_something_went_wrong_error_title, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_account_summary_critical_error_description, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_try_again, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), null);
        }

        public final java.lang.String toString() {
            return "GenericError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummaryFullScreenErrorUiModel.GenericError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummaryFullScreenErrorUiModel$RequestAppUpdate;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummaryFullScreenErrorUiModel;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RequestAppUpdate extends com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummaryFullScreenErrorUiModel {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummaryFullScreenErrorUiModel.RequestAppUpdate INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummaryFullScreenErrorUiModel.RequestAppUpdate();

        public final int hashCode() {
            return 1990163908;
        }

        private RequestAppUpdate() {
            super(com.paypal.pds.core.Icon.Phone.INSTANCE, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_account_summary_update_app_title, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_account_summary_update_app_message, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_account_summary_update_app_button_label, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), null);
        }

        public final java.lang.String toString() {
            return "RequestAppUpdate";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummaryFullScreenErrorUiModel.RequestAppUpdate)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummaryFullScreenErrorUiModel$RewardsPaymentPastDue;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummaryFullScreenErrorUiModel;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RewardsPaymentPastDue extends com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummaryFullScreenErrorUiModel {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummaryFullScreenErrorUiModel.RewardsPaymentPastDue INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummaryFullScreenErrorUiModel.RewardsPaymentPastDue();

        public final int hashCode() {
            return 2086692919;
        }

        private RewardsPaymentPastDue() {
            super(com.paypal.pds.core.Icon.Warning.INSTANCE, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_rewards_redemption_payment_past_due_error_title, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_rewards_redemption_payment_past_due_error_description, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_make_a_payment, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), null);
        }

        public final java.lang.String toString() {
            return "RewardsPaymentPastDue";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummaryFullScreenErrorUiModel.RewardsPaymentPastDue)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ AccountSummaryFullScreenErrorUiModel(com.paypal.pds.core.Icon icon, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(icon, uiString, uiString2, uiString3);
    }
}
