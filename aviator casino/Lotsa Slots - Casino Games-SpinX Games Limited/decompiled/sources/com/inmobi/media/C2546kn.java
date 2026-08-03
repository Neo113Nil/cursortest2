package com.inmobi.media;

/* renamed from: com.inmobi.media.kn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2546kn extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f5301a;
    public int b;
    public final /* synthetic */ com.inmobi.media.C2573ln c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2546kn(com.inmobi.media.C2573ln c2573ln, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.c = c2573ln;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f5301a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
