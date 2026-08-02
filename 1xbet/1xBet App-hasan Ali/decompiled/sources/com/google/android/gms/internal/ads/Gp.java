package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class Gp implements Mp {

    /* renamed from: k, reason: collision with root package name */
    public static final C1530rp f9266k = new C1530rp(1, new JSONArray().toString(), new Bundle());

    /* renamed from: a, reason: collision with root package name */
    public final C0606Hd f9267a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f9268b;

    /* renamed from: c, reason: collision with root package name */
    public final C1754wo f9269c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f9270d;

    /* renamed from: e, reason: collision with root package name */
    public final Wq f9271e;
    public final C1664uo f;

    /* renamed from: g, reason: collision with root package name */
    public final C0900dl f9272g;

    /* renamed from: h, reason: collision with root package name */
    public final Ll f9273h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final String f9274j;

    public Gp(C0606Hd c0606Hd, ScheduledExecutorService scheduledExecutorService, String str, C1754wo c1754wo, Context context, Wq wq, C1664uo c1664uo, C0900dl c0900dl, Ll ll, int i) {
        this.f9267a = c0606Hd;
        this.f9268b = scheduledExecutorService;
        this.f9274j = str;
        this.f9269c = c1754wo;
        this.f9270d = context;
        this.f9271e = wq;
        this.f = c1664uo;
        this.f9272g = c0900dl;
        this.f9273h = ll;
        this.i = i;
    }

    @Override // com.google.android.gms.internal.ads.Mp
    public final int a() {
        return 32;
    }

    public final Hw b(String str, List list, Bundle bundle, boolean z3, boolean z5) {
        Fp fp = new Fp(this, str, list, bundle, z3, z5);
        C0606Hd c0606Hd = this.f9267a;
        Hw r5 = Hw.r(AbstractC1400ot.f0(fp, c0606Hd));
        A7 a7 = F7.f8930y1;
        Q2.r rVar = Q2.r.f5053d;
        if (!((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
            r5 = (Hw) AbstractC1400ot.l0(r5, ((Long) rVar.f5056c.a(F7.r1)).longValue(), TimeUnit.MILLISECONDS, this.f9268b);
        }
        return AbstractC1400ot.U(r5, Throwable.class, new C1596t9(str, 3), c0606Hd);
    }

    public final void c(ArrayList arrayList, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            C1889zo c1889zo = (C1889zo) ((Map.Entry) it.next()).getValue();
            String str = c1889zo.f16767a;
            Bundle bundle = this.f9271e.f12098d.f4969w;
            arrayList.add(b(str, Collections.singletonList(c1889zo.f16771e), bundle != null ? bundle.getBundle(str) : null, c1889zo.f16768b, c1889zo.f16769c));
        }
    }

    @Override // com.google.android.gms.internal.ads.Mp
    public final E3.a d() {
        int i = this.i;
        C1530rp c1530rp = f9266k;
        if (i == 2) {
            return AbstractC1400ot.c0(c1530rp);
        }
        Wq wq = this.f9271e;
        if (wq.f12110r) {
            if (!Arrays.asList(((String) Q2.r.f5053d.f5056c.a(F7.f8678E1)).split(",")).contains(G4.d.P(G4.d.Q(wq.f12098d)))) {
                return AbstractC1400ot.c0(c1530rp);
            }
        }
        return AbstractC1400ot.f0(new Dp(0, this), this.f9267a);
    }
}
