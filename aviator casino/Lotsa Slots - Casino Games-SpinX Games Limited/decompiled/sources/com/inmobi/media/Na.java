package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Na extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.inmobi.media.X9 f4852a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ com.inmobi.media.Sa c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Na(com.inmobi.media.Sa sa, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = sa;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return com.inmobi.media.Sa.a(this.c, null, this);
    }
}
