package org.betup.presentation;

import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class ScreenTracker_Factory implements Factory<ScreenTracker> {
    private final Provider<PresentationScreens> presentationScreensProvider;

    public ScreenTracker_Factory(Provider<PresentationScreens> presentationScreensProvider) {
        this.presentationScreensProvider = presentationScreensProvider;
    }

    @Override // javax.inject.Provider
    public ScreenTracker get() {
        return new ScreenTracker(this.presentationScreensProvider.get());
    }

    public static ScreenTracker_Factory create(Provider<PresentationScreens> presentationScreensProvider) {
        return new ScreenTracker_Factory(presentationScreensProvider);
    }
}
