package com.apollographql.apollo.cache.normalized.internal;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore", f = "DefaultApolloStore.kt", i = {0}, l = {236}, m = "writeOptimisticUpdates", n = {"changedKeys"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class DefaultApolloStore$writeOptimisticUpdates$1<D extends com.apollographql.apollo.api.Operation.Data> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.writeOptimisticUpdates(null, null, null, null, false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultApolloStore$writeOptimisticUpdates$1(com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore defaultApolloStore, kotlin.coroutines.Continuation<? super com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore$writeOptimisticUpdates$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = defaultApolloStore;
    }
}
