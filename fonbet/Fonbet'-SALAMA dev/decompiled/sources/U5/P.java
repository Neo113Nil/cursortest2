package U5;

import W5.C0536r1;
import d6.C0991y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class P {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f6438c;

    /* renamed from: d, reason: collision with root package name */
    public static P f6439d;

    /* renamed from: e, reason: collision with root package name */
    public static final List f6440e;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f6441a = new LinkedHashSet();

    /* renamed from: b, reason: collision with root package name */
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
            arrayList.add(C0991y.class);
        } catch (ClassNotFoundException e8) {
            logger.log(Level.FINE, "Unable to find round-robin LoadBalancer", (Throwable) e8);
        }
        f6440e = Collections.unmodifiableList(arrayList);
    }

    public static synchronized P a() {
        P p5;
        synchronized (P.class) {
            try {
                if (f6439d == null) {
                    List<O> k7 = AbstractC0438e.k(O.class, f6440e, O.class.getClassLoader(), new C0443j(6));
                    f6439d = new P();
                    for (O o7 : k7) {
                        f6438c.fine("Service loader found " + o7);
                        P p7 = f6439d;
                        synchronized (p7) {
                            p3.f.d("isAvailable() returned false", o7.c());
                            p7.f6441a.add(o7);
                        }
                    }
                    f6439d.c();
                }
                p5 = f6439d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return p5;
    }

    public final synchronized O b(String str) {
        LinkedHashMap linkedHashMap;
        linkedHashMap = this.f6442b;
        p3.f.k(str, "policy");
        return (O) linkedHashMap.get(str);
    }

    public final synchronized void c() {
        try {
            this.f6442b.clear();
            Iterator it = this.f6441a.iterator();
            while (it.hasNext()) {
                O o7 = (O) it.next();
                String a2 = o7.a();
                O o8 = (O) this.f6442b.get(a2);
                if (o8 != null && o8.b() >= o7.b()) {
                }
                this.f6442b.put(a2, o7);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
