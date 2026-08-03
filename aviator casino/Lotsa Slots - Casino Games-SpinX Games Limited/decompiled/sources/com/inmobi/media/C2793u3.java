package com.inmobi.media;

/* renamed from: com.inmobi.media.u3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2793u3 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.inmobi.media.V2 f5478a;
    public com.inmobi.media.C2260a0 b;
    public com.inmobi.media.InterfaceC2772t9 c;
    public /* synthetic */ java.lang.Object d;
    public final /* synthetic */ com.inmobi.media.A3 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2793u3(com.inmobi.media.A3 a3, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = a3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, null, null, this);
    }
}
