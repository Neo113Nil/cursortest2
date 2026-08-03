package com.inmobi.media;

/* renamed from: com.inmobi.media.pg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2673pg extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f5393a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ com.inmobi.media.AbstractC2699qg c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2673pg(com.inmobi.media.AbstractC2699qg abstractC2699qg, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = abstractC2699qg;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((java.lang.String) null, this);
    }
}
