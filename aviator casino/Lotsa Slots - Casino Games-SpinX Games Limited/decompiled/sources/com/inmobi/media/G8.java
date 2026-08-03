package com.inmobi.media;

/* loaded from: classes5.dex */
public final class G8 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.inmobi.media.Zf f4721a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ com.inmobi.media.J8 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G8(com.inmobi.media.J8 j8, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = j8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((com.inmobi.media.Zf) null, this);
    }
}
