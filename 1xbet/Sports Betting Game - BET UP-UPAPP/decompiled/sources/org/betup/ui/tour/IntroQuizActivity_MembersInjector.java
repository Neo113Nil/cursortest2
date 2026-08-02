package org.betup.ui.tour;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.services.quiz.QuizTourInfoProvider;

/* loaded from: classes4.dex */
public final class IntroQuizActivity_MembersInjector implements MembersInjector<IntroQuizActivity> {
    private final Provider<QuizTourInfoProvider> quizTourInfoProvider;

    public IntroQuizActivity_MembersInjector(Provider<QuizTourInfoProvider> quizTourInfoProvider) {
        this.quizTourInfoProvider = quizTourInfoProvider;
    }

    public static MembersInjector<IntroQuizActivity> create(Provider<QuizTourInfoProvider> quizTourInfoProvider) {
        return new IntroQuizActivity_MembersInjector(quizTourInfoProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(IntroQuizActivity instance) {
        injectQuizTourInfoProvider(instance, this.quizTourInfoProvider.get());
    }

    public static void injectQuizTourInfoProvider(IntroQuizActivity instance, QuizTourInfoProvider quizTourInfoProvider) {
        instance.quizTourInfoProvider = quizTourInfoProvider;
    }
}
