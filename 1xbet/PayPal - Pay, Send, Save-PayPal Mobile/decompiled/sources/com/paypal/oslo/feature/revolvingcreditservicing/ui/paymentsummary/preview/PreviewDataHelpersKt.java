package com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.preview;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aa\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a?\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a7\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001d\u0010\u001e"}, d2 = {"", "id", "amount", "dateShort", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RepaymentStatus;", "status", "", "cancelable", "bankName", "lastDigits", "isAutopay", "isFromPayPalBalance", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/uimodel/RepaymentActivityUiModel;", "createMockPayment", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RepaymentStatus;ZLjava/lang/String;Ljava/lang/String;ZZ)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/uimodel/RepaymentActivityUiModel;", "isEnabled", "hasPaymentDue", "isPastDue", "dueDate", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/autopayModule/AutopayMethod;", "method", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/autopayModule/AutopayModuleUiModel;", "createMockAutopayModule", "(ZZZLjava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/autopayModule/AutopayMethod;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/autopayModule/AutopayModuleUiModel;", "includeUpcoming", "includePending", "includeCompleted", "currentBalance", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/uimodel/PaymentSummaryScreenUiModel;", "createMockPaymentSummaryScreenUiModel", "(ZZZLjava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/uimodel/PaymentSummaryScreenUiModel;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PreviewDataHelpersKt {
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.RepaymentActivityUiModel createMockPayment$default(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus repaymentStatus, boolean z, java.lang.String str4, java.lang.String str5, boolean z2, boolean z3, int i, java.lang.Object obj) {
        return createMockPayment(str, str2, str3, repaymentStatus, (i & 16) != 0 ? false : z, (i & 32) != 0 ? "Bank" : str4, (i & 64) != 0 ? "1234" : str5, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? false : z3);
    }

    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.RepaymentActivityUiModel createMockPayment(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus repaymentStatus, boolean z, java.lang.String str4, java.lang.String str5, boolean z2, boolean z3) {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.RepaymentPlanInstrumentType repaymentPlanInstrumentType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repaymentStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType repaymentType = z2 ? com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType.AUTOPAY : com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType.REAL_TIME;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentChannel repaymentChannel = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentChannel.DIGITAL;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(str2, com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_USD, "", false, 4, (java.lang.Object) null), ",", "", false, 4, (java.lang.Object) null));
        java.time.Instant now = java.time.Instant.now();
        java.time.Instant instant = java.time.LocalDate.of(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockStatementsRepositoryImpl.FIRST_YEAR, 11, 20).atStartOfDay(java.time.ZoneOffset.UTC).toInstant();
        if (z3) {
            repaymentPlanInstrumentType = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.RepaymentPlanInstrumentType.BALANCE;
        } else {
            repaymentPlanInstrumentType = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.RepaymentPlanInstrumentType.BANK;
        }
        return com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.mapper.RepaymentActivityUiModelMapperKt.toUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity(str, repaymentType, java.lang.Boolean.valueOf(z), repaymentStatus, currencyAmount, now, instant, repaymentChannel, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.RepaymentFundingInstrument(str4, str5, repaymentPlanInstrumentType, (java.lang.String) null, 8, (kotlin.jvm.internal.DefaultConstructorMarker) null))), str2, str3, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.CREDIT_CARD_PAYPAL_CONSUMER_REWARDS_US);
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayModuleUiModel createMockAutopayModule$default(boolean z, boolean z2, boolean z3, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayMethod autopayMethod, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        if ((i & 8) != 0) {
            str = "";
        }
        if ((i & 16) != 0) {
            autopayMethod = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayMethod.Minimum;
        }
        return createMockAutopayModule(z, z2, z3, str, autopayMethod);
    }

    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayModuleUiModel createMockAutopayModule(boolean z, boolean z2, boolean z3, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayMethod autopayMethod) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autopayMethod, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayModuleUiModel(z, z2, z3, str, autopayMethod, null, false, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.CREDIT_CARD_PAYPAL_CONSUMER_REWARDS_US, 96, null);
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSummaryScreenUiModel createMockPaymentSummaryScreenUiModel$default(boolean z, boolean z2, boolean z3, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            z3 = true;
        }
        if ((i & 8) != 0) {
            str = "$100.00";
        }
        return createMockPaymentSummaryScreenUiModel(z, z2, z3, str);
    }

    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSummaryScreenUiModel createMockPaymentSummaryScreenUiModel(boolean z, boolean z2, boolean z3, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayModuleUiModel createMockAutopayModule$default = createMockAutopayModule$default(true, true, false, "Nov 25", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayMethod.Minimum, 4, null);
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        if (z) {
            createListBuilder.add(new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSectionUiModel(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.SectionType.Upcoming, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.RepaymentActivityUiModel[]{createMockPayment$default("upcoming-001", "$100.00", "Nov 25", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus.UPCOMING, true, "Wells Fargo", "1234", true, false, 256, null), createMockPayment$default("upcoming-002", "$50.00", "Dec 1", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus.UPCOMING, true, "Chase", "5678", false, false, 256, null)})));
        }
        if (z2) {
            createListBuilder.add(new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSectionUiModel(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.SectionType.Pending, kotlin.collections.CollectionsKt.listOf(createMockPayment$default("pending-001", "$75.00", "Dec 2", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus.PENDING, false, "PayPal Balance", "", false, true, 144, null))));
        }
        if (z3) {
            createListBuilder.add(new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSectionUiModel(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.SectionType.Completed, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.RepaymentActivityUiModel[]{createMockPayment$default("completed-001", "$250.00", "Nov 15", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus.COMPLETED, false, "Bank of America", "9012", true, false, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE, null), createMockPayment$default("completed-002", "$125.50", "Nov 10", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus.COMPLETED, false, "Citibank", "3456", false, false, 400, null), createMockPayment$default("completed-003", "$80.00", "Nov 5", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus.COMPLETED, false, "Capital One", "7890", false, false, 400, null)})));
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSummaryScreenUiModel(createMockAutopayModule$default, kotlin.collections.CollectionsKt.build(createListBuilder), str, null, 8, null);
    }
}
