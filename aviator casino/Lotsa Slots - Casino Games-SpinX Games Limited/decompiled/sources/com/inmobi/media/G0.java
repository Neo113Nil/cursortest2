package com.inmobi.media;

/* loaded from: classes5.dex */
public final class G0 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4715a;
    public final /* synthetic */ com.inmobi.media.H0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G0(com.inmobi.media.H0 h0, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = h0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f4715a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
