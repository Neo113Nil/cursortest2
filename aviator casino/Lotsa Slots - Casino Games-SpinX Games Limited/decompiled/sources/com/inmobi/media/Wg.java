package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Wg extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public org.json.JSONObject f5033a;
    public kotlinx.coroutines.sync.Mutex b;
    public /* synthetic */ java.lang.Object c;
    public final /* synthetic */ com.inmobi.media.Xg d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wg(com.inmobi.media.Xg xg, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = xg;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a((org.json.JSONObject) null, this);
    }
}
