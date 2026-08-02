package org.betup.model.remote.api.rest.user;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class UpdateV7PushPreferencesInteractor_Factory implements Factory<UpdateV7PushPreferencesInteractor> {
    private final Provider<Context> contextProvider;

    public UpdateV7PushPreferencesInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public UpdateV7PushPreferencesInteractor get() {
        return new UpdateV7PushPreferencesInteractor(this.contextProvider.get());
    }

    public static UpdateV7PushPreferencesInteractor_Factory create(Provider<Context> contextProvider) {
        return new UpdateV7PushPreferencesInteractor_Factory(contextProvider);
    }
}
