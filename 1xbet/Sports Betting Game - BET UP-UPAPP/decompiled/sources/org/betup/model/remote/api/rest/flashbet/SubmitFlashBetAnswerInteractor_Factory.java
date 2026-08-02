package org.betup.model.remote.api.rest.flashbet;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class SubmitFlashBetAnswerInteractor_Factory implements Factory<SubmitFlashBetAnswerInteractor> {
    private final Provider<Context> contextProvider;

    public SubmitFlashBetAnswerInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public SubmitFlashBetAnswerInteractor get() {
        return new SubmitFlashBetAnswerInteractor(this.contextProvider.get());
    }

    public static SubmitFlashBetAnswerInteractor_Factory create(Provider<Context> contextProvider) {
        return new SubmitFlashBetAnswerInteractor_Factory(contextProvider);
    }
}
