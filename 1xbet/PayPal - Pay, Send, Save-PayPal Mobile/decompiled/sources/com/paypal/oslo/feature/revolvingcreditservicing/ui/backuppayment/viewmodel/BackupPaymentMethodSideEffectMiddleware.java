package com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\r\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/backuppayment/viewmodel/BackupPaymentMethodSideEffectMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/SideEffectMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/backuppayment/viewmodel/BackupPaymentMethodState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/backuppayment/viewmodel/BackupPaymentMethodEvent;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument;", "eligibleFundingInstruments", "<init>", "(Ljava/util/List;)V", "state", "Lkotlin/Function1;", "", "eventDispatcher", "onState", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/backuppayment/viewmodel/BackupPaymentMethodState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Ljava/util/List;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class BackupPaymentMethodSideEffectMiddleware extends com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.SideEffectMiddleware<com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodState, com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodEvent> {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    public BackupPaymentMethodSideEffectMiddleware(java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.getHighSpeedVideoFpsRangesFor = list;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.SideEffectMiddleware
    public final /* bridge */ /* synthetic */ java.lang.Object onState(com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodState backupPaymentMethodState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation continuation) {
        return onState2(backupPaymentMethodState, function1, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ef  */
    /* renamed from: onState, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object onState2(com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodState backupPaymentMethodState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.String str;
        if (backupPaymentMethodState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodState.Loading) {
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> list = this.getHighSpeedVideoFpsRangesFor;
            java.util.ArrayList<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (!(((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument) obj) instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBalance)) {
                    arrayList.add(obj);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument : arrayList) {
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel fundingInstrumentUiModel = null;
                if (fundingInstrument instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBank) {
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBank fundingInstrumentBank = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBank) fundingInstrument;
                    java.lang.String id = fundingInstrumentBank.getId();
                    java.lang.String name2 = fundingInstrumentBank.getName();
                    if (name2 == null) {
                        name2 = "";
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString plainString = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(name2);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType type = fundingInstrumentBank.getType();
                    java.lang.String name3 = type != null ? type.name() : null;
                    java.lang.String lastNChars = fundingInstrumentBank.getLastNChars();
                    if (name3 != null) {
                        str = name3.toLowerCase(java.util.Locale.ROOT);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
                        if (str != null) {
                            if (str.length() > 0) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                java.lang.String valueOf = java.lang.String.valueOf(str.charAt(0));
                                kotlin.jvm.internal.Intrinsics.checkNotNull(valueOf, "");
                                java.lang.String upperCase = valueOf.toUpperCase(java.util.Locale.ROOT);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
                                sb.append((java.lang.Object) upperCase);
                                java.lang.String substring = str.substring(1);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                                sb.append(substring);
                                str = sb.toString();
                            }
                            if (str == null) {
                                str = "";
                            }
                            java.lang.String str2 = lastNChars != null ? lastNChars : "";
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                            sb2.append(str);
                            sb2.append(" ••");
                            sb2.append(str2);
                            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString plainString2 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(sb2.toString());
                            java.lang.String icon = fundingInstrumentBank.getIcon();
                            java.lang.String id2 = fundingInstrumentBank.getId();
                            java.lang.String lastNChars2 = fundingInstrumentBank.getLastNChars();
                            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType type2 = fundingInstrumentBank.getType();
                            fundingInstrumentUiModel = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel(id, plainString, plainString2, icon, null, null, null, null, false, null, id2, lastNChars2, type2 != null ? type2.name() : null, 1008, null);
                        }
                    }
                    str = null;
                    if (str == null) {
                    }
                    if (lastNChars != null) {
                    }
                    java.lang.StringBuilder sb22 = new java.lang.StringBuilder();
                    sb22.append(str);
                    sb22.append(" ••");
                    sb22.append(str2);
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString plainString22 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(sb22.toString());
                    java.lang.String icon2 = fundingInstrumentBank.getIcon();
                    java.lang.String id22 = fundingInstrumentBank.getId();
                    java.lang.String lastNChars22 = fundingInstrumentBank.getLastNChars();
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType type22 = fundingInstrumentBank.getType();
                    fundingInstrumentUiModel = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel(id, plainString, plainString22, icon2, null, null, null, null, false, null, id22, lastNChars22, type22 != null ? type22.name() : null, 1008, null);
                } else if (fundingInstrument instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentCard) {
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentCard fundingInstrumentCard = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentCard) fundingInstrument;
                    java.lang.String id3 = fundingInstrumentCard.getId();
                    java.lang.String name4 = fundingInstrumentCard.getName();
                    fundingInstrumentUiModel = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel(id3, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(name4 != null ? name4 : ""), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoConstants.SSN_MASK_CHAR.concat(java.lang.String.valueOf(fundingInstrumentCard.getLastNChars()))), fundingInstrumentCard.getIcon(), null, null, null, null, false, null, fundingInstrumentCard.getId(), fundingInstrumentCard.getLastNChars(), null, 1008, null);
                } else if (!(fundingInstrument instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBalance)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (fundingInstrumentUiModel != null) {
                    arrayList2.add(fundingInstrumentUiModel);
                }
            }
            function1.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodEvent.OnDataFetched(arrayList2));
        }
        return kotlin.Unit.INSTANCE;
    }
}
