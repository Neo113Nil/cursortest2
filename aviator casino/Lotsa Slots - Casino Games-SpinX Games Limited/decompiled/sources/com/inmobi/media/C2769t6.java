package com.inmobi.media;

/* renamed from: com.inmobi.media.t6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2769t6 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public int f5459a;
    public int b;
    public int c;
    public /* synthetic */ java.lang.Object d;
    public final /* synthetic */ com.inmobi.media.C2899y6 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2769t6(com.inmobi.media.C2899y6 c2899y6, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = c2899y6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(0, this);
    }
}
