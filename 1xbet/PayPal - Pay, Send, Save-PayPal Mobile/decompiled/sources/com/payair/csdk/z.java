package com.payair.csdk;

/* loaded from: classes4.dex */
public final class z extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4341a;

    public z(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.payair.csdk.z zVar = new com.payair.csdk.z(continuation);
        zVar.f4341a = obj;
        return zVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.payair.csdk.z zVar = new com.payair.csdk.z((kotlin.coroutines.Continuation) obj2);
        zVar.f4341a = (androidx.content.preferences.core.MutablePreferences) obj;
        return zVar.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.datastore.preferences.core.Preferences.Key key;
        androidx.datastore.preferences.core.Preferences.Key key2;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.content.preferences.core.MutablePreferences mutablePreferences = (androidx.content.preferences.core.MutablePreferences) this.f4341a;
        key = com.payair.logic.storage.DataStoreSchemeStorage.g;
        mutablePreferences.remove(key);
        key2 = com.payair.logic.storage.DataStoreSchemeStorage.h;
        mutablePreferences.remove(key2);
        return kotlin.Unit.INSTANCE;
    }
}
