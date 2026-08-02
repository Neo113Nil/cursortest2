package org.betup.services.language;

import dagger.internal.Factory;

/* loaded from: classes2.dex */
public final class DefaultAppLanguageObserver_Factory implements Factory<DefaultAppLanguageObserver> {
    private static final DefaultAppLanguageObserver_Factory INSTANCE = new DefaultAppLanguageObserver_Factory();

    @Override // javax.inject.Provider
    public DefaultAppLanguageObserver get() {
        return new DefaultAppLanguageObserver();
    }

    public static DefaultAppLanguageObserver_Factory create() {
        return INSTANCE;
    }
}
