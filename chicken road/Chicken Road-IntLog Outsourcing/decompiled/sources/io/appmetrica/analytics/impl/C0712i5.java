package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.i5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0712i5 {

    /* renamed from: a, reason: collision with root package name */
    public final X4 f8385a;

    /* renamed from: b, reason: collision with root package name */
    public final C0662g7 f8386b;

    public C0712i5(Context context, X4 x42) {
        this(x42, C0662g7.a(context));
    }

    public final C0541bf a() {
        return new C0541bf(this.f8386b.b(this.f8385a));
    }

    public C0712i5(X4 x42, C0662g7 c0662g7) {
        this.f8385a = x42;
        this.f8386b = c0662g7;
    }
}
