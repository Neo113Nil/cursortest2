package com.inmobi.media;

/* renamed from: com.inmobi.media.lg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2566lg extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public java.util.Iterator f5317a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ com.inmobi.media.C2592mg c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2566lg(com.inmobi.media.C2592mg c2592mg, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = c2592mg;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((java.lang.String) null, this);
    }
}
