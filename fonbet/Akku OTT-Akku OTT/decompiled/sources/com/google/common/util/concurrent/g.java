package com.google.common.util.concurrent;

import com.google.common.util.concurrent.a;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;

/* loaded from: classes4.dex */
public abstract class g<OutputT> extends a.i<OutputT> {
    public static final a c;
    public static final t d = new t(g.class);
    public volatile Set<Throwable> a;
    public volatile int b;

    public static abstract class a {
        public abstract int a(f fVar);
    }

    public static final class b extends a {
        public final AtomicIntegerFieldUpdater<? super g<?>> a;

        public b(AtomicReferenceFieldUpdater<? super g<?>, ? super Set<Throwable>> atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater<? super g<?>> atomicIntegerFieldUpdater) {
            this.a = atomicIntegerFieldUpdater;
        }

        @Override // com.google.common.util.concurrent.g.a
        public final int a(f fVar) {
            return this.a.decrementAndGet(fVar);
        }
    }

    public static final class c extends a {
        @Override // com.google.common.util.concurrent.g.a
        public final int a(f fVar) {
            int i;
            synchronized (fVar) {
                i = fVar.b - 1;
                fVar.b = i;
            }
            return i;
        }
    }

    static {
        Throwable th;
        a cVar;
        try {
            cVar = new b(AtomicReferenceFieldUpdater.newUpdater(g.class, Set.class, "a"), AtomicIntegerFieldUpdater.newUpdater(g.class, "b"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            cVar = new c();
        }
        c = cVar;
        if (th != null) {
            d.a().log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }
}
