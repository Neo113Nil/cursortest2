package com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel$loadCryptos$1", f = "CurrencyPickerViewModel.kt", i = {}, l = {311}, m = "invokeSuspend", n = {}, nl = {com.visa.cbp.getCertUsage.setAucAID}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class CurrencyPickerViewModel$loadCryptos$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent, kotlin.Unit> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.p2p.domain.usecase.GetCryptosUseCase getCryptosUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            getCryptosUseCase = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
            kotlinx.coroutines.flow.Flow m24097catch = kotlinx.coroutines.flow.FlowKt.m24097catch(getCryptosUseCase.invoke(), new com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel$loadCryptos$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, null));
            final com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel currencyPickerViewModel = this.getHighSpeedVideoFpsRanges;
            final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent, kotlin.Unit> function1 = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (m24097catch.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel$loadCryptos$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.p2p.ui.currencypicker.mappers.CryptoToItemStateMapper cryptoToItemStateMapper;
                    java.util.List list;
                    com.paypal.oslo.feature.p2p.ui.currencypicker.mappers.CryptoToItemStateMapper cryptoToItemStateMapper2;
                    java.util.List list2;
                    arrow.core.Ior ior = (arrow.core.Ior) obj2;
                    if (ior instanceof arrow.core.Ior.Right) {
                        com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel currencyPickerViewModel2 = com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel.this;
                        arrow.core.Ior.Right right = (arrow.core.Ior.Right) ior;
                        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.CRYPTOS_LOADED_SUCCESS, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CRYPTOS_COUNT, java.lang.Integer.valueOf(((java.util.List) right.getValue()).size()))), null, 4, null);
                        com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel currencyPickerViewModel3 = com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel.this;
                        cryptoToItemStateMapper2 = currencyPickerViewModel3.getHighSpeedVideoFpsRangesFor;
                        currencyPickerViewModel3.getInputFormats = com.paypal.oslo.feature.p2p.domain.common.mapper.MapperExtensionsKt.mapCollection(cryptoToItemStateMapper2, (java.util.Collection) right.getValue());
                        kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent, kotlin.Unit> function12 = function1;
                        list2 = com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel.this.getInputFormats;
                        function12.invoke(new com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.CryptosLoaded(list2));
                    } else if (ior instanceof arrow.core.Ior.Left) {
                        com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel.access$logCryptoLoadPartialFailure(com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel.this, ((java.lang.Throwable) ((arrow.core.Ior.Left) ior).getValue()).getMessage());
                    } else {
                        if (!(ior instanceof arrow.core.Ior.Both)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                        com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel.access$logCryptosLoadedWithErrors(com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel.this, ((java.util.List) both.getRightValue()).size(), ((java.lang.Throwable) both.getLeftValue()).getMessage());
                        com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel currencyPickerViewModel4 = com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel.this;
                        cryptoToItemStateMapper = currencyPickerViewModel4.getHighSpeedVideoFpsRangesFor;
                        currencyPickerViewModel4.getInputFormats = com.paypal.oslo.feature.p2p.domain.common.mapper.MapperExtensionsKt.mapCollection(cryptoToItemStateMapper, (java.util.Collection) both.getRightValue());
                        kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent, kotlin.Unit> function13 = function1;
                        list = com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel.this.getInputFormats;
                        function13.invoke(new com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent.CryptosLoaded(list));
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
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

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Larrow/core/Ior;", "", "", "Lcom/paypal/oslo/feature/p2p/domain/model/CryptoItem;", "error"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel$loadCryptos$1$1", f = "CurrencyPickerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel$loadCryptos$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Ior<? extends java.lang.Throwable, ? extends java.util.List<? extends com.paypal.oslo.feature.p2p.domain.model.CryptoItem>>>, java.lang.Throwable, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Throwable th = (java.lang.Throwable) this.getHighSpeedVideoFpsRangesFor;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel.access$logCryptoLoadError(this.Camera2StreamConfigurationMap, th);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Ior<? extends java.lang.Throwable, ? extends java.util.List<? extends com.paypal.oslo.feature.p2p.domain.model.CryptoItem>>> flowCollector, java.lang.Throwable th, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel$loadCryptos$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel$loadCryptos$1.AnonymousClass1(this.Camera2StreamConfigurationMap, continuation);
            anonymousClass1.getHighSpeedVideoFpsRangesFor = th;
            return anonymousClass1.invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel currencyPickerViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel$loadCryptos$1.AnonymousClass1> continuation) {
            super(3, continuation);
            this.Camera2StreamConfigurationMap = currencyPickerViewModel;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel$loadCryptos$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel$loadCryptos$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CurrencyPickerViewModel$loadCryptos$1(com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel currencyPickerViewModel, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.currencypicker.events.CurrencyPickerEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel$loadCryptos$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = currencyPickerViewModel;
        this.getHighSpeedVideoSizes = function1;
    }
}
