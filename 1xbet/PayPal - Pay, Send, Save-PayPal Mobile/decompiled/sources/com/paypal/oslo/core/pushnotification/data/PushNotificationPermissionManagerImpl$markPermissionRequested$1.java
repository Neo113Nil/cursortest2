package com.paypal.oslo.core.pushnotification.data;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.pushnotification.data.PushNotificationPermissionManagerImpl$markPermissionRequested$1", f = "PushNotificationPermissionManagerImpl.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class PushNotificationPermissionManagerImpl$markPermissionRequested$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.pushnotification.data.PushNotificationPermissionManagerImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            appStorage = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (appStorage.setBoolean(com.paypal.oslo.core.pushnotification.data.PushNotificationPermissionManagerImpl.INSTANCE.getKEY_PERMISSION_REQUESTED(), true, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.core.pushnotification.data.PushNotificationPermissionManagerImpl$markPermissionRequested$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.core.pushnotification.data.PushNotificationPermissionManagerImpl$markPermissionRequested$1(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PushNotificationPermissionManagerImpl$markPermissionRequested$1(com.paypal.oslo.core.pushnotification.data.PushNotificationPermissionManagerImpl pushNotificationPermissionManagerImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.pushnotification.data.PushNotificationPermissionManagerImpl$markPermissionRequested$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = pushNotificationPermissionManagerImpl;
    }
}
