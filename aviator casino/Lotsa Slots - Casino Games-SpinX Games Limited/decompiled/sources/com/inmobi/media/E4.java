package com.inmobi.media;

/* loaded from: classes5.dex */
public final class E4 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4676a;
    public final /* synthetic */ com.inmobi.media.G4 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E4(com.inmobi.media.G4 g4, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = g4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f4676a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
