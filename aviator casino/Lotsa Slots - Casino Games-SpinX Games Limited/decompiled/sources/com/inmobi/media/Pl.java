package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Pl extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.Ref.BooleanRef f4902a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ com.inmobi.media.Wl c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pl(com.inmobi.media.Wl wl, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = wl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((org.xmlpull.v1.XmlPullParser) null, this);
    }
}
