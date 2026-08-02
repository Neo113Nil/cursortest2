package com.paypal.oslo.feature.balance.ui.autoReload.lowbalance;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel$validateRechargeAmount$1", f = "LowBalanceViewModel.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE}, m = "invokeSuspend", n = {"rechargeOptions", "$this$map$iv", "$this$mapTo$iv$iv", "destination$iv$iv", "item$iv$iv", "it", "recharge", "threshold", "$i$f$map", "$i$f$mapTo", "$i$a$-map-LowBalanceViewModel$validateRechargeAmount$1$formattedRechargeOptions$1"}, nl = {238}, s = {"L$0", "L$1", "L$4", "L$5", "L$7", "L$8", "D$0", "D$1", "I$0", "I$1", "I$2"}, v = 2)
/* loaded from: classes11.dex */
final class LowBalanceViewModel$validateRechargeAmount$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    double Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceStateStore, com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent> getHighResolutionOutputSizeshNQ4ISI;
    double getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    int getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    java.lang.Object getValidOutputFormatsForInputhNQ4ISI;
    java.lang.Object isOutputSupportedFor;
    final /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel isOutputSupportedForhNQ4ISI;
    int unwrapAs;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00c3  */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x011d -> B:5:0x012a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.List highSpeedVideoSizes;
        java.util.ArrayList arrayList;
        java.util.Iterator it;
        java.lang.Object obj2;
        com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel lowBalanceViewModel;
        com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceStateStore, com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent> input;
        double d;
        java.lang.Object obj3;
        int i;
        java.util.List list;
        double d2;
        int i2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.unwrapAs;
        if (i3 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            double parseDouble = java.lang.Double.parseDouble(this.getHighResolutionOutputSizeshNQ4ISI.getStates().getSecond().getRechargeAmount().getAmount());
            double parseDouble2 = java.lang.Double.parseDouble(this.getHighSpeedVideoFpsRangesFor.getAmount());
            if (parseDouble < parseDouble2) {
                this.getHighResolutionOutputSizeshNQ4ISI.getEventDispatcher().invoke(new com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnSelectRechargeAmount(this.getHighSpeedVideoFpsRangesFor));
            }
            com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel lowBalanceViewModel2 = this.isOutputSupportedForhNQ4ISI;
            highSpeedVideoSizes = com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel.getHighSpeedVideoSizes(parseDouble2);
            java.util.List list2 = highSpeedVideoSizes;
            com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel lowBalanceViewModel3 = this.isOutputSupportedForhNQ4ISI;
            com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceStateStore, com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent> input2 = this.getHighResolutionOutputSizeshNQ4ISI;
            arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            it = list2.iterator();
            obj2 = list2;
            lowBalanceViewModel = lowBalanceViewModel3;
            input = input2;
            d = parseDouble;
            obj3 = obj2;
            i = 0;
            list = highSpeedVideoSizes;
            d2 = parseDouble2;
            i2 = 0;
            if (it.hasNext()) {
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = this.getInputSizeshNQ4ISI;
            int i5 = this.getHighSpeedVideoSizes;
            double d3 = this.getHighSpeedVideoFpsRanges;
            double d4 = this.Camera2StreamConfigurationMap;
            ?? r10 = (java.util.Collection) this.isOutputSupportedFor;
            java.util.Iterator it2 = (java.util.Iterator) this.getOutputStallDurationlomOqCM;
            ?? r12 = (java.util.Collection) this.getOutputSizes;
            java.lang.Object obj4 = (java.lang.Iterable) this.getOutputSizeshNQ4ISI;
            com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceStateStore, com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent> input3 = (com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input) this.getOutputMinFrameDurationlomOqCM;
            com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel lowBalanceViewModel4 = (com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel) this.getHighSpeedVideoSizesFor;
            java.lang.Object obj5 = (java.lang.Iterable) this.getInputFormats;
            java.util.List list3 = (java.util.List) this.getOutputMinFrameDuration;
            kotlin.ResultKt.throwOnFailure(obj);
            java.util.List list4 = list3;
            com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceStateStore, com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent> input4 = input3;
            com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel lowBalanceViewModel5 = lowBalanceViewModel4;
            int i6 = i4;
            java.util.Iterator it3 = it2;
            java.lang.Object obj6 = obj4;
            java.lang.Object obj7 = coroutine_suspended;
            java.util.ArrayList arrayList2 = r10;
            java.util.ArrayList arrayList3 = r12;
            java.lang.Object highResolutionOutputSizeshNQ4ISI = obj;
            double d5 = d4;
            double d6 = d3;
            int i7 = i5;
            java.lang.Object obj8 = obj5;
            arrayList2.add((java.lang.String) highResolutionOutputSizeshNQ4ISI);
            coroutine_suspended = obj7;
            i = i6;
            obj3 = obj8;
            i2 = i7;
            d2 = d6;
            d = d5;
            arrayList = arrayList3;
            it = it3;
            obj2 = obj6;
            input = input4;
            lowBalanceViewModel = lowBalanceViewModel5;
            list = list4;
            if (it.hasNext()) {
                java.lang.Object next = it.next();
                java.lang.Object obj9 = coroutine_suspended;
                java.lang.String str = (java.lang.String) next;
                int i8 = i;
                java.lang.String currencyCode = input.getStates().getSecond().getCurrencyCode();
                this.getOutputMinFrameDuration = list;
                list4 = list;
                this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj3);
                this.getHighSpeedVideoSizesFor = lowBalanceViewModel;
                this.getOutputMinFrameDurationlomOqCM = input;
                this.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj2);
                this.getOutputSizes = arrayList;
                this.getOutputStallDurationlomOqCM = it;
                this.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                this.getValidOutputFormatsForInputhNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                this.isOutputSupportedFor = arrayList;
                this.Camera2StreamConfigurationMap = d;
                this.getHighSpeedVideoFpsRanges = d2;
                this.getHighSpeedVideoSizes = i2;
                i6 = i8;
                this.getInputSizeshNQ4ISI = i6;
                this.getOutputFormats = 0;
                java.lang.Object obj10 = obj3;
                this.unwrapAs = 1;
                highResolutionOutputSizeshNQ4ISI = lowBalanceViewModel.getHighResolutionOutputSizeshNQ4ISI(currencyCode, str, 0, this);
                obj7 = obj9;
                if (highResolutionOutputSizeshNQ4ISI == obj7) {
                    return obj7;
                }
                input4 = input;
                lowBalanceViewModel5 = lowBalanceViewModel;
                it3 = it;
                obj6 = obj2;
                arrayList2 = arrayList;
                arrayList3 = arrayList2;
                d5 = d;
                d6 = d2;
                i7 = i2;
                obj8 = obj10;
                arrayList2.add((java.lang.String) highResolutionOutputSizeshNQ4ISI);
                coroutine_suspended = obj7;
                i = i6;
                obj3 = obj8;
                i2 = i7;
                d2 = d6;
                d = d5;
                arrayList = arrayList3;
                it = it3;
                obj2 = obj6;
                input = input4;
                lowBalanceViewModel = lowBalanceViewModel5;
                list = list4;
                if (it.hasNext()) {
                    this.getHighResolutionOutputSizeshNQ4ISI.getEventDispatcher().invoke(new com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnUpdateRechargeOptions(list, arrayList));
                    return kotlin.Unit.INSTANCE;
                }
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel$validateRechargeAmount$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel$validateRechargeAmount$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.isOutputSupportedForhNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LowBalanceViewModel$validateRechargeAmount$1(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceStateStore, com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent> input, com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi reloadAmountUi, com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel lowBalanceViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel$validateRechargeAmount$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = input;
        this.getHighSpeedVideoFpsRangesFor = reloadAmountUi;
        this.isOutputSupportedForhNQ4ISI = lowBalanceViewModel;
    }
}
