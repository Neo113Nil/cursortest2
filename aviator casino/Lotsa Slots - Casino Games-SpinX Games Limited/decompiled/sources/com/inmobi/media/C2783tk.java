package com.inmobi.media;

/* renamed from: com.inmobi.media.tk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2783tk extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f5470a;
    public final /* synthetic */ com.inmobi.media.C2810uk b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2783tk(com.inmobi.media.C2810uk c2810uk, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c2810uk;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f5470a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(0, this);
    }
}
