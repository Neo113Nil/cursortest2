package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class g {
    public static final int c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f11498a;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r b;

    public g(String url, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r offset) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(offset, "offset");
        this.f11498a = url;
        this.b = offset;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r a() {
        return this.b;
    }

    public final String b() {
        return this.f11498a;
    }
}
