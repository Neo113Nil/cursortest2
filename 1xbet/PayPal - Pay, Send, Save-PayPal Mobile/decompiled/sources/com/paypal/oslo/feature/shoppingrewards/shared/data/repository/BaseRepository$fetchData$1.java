package com.paypal.oslo.feature.shoppingrewards.shared.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.shared.data.repository.BaseRepository", f = "BaseRepository.kt", i = {0, 0, 0, 0, 0}, l = {167}, m = "fetchData", n = {"$this$fetchData", "query", "mapper", "networkMapper", "fetchPolicy"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"}, v = 2)
/* loaded from: classes15.dex */
final class BaseRepository$fetchData$1<M extends kotlin.jvm.functions.Function1<? super D, ? extends R>, R, D extends com.apollographql.apollo.api.Query.Data> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shared.data.repository.BaseRepository getInputSizeshNQ4ISI;
    int getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.fetchData(null, null, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseRepository$fetchData$1(com.paypal.oslo.feature.shoppingrewards.shared.data.repository.BaseRepository baseRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.data.repository.BaseRepository$fetchData$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = baseRepository;
    }
}
