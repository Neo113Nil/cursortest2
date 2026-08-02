package androidx.lifecycle;

import java.io.Closeable;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class S {
    private final F1.d impl = new F1.d();

    public final void addCloseable(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        kotlin.jvm.internal.l.f("key", str);
        kotlin.jvm.internal.l.f("closeable", autoCloseable);
        F1.d dVar = this.impl;
        if (dVar != null) {
            if (dVar.f1526d) {
                F1.d.b(autoCloseable);
                return;
            }
            synchronized (dVar.f1523a) {
                autoCloseable2 = (AutoCloseable) dVar.f1524b.put(str, autoCloseable);
            }
            F1.d.b(autoCloseable2);
        }
    }

    public final void clear$lifecycle_viewmodel() {
        F1.d dVar = this.impl;
        if (dVar != null && !dVar.f1526d) {
            dVar.f1526d = true;
            synchronized (dVar.f1523a) {
                try {
                    Iterator it = dVar.f1524b.values().iterator();
                    while (it.hasNext()) {
                        F1.d.b((AutoCloseable) it.next());
                    }
                    Iterator it2 = dVar.f1525c.iterator();
                    while (it2.hasNext()) {
                        F1.d.b((AutoCloseable) it2.next());
                    }
                    dVar.f1525c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        onCleared();
    }

    public final <T extends AutoCloseable> T getCloseable(String str) {
        T t5;
        kotlin.jvm.internal.l.f("key", str);
        F1.d dVar = this.impl;
        if (dVar == null) {
            return null;
        }
        synchronized (dVar.f1523a) {
            t5 = (T) dVar.f1524b.get(str);
        }
        return t5;
    }

    public void onCleared() {
    }

    public void addCloseable(AutoCloseable autoCloseable) {
        kotlin.jvm.internal.l.f("closeable", autoCloseable);
        F1.d dVar = this.impl;
        if (dVar != null) {
            dVar.a(autoCloseable);
        }
    }

    @W3.a
    public /* synthetic */ void addCloseable(Closeable closeable) {
        kotlin.jvm.internal.l.f("closeable", closeable);
        F1.d dVar = this.impl;
        if (dVar != null) {
            dVar.a(closeable);
        }
    }
}
