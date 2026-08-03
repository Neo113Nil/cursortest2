package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Ef extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4685a;
    public final /* synthetic */ com.inmobi.media.Gf b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ef(com.inmobi.media.Gf gf, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = gf;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f4685a = obj;
        this.c |= Integer.MIN_VALUE;
        return com.inmobi.media.Gf.a(this.b, this);
    }
}
