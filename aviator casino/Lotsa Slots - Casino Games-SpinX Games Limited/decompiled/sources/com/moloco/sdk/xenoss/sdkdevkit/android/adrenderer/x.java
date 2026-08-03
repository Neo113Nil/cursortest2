package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

/* loaded from: classes5.dex */
public final class x implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c {
    public static final int k = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7980a;
    public final java.lang.Boolean b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final kotlin.jvm.functions.Function2<android.content.Context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i, android.view.View> h;
    public final com.moloco.sdk.internal.ortb.model.C3411a i;
    public final com.moloco.sdk.internal.ortb.model.C3412b j;

    public x() {
        this(false, null, 0, 0, 0, false, false, null, null, null, 1023, null);
    }

    public final com.moloco.sdk.internal.ortb.model.C3411a a() {
        return this.i;
    }

    public final com.moloco.sdk.internal.ortb.model.C3412b b() {
        return this.j;
    }

    public final boolean c() {
        return this.g;
    }

    public final boolean d() {
        return this.f;
    }

    public final int e() {
        return this.d;
    }

    public final int f() {
        return this.e;
    }

    public final java.lang.Boolean g() {
        return this.b;
    }

    public final int h() {
        return this.c;
    }

    public final boolean i() {
        return this.f7980a;
    }

    public final kotlin.jvm.functions.Function2<android.content.Context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i, android.view.View> j() {
        return this.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x(boolean z, java.lang.Boolean bool, int i, int i2, int i3, boolean z2, boolean z3, kotlin.jvm.functions.Function2<? super android.content.Context, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i, ? extends android.view.View> VastRenderer, com.moloco.sdk.internal.ortb.model.C3411a c3411a, com.moloco.sdk.internal.ortb.model.C3412b c3412b) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(VastRenderer, "VastRenderer");
        this.f7980a = z;
        this.b = bool;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = z2;
        this.g = z3;
        this.h = VastRenderer;
        this.i = c3411a;
        this.j = c3412b;
    }

    public /* synthetic */ x(boolean z, java.lang.Boolean bool, int i, int i2, int i3, boolean z2, boolean z3, kotlin.jvm.functions.Function2 function2, com.moloco.sdk.internal.ortb.model.C3411a c3411a, com.moloco.sdk.internal.ortb.model.C3412b c3412b, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? true : z, (i4 & 2) != 0 ? null : bool, (i4 & 4) != 0 ? 5 : i, (i4 & 8) != 0 ? 5 : i2, (i4 & 16) == 0 ? i3 : 5, (i4 & 32) != 0 ? false : z2, (i4 & 64) == 0 ? z3 : false, (i4 & 128) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n.a(0L, (kotlin.jvm.functions.Function2) null, (kotlin.jvm.functions.Function2) null, (kotlin.jvm.functions.Function2) null, (kotlin.jvm.functions.Function2) null, (kotlin.jvm.functions.Function2) null, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.i) null, (kotlin.jvm.functions.Function2) null, (kotlin.jvm.functions.Function2) null, (kotlin.jvm.functions.Function2) null, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q) null, false, 4095, (java.lang.Object) null) : function2, (i4 & 256) != 0 ? null : c3411a, (i4 & 512) == 0 ? c3412b : null);
    }
}
