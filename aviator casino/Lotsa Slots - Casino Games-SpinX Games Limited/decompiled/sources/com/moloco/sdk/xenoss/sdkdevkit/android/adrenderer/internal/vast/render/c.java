package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

/* loaded from: classes5.dex */
public final class c {
    public static final int g = 8;

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y f7822a;
    public final int b;
    public final int c;
    public final java.lang.String d;
    public final java.util.List<java.lang.String> e;
    public final java.util.List<java.lang.String> f;

    public c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y resource, int i, int i2, java.lang.String str, java.util.List<java.lang.String> clickTracking, java.util.List<java.lang.String> creativeViewTracking) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resource, "resource");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clickTracking, "clickTracking");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creativeViewTracking, "creativeViewTracking");
        this.f7822a = resource;
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = clickTracking;
        this.f = creativeViewTracking;
    }

    public final java.lang.String a() {
        return this.d;
    }

    public final java.util.List<java.lang.String> b() {
        return this.e;
    }

    public final java.util.List<java.lang.String> c() {
        return this.f;
    }

    public final int d() {
        return this.c;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y e() {
        return this.f7822a;
    }

    public final int f() {
        return this.b;
    }
}
