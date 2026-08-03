package com.inmobi.media;

/* renamed from: com.inmobi.media.h4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2450h4 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f5232a;
    public final /* synthetic */ com.inmobi.media.C2580m4 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2450h4(com.inmobi.media.C2580m4 c2580m4, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c2580m4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f5232a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
