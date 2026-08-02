package com.payair.csdk;

/* loaded from: classes10.dex */
public final class e0 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4244a;

    public e0(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.payair.csdk.e0 e0Var = new com.payair.csdk.e0(continuation);
        e0Var.f4244a = obj;
        return e0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.payair.csdk.e0 e0Var = new com.payair.csdk.e0((kotlin.coroutines.Continuation) obj2);
        e0Var.f4244a = (androidx.content.preferences.core.MutablePreferences) obj;
        return e0Var.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        ((androidx.content.preferences.core.MutablePreferences) this.f4244a).clear();
        return kotlin.Unit.INSTANCE;
    }
}
