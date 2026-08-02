package org.betup.model.remote.api.rest.user;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class V7VarietyBetRestrictionsInteractor_Factory implements Factory<V7VarietyBetRestrictionsInteractor> {
    private final Provider<Context> contextProvider;

    public V7VarietyBetRestrictionsInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public V7VarietyBetRestrictionsInteractor get() {
        return new V7VarietyBetRestrictionsInteractor(this.contextProvider.get());
    }

    public static V7VarietyBetRestrictionsInteractor_Factory create(Provider<Context> contextProvider) {
        return new V7VarietyBetRestrictionsInteractor_Factory(contextProvider);
    }
}
