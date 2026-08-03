package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

/* loaded from: classes5.dex */
public final class s {
    public static final int j = 8;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f7521a;
    public final android.graphics.Rect b;
    public final android.graphics.Rect c;
    public final android.graphics.Rect d;
    public final android.graphics.Rect e;
    public final android.graphics.Rect f;
    public final android.graphics.Rect g;
    public final android.graphics.Rect h;
    public final android.graphics.Rect i;

    public s(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.content.Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f7521a = applicationContext;
        this.b = new android.graphics.Rect();
        this.c = new android.graphics.Rect();
        this.d = new android.graphics.Rect();
        this.e = new android.graphics.Rect();
        this.f = new android.graphics.Rect();
        this.g = new android.graphics.Rect();
        this.h = new android.graphics.Rect();
        this.i = new android.graphics.Rect();
    }

    public final void a(android.graphics.Rect rect, android.graphics.Rect rect2) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.a aVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.a.f7494a;
        rect2.set(aVar.f(rect.left, this.f7521a), aVar.f(rect.top, this.f7521a), aVar.f(rect.right, this.f7521a), aVar.f(rect.bottom, this.f7521a));
    }

    public final void b(int i, int i2, int i3, int i4) {
        this.h.set(i, i2, i3 + i, i4 + i2);
        a(this.h, this.i);
    }

    public final void c(int i, int i2, int i3, int i4) {
        this.d.set(i, i2, i3 + i, i4 + i2);
        a(this.d, this.e);
    }

    public final android.graphics.Rect d() {
        return this.i;
    }

    public final android.graphics.Rect e() {
        return this.d;
    }

    public final android.graphics.Rect f() {
        return this.e;
    }

    public final android.graphics.Rect g() {
        return this.c;
    }

    public final android.graphics.Rect b() {
        return this.g;
    }

    public final android.graphics.Rect c() {
        return this.h;
    }

    public final void a(int i, int i2) {
        this.b.set(0, 0, i, i2);
        a(this.b, this.c);
    }

    public final void a(int i, int i2, int i3, int i4) {
        this.f.set(i, i2, i3 + i, i4 + i2);
        a(this.f, this.g);
    }

    public final android.graphics.Rect a() {
        return this.f;
    }
}
