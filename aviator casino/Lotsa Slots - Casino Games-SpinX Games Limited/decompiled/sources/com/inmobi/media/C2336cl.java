package com.inmobi.media;

/* renamed from: com.inmobi.media.cl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2336cl extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public org.json.JSONObject f5146a;
    public kotlinx.coroutines.sync.Mutex b;
    public /* synthetic */ java.lang.Object c;
    public final /* synthetic */ com.inmobi.media.C2362dl d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2336cl(com.inmobi.media.C2362dl c2362dl, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = c2362dl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
