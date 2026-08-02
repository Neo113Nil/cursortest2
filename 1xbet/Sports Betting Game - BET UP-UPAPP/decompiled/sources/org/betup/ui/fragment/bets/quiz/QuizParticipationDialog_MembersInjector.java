package org.betup.ui.fragment.bets.quiz;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.matches.details.GetParticipationInteractor;

/* loaded from: classes4.dex */
public final class QuizParticipationDialog_MembersInjector implements MembersInjector<QuizParticipationDialog> {
    private final Provider<GetParticipationInteractor> getParticipationInteractorProvider;

    public QuizParticipationDialog_MembersInjector(Provider<GetParticipationInteractor> getParticipationInteractorProvider) {
        this.getParticipationInteractorProvider = getParticipationInteractorProvider;
    }

    public static MembersInjector<QuizParticipationDialog> create(Provider<GetParticipationInteractor> getParticipationInteractorProvider) {
        return new QuizParticipationDialog_MembersInjector(getParticipationInteractorProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(QuizParticipationDialog instance) {
        injectGetParticipationInteractor(instance, this.getParticipationInteractorProvider.get());
    }

    public static void injectGetParticipationInteractor(QuizParticipationDialog instance, GetParticipationInteractor getParticipationInteractor) {
        instance.getParticipationInteractor = getParticipationInteractor;
    }
}
