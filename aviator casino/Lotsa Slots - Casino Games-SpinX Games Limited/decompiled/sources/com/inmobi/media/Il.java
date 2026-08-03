package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Il extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public int f4769a;
    public com.inmobi.media.Re b;
    public /* synthetic */ java.lang.Object c;
    public final /* synthetic */ com.inmobi.media.Jl d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Il(com.inmobi.media.Jl jl, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = jl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
