package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Qa extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4914a;
    public final /* synthetic */ com.inmobi.media.Sa b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Qa(com.inmobi.media.Sa sa, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = sa;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f4914a = obj;
        this.c |= Integer.MIN_VALUE;
        return com.inmobi.media.Sa.a(this.b, this);
    }
}
