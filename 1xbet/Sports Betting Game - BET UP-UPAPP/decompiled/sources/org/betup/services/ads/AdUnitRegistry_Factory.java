package org.betup.services.ads;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class AdUnitRegistry_Factory implements Factory<AdUnitRegistry> {
    private final Provider<Context> contextProvider;

    public AdUnitRegistry_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public AdUnitRegistry get() {
        return new AdUnitRegistry(this.contextProvider.get());
    }

    public static AdUnitRegistry_Factory create(Provider<Context> contextProvider) {
        return new AdUnitRegistry_Factory(contextProvider);
    }
}
