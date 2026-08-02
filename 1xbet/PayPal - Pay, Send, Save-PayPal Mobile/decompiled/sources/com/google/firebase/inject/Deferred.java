package com.google.firebase.inject;

/* loaded from: classes9.dex */
public interface Deferred<T> {

    public interface DeferredHandler<T> {
        void handle(com.google.firebase.inject.Provider<T> provider);
    }

    void whenAvailable(com.google.firebase.inject.Deferred.DeferredHandler<T> deferredHandler);
}
