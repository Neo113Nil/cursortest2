package com.inmobi.media;

/* renamed from: com.inmobi.media.mm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2598mm extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f5342a;
    public final /* synthetic */ com.inmobi.media.C2626nm b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2598mm(com.inmobi.media.C2626nm c2626nm, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c2626nm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f5342a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a((java.lang.String) null, (java.util.ArrayList) null, this);
    }
}
