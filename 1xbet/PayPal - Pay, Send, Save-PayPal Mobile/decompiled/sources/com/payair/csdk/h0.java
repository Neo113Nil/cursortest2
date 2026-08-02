package com.payair.csdk;

/* loaded from: classes10.dex */
public final class h0 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4257a;
    public final /* synthetic */ androidx.datastore.preferences.core.Preferences.Key b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(androidx.datastore.preferences.core.Preferences.Key key, long j, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = key;
        this.c = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.payair.csdk.h0 h0Var = new com.payair.csdk.h0(this.b, this.c, continuation);
        h0Var.f4257a = obj;
        return h0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.payair.csdk.h0) create((androidx.content.preferences.core.MutablePreferences) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        ((androidx.content.preferences.core.MutablePreferences) this.f4257a).set(this.b, kotlin.coroutines.jvm.internal.Boxing.boxLong(this.c));
        return kotlin.Unit.INSTANCE;
    }
}
