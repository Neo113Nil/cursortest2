package g4;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: g4.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1141n implements N4.b {

    /* renamed from: a, reason: collision with root package name */
    public volatile Set f13215a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Set f13216b;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003f, code lost:
    
        throw r0;
     */
    @Override // N4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get() {
        if (this.f13216b == null) {
            synchronized (this) {
                try {
                    if (this.f13216b == null) {
                        this.f13216b = Collections.newSetFromMap(new ConcurrentHashMap());
                        synchronized (this) {
                            Iterator it = this.f13215a.iterator();
                            while (it.hasNext()) {
                                this.f13216b.add(((N4.b) it.next()).get());
                            }
                            this.f13215a = null;
                        }
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.f13216b);
    }
}
