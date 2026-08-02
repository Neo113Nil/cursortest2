package com.paypal.oslo.feature.p2p.ui.review.viewmodels;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel$loadAmount$1", f = "EditAmountViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ALERT_WARNING_VALUE}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_REJECTED_REC_VALUE}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class EditAmountViewModel$loadAmount$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent, kotlin.Unit> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.p2p.domain.usecase.GetAmountUseCase getAmountUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            getAmountUseCase = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(kotlinx.coroutines.flow.FlowKt.m24097catch(getAmountUseCase.invoke(), new com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel$loadAmount$1.AnonymousClass1(this.getHighSpeedVideoSizes, null)), new com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel$loadAmount$1.AnonymousClass2(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, null), this) == coroutine_suspended) {
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

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/p2p/domain/error/AmountError;", "Lcom/paypal/oslo/feature/p2p/domain/model/Amount;", "<unused var>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel$loadAmount$1$1", f = "EditAmountViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel$loadAmount$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Ior<? extends com.paypal.oslo.feature.p2p.domain.error.AmountError, ? extends com.paypal.oslo.feature.p2p.domain.model.Amount>>, java.lang.Throwable, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent, kotlin.Unit> Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap.invoke(new com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.AmountLoadFailed(com.paypal.oslo.feature.p2p.R.string.feature_p2p_review_amount_error_load_failed));
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Ior<? extends com.paypal.oslo.feature.p2p.domain.error.AmountError, ? extends com.paypal.oslo.feature.p2p.domain.model.Amount>> flowCollector, java.lang.Throwable th, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return new com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel$loadAmount$1.AnonymousClass1(this.Camera2StreamConfigurationMap, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel$loadAmount$1.AnonymousClass1> continuation) {
            super(3, continuation);
            this.Camera2StreamConfigurationMap = function1;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/p2p/domain/error/AmountError;", "Lcom/paypal/oslo/feature/p2p/domain/model/Amount;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel$loadAmount$1$2", f = "EditAmountViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel$loadAmount$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<arrow.core.Ior<? extends com.paypal.oslo.feature.p2p.domain.error.AmountError, ? extends com.paypal.oslo.feature.p2p.domain.model.Amount>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel Camera2StreamConfigurationMap;
        int getHighSpeedVideoFpsRanges;
        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent, kotlin.Unit> getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.p2p.ui.review.mappers.AmountToUiAmountMapper amountToUiAmountMapper;
            com.paypal.oslo.feature.p2p.ui.review.mappers.AmountToUiAmountMapper amountToUiAmountMapper2;
            arrow.core.Ior ior = (arrow.core.Ior) this.getHighSpeedVideoFpsRangesFor;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoFpsRanges != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent, kotlin.Unit> function1 = this.getHighSpeedVideoSizes;
            com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel editAmountViewModel = this.Camera2StreamConfigurationMap;
            if (ior instanceof arrow.core.Ior.Left) {
                function1.invoke(new com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.AmountLoadFailed(com.paypal.oslo.feature.p2p.R.string.feature_p2p_review_amount_error_load_failed));
            } else if (ior instanceof arrow.core.Ior.Right) {
                com.paypal.oslo.feature.p2p.domain.model.Amount amount = (com.paypal.oslo.feature.p2p.domain.model.Amount) ((arrow.core.Ior.Right) ior).getValue();
                amountToUiAmountMapper2 = editAmountViewModel.getHighSpeedVideoFpsRangesFor;
                function1.invoke(new com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.AmountLoaded(amountToUiAmountMapper2.map(amount)));
            } else if (ior instanceof arrow.core.Ior.Both) {
                arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                java.lang.Object leftValue = both.getLeftValue();
                com.paypal.oslo.feature.p2p.domain.model.Amount amount2 = (com.paypal.oslo.feature.p2p.domain.model.Amount) both.getRightValue();
                amountToUiAmountMapper = editAmountViewModel.getHighSpeedVideoFpsRangesFor;
                function1.invoke(new com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.AmountLoaded(amountToUiAmountMapper.map(amount2)));
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(arrow.core.Ior<? extends com.paypal.oslo.feature.p2p.domain.error.AmountError, ? extends com.paypal.oslo.feature.p2p.domain.model.Amount> ior, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel$loadAmount$1.AnonymousClass2) create(ior, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel$loadAmount$1.AnonymousClass2 anonymousClass2 = new com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel$loadAmount$1.AnonymousClass2(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
            anonymousClass2.getHighSpeedVideoFpsRangesFor = obj;
            return anonymousClass2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent, kotlin.Unit> function1, com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel editAmountViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel$loadAmount$1.AnonymousClass2> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoSizes = function1;
            this.Camera2StreamConfigurationMap = editAmountViewModel;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel$loadAmount$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel$loadAmount$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    EditAmountViewModel$loadAmount$1(com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel editAmountViewModel, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel$loadAmount$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = editAmountViewModel;
        this.getHighSpeedVideoSizes = function1;
    }
}
