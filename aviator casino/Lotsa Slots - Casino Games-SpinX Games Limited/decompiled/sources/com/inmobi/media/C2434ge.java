package com.inmobi.media;

/* renamed from: com.inmobi.media.ge, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2434ge extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.C2486ie f5218a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2434ge(com.inmobi.media.C2486ie c2486ie, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5218a = c2486ie;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2434ge(this.f5218a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2434ge(this.f5218a, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        this.f5218a.g.setActivated(true);
        this.f5218a.g.setFocusable(true);
        com.inmobi.media.C2486ie c2486ie = this.f5218a;
        if (c2486ie.i) {
            c2486ie.a();
        } else {
            com.inmobi.media.T4.a(c2486ie.b, new com.inmobi.media.C2460he(c2486ie, null));
        }
        return kotlin.Unit.INSTANCE;
    }
}
