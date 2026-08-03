package com.inmobi.media;

/* loaded from: classes5.dex */
public final class T9 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4973a;
    public final /* synthetic */ com.inmobi.media.U9 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T9(com.inmobi.media.U9 u9, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = u9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f4973a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(0, this);
    }
}
