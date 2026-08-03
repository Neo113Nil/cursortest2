package com.inmobi.media;

/* loaded from: classes5.dex */
public final class T0 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4966a;
    public final /* synthetic */ com.inmobi.media.U0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T0(com.inmobi.media.U0 u0, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = u0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f4966a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
