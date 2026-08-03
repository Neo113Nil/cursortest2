package com.inmobi.media;

/* loaded from: classes5.dex */
public final class K1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4792a;
    public final /* synthetic */ com.inmobi.media.M1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K1(com.inmobi.media.M1 m1, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = m1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f4792a = obj;
        this.c |= Integer.MIN_VALUE;
        return com.inmobi.media.M1.a(this.b, null, null, this);
    }
}
