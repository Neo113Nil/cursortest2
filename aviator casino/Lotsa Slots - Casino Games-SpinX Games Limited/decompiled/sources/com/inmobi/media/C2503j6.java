package com.inmobi.media;

/* renamed from: com.inmobi.media.j6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2503j6 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.inmobi.media.Rk f5272a;
    public com.inmobi.media.C2426g6 b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public long g;
    public /* synthetic */ java.lang.Object h;
    public final /* synthetic */ com.inmobi.media.C2662p6 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2503j6(com.inmobi.media.C2662p6 c2662p6, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.i = c2662p6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return com.inmobi.media.C2662p6.a(this.i, false, (kotlin.coroutines.jvm.internal.ContinuationImpl) this);
    }
}
