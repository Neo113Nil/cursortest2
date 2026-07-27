package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* loaded from: classes.dex */
public final class S5 extends BaseRequestConfig.DataSource {

    /* renamed from: a, reason: collision with root package name */
    public final C0754jm f7418a;

    /* renamed from: b, reason: collision with root package name */
    public final SdkEnvironmentProvider f7419b;

    public S5(C0754jm c0754jm, SdkEnvironmentProvider sdkEnvironmentProvider, PlatformIdentifiers platformIdentifiers, Object obj) {
        super(new SdkIdentifiers(c0754jm.c(), c0754jm.a(), c0754jm.b()), sdkEnvironmentProvider, platformIdentifiers, obj);
        this.f7418a = c0754jm;
        this.f7419b = sdkEnvironmentProvider;
    }
}
