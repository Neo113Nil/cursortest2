package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Rl extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.Ref.BooleanRef f4942a;
    public kotlin.jvm.internal.Ref.BooleanRef b;
    public /* synthetic */ java.lang.Object c;
    public final /* synthetic */ com.inmobi.media.Wl d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rl(com.inmobi.media.Wl wl, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = wl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return com.inmobi.media.Wl.b(this.d, (org.xmlpull.v1.XmlPullParser) null, this);
    }
}
