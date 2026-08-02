package org.betup.ui.fragment.bets.quiz;

import dagger.MembersInjector;
import javax.inject.Provider;

/* loaded from: classes4.dex */
public final class QuizResultsFragment_MembersInjector implements MembersInjector<QuizResultsFragment> {
    private final Provider<QuizResultsController> controllerProvider;

    public QuizResultsFragment_MembersInjector(Provider<QuizResultsController> controllerProvider) {
        this.controllerProvider = controllerProvider;
    }

    public static MembersInjector<QuizResultsFragment> create(Provider<QuizResultsController> controllerProvider) {
        return new QuizResultsFragment_MembersInjector(controllerProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(QuizResultsFragment instance) {
        injectController(instance, this.controllerProvider.get());
    }

    public static void injectController(QuizResultsFragment instance, QuizResultsController controller) {
        instance.controller = controller;
    }
}
