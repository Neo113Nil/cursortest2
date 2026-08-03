package com.inmobi.media;

/* loaded from: classes5.dex */
public final class P0 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public kotlin.jvm.functions.Function1 f4885a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ com.inmobi.media.R0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P0(com.inmobi.media.R0 r0, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = r0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((kotlin.jvm.functions.Function1) null, this);
    }
}
