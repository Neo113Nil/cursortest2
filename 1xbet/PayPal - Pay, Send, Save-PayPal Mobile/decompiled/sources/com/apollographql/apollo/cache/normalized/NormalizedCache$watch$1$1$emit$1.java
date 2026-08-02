package com.apollographql.apollo.cache.normalized;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.cache.normalized.NormalizedCache$watch$1$1", f = "ClientCacheExtensions.kt", i = {0}, l = {181, 193}, m = "emit", n = {"it"}, s = {"L$0"})
/* loaded from: classes7.dex */
final class NormalizedCache$watch$1$1$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.apollographql.apollo.cache.normalized.NormalizedCache$watch$1.AnonymousClass1<T> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.emit(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    NormalizedCache$watch$1$1$emit$1(com.apollographql.apollo.cache.normalized.NormalizedCache$watch$1.AnonymousClass1<? super T> anonymousClass1, kotlin.coroutines.Continuation<? super com.apollographql.apollo.cache.normalized.NormalizedCache$watch$1$1$emit$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = anonymousClass1;
    }
}
