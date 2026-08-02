package com.paypal.oslo.feature.inappcheckout.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardOperationSuccessEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.data.repository.AddCardRepositoryImpl$addCard$2", f = "AddCardRepositoryImpl.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, nl = {60}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class AddCardRepositoryImpl$addCard$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, ? extends com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationSuccessEntity>>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationPayloadEntity Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.data.repository.AddCardRepositoryImpl getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighResolutionOutputSizeshNQ4ISI = 1;
        java.lang.Object retryEither$default = com.paypal.oslo.feature.inappcheckout.data.repository.RetryKt.retryEither$default(2, 0L, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.data.repository.AddCardRepositoryImpl$addCard$2$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return com.paypal.oslo.feature.inappcheckout.data.repository.AddCardRepositoryImpl$addCard$2.getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity) obj2);
            }
        }, new com.paypal.oslo.feature.inappcheckout.data.repository.AddCardRepositoryImpl$addCard$2.AnonymousClass2(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, null), this, 6, null);
        return retryEither$default == coroutine_suspended ? coroutine_suspended : retryEither$default;
    }

    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n"}, d2 = {"<anonymous>", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardOperationSuccessEntity;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.data.repository.AddCardRepositoryImpl$addCard$2$2", f = "AddCardRepositoryImpl.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.inappcheckout.data.repository.AddCardRepositoryImpl$addCard$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, ? extends com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationSuccessEntity>>, java.lang.Object> {
        final /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationPayloadEntity Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.oslo.feature.inappcheckout.data.repository.AddCardRepositoryImpl getHighSpeedVideoFpsRanges;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object highSpeedVideoFpsRanges;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i != 0) {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return obj;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            highSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges(this.Camera2StreamConfigurationMap, this);
            return highSpeedVideoFpsRanges == coroutine_suspended ? coroutine_suspended : highSpeedVideoFpsRanges;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, ? extends com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationSuccessEntity>> continuation) {
            return ((com.paypal.oslo.feature.inappcheckout.data.repository.AddCardRepositoryImpl$addCard$2.AnonymousClass2) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.oslo.feature.inappcheckout.data.repository.AddCardRepositoryImpl$addCard$2.AnonymousClass2(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(com.paypal.oslo.feature.inappcheckout.data.repository.AddCardRepositoryImpl addCardRepositoryImpl, com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationPayloadEntity cardOperationPayloadEntity, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.data.repository.AddCardRepositoryImpl$addCard$2.AnonymousClass2> continuation) {
            super(1, continuation);
            this.getHighSpeedVideoFpsRanges = addCardRepositoryImpl;
            this.Camera2StreamConfigurationMap = cardOperationPayloadEntity;
        }
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity nativeXOErrorEntity) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.inappcheckout.LoggerKt.log, "Retrying add card after recoverable error", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorName", nativeXOErrorEntity.getErrorName())), null, 4, null);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, ? extends com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationSuccessEntity>> continuation) {
        return ((com.paypal.oslo.feature.inappcheckout.data.repository.AddCardRepositoryImpl$addCard$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.inappcheckout.data.repository.AddCardRepositoryImpl$addCard$2(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddCardRepositoryImpl$addCard$2(com.paypal.oslo.feature.inappcheckout.data.repository.AddCardRepositoryImpl addCardRepositoryImpl, com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationPayloadEntity cardOperationPayloadEntity, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.data.repository.AddCardRepositoryImpl$addCard$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = addCardRepositoryImpl;
        this.Camera2StreamConfigurationMap = cardOperationPayloadEntity;
    }
}
