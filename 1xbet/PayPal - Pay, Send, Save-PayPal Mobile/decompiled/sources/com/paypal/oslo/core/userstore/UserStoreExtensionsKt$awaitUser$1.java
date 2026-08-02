package com.paypal.oslo.core.userstore;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.userstore.UserStoreExtensionsKt", f = "UserStoreExtensions.kt", i = {0}, l = {58}, m = "awaitUser", n = {"$this$awaitUser"}, nl = {59}, s = {"L$0"}, v = 2)
/* loaded from: classes10.dex */
final class UserStoreExtensionsKt$awaitUser$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return com.paypal.oslo.core.userstore.UserStoreExtensionsKt.awaitUser(null, this);
    }

    UserStoreExtensionsKt$awaitUser$1(kotlin.coroutines.Continuation<? super com.paypal.oslo.core.userstore.UserStoreExtensionsKt$awaitUser$1> continuation) {
        super(continuation);
    }
}
