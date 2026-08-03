package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Jh extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public java.util.List f4783a;
    public java.util.ArrayList b;
    public /* synthetic */ java.lang.Object c;
    public final /* synthetic */ com.inmobi.media.Kh d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Jh(com.inmobi.media.Kh kh, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = kh;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a((com.inmobi.media.Ve) null, (java.util.List) null, this);
    }
}
