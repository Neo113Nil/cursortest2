package com.google.android.gms.internal.ads;

import Q2.C0387u0;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.rn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1528rn {

    /* renamed from: c, reason: collision with root package name */
    public final String f15377c;

    /* renamed from: d, reason: collision with root package name */
    public Nq f15378d = null;

    /* renamed from: e, reason: collision with root package name */
    public Lq f15379e = null;
    public Q2.c1 f = null;

    /* renamed from: b, reason: collision with root package name */
    public final Map f15376b = Collections.synchronizedMap(new HashMap());

    /* renamed from: a, reason: collision with root package name */
    public final List f15375a = Collections.synchronizedList(new ArrayList());

    public C1528rn(String str) {
        this.f15377c = str;
    }

    public static String b(Lq lq) {
        return ((Boolean) Q2.r.f5053d.f5056c.a(F7.f8932y3)).booleanValue() ? lq.f10518p0 : lq.f10531w;
    }

    public final void a(Lq lq) {
        String b3 = b(lq);
        Map map = this.f15376b;
        Object obj = map.get(b3);
        List list = this.f15375a;
        int indexOf = list.indexOf(obj);
        if (indexOf < 0 || indexOf >= map.size()) {
            indexOf = list.indexOf(this.f);
        }
        if (indexOf < 0 || indexOf >= map.size()) {
            return;
        }
        this.f = (Q2.c1) list.get(indexOf);
        while (true) {
            indexOf++;
            if (indexOf >= list.size()) {
                return;
            }
            Q2.c1 c1Var = (Q2.c1) list.get(indexOf);
            c1Var.f4999l = 0L;
            c1Var.f5000m = null;
        }
    }

    public final synchronized void c(Lq lq, int i) {
        Map map = this.f15376b;
        String b3 = b(lq);
        if (map.containsKey(b3)) {
            return;
        }
        Bundle bundle = new Bundle();
        Iterator<String> keys = lq.f10529v.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                bundle.putString(next, lq.f10529v.getString(next));
            } catch (JSONException unused) {
            }
        }
        Q2.c1 c1Var = new Q2.c1(lq.f10469E, 0L, null, bundle, lq.f10470F, lq.f10471G, lq.f10472H, lq.f10473I);
        try {
            this.f15375a.add(i, c1Var);
        } catch (IndexOutOfBoundsException e3) {
            P2.o.f4767B.f4774g.i("AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation", e3);
        }
        this.f15376b.put(b3, c1Var);
    }

    public final void d(Lq lq, long j5, C0387u0 c0387u0, boolean z3) {
        String b3 = b(lq);
        Map map = this.f15376b;
        if (map.containsKey(b3)) {
            if (this.f15379e == null) {
                this.f15379e = lq;
            }
            Q2.c1 c1Var = (Q2.c1) map.get(b3);
            c1Var.f4999l = j5;
            c1Var.f5000m = c0387u0;
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.r6)).booleanValue() && z3) {
                this.f = c1Var;
            }
        }
    }
}
