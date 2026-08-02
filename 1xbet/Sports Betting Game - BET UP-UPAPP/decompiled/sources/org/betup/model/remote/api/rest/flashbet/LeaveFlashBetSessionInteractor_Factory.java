package org.betup.model.remote.api.rest.flashbet;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class LeaveFlashBetSessionInteractor_Factory implements Factory<LeaveFlashBetSessionInteractor> {
    private final Provider<Context> contextProvider;

    public LeaveFlashBetSessionInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public LeaveFlashBetSessionInteractor get() {
        return new LeaveFlashBetSessionInteractor(this.contextProvider.get());
    }

    public static LeaveFlashBetSessionInteractor_Factory create(Provider<Context> contextProvider) {
        return new LeaveFlashBetSessionInteractor_Factory(contextProvider);
    }
}
