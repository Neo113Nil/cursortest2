package io.appmetrica.analytics.coreutils.internal.services;

import d2.C0277g;
import d2.InterfaceC0273c;
import io.appmetrica.analytics.coreutils.impl.l;

/* loaded from: classes.dex */
public final class UtilityServiceProvider {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0273c f5457a = new C0277g(new l(this));

    /* renamed from: b, reason: collision with root package name */
    private final WaitForActivationDelayBarrier f5458b = new WaitForActivationDelayBarrier();

    public final WaitForActivationDelayBarrier getActivationBarrier() {
        return this.f5458b;
    }

    public final FirstExecutionConditionServiceImpl getFirstExecutionService() {
        return (FirstExecutionConditionServiceImpl) ((C0277g) this.f5457a).a();
    }

    public final void initAsync() {
        this.f5458b.activate();
    }

    public final void updateConfiguration(UtilityServiceConfiguration utilityServiceConfiguration) {
        getFirstExecutionService().updateConfig(utilityServiceConfiguration);
    }
}
