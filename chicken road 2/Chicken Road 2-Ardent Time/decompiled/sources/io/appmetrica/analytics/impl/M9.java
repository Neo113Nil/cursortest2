package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class M9 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f4653a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Vm f4654b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.W2 f4655c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.coreutils.internal.services.SafePackageManager f4656d;

    public M9(android.content.Context context, io.appmetrica.analytics.impl.Vm vm, io.appmetrica.analytics.impl.W2 w2, io.appmetrica.analytics.coreutils.internal.services.SafePackageManager safePackageManager) {
        this.f4653a = context;
        this.f4654b = vm;
        this.f4655c = w2;
        this.f4656d = safePackageManager;
    }

    public M9(android.content.Context context) {
        this(context, new io.appmetrica.analytics.impl.Vm(context, "io.appmetrica.analytics.build_id"), new io.appmetrica.analytics.impl.W2(context, "io.appmetrica.analytics.is_offline"), new io.appmetrica.analytics.coreutils.internal.services.SafePackageManager());
    }
}
