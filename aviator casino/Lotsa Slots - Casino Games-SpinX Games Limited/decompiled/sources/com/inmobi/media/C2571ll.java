package com.inmobi.media;

/* renamed from: com.inmobi.media.ll, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2571ll extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f5321a;
    public final /* synthetic */ com.inmobi.media.C2678pl b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2571ll(com.inmobi.media.C2678pl c2678pl, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c2678pl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f5321a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
