package com.paypal.oslo.core.persistence.appstorage;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "prefs", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.persistence.appstorage.AppStorage$remove$2", f = "AppStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class AppStorage$remove$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.content.preferences.core.MutablePreferences, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.persistence.appstorage.AppStorageKey getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.core.persistence.appstorage.AppStorage getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.content.preferences.core.MutablePreferences mutablePreferences = (androidx.content.preferences.core.MutablePreferences) this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (com.paypal.oslo.core.persistence.appstorage.AppStorage.access$isEncrypted(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges)) {
            com.paypal.oslo.core.persistence.appstorage.AppStorage.access$removeEncryptedKey(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, mutablePreferences);
        } else {
            com.paypal.oslo.core.persistence.appstorage.AppStorage.access$removeUnencryptedKey(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, mutablePreferences);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(androidx.content.preferences.core.MutablePreferences mutablePreferences, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.core.persistence.appstorage.AppStorage$remove$2) create(mutablePreferences, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.core.persistence.appstorage.AppStorage$remove$2 appStorage$remove$2 = new com.paypal.oslo.core.persistence.appstorage.AppStorage$remove$2(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
        appStorage$remove$2.getHighResolutionOutputSizeshNQ4ISI = obj;
        return appStorage$remove$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppStorage$remove$2(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage, com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.persistence.appstorage.AppStorage$remove$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = appStorage;
        this.getHighSpeedVideoFpsRanges = appStorageKey;
    }
}
