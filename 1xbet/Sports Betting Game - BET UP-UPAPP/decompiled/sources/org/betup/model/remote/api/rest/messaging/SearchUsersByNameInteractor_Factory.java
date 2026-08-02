package org.betup.model.remote.api.rest.messaging;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class SearchUsersByNameInteractor_Factory implements Factory<SearchUsersByNameInteractor> {
    private final Provider<Context> contextProvider;

    public SearchUsersByNameInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public SearchUsersByNameInteractor get() {
        return new SearchUsersByNameInteractor(this.contextProvider.get());
    }

    public static SearchUsersByNameInteractor_Factory create(Provider<Context> contextProvider) {
        return new SearchUsersByNameInteractor_Factory(contextProvider);
    }
}
