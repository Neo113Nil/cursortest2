package com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel$initialize$1", f = "RypViewModel.kt", i = {}, l = {93}, m = "invokeSuspend", n = {}, nl = {104}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class RypViewModel$initialize$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighSpeedVideoFpsRanges.getOutputSizeshNQ4ISI;
            mutableStateFlow2 = this.getHighSpeedVideoFpsRanges.getOutputStallDurationlomOqCM;
            kotlinx.coroutines.flow.Flow combine = kotlinx.coroutines.flow.FlowKt.combine(mutableStateFlow, mutableStateFlow2, new com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel$initialize$1.AnonymousClass1(null));
            final com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel rypViewModel = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (combine.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel$initialize$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutEntity initializeCheckoutEntity;
                    kotlin.Pair pair = (kotlin.Pair) obj2;
                    com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel rypViewModel2 = com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel.this;
                    initializeCheckoutEntity = rypViewModel2.getOutputMinFrameDurationlomOqCM;
                    rypViewModel2.onEvent(new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnContent(new com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse(initializeCheckoutEntity, (com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity) pair.getSecond(), (com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity) pair.getFirst())));
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

    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingSelectionEntity;", "buyerInfo", "fundingSelection"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel$initialize$1$1", f = "RypViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel$initialize$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity, kotlin.coroutines.Continuation<? super kotlin.Pair<? extends com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity, ? extends com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity>>, java.lang.Object> {
        int getHighSpeedVideoFpsRanges;
        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
        /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity = (com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity) this.getHighSpeedVideoSizes;
            com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity fundingSelectionEntity = (com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity) this.getHighSpeedVideoFpsRangesFor;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoFpsRanges != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return new kotlin.Pair(buyerInfoEntity, fundingSelectionEntity);
        }

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity fundingSelectionEntity, kotlin.coroutines.Continuation<? super kotlin.Pair<? extends com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity, ? extends com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity>> continuation) {
            com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel$initialize$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel$initialize$1.AnonymousClass1(continuation);
            anonymousClass1.getHighSpeedVideoSizes = buyerInfoEntity;
            anonymousClass1.getHighSpeedVideoFpsRangesFor = fundingSelectionEntity;
            return anonymousClass1.invokeSuspend(kotlin.Unit.INSTANCE);
        }

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel$initialize$1.AnonymousClass1> continuation) {
            super(3, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel$initialize$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel$initialize$1(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RypViewModel$initialize$1(com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel rypViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.ui.ryp.viewmodel.RypViewModel$initialize$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = rypViewModel;
    }
}
