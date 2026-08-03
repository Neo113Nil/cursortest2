package com.inmobi.media;

/* renamed from: com.inmobi.media.km, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2545km extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.inmobi.media.Hl f5300a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ com.inmobi.media.C2626nm c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2545km(com.inmobi.media.C2626nm c2626nm, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = c2626nm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
