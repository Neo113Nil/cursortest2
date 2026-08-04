package p048g4;

import N4.b;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Set f13221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Set f13222b;

    @Override // N4.b
    public final Object get() {
        if (this.f13222b == null) {
            synchronized (this) {
                try {
                    if (this.f13222b == null) {
                        this.f13222b = Collections.newSetFromMap(new ConcurrentHashMap());
                        synchronized (this) {
                            try {
                                Iterator it = this.f13221a.iterator();
                                while (it.hasNext()) {
                                    this.f13222b.add(((b) it.next()).get());
                                }
                                this.f13221a = null;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return Collections.unmodifiableSet(this.f13222b);
    }
}
