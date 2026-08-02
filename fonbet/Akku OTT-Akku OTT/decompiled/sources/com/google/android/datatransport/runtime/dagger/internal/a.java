package com.google.android.datatransport.runtime.dagger.internal;

/* loaded from: classes.dex */
public final class a<T> implements javax.inject.a<T> {
    public static final Object c = new Object();
    public volatile b a;
    public volatile Object b;

    public static javax.inject.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        a aVar = new a();
        aVar.b = c;
        aVar.a = bVar;
        return aVar;
    }

    @Override // javax.inject.a
    public final T get() {
        T t;
        T t2 = (T) this.b;
        Object obj = c;
        if (t2 != obj) {
            return t2;
        }
        synchronized (this) {
            try {
                t = (T) this.b;
                if (t == obj) {
                    t = this.a.get();
                    Object obj2 = this.b;
                    if (obj2 != obj && obj2 != t) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + t + ". This is likely due to a circular dependency.");
                    }
                    this.b = t;
                    this.a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }
}
