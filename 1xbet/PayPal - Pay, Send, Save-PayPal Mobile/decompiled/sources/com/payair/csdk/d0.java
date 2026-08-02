package com.payair.csdk;

/* loaded from: classes10.dex */
public final class d0 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4240a;

    public d0(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.payair.csdk.d0 d0Var = new com.payair.csdk.d0(continuation);
        d0Var.f4240a = obj;
        return d0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.payair.csdk.d0 d0Var = new com.payair.csdk.d0((kotlin.coroutines.Continuation) obj2);
        d0Var.f4240a = (androidx.content.preferences.core.MutablePreferences) obj;
        return d0Var.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.datastore.preferences.core.Preferences.Key key;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.content.preferences.core.MutablePreferences mutablePreferences = (androidx.content.preferences.core.MutablePreferences) this.f4240a;
        key = com.payair.logic.storage.DataStoreSchemeStorage.g;
        mutablePreferences.set(key, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
        return kotlin.Unit.INSTANCE;
    }
}
