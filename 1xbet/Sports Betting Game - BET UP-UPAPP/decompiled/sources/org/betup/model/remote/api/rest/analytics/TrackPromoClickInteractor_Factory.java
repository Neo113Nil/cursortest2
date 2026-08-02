package org.betup.model.remote.api.rest.analytics;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class TrackPromoClickInteractor_Factory implements Factory<TrackPromoClickInteractor> {
    private final Provider<Context> contextProvider;

    public TrackPromoClickInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public TrackPromoClickInteractor get() {
        return new TrackPromoClickInteractor(this.contextProvider.get());
    }

    public static TrackPromoClickInteractor_Factory create(Provider<Context> contextProvider) {
        return new TrackPromoClickInteractor_Factory(contextProvider);
    }
}
