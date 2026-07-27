package com.chartboost.sdk.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f3 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4763a;

    public f3(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f4763a = context;
    }

    public final int a() {
        return h5.f(this.f4763a);
    }

    public final String b() {
        return h5.g(this.f4763a).b();
    }

    public final g5 c() {
        Context context = this.f4763a;
        g5 g5Var = !h5.d(context) ? g5.d : h5.e(context) ? g5.e : h5.c(context) ? g5.f : g5.c;
        mb.a("NETWORK TYPE: " + g5Var, (Throwable) null, 2, (Object) null);
        return g5Var;
    }

    public final boolean d() {
        return c() == g5.f;
    }

    public final boolean e() {
        return h5.d(this.f4763a);
    }

    public final rd f() {
        return h5.g(this.f4763a);
    }
}
