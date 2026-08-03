package com.inmobi.media;

/* renamed from: com.inmobi.media.ik, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2491ik extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f5263a;
    public final /* synthetic */ com.inmobi.media.C2624nk b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2491ik(com.inmobi.media.C2624nk c2624nk, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c2624nk;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f5263a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a((kotlin.coroutines.Continuation) this);
    }
}
