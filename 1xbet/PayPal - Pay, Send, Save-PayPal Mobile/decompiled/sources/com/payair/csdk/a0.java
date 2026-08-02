package com.payair.csdk;

/* loaded from: classes10.dex */
public final class a0 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4225a;

    public a0(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.payair.csdk.a0 a0Var = new com.payair.csdk.a0(continuation);
        a0Var.f4225a = obj;
        return a0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.payair.csdk.a0 a0Var = new com.payair.csdk.a0((kotlin.coroutines.Continuation) obj2);
        a0Var.f4225a = (androidx.content.preferences.core.MutablePreferences) obj;
        return a0Var.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.datastore.preferences.core.Preferences.Key key;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.content.preferences.core.MutablePreferences mutablePreferences = (androidx.content.preferences.core.MutablePreferences) this.f4225a;
        key = com.payair.logic.storage.DataStoreSchemeStorage.g;
        mutablePreferences.remove(key);
        return kotlin.Unit.INSTANCE;
    }
}
