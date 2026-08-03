package com.inmobi.media;

/* renamed from: com.inmobi.media.d2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class HandlerC2343d2 extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.ads.InMobiBanner f5150a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HandlerC2343d2(com.inmobi.ads.InMobiBanner mInmobiBanner) {
        super(looper);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mInmobiBanner, "mInmobiBanner");
        android.os.Looper looper = android.os.Looper.getMainLooper();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(looper, "getMainLooper(...)");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mInmobiBanner, "mInmobiBanner");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(looper, "looper");
        this.f5150a = mInmobiBanner;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message msg) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "msg");
        if (msg.what == 1) {
            this.f5150a.refreshBanner$media_release();
        } else {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("d2", "TAG");
            int i = msg.what;
        }
    }
}
