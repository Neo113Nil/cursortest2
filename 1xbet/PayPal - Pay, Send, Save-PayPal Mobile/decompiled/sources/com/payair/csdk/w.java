package com.payair.csdk;

/* loaded from: classes4.dex */
public final class w extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4328a;
    public final /* synthetic */ java.util.Set b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(java.util.Set set, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.payair.csdk.w wVar = new com.payair.csdk.w(this.b, continuation);
        wVar.f4328a = obj;
        return wVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.payair.csdk.w wVar = new com.payair.csdk.w(this.b, (kotlin.coroutines.Continuation) obj2);
        wVar.f4328a = (androidx.content.preferences.core.MutablePreferences) obj;
        return wVar.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.datastore.preferences.core.Preferences.Key key;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.content.preferences.core.MutablePreferences mutablePreferences = (androidx.content.preferences.core.MutablePreferences) this.f4328a;
        key = com.payair.logic.storage.DataStoreEnrollmentIdStorage.f;
        mutablePreferences.set(key, this.b);
        return kotlin.Unit.INSTANCE;
    }
}
