package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

/* loaded from: classes5.dex */
public final class m {
    public static final int c = 8;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f7779a;
    public final java.util.List<java.lang.String> b;

    public m(java.lang.String clickThroughUrl, java.util.List<java.lang.String> clickTrackingUrlList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clickThroughUrl, "clickThroughUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clickTrackingUrlList, "clickTrackingUrlList");
        this.f7779a = clickThroughUrl;
        this.b = clickTrackingUrlList;
    }

    public final java.lang.String a() {
        return this.f7779a;
    }

    public final java.util.List<java.lang.String> b() {
        return this.b;
    }
}
