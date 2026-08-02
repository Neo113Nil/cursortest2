package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.user.UpdateV7PushPreferencesInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvideUpdateV7PushPreferencesInteractorFactory implements Factory<UpdateV7PushPreferencesInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvideUpdateV7PushPreferencesInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public UpdateV7PushPreferencesInteractor get() {
        return (UpdateV7PushPreferencesInteractor) Preconditions.checkNotNull(this.module.provideUpdateV7PushPreferencesInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvideUpdateV7PushPreferencesInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvideUpdateV7PushPreferencesInteractorFactory(module, contextProvider);
    }

    public static UpdateV7PushPreferencesInteractor proxyProvideUpdateV7PushPreferencesInteractor(RestModule instance, Context context) {
        return (UpdateV7PushPreferencesInteractor) Preconditions.checkNotNull(instance.provideUpdateV7PushPreferencesInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
