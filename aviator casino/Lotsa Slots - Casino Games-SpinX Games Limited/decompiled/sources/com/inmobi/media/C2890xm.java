package com.inmobi.media;

/* renamed from: com.inmobi.media.xm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2890xm extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f5556a;
    public int b;
    public final /* synthetic */ com.inmobi.media.C2915ym c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2890xm(com.inmobi.media.C2915ym c2915ym, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.c = c2915ym;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f5556a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
