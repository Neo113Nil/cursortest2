package org.betup.ui.fragment.matches.details;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.presentation.ScreenTracker;
import org.betup.services.language.AppLanguageObserver;

/* loaded from: classes4.dex */
public final class MatchDetailsFragmentK_MembersInjector implements MembersInjector<MatchDetailsFragmentK> {
    private final Provider<AppLanguageObserver> appLanguageObserverProvider;
    private final Provider<MatchDetailsController> controllerProvider;
    private final Provider<ScreenTracker> screenTrackerProvider;

    public MatchDetailsFragmentK_MembersInjector(Provider<MatchDetailsController> controllerProvider, Provider<AppLanguageObserver> appLanguageObserverProvider, Provider<ScreenTracker> screenTrackerProvider) {
        this.controllerProvider = controllerProvider;
        this.appLanguageObserverProvider = appLanguageObserverProvider;
        this.screenTrackerProvider = screenTrackerProvider;
    }

    public static MembersInjector<MatchDetailsFragmentK> create(Provider<MatchDetailsController> controllerProvider, Provider<AppLanguageObserver> appLanguageObserverProvider, Provider<ScreenTracker> screenTrackerProvider) {
        return new MatchDetailsFragmentK_MembersInjector(controllerProvider, appLanguageObserverProvider, screenTrackerProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(MatchDetailsFragmentK instance) {
        injectController(instance, this.controllerProvider.get());
        injectAppLanguageObserver(instance, this.appLanguageObserverProvider.get());
        injectScreenTracker(instance, this.screenTrackerProvider.get());
    }

    public static void injectController(MatchDetailsFragmentK instance, MatchDetailsController controller) {
        instance.controller = controller;
    }

    public static void injectAppLanguageObserver(MatchDetailsFragmentK instance, AppLanguageObserver appLanguageObserver) {
        instance.appLanguageObserver = appLanguageObserver;
    }

    public static void injectScreenTracker(MatchDetailsFragmentK instance, ScreenTracker screenTracker) {
        instance.screenTracker = screenTracker;
    }
}
