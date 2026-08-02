package com.apollographql.apollo.cache.normalized.internal;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore", f = "DefaultApolloStore.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE}, m = "writeOperation", n = {"changedKeys"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class DefaultApolloStore$writeOperation$1<D extends com.apollographql.apollo.api.Operation.Data> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.writeOperation(null, null, null, null, false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultApolloStore$writeOperation$1(com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore defaultApolloStore, kotlin.coroutines.Continuation<? super com.apollographql.apollo.cache.normalized.internal.DefaultApolloStore$writeOperation$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = defaultApolloStore;
    }
}
