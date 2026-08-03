package com.inmobi.media;

/* renamed from: com.inmobi.media.pe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2671pe extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f5391a;
    public final /* synthetic */ com.inmobi.media.Be b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2671pe(com.inmobi.media.Be be, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = be;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f5391a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
