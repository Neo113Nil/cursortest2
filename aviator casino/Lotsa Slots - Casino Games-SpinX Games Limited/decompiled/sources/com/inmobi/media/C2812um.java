package com.inmobi.media;

/* renamed from: com.inmobi.media.um, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2812um extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.inmobi.media.Fm f5493a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ com.inmobi.media.Fm c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2812um(com.inmobi.media.Fm fm, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = fm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(this);
    }
}
