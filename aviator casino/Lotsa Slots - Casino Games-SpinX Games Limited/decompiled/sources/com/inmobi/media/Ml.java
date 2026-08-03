package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Ml extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public java.util.List f4841a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ com.inmobi.media.Wl c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ml(com.inmobi.media.Wl wl, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = wl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((java.lang.String) null, (java.util.ArrayList) null, this);
    }
}
