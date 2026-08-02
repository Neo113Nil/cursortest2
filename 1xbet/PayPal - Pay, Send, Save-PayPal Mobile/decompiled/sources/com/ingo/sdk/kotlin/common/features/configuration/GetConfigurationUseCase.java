package com.ingo.sdk.kotlin.common.features.configuration;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\t\u0010\nR\u0015\u0010\u000e\u001a\u00020\u000b8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/configuration/GetConfigurationUseCase;", "Lcom/ingo/sdk/kotlin/common/core/interactor/SdkUseCase;", "Lcom/ingo/sdk/kotlin/common/features/configuration/model/ConfigurationResponse;", "Lcom/ingo/sdk/kotlin/common/core/interactor/UseCase$None;", "<init>", "()V", "params", "Lcom/ingo/sdk/kotlin/common/core/functional/Either;", "Lcom/ingo/sdk/kotlin/common/core/exception/Failure;", "run", "(Lcom/ingo/sdk/kotlin/common/core/interactor/UseCase$None;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ingo/sdk/kotlin/common/features/configuration/ConfigurationRepository;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/Lazy;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class GetConfigurationUseCase extends com.ingo.sdk.kotlin.common.core.interactor.SdkUseCase<com.ingo.sdk.kotlin.common.features.configuration.model.ConfigurationResponse, com.ingo.sdk.kotlin.common.core.interactor.UseCase.None> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoSizes;

    public GetConfigurationUseCase() {
        super(0L, 1, null);
        this.getHighSpeedVideoSizes = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.kotlin.common.features.configuration.GetConfigurationUseCase$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.ingo.sdk.kotlin.common.features.configuration.GetConfigurationUseCase.$r8$lambda$4Edn_mHhW31WtmpKxssHoncJnVI();
            }
        });
    }

    @Override // com.ingo.sdk.kotlin.common.core.interactor.UseCase
    public final /* bridge */ /* synthetic */ java.lang.Object run(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return run((com.ingo.sdk.kotlin.common.core.interactor.UseCase.None) obj, (kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.functional.Either<? extends com.ingo.sdk.kotlin.common.core.exception.Failure, com.ingo.sdk.kotlin.common.features.configuration.model.ConfigurationResponse>>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object run(com.ingo.sdk.kotlin.common.core.interactor.UseCase.None none, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.functional.Either<? extends com.ingo.sdk.kotlin.common.core.exception.Failure, com.ingo.sdk.kotlin.common.features.configuration.model.ConfigurationResponse>> continuation) {
        com.ingo.sdk.kotlin.common.features.configuration.GetConfigurationUseCase$run$1 getConfigurationUseCase$run$1;
        int i;
        if (continuation instanceof com.ingo.sdk.kotlin.common.features.configuration.GetConfigurationUseCase$run$1) {
            getConfigurationUseCase$run$1 = (com.ingo.sdk.kotlin.common.features.configuration.GetConfigurationUseCase$run$1) continuation;
            if ((getConfigurationUseCase$run$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                getConfigurationUseCase$run$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = getConfigurationUseCase$run$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getConfigurationUseCase$run$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.ingo.sdk.kotlin.common.features.configuration.ConfigurationRepository configurationRepository = (com.ingo.sdk.kotlin.common.features.configuration.ConfigurationRepository) this.getHighSpeedVideoSizes.getValue();
                    getConfigurationUseCase$run$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = configurationRepository.getConfiguration(getConfigurationUseCase$run$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.ingo.sdk.kotlin.common.core.functional.Either either = (com.ingo.sdk.kotlin.common.core.functional.Either) obj;
                either.foldNothing(new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.kotlin.common.features.configuration.GetConfigurationUseCase$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.ingo.sdk.kotlin.common.features.configuration.GetConfigurationUseCase.$r8$lambda$wH9NTT6HyHcrYtnfzzUljgWa9m0((com.ingo.sdk.kotlin.common.core.exception.Failure) obj2);
                    }
                }, new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.kotlin.common.features.configuration.GetConfigurationUseCase$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.ingo.sdk.kotlin.common.features.configuration.GetConfigurationUseCase.$r8$lambda$ngdkl1IZ9e_VDV8iNKrrHOXTd14((com.ingo.sdk.kotlin.common.features.configuration.model.ConfigurationResponse) obj2);
                    }
                });
                return either;
            }
        }
        getConfigurationUseCase$run$1 = new com.ingo.sdk.kotlin.common.features.configuration.GetConfigurationUseCase$run$1(this, continuation);
        java.lang.Object obj2 = getConfigurationUseCase$run$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getConfigurationUseCase$run$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        com.ingo.sdk.kotlin.common.core.functional.Either either2 = (com.ingo.sdk.kotlin.common.core.functional.Either) obj2;
        either2.foldNothing(new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.kotlin.common.features.configuration.GetConfigurationUseCase$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj22) {
                return com.ingo.sdk.kotlin.common.features.configuration.GetConfigurationUseCase.$r8$lambda$wH9NTT6HyHcrYtnfzzUljgWa9m0((com.ingo.sdk.kotlin.common.core.exception.Failure) obj22);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.kotlin.common.features.configuration.GetConfigurationUseCase$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj22) {
                return com.ingo.sdk.kotlin.common.features.configuration.GetConfigurationUseCase.$r8$lambda$ngdkl1IZ9e_VDV8iNKrrHOXTd14((com.ingo.sdk.kotlin.common.features.configuration.model.ConfigurationResponse) obj22);
            }
        });
        return either2;
    }

    public static /* synthetic */ com.ingo.sdk.kotlin.common.features.configuration.ConfigurationRepository $r8$lambda$4Edn_mHhW31WtmpKxssHoncJnVI() {
        java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.features.configuration.ConfigurationRepository.class));
        if (obj != null) {
            return (com.ingo.sdk.kotlin.common.features.configuration.ConfigurationRepository) obj;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.features.configuration.ConfigurationRepository");
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ngdkl1IZ9e_VDV8iNKrrHOXTd14(com.ingo.sdk.kotlin.common.features.configuration.model.ConfigurationResponse configurationResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configurationResponse, "");
        java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.ux.IngoUxState.class));
        if (obj == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.ux.IngoUxState");
        }
        ((com.ingo.sdk.kotlin.ux.IngoUxState) obj).getSessionMap().put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.features.configuration.model.ConfigurationResponse.class), configurationResponse);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wH9NTT6HyHcrYtnfzzUljgWa9m0(com.ingo.sdk.kotlin.common.core.exception.Failure failure) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failure, "");
        com.ingo.sdk.kotlin.common.core.logging.IngoLogger ingoLogging = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging();
        java.lang.String getHighSpeedVideoFpsRangesFor = failure.getGetHighSpeedVideoFpsRangesFor();
        if (getHighSpeedVideoFpsRangesFor == null) {
            getHighSpeedVideoFpsRangesFor = "";
        }
        com.ingo.sdk.kotlin.common.core.logging.IngoLogger.e$default(ingoLogging, getHighSpeedVideoFpsRangesFor, null, failure instanceof com.ingo.sdk.kotlin.common.core.exception.ThrowableFailure ? ((com.ingo.sdk.kotlin.common.core.exception.ThrowableFailure) failure).getThrowable() : null, 2, null);
        return kotlin.Unit.INSTANCE;
    }
}
