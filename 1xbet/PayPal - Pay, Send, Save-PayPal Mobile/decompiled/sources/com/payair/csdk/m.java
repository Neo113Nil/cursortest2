package com.payair.csdk;

/* loaded from: classes10.dex */
public final class m extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4281a;

    public m(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.payair.csdk.m mVar = new com.payair.csdk.m(continuation);
        mVar.f4281a = obj;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.payair.csdk.m mVar = new com.payair.csdk.m((kotlin.coroutines.Continuation) obj2);
        mVar.f4281a = (androidx.content.preferences.core.MutablePreferences) obj;
        return mVar.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        ((androidx.content.preferences.core.MutablePreferences) this.f4281a).clear();
        return kotlin.Unit.INSTANCE;
    }
}
