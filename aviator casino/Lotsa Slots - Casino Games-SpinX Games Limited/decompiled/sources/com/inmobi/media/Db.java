package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Db extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4659a;
    public final /* synthetic */ com.inmobi.media.Fb b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Db(com.inmobi.media.Fb fb, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = fb;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f4659a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a((com.inmobi.media.C2904yb) null, this);
    }
}
