package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Ih extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f4766a;
    public java.lang.String b;
    public kotlinx.coroutines.channels.ProducerScope c;
    public java.util.List d;
    public com.inmobi.media.Ve e;
    public java.util.List f;
    public java.util.Iterator g;
    public java.util.List h;
    public int i;
    public int j;
    public int k;
    public int l;
    public boolean m;
    public long n;
    public /* synthetic */ java.lang.Object o;
    public final /* synthetic */ com.inmobi.media.Kh p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ih(com.inmobi.media.Kh kh, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.p = kh;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.a(null, null, null, null, null, this);
    }
}
