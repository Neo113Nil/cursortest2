package com.moloco.sdk.internal.services;

/* loaded from: classes5.dex */
public final class G implements com.moloco.sdk.internal.services.F {
    public static final int b = 8;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f7204a;

    public G(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.f7204a = context;
    }

    @Override // com.moloco.sdk.internal.services.F
    public com.moloco.sdk.internal.services.E a() {
        com.moloco.sdk.common_adapter_internal.ScreenData invoke = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r.a(this.f7204a).invoke();
        float widthDp = invoke.getWidthDp();
        return new com.moloco.sdk.internal.services.E(invoke.getWidthPx(), widthDp, invoke.getHeightPx(), invoke.getHeightDp(), invoke.getPxRatio(), invoke.getDpi(), this.f7204a.getResources().getDisplayMetrics().xdpi, this.f7204a.getResources().getDisplayMetrics().ydpi);
    }

    @Override // com.moloco.sdk.internal.services.F
    public com.moloco.sdk.internal.services.H b() {
        int i = this.f7204a.getResources().getConfiguration().orientation;
        return i != 1 ? i != 2 ? com.moloco.sdk.internal.services.H.f7205a : com.moloco.sdk.internal.services.H.c : com.moloco.sdk.internal.services.H.b;
    }

    public final android.content.Context c() {
        return this.f7204a;
    }

    @Override // com.moloco.sdk.internal.services.F
    @kotlin.Deprecated(message = "Use screenInfo() instead", replaceWith = @kotlin.ReplaceWith(expression = "screenInfo()", imports = {}))
    public com.moloco.sdk.internal.services.E invoke() {
        return a();
    }
}
