package org.betup.injection.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import org.betup.services.quiz.QuizTourInfoProvider;

/* loaded from: classes2.dex */
public final class AppModule_ProvideQuizTourInfoProviderFactory implements Factory<QuizTourInfoProvider> {
    private final AppModule module;

    public AppModule_ProvideQuizTourInfoProviderFactory(AppModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public QuizTourInfoProvider get() {
        return (QuizTourInfoProvider) Preconditions.checkNotNull(this.module.provideQuizTourInfoProvider(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static AppModule_ProvideQuizTourInfoProviderFactory create(AppModule module) {
        return new AppModule_ProvideQuizTourInfoProviderFactory(module);
    }

    public static QuizTourInfoProvider proxyProvideQuizTourInfoProvider(AppModule instance) {
        return (QuizTourInfoProvider) Preconditions.checkNotNull(instance.provideQuizTourInfoProvider(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
