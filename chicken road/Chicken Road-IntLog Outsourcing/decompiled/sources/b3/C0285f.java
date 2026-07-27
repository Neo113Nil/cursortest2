package b3;

import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: b3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0285f extends g {
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r0 == java.lang.ClassLoader.getSystemClassLoader().getParent()) goto L9;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0285f() {
        super(r1, new ConcurrentHashMap());
        boolean z;
        ClassLoader classLoader = C0284e.class.getClassLoader();
        if (classLoader != null) {
            z = false;
            try {
                if (classLoader != ClassLoader.getSystemClassLoader()) {
                }
            } catch (Throwable unused) {
            }
        }
        z = true;
    }

    @Override // b3.AbstractRunnableC0283d
    public final Object b(Object obj) {
        while (true) {
            Reference poll = poll();
            if (poll == null) {
                return super.b(obj);
            }
            this.f4824a.remove(poll);
        }
    }

    @Override // b3.g, b3.AbstractRunnableC0283d
    public final C0284e c(Object obj) {
        C0284e c0284e = this.f4828b ? (C0284e) g.f4827c.get() : new C0284e();
        c0284e.f4825a = obj;
        c0284e.f4826b = System.identityHashCode(obj);
        return c0284e;
    }

    @Override // b3.AbstractRunnableC0283d
    public final Object d(Object obj, Object obj2) {
        while (true) {
            Reference poll = poll();
            if (poll == null) {
                return super.d(obj, obj2);
            }
            this.f4824a.remove(poll);
        }
    }

    @Override // b3.g, b3.AbstractRunnableC0283d
    public final void e(Object obj) {
        C0284e c0284e = (C0284e) obj;
        c0284e.f4825a = null;
        c0284e.f4826b = 0;
    }

    @Override // b3.AbstractRunnableC0283d, java.lang.Iterable
    public final Iterator iterator() {
        while (true) {
            Reference poll = poll();
            if (poll == null) {
                return super.iterator();
            }
            this.f4824a.remove(poll);
        }
    }
}
