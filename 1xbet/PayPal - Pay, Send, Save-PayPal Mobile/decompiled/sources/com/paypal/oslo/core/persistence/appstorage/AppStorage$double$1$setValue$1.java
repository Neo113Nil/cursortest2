package com.paypal.oslo.core.persistence.appstorage;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.persistence.appstorage.AppStorage$double$1$setValue$1", f = "AppStorage.kt", i = {}, l = {809}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes10.dex */
final class AppStorage$double$1$setValue$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.persistence.appstorage.AppStorageKey Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.persistence.appstorage.AppStorage getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ double getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRanges = 1;
            if (this.getHighResolutionOutputSizeshNQ4ISI.set(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.core.persistence.appstorage.AppStorage$double$1$setValue$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.core.persistence.appstorage.AppStorage$double$1$setValue$1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppStorage$double$1$setValue$1(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage, com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, double d, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.persistence.appstorage.AppStorage$double$1$setValue$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = appStorage;
        this.Camera2StreamConfigurationMap = appStorageKey;
        this.getHighSpeedVideoSizes = d;
    }
}
