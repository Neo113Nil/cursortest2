package com.inmobi.media;

/* renamed from: com.inmobi.media.vg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2832vg extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f5511a;
    public final /* synthetic */ com.inmobi.media.C2884xg b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2832vg(com.inmobi.media.C2884xg c2884xg, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c2884xg;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f5511a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, null, this);
    }
}
