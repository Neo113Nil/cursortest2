package com.paypal.oslo.feature.bnplservicing.ui.makepayment;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u000b\u0010\fJ9\u0010\u0012\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u0012\u0010\u0013JI\u0010\u0016\u001a*\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000f\u0012\u0004\u0012\u00020\u00060\u00142\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUtils;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent;", "", "onEvent", "handleNewlyAddedFiConsume", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function0;", "createOnNewlyAddedFiConsumeCallback", "(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/FundingInstrumentUiModel;", "fundingInstrument", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;", "updatedFundingInstruments", "handleChangeFiDismiss", "(Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/FundingInstrumentUiModel;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function4;", "", "createOnDismissCallback", "(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function4;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MakeAPaymentUtils {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUtils INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUtils();

    private MakeAPaymentUtils() {
    }

    public final void handleNewlyAddedFiConsume(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent, kotlin.Unit> onEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onEvent, "");
        onEvent.invoke(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.OnNewFiConsumed.INSTANCE);
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> createOnNewlyAddedFiConsumeCallback(final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent, kotlin.Unit> onEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onEvent, "");
        return new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUtils$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUtils.$r8$lambda$cVrpGqYg7wDtFco58eoJqDyOsTs(kotlin.jvm.functions.Function1.this);
            }
        };
    }

    public final void handleChangeFiDismiss(com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel fundingInstrument, java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument> updatedFundingInstruments, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent, kotlin.Unit> onEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updatedFundingInstruments, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onEvent, "");
        onEvent.invoke(new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.ChangeFiDismissed(updatedFundingInstruments));
        if (fundingInstrument != null) {
            onEvent.invoke(new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.FundingInstrumentSelected(fundingInstrument));
        }
    }

    public final kotlin.jvm.functions.Function4<java.lang.Boolean, com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel, java.lang.Boolean, java.util.List<com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel>, kotlin.Unit> createOnDismissCallback(final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent, kotlin.Unit> onEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onEvent, "");
        return new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUtils$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function4
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                return com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUtils.m12596$r8$lambda$HeNd3iRYbPLLUS6si31esqeT_k(kotlin.jvm.functions.Function1.this, (java.lang.Boolean) obj, (com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel) obj2, ((java.lang.Boolean) obj3).booleanValue(), (java.util.List) obj4);
            }
        };
    }

    /* renamed from: $r8$lambda$HeNd3-iRYbPLLUS6si31esqeT_k, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12596$r8$lambda$HeNd3iRYbPLLUS6si31esqeT_k(kotlin.jvm.functions.Function1 function1, java.lang.Boolean bool, com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel fundingInstrumentUiModel, boolean z, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUtils makeAPaymentUtils = INSTANCE;
        java.util.List list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel) it.next()).getFundingInstrument());
        }
        makeAPaymentUtils.handleChangeFiDismiss(fundingInstrumentUiModel, arrayList, function1);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cVrpGqYg7wDtFco58eoJqDyOsTs(kotlin.jvm.functions.Function1 function1) {
        INSTANCE.handleNewlyAddedFiConsume(function1);
        return kotlin.Unit.INSTANCE;
    }
}
