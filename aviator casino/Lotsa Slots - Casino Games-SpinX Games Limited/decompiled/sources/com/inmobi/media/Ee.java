package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Ee extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4684a;
    public final /* synthetic */ com.inmobi.media.Ge b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ee(com.inmobi.media.Ge ge, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = ge;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f4684a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
