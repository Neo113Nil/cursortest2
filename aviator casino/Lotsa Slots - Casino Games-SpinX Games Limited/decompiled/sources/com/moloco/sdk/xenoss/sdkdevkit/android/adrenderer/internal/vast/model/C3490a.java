package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3490a {
    public static final int d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f7767a;
    public final java.lang.Integer b;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.AbstractC3491b c;

    public C3490a(java.lang.String str, java.lang.Integer num, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.AbstractC3491b child) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(child, "child");
        this.f7767a = str;
        this.b = num;
        this.c = child;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.AbstractC3491b a() {
        return this.c;
    }

    public final java.lang.String b() {
        return this.f7767a;
    }

    public final java.lang.Integer c() {
        return this.b;
    }
}
