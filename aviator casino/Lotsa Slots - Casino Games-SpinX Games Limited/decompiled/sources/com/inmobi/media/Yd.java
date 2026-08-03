package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Yd extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f5065a;
    public final /* synthetic */ com.inmobi.media.C2275ae b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Yd(com.inmobi.media.C2275ae c2275ae, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c2275ae;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f5065a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
