package org.betup.model.remote.api.rest.shop;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GetBetShareInstallLinkInteractor_Factory implements Factory<GetBetShareInstallLinkInteractor> {
    private final Provider<Context> contextProvider;

    public GetBetShareInstallLinkInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetBetShareInstallLinkInteractor get() {
        return new GetBetShareInstallLinkInteractor(this.contextProvider.get());
    }

    public static GetBetShareInstallLinkInteractor_Factory create(Provider<Context> contextProvider) {
        return new GetBetShareInstallLinkInteractor_Factory(contextProvider);
    }
}
