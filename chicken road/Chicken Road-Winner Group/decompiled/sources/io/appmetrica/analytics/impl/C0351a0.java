package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0351a0 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0377b0 f6927a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f6928b;

    public C0351a0(C0377b0 c0377b0, Context context) {
        this.f6927a = c0377b0;
        this.f6928b = context;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C0377b0 c0377b0 = this.f6927a;
        Context context = this.f6928b;
        c0377b0.getClass();
        c0377b0.a(context, AppMetricaLibraryAdapterConfig.newConfigBuilder().build());
    }
}
