package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class Op {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11001a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f11002b;

    /* renamed from: c, reason: collision with root package name */
    public final Qw f11003c;

    /* renamed from: d, reason: collision with root package name */
    public final Mr f11004d;

    /* renamed from: e, reason: collision with root package name */
    public final C1482ql f11005e;
    public long f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f11006g = 0;

    public Op(Context context, Qw qw, Set set, Mr mr, C1482ql c1482ql) {
        this.f11001a = context;
        this.f11003c = qw;
        this.f11002b = set;
        this.f11004d = mr;
        this.f11005e = c1482ql;
    }

    public final Dw a(final Object obj, final Bundle bundle, final boolean z3) {
        Jr j5 = AbstractC1668us.j(this.f11001a, 8);
        j5.e();
        Set<Mp> set = this.f11002b;
        final ArrayList arrayList = new ArrayList(set.size());
        List arrayList2 = new ArrayList();
        A7 a7 = F7.nb;
        Q2.r rVar = Q2.r.f5053d;
        boolean isEmpty = ((String) rVar.f5056c.a(a7)).isEmpty();
        D7 d7 = rVar.f5056c;
        if (!isEmpty) {
            arrayList2 = Arrays.asList(((String) d7.a(a7)).split(","));
        }
        List list = arrayList2;
        P2.o oVar = P2.o.f4767B;
        oVar.f4776j.getClass();
        this.f = SystemClock.elapsedRealtime();
        final Bundle bundle2 = new Bundle();
        if (((Boolean) d7.a(F7.f8805b2)).booleanValue() && bundle != null) {
            oVar.f4776j.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            if (obj instanceof C0572Ch) {
                bundle.putLong("client-signals-start", currentTimeMillis);
            } else {
                bundle.putLong("gms-signals-start", currentTimeMillis);
            }
        }
        for (Mp mp : set) {
            if (!list.contains(String.valueOf(mp.a()))) {
                P2.o.f4767B.f4776j.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                E3.a d5 = mp.d();
                d5.a(new RunnableC1654ue(this, elapsedRealtime, mp, bundle2), AbstractC0613Id.f9544g);
                arrayList.add(d5);
            }
        }
        AbstractC1044gv l5 = AbstractC1044gv.l(arrayList);
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.Np
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object obj2;
                Bundle bundle3;
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    obj2 = obj;
                    if (!hasNext) {
                        break;
                    }
                    Lp lp = (Lp) ((E3.a) it.next()).get();
                    if (lp != null) {
                        lp.o(obj2);
                        if (z3) {
                            lp.k(obj2);
                        }
                    }
                }
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8805b2)).booleanValue() && (bundle3 = bundle) != null) {
                    P2.o.f4767B.f4776j.getClass();
                    long currentTimeMillis2 = System.currentTimeMillis();
                    boolean z5 = obj2 instanceof C0572Ch;
                    Bundle bundle4 = bundle2;
                    if (z5) {
                        bundle3.putLong("client-signals-end", currentTimeMillis2);
                        bundle3.putBundle("client_sig_latency_key", bundle4);
                        return obj2;
                    }
                    bundle3.putLong("gms-signals-end", currentTimeMillis2);
                    bundle3.putBundle("gms_sig_latency_key", bundle4);
                }
                return obj2;
            }
        };
        Dw dw = new Dw(l5, true, false);
        dw.f8420z = new Cw(dw, callable, this.f11003c);
        dw.w();
        if (Nr.a()) {
            AbstractC1803xs.c0(dw, this.f11004d, j5, false);
        }
        return dw;
    }
}
