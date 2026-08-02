package com.paypal.oslo.feature.taptopay.data.sdk;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/taptopay/domain/sdk/SdkInitializationError;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.sdk.CompositeSdkInitializer$init$2$payairDeferred$1", f = "CompositeSdkInitializer.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class CompositeSdkInitializer$init$2$payairDeferred$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializationError, ? extends kotlin.Unit>>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.sdk.CompositeSdkInitializer getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.Class<? extends android.app.Activity> getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n"}, d2 = {"<anonymous>", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/taptopay/domain/sdk/SdkInitializationError;", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.sdk.CompositeSdkInitializer$init$2$payairDeferred$1$1", f = "CompositeSdkInitializer.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.taptopay.data.sdk.CompositeSdkInitializer$init$2$payairDeferred$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializationError, ? extends kotlin.Unit>>, java.lang.Object> {
        final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
        final /* synthetic */ java.lang.Class<? extends android.app.Activity> getHighSpeedVideoFpsRanges;
        final /* synthetic */ com.paypal.oslo.feature.taptopay.data.sdk.CompositeSdkInitializer getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            javax.inject.Provider provider;
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
            provider = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoSizes = 1;
            java.lang.Object init = ((com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializer) provider.get()).init(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this);
            return init == coroutine_suspended ? coroutine_suspended : init;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializationError, ? extends kotlin.Unit>> continuation) {
            return ((com.paypal.oslo.feature.taptopay.data.sdk.CompositeSdkInitializer$init$2$payairDeferred$1.AnonymousClass1) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.oslo.feature.taptopay.data.sdk.CompositeSdkInitializer$init$2$payairDeferred$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.feature.taptopay.data.sdk.CompositeSdkInitializer compositeSdkInitializer, java.lang.Class<? extends android.app.Activity> cls, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.sdk.CompositeSdkInitializer$init$2$payairDeferred$1.AnonymousClass1> continuation) {
            super(1, continuation);
            this.getHighSpeedVideoFpsRangesFor = compositeSdkInitializer;
            this.getHighSpeedVideoFpsRanges = cls;
            this.Camera2StreamConfigurationMap = str;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
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
        Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap(new com.paypal.oslo.feature.taptopay.data.sdk.CompositeSdkInitializer$init$2$payairDeferred$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, null), this);
        return Camera2StreamConfigurationMap == coroutine_suspended ? coroutine_suspended : Camera2StreamConfigurationMap;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializationError, ? extends kotlin.Unit>> continuation) {
        return ((com.paypal.oslo.feature.taptopay.data.sdk.CompositeSdkInitializer$init$2$payairDeferred$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taptopay.data.sdk.CompositeSdkInitializer$init$2$payairDeferred$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CompositeSdkInitializer$init$2$payairDeferred$1(com.paypal.oslo.feature.taptopay.data.sdk.CompositeSdkInitializer compositeSdkInitializer, java.lang.Class<? extends android.app.Activity> cls, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.sdk.CompositeSdkInitializer$init$2$payairDeferred$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = compositeSdkInitializer;
        this.getHighSpeedVideoSizes = cls;
        this.Camera2StreamConfigurationMap = str;
    }
}
