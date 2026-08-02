package com.paypal.oslo.feature.shoppingrewards.shared.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.shared.data.repository.BaseRepository", f = "BaseRepository.kt", i = {0, 0, 0, 0}, l = {207}, m = "fetchData", n = {"$this$fetchData", "mutation", "mapper", "networkMapper"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOME_VALUE}, s = {"L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes15.dex */
final class BaseRepository$fetchData$4<M extends kotlin.jvm.functions.Function1<? super D, ? extends R>, R, D extends com.apollographql.apollo.api.Mutation.Data> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shared.data.repository.BaseRepository getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizesFor.fetchData(null, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseRepository$fetchData$4(com.paypal.oslo.feature.shoppingrewards.shared.data.repository.BaseRepository baseRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.data.repository.BaseRepository$fetchData$4> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = baseRepository;
    }
}
