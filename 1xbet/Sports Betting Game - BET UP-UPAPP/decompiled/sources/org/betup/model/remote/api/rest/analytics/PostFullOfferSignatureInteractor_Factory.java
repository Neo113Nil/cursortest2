package org.betup.model.remote.api.rest.analytics;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class PostFullOfferSignatureInteractor_Factory implements Factory<PostFullOfferSignatureInteractor> {
    private final Provider<Context> contextProvider;

    public PostFullOfferSignatureInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public PostFullOfferSignatureInteractor get() {
        return new PostFullOfferSignatureInteractor(this.contextProvider.get());
    }

    public static PostFullOfferSignatureInteractor_Factory create(Provider<Context> contextProvider) {
        return new PostFullOfferSignatureInteractor_Factory(contextProvider);
    }
}
