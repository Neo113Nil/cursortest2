package org.betup.injection.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import org.betup.ui.fragment.matches.filter.MatchFilterState;

/* loaded from: classes2.dex */
public final class AppModule_ProvideMatchFilterStateFactory implements Factory<MatchFilterState> {
    private final AppModule module;

    public AppModule_ProvideMatchFilterStateFactory(AppModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public MatchFilterState get() {
        return (MatchFilterState) Preconditions.checkNotNull(this.module.provideMatchFilterState(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static AppModule_ProvideMatchFilterStateFactory create(AppModule module) {
        return new AppModule_ProvideMatchFilterStateFactory(module);
    }

    public static MatchFilterState proxyProvideMatchFilterState(AppModule instance) {
        return (MatchFilterState) Preconditions.checkNotNull(instance.provideMatchFilterState(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
