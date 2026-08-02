package org.betup.model.remote.api.rest.support;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class CloseSupportChatInteractor_Factory implements Factory<CloseSupportChatInteractor> {
    private final Provider<Context> contextProvider;

    public CloseSupportChatInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public CloseSupportChatInteractor get() {
        return new CloseSupportChatInteractor(this.contextProvider.get());
    }

    public static CloseSupportChatInteractor_Factory create(Provider<Context> contextProvider) {
        return new CloseSupportChatInteractor_Factory(contextProvider);
    }
}
