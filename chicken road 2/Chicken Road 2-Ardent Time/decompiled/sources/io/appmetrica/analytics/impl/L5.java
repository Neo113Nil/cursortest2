package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class L5 extends io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.DataSource {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0365fm f4580a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider f4581b;

    public L5(io.appmetrica.analytics.impl.C0365fm c0365fm, io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider sdkEnvironmentProvider, io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers platformIdentifiers, java.lang.Object obj) {
        super(new io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers(c0365fm.c(), c0365fm.a(), c0365fm.b()), sdkEnvironmentProvider, platformIdentifiers, obj);
        this.f4580a = c0365fm;
        this.f4581b = sdkEnvironmentProvider;
    }
}
