package org.betup.injection.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import org.betup.ui.fragment.home.controller.TrackedOverlayDismissRegistry;

/* loaded from: classes2.dex */
public final class AppModule_ProvideTrackedOverlayDismissRegistryFactory implements Factory<TrackedOverlayDismissRegistry> {
    private final AppModule module;

    public AppModule_ProvideTrackedOverlayDismissRegistryFactory(AppModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public TrackedOverlayDismissRegistry get() {
        return (TrackedOverlayDismissRegistry) Preconditions.checkNotNull(this.module.provideTrackedOverlayDismissRegistry(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static AppModule_ProvideTrackedOverlayDismissRegistryFactory create(AppModule module) {
        return new AppModule_ProvideTrackedOverlayDismissRegistryFactory(module);
    }

    public static TrackedOverlayDismissRegistry proxyProvideTrackedOverlayDismissRegistry(AppModule instance) {
        return (TrackedOverlayDismissRegistry) Preconditions.checkNotNull(instance.provideTrackedOverlayDismissRegistry(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
