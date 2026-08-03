package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0214a0 extends io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0240b0 f5443a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f5444b;

    public C0214a0(io.appmetrica.analytics.impl.C0240b0 c0240b0, android.content.Context context) {
        this.f5443a = c0240b0;
        this.f5444b = context;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        io.appmetrica.analytics.impl.C0240b0 c0240b0 = this.f5443a;
        android.content.Context context = this.f5444b;
        c0240b0.getClass();
        c0240b0.a(context, io.appmetrica.analytics.AppMetricaLibraryAdapterConfig.newConfigBuilder().build());
    }
}
