package org.betup.ui.fragment.bets.quiz;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.quiz.QuizParticipationsInteractor;
import org.betup.model.remote.api.rest.quiz.QuizStateCountInteractor;

/* loaded from: classes4.dex */
public final class QuizResultsController_MembersInjector implements MembersInjector<QuizResultsController> {
    private final Provider<QuizParticipationsInteractor> quizParticipationsInteractorProvider;
    private final Provider<QuizStateCountInteractor> quizStateCountInteractorProvider;

    public QuizResultsController_MembersInjector(Provider<QuizParticipationsInteractor> quizParticipationsInteractorProvider, Provider<QuizStateCountInteractor> quizStateCountInteractorProvider) {
        this.quizParticipationsInteractorProvider = quizParticipationsInteractorProvider;
        this.quizStateCountInteractorProvider = quizStateCountInteractorProvider;
    }

    public static MembersInjector<QuizResultsController> create(Provider<QuizParticipationsInteractor> quizParticipationsInteractorProvider, Provider<QuizStateCountInteractor> quizStateCountInteractorProvider) {
        return new QuizResultsController_MembersInjector(quizParticipationsInteractorProvider, quizStateCountInteractorProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(QuizResultsController instance) {
        injectQuizParticipationsInteractor(instance, this.quizParticipationsInteractorProvider.get());
        injectQuizStateCountInteractor(instance, this.quizStateCountInteractorProvider.get());
    }

    public static void injectQuizParticipationsInteractor(QuizResultsController instance, QuizParticipationsInteractor quizParticipationsInteractor) {
        instance.quizParticipationsInteractor = quizParticipationsInteractor;
    }

    public static void injectQuizStateCountInteractor(QuizResultsController instance, QuizStateCountInteractor quizStateCountInteractor) {
        instance.quizStateCountInteractor = quizStateCountInteractor;
    }
}
