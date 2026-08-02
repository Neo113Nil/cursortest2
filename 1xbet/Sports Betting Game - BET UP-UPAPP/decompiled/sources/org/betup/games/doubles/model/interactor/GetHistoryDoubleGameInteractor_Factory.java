package org.betup.games.doubles.model.interactor;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GetHistoryDoubleGameInteractor_Factory implements Factory<GetHistoryDoubleGameInteractor> {
    private final Provider<Context> contextProvider;

    public GetHistoryDoubleGameInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetHistoryDoubleGameInteractor get() {
        return new GetHistoryDoubleGameInteractor(this.contextProvider.get());
    }

    public static GetHistoryDoubleGameInteractor_Factory create(Provider<Context> contextProvider) {
        return new GetHistoryDoubleGameInteractor_Factory(contextProvider);
    }
}
