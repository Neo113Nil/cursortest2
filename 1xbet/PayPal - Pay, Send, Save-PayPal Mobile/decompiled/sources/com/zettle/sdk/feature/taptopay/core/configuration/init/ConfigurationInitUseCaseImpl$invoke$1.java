package com.zettle.sdk.feature.taptopay.core.configuration.init;

@kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitUseCaseImpl$invoke$1", f = "ConfigurationInitUsecase.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class ConfigurationInitUseCaseImpl$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitUseCaseImpl getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitUsecase.Result, kotlin.Unit> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitFailedAnalyticsUseCase configurationInitFailedAnalyticsUseCase;
        com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepository configurationInitRepository;
        com.zettle.sdk.feature.taptopay.core.configuration.HerdAnalytics herdAnalytics;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
            if (str != null && str.length() != 0) {
                configurationInitRepository = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes;
                kotlinx.coroutines.flow.Flow<com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepository.Result> configurationInit = configurationInitRepository.getConfigurationInit(this.getHighSpeedVideoFpsRangesFor);
                herdAnalytics = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
                herdAnalytics.start();
                final com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitUseCaseImpl configurationInitUseCaseImpl = this.getHighSpeedVideoFpsRanges;
                final kotlin.jvm.functions.Function1<com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitUsecase.Result, kotlin.Unit> function1 = this.getHighSpeedVideoSizes;
                final java.lang.String str2 = this.getHighSpeedVideoFpsRangesFor;
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                if (configurationInit.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitUseCaseImpl$invoke$1.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                    public final java.lang.Object emit(com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepository.Result result, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        com.zettle.sdk.feature.taptopay.core.configuration.HerdAnalytics herdAnalytics2;
                        com.zettle.sdk.feature.taptopay.core.configuration.HerdAnalytics herdAnalytics3;
                        com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitFailedAnalyticsUseCase configurationInitFailedAnalyticsUseCase2;
                        if (result instanceof com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepository.Result.Failed) {
                            com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepository.Result.Failed failed = (com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepository.Result.Failed) result;
                            java.lang.String obj2 = failed.getReason().toString();
                            herdAnalytics3 = com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitUseCaseImpl.this.getHighSpeedVideoFpsRangesFor;
                            herdAnalytics3.failed(obj2);
                            configurationInitFailedAnalyticsUseCase2 = com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitUseCaseImpl.this.Camera2StreamConfigurationMap;
                            configurationInitFailedAnalyticsUseCase2.invoke(obj2);
                            function1.invoke(new com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitUsecase.Result.Failed(failed.getReason()));
                        } else if (result instanceof com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepository.Result.Success) {
                            com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepository.Result.Success success = (com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepository.Result.Success) result;
                            if (!success.getIsCache()) {
                                herdAnalytics2 = com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitUseCaseImpl.this.getHighSpeedVideoFpsRangesFor;
                                herdAnalytics2.success();
                            }
                            function1.invoke(new com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitUsecase.Result.Success(str2, com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitUsecaseKt.access$mapToLocalConfigurationInit(success.getConfigurationInit())));
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                com.zettle.sdk.feature.taptopay.core.FailureReason.AuthStateNotSupported authStateNotSupported = com.zettle.sdk.feature.taptopay.core.FailureReason.AuthStateNotSupported.INSTANCE;
                configurationInitFailedAnalyticsUseCase = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap;
                configurationInitFailedAnalyticsUseCase.invoke(authStateNotSupported.toString());
                this.getHighSpeedVideoSizes.invoke(new com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitUsecase.Result.Failed(authStateNotSupported));
                return kotlin.Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitUseCaseImpl$invoke$1) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitUseCaseImpl$invoke$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ConfigurationInitUseCaseImpl$invoke$1(java.lang.String str, com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitUseCaseImpl configurationInitUseCaseImpl, kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitUsecase.Result, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitUseCaseImpl$invoke$1> continuation) {
        super(1, continuation);
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoFpsRanges = configurationInitUseCaseImpl;
        this.getHighSpeedVideoSizes = function1;
    }
}
