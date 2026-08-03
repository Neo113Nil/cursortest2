package com.inmobi.media;

/* renamed from: com.inmobi.media.vb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2827vb extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f5507a;
    public java.lang.Object b;
    public kotlinx.coroutines.sync.Mutex c;
    public /* synthetic */ java.lang.Object d;
    public final /* synthetic */ com.inmobi.media.C2879xb e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2827vb(com.inmobi.media.C2879xb c2879xb, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = c2879xb;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, null, this);
    }
}
