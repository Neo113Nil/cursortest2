package com.ingo.sdk.kotlin.common.core.interactor;

/* JADX INFO: Add missing generic type declarations: [Type] */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\n\b\u0000\u0010\u0003 \u0001*\u00020\u0004*\u00020\u0005H\n"}, d2 = {"<anonymous>", "Lcom/ingo/sdk/kotlin/common/core/functional/Either;", "Lcom/ingo/sdk/kotlin/common/core/exception/Failure;", com.miteksystems.misnap.core.MibiData.KEY_MICROPHONE_TYPE, "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ingo.sdk.kotlin.common.core.interactor.UseCase$invoke$2$job$1", f = "UseCase.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class UseCase$invoke$2$job$1<Type> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.functional.Either<? extends com.ingo.sdk.kotlin.common.core.exception.Failure, ? extends Type>>, java.lang.Object> {
    final /* synthetic */ Params Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.ingo.sdk.kotlin.common.core.interactor.UseCase<Type, Params> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String valueOf;
        com.ingo.sdk.kotlin.common.core.functional.Either.Left access$onUseCaseException;
        java.lang.String valueOf2;
        java.lang.String valueOf3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        try {
            try {
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.getHighSpeedVideoFpsRangesFor = 1;
                    obj = kotlinx.coroutines.TimeoutKt.withTimeout(this.getHighSpeedVideoSizes.getScopeTimeout(), new com.ingo.sdk.kotlin.common.core.interactor.UseCase$invoke$2$job$1.AnonymousClass1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, null), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                access$onUseCaseException = (com.ingo.sdk.kotlin.common.core.functional.Either) obj;
            } catch (java.util.concurrent.CancellationException e) {
                com.ingo.sdk.kotlin.common.core.logging.IngoLogger ingoLogging = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging();
                com.ingo.sdk.kotlin.common.core.interactor.UseCase<Type, Params> useCase = this.getHighSpeedVideoSizes;
                valueOf2 = java.lang.String.valueOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.core.interactor.UseCase.class).getSimpleName());
                ingoLogging.e(valueOf2, "Use Case Exception", e);
                access$onUseCaseException = com.ingo.sdk.kotlin.common.core.interactor.UseCase.access$onCancellationException(this.getHighSpeedVideoSizes, e);
            } catch (java.lang.Exception e2) {
                com.ingo.sdk.kotlin.common.core.logging.IngoLogger ingoLogging2 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging();
                com.ingo.sdk.kotlin.common.core.interactor.UseCase<Type, Params> useCase2 = this.getHighSpeedVideoSizes;
                valueOf = java.lang.String.valueOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.core.interactor.UseCase.class).getSimpleName());
                ingoLogging2.e(valueOf, "Use Case Timeout", e2);
                access$onUseCaseException = com.ingo.sdk.kotlin.common.core.interactor.UseCase.access$onUseCaseException(this.getHighSpeedVideoSizes, e2);
            }
            return access$onUseCaseException;
        } finally {
            com.ingo.sdk.kotlin.common.core.logging.IngoLogger ingoLogging3 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging();
            com.ingo.sdk.kotlin.common.core.interactor.UseCase<Type, Params> useCase3 = this.getHighSpeedVideoSizes;
            valueOf3 = java.lang.String.valueOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.core.interactor.UseCase.class).getSimpleName());
            ingoLogging3.d(valueOf3, "A Use Case Completed");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\n\b\u0000\u0010\u0003 \u0001*\u00020\u0004*\u00020\u0005H\n"}, d2 = {"<anonymous>", "Lcom/ingo/sdk/kotlin/common/core/functional/Either;", "Lcom/ingo/sdk/kotlin/common/core/exception/Failure;", com.miteksystems.misnap.core.MibiData.KEY_MICROPHONE_TYPE, "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ingo.sdk.kotlin.common.core.interactor.UseCase$invoke$2$job$1$1", f = "UseCase.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ingo.sdk.kotlin.common.core.interactor.UseCase$invoke$2$job$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.functional.Either<? extends com.ingo.sdk.kotlin.common.core.exception.Failure, ? extends Type>>, java.lang.Object> {
        int Camera2StreamConfigurationMap;
        final /* synthetic */ Params getHighSpeedVideoFpsRanges;
        final /* synthetic */ com.ingo.sdk.kotlin.common.core.interactor.UseCase<Type, Params> getHighSpeedVideoFpsRangesFor;

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
            this.Camera2StreamConfigurationMap = 1;
            java.lang.Object run = this.getHighSpeedVideoFpsRangesFor.run(this.getHighSpeedVideoFpsRanges, this);
            return run == coroutine_suspended ? coroutine_suspended : run;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.Object obj) {
            return ((com.ingo.sdk.kotlin.common.core.interactor.UseCase$invoke$2$job$1.AnonymousClass1) create(coroutineScope, (kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.ingo.sdk.kotlin.common.core.interactor.UseCase$invoke$2$job$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(com.ingo.sdk.kotlin.common.core.interactor.UseCase<? extends Type, ? super Params> useCase, Params params, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.interactor.UseCase$invoke$2$job$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRangesFor = useCase;
            this.getHighSpeedVideoFpsRanges = params;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.Object obj) {
        return ((com.ingo.sdk.kotlin.common.core.interactor.UseCase$invoke$2$job$1) create(coroutineScope, (kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.ingo.sdk.kotlin.common.core.interactor.UseCase$invoke$2$job$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    UseCase$invoke$2$job$1(com.ingo.sdk.kotlin.common.core.interactor.UseCase<? extends Type, ? super Params> useCase, Params params, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.interactor.UseCase$invoke$2$job$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = useCase;
        this.Camera2StreamConfigurationMap = params;
    }
}
