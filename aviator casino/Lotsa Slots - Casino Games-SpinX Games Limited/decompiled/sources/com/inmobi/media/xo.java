package com.inmobi.media;

/* loaded from: classes5.dex */
public final class xo extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f5558a;
    public com.inmobi.media.InterfaceC2772t9 b;
    public java.util.Map c;
    public java.lang.String d;
    public com.inmobi.media.Ve e;
    public long f;
    public /* synthetic */ java.lang.Object g;
    public final /* synthetic */ com.inmobi.media.Ao h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xo(com.inmobi.media.Ao ao, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.h = ao;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(null, null, this);
    }
}
