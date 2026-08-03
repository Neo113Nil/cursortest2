package com.inmobi.media;

/* renamed from: com.inmobi.media.r0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2708r0 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f5415a;
    public final /* synthetic */ com.inmobi.media.C2734s0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2708r0(com.inmobi.media.C2734s0 c2734s0, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c2734s0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f5415a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, this);
    }
}
