package org.betup.model.remote.api.rest.support;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GetV7SupportMessagesInteractor_Factory implements Factory<GetV7SupportMessagesInteractor> {
    private final Provider<Context> contextProvider;

    public GetV7SupportMessagesInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetV7SupportMessagesInteractor get() {
        return new GetV7SupportMessagesInteractor(this.contextProvider.get());
    }

    public static GetV7SupportMessagesInteractor_Factory create(Provider<Context> contextProvider) {
        return new GetV7SupportMessagesInteractor_Factory(contextProvider);
    }
}
