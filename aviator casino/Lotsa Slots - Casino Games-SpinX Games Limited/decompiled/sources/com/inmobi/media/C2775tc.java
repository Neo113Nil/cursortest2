package com.inmobi.media;

/* renamed from: com.inmobi.media.tc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2775tc {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.C2799u9 f5464a;
    public com.inmobi.media.AbstractC2525k2 b;
    public final com.inmobi.media.ads.nativeAd.MediaView c;
    public final com.inmobi.media.B6 d;
    public final kotlinx.coroutines.flow.MutableSharedFlow e;

    public C2775tc(android.content.Context context, kotlinx.coroutines.CoroutineScope coroutineScope, com.inmobi.media.C2799u9 c2799u9) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f5464a = c2799u9;
        kotlinx.coroutines.flow.MutableSharedFlow MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.c = new com.inmobi.media.ads.nativeAd.MediaView(context);
        this.d = new com.inmobi.media.B6(context, coroutineScope, MutableSharedFlow$default, c2799u9);
        this.e = MutableSharedFlow$default;
    }

    public final java.lang.Object a(com.inmobi.media.C6 c6, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2799u9 c2799u9 = this.f5464a;
        if (c2799u9 != null) {
            c2799u9.a("MediaViewManager", "load called - experienceModel: " + c6);
        }
        return this.b != null ? this.c : kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getIO(), new com.inmobi.media.C2747sc(this, c6, null), continuationImpl);
    }
}
