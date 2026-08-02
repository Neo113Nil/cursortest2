package com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lcom/paypal/oslo/feature/p2p/domain/model/CurrencyItem;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel$enrichWithCurrencyNames$2", f = "CurrencyPickerViewModel.kt", i = {0, 0, 0}, l = {366}, m = "invokeSuspend", n = {"$this$coroutineScope", "uniqueCodes", "limitedIODispatcher"}, nl = {367}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes13.dex */
final class CurrencyPickerViewModel$enrichWithCurrencyNames$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.util.List<? extends com.paypal.oslo.feature.p2p.domain.model.CurrencyItem>>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.util.List<com.paypal.oslo.feature.p2p.domain.model.CurrencyItem> getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher;
        java.lang.Object awaitAll;
        kotlinx.coroutines.Deferred async$default;
        com.paypal.oslo.feature.p2p.domain.model.CurrencyItem copy;
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes.getHighSpeedVideoSizesFor = this.getHighSpeedVideoFpsRanges;
            java.util.List<com.paypal.oslo.feature.p2p.domain.model.CurrencyItem> list = this.getHighSpeedVideoFpsRanges;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.paypal.oslo.feature.p2p.domain.model.CurrencyItem) it.next()).getCurrencyCode());
            }
            java.util.List distinct = kotlin.collections.CollectionsKt.distinct(arrayList);
            coroutineDispatcher = this.getHighSpeedVideoSizes.getOutputFormats;
            kotlinx.coroutines.CoroutineDispatcher limitedParallelism$default = kotlinx.coroutines.CoroutineDispatcher.limitedParallelism$default(coroutineDispatcher, 10, null, 2, null);
            java.util.List list2 = distinct;
            com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel currencyPickerViewModel = this.getHighSpeedVideoSizes;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            java.util.Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, limitedParallelism$default, null, new com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel$enrichWithCurrencyNames$2$codeToName$1$1(currencyPickerViewModel, (java.lang.String) it2.next(), null), 2, null);
                arrayList2.add(async$default);
            }
            this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(distinct);
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(limitedParallelism$default);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            awaitAll = kotlinx.coroutines.AwaitKt.awaitAll(arrayList2, this);
            if (awaitAll == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            awaitAll = obj;
        }
        java.util.Map map = kotlin.collections.MapsKt.toMap((java.lang.Iterable) awaitAll);
        java.util.List<com.paypal.oslo.feature.p2p.domain.model.CurrencyItem> list3 = this.getHighSpeedVideoFpsRanges;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
        for (com.paypal.oslo.feature.p2p.domain.model.CurrencyItem currencyItem : list3) {
            java.lang.String str = (java.lang.String) map.get(currencyItem.getCurrencyCode());
            if (str == null) {
                str = currencyItem.getCurrencyCode();
            }
            copy = currencyItem.copy((r20 & 1) != 0 ? currencyItem.id : null, (r20 & 2) != 0 ? currencyItem.currencyCode : null, (r20 & 4) != 0 ? currencyItem.countryName : null, (r20 & 8) != 0 ? currencyItem.amount : null, (r20 & 16) != 0 ? currencyItem.formattedAmount : null, (r20 & 32) != 0 ? currencyItem.displayCurrencyName : str, (r20 & 64) != 0 ? currencyItem.countryCode : null, (r20 & 128) != 0 ? currencyItem.paymentProcessor : null, (r20 & 256) != 0 ? currencyItem.isSelected : false);
            arrayList3.add(copy);
        }
        return arrayList3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.util.List<? extends com.paypal.oslo.feature.p2p.domain.model.CurrencyItem>> continuation) {
        return ((com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel$enrichWithCurrencyNames$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel$enrichWithCurrencyNames$2 currencyPickerViewModel$enrichWithCurrencyNames$2 = new com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel$enrichWithCurrencyNames$2(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
        currencyPickerViewModel$enrichWithCurrencyNames$2.getHighSpeedVideoSizesFor = obj;
        return currencyPickerViewModel$enrichWithCurrencyNames$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CurrencyPickerViewModel$enrichWithCurrencyNames$2(com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel currencyPickerViewModel, java.util.List<com.paypal.oslo.feature.p2p.domain.model.CurrencyItem> list, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel$enrichWithCurrencyNames$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = currencyPickerViewModel;
        this.getHighSpeedVideoFpsRanges = list;
    }
}
