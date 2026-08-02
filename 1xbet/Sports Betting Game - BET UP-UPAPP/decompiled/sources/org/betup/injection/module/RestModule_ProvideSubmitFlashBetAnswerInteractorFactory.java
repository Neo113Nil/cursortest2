package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.flashbet.SubmitFlashBetAnswerInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvideSubmitFlashBetAnswerInteractorFactory implements Factory<SubmitFlashBetAnswerInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvideSubmitFlashBetAnswerInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public SubmitFlashBetAnswerInteractor get() {
        return (SubmitFlashBetAnswerInteractor) Preconditions.checkNotNull(this.module.provideSubmitFlashBetAnswerInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvideSubmitFlashBetAnswerInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvideSubmitFlashBetAnswerInteractorFactory(module, contextProvider);
    }

    public static SubmitFlashBetAnswerInteractor proxyProvideSubmitFlashBetAnswerInteractor(RestModule instance, Context context) {
        return (SubmitFlashBetAnswerInteractor) Preconditions.checkNotNull(instance.provideSubmitFlashBetAnswerInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
