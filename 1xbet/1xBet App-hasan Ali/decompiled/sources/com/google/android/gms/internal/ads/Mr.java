package com.google.android.gms.internal.ads;

import Q2.C0387u0;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class Mr implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    public final Nr f10727l;

    /* renamed from: m, reason: collision with root package name */
    public String f10728m;

    /* renamed from: o, reason: collision with root package name */
    public String f10730o;

    /* renamed from: p, reason: collision with root package name */
    public C1071hd f10731p;

    /* renamed from: q, reason: collision with root package name */
    public C0387u0 f10732q;

    /* renamed from: r, reason: collision with root package name */
    public ScheduledFuture f10733r;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f10726k = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public int f10734s = 2;

    /* renamed from: n, reason: collision with root package name */
    public int f10729n = 2;

    public Mr(Nr nr) {
        this.f10727l = nr;
    }

    public final synchronized void a(Jr jr) {
        try {
            if (((Boolean) AbstractC0834c8.f12977c.s()).booleanValue()) {
                ArrayList arrayList = this.f10726k;
                jr.h();
                arrayList.add(jr);
                ScheduledFuture scheduledFuture = this.f10733r;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.f10733r = AbstractC0613Id.f9542d.schedule(this, ((Integer) Q2.r.f5053d.f5056c.a(F7.s8)).intValue(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(String str) {
        boolean matches;
        if (((Boolean) AbstractC0834c8.f12977c.s()).booleanValue()) {
            if (TextUtils.isEmpty(str)) {
                matches = false;
            } else {
                matches = Pattern.matches((String) Q2.r.f5053d.f5056c.a(F7.t8), str);
            }
            if (matches) {
                this.f10728m = str;
            }
        }
    }

    public final synchronized void c(C0387u0 c0387u0) {
        if (((Boolean) AbstractC0834c8.f12977c.s()).booleanValue()) {
            this.f10732q = c0387u0;
        }
    }

    public final synchronized void d(ArrayList arrayList) {
        try {
            if (((Boolean) AbstractC0834c8.f12977c.s()).booleanValue()) {
                if (!arrayList.contains("banner") && !arrayList.contains("BANNER")) {
                    if (!arrayList.contains("interstitial") && !arrayList.contains("INTERSTITIAL")) {
                        if (!arrayList.contains("native") && !arrayList.contains("NATIVE")) {
                            if (!arrayList.contains("rewarded") && !arrayList.contains("REWARDED")) {
                                if (arrayList.contains("app_open_ad")) {
                                    this.f10734s = 7;
                                } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains("REWARDED_INTERSTITIAL")) {
                                    this.f10734s = 6;
                                }
                            }
                            this.f10734s = 5;
                        }
                        this.f10734s = 8;
                    }
                    this.f10734s = 4;
                }
                this.f10734s = 3;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void e(String str) {
        if (((Boolean) AbstractC0834c8.f12977c.s()).booleanValue()) {
            this.f10730o = str;
        }
    }

    public final synchronized void f(Bundle bundle) {
        if (((Boolean) AbstractC0834c8.f12977c.s()).booleanValue()) {
            this.f10729n = G4.d.O(bundle);
        }
    }

    public final synchronized void g(C1071hd c1071hd) {
        if (((Boolean) AbstractC0834c8.f12977c.s()).booleanValue()) {
            this.f10731p = c1071hd;
        }
    }

    public final synchronized void h() {
        try {
            if (((Boolean) AbstractC0834c8.f12977c.s()).booleanValue()) {
                ScheduledFuture scheduledFuture = this.f10733r;
                int i = 0;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                ArrayList arrayList = this.f10726k;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    Jr jr = (Jr) obj;
                    int i5 = this.f10734s;
                    if (i5 != 2) {
                        jr.c(i5);
                    }
                    if (!TextUtils.isEmpty(this.f10728m)) {
                        jr.W(this.f10728m);
                    }
                    if (!TextUtils.isEmpty(this.f10730o) && !jr.o()) {
                        jr.H(this.f10730o);
                    }
                    C1071hd c1071hd = this.f10731p;
                    if (c1071hd != null) {
                        jr.d(c1071hd);
                    } else {
                        C0387u0 c0387u0 = this.f10732q;
                        if (c0387u0 != null) {
                            jr.q(c0387u0);
                        }
                    }
                    jr.b(this.f10729n);
                    this.f10727l.b(jr.l());
                }
                this.f10726k.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void i(int i) {
        if (((Boolean) AbstractC0834c8.f12977c.s()).booleanValue()) {
            this.f10734s = i;
        }
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        h();
    }
}
