package com.paypal.oslo.core.appidentity.data;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.appidentity.data.DeviceRegistrationSignalImpl$awaitDeviceId$2", f = "DeviceRegistrationSignalImpl.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes4.dex */
final class DeviceRegistrationSignalImpl$awaitDeviceId$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.String>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.appidentity.data.DeviceRegistrationSignalImpl getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        mutableSharedFlow = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRangesFor = 1;
        java.lang.Object first = kotlinx.coroutines.flow.FlowKt.first(mutableSharedFlow, this);
        return first == coroutine_suspended ? coroutine_suspended : first;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return ((com.paypal.oslo.core.appidentity.data.DeviceRegistrationSignalImpl$awaitDeviceId$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.core.appidentity.data.DeviceRegistrationSignalImpl$awaitDeviceId$2(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeviceRegistrationSignalImpl$awaitDeviceId$2(com.paypal.oslo.core.appidentity.data.DeviceRegistrationSignalImpl deviceRegistrationSignalImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.appidentity.data.DeviceRegistrationSignalImpl$awaitDeviceId$2> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = deviceRegistrationSignalImpl;
    }
}
