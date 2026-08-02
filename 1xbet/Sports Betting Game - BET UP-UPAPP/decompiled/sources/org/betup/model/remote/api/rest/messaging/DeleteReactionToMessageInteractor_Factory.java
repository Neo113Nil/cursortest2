package org.betup.model.remote.api.rest.messaging;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class DeleteReactionToMessageInteractor_Factory implements Factory<DeleteReactionToMessageInteractor> {
    private final Provider<Context> contextProvider;

    public DeleteReactionToMessageInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public DeleteReactionToMessageInteractor get() {
        return new DeleteReactionToMessageInteractor(this.contextProvider.get());
    }

    public static DeleteReactionToMessageInteractor_Factory create(Provider<Context> contextProvider) {
        return new DeleteReactionToMessageInteractor_Factory(contextProvider);
    }
}
