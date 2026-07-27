package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class i implements InterfaceC4813c {
    public static final int d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final y f10887a;
    public final f b;
    public final f c;

    public i(y vastOptions, f mraidOptions, f staticOptions) {
        Intrinsics.checkNotNullParameter(vastOptions, "vastOptions");
        Intrinsics.checkNotNullParameter(mraidOptions, "mraidOptions");
        Intrinsics.checkNotNullParameter(staticOptions, "staticOptions");
        this.f10887a = vastOptions;
        this.b = mraidOptions;
        this.c = staticOptions;
    }

    public final f a() {
        return this.b;
    }

    public final f b() {
        return this.c;
    }

    public final y c() {
        return this.f10887a;
    }
}
