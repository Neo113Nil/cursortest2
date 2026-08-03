package com.inmobi.media;

/* renamed from: com.inmobi.media.po, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2681po extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f5399a;
    public final /* synthetic */ com.inmobi.media.C2707qo b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2681po(com.inmobi.media.C2707qo c2707qo, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c2707qo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f5399a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
