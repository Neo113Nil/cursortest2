package com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RepaymentActivity;", "", "formattedAmount", "formattedPaymentDate", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/uimodel/RepaymentActivityUiModel;", "toUiModel", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RepaymentActivity;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/uimodel/RepaymentActivityUiModel;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RepaymentActivityUiModelMapperKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.RepaymentActivityUiModel toUiModel(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity repaymentActivity, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
        com.paypal.pds.core.Color.ContentBase contentBase;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly stringResOnly;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString plainString;
        java.lang.String str3;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter stringResWithParameter;
        java.lang.String lastDigits;
        com.paypal.pds.core.Icon.Calendar calendar;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repaymentActivity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        boolean z = repaymentActivity.getRepaymentType() == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType.AUTOPAY;
        java.lang.String str4 = null;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString orEmpty = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.orEmpty(str != null ? com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(str) : null);
        if (repaymentActivity.getStatus() == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus.COMPLETED) {
            contentBase = com.paypal.pds.core.Color.ContentRoleBasePositive.INSTANCE;
        } else {
            contentBase = com.paypal.pds.core.Color.ContentBase.INSTANCE;
        }
        boolean z2 = repaymentActivity.getRepaymentType() == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType.AUTOPAY;
        java.time.Instant paymentTime = repaymentActivity.getPaymentTime();
        if (z2) {
            stringResOnly = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_status_title, creditProductIdentifier, true);
        } else {
            if (z2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            stringResOnly = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_payment, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
        if (com.paypal.oslo.feature.revolvingcreditservicing.utils.DateUtilKt.isToday$default(paymentTime, null, 1, null)) {
            plainString = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_today, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        } else {
            plainString = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(str2 == null ? "" : str2);
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter stringResWithParameter2 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_payment_summary_payment_title, new java.lang.Object[]{stringResOnly, plainString}, null, false, 12, null);
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.RepaymentFundingInstrument> fundingInstruments = repaymentActivity.getFundingInstruments();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.RepaymentFundingInstrument repaymentFundingInstrument = fundingInstruments != null ? (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.RepaymentFundingInstrument) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) fundingInstruments) : null;
        if ((repaymentFundingInstrument != null ? repaymentFundingInstrument.getType() : null) == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.RepaymentPlanInstrumentType.BALANCE) {
            stringResWithParameter = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_payments_summary_from_balance, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        } else {
            if (repaymentFundingInstrument == null || (str3 = repaymentFundingInstrument.getDescription()) == null || kotlin.text.StringsKt.isBlank(str3)) {
                str3 = null;
            }
            if (str3 == null) {
                str3 = "";
            }
            if (repaymentFundingInstrument != null && (lastDigits = repaymentFundingInstrument.getLastDigits()) != null && !kotlin.text.StringsKt.isBlank(lastDigits)) {
                str4 = lastDigits;
            }
            stringResWithParameter = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_payment_summary_payment_funding_instrument, new java.lang.Object[]{str3, str4 != null ? str4 : ""}, null, false, 12, null);
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus status = repaymentActivity.getStatus();
        int i = status == null ? -1 : com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.mapper.RepaymentActivityUiModelMapperKt.WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i == 1) {
            calendar = com.paypal.pds.core.Icon.Calendar.INSTANCE;
        } else if (i == 2) {
            calendar = com.paypal.pds.core.Icon.Hourglass.INSTANCE;
        } else {
            calendar = com.paypal.pds.core.Icon.CheckmarkCircle.INSTANCE;
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.RepaymentActivityUiModel(repaymentActivity, z, orEmpty, contentBase, stringResWithParameter2, stringResWithParameter, calendar, kotlin.jvm.internal.Intrinsics.areEqual(repaymentActivity.getCancelable(), java.lang.Boolean.TRUE), repaymentActivity.getStatus() != com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus.PENDING);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus.values().length];
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus.UPCOMING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus.PENDING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
