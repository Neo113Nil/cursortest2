package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import android.content.Context;
import android.view.View;
import com.moloco.sdk.internal.ortb.model.C4778a;
import com.moloco.sdk.internal.ortb.model.C4779b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class y implements InterfaceC4813c {
    public static final int l = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11580a;
    public final Boolean b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final Function2<Context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i, View> h;
    public final C4778a i;
    public final C4779b j;
    public final g k;

    public y() {
        this(false, null, 0, 0, 0, false, false, null, null, null, null, 2047, null);
    }

    public final g a() {
        return this.k;
    }

    public final C4778a b() {
        return this.i;
    }

    public final C4779b c() {
        return this.j;
    }

    public final boolean d() {
        return this.g;
    }

    public final boolean e() {
        return this.f;
    }

    public final int f() {
        return this.d;
    }

    public final int g() {
        return this.e;
    }

    public final Boolean h() {
        return this.b;
    }

    public final int i() {
        return this.c;
    }

    public final boolean j() {
        return this.f11580a;
    }

    public final Function2<Context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i, View> k() {
        return this.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y(boolean z, Boolean bool, int i, int i2, int i3, boolean z2, boolean z3, Function2<? super Context, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i, ? extends View> VastRenderer, C4778a c4778a, C4779b c4779b, g adaptiveBlurConfig) {
        Intrinsics.checkNotNullParameter(VastRenderer, "VastRenderer");
        Intrinsics.checkNotNullParameter(adaptiveBlurConfig, "adaptiveBlurConfig");
        this.f11580a = z;
        this.b = bool;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = z2;
        this.g = z3;
        this.h = VastRenderer;
        this.i = c4778a;
        this.j = c4779b;
        this.k = adaptiveBlurConfig;
    }

    public /* synthetic */ y(boolean z, Boolean bool, int i, int i2, int i3, boolean z2, boolean z3, Function2 function2, C4778a c4778a, C4779b c4779b, g gVar, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? true : z, (i4 & 2) != 0 ? null : bool, (i4 & 4) != 0 ? 5 : i, (i4 & 8) != 0 ? 5 : i2, (i4 & 16) == 0 ? i3 : 5, (i4 & 32) != 0 ? false : z2, (i4 & 64) == 0 ? z3 : false, (i4 & 128) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x.a(0L, (Function2) null, (Function2) null, (Function2) null, (Function2) null, (Function2) null, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o) null, (Function2) null, (Function2) null, (Function2) null, (Q) null, false, 4095, (Object) null) : function2, (i4 & 256) != 0 ? null : c4778a, (i4 & 512) == 0 ? c4779b : null, (i4 & 1024) != 0 ? new g(false, 0.0f, 0, 0, 15, null) : gVar);
    }
}
