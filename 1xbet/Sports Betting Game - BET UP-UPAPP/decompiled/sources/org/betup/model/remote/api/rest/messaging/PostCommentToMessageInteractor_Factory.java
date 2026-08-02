package org.betup.model.remote.api.rest.messaging;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class PostCommentToMessageInteractor_Factory implements Factory<PostCommentToMessageInteractor> {
    private final Provider<Context> contextProvider;

    public PostCommentToMessageInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public PostCommentToMessageInteractor get() {
        return new PostCommentToMessageInteractor(this.contextProvider.get());
    }

    public static PostCommentToMessageInteractor_Factory create(Provider<Context> contextProvider) {
        return new PostCommentToMessageInteractor_Factory(contextProvider);
    }
}
