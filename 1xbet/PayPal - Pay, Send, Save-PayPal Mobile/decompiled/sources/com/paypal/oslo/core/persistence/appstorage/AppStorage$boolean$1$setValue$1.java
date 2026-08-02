package com.paypal.oslo.core.persistence.appstorage;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.persistence.appstorage.AppStorage$boolean$1$setValue$1", f = "AppStorage.kt", i = {}, l = {737}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes10.dex */
final class AppStorage$boolean$1$setValue$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.persistence.appstorage.AppStorage Camera2StreamConfigurationMap;
    final /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.persistence.appstorage.AppStorageKey getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (this.Camera2StreamConfigurationMap.set(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.core.persistence.appstorage.AppStorage$boolean$1$setValue$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.core.persistence.appstorage.AppStorage$boolean$1$setValue$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppStorage$boolean$1$setValue$1(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage, com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, boolean z, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.persistence.appstorage.AppStorage$boolean$1$setValue$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = appStorage;
        this.getHighSpeedVideoFpsRanges = appStorageKey;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }
}
