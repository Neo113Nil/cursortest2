package org.betup.model.remote.api.rest.analytics;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class PostTrackPurchaseInteractor_Factory implements Factory<PostTrackPurchaseInteractor> {
    private final Provider<Context> contextProvider;

    public PostTrackPurchaseInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public PostTrackPurchaseInteractor get() {
        return new PostTrackPurchaseInteractor(this.contextProvider.get());
    }

    public static PostTrackPurchaseInteractor_Factory create(Provider<Context> contextProvider) {
        return new PostTrackPurchaseInteractor_Factory(contextProvider);
    }
}
