package com.paypal.oslo.feature.wallet.me.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u001e\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00050\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/wallet/me/domain/ProductError;", "", "Lcom/paypal/oslo/feature/wallet/me/domain/Product;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.me.domain.usecase.WalletComponentsUseCase$invoke$1", f = "WalletComponentsUseCase.kt", i = {0, 1}, l = {50, 49}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, nl = {49, 69}, s = {"L$0", "L$0"}, v = 2)
/* loaded from: classes16.dex */
final class WalletComponentsUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<? extends com.paypal.oslo.feature.wallet.me.domain.ProductError, ? extends java.util.List<? extends com.paypal.oslo.feature.wallet.me.domain.Product<?>>>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.wallet.me.domain.usecase.WalletComponentsUseCase Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.util.List<com.paypal.oslo.feature.wallet.me.domain.Product.Type> getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0064, code lost:
    
        if (r2.emit(r10, r9) == r1) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher;
        kotlinx.coroutines.flow.FlowCollector flowCollector;
        kotlinx.coroutines.flow.FlowCollector flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            coroutineDispatcher = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector2);
            this.getHighSpeedVideoFpsRangesFor = flowCollector2;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            obj = kotlinx.coroutines.BuildersKt.withContext(coroutineDispatcher, new com.paypal.oslo.feature.wallet.me.domain.usecase.WalletComponentsUseCase$invoke$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, null), this);
            if (obj != coroutine_suspended) {
                flowCollector = flowCollector2;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
        flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoFpsRangesFor;
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector2);
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighResolutionOutputSizeshNQ4ISI = 2;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00030\u0001*\u00020\u0005H\n"}, d2 = {"<anonymous>", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/wallet/me/domain/ProductError;", "", "Lcom/paypal/oslo/feature/wallet/me/domain/Product;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.me.domain.usecase.WalletComponentsUseCase$invoke$1$1", f = "WalletComponentsUseCase.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, nl = {54}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.wallet.me.domain.usecase.WalletComponentsUseCase$invoke$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.wallet.me.domain.ProductError, ? extends java.util.List<? extends com.paypal.oslo.feature.wallet.me.domain.Product<?>>>>, java.lang.Object> {
        int Camera2StreamConfigurationMap;
        final /* synthetic */ com.paypal.oslo.feature.wallet.me.domain.usecase.WalletComponentsUseCase getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
        final /* synthetic */ java.util.List<com.paypal.oslo.feature.wallet.me.domain.Product.Type> getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.wallet.me.domain.repository.WalletComponentsRepository walletComponentsRepository;
            com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager walletFeatureManager;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.Camera2StreamConfigurationMap;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                walletComponentsRepository = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
                this.Camera2StreamConfigurationMap = 1;
                obj = walletComponentsRepository.components(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            arrow.core.Either either = (arrow.core.Either) obj;
            com.paypal.oslo.feature.wallet.me.domain.usecase.WalletComponentsUseCase walletComponentsUseCase = this.getHighResolutionOutputSizeshNQ4ISI;
            if (either instanceof arrow.core.Either.Right) {
                java.util.List list = (java.util.List) ((arrow.core.Either.Right) either).getValue();
                walletFeatureManager = walletComponentsUseCase.getHighResolutionOutputSizeshNQ4ISI;
                boolean isMoneyPoolsTileEnabled = walletFeatureManager.isMoneyPoolsTileEnabled();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj2 : list) {
                    com.paypal.oslo.feature.wallet.me.domain.Product product = (com.paypal.oslo.feature.wallet.me.domain.Product) obj2;
                    if (!(product instanceof com.paypal.oslo.feature.wallet.me.domain.balance.BalanceProduct)) {
                        if (!isMoneyPoolsTileEnabled && com.paypal.oslo.feature.wallet.me.domain.Product.Type.MONEY_POOLS == product.getType()) {
                        }
                        arrayList.add(obj2);
                    } else if (((com.paypal.oslo.feature.wallet.me.domain.balance.BalanceProduct) product).isCipEligible()) {
                        arrayList.add(obj2);
                    }
                }
                return arrow.core.EitherKt.right(arrayList);
            }
            if (either instanceof arrow.core.Either.Left) {
                return arrow.core.EitherKt.left((com.paypal.oslo.feature.wallet.me.domain.ProductError) ((arrow.core.Either.Left) either).getValue());
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.wallet.me.domain.ProductError, ? extends java.util.List<? extends com.paypal.oslo.feature.wallet.me.domain.Product<?>>>> continuation) {
            return ((com.paypal.oslo.feature.wallet.me.domain.usecase.WalletComponentsUseCase$invoke$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.oslo.feature.wallet.me.domain.usecase.WalletComponentsUseCase$invoke$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(com.paypal.oslo.feature.wallet.me.domain.usecase.WalletComponentsUseCase walletComponentsUseCase, java.lang.String str, java.util.List<? extends com.paypal.oslo.feature.wallet.me.domain.Product.Type> list, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.me.domain.usecase.WalletComponentsUseCase$invoke$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = walletComponentsUseCase;
            this.getHighSpeedVideoFpsRanges = str;
            this.getHighSpeedVideoSizes = list;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<? extends com.paypal.oslo.feature.wallet.me.domain.ProductError, ? extends java.util.List<? extends com.paypal.oslo.feature.wallet.me.domain.Product<?>>>> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.me.domain.usecase.WalletComponentsUseCase$invoke$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.wallet.me.domain.usecase.WalletComponentsUseCase$invoke$1 walletComponentsUseCase$invoke$1 = new com.paypal.oslo.feature.wallet.me.domain.usecase.WalletComponentsUseCase$invoke$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
        walletComponentsUseCase$invoke$1.getHighSpeedVideoSizesFor = obj;
        return walletComponentsUseCase$invoke$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    WalletComponentsUseCase$invoke$1(com.paypal.oslo.feature.wallet.me.domain.usecase.WalletComponentsUseCase walletComponentsUseCase, java.lang.String str, java.util.List<? extends com.paypal.oslo.feature.wallet.me.domain.Product.Type> list, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.me.domain.usecase.WalletComponentsUseCase$invoke$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = walletComponentsUseCase;
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighSpeedVideoSizes = list;
    }
}
