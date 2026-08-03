package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Jj extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public java.util.List f4785a;
    public android.widget.ImageView b;
    public kotlin.jvm.internal.Ref.BooleanRef c;
    public /* synthetic */ java.lang.Object d;
    public final /* synthetic */ com.inmobi.media.Nj e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Jj(com.inmobi.media.Nj nj, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = nj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a((java.util.List) null, (android.widget.ImageView) null, this);
    }
}
