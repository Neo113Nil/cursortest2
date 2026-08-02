package androidx.lifecycle;

import java.io.Closeable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f9613a = new LinkedHashMap();

    public final void a() {
        for (S s7 : this.f9613a.values()) {
            s7.f9607c = true;
            HashMap hashMap = s7.f9605a;
            if (hashMap != null) {
                synchronized (hashMap) {
                    try {
                        Iterator it = s7.f9605a.values().iterator();
                        while (it.hasNext()) {
                            S.a(it.next());
                        }
                    } finally {
                    }
                }
            }
            LinkedHashSet linkedHashSet = s7.f9606b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    try {
                        Iterator it2 = s7.f9606b.iterator();
                        while (it2.hasNext()) {
                            S.a((Closeable) it2.next());
                        }
                    } finally {
                    }
                }
                s7.f9606b.clear();
            }
            s7.b();
        }
        this.f9613a.clear();
    }
}
