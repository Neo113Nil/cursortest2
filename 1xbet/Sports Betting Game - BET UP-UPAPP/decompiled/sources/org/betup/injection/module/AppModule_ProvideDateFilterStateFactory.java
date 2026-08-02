package org.betup.injection.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import org.betup.ui.fragment.matches.filter.DateFilterState;

/* loaded from: classes2.dex */
public final class AppModule_ProvideDateFilterStateFactory implements Factory<DateFilterState> {
    private final AppModule module;

    public AppModule_ProvideDateFilterStateFactory(AppModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public DateFilterState get() {
        return (DateFilterState) Preconditions.checkNotNull(this.module.provideDateFilterState(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static AppModule_ProvideDateFilterStateFactory create(AppModule module) {
        return new AppModule_ProvideDateFilterStateFactory(module);
    }

    public static DateFilterState proxyProvideDateFilterState(AppModule instance) {
        return (DateFilterState) Preconditions.checkNotNull(instance.provideDateFilterState(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
