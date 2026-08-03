package com.inmobi.media;

/* renamed from: com.inmobi.media.z6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2924z6 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public java.util.List f5584a;
    public com.inmobi.media.ads.network.common.model.OmSdkInfo b;
    public /* synthetic */ java.lang.Object c;
    public final /* synthetic */ com.inmobi.media.A6 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2924z6(com.inmobi.media.A6 a6, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = a6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
