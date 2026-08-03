package com.inmobi.media;

/* loaded from: classes5.dex */
public final class H3 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4737a;
    public int b;

    public H3(kotlin.coroutines.Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f4737a = obj;
        this.b |= Integer.MIN_VALUE;
        return com.inmobi.media.J3.a((com.inmobi.media.C2935zh) null, (kotlin.jvm.functions.Function1) null, this);
    }
}
