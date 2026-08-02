package com.zettle.sdk.feature.taptopay.core.transaction.usecase;

@kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.feature.taptopay.core.transaction.usecase.ReinitialiseUseCaseImpl$invoke$1", f = "ReinitialiseUseCase.kt", i = {}, l = {25}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class ReinitialiseUseCaseImpl$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.zettle.sdk.feature.taptopay.core.transaction.usecase.ReinitialiseUseCaseImpl Camera2StreamConfigurationMap;
    final /* synthetic */ com.zettle.sdk.feature.taptopay.core.models.ConfigurationInit getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.zettle.sdk.feature.taptopay.core.transaction.usecase.ReinitialiseUseCase.Result, kotlin.Unit> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.feature.taptopay.core.transaction.usecase.ReinitialiseUseCaseImpl$invoke$1$1", f = "ReinitialiseUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.zettle.sdk.feature.taptopay.core.transaction.usecase.ReinitialiseUseCaseImpl$invoke$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
        final /* synthetic */ com.zettle.sdk.feature.taptopay.core.models.ConfigurationInit Camera2StreamConfigurationMap;
        final /* synthetic */ com.zettle.sdk.feature.taptopay.core.transaction.usecase.ReinitialiseUseCaseImpl getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy softspaceProxy;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoSizes != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            softspaceProxy = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes;
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(softspaceProxy.init(this.Camera2StreamConfigurationMap));
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
            return ((com.zettle.sdk.feature.taptopay.core.transaction.usecase.ReinitialiseUseCaseImpl$invoke$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.zettle.sdk.feature.taptopay.core.transaction.usecase.ReinitialiseUseCaseImpl$invoke$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.zettle.sdk.feature.taptopay.core.transaction.usecase.ReinitialiseUseCaseImpl reinitialiseUseCaseImpl, com.zettle.sdk.feature.taptopay.core.models.ConfigurationInit configurationInit, kotlin.coroutines.Continuation<? super com.zettle.sdk.feature.taptopay.core.transaction.usecase.ReinitialiseUseCaseImpl$invoke$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRangesFor = reinitialiseUseCaseImpl;
            this.Camera2StreamConfigurationMap = configurationInit;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes = 1;
            obj = kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new com.zettle.sdk.feature.taptopay.core.transaction.usecase.ReinitialiseUseCaseImpl$invoke$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            this.getHighSpeedVideoFpsRanges.invoke(com.zettle.sdk.feature.taptopay.core.transaction.usecase.ReinitialiseUseCase.Result.Success.INSTANCE);
        } else {
            this.getHighSpeedVideoFpsRanges.invoke(com.zettle.sdk.feature.taptopay.core.transaction.usecase.ReinitialiseUseCase.Result.Failed.INSTANCE);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.zettle.sdk.feature.taptopay.core.transaction.usecase.ReinitialiseUseCaseImpl$invoke$1) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new com.zettle.sdk.feature.taptopay.core.transaction.usecase.ReinitialiseUseCaseImpl$invoke$1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ReinitialiseUseCaseImpl$invoke$1(kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.transaction.usecase.ReinitialiseUseCase.Result, kotlin.Unit> function1, com.zettle.sdk.feature.taptopay.core.transaction.usecase.ReinitialiseUseCaseImpl reinitialiseUseCaseImpl, com.zettle.sdk.feature.taptopay.core.models.ConfigurationInit configurationInit, kotlin.coroutines.Continuation<? super com.zettle.sdk.feature.taptopay.core.transaction.usecase.ReinitialiseUseCaseImpl$invoke$1> continuation) {
        super(1, continuation);
        this.getHighSpeedVideoFpsRanges = function1;
        this.Camera2StreamConfigurationMap = reinitialiseUseCaseImpl;
        this.getHighResolutionOutputSizeshNQ4ISI = configurationInit;
    }
}
