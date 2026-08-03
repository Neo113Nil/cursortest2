package com.inmobi.media;

/* renamed from: com.inmobi.media.n7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2611n7 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public kotlinx.coroutines.sync.Mutex f5352a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ com.inmobi.media.C2690q7 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2611n7(com.inmobi.media.C2690q7 c2690q7, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = c2690q7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.d(this);
    }
}
