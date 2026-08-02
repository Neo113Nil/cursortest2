package com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/zettle/sdk/feature/taptopay/core/configuration/cvmlimits/CvmLimitsRepository$Result;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsRepositoryImpl$getCvmLimits$1", f = "CvmLimitsRepository.kt", i = {0, 1}, l = {47, 49, 51}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes17.dex */
final class CvmLimitsRepositoryImpl$getCvmLimits$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsRepository.Result>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsRepositoryImpl getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0072, code lost:
    
        if (r1.emit(r7, r6) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        if (r7 != r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        if (r7 != r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.FlowCollector flowCollector;
        boolean has;
        com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsRepository.Result result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighResolutionOutputSizeshNQ4ISI;
            has = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor.has(this.getHighSpeedVideoFpsRanges, "cachingCvmLimits");
            if (!has) {
                this.getHighResolutionOutputSizeshNQ4ISI = flowCollector;
                this.getHighSpeedVideoFpsRangesFor = 2;
                obj = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges, this);
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI = flowCollector;
                this.getHighSpeedVideoFpsRangesFor = 1;
                obj = com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsRepositoryImpl.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this);
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
            result = (com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsRepository.Result) obj;
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
            result = (com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsRepository.Result) obj;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getHighSpeedVideoFpsRangesFor = 3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsRepository.Result> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsRepositoryImpl$getCvmLimits$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsRepositoryImpl$getCvmLimits$1 cvmLimitsRepositoryImpl$getCvmLimits$1 = new com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsRepositoryImpl$getCvmLimits$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
        cvmLimitsRepositoryImpl$getCvmLimits$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return cvmLimitsRepositoryImpl$getCvmLimits$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CvmLimitsRepositoryImpl$getCvmLimits$1(com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsRepositoryImpl cvmLimitsRepositoryImpl, java.lang.String str, kotlin.coroutines.Continuation<? super com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsRepositoryImpl$getCvmLimits$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = cvmLimitsRepositoryImpl;
        this.getHighSpeedVideoFpsRanges = str;
    }
}
