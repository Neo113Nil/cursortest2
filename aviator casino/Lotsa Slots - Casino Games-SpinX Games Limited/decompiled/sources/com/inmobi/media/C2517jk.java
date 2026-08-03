package com.inmobi.media;

/* renamed from: com.inmobi.media.jk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2517jk extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.inmobi.media.C2836vk f5280a;
    public int b;
    public /* synthetic */ java.lang.Object c;
    public final /* synthetic */ com.inmobi.media.C2624nk d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2517jk(com.inmobi.media.C2624nk c2624nk, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = c2624nk;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
