package p000;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class hh0 implements my0 {

    /* JADX INFO: renamed from: a */
    public volatile Set f3210a;

    /* JADX INFO: renamed from: b */
    public volatile Set f3211b;

    @Override // p000.my0
    public final Object get() {
        if (this.f3211b == null) {
            synchronized (this) {
                try {
                    if (this.f3211b == null) {
                        this.f3211b = Collections.newSetFromMap(new ConcurrentHashMap());
                        synchronized (this) {
                            try {
                                Iterator it = this.f3210a.iterator();
                                while (it.hasNext()) {
                                    this.f3211b.add(((my0) it.next()).get());
                                }
                                this.f3210a = null;
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
        return Collections.unmodifiableSet(this.f3211b);
    }
}
