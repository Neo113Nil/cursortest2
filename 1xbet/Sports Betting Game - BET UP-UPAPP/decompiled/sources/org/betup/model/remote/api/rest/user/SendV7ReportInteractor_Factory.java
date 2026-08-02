package org.betup.model.remote.api.rest.user;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class SendV7ReportInteractor_Factory implements Factory<SendV7ReportInteractor> {
    private final Provider<Context> contextProvider;

    public SendV7ReportInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public SendV7ReportInteractor get() {
        return new SendV7ReportInteractor(this.contextProvider.get());
    }

    public static SendV7ReportInteractor_Factory create(Provider<Context> contextProvider) {
        return new SendV7ReportInteractor_Factory(contextProvider);
    }
}
