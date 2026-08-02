package org.betup.model.remote.api.rest.interstitial;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class PostInterstitialActionInteractor_Factory implements Factory<PostInterstitialActionInteractor> {
    private final Provider<Context> contextProvider;

    public PostInterstitialActionInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public PostInterstitialActionInteractor get() {
        return new PostInterstitialActionInteractor(this.contextProvider.get());
    }

    public static PostInterstitialActionInteractor_Factory create(Provider<Context> contextProvider) {
        return new PostInterstitialActionInteractor_Factory(contextProvider);
    }
}
