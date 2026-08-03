package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

/* loaded from: classes5.dex */
public final class f {
    public static final int c = 8;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f7772a;
    public final java.util.List<java.lang.String> b;

    public f(java.lang.String clickThroughUrl, java.util.List<java.lang.String> clickTrackingUrls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clickThroughUrl, "clickThroughUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clickTrackingUrls, "clickTrackingUrls");
        this.f7772a = clickThroughUrl;
        this.b = clickTrackingUrls;
    }

    public final java.lang.String a() {
        return this.f7772a;
    }

    public final java.util.List<java.lang.String> b() {
        return this.b;
    }
}
