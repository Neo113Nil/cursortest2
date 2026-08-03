package com.inmobi.media;

/* renamed from: com.inmobi.media.f7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2400f7 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public int f5194a;
    public java.util.List b;
    public /* synthetic */ java.lang.Object c;
    public final /* synthetic */ com.inmobi.media.C2690q7 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2400f7(com.inmobi.media.C2690q7 c2690q7, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = c2690q7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(this);
    }
}
