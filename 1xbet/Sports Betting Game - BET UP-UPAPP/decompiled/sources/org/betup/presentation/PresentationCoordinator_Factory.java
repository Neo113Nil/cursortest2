package org.betup.presentation;

import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.presentation.GetActivePresentationsInteractor;
import org.betup.model.remote.api.rest.presentation.GetPresentationScreenRegistryInteractor;
import org.betup.model.remote.api.rest.presentation.PostPresentationActionInteractor;

/* loaded from: classes2.dex */
public final class PresentationCoordinator_Factory implements Factory<PresentationCoordinator> {
    private final Provider<GetActivePresentationsInteractor> getActivePresentationsInteractorProvider;
    private final Provider<GetPresentationScreenRegistryInteractor> getScreenRegistryInteractorProvider;
    private final Provider<PostPresentationActionInteractor> postPresentationActionInteractorProvider;
    private final Provider<PresentationScreens> presentationScreensProvider;
    private final Provider<PresentationScreenRegistryStore> screenRegistryStoreProvider;
    private final Provider<ScreenTracker> screenTrackerProvider;

    public PresentationCoordinator_Factory(Provider<GetActivePresentationsInteractor> getActivePresentationsInteractorProvider, Provider<GetPresentationScreenRegistryInteractor> getScreenRegistryInteractorProvider, Provider<PresentationScreenRegistryStore> screenRegistryStoreProvider, Provider<PresentationScreens> presentationScreensProvider, Provider<ScreenTracker> screenTrackerProvider, Provider<PostPresentationActionInteractor> postPresentationActionInteractorProvider) {
        this.getActivePresentationsInteractorProvider = getActivePresentationsInteractorProvider;
        this.getScreenRegistryInteractorProvider = getScreenRegistryInteractorProvider;
        this.screenRegistryStoreProvider = screenRegistryStoreProvider;
        this.presentationScreensProvider = presentationScreensProvider;
        this.screenTrackerProvider = screenTrackerProvider;
        this.postPresentationActionInteractorProvider = postPresentationActionInteractorProvider;
    }

    @Override // javax.inject.Provider
    public PresentationCoordinator get() {
        return new PresentationCoordinator(this.getActivePresentationsInteractorProvider.get(), this.getScreenRegistryInteractorProvider.get(), this.screenRegistryStoreProvider.get(), this.presentationScreensProvider.get(), this.screenTrackerProvider.get(), this.postPresentationActionInteractorProvider.get());
    }

    public static PresentationCoordinator_Factory create(Provider<GetActivePresentationsInteractor> getActivePresentationsInteractorProvider, Provider<GetPresentationScreenRegistryInteractor> getScreenRegistryInteractorProvider, Provider<PresentationScreenRegistryStore> screenRegistryStoreProvider, Provider<PresentationScreens> presentationScreensProvider, Provider<ScreenTracker> screenTrackerProvider, Provider<PostPresentationActionInteractor> postPresentationActionInteractorProvider) {
        return new PresentationCoordinator_Factory(getActivePresentationsInteractorProvider, getScreenRegistryInteractorProvider, screenRegistryStoreProvider, presentationScreensProvider, screenTrackerProvider, postPresentationActionInteractorProvider);
    }
}
