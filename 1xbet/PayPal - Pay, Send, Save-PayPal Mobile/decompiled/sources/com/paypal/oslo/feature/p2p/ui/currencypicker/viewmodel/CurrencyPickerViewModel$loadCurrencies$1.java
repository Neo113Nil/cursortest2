package com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel$loadCurrencies$1", f = "CurrencyPickerViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_LOADING_INDICATOR_VALUE}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class CurrencyPickerViewModel$loadCurrencies$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent, kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.p2p.domain.usecase.GetCurrenciesUseCase getCurrenciesUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            getCurrenciesUseCase = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (kotlinx.coroutines.flow.FlowKt.m24097catch(getCurrenciesUseCase.invoke(this.getHighSpeedVideoFpsRangesFor), new com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel$loadCurrencies$1.AnonymousClass1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, null)).collect(new com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel$loadCurrencies$1.AnonymousClass2(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Larrow/core/Ior;", "", "", "Lcom/paypal/oslo/feature/p2p/domain/model/CurrencyItem;", "error"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel$loadCurrencies$1$1", f = "CurrencyPickerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel$loadCurrencies$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Ior<? extends java.lang.Throwable, ? extends java.util.List<? extends com.paypal.oslo.feature.p2p.domain.model.CurrencyItem>>>, java.lang.Throwable, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent, kotlin.Unit> getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Throwable th = (java.lang.Throwable) this.getHighSpeedVideoFpsRangesFor;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel.access$logCurrencyLoadError(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, th);
            this.getHighSpeedVideoSizes.invoke(new com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.CurrenciesLoadFailed(th.getMessage()));
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Ior<? extends java.lang.Throwable, ? extends java.util.List<? extends com.paypal.oslo.feature.p2p.domain.model.CurrencyItem>>> flowCollector, java.lang.Throwable th, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel$loadCurrencies$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel$loadCurrencies$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
            anonymousClass1.getHighSpeedVideoFpsRangesFor = th;
            return anonymousClass1.invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel currencyPickerViewModel, java.lang.String str, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel$loadCurrencies$1.AnonymousClass1> continuation) {
            super(3, continuation);
            this.Camera2StreamConfigurationMap = currencyPickerViewModel;
            this.getHighSpeedVideoFpsRanges = str;
            this.getHighSpeedVideoSizes = function1;
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel$loadCurrencies$1$2, reason: invalid class name */
    static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
        final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent, kotlin.Unit> getHighSpeedVideoFpsRangesFor;

        /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
        
            if (r10 != r1) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0118, code lost:
        
            if (r10 == r1) goto L32;
         */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object emit(arrow.core.Ior<? extends java.lang.Throwable, ? extends java.util.List<com.paypal.oslo.feature.p2p.domain.model.CurrencyItem>> ior, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel$loadCurrencies$1$2$emit$1 currencyPickerViewModel$loadCurrencies$1$2$emit$1;
            int i;
            java.util.List list;
            com.paypal.oslo.feature.p2p.ui.currencypicker.mappers.P2PCurrencyItemToCurrencyItemMapper p2PCurrencyItemToCurrencyItemMapper;
            java.util.List list2;
            com.paypal.oslo.feature.p2p.ui.currencypicker.mappers.P2PCurrencyItemToCurrencyItemMapper p2PCurrencyItemToCurrencyItemMapper2;
            if (continuation instanceof com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel$loadCurrencies$1$2$emit$1) {
                currencyPickerViewModel$loadCurrencies$1$2$emit$1 = (com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel$loadCurrencies$1$2$emit$1) continuation;
                if ((currencyPickerViewModel$loadCurrencies$1$2$emit$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    currencyPickerViewModel$loadCurrencies$1$2$emit$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = currencyPickerViewModel$loadCurrencies$1$2$emit$1.getHighSpeedVideoFpsRangesFor;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = currencyPickerViewModel$loadCurrencies$1$2$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (ior instanceof arrow.core.Ior.Right) {
                            com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel currencyPickerViewModel = this.getHighResolutionOutputSizeshNQ4ISI;
                            arrow.core.Ior.Right right = (arrow.core.Ior.Right) ior;
                            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.CURRENCIES_LOADED_SUCCESS, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("attemptId", this.getHighSpeedVideoFpsRanges), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CURRENCIES_COUNT, java.lang.Integer.valueOf(((java.util.List) right.getValue()).size()))), null, 4, null);
                            com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel currencyPickerViewModel2 = this.getHighResolutionOutputSizeshNQ4ISI;
                            java.util.List list3 = (java.util.List) right.getValue();
                            currencyPickerViewModel$loadCurrencies$1$2$emit$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
                            currencyPickerViewModel$loadCurrencies$1$2$emit$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                            obj = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel$enrichWithCurrencyNames$2(currencyPickerViewModel2, list3, null), currencyPickerViewModel$loadCurrencies$1$2$emit$1);
                        } else if (ior instanceof arrow.core.Ior.Left) {
                            arrow.core.Ior.Left left = (arrow.core.Ior.Left) ior;
                            com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel.access$logCurrencyLoadPartialFailure(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, ((java.lang.Throwable) left.getValue()).getMessage());
                            this.getHighSpeedVideoFpsRangesFor.invoke(new com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.CurrenciesLoadFailed(((java.lang.Throwable) left.getValue()).getMessage()));
                        } else {
                            if (!(ior instanceof arrow.core.Ior.Both)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                            com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel.access$logCurrenciesLoadedWithErrors(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, ((java.util.List) both.getRightValue()).size(), ((java.lang.Throwable) both.getLeftValue()).getMessage());
                            com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel currencyPickerViewModel3 = this.getHighResolutionOutputSizeshNQ4ISI;
                            java.util.List list4 = (java.util.List) both.getRightValue();
                            currencyPickerViewModel$loadCurrencies$1$2$emit$1.getHighSpeedVideoFpsRanges = ior;
                            currencyPickerViewModel$loadCurrencies$1$2$emit$1.getHighResolutionOutputSizeshNQ4ISI = 2;
                            obj = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel$enrichWithCurrencyNames$2(currencyPickerViewModel3, list4, null), currencyPickerViewModel$loadCurrencies$1$2$emit$1);
                        }
                        return coroutine_suspended;
                    }
                    if (i == 1) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel currencyPickerViewModel4 = this.getHighResolutionOutputSizeshNQ4ISI;
                        java.util.List<com.paypal.oslo.feature.p2p.domain.model.CurrencyItem> list5 = (java.util.List) obj;
                        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list5, 10));
                        for (com.paypal.oslo.feature.p2p.domain.model.CurrencyItem currencyItem : list5) {
                            p2PCurrencyItemToCurrencyItemMapper = currencyPickerViewModel4.getHighSpeedVideoSizes;
                            arrayList.add(p2PCurrencyItemToCurrencyItemMapper.map(currencyItem));
                        }
                        currencyPickerViewModel4.getOutputMinFrameDuration = arrayList;
                        kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent, kotlin.Unit> function1 = this.getHighSpeedVideoFpsRangesFor;
                        list = this.getHighResolutionOutputSizeshNQ4ISI.getOutputMinFrameDuration;
                        function1.invoke(new com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.CurrenciesLoaded(list));
                    } else {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ior = (arrow.core.Ior) currencyPickerViewModel$loadCurrencies$1$2$emit$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel currencyPickerViewModel5 = this.getHighResolutionOutputSizeshNQ4ISI;
                        java.util.List<com.paypal.oslo.feature.p2p.domain.model.CurrencyItem> list6 = (java.util.List) obj;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list6, 10));
                        for (com.paypal.oslo.feature.p2p.domain.model.CurrencyItem currencyItem2 : list6) {
                            p2PCurrencyItemToCurrencyItemMapper2 = currencyPickerViewModel5.getHighSpeedVideoSizes;
                            arrayList2.add(p2PCurrencyItemToCurrencyItemMapper2.map(currencyItem2));
                        }
                        currencyPickerViewModel5.getOutputMinFrameDuration = arrayList2;
                        kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent, kotlin.Unit> function12 = this.getHighSpeedVideoFpsRangesFor;
                        list2 = this.getHighResolutionOutputSizeshNQ4ISI.getOutputMinFrameDuration;
                        function12.invoke(new com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.CurrenciesLoaded(list2));
                        this.getHighSpeedVideoFpsRangesFor.invoke(new com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.CurrenciesLoadFailed(((java.lang.Throwable) ((arrow.core.Ior.Both) ior).getLeftValue()).getMessage()));
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
            currencyPickerViewModel$loadCurrencies$1$2$emit$1 = new com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel$loadCurrencies$1$2$emit$1(this, continuation);
            java.lang.Object obj2 = currencyPickerViewModel$loadCurrencies$1$2$emit$1.getHighSpeedVideoFpsRangesFor;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = currencyPickerViewModel$loadCurrencies$1$2$emit$1.getHighResolutionOutputSizeshNQ4ISI;
            if (i != 0) {
            }
            return kotlin.Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel currencyPickerViewModel, java.lang.String str, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent, kotlin.Unit> function1) {
            this.getHighResolutionOutputSizeshNQ4ISI = currencyPickerViewModel;
            this.getHighSpeedVideoFpsRanges = str;
            this.getHighSpeedVideoFpsRangesFor = function1;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel$loadCurrencies$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel$loadCurrencies$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CurrencyPickerViewModel$loadCurrencies$1(com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel currencyPickerViewModel, java.lang.String str, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel$loadCurrencies$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = currencyPickerViewModel;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoFpsRanges = function1;
    }
}
