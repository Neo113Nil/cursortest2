package com.paypal.oslo.core.persistence.appstorage;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "prefs", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.persistence.appstorage.AppStorage$setValue$2", f = "AppStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class AppStorage$setValue$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.content.preferences.core.MutablePreferences, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ T Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.persistence.appstorage.AppStorageKey getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.datastore.preferences.core.Preferences.Key<T> getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.core.persistence.appstorage.AppStorage getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.persistence.encryption.EncryptionManager encryptionManager;
        java.lang.String str;
        java.lang.String concat;
        androidx.content.preferences.core.MutablePreferences mutablePreferences = (androidx.content.preferences.core.MutablePreferences) this.getHighSpeedVideoSizes;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (com.paypal.oslo.core.persistence.appstorage.AppStorage.access$isEncrypted(this.getOutputFormats, this.getHighSpeedVideoFpsRanges)) {
            encryptionManager = this.getOutputFormats.getHighSpeedVideoFpsRangesFor;
            java.lang.String encryptValue = encryptionManager.encryptValue(this.Camera2StreamConfigurationMap);
            com.paypal.oslo.core.persistence.appstorage.KeyMapper keyMapper = com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE;
            str = this.getOutputFormats.getHighResolutionOutputSizeshNQ4ISI;
            com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage = this.getOutputFormats;
            concat = com.paypal.oslo.core.persistence.appstorage.AppStorage.ENCRYPTED_PREFIX.concat(java.lang.String.valueOf(this.getHighSpeedVideoFpsRanges.getName()));
            mutablePreferences.set(keyMapper.stringKey(str, concat), encryptValue);
        } else {
            mutablePreferences.set(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(androidx.content.preferences.core.MutablePreferences mutablePreferences, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.core.persistence.appstorage.AppStorage$setValue$2) create(mutablePreferences, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.core.persistence.appstorage.AppStorage$setValue$2 appStorage$setValue$2 = new com.paypal.oslo.core.persistence.appstorage.AppStorage$setValue$2(this.getOutputFormats, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
        appStorage$setValue$2.getHighSpeedVideoSizes = obj;
        return appStorage$setValue$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppStorage$setValue$2(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage, com.paypal.oslo.core.persistence.appstorage.AppStorageKey appStorageKey, T t, androidx.datastore.preferences.core.Preferences.Key<T> key, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.persistence.appstorage.AppStorage$setValue$2> continuation) {
        super(2, continuation);
        this.getOutputFormats = appStorage;
        this.getHighSpeedVideoFpsRanges = appStorageKey;
        this.Camera2StreamConfigurationMap = t;
        this.getHighSpeedVideoFpsRangesFor = key;
    }
}
