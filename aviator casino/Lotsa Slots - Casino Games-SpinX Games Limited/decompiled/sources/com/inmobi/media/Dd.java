package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Dd extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4661a;
    public int b;
    public final /* synthetic */ com.inmobi.media.Ed c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dd(com.inmobi.media.Ed ed, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.c = ed;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f4661a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
