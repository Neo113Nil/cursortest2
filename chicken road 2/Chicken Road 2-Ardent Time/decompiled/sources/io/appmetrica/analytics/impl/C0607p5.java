package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.p5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0607p5 implements io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f6632a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0445j f6633b = io.appmetrica.analytics.impl.C0560na.k().b();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.EnumSet f6634c = java.util.EnumSet.of(io.appmetrica.analytics.coreapi.internal.system.NetworkType.OFFLINE);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f6635d = "connection based";

    public C0607p5(android.content.Context context) {
        this.f6632a = context;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final boolean canBeExecuted() {
        io.appmetrica.analytics.impl.C0445j c0445j = this.f6633b;
        android.content.Context context = this.f6632a;
        c0445j.getClass();
        io.appmetrica.analytics.impl.Ce ce = io.appmetrica.analytics.impl.Ge.f4329a;
        return !this.f6634c.contains((io.appmetrica.analytics.coreapi.internal.system.NetworkType) io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils.accessSystemServiceSafelyOrDefault((android.net.ConnectivityManager) context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", io.appmetrica.analytics.coreapi.internal.system.NetworkType.UNDEFINED, new io.appmetrica.analytics.impl.Fe()));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final java.lang.String description() {
        return this.f6635d;
    }
}
