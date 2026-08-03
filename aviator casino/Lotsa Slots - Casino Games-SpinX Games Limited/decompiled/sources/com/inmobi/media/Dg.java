package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Dg extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4663a;
    public final /* synthetic */ com.inmobi.media.Fg b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dg(com.inmobi.media.Fg fg, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = fg;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f4663a = obj;
        this.c |= Integer.MIN_VALUE;
        return com.inmobi.media.Fg.a(this.b, this);
    }
}
