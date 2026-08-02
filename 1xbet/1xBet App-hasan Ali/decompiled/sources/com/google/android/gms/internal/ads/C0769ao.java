package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import q3.C2308a;

/* renamed from: com.google.android.gms.internal.ads.ao, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0769ao {

    /* renamed from: a, reason: collision with root package name */
    public final C2308a f12712a;

    /* renamed from: b, reason: collision with root package name */
    public final C0905dr f12713b;

    /* renamed from: c, reason: collision with root package name */
    public final C1041gs f12714c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f12715d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final boolean f12716e = ((Boolean) Q2.r.f5053d.f5056c.a(F7.u6)).booleanValue();
    public final C1528rn f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f12717g;

    /* renamed from: h, reason: collision with root package name */
    public long f12718h;
    public long i;

    public C0769ao(C2308a c2308a, C0905dr c0905dr, C1528rn c1528rn, C1041gs c1041gs) {
        this.f12712a = c2308a;
        this.f12713b = c0905dr;
        this.f = c1528rn;
        this.f12714c = c1041gs;
    }

    public static boolean h(C0769ao c0769ao, Lq lq) {
        synchronized (c0769ao) {
            Zn zn = (Zn) c0769ao.f12715d.get(lq);
            if (zn == null) {
                return false;
            }
            return zn.f12522c == 8;
        }
    }

    public final synchronized long a() {
        return this.f12718h;
    }

    public final synchronized void b(Sq sq, Lq lq, E3.a aVar, C0951es c0951es) {
        Nq nq = (Nq) sq.f11596b.f13762m;
        this.f12712a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String str = lq.f10531w;
        if (str != null) {
            this.f12715d.put(lq, new Zn(str, lq.f10499f0, 9, 0L, null));
            Yn yn = new Yn(this, elapsedRealtime, nq, lq, str, c0951es, sq);
            aVar.a(new Kw(0, aVar, yn), AbstractC0613Id.f9544g);
        }
    }

    public final synchronized String c() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f12715d.entrySet().iterator();
            while (it.hasNext()) {
                Zn zn = (Zn) ((Map.Entry) it.next()).getValue();
                if (zn.f12522c != Integer.MAX_VALUE) {
                    arrayList.add(zn.toString());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return TextUtils.join("_", arrayList);
    }

    public final synchronized void d(Lq lq) {
        try {
            this.f12712a.getClass();
            this.f12718h = SystemClock.elapsedRealtime() - this.i;
            if (lq != null) {
                this.f.a(lq);
            }
            this.f12717g = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void e(List list) {
        this.f12712a.getClass();
        this.i = SystemClock.elapsedRealtime();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Lq lq = (Lq) it.next();
            if (!TextUtils.isEmpty(lq.f10531w)) {
                this.f12715d.put(lq, new Zn(lq.f10531w, lq.f10499f0, Integer.MAX_VALUE, 0L, null));
            }
        }
    }

    public final synchronized void f() {
        this.f12712a.getClass();
        this.i = SystemClock.elapsedRealtime();
    }

    public final synchronized void g(Lq lq) {
        Zn zn = (Zn) this.f12715d.get(lq);
        if (zn == null || this.f12717g) {
            return;
        }
        zn.f12522c = 8;
    }
}
