package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* loaded from: classes.dex */
public final class S5 extends BaseRequestConfig.DataSource {

    /* renamed from: a, reason: collision with root package name */
    public final C0605jm f6552a;

    /* renamed from: b, reason: collision with root package name */
    public final SdkEnvironmentProvider f6553b;

    public S5(C0605jm c0605jm, SdkEnvironmentProvider sdkEnvironmentProvider, PlatformIdentifiers platformIdentifiers, Object obj) {
        super(new SdkIdentifiers(c0605jm.c(), c0605jm.a(), c0605jm.b()), sdkEnvironmentProvider, platformIdentifiers, obj);
        this.f6552a = c0605jm;
        this.f6553b = sdkEnvironmentProvider;
    }
}
