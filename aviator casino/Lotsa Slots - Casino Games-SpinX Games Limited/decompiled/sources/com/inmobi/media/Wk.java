package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Wk extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f5036a;
    public final /* synthetic */ com.inmobi.media.C2282al b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wk(com.inmobi.media.C2282al c2282al, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c2282al;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f5036a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a((kotlin.coroutines.jvm.internal.ContinuationImpl) this);
    }
}
