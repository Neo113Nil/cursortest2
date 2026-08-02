package com.paypal.oslo.feature.inappcheckout.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/EConsentXOResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.data.repository.EConsentRepositoryImpl$approveElectronicConsent$2", f = "EConsentRepositoryImpl.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, nl = {70}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class EConsentRepositoryImpl$approveElectronicConsent$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, ? extends com.paypal.oslo.feature.inappcheckout.domain.entity.EConsentXOResponse>>, java.lang.Object> {
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.data.repository.EConsentRepositoryImpl getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoSizes = 1;
        java.lang.Object retryEither$default = com.paypal.oslo.feature.inappcheckout.data.repository.RetryKt.retryEither$default(2, 0L, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.data.repository.EConsentRepositoryImpl$approveElectronicConsent$2$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                boolean isRecoverable;
                isRecoverable = ((com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity) obj2).isRecoverable();
                return java.lang.Boolean.valueOf(isRecoverable);
            }
        }, null, new com.paypal.oslo.feature.inappcheckout.data.repository.EConsentRepositoryImpl$approveElectronicConsent$2.AnonymousClass2(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, null), this, 10, null);
        return retryEither$default == coroutine_suspended ? coroutine_suspended : retryEither$default;
    }

    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n"}, d2 = {"<anonymous>", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/EConsentXOResponse;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.data.repository.EConsentRepositoryImpl$approveElectronicConsent$2$2", f = "EConsentRepositoryImpl.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.inappcheckout.data.repository.EConsentRepositoryImpl$approveElectronicConsent$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, ? extends com.paypal.oslo.feature.inappcheckout.domain.entity.EConsentXOResponse>>, java.lang.Object> {
        final /* synthetic */ com.paypal.oslo.feature.inappcheckout.data.repository.EConsentRepositoryImpl Camera2StreamConfigurationMap;
        final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRangesFor;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object Camera2StreamConfigurationMap;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRangesFor;
            if (i != 0) {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return obj;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRangesFor = 1;
            Camera2StreamConfigurationMap = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap(this.getHighResolutionOutputSizeshNQ4ISI, this);
            return Camera2StreamConfigurationMap == coroutine_suspended ? coroutine_suspended : Camera2StreamConfigurationMap;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, ? extends com.paypal.oslo.feature.inappcheckout.domain.entity.EConsentXOResponse>> continuation) {
            return ((com.paypal.oslo.feature.inappcheckout.data.repository.EConsentRepositoryImpl$approveElectronicConsent$2.AnonymousClass2) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.oslo.feature.inappcheckout.data.repository.EConsentRepositoryImpl$approveElectronicConsent$2.AnonymousClass2(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(com.paypal.oslo.feature.inappcheckout.data.repository.EConsentRepositoryImpl eConsentRepositoryImpl, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.data.repository.EConsentRepositoryImpl$approveElectronicConsent$2.AnonymousClass2> continuation) {
            super(1, continuation);
            this.Camera2StreamConfigurationMap = eConsentRepositoryImpl;
            this.getHighResolutionOutputSizeshNQ4ISI = str;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, ? extends com.paypal.oslo.feature.inappcheckout.domain.entity.EConsentXOResponse>> continuation) {
        return ((com.paypal.oslo.feature.inappcheckout.data.repository.EConsentRepositoryImpl$approveElectronicConsent$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.inappcheckout.data.repository.EConsentRepositoryImpl$approveElectronicConsent$2(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EConsentRepositoryImpl$approveElectronicConsent$2(com.paypal.oslo.feature.inappcheckout.data.repository.EConsentRepositoryImpl eConsentRepositoryImpl, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.data.repository.EConsentRepositoryImpl$approveElectronicConsent$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = eConsentRepositoryImpl;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }
}
