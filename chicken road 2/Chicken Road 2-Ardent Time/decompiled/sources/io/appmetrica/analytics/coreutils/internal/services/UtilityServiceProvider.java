package io.appmetrica.analytics.coreutils.internal.services;

/* loaded from: classes.dex */
public final class UtilityServiceProvider {

    /* renamed from: a, reason: collision with root package name */
    private final h1.InterfaceC0171c f3774a = Q1.l.q(new io.appmetrica.analytics.coreutils.impl.l(this));

    /* renamed from: b, reason: collision with root package name */
    private final io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier f3775b = new io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier();

    public final io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier getActivationBarrier() {
        return this.f3775b;
    }

    public final io.appmetrica.analytics.coreutils.internal.services.FirstExecutionConditionServiceImpl getFirstExecutionService() {
        return (io.appmetrica.analytics.coreutils.internal.services.FirstExecutionConditionServiceImpl) ((h1.C0175g) this.f3774a).a();
    }

    public final void initAsync() {
        this.f3775b.activate();
    }

    public final void updateConfiguration(io.appmetrica.analytics.coreutils.internal.services.UtilityServiceConfiguration utilityServiceConfiguration) {
        getFirstExecutionService().updateConfig(utilityServiceConfiguration);
    }
}
