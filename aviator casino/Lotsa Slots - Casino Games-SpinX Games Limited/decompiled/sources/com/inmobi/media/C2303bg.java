package com.inmobi.media;

/* renamed from: com.inmobi.media.bg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2303bg extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f5124a;
    public final /* synthetic */ com.inmobi.media.C2331cg b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2303bg(com.inmobi.media.C2331cg c2331cg, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c2331cg;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f5124a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
