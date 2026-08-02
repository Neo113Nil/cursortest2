package org.betup.model.remote.api.rest.messaging;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GetCommentsInteractor_Factory implements Factory<GetCommentsInteractor> {
    private final Provider<Context> contextProvider;

    public GetCommentsInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetCommentsInteractor get() {
        return new GetCommentsInteractor(this.contextProvider.get());
    }

    public static GetCommentsInteractor_Factory create(Provider<Context> contextProvider) {
        return new GetCommentsInteractor_Factory(contextProvider);
    }
}
