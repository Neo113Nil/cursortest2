package com.paypal.oslo.feature.cashin.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListViewModel$loadRetailers$1", f = "CashInStoresListViewModel.kt", i = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {73, 95, 100}, m = "invokeSuspend", n = {"this_$iv", "retailers", "$this$map$iv", "$this$mapTo$iv$iv", "destination$iv$iv", "item$iv$iv", "it", "$i$f$fold", "$i$a$-fold-CashInStoresListViewModel$loadRetailers$1$2", "$i$f$map", "$i$f$mapTo", "$i$a$-map-CashInStoresListViewModel$loadRetailers$1$2$featured$2", "this_$iv", "retailers", "$this$map$iv", "$this$mapTo$iv$iv", "destination$iv$iv", "item$iv$iv", "it", "featured", "$i$f$fold", "$i$a$-fold-CashInStoresListViewModel$loadRetailers$1$2", "$i$f$map", "$i$f$mapTo", "$i$a$-map-CashInStoresListViewModel$loadRetailers$1$2$other$2"}, nl = {167, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, 187}, s = {"L$0", "L$2", "L$3", "L$4", "L$5", "L$7", "L$8", "I$0", "I$1", "I$2", "I$3", "I$4", "L$0", "L$2", "L$3", "L$4", "L$5", "L$7", "L$8", "L$10", "I$0", "I$1", "I$2", "I$3", "I$4"}, v = 2)
/* loaded from: classes11.dex */
final class CashInStoresListViewModel$loadRetailers$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListViewModel isOutputSupportedFor;
    int toString;
    java.lang.Object unwrapAs;

    /* JADX WARN: Code restructure failed: missing block: B:83:0x00b5, code lost:
    
        if (r2 != r1) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0189  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0254 -> B:7:0x025b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x017e -> B:21:0x017f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.cashin.domain.usecase.GetCashInRetailersUseCase getCashInRetailersUseCase;
        java.lang.Object invoke;
        com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListViewModel cashInStoresListViewModel;
        int i;
        int i2;
        int i3;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.util.Collection arrayList;
        java.lang.Iterable iterable;
        java.lang.Iterable iterable2;
        java.util.Iterator it;
        int i4;
        int i5;
        arrow.core.Either either;
        java.util.List list;
        int i6;
        int i7;
        java.lang.Object obj2;
        java.lang.Object obj3;
        com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListViewModel cashInStoresListViewModel2;
        java.util.List list2;
        int i8;
        int i9;
        java.util.List list3;
        int i10;
        java.util.Collection collection;
        java.util.Iterator it2;
        arrow.core.Either either2;
        int i11;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.toString;
        java.lang.String str = "featured";
        if (i12 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.isOutputSupportedFor.getHighSpeedVideoFpsRangesFor;
            mutableStateFlow.setValue(com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListUiState.Loading.INSTANCE);
            getCashInRetailersUseCase = this.isOutputSupportedFor.getHighSpeedVideoFpsRanges;
            this.toString = 1;
            invoke = getCashInRetailersUseCase.invoke(this);
        } else if (i12 == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
            invoke = obj;
        } else if (i12 == 2) {
            i6 = this.getHighSpeedVideoSizes;
            i7 = this.getHighSpeedVideoFpsRangesFor;
            i4 = this.Camera2StreamConfigurationMap;
            i5 = this.getHighResolutionOutputSizeshNQ4ISI;
            arrayList = (java.util.Collection) this.unwrapAs;
            it = (java.util.Iterator) this.getOutputStallDurationlomOqCM;
            java.util.Collection collection2 = (java.util.Collection) this.getOutputStallDuration;
            iterable = (java.lang.Iterable) this.getOutputSizes;
            iterable2 = (java.lang.Iterable) this.getHighSpeedVideoSizesFor;
            list = (java.util.List) this.getOutputFormats;
            cashInStoresListViewModel = (com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListViewModel) this.getInputSizeshNQ4ISI;
            either = (arrow.core.Either) this.getOutputMinFrameDuration;
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String str2 = "featured";
            java.lang.Object access$mapRetailerToUiModel = obj;
            arrayList.add((com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoreUiModel) access$mapRetailerToUiModel);
            arrayList = collection2;
            str = str2;
            if (it.hasNext()) {
                java.lang.Object next = it.next();
                com.paypal.oslo.feature.cashin.domain.model.CashInRetailer cashInRetailer = (com.paypal.oslo.feature.cashin.domain.model.CashInRetailer) next;
                str2 = str;
                this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getInputSizeshNQ4ISI = cashInStoresListViewModel;
                this.getOutputFormats = list;
                this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iterable2);
                this.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iterable);
                this.getOutputStallDuration = arrayList;
                this.getOutputStallDurationlomOqCM = it;
                this.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                this.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cashInRetailer);
                this.unwrapAs = arrayList;
                this.getHighResolutionOutputSizeshNQ4ISI = i5;
                this.Camera2StreamConfigurationMap = i4;
                this.getHighSpeedVideoFpsRangesFor = i7;
                this.getHighSpeedVideoSizes = i6;
                this.getHighSpeedVideoFpsRanges = 0;
                this.toString = 2;
                access$mapRetailerToUiModel = com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListViewModel.access$mapRetailerToUiModel(cashInStoresListViewModel, cashInRetailer, this);
                if (access$mapRetailerToUiModel != coroutine_suspended) {
                    collection2 = arrayList;
                    arrayList.add((com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoreUiModel) access$mapRetailerToUiModel);
                    arrayList = collection2;
                    str = str2;
                    if (it.hasNext()) {
                        java.lang.String str3 = str;
                        java.util.List list4 = (java.util.List) arrayList;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        for (java.lang.Object obj4 : list) {
                            java.util.List<java.lang.String> tags = ((com.paypal.oslo.feature.cashin.domain.model.CashInRetailer) obj4).getTags();
                            if (!(tags instanceof java.util.Collection) || !tags.isEmpty()) {
                                java.util.Iterator<T> it3 = tags.iterator();
                                while (it3.hasNext()) {
                                    if (kotlin.text.StringsKt.equals((java.lang.String) it3.next(), str3, true)) {
                                        break;
                                    }
                                }
                            }
                            java.lang.String str4 = str3;
                            arrayList2.add(obj4);
                            str3 = str4;
                        }
                        java.util.ArrayList arrayList3 = arrayList2;
                        java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                        java.util.Iterator it4 = arrayList3.iterator();
                        obj2 = arrayList3;
                        obj3 = obj2;
                        cashInStoresListViewModel2 = cashInStoresListViewModel;
                        list2 = list;
                        i8 = i4;
                        i9 = i5;
                        list3 = list4;
                        i10 = 0;
                        collection = arrayList4;
                        it2 = it4;
                        either2 = either;
                        i11 = 0;
                        if (it2.hasNext()) {
                        }
                    }
                }
                return coroutine_suspended;
            }
        } else {
            if (i12 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = this.getHighSpeedVideoSizes;
            i10 = this.getHighSpeedVideoFpsRangesFor;
            i8 = this.Camera2StreamConfigurationMap;
            i9 = this.getHighResolutionOutputSizeshNQ4ISI;
            list3 = (java.util.List) this.getInputFormats;
            collection = (java.util.Collection) this.unwrapAs;
            java.util.Iterator it5 = (java.util.Iterator) this.getOutputStallDurationlomOqCM;
            java.util.Collection collection3 = (java.util.Collection) this.getOutputStallDuration;
            java.lang.Object obj5 = (java.lang.Iterable) this.getOutputSizes;
            java.lang.Object obj6 = (java.lang.Iterable) this.getHighSpeedVideoSizesFor;
            java.util.List list5 = (java.util.List) this.getOutputFormats;
            com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListViewModel cashInStoresListViewModel3 = (com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListViewModel) this.getInputSizeshNQ4ISI;
            either2 = (arrow.core.Either) this.getOutputMinFrameDuration;
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.Object access$mapRetailerToUiModel2 = obj;
            com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListViewModel cashInStoresListViewModel4 = cashInStoresListViewModel3;
            java.util.List list6 = list5;
            java.lang.Object obj7 = obj6;
            java.lang.Object obj8 = obj5;
            java.util.Iterator it6 = it5;
            java.util.Collection collection4 = collection3;
            java.lang.Object obj9 = coroutine_suspended;
            collection.add((com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoreUiModel) access$mapRetailerToUiModel2);
            collection = collection4;
            coroutine_suspended = obj9;
            it2 = it6;
            obj2 = obj8;
            obj3 = obj7;
            list2 = list6;
            cashInStoresListViewModel2 = cashInStoresListViewModel4;
            if (it2.hasNext()) {
                java.lang.Object next2 = it2.next();
                com.paypal.oslo.feature.cashin.domain.model.CashInRetailer cashInRetailer2 = (com.paypal.oslo.feature.cashin.domain.model.CashInRetailer) next2;
                this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either2);
                this.getInputSizeshNQ4ISI = cashInStoresListViewModel2;
                this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list2);
                this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj3);
                this.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj2);
                this.getOutputStallDuration = collection;
                this.getOutputStallDurationlomOqCM = it2;
                this.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next2);
                this.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cashInRetailer2);
                this.unwrapAs = collection;
                this.getInputFormats = list3;
                this.getHighResolutionOutputSizeshNQ4ISI = i9;
                this.Camera2StreamConfigurationMap = i8;
                this.getHighSpeedVideoFpsRangesFor = i10;
                this.getHighSpeedVideoSizes = i11;
                this.getHighSpeedVideoFpsRanges = 0;
                this.toString = 3;
                access$mapRetailerToUiModel2 = com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListViewModel.access$mapRetailerToUiModel(cashInStoresListViewModel2, cashInRetailer2, this);
                obj9 = coroutine_suspended;
                if (access$mapRetailerToUiModel2 == obj9) {
                    return obj9;
                }
                cashInStoresListViewModel4 = cashInStoresListViewModel2;
                list6 = list2;
                obj7 = obj3;
                obj8 = obj2;
                it6 = it2;
                collection4 = collection;
                collection.add((com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoreUiModel) access$mapRetailerToUiModel2);
                collection = collection4;
                coroutine_suspended = obj9;
                it2 = it6;
                obj2 = obj8;
                obj3 = obj7;
                list2 = list6;
                cashInStoresListViewModel2 = cashInStoresListViewModel4;
                if (it2.hasNext()) {
                    mutableStateFlow3 = cashInStoresListViewModel2.getHighSpeedVideoFpsRangesFor;
                    mutableStateFlow3.setValue(new com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListUiState.Success(list3, (java.util.List) collection));
                    return kotlin.Unit.INSTANCE;
                }
            }
        }
        arrow.core.Either either3 = (arrow.core.Either) invoke;
        cashInStoresListViewModel = this.isOutputSupportedFor;
        if (either3 instanceof arrow.core.Either.Right) {
            java.util.List list7 = (java.util.List) ((arrow.core.Either.Right) either3).getValue();
            cashInStoresListViewModel.getHighResolutionOutputSizeshNQ4ISI = 0;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            for (java.lang.Object obj10 : list7) {
                java.util.List<java.lang.String> tags2 = ((com.paypal.oslo.feature.cashin.domain.model.CashInRetailer) obj10).getTags();
                if (!(tags2 instanceof java.util.Collection) || !tags2.isEmpty()) {
                    java.util.Iterator<T> it7 = tags2.iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            break;
                        }
                        if (kotlin.text.StringsKt.equals((java.lang.String) it7.next(), "featured", true)) {
                            arrayList5.add(obj10);
                            break;
                        }
                    }
                }
            }
            java.util.ArrayList arrayList6 = arrayList5;
            arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList6, 10));
            iterable = arrayList6;
            iterable2 = iterable;
            it = arrayList6.iterator();
            i4 = 0;
            i5 = 0;
            either = either3;
            list = list7;
            i6 = 0;
            i7 = 0;
            if (it.hasNext()) {
            }
        } else {
            if (either3 instanceof arrow.core.Either.Left) {
                com.paypal.oslo.feature.cashin.domain.error.CashInError cashInError = (com.paypal.oslo.feature.cashin.domain.error.CashInError) ((arrow.core.Either.Left) either3).getValue();
                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.cashin.LoggerKt.log;
                i = cashInStoresListViewModel.getHighResolutionOutputSizeshNQ4ISI;
                com.paypal.android.logger.Logger.e$default(logger, "Failed to load retailers", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("attemptNumber", kotlin.coroutines.jvm.internal.Boxing.boxInt(i)), kotlin.TuplesKt.to("errorType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(cashInError.getClass()).getSimpleName())), null, null, 12, null);
                i2 = cashInStoresListViewModel.getHighResolutionOutputSizeshNQ4ISI;
                i3 = cashInStoresListViewModel.getHighResolutionOutputSizeshNQ4ISI;
                cashInStoresListViewModel.getHighResolutionOutputSizeshNQ4ISI = i3 + 1;
                mutableStateFlow2 = cashInStoresListViewModel.getHighSpeedVideoFpsRangesFor;
                mutableStateFlow2.setValue(new com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListUiState.Error(cashInError.toString(), i2));
                return kotlin.Unit.INSTANCE;
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListViewModel$loadRetailers$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListViewModel$loadRetailers$1(this.isOutputSupportedFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CashInStoresListViewModel$loadRetailers$1(com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListViewModel cashInStoresListViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoresListViewModel$loadRetailers$1> continuation) {
        super(2, continuation);
        this.isOutputSupportedFor = cashInStoresListViewModel;
    }
}
