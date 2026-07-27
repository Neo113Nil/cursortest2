package sg.bigo.ads.h0;

import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f12955a = new HashMap();

    public static void a(C5228a c5228a) {
        c5228a.e = "It's remove !!!";
        if (c5228a.d != 6) {
            c5228a.d = 7;
            e.b.a(c5228a.f12950a);
        }
        e eVar = e.b;
        String str = c5228a.f12950a;
        if (eVar.f12953a.containsKey(str) && ((CopyOnWriteArrayList) eVar.f12953a.get(str)) != null) {
            ((CopyOnWriteArrayList) eVar.f12953a.get(str)).clear();
        }
        f.f12954a.remove(c5228a.c);
    }

    public static void a(String str) {
        HashMap hashMap = f12955a;
        C5228a c5228a = hashMap.containsKey(str) ? (C5228a) hashMap.get(str) : null;
        if (c5228a != null) {
            int i = c5228a.d;
            if (i != 4 && i != 6) {
                c5228a.d = 2;
                e.b.a(c5228a.f12950a);
                f.f12954a.execute(c5228a.c);
                return;
            }
            c5228a.b.toString();
            return;
        }
        AbstractC5496a.a("TaskManager", "you add " + str + " to TaskQueue ?");
    }
}
