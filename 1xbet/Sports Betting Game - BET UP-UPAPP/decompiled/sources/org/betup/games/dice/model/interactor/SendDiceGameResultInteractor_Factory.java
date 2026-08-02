package org.betup.games.dice.model.interactor;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class SendDiceGameResultInteractor_Factory implements Factory<SendDiceGameResultInteractor> {
    private final Provider<Context> contextProvider;

    public SendDiceGameResultInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public SendDiceGameResultInteractor get() {
        return new SendDiceGameResultInteractor(this.contextProvider.get());
    }

    public static SendDiceGameResultInteractor_Factory create(Provider<Context> contextProvider) {
        return new SendDiceGameResultInteractor_Factory(contextProvider);
    }
}
