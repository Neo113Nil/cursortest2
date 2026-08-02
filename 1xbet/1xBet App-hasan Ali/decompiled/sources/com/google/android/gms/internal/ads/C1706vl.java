package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.vl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1706vl {

    /* renamed from: e, reason: collision with root package name */
    public final String f16036e;
    public final C1616tl f;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f16033b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public boolean f16034c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16035d = false;

    /* renamed from: a, reason: collision with root package name */
    public final T2.I f16032a = P2.o.f4767B.f4774g.d();

    public C1706vl(String str, C1616tl c1616tl) {
        this.f16036e = str;
        this.f = c1616tl;
    }

    public final synchronized void a(String str, String str2) {
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8788Y1)).booleanValue()) {
            HashMap e3 = e();
            e3.put("action", "adapter_init_finished");
            e3.put("ancn", str);
            e3.put("rqe", str2);
            this.f16033b.add(e3);
        }
    }

    public final synchronized void b(String str) {
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8788Y1)).booleanValue()) {
            HashMap e3 = e();
            e3.put("action", "adapter_init_started");
            e3.put("ancn", str);
            this.f16033b.add(e3);
        }
    }

    public final synchronized void c(String str) {
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8788Y1)).booleanValue()) {
            HashMap e3 = e();
            e3.put("action", "adapter_init_finished");
            e3.put("ancn", str);
            this.f16033b.add(e3);
        }
    }

    public final synchronized void d() {
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8788Y1)).booleanValue() && !this.f16034c) {
            HashMap e3 = e();
            e3.put("action", "init_started");
            this.f16033b.add(e3);
            this.f16034c = true;
        }
    }

    public final HashMap e() {
        C1616tl c1616tl = this.f;
        c1616tl.getClass();
        HashMap hashMap = new HashMap(c1616tl.f15714a);
        P2.o.f4767B.f4776j.getClass();
        hashMap.put("tms", Long.toString(SystemClock.elapsedRealtime(), 10));
        hashMap.put("tid", this.f16032a.n() ? "" : this.f16036e);
        return hashMap;
    }
}
