package org.betup.model.remote.api.rest.support;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class SendV7SupportMessageInteractor_Factory implements Factory<SendV7SupportMessageInteractor> {
    private final Provider<Context> contextProvider;

    public SendV7SupportMessageInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public SendV7SupportMessageInteractor get() {
        return new SendV7SupportMessageInteractor(this.contextProvider.get());
    }

    public static SendV7SupportMessageInteractor_Factory create(Provider<Context> contextProvider) {
        return new SendV7SupportMessageInteractor_Factory(contextProvider);
    }
}
