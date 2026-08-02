package com.google.firebase.sessions.dagger.internal;

import javax.inject.a;

/* loaded from: classes4.dex */
public final class Providers {
    private Providers() {
    }

    public static <T> Provider<T> asDaggerProvider(final a<T> aVar) {
        Preconditions.checkNotNull(aVar);
        return new Provider<T>() { // from class: com.google.firebase.sessions.dagger.internal.Providers.1
            @Override // com.google.firebase.sessions.dagger.internal.Provider, javax.inject.a
            public T get() {
                return (T) a.this.get();
            }
        };
    }
}
