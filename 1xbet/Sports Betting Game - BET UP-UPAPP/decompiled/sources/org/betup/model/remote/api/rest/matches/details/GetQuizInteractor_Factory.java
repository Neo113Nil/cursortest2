package org.betup.model.remote.api.rest.matches.details;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GetQuizInteractor_Factory implements Factory<GetQuizInteractor> {
    private final Provider<Context> contextProvider;

    public GetQuizInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetQuizInteractor get() {
        return new GetQuizInteractor(this.contextProvider.get());
    }

    public static GetQuizInteractor_Factory create(Provider<Context> contextProvider) {
        return new GetQuizInteractor_Factory(contextProvider);
    }
}
