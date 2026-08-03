package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Fj extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4711a;
    public final /* synthetic */ com.inmobi.media.Gj b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fj(com.inmobi.media.Gj gj, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = gj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f4711a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
