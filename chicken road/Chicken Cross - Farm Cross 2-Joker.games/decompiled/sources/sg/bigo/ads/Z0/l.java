package sg.bigo.ads.Z0;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.BigoAdSdk;
import sg.bigo.ads.P.t;
import sg.bigo.ads.T0.n;
import sg.bigo.ads.T0.p;
import sg.bigo.ads.a0.o;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdConfig;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.AdLoader;
import sg.bigo.ads.e.AbstractC5079c;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public abstract class l implements AdLoader, sg.bigo.ads.Q.c {
    public static final ConcurrentHashMap c = new ConcurrentHashMap();
    public static final ConcurrentHashMap d = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final sg.bigo.ads.P.i f12663a;
    public final String b;

    public l(AdLoadListener adLoadListener, String str) {
        if (adLoadListener == null) {
            this.f12663a = new sg.bigo.ads.P.i();
        } else {
            this.f12663a = new sg.bigo.ads.P.i(adLoadListener);
        }
        this.b = str;
    }

    public Ad a(sg.bigo.ads.N.d dVar, sg.bigo.ads.P.j... jVarArr) {
        return null;
    }

    public Ad a(sg.bigo.ads.P.j jVar) {
        return null;
    }

    @Override // sg.bigo.ads.Q.c
    public final void a(sg.bigo.ads.Q.b bVar, boolean z) {
    }

    @Override // sg.bigo.ads.api.AdLoader
    public void loadAd(sg.bigo.ads.N.d dVar) {
        String[] split;
        String str;
        boolean isInitialized = BigoAdSdk.isInitialized();
        boolean z = !isInitialized;
        if (!isInitialized) {
            Activity a2 = o.a();
            r4 = a2 != null ? a2.getApplicationContext() : null;
            if (r4 == null) {
                r4 = o.f;
            }
            z = r4 != null;
        }
        String str2 = "";
        if (z) {
            String d2 = dVar.d();
            if (d2 != null && !d2.isEmpty() && (split = d2.split("-")) != null && split.length >= 2 && (str = split[0]) != null && !str.isEmpty()) {
                str2 = split[0];
            }
            z = (str2 == null || str2.isEmpty()) ? false : true;
        }
        if (z) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            new Handler(Looper.getMainLooper()).postDelayed(new c(this, atomicBoolean, dVar), 1000L);
            try {
                AdConfig.Builder builder = new AdConfig.Builder();
                builder.setAppId(str2);
                BigoAdSdk.initialize(r4.getApplicationContext(), builder.build(), new d(this, atomicBoolean, dVar));
            } catch (Exception unused) {
                if (atomicBoolean.compareAndSet(false, true)) {
                    a(dVar);
                }
            }
        }
        if (z) {
            return;
        }
        a(dVar);
    }

    public final void a(String str, k kVar, Ad ad, int i, int i2, String str2) {
        if (!TextUtils.isEmpty(str)) {
            c.remove(str);
        }
        kVar.a();
        kVar.e = true;
        a(kVar.b(), kVar);
        if (kVar.f12662a || kVar.b) {
            return;
        }
        a(str, kVar, m.a(ad), 0, i, i2, str2, false, ad);
        a(ad, i, i2, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        if ((android.os.SystemClock.elapsedRealtime() - r0.longValue()) < r11) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(sg.bigo.ads.N.d dVar) {
        sg.bigo.ads.X0.o a2;
        sg.bigo.ads.T0.g gVar;
        sg.bigo.ads.T0.g gVar2;
        sg.bigo.ads.T0.b a3;
        dVar.c = 0;
        dVar.h.f12464a = this.b;
        String d2 = dVar.d();
        b bVar = new b(this, this, dVar, d2, d2);
        long j = 0;
        if (!TextUtils.isEmpty(d2) && (gVar2 = sg.bigo.ads.O.g.f12472a) != null && (a3 = gVar2.L.a(d2)) != null && a3.c == 1) {
            sg.bigo.ads.T0.b a4 = sg.bigo.ads.O.g.f12472a.L.a(d2);
            long j2 = a4 != null ? a4.d : 0L;
            if (j2 >= 0) {
                if (j2 != 0 || !c.containsKey(d2)) {
                    long j3 = j2 * 1000;
                    Long l = (Long) c.get(d2);
                    if (l != null) {
                    }
                }
                a(bVar, 1012, 10213, "The ad is loading", new Pair(dVar, null));
                return;
            }
        }
        if (!TextUtils.isEmpty(d2)) {
            c.put(d2, Long.valueOf(SystemClock.elapsedRealtime()));
        }
        if (!TextUtils.isEmpty(d2) && (gVar = sg.bigo.ads.O.g.f12472a) != null) {
            sg.bigo.ads.T0.c cVar = gVar.L;
            if (cVar.b(d2)) {
                ConcurrentHashMap concurrentHashMap = d;
                List list = (List) concurrentHashMap.get(d2);
                if (list == null) {
                    list = new CopyOnWriteArrayList();
                    concurrentHashMap.put(d2, list);
                }
                list.add(0, bVar);
                sg.bigo.ads.T0.b a5 = cVar.a(d2);
                if (a5 != null) {
                    j = a5.f12548a;
                }
                a2 = BigoAdSdk.a(dVar, bVar);
                if (a2 == null) {
                    bVar.i = a2;
                    if (j > -1) {
                        AbstractC5446j.a(3, null, bVar.l, j * 1000);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        j = -1;
        a2 = BigoAdSdk.a(dVar, bVar);
        if (a2 == null) {
        }
    }

    @Override // sg.bigo.ads.Q.c
    public final void a(Ad ad, int i, int i2, String str) {
        if (ad instanceof sg.bigo.ads.Q.b) {
            ((sg.bigo.ads.Q.b) ad).a(i, i2, str);
        }
        AbstractC5496a.a(2, 5, "", "Failed to load ads: (" + i + ") " + str);
        this.f12663a.onError(new AdError(i, str));
    }

    @Override // sg.bigo.ads.Q.c
    public final void a(Ad ad) {
        a(ad, true);
    }

    public final void a(Ad ad, boolean z) {
        boolean z2 = ad instanceof sg.bigo.ads.Q.b;
        if (z2) {
            ((sg.bigo.ads.Q.b) ad).k();
        }
        if (z) {
            if (z2) {
                ((sg.bigo.ads.Q.b) ad).j();
            }
            this.f12663a.onAdLoaded(ad);
        }
    }

    public final void a(k kVar, int i, int i2, String str, Pair pair) {
        p pVar;
        sg.bigo.ads.N.d dVar;
        boolean z;
        int i3;
        t tVar;
        t tVar2;
        t tVar3;
        t tVar4;
        String str2 = null;
        if (pair != null) {
            dVar = (sg.bigo.ads.N.d) pair.first;
            pVar = (p) pair.second;
        } else {
            pVar = null;
            dVar = null;
        }
        if (dVar != null) {
            sg.bigo.ads.N.c cVar = dVar.h;
            if (cVar.l == 0) {
                cVar.l = System.currentTimeMillis();
            }
        }
        String str3 = pVar != null ? pVar.l : null;
        if (TextUtils.isEmpty(str3) && dVar != null) {
            str3 = dVar.d();
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = kVar.g;
        }
        String str4 = str3;
        boolean z2 = i2 == 10213;
        if (!z2 && !TextUtils.isEmpty(str4)) {
            c.remove(str4);
        }
        boolean z3 = i == 1011;
        boolean z4 = i2 == 10206;
        if (z4) {
            z = true;
        } else {
            int i4 = z2 ? 3 : kVar.f12662a ? 2 : kVar.b ? 4 : 1;
            sg.bigo.ads.X0.o oVar = kVar.i;
            int i5 = oVar != null ? oVar.f : 0;
            if (oVar == null || (tVar4 = oVar.g) == null) {
                i3 = 3;
            } else {
                i3 = tVar4.f12492a ? 1 : 0;
            }
            boolean z5 = (oVar == null || (tVar3 = oVar.g) == null || !tVar3.b) ? false : true;
            int i6 = (oVar == null || (tVar2 = oVar.g) == null) ? 4 : tVar2.c;
            if (oVar != null && (tVar = oVar.g) != null) {
                str2 = tVar.d;
            }
            z = true;
            sg.bigo.ads.s1.b.a(pVar, dVar, i, i2, str, i4, i5, i3, z5, i6, str2);
        }
        kVar.a();
        kVar.e = z;
        a(kVar.b(), kVar);
        if (z4 || !(kVar.f12662a || kVar.b || z3)) {
            a(str4, kVar, null, 0, i, i2, str, false, null);
            this.f12663a.onError(new AdError(i, str));
        }
    }

    public final void a(k kVar, p pVar, Ad ad, int i) {
        List list;
        sg.bigo.ads.X0.o oVar = kVar.i;
        if (oVar != null) {
            String str = ((sg.bigo.ads.N.d) oVar.f12610a).h.b;
        }
        if (pVar != null) {
            String str2 = pVar.l;
            if (TextUtils.isEmpty(str2)) {
                str2 = kVar.b();
            }
            String str3 = str2;
            if (TextUtils.isEmpty(str3)) {
                return;
            }
            sg.bigo.ads.P.c[] a2 = m.a(ad);
            for (int i2 = 0; a2 != null && i2 < a2.length; i2++) {
                sg.bigo.ads.U0.b bVar = (sg.bigo.ads.U0.b) a2[i2];
                bVar.c0 = true;
                bVar.d0 = i;
                bVar.a0 = bVar.b0;
            }
            k kVar2 = (TextUtils.isEmpty(str3) || (list = (List) d.get(str3)) == null || list.size() <= 0) ? null : (k) list.remove(0);
            if (kVar2 != null) {
                AbstractC5446j.a(3, null, new f(this, kVar2, pVar, ad, str3), 0L);
                return;
            }
            String.valueOf(ad);
            a(ad, false);
            AbstractC5079c.f12743a.a(pVar, ad);
        }
    }

    public static void a(String str, k kVar) {
        List list;
        if (TextUtils.isEmpty(str) || (list = (List) d.get(str)) == null || list.size() <= 0) {
            return;
        }
        list.remove(kVar);
    }

    public static void a(String str, k kVar, sg.bigo.ads.P.c[] cVarArr, int i, int i2, int i3, String str2, boolean z, Ad ad) {
        boolean z2;
        String str3;
        sg.bigo.ads.T0.g gVar;
        String str4;
        n nVar;
        n nVar2;
        int i4;
        String b = TextUtils.isEmpty(str) ? kVar.b() : str;
        boolean z3 = false;
        if (TextUtils.isEmpty(b) || (gVar = sg.bigo.ads.O.g.f12472a) == null) {
            z2 = false;
            str3 = null;
        } else {
            sg.bigo.ads.T0.c cVar = gVar.L;
            cVar.getClass();
            if (!TextUtils.isEmpty(b) && (nVar2 = cVar.f12549a) != null) {
                HashMap hashMap = nVar2.e;
                p pVar = (hashMap == null || b == null) ? null : (p) hashMap.get(b);
                if (pVar != null) {
                    int i5 = pVar.v;
                    if (i5 == 0) {
                        i5 = 1;
                    }
                    if (i5 != 3 && (i4 = pVar.b) != 2 && i4 != 12) {
                        z3 = true;
                    }
                }
            }
            if (!TextUtils.isEmpty(b) && (nVar = cVar.f12549a) != null) {
                HashMap hashMap2 = nVar.e;
                p pVar2 = (hashMap2 == null || b == null) ? null : (p) hashMap2.get(b);
                if (pVar2 != null) {
                    str4 = String.valueOf(pVar2.b);
                    str3 = str4;
                    z2 = z3;
                }
            }
            str4 = null;
            str3 = str4;
            z2 = z3;
        }
        AbstractC5446j.a(3, null, new i(z, i3, kVar, cVarArr, z2, ad, b, str3, i, i2, str2), 0L);
    }
}
