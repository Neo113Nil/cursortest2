package com.inmobi.media;

/* renamed from: com.inmobi.media.og, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2646og extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public com.inmobi.media.C2409fg f5375a;
    public com.inmobi.media.InterfaceC2620ng b;
    public com.inmobi.media.Zf c;
    public /* synthetic */ java.lang.Object d;
    public final /* synthetic */ com.inmobi.media.AbstractC2699qg e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2646og(com.inmobi.media.AbstractC2699qg abstractC2699qg, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.e = abstractC2699qg;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, null, this);
    }
}
