package com.moloco.sdk.internal.publisher.nativead.parser;

/* loaded from: classes5.dex */
public final class b extends java.lang.Exception {
    public static final int c = 8;

    /* renamed from: a, reason: collision with root package name */
    public final int f7145a;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c b;

    public b(int i, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c errorSubType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorSubType, "errorSubType");
        this.f7145a = i;
        this.b = errorSubType;
    }

    public final int a() {
        return this.f7145a;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c b() {
        return this.b;
    }
}
