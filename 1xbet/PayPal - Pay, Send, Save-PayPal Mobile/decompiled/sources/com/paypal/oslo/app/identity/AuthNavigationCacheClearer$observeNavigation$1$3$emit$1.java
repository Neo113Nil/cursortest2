package com.paypal.oslo.app.identity;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.app.identity.AuthNavigationCacheClearer$observeNavigation$1$3", f = "AuthNavigationCacheClearer.kt", i = {0}, l = {71}, m = "emit", n = {"it"}, nl = {72}, s = {"L$0"}, v = 2)
/* loaded from: classes4.dex */
final class AuthNavigationCacheClearer$observeNavigation$1$3$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.app.identity.AuthNavigationCacheClearer$observeNavigation$1.AnonymousClass3<T> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.emit(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AuthNavigationCacheClearer$observeNavigation$1$3$emit$1(com.paypal.oslo.app.identity.AuthNavigationCacheClearer$observeNavigation$1.AnonymousClass3<? super T> anonymousClass3, kotlin.coroutines.Continuation<? super com.paypal.oslo.app.identity.AuthNavigationCacheClearer$observeNavigation$1$3$emit$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = anonymousClass3;
    }
}
