package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Wm extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public android.media.MediaPlayer f5038a;
    public com.inmobi.media.InterfaceC2772t9 b;
    public java.util.Iterator c;
    public java.lang.String d;
    public /* synthetic */ java.lang.Object e;
    public int f;

    public Wm(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.e = obj;
        this.f |= Integer.MIN_VALUE;
        return com.inmobi.media.AbstractC2364dn.a((android.media.MediaPlayer) null, (java.util.ArrayList) null, (com.inmobi.media.C2799u9) null, this);
    }
}
