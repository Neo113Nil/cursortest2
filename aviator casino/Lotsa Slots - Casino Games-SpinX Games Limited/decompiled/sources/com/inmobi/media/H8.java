package com.inmobi.media;

/* loaded from: classes5.dex */
public final class H8 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.inmobi.media.Zf f4741a;
    public com.inmobi.media.InterfaceC2620ng b;
    public /* synthetic */ java.lang.Object c;
    public final /* synthetic */ com.inmobi.media.J8 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H8(com.inmobi.media.J8 j8, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = j8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(null, this);
    }
}
