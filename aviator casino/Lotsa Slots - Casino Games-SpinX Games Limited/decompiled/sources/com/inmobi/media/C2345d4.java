package com.inmobi.media;

/* renamed from: com.inmobi.media.d4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2345d4 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f5152a;
    public final /* synthetic */ com.inmobi.media.C2370e4 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2345d4(com.inmobi.media.C2370e4 c2370e4, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c2370e4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f5152a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
