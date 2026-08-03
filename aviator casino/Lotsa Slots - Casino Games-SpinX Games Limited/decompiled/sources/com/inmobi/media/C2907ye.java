package com.inmobi.media;

/* renamed from: com.inmobi.media.ye, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2907ye extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f5570a;

    public C2907ye(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.C2907ye c2907ye = new com.inmobi.media.C2907ye(continuation);
        c2907ye.f5570a = ((java.lang.Boolean) obj).booleanValue();
        return c2907ye;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        bool.booleanValue();
        com.inmobi.media.C2907ye c2907ye = new com.inmobi.media.C2907ye((kotlin.coroutines.Continuation) obj2);
        c2907ye.f5570a = bool.booleanValue();
        return c2907ye.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.f5570a);
    }
}
