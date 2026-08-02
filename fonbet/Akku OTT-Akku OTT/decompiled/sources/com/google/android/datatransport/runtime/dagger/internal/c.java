package com.google.android.datatransport.runtime.dagger.internal;

/* loaded from: classes.dex */
public final class c<T> implements b<T> {
    public final T a;

    public c(T t) {
        this.a = t;
    }

    @Override // javax.inject.a
    public final T get() {
        return this.a;
    }
}
