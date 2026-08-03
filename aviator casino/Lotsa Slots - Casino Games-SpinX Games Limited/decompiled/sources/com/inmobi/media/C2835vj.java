package com.inmobi.media;

/* renamed from: com.inmobi.media.vj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2835vj extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.inmobi.media.InterfaceC2782tj f5514a;
    public com.inmobi.media.InterfaceC2782tj b;
    public kotlinx.coroutines.sync.Mutex c;
    public /* synthetic */ java.lang.Object d;
    public final /* synthetic */ com.inmobi.media.AbstractC2861wj e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2835vj(com.inmobi.media.AbstractC2861wj abstractC2861wj, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = abstractC2861wj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, null, this);
    }
}
