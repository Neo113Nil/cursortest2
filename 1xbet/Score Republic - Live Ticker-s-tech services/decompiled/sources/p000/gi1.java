package p000;

import java.io.Closeable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class gi1 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f2759a = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final void m2099a() {
        for (di1 di1Var : this.f2759a.values()) {
            di1Var.getClass();
            HashMap map = di1Var.f1666a;
            if (map != null) {
                synchronized (map) {
                    try {
                        Iterator it = di1Var.f1666a.values().iterator();
                        while (it.hasNext()) {
                            di1.m1227a(it.next());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            LinkedHashSet linkedHashSet = di1Var.f1667b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    try {
                        Iterator it2 = di1Var.f1667b.iterator();
                        while (it2.hasNext()) {
                            di1.m1227a((Closeable) it2.next());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            di1Var.mo1228b();
        }
        this.f2759a.clear();
    }
}
