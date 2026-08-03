package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Im extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.inmobi.media.core.config.models.AdConfig.VastVideoConfig f4770a;
    public /* synthetic */ java.lang.Object b;
    public int c;

    public Im(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return com.inmobi.media.Nm.a(null, 0.0d, null, this);
    }
}
