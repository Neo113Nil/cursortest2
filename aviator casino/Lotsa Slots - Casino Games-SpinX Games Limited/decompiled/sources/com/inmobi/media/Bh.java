package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Bh extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.inmobi.media.AbstractC2767t4 f4625a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ com.inmobi.media.Ch c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bh(com.inmobi.media.Ch ch, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.c = ch;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
