package com.inmobi.media;

/* renamed from: com.inmobi.media.lm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2572lm extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.inmobi.media.Bl f5322a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ com.inmobi.media.C2626nm c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2572lm(com.inmobi.media.C2626nm c2626nm, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = c2626nm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((com.inmobi.media.Bl) null, (com.inmobi.media.Gm) null, this);
    }
}
