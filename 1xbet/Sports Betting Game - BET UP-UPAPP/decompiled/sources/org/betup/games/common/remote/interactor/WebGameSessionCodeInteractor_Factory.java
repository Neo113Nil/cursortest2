package org.betup.games.common.remote.interactor;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class WebGameSessionCodeInteractor_Factory implements Factory<WebGameSessionCodeInteractor> {
    private final Provider<Context> contextProvider;

    public WebGameSessionCodeInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public WebGameSessionCodeInteractor get() {
        return new WebGameSessionCodeInteractor(this.contextProvider.get());
    }

    public static WebGameSessionCodeInteractor_Factory create(Provider<Context> contextProvider) {
        return new WebGameSessionCodeInteractor_Factory(contextProvider);
    }
}
