package org.betup.services.menu;

import dagger.internal.Factory;

/* loaded from: classes2.dex */
public final class MatchTabHolder_Factory implements Factory<MatchTabHolder> {
    private static final MatchTabHolder_Factory INSTANCE = new MatchTabHolder_Factory();

    @Override // javax.inject.Provider
    public MatchTabHolder get() {
        return new MatchTabHolder();
    }

    public static MatchTabHolder_Factory create() {
        return INSTANCE;
    }
}
