package org.betup.injection.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import org.betup.ui.fragment.user.FollowersDialogController;

/* loaded from: classes2.dex */
public final class AppModule_ProvideFollowersDialogControllerFactory implements Factory<FollowersDialogController> {
    private final AppModule module;

    public AppModule_ProvideFollowersDialogControllerFactory(AppModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public FollowersDialogController get() {
        return (FollowersDialogController) Preconditions.checkNotNull(this.module.provideFollowersDialogController(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static AppModule_ProvideFollowersDialogControllerFactory create(AppModule module) {
        return new AppModule_ProvideFollowersDialogControllerFactory(module);
    }

    public static FollowersDialogController proxyProvideFollowersDialogController(AppModule instance) {
        return (FollowersDialogController) Preconditions.checkNotNull(instance.provideFollowersDialogController(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
