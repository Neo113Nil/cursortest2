package com.apollographql.apollo.cache.normalized.internal;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore", f = "DefaultApolloStore.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE}, m = "rollbackOptimisticUpdates", n = {"changedKeys"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class DefaultApolloStore$rollbackOptimisticUpdates$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.rollbackOptimisticUpdates(null, false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultApolloStore$rollbackOptimisticUpdates$1(com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore defaultApolloStore, kotlin.coroutines.Continuation<? super com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore$rollbackOptimisticUpdates$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = defaultApolloStore;
    }
}
