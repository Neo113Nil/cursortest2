package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

/* loaded from: classes5.dex */
public final class A {
    public static final int d = 8;

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z f7765a;
    public final java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z> b;
    public final java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z> c;

    public A(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z zVar, java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z> clickTrackingList, java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z> customClickList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clickTrackingList, "clickTrackingList");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customClickList, "customClickList");
        this.f7765a = zVar;
        this.b = clickTrackingList;
        this.c = customClickList;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z a() {
        return this.f7765a;
    }

    public final java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z> b() {
        return this.b;
    }

    public final java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z> c() {
        return this.c;
    }
}
