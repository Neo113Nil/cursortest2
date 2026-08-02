package org.betup.model.remote.api.rest.messaging;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class PostReactionToMessageInteractor_Factory implements Factory<PostReactionToMessageInteractor> {
    private final Provider<Context> contextProvider;

    public PostReactionToMessageInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public PostReactionToMessageInteractor get() {
        return new PostReactionToMessageInteractor(this.contextProvider.get());
    }

    public static PostReactionToMessageInteractor_Factory create(Provider<Context> contextProvider) {
        return new PostReactionToMessageInteractor_Factory(contextProvider);
    }
}
