package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class W3 implements io.appmetrica.analytics.modulesapi.internal.client.ModuleServiceConfig {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers f5186a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f5187b;

    public W3(io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers sdkIdentifiers, java.lang.Object obj) {
        this.f5186a = sdkIdentifiers;
        this.f5187b = obj;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleServiceConfig
    public final java.lang.Object getFeaturesConfig() {
        return this.f5187b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleServiceConfig
    public final io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers getIdentifiers() {
        return this.f5186a;
    }
}
