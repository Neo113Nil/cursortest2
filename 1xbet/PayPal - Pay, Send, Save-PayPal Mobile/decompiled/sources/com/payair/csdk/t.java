package com.payair.csdk;

/* loaded from: classes4.dex */
public final class t extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4314a;

    public t(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.payair.csdk.t tVar = new com.payair.csdk.t(continuation);
        tVar.f4314a = obj;
        return tVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.payair.csdk.t tVar = new com.payair.csdk.t((kotlin.coroutines.Continuation) obj2);
        tVar.f4314a = (androidx.content.preferences.core.MutablePreferences) obj;
        return tVar.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.datastore.preferences.core.Preferences.Key key;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.content.preferences.core.MutablePreferences mutablePreferences = (androidx.content.preferences.core.MutablePreferences) this.f4314a;
        key = com.payair.logic.storage.DataStoreEnrollmentIdStorage.d;
        mutablePreferences.remove(key);
        return kotlin.Unit.INSTANCE;
    }
}
