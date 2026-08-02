package org.betup.model.remote.api.rest.support;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GetSupportChatReadStatusInteractor_Factory implements Factory<GetSupportChatReadStatusInteractor> {
    private final Provider<Context> contextProvider;

    public GetSupportChatReadStatusInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetSupportChatReadStatusInteractor get() {
        return new GetSupportChatReadStatusInteractor(this.contextProvider.get());
    }

    public static GetSupportChatReadStatusInteractor_Factory create(Provider<Context> contextProvider) {
        return new GetSupportChatReadStatusInteractor_Factory(contextProvider);
    }
}
