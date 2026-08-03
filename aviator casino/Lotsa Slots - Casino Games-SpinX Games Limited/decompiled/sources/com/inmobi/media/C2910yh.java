package com.inmobi.media;

/* renamed from: com.inmobi.media.yh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2910yh extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f5572a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ com.inmobi.media.C2935zh c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2910yh(com.inmobi.media.C2935zh c2935zh, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = c2935zh;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
