package com.inmobi.media;

/* loaded from: classes5.dex */
public final class W2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f5023a;
    public final /* synthetic */ com.inmobi.media.Z2 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W2(com.inmobi.media.Z2 z2, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f5023a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(0, 0, this);
    }
}
