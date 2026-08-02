package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class Tn {

    /* renamed from: c, reason: collision with root package name */
    public final Xw f11681c;
    public InterfaceC0814bo f;

    /* renamed from: h, reason: collision with root package name */
    public final String f11685h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final C0769ao f11686j;

    /* renamed from: k, reason: collision with root package name */
    public Lq f11687k;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f11679a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f11680b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f11682d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f11683e = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    public int f11684g = Integer.MAX_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public boolean f11688l = false;

    public Tn(Sq sq, C0769ao c0769ao, Xw xw) {
        int i = 0;
        this.i = ((Nq) sq.f11596b.f13762m).f10837r;
        this.f11686j = c0769ao;
        this.f11681c = xw;
        this.f11685h = C0947eo.a(sq);
        C1071hd c1071hd = sq.f11596b;
        while (true) {
            List list = (List) c1071hd.f13761l;
            if (i >= list.size()) {
                this.f11680b.addAll(list);
                return;
            } else {
                this.f11679a.put((Lq) list.get(i), Integer.valueOf(i));
                i++;
            }
        }
    }

    public final synchronized Lq a() {
        try {
            if (i()) {
                for (int i = 0; i < this.f11680b.size(); i++) {
                    Lq lq = (Lq) this.f11680b.get(i);
                    String str = lq.f10526t0;
                    if (!this.f11683e.contains(str)) {
                        if (lq.f10530v0) {
                            this.f11688l = true;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            this.f11683e.add(str);
                        }
                        this.f11682d.add(lq);
                        return (Lq) this.f11680b.remove(i);
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Lq lq) {
        this.f11688l = false;
        this.f11682d.remove(lq);
        this.f11683e.remove(lq.f10526t0);
        if (d() || h()) {
            return;
        }
        e();
    }

    public final synchronized void c(InterfaceC0814bo interfaceC0814bo, Lq lq) {
        this.f11688l = false;
        this.f11682d.remove(lq);
        if (d()) {
            interfaceC0814bo.t();
            return;
        }
        Integer num = (Integer) this.f11679a.get(lq);
        int intValue = num != null ? num.intValue() : Integer.MAX_VALUE;
        if (intValue > this.f11684g) {
            this.f11686j.g(lq);
            return;
        }
        if (this.f != null) {
            this.f11686j.g(this.f11687k);
        }
        this.f11684g = intValue;
        this.f = interfaceC0814bo;
        this.f11687k = lq;
        if (h()) {
            return;
        }
        e();
    }

    public final synchronized boolean d() {
        return this.f11681c.isDone();
    }

    public final synchronized void e() {
        this.f11686j.d(this.f11687k);
        InterfaceC0814bo interfaceC0814bo = this.f;
        if (interfaceC0814bo != null) {
            this.f11681c.f(interfaceC0814bo);
        } else {
            this.f11681c.g(new C0858co(this.f11685h, 3));
        }
    }

    public final synchronized boolean f(boolean z3) {
        try {
            ArrayList arrayList = this.f11680b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Lq lq = (Lq) obj;
                Integer num = (Integer) this.f11679a.get(lq);
                int intValue = num != null ? num.intValue() : Integer.MAX_VALUE;
                if (z3 || !this.f11683e.contains(lq.f10526t0)) {
                    int i5 = this.f11684g;
                    if (intValue < i5) {
                        return true;
                    }
                    if (intValue > i5) {
                        break;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean g() {
        try {
            ArrayList arrayList = this.f11682d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Integer num = (Integer) this.f11679a.get((Lq) obj);
                if ((num != null ? num.intValue() : Integer.MAX_VALUE) < this.f11684g) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean h() {
        if (!f(true)) {
            if (!g()) {
                return false;
            }
        }
        return true;
    }

    public final synchronized boolean i() {
        if (this.f11688l) {
            return false;
        }
        if (!this.f11680b.isEmpty() && ((Lq) this.f11680b.get(0)).f10530v0 && !this.f11682d.isEmpty()) {
            return false;
        }
        if (!d()) {
            ArrayList arrayList = this.f11682d;
            if (arrayList.size() < this.i) {
                if (f(false)) {
                    return true;
                }
            }
        }
        return false;
    }
}
