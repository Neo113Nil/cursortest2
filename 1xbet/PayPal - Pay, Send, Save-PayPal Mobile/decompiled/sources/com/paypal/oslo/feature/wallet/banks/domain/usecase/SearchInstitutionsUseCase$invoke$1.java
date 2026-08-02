package com.paypal.oslo.feature.wallet.banks.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.domain.usecase.SearchInstitutionsUseCase", f = "SearchInstitutionsUseCase.kt", i = {0, 0, 0, 0}, l = {67}, m = "invoke", n = {"aggregatorName", "searchQuery", "params", "maxResults"}, nl = {68}, s = {"L$0", "L$1", "L$2", "I$0"}, v = 2)
/* loaded from: classes15.dex */
final class SearchInstitutionsUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.usecase.SearchInstitutionsUseCase getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getOutputFormats.invoke(null, null, 0, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchInstitutionsUseCase$invoke$1(com.paypal.oslo.feature.wallet.banks.domain.usecase.SearchInstitutionsUseCase searchInstitutionsUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.domain.usecase.SearchInstitutionsUseCase$invoke$1> continuation) {
        super(continuation);
        this.getOutputFormats = searchInstitutionsUseCase;
    }
}
