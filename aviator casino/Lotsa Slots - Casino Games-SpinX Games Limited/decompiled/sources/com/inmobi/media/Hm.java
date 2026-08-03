package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Hm extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.inmobi.media.Gl f4750a;
    public com.inmobi.media.Xe b;
    public int c;
    public /* synthetic */ java.lang.Object d;
    public int e;

    public Hm(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return com.inmobi.media.Nm.a(null, 0.0d, null, 0, null, this);
    }
}
