package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Ud extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4996a;
    public int b;
    public final /* synthetic */ com.inmobi.media.Vd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ud(com.inmobi.media.Vd vd, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.c = vd;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f4996a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
