package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Tl extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4982a;
    public final /* synthetic */ com.inmobi.media.Wl b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tl(com.inmobi.media.Wl wl, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = wl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f4982a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a((java.lang.String) null, this);
    }
}
