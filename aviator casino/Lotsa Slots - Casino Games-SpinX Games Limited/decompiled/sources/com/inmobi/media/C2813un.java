package com.inmobi.media;

/* renamed from: com.inmobi.media.un, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2813un extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public int f5494a;
    public int b;
    public /* synthetic */ java.lang.Object c;
    public final /* synthetic */ com.inmobi.media.C2865wn d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2813un(com.inmobi.media.C2865wn c2865wn, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = c2865wn;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return com.inmobi.media.C2865wn.a(this.d, this);
    }
}
