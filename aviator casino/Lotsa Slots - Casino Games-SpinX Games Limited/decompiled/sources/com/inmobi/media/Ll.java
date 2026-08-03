package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Ll extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public org.xmlpull.v1.XmlPullParser f4824a;
    public java.lang.String b;
    public kotlin.jvm.functions.Function1 c;
    public /* synthetic */ java.lang.Object d;
    public final /* synthetic */ com.inmobi.media.Wl e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ll(com.inmobi.media.Wl wl, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = wl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a((org.xmlpull.v1.XmlPullParser) null, (java.lang.String) null, (kotlin.jvm.functions.Function1) null, this);
    }
}
