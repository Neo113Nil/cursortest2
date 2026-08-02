package org.betup.model.remote.api.rest.analytics;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class TrackHomeMatchAdClickInteractor_Factory implements Factory<TrackHomeMatchAdClickInteractor> {
    private final Provider<Context> contextProvider;

    public TrackHomeMatchAdClickInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public TrackHomeMatchAdClickInteractor get() {
        return new TrackHomeMatchAdClickInteractor(this.contextProvider.get());
    }

    public static TrackHomeMatchAdClickInteractor_Factory create(Provider<Context> contextProvider) {
        return new TrackHomeMatchAdClickInteractor_Factory(contextProvider);
    }
}
