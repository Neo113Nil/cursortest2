package org.betup.ui.fragment.bets.quiz;

import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.quiz.QuizParticipationsInteractor;
import org.betup.model.remote.api.rest.quiz.QuizStateCountInteractor;

/* loaded from: classes4.dex */
public final class QuizResultsController_Factory implements Factory<QuizResultsController> {
    private final Provider<QuizParticipationsInteractor> quizParticipationsInteractorProvider;
    private final Provider<QuizStateCountInteractor> quizStateCountInteractorProvider;

    public QuizResultsController_Factory(Provider<QuizParticipationsInteractor> quizParticipationsInteractorProvider, Provider<QuizStateCountInteractor> quizStateCountInteractorProvider) {
        this.quizParticipationsInteractorProvider = quizParticipationsInteractorProvider;
        this.quizStateCountInteractorProvider = quizStateCountInteractorProvider;
    }

    @Override // javax.inject.Provider
    public QuizResultsController get() {
        QuizResultsController quizResultsController = new QuizResultsController();
        QuizResultsController_MembersInjector.injectQuizParticipationsInteractor(quizResultsController, this.quizParticipationsInteractorProvider.get());
        QuizResultsController_MembersInjector.injectQuizStateCountInteractor(quizResultsController, this.quizStateCountInteractorProvider.get());
        return quizResultsController;
    }

    public static QuizResultsController_Factory create(Provider<QuizParticipationsInteractor> quizParticipationsInteractorProvider, Provider<QuizStateCountInteractor> quizStateCountInteractorProvider) {
        return new QuizResultsController_Factory(quizParticipationsInteractorProvider, quizStateCountInteractorProvider);
    }

    public static QuizResultsController newQuizResultsController() {
        return new QuizResultsController();
    }
}
