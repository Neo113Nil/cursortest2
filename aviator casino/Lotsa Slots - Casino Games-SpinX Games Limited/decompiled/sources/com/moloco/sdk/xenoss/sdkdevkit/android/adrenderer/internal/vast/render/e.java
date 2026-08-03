package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

/* loaded from: classes5.dex */
public final class e {
    public static final int i = 8;

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y f7906a;
    public final int b;
    public final int c;
    public final java.lang.String d;
    public final java.util.List<java.lang.String> e;
    public final java.util.List<java.lang.String> f;
    public final java.lang.Long g;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r h;

    public e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y resource, int i2, int i3, java.lang.String str, java.util.List<java.lang.String> clickTracking, java.util.List<java.lang.String> viewTracking, java.lang.Long l, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r rVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resource, "resource");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clickTracking, "clickTracking");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewTracking, "viewTracking");
        this.f7906a = resource;
        this.b = i2;
        this.c = i3;
        this.d = str;
        this.e = clickTracking;
        this.f = viewTracking;
        this.g = l;
        this.h = rVar;
    }

    public final java.lang.String a() {
        return this.d;
    }

    public final java.util.List<java.lang.String> b() {
        return this.e;
    }

    public final java.lang.Long c() {
        return this.g;
    }

    public final int d() {
        return this.c;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r e() {
        return this.h;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y f() {
        return this.f7906a;
    }

    public final java.util.List<java.lang.String> g() {
        return this.f;
    }

    public final int h() {
        return this.b;
    }
}
