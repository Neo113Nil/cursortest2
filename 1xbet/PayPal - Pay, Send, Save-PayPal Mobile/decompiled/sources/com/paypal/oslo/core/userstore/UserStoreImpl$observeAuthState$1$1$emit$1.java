package com.paypal.oslo.core.userstore;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.userstore.UserStoreImpl$observeAuthState$1$1", f = "UserStoreImpl.kt", i = {0, 1, 2}, l = {113, 117, 120}, m = "emit", n = {"tokenState", "tokenState", "tokenState"}, nl = {134, 118, 121}, s = {"L$0", "L$0", "L$0"}, v = 2)
/* loaded from: classes5.dex */
final class UserStoreImpl$observeAuthState$1$1$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.userstore.UserStoreImpl$observeAuthState$1.AnonymousClass1<T> getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.emit(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    UserStoreImpl$observeAuthState$1$1$emit$1(com.paypal.oslo.core.userstore.UserStoreImpl$observeAuthState$1.AnonymousClass1<? super T> anonymousClass1, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.userstore.UserStoreImpl$observeAuthState$1$1$emit$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = anonymousClass1;
    }
}
