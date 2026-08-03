package com.inmobi.media;

/* renamed from: com.inmobi.media.s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2733s extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f5434a;
    public final /* synthetic */ com.inmobi.media.C2841w b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2733s(com.inmobi.media.C2841w c2841w, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c2841w;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f5434a = obj;
        this.c |= Integer.MIN_VALUE;
        return com.inmobi.media.C2841w.a(this.b, null, null, 0, this);
    }
}
