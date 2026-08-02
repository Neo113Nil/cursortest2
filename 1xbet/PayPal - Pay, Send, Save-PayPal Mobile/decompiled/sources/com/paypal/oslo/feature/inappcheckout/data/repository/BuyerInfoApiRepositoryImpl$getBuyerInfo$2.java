package com.paypal.oslo.feature.inappcheckout.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.data.repository.BuyerInfoApiRepositoryImpl$getBuyerInfo$2", f = "BuyerInfoApiRepositoryImpl.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, nl = {67}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class BuyerInfoApiRepositoryImpl$getBuyerInfo$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, ? extends com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity>>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.data.repository.BuyerInfoApiRepositoryImpl getHighResolutionOutputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        final com.paypal.oslo.feature.inappcheckout.data.repository.BuyerInfoApiRepositoryImpl buyerInfoApiRepositoryImpl = this.getHighResolutionOutputSizeshNQ4ISI;
        this.Camera2StreamConfigurationMap = 1;
        java.lang.Object retryEither$default = com.paypal.oslo.feature.inappcheckout.data.repository.RetryKt.retryEither$default(2, 0L, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.data.repository.BuyerInfoApiRepositoryImpl$getBuyerInfo$2$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return com.paypal.oslo.feature.inappcheckout.data.repository.BuyerInfoApiRepositoryImpl$getBuyerInfo$2.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.inappcheckout.data.repository.BuyerInfoApiRepositoryImpl.this, (com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity) obj2);
            }
        }, new com.paypal.oslo.feature.inappcheckout.data.repository.BuyerInfoApiRepositoryImpl$getBuyerInfo$2.AnonymousClass2(this.getHighResolutionOutputSizeshNQ4ISI, null), this, 6, null);
        return retryEither$default == coroutine_suspended ? coroutine_suspended : retryEither$default;
    }

    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n"}, d2 = {"<anonymous>", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.data.repository.BuyerInfoApiRepositoryImpl$getBuyerInfo$2$2", f = "BuyerInfoApiRepositoryImpl.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.inappcheckout.data.repository.BuyerInfoApiRepositoryImpl$getBuyerInfo$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, ? extends com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity>>, java.lang.Object> {
        int getHighSpeedVideoFpsRanges;
        final /* synthetic */ com.paypal.oslo.feature.inappcheckout.data.repository.BuyerInfoApiRepositoryImpl getHighSpeedVideoFpsRangesFor;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession;
            java.lang.Object highSpeedVideoSizes;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRanges;
            if (i != 0) {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return obj;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.inappcheckout.data.repository.BuyerInfoApiRepositoryImpl buyerInfoApiRepositoryImpl = this.getHighSpeedVideoFpsRangesFor;
            appSwitchSession = buyerInfoApiRepositoryImpl.getInputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRanges = 1;
            highSpeedVideoSizes = buyerInfoApiRepositoryImpl.getHighSpeedVideoSizes(appSwitchSession.getCheckoutTokenValueOrEmpty(), this);
            return highSpeedVideoSizes == coroutine_suspended ? coroutine_suspended : highSpeedVideoSizes;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, ? extends com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity>> continuation) {
            return ((com.paypal.oslo.feature.inappcheckout.data.repository.BuyerInfoApiRepositoryImpl$getBuyerInfo$2.AnonymousClass2) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.oslo.feature.inappcheckout.data.repository.BuyerInfoApiRepositoryImpl$getBuyerInfo$2.AnonymousClass2(this.getHighSpeedVideoFpsRangesFor, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(com.paypal.oslo.feature.inappcheckout.data.repository.BuyerInfoApiRepositoryImpl buyerInfoApiRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.data.repository.BuyerInfoApiRepositoryImpl$getBuyerInfo$2.AnonymousClass2> continuation) {
            super(1, continuation);
            this.getHighSpeedVideoFpsRangesFor = buyerInfoApiRepositoryImpl;
        }
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.inappcheckout.data.repository.BuyerInfoApiRepositoryImpl buyerInfoApiRepositoryImpl, com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity nativeXOErrorEntity) {
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger;
        checkoutLogger = buyerInfoApiRepositoryImpl.getHighSpeedVideoSizes;
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(checkoutLogger, "Retrying buyer info fetch after recoverable error", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorName", nativeXOErrorEntity.getErrorName())), null, 4, null);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, ? extends com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity>> continuation) {
        return ((com.paypal.oslo.feature.inappcheckout.data.repository.BuyerInfoApiRepositoryImpl$getBuyerInfo$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.inappcheckout.data.repository.BuyerInfoApiRepositoryImpl$getBuyerInfo$2(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BuyerInfoApiRepositoryImpl$getBuyerInfo$2(com.paypal.oslo.feature.inappcheckout.data.repository.BuyerInfoApiRepositoryImpl buyerInfoApiRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.data.repository.BuyerInfoApiRepositoryImpl$getBuyerInfo$2> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = buyerInfoApiRepositoryImpl;
    }
}
