package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Bj extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f4627a;
    public com.inmobi.media.Tj b;
    public /* synthetic */ java.lang.Object c;
    public final /* synthetic */ com.inmobi.media.Ej d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bj(com.inmobi.media.Ej ej, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = ej;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return com.inmobi.media.Ej.a(this.d, null, null, this);
    }
}
