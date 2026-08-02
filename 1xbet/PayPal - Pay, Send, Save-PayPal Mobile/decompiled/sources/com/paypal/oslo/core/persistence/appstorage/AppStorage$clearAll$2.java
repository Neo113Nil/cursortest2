package com.paypal.oslo.core.persistence.appstorage;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "prefs", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.persistence.appstorage.AppStorage$clearAll$2", f = "AppStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class AppStorage$clearAll$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.content.preferences.core.MutablePreferences, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.persistence.appstorage.AppStorage getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        androidx.content.preferences.core.MutablePreferences mutablePreferences = (androidx.content.preferences.core.MutablePreferences) this.getHighSpeedVideoFpsRangesFor;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.Set<androidx.datastore.preferences.core.Preferences.Key<?>> keySet = mutablePreferences.asMap().keySet();
        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage = this.getHighSpeedVideoFpsRanges;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : keySet) {
            androidx.datastore.preferences.core.Preferences.Key key = (androidx.datastore.preferences.core.Preferences.Key) obj2;
            com.paypal.oslo.core.persistence.appstorage.KeyMapper keyMapper = com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE;
            java.lang.String name2 = key.getName();
            str = appStorage.getHighResolutionOutputSizeshNQ4ISI;
            if (!keyMapper.isModuleKey(name2, str)) {
                java.lang.String name3 = key.getName();
                str2 = appStorage.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str2);
                sb.append("_encrypted_");
                if (kotlin.text.StringsKt.startsWith$default(name3, sb.toString(), false, 2, (java.lang.Object) null)) {
                }
            }
            arrayList.add(obj2);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            mutablePreferences.remove((androidx.datastore.preferences.core.Preferences.Key) it.next());
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(androidx.content.preferences.core.MutablePreferences mutablePreferences, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.core.persistence.appstorage.AppStorage$clearAll$2) create(mutablePreferences, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.core.persistence.appstorage.AppStorage$clearAll$2 appStorage$clearAll$2 = new com.paypal.oslo.core.persistence.appstorage.AppStorage$clearAll$2(this.getHighSpeedVideoFpsRanges, continuation);
        appStorage$clearAll$2.getHighSpeedVideoFpsRangesFor = obj;
        return appStorage$clearAll$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppStorage$clearAll$2(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.persistence.appstorage.AppStorage$clearAll$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = appStorage;
    }
}
