package com.paypal.oslo.core.persistence.appstorage;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.persistence.appstorage.AppStorage$long$1$getValue$1", f = "AppStorage.kt", i = {}, l = {756}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes10.dex */
final class AppStorage$long$1$getValue$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.Long>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.persistence.appstorage.AppStorage Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ long getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.core.persistence.appstorage.AppStorageKey getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighResolutionOutputSizeshNQ4ISI = 1;
        java.lang.Object obj2 = this.Camera2StreamConfigurationMap.getLong(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this);
        return obj2 == coroutine_suspended ? coroutine_suspended : obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
        return ((com.paypal.oslo.core.persistence.appstorage.AppStorage$long$1$getValue$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.core.persistence.appstorage.AppStorage$long$1$getValue$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppStorage$long$1$getValue$1(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage, com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, long j, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.persistence.appstorage.AppStorage$long$1$getValue$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = appStorage;
        this.getHighSpeedVideoFpsRangesFor = appStorageKey;
        this.getHighSpeedVideoFpsRanges = j;
    }
}
