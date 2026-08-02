package com.google.android.datatransport.runtime.dagger.internal;

/* loaded from: classes3.dex */
public final class DoubleCheck<T> implements javax.inject.Provider<T>, com.google.android.datatransport.runtime.dagger.Lazy<T> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.lang.Object UNINITIALIZED = new java.lang.Object();
    private volatile java.lang.Object instance = UNINITIALIZED;
    private volatile javax.inject.Provider<T> provider;

    private DoubleCheck(javax.inject.Provider<T> provider) {
        this.provider = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final T get() {
        T t;
        T t2 = (T) this.instance;
        java.lang.Object obj = UNINITIALIZED;
        if (t2 != obj) {
            return t2;
        }
        synchronized (this) {
            t = (T) this.instance;
            if (t == obj) {
                t = this.provider.get();
                this.instance = reentrantCheck(this.instance, t);
                this.provider = null;
            }
        }
        return t;
    }

    private static java.lang.Object reentrantCheck(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == UNINITIALIZED || obj == obj2) {
            return obj2;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Scoped provider was invoked recursively returning different results: ");
        sb.append(obj);
        sb.append(" & ");
        sb.append(obj2);
        sb.append(". This is likely due to a circular dependency.");
        throw new java.lang.IllegalStateException(sb.toString());
    }

    public static <P extends javax.inject.Provider<T>, T> javax.inject.Provider<T> provider(P p) {
        com.google.android.datatransport.runtime.dagger.internal.Preconditions.checkNotNull(p);
        return p instanceof com.google.android.datatransport.runtime.dagger.internal.DoubleCheck ? p : new com.google.android.datatransport.runtime.dagger.internal.DoubleCheck(p);
    }

    public static <P extends javax.inject.Provider<T>, T> com.google.android.datatransport.runtime.dagger.Lazy<T> lazy(P p) {
        if (p instanceof com.google.android.datatransport.runtime.dagger.Lazy) {
            return (com.google.android.datatransport.runtime.dagger.Lazy) p;
        }
        return new com.google.android.datatransport.runtime.dagger.internal.DoubleCheck((javax.inject.Provider) com.google.android.datatransport.runtime.dagger.internal.Preconditions.checkNotNull(p));
    }
}
