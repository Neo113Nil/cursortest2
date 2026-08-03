package com.google.firebase.components;

/* loaded from: classes3.dex */
public interface ComponentContainer {
    <T> T get(com.google.firebase.components.Qualified<T> qualified);

    <T> T get(java.lang.Class<T> cls);

    <T> com.google.firebase.inject.Deferred<T> getDeferred(com.google.firebase.components.Qualified<T> qualified);

    <T> com.google.firebase.inject.Deferred<T> getDeferred(java.lang.Class<T> cls);

    <T> com.google.firebase.inject.Provider<T> getProvider(com.google.firebase.components.Qualified<T> qualified);

    <T> com.google.firebase.inject.Provider<T> getProvider(java.lang.Class<T> cls);

    <T> java.util.Set<T> setOf(com.google.firebase.components.Qualified<T> qualified);

    <T> java.util.Set<T> setOf(java.lang.Class<T> cls);

    <T> com.google.firebase.inject.Provider<java.util.Set<T>> setOfProvider(com.google.firebase.components.Qualified<T> qualified);

    <T> com.google.firebase.inject.Provider<java.util.Set<T>> setOfProvider(java.lang.Class<T> cls);

    /* renamed from: com.google.firebase.components.ComponentContainer$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static java.lang.Object $default$get(com.google.firebase.components.ComponentContainer _this, com.google.firebase.components.Qualified qualified) {
            com.google.firebase.inject.Provider provider = _this.getProvider(qualified);
            if (provider == null) {
                return null;
            }
            return provider.get();
        }

        public static java.util.Set $default$setOf(com.google.firebase.components.ComponentContainer _this, com.google.firebase.components.Qualified qualified) {
            return (java.util.Set) _this.setOfProvider(qualified).get();
        }
    }
}
