package com.inmobi.media;

/* renamed from: com.inmobi.media.z4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2922z4 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f5582a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ com.inmobi.media.B4 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2922z4(com.inmobi.media.B4 b4, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = b4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, null, null, this);
    }
}
