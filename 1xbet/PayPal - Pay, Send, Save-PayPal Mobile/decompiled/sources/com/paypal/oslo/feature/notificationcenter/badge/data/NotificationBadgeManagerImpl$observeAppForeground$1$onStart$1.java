package com.paypal.oslo.feature.notificationcenter.badge.data;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.notificationcenter.badge.data.NotificationBadgeManagerImpl$observeAppForeground$1$onStart$1", f = "NotificationBadgeManagerImpl.kt", i = {}, l = {74, 75}, m = "invokeSuspend", n = {}, nl = {75, 77}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class NotificationBadgeManagerImpl$observeAppForeground$1$onStart$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.notificationcenter.badge.data.NotificationBadgeManagerImpl Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        if (r4.Camera2StreamConfigurationMap.refreshBadgeCount(r4) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
    
        if (r5 != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            obj = com.paypal.oslo.feature.notificationcenter.badge.data.NotificationBadgeManagerImpl.access$awaitLoggedIn(this.Camera2StreamConfigurationMap, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            this.getHighResolutionOutputSizeshNQ4ISI = 2;
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.notificationcenter.badge.data.NotificationBadgeManagerImpl$observeAppForeground$1$onStart$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.notificationcenter.badge.data.NotificationBadgeManagerImpl$observeAppForeground$1$onStart$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationBadgeManagerImpl$observeAppForeground$1$onStart$1(com.paypal.oslo.feature.notificationcenter.badge.data.NotificationBadgeManagerImpl notificationBadgeManagerImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.notificationcenter.badge.data.NotificationBadgeManagerImpl$observeAppForeground$1$onStart$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = notificationBadgeManagerImpl;
    }
}
