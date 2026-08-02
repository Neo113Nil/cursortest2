package com.apollographql.apollo.cache.normalized;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.cache.normalized.FetchPolicyRouterInterceptor$intercept$1$1", f = "FetchPolicyInterceptors.kt", i = {}, l = {154}, m = "emit", n = {}, s = {})
/* loaded from: classes3.dex */
final class FetchPolicyRouterInterceptor$intercept$1$1$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.apollographql.apollo.cache.normalized.FetchPolicyRouterInterceptor$intercept$1.AnonymousClass1<T> getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.emit(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FetchPolicyRouterInterceptor$intercept$1$1$emit$1(com.apollographql.apollo.cache.normalized.FetchPolicyRouterInterceptor$intercept$1.AnonymousClass1<? super T> anonymousClass1, kotlin.coroutines.Continuation<? super com.apollographql.apollo.cache.normalized.FetchPolicyRouterInterceptor$intercept$1$1$emit$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = anonymousClass1;
    }
}
