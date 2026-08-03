package com.inmobi.media;

/* renamed from: com.inmobi.media.kk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2543kk extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f5298a;
    public int b;

    public C2543kk(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f5298a = obj;
        this.b |= Integer.MIN_VALUE;
        return com.inmobi.media.C2624nk.b(this);
    }
}
