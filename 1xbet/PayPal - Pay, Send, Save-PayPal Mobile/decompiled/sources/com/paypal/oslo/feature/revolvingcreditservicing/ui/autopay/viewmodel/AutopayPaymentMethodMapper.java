package com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u0004\u0018\u00010\f2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0006¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayPaymentMethodMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent$OnPaymentMethodSelected;", "event", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/EligiblePaymentInstrument;", "eligibleInstruments", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/uimodel/SelectedPaymentMethodUiModel;", "createSelectedPaymentMethodUiModel", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent$OnPaymentMethodSelected;Ljava/util/List;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/uimodel/SelectedPaymentMethodUiModel;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument;", "buildFundingInstrumentsList", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent$OnPaymentMethodSelected;Ljava/util/List;)Ljava/util/List;", "fundingInstruments", "selectPrimaryFundingInstrument", "(Ljava/util/List;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AutopayPaymentMethodMapper {
    public static final int $stable = 0;

    @javax.inject.Inject
    public AutopayPaymentMethodMapper() {
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.SelectedPaymentMethodUiModel createSelectedPaymentMethodUiModel(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnPaymentMethodSelected event, java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> eligibleInstruments) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eligibleInstruments, "");
        if (event.getBalanceId() == null) {
            java.lang.String bankName = event.getBankName();
            if (bankName == null) {
                bankName = "";
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString plainString = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(bankName);
            int i = com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_bank_account_format;
            java.lang.String bankLastFour = event.getBankLastFour();
            if (bankLastFour == null) {
                bankLastFour = "";
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter stringResWithParameter = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(i, new java.lang.Object[]{bankLastFour}, null, false, 12, null);
            java.lang.String iconThumbnail = event.getIconThumbnail();
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.SelectedPaymentMethodUiModel(plainString, stringResWithParameter, iconThumbnail == null ? "" : iconThumbnail, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_payment_method_change, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, 16, null);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : eligibleInstruments) {
            if (obj2 instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Balance) {
                arrayList.add(obj2);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Balance) obj).getId(), event.getBalanceId())) {
                break;
            }
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Balance balance = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Balance) obj;
        java.lang.String artUrl = balance != null ? balance.getArtUrl() : null;
        java.lang.String str = artUrl == null ? "" : artUrl;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly stringResOnly = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_paypal_balance, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        int i2 = com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_balance_available;
        java.lang.String balanceAmount = event.getBalanceAmount();
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = null;
        boolean z = false;
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter stringResWithParameter2 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(i2, new java.lang.Object[]{balanceAmount != null ? balanceAmount : ""}, creditProductIdentifier, z, 12, defaultConstructorMarker);
        int i3 = com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_backup_payment_method;
        java.lang.String bankName2 = event.getBankName();
        java.lang.String bankLastFour2 = event.getBankLastFour();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(bankName2);
        sb.append(" ••");
        sb.append(bankLastFour2);
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.SelectedPaymentMethodUiModel(stringResOnly, stringResWithParameter2, str, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_payment_method_change, creditProductIdentifier, z, 6, defaultConstructorMarker), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(i3, new java.lang.Object[]{sb.toString()}, null, false, 12, null));
    }

    public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> buildFundingInstrumentsList(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnPaymentMethodSelected event, java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> eligibleInstruments) {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument;
        boolean areEqual;
        java.lang.Object obj;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eligibleInstruments, "");
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        java.lang.String balanceId = event.getBalanceId();
        java.lang.Object obj2 = null;
        if (balanceId != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj3 : eligibleInstruments) {
                if (obj3 instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Balance) {
                    arrayList.add(obj3);
                }
            }
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Balance) obj).getId(), balanceId)) {
                    break;
                }
            }
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Balance balance = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Balance) obj;
            if (balance != null && (fundingInstrument2 = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrumentMapperKt.toFundingInstrument(balance)) != null) {
                createListBuilder.add(fundingInstrument2);
            }
        }
        java.util.Iterator<T> it2 = eligibleInstruments.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            java.lang.Object next = it2.next();
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument eligiblePaymentInstrument = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument) next;
            if (eligiblePaymentInstrument instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Bank) {
                areEqual = kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Bank) eligiblePaymentInstrument).getId(), event.getBankId());
            } else if (eligiblePaymentInstrument instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Card) {
                areEqual = kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Card) eligiblePaymentInstrument).getId(), event.getBankId());
            } else if (!(eligiblePaymentInstrument instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Balance)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            if (areEqual) {
                obj2 = next;
                break;
            }
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument eligiblePaymentInstrument2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument) obj2;
        if (eligiblePaymentInstrument2 != null && (fundingInstrument = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrumentMapperKt.toFundingInstrument(eligiblePaymentInstrument2)) != null) {
            createListBuilder.add(fundingInstrument);
        }
        return kotlin.collections.CollectionsKt.build(createListBuilder);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument selectPrimaryFundingInstrument(java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> fundingInstruments) {
        java.lang.Object obj;
        java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> list = fundingInstruments;
        if (list != null && !list.isEmpty()) {
            for (kotlin.reflect.KClass kClass : kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBalance.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBank.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentCard.class)})) {
                java.util.Iterator<T> it = fundingInstruments.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (kClass.isInstance((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument) obj)) {
                        break;
                    }
                }
                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument) obj;
                if (fundingInstrument != null) {
                    return fundingInstrument;
                }
            }
        }
        return null;
    }
}
