package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Pb extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f4894a;
    public com.inmobi.media.C2904yb b;
    public com.inmobi.media.C2904yb c;
    public /* synthetic */ java.lang.Object d;
    public final /* synthetic */ com.inmobi.media.Rb e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pb(com.inmobi.media.Rb rb, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = rb;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(null, null, this);
    }
}
