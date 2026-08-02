package org.betup.model.remote.api.rest.user;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class ReportDailyQuestClientEventInteractor_Factory implements Factory<ReportDailyQuestClientEventInteractor> {
    private final Provider<Context> contextProvider;

    public ReportDailyQuestClientEventInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public ReportDailyQuestClientEventInteractor get() {
        return new ReportDailyQuestClientEventInteractor(this.contextProvider.get());
    }

    public static ReportDailyQuestClientEventInteractor_Factory create(Provider<Context> contextProvider) {
        return new ReportDailyQuestClientEventInteractor_Factory(contextProvider);
    }
}
