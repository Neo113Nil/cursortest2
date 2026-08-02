package com.apollographql.apollo.cache.normalized;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.cache.normalized.NormalizedCache$watch$1$2", f = "ClientCacheExtensions.kt", i = {}, l = {203, 207}, m = "emit", n = {}, s = {})
/* loaded from: classes7.dex */
final class NormalizedCache$watch$1$2$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.apollographql.apollo.cache.normalized.NormalizedCache$watch$1.AnonymousClass2<T> getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.emit(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    NormalizedCache$watch$1$2$emit$1(com.apollographql.apollo.cache.normalized.NormalizedCache$watch$1.AnonymousClass2<? super T> anonymousClass2, kotlin.coroutines.Continuation<? super com.apollographql.apollo.cache.normalized.NormalizedCache$watch$1$2$emit$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = anonymousClass2;
    }
}
