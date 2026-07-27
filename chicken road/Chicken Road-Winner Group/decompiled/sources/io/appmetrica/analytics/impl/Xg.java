package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* loaded from: classes.dex */
public final class Xg implements InterfaceC0615k6 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6827a;

    /* renamed from: b, reason: collision with root package name */
    public final C0562i4 f6828b;

    /* renamed from: c, reason: collision with root package name */
    public final IHandlerExecutor f6829c = C0878ua.k().x().e();

    public Xg(Context context, C0562i4 c0562i4) {
        this.f6827a = context;
        this.f6828b = c0562i4;
    }

    public final void a(W5 w5, Bundle bundle) {
        if (w5.m()) {
            return;
        }
        this.f6829c.execute(new RunnableC0782qh(this.f6827a, w5, bundle, this.f6828b));
    }

    public final void a(X3 x3, W5 w5, C0924w4 c0924w4) {
        this.f6828b.a(x3, c0924w4).a(w5, c0924w4);
        this.f6828b.a(x3.f6818b, x3.f6819c, x3.f6820d);
    }
}
