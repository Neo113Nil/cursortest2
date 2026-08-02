package org.betup.model.remote.api.rest.user;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class CancelAccountDeletionRequestInteractor_Factory implements Factory<CancelAccountDeletionRequestInteractor> {
    private final Provider<Context> contextProvider;

    public CancelAccountDeletionRequestInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public CancelAccountDeletionRequestInteractor get() {
        return new CancelAccountDeletionRequestInteractor(this.contextProvider.get());
    }

    public static CancelAccountDeletionRequestInteractor_Factory create(Provider<Context> contextProvider) {
        return new CancelAccountDeletionRequestInteractor_Factory(contextProvider);
    }
}
