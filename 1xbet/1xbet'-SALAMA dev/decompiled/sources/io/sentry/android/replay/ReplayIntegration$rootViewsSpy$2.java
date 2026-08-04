package io.sentry.android.replay;

import t6.i;

/* JADX INFO: loaded from: classes2.dex */
public final class ReplayIntegration$rootViewsSpy$2 extends i implements s6.a {
    public static final ReplayIntegration$rootViewsSpy$2 INSTANCE = new ReplayIntegration$rootViewsSpy$2();

    public ReplayIntegration$rootViewsSpy$2() {
        super(0);
    }

    @Override // s6.a
    public final RootViewsSpy invoke() {
        return RootViewsSpy.Companion.install();
    }
}
