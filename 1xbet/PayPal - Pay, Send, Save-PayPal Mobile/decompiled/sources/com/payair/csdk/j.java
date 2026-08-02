package com.payair.csdk;

/* loaded from: classes10.dex */
public final class j extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4266a;

    public j(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.payair.csdk.j jVar = new com.payair.csdk.j(continuation);
        jVar.f4266a = obj;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.payair.csdk.j jVar = new com.payair.csdk.j((kotlin.coroutines.Continuation) obj2);
        jVar.f4266a = (androidx.content.preferences.core.MutablePreferences) obj;
        return jVar.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.datastore.preferences.core.Preferences.Key key;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.content.preferences.core.MutablePreferences mutablePreferences = (androidx.content.preferences.core.MutablePreferences) this.f4266a;
        key = com.payair.logic.storage.DataStoreEnrollmentIdStorage.c;
        mutablePreferences.remove(key);
        return kotlin.Unit.INSTANCE;
    }
}
