package org.betup.injection.provider;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class PreferencesProvider_Factory implements Factory<PreferencesProvider> {
    private final Provider<Context> contextProvider;

    public PreferencesProvider_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public PreferencesProvider get() {
        return new PreferencesProvider(this.contextProvider.get());
    }

    public static PreferencesProvider_Factory create(Provider<Context> contextProvider) {
        return new PreferencesProvider_Factory(contextProvider);
    }
}
