package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.i5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0563i5 {

    /* renamed from: a, reason: collision with root package name */
    public final X4 f7478a;

    /* renamed from: b, reason: collision with root package name */
    public final C0513g7 f7479b;

    public C0563i5(Context context, X4 x4) {
        this(x4, C0513g7.a(context));
    }

    public final C0392bf a() {
        return new C0392bf(this.f7479b.b(this.f7478a));
    }

    public C0563i5(X4 x4, C0513g7 c0513g7) {
        this.f7478a = x4;
        this.f7479b = c0513g7;
    }
}
