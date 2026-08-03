package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Ij extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4768a;
    public final /* synthetic */ com.inmobi.media.Nj b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ij(com.inmobi.media.Nj nj, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = nj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f4768a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
