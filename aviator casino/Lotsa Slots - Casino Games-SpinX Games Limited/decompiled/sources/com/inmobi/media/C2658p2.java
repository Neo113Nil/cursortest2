package com.inmobi.media;

/* renamed from: com.inmobi.media.p2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2658p2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public kotlinx.coroutines.sync.Mutex f5383a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ com.inmobi.media.AbstractC2765t2 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2658p2(com.inmobi.media.AbstractC2765t2 abstractC2765t2, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = abstractC2765t2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return com.inmobi.media.AbstractC2765t2.a(this.c, this);
    }
}
