package com.paypal.oslo.feature.p2p.ui.currencypicker.composables;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.currencypicker.composables.CurrencyPickerScreenKt$CurrencyPickerScreen$3$1", f = "CurrencyPickerScreen.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, nl = {79}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class CurrencyPickerScreenKt$CurrencyPickerScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.domain.model.CurrencyItem, kotlin.Unit> Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.view.LifecycleOwner getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, kotlin.Unit> getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.currencypicker.composables.CurrencyPickerScreenKt$CurrencyPickerScreen$3$1$1", f = "CurrencyPickerScreen.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, nl = {78}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.p2p.ui.currencypicker.composables.CurrencyPickerScreenKt$CurrencyPickerScreen$3$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.domain.model.CurrencyItem, kotlin.Unit> getHighSpeedVideoSizes;

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/p2p/ui/currencypicker/effect/CurrencyPickerEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.currencypicker.composables.CurrencyPickerScreenKt$CurrencyPickerScreen$3$1$1$1", f = "CurrencyPickerScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
        /* renamed from: com.paypal.oslo.feature.p2p.ui.currencypicker.composables.CurrencyPickerScreenKt$CurrencyPickerScreen$3$1$1$1, reason: invalid class name and collision with other inner class name */
        static final class C01261 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.p2p.ui.currencypicker.effect.CurrencyPickerEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
            final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.domain.model.CurrencyItem, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
            final /* synthetic */ kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, kotlin.Unit> getHighSpeedVideoFpsRanges;
            int getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                com.paypal.oslo.feature.p2p.ui.currencypicker.effect.CurrencyPickerEffect currencyPickerEffect = (com.paypal.oslo.feature.p2p.ui.currencypicker.effect.CurrencyPickerEffect) this.Camera2StreamConfigurationMap;
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.getHighSpeedVideoFpsRangesFor != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                if (currencyPickerEffect instanceof com.paypal.oslo.feature.p2p.ui.currencypicker.effect.CurrencyPickerEffect.CurrencySelected) {
                    com.paypal.oslo.feature.p2p.ui.currencypicker.effect.CurrencyPickerEffect.CurrencySelected currencySelected = (com.paypal.oslo.feature.p2p.ui.currencypicker.effect.CurrencyPickerEffect.CurrencySelected) currencyPickerEffect;
                    java.lang.String currencyId = currencySelected.getCurrencyId();
                    if (currencyId != null) {
                        this.getHighSpeedVideoFpsRanges.invoke(currencyId, currencySelected.getCurrencyCode());
                    }
                } else {
                    if (!(currencyPickerEffect instanceof com.paypal.oslo.feature.p2p.ui.currencypicker.effect.CurrencyPickerEffect.NavigateToXoom)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI.invoke(((com.paypal.oslo.feature.p2p.ui.currencypicker.effect.CurrencyPickerEffect.NavigateToXoom) currencyPickerEffect).getSelectedCurrency());
                }
                return kotlin.Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.p2p.ui.currencypicker.effect.CurrencyPickerEffect currencyPickerEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((com.paypal.oslo.feature.p2p.ui.currencypicker.composables.CurrencyPickerScreenKt$CurrencyPickerScreen$3$1.AnonymousClass1.C01261) create(currencyPickerEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                com.paypal.oslo.feature.p2p.ui.currencypicker.composables.CurrencyPickerScreenKt$CurrencyPickerScreen$3$1.AnonymousClass1.C01261 c01261 = new com.paypal.oslo.feature.p2p.ui.currencypicker.composables.CurrencyPickerScreenKt$CurrencyPickerScreen$3$1.AnonymousClass1.C01261(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
                c01261.Camera2StreamConfigurationMap = obj;
                return c01261;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C01261(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.domain.model.CurrencyItem, kotlin.Unit> function1, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.currencypicker.composables.CurrencyPickerScreenKt$CurrencyPickerScreen$3$1.AnonymousClass1.C01261> continuation) {
                super(2, continuation);
                this.getHighResolutionOutputSizeshNQ4ISI = function1;
                this.getHighSpeedVideoFpsRanges = function2;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRangesFor;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoFpsRangesFor = 1;
                if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getHighSpeedVideoFpsRanges.getUiEffect(), new com.paypal.oslo.feature.p2p.ui.currencypicker.composables.CurrencyPickerScreenKt$CurrencyPickerScreen$3$1.AnonymousClass1.C01261(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, null), this) == coroutine_suspended) {
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

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.p2p.ui.currencypicker.composables.CurrencyPickerScreenKt$CurrencyPickerScreen$3$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.oslo.feature.p2p.ui.currencypicker.composables.CurrencyPickerScreenKt$CurrencyPickerScreen$3$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel currencyPickerViewModel, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.domain.model.CurrencyItem, kotlin.Unit> function1, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.currencypicker.composables.CurrencyPickerScreenKt$CurrencyPickerScreen$3$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRanges = currencyPickerViewModel;
            this.getHighSpeedVideoSizes = function1;
            this.getHighResolutionOutputSizeshNQ4ISI = function2;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (androidx.view.RepeatOnLifecycleKt.repeatOnLifecycle(this.getHighSpeedVideoFpsRangesFor.getLifecycle(), androidx.lifecycle.Lifecycle.State.STARTED, new com.paypal.oslo.feature.p2p.ui.currencypicker.composables.CurrencyPickerScreenKt$CurrencyPickerScreen$3$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, null), this) == coroutine_suspended) {
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

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.p2p.ui.currencypicker.composables.CurrencyPickerScreenKt$CurrencyPickerScreen$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.p2p.ui.currencypicker.composables.CurrencyPickerScreenKt$CurrencyPickerScreen$3$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CurrencyPickerScreenKt$CurrencyPickerScreen$3$1(androidx.view.LifecycleOwner lifecycleOwner, com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel currencyPickerViewModel, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.domain.model.CurrencyItem, kotlin.Unit> function1, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.currencypicker.composables.CurrencyPickerScreenKt$CurrencyPickerScreen$3$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = lifecycleOwner;
        this.getHighSpeedVideoFpsRanges = currencyPickerViewModel;
        this.Camera2StreamConfigurationMap = function1;
        this.getHighSpeedVideoSizes = function2;
    }
}
