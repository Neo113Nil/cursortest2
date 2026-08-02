package org.betup.model.remote.api.rest.support;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class CreateSupportChatInteractor_Factory implements Factory<CreateSupportChatInteractor> {
    private final Provider<Context> contextProvider;

    public CreateSupportChatInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public CreateSupportChatInteractor get() {
        return new CreateSupportChatInteractor(this.contextProvider.get());
    }

    public static CreateSupportChatInteractor_Factory create(Provider<Context> contextProvider) {
        return new CreateSupportChatInteractor_Factory(contextProvider);
    }
}
