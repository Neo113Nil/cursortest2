package com.inmobi.media;

/* renamed from: com.inmobi.media.kl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2544kl extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f5299a;
    public int b;

    public C2544kl(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f5299a = obj;
        this.b |= Integer.MIN_VALUE;
        return com.inmobi.media.C2678pl.a(this);
    }
}
