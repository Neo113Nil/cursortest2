package com.inmobi.media;

/* renamed from: com.inmobi.media.zb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2929zb extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f5588a;
    public final /* synthetic */ com.inmobi.media.Fb b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2929zb(com.inmobi.media.Fb fb, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = fb;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f5588a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(0L, 0, this);
    }
}
