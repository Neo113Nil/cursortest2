package com.inmobi.media;

/* renamed from: com.inmobi.media.bl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2308bl extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public int f5128a;
    public java.lang.String b;
    public kotlinx.coroutines.sync.Mutex c;
    public /* synthetic */ java.lang.Object d;
    public final /* synthetic */ com.inmobi.media.C2362dl e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2308bl(com.inmobi.media.C2362dl c2362dl, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = c2362dl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(0, null, this);
    }
}
