package org.betup.injection.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import org.betup.ui.fragment.user.UserDetailsController;

/* loaded from: classes2.dex */
public final class AppModule_ProvideUserDetailsControllerFactory implements Factory<UserDetailsController> {
    private final AppModule module;

    public AppModule_ProvideUserDetailsControllerFactory(AppModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public UserDetailsController get() {
        return (UserDetailsController) Preconditions.checkNotNull(this.module.provideUserDetailsController(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static AppModule_ProvideUserDetailsControllerFactory create(AppModule module) {
        return new AppModule_ProvideUserDetailsControllerFactory(module);
    }

    public static UserDetailsController proxyProvideUserDetailsController(AppModule instance) {
        return (UserDetailsController) Preconditions.checkNotNull(instance.provideUserDetailsController(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
