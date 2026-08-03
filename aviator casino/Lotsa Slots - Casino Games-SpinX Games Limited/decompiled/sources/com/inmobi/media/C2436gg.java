package com.inmobi.media;

/* renamed from: com.inmobi.media.gg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2436gg extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.inmobi.media.Zf f5220a;
    public kotlin.jvm.functions.Function2 b;
    public /* synthetic */ java.lang.Object c;
    public final /* synthetic */ com.inmobi.media.AbstractC2462hg d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2436gg(com.inmobi.media.AbstractC2462hg abstractC2462hg, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = abstractC2462hg;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, null, this);
    }
}
