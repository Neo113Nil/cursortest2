package sg.bigo.ads.h0;

import android.os.SystemClock;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import sg.bigo.ads.f0.C5115b;
import sg.bigo.ads.f0.RunnableC5116c;
import sg.bigo.ads.f0.RunnableC5117d;
import sg.bigo.ads.f0.h;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.u.AbstractC5487h;

/* loaded from: classes3.dex */
public final class e {
    public static final e b = new e();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f12953a = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(String str) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        int a2;
        CopyOnWriteArrayList copyOnWriteArrayList2;
        CopyOnWriteArrayList copyOnWriteArrayList3;
        if (!this.f12953a.containsKey(str) || (copyOnWriteArrayList = (CopyOnWriteArrayList) this.f12953a.get(str)) == null) {
            return;
        }
        HashMap hashMap = g.f12955a;
        C5228a c5228a = null;
        C5228a c5228a2 = hashMap.containsKey(str) ? (C5228a) hashMap.get(str) : null;
        if (c5228a2 != null) {
            int i = 1;
            switch (AbstractC5487h.a(c5228a2.d)) {
                case 0:
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        ((h) it.next()).getClass();
                    }
                    break;
                case 1:
                    Iterator it2 = copyOnWriteArrayList.iterator();
                    while (it2.hasNext()) {
                        ((h) it2.next()).getClass();
                    }
                    break;
                case 2:
                    Iterator it3 = copyOnWriteArrayList.iterator();
                    while (it3.hasNext()) {
                        h hVar = (h) it3.next();
                        String str2 = c5228a2.f12950a;
                        hVar.getClass();
                        HashMap hashMap2 = g.f12955a;
                        C5228a c5228a3 = hashMap2.containsKey(str2) ? (C5228a) hashMap2.get(str2) : null;
                        C5115b c5115b = c5228a3 != null ? c5228a3.b : null;
                        if (c5115b != null) {
                            AbstractC5446j.a(1, null, new RunnableC5116c(hVar, c5115b), 0L);
                        }
                    }
                    break;
                case 3:
                    Iterator it4 = copyOnWriteArrayList.iterator();
                    while (it4.hasNext()) {
                        h hVar2 = (h) it4.next();
                        String str3 = c5228a2.f12950a;
                        new DecimalFormat("0.00").format(0.0f);
                        long j = c5228a2.b.i;
                        hVar2.getClass();
                        HashMap hashMap3 = g.f12955a;
                        C5228a c5228a4 = hashMap3.containsKey(str3) ? (C5228a) hashMap3.get(str3) : c5228a;
                        C5115b c5115b2 = c5228a4 != null ? c5228a4.b : c5228a;
                        if (c5115b2 != 0) {
                            if (c5115b2.j != i) {
                                c5115b2.toString();
                                c5115b2.j = i;
                            }
                            long j2 = c5115b2.i;
                            if (j2 > 0) {
                                long j3 = c5115b2.g;
                                if ((j3 - c5115b2.h) * 100 > j2 * 10) {
                                    c5115b2.h = j3;
                                    if (c5115b2.c() && ((a2 = sg.bigo.ads.I0.g.a(hVar2.g)) == 3 || a2 == 4 || a2 == 5)) {
                                        long elapsedRealtime = SystemClock.elapsedRealtime() - c5115b2.n;
                                        c5115b2.toString();
                                        AbstractC5446j.a(1, null, new RunnableC5117d(hVar2, c5115b2, elapsedRealtime), 0L);
                                        c5228a = null;
                                        i = 1;
                                    }
                                }
                                i = 1;
                                c5228a = null;
                            }
                        }
                    }
                    break;
                case 4:
                    Iterator it5 = copyOnWriteArrayList.iterator();
                    while (it5.hasNext()) {
                        h hVar3 = (h) it5.next();
                        String str4 = c5228a2.f12950a;
                        long j4 = c5228a2.b.i;
                        hVar3.getClass();
                        HashMap hashMap4 = g.f12955a;
                        C5228a c5228a5 = hashMap4.containsKey(str4) ? (C5228a) hashMap4.get(str4) : null;
                        C5115b c5115b3 = c5228a5 != null ? c5228a5.b : null;
                        if (c5115b3 != null) {
                            c5115b3.j = 2;
                        }
                    }
                    break;
                case 5:
                    Iterator it6 = copyOnWriteArrayList.iterator();
                    while (it6.hasNext()) {
                        h hVar4 = (h) it6.next();
                        String str5 = c5228a2.f12950a;
                        hVar4.getClass();
                        AbstractC5446j.a(1, null, new sg.bigo.ads.f0.e(hVar4, str5), 0L);
                        String str6 = c5228a2.f12950a;
                        if (this.f12953a.containsKey(str6) && (copyOnWriteArrayList2 = (CopyOnWriteArrayList) this.f12953a.get(str6)) != null && copyOnWriteArrayList2.contains(hVar4)) {
                            copyOnWriteArrayList2.remove(hVar4);
                        }
                    }
                    break;
                case 6:
                    Iterator it7 = copyOnWriteArrayList.iterator();
                    while (it7.hasNext()) {
                        h hVar5 = (h) it7.next();
                        String str7 = c5228a2.f12950a;
                        String str8 = c5228a2.e;
                        C5115b c5115b4 = c5228a2.b;
                        long j5 = c5115b4.i;
                        long j6 = c5115b4.g;
                        hVar5.getClass();
                        AbstractC5446j.a(1, null, new sg.bigo.ads.f0.f(hVar5, str7, str8, j6), 0L);
                        String str9 = c5228a2.f12950a;
                        if (this.f12953a.containsKey(str9) && (copyOnWriteArrayList3 = (CopyOnWriteArrayList) this.f12953a.get(str9)) != null && copyOnWriteArrayList3.contains(hVar5)) {
                            copyOnWriteArrayList3.remove(hVar5);
                        }
                    }
                    break;
            }
        }
    }
}
