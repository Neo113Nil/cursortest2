package org.betup.model.remote.api.rest.user;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class V7UpdateTutorialCompleteInteractor_Factory implements Factory<V7UpdateTutorialCompleteInteractor> {
    private final Provider<Context> contextProvider;

    public V7UpdateTutorialCompleteInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public V7UpdateTutorialCompleteInteractor get() {
        return new V7UpdateTutorialCompleteInteractor(this.contextProvider.get());
    }

    public static V7UpdateTutorialCompleteInteractor_Factory create(Provider<Context> contextProvider) {
        return new V7UpdateTutorialCompleteInteractor_Factory(contextProvider);
    }
}
