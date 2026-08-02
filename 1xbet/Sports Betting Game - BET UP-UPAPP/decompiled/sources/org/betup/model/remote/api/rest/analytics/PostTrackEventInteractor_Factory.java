package org.betup.model.remote.api.rest.analytics;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class PostTrackEventInteractor_Factory implements Factory<PostTrackEventInteractor> {
    private final Provider<Context> contextProvider;

    public PostTrackEventInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public PostTrackEventInteractor get() {
        return new PostTrackEventInteractor(this.contextProvider.get());
    }

    public static PostTrackEventInteractor_Factory create(Provider<Context> contextProvider) {
        return new PostTrackEventInteractor_Factory(contextProvider);
    }
}
