package X5;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;
import p6.k;

/* loaded from: classes.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f34082a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final b f34083b = new b();

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        final ReentrantLock f34084a = new ReentrantLock();

        /* renamed from: b, reason: collision with root package name */
        int f34085b;

        a() {
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayDeque f34086a = new ArrayDeque();

        b() {
        }

        final a a() {
            a aVar;
            synchronized (this.f34086a) {
                aVar = (a) this.f34086a.poll();
            }
            return aVar == null ? new a() : aVar;
        }

        final void b(a aVar) {
            synchronized (this.f34086a) {
                try {
                    if (this.f34086a.size() < 10) {
                        this.f34086a.offer(aVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    c() {
    }

    final void a(String str) {
        a aVar;
        synchronized (this) {
            try {
                aVar = (a) this.f34082a.get(str);
                if (aVar == null) {
                    aVar = this.f34083b.a();
                    this.f34082a.put(str, aVar);
                }
                aVar.f34085b++;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        aVar.f34084a.lock();
    }

    final void b(String str) {
        a aVar;
        synchronized (this) {
            try {
                Object obj = this.f34082a.get(str);
                k.c(obj, "Argument must not be null");
                aVar = (a) obj;
                int i11 = aVar.f34085b;
                if (i11 < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f34085b);
                }
                int i12 = i11 - 1;
                aVar.f34085b = i12;
                if (i12 == 0) {
                    a aVar2 = (a) this.f34082a.remove(str);
                    if (!aVar2.equals(aVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVar2 + ", safeKey: " + str);
                    }
                    this.f34083b.b(aVar2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        aVar.f34084a.unlock();
    }
}
