package org.betup.services.scores;

import dagger.internal.Factory;

/* loaded from: classes2.dex */
public final class SubscoreService_Factory implements Factory<SubscoreService> {
    private static final SubscoreService_Factory INSTANCE = new SubscoreService_Factory();

    @Override // javax.inject.Provider
    public SubscoreService get() {
        return new SubscoreService();
    }

    public static SubscoreService_Factory create() {
        return INSTANCE;
    }
}
