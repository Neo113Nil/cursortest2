package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Jm extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4788a;
    public int b;

    public Jm(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f4788a = obj;
        this.b |= Integer.MIN_VALUE;
        return com.inmobi.media.Nm.a(null, null, this);
    }
}
