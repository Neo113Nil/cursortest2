package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.util.l;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes3.dex */
public final class b {
    public final HashMap a = new HashMap();
    public final C0056b b = new C0056b();

    public static class a {
        public final ReentrantLock a = new ReentrantLock();
        public int b;
    }

    /* renamed from: com.bumptech.glide.load.engine.cache.b$b, reason: collision with other inner class name */
    public static class C0056b {
        public final ArrayDeque a = new ArrayDeque();
    }

    public final void a(String str) {
        a aVar;
        synchronized (this) {
            try {
                Object obj = this.a.get(str);
                l.c(obj, "Argument must not be null");
                aVar = (a) obj;
                int i = aVar.b;
                if (i < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.b);
                }
                int i2 = i - 1;
                aVar.b = i2;
                if (i2 == 0) {
                    a aVar2 = (a) this.a.remove(str);
                    if (!aVar2.equals(aVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVar2 + ", safeKey: " + str);
                    }
                    C0056b c0056b = this.b;
                    synchronized (c0056b.a) {
                        try {
                            if (c0056b.a.size() < 10) {
                                c0056b.a.offer(aVar2);
                            }
                        } finally {
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        aVar.a.unlock();
    }
}
