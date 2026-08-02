package com.paypal.oslo.feature.ads.data.repository;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/paypal/oslo/feature/ads/domain/model/AdData;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.ads.data.repository.AdRepositoryImpl$getAdData$2", f = "AdRepositoryImpl.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, nl = {60}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class AdRepositoryImpl$getAdData$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.ads.domain.model.AdData>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ int getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.ads.data.repository.AdRepositoryImpl getOutputFormats;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.ads.domain.model.AdData highResolutionOutputSizeshNQ4ISI;
        com.paypal.oslo.feature.ads.data.repository.ol.AdProviderDataSource adProviderDataSource;
        com.paypal.oslo.core.appidentity.domain.AppInformation appInformation;
        java.lang.Object mo11971getAdsBWLJW6A;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDuration;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                adProviderDataSource = this.getOutputFormats.getHighSpeedVideoFpsRangesFor;
                appInformation = this.getOutputFormats.getHighSpeedVideoFpsRanges;
                this.getOutputMinFrameDuration = 1;
                mo11971getAdsBWLJW6A = adProviderDataSource.mo11971getAdsBWLJW6A(appInformation.getAppVersion(), "OSLO", this.Camera2StreamConfigurationMap, this);
                if (mo11971getAdsBWLJW6A == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                mo11971getAdsBWLJW6A = ((kotlin.Result) obj).getCamera2StreamConfigurationMap();
            }
            return com.paypal.oslo.feature.ads.data.repository.AdRepositoryImpl.access$handleAdResponse(this.getOutputFormats, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, mo11971getAdsBWLJW6A, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor);
        } catch (java.lang.Exception e) {
            highResolutionOutputSizeshNQ4ISI = this.getOutputFormats.getHighResolutionOutputSizeshNQ4ISI(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, e, this.getHighSpeedVideoFpsRangesFor);
            return highResolutionOutputSizeshNQ4ISI;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.ads.domain.model.AdData> continuation) {
        return ((com.paypal.oslo.feature.ads.data.repository.AdRepositoryImpl$getAdData$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.ads.data.repository.AdRepositoryImpl$getAdData$2(this.getOutputFormats, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdRepositoryImpl$getAdData$2(com.paypal.oslo.feature.ads.data.repository.AdRepositoryImpl adRepositoryImpl, java.lang.String str, java.lang.String str2, int i, int i2, java.lang.String str3, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.ads.data.repository.AdRepositoryImpl$getAdData$2> continuation) {
        super(2, continuation);
        this.getOutputFormats = adRepositoryImpl;
        this.Camera2StreamConfigurationMap = str;
        this.getHighResolutionOutputSizeshNQ4ISI = str2;
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighSpeedVideoSizes = i2;
        this.getHighSpeedVideoFpsRangesFor = str3;
    }
}
