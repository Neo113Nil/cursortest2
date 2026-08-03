package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Q0 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f4906a;
    public com.inmobi.media.ads.network.common.model.AdResponse b;
    public java.util.Iterator c;
    public int d;
    public int e;
    public /* synthetic */ java.lang.Object f;
    public final /* synthetic */ com.inmobi.media.R0 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q0(com.inmobi.media.R0 r0, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.g = r0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(null, null, this);
    }
}
