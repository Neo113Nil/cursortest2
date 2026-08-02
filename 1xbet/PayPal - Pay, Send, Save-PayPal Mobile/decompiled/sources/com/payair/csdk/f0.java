package com.payair.csdk;

/* loaded from: classes4.dex */
public final class f0 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4247a;
    public final /* synthetic */ androidx.datastore.preferences.core.Preferences.Key b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(androidx.datastore.preferences.core.Preferences.Key key, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = key;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.payair.csdk.f0 f0Var = new com.payair.csdk.f0(this.b, continuation);
        f0Var.f4247a = obj;
        return f0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.payair.csdk.f0 f0Var = new com.payair.csdk.f0(this.b, (kotlin.coroutines.Continuation) obj2);
        f0Var.f4247a = (androidx.content.preferences.core.MutablePreferences) obj;
        return f0Var.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        ((androidx.content.preferences.core.MutablePreferences) this.f4247a).remove(this.b);
        return kotlin.Unit.INSTANCE;
    }
}
