package com.paypal.oslo.feature.bnplacquisition.ui.common;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/DeclineContentProvider;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType;", "declineType", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/ApplicationFailureContent;", "getDeclineContent", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/DeclineType;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/ApplicationFailureContent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/ToolBarContent;", "toolBarContent", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/ToolBarContent;", "getToolBarContent", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/ToolBarContent;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getProductName", "()Lcom/paypal/oslo/core/commonui/utils/RefText;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeclineContentProvider {
    public static final int $stable;
    private final com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToolBarContent toolBarContent = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToolBarContent(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_back, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_close, new java.lang.Object[0]));
    private final com.paypal.oslo.core.commonui.utils.RefText productName = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_pay_later, new java.lang.Object[0]);

    @javax.inject.Inject
    public DeclineContentProvider() {
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToolBarContent getToolBarContent() {
        return this.toolBarContent;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getProductName() {
        return this.productName;
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.ApplicationFailureContent getDeclineContent(com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType declineType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declineType, "");
        if (declineType instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.RiskAssessment) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.ApplicationFailureContent(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_risk_decline_title, this.productName), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_risk_decline_description, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_close, new java.lang.Object[0]));
        }
        if (declineType instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.Fraud) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.ApplicationFailureContent(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_risk_fraud_decline_title, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_fraud_decline_description, this.productName), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_close, new java.lang.Object[0]));
        }
        if (declineType instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.AddressVerification) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.ApplicationFailureContent(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_address_normalize_error_title, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(""), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_close, new java.lang.Object[0]));
        }
        if (declineType instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.KycFailure) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.ApplicationFailureContent(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_kyc_decline_title, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_kyc_decline_description, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_close, new java.lang.Object[0]));
        }
        if (declineType instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.AuthenticationFailure) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.ApplicationFailureContent(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_sca_decline_title, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_sca_decline_description, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_close, new java.lang.Object[0]));
        }
        if (declineType instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.DownPaymentFailure) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.ApplicationFailureContent(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_down_payment_decline_title, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_down_payment_decline_description, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_close, new java.lang.Object[0]));
        }
        if (declineType instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.AccountTakeoverDenied) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.ApplicationFailureContent(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_account_takeover_decline_title, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_account_takeover_decline_description, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_close, new java.lang.Object[0]));
        }
        if (!(declineType instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.IneligibleAddress) && !(declineType instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.GeneralEligibilityDecline) && !(declineType instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.NoEligibleOffers) && !(declineType instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.TokenizationFailure) && !(declineType instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.Unknown)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.ApplicationFailureContent(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_generic_decline_title, this.productName), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(""), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_close, new java.lang.Object[0]));
    }

    static {
        int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
        $stable = i | i | com.paypal.oslo.core.commonui.utils.RefText.$stable;
    }
}
