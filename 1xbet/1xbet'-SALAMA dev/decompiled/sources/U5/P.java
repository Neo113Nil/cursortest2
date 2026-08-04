package U5;

import W5.C0536r1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class P {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f6438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static P f6439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List f6440e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f6441a = new LinkedHashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f6442b = new LinkedHashMap();

    static {
        Logger logger = Logger.getLogger(P.class.getName());
        f6438c = logger;
        ArrayList arrayList = new ArrayList();
        try {
            boolean z4 = C0536r1.f7322a;
            arrayList.add(C0536r1.class);
        } catch (ClassNotFoundException e7) {
            logger.log(Level.WARNING, "Unable to find pick-first LoadBalancer", (Throwable) e7);
        }
        try {
            arrayList.add(p028d6.y.class);
        } catch (ClassNotFoundException e8) {
            logger.log(Level.FINE, "Unable to find round-robin LoadBalancer", (Throwable) e8);
        }
        f6440e = Collections.unmodifiableList(arrayList);
    }

    public static synchronized P a() {
        try {
            if (f6439d == null) {
                List<O> listK = AbstractC0438e.k(O.class, f6440e, O.class.getClassLoader(), new C0443j(6));
                f6439d = new P();
                for (O o7 : listK) {
                    f6438c.fine("Service loader found " + o7);
                    P p5 = f6439d;
                    synchronized (p5) {
                        p113p3.f.d("isAvailable() returned false", o7.c());
                        p5.f6441a.add(o7);
                    }
                }
                f6439d.c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f6439d;
    }

    public final synchronized O b(String str) {
        LinkedHashMap linkedHashMap;
        linkedHashMap = this.f6442b;
        p113p3.f.k(str, "policy");
        return (O) linkedHashMap.get(str);
    }

    public final synchronized void c() {
        try {
            this.f6442b.clear();
            for (O o7 : this.f6441a) {
                String strA = o7.a();
                O o8 = (O) this.f6442b.get(strA);
                if (o8 == null || o8.b() < o7.b()) {
                    this.f6442b.put(strA, o7);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
