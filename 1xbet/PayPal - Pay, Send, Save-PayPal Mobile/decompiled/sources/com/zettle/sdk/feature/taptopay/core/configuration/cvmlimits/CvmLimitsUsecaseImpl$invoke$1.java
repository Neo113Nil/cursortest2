package com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits;

@kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsUsecaseImpl$invoke$1", f = "CvmLimitsUsecase.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class CvmLimitsUsecaseImpl$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsUsecase.Result, kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsUsecaseImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsRepository cvmLimitsRepository;
        com.zettle.sdk.feature.taptopay.core.configuration.HerdAnalytics herdAnalytics;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            cvmLimitsRepository = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
            kotlinx.coroutines.flow.Flow<com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsRepository.Result> cvmLimits = cvmLimitsRepository.getCvmLimits(this.getHighResolutionOutputSizeshNQ4ISI);
            herdAnalytics = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes;
            herdAnalytics.start();
            final com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsUsecaseImpl cvmLimitsUsecaseImpl = this.getHighSpeedVideoSizes;
            final kotlin.jvm.functions.Function1<com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsUsecase.Result, kotlin.Unit> function1 = this.getHighSpeedVideoFpsRanges;
            this.Camera2StreamConfigurationMap = 1;
            if (cvmLimits.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsUsecaseImpl$invoke$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                public final java.lang.Object emit(com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsRepository.Result result, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    com.zettle.sdk.feature.taptopay.core.configuration.HerdAnalytics herdAnalytics2;
                    com.zettle.sdk.feature.taptopay.core.configuration.HerdAnalytics herdAnalytics3;
                    if (result instanceof com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsRepository.Result.Failed) {
                        herdAnalytics3 = com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsUsecaseImpl.this.getHighSpeedVideoSizes;
                        com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsRepository.Result.Failed failed = (com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsRepository.Result.Failed) result;
                        herdAnalytics3.failed(failed.getReason().toString());
                        function1.invoke(new com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsUsecase.Result.Failed(failed.getReason()));
                    } else if (result instanceof com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsRepository.Result.Success) {
                        com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsRepository.Result.Success success = (com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsRepository.Result.Success) result;
                        if (!success.getIsCache()) {
                            herdAnalytics2 = com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsUsecaseImpl.this.getHighSpeedVideoSizes;
                            herdAnalytics2.success();
                        }
                        function1.invoke(new com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsUsecase.Result.Success(com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsUsecaseImpl.getHighSpeedVideoFpsRangesFor(com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsUsecaseImpl.this, success.getCvmLimits())));
                    }
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

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsUsecaseImpl$invoke$1) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsUsecaseImpl$invoke$1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CvmLimitsUsecaseImpl$invoke$1(com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsUsecaseImpl cvmLimitsUsecaseImpl, java.lang.String str, kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsUsecase.Result, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsUsecaseImpl$invoke$1> continuation) {
        super(1, continuation);
        this.getHighSpeedVideoSizes = cvmLimitsUsecaseImpl;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRanges = function1;
    }
}
