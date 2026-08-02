package org.betup.injection.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import org.betup.ui.fragment.search.controller.SearchController;

/* loaded from: classes2.dex */
public final class AppModule_ProvideSearchControllerFactory implements Factory<SearchController> {
    private final AppModule module;

    public AppModule_ProvideSearchControllerFactory(AppModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public SearchController get() {
        return (SearchController) Preconditions.checkNotNull(this.module.provideSearchController(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static AppModule_ProvideSearchControllerFactory create(AppModule module) {
        return new AppModule_ProvideSearchControllerFactory(module);
    }

    public static SearchController proxyProvideSearchController(AppModule instance) {
        return (SearchController) Preconditions.checkNotNull(instance.provideSearchController(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
