package org.betup.model.remote.api.rest.presentation;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class PostPresentationActionInteractor_Factory implements Factory<PostPresentationActionInteractor> {
    private final Provider<Context> contextProvider;

    public PostPresentationActionInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public PostPresentationActionInteractor get() {
        return new PostPresentationActionInteractor(this.contextProvider.get());
    }

    public static PostPresentationActionInteractor_Factory create(Provider<Context> contextProvider) {
        return new PostPresentationActionInteractor_Factory(contextProvider);
    }
}
