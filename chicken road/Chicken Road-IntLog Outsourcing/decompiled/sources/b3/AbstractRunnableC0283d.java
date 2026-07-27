package b3;

import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: b3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC0283d extends ReferenceQueue implements Runnable, Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f4824a;

    public AbstractRunnableC0283d(ConcurrentHashMap concurrentHashMap) {
        this.f4824a = concurrentHashMap;
    }

    public Object b(Object obj) {
        obj.getClass();
        C0284e c2 = c(obj);
        try {
            Object obj2 = this.f4824a.get(c2);
            if (obj2 == null) {
                return null;
            }
            return obj2;
        } finally {
            e(c2);
        }
    }

    public abstract C0284e c(Object obj);

    public Object d(Object obj, Object obj2) {
        if (obj == null) {
            throw null;
        }
        return this.f4824a.put(new C0282c(obj, this), obj2);
    }

    public abstract void e(Object obj);

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new C0280a(this, this.f4824a.entrySet().iterator());
    }

    public void run() {
        while (!Thread.interrupted()) {
            try {
                this.f4824a.remove(remove());
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    public final String toString() {
        return this.f4824a.toString();
    }
}
