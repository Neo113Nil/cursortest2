package com.google.android.gms.internal.ads;

import Q2.C0379q;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class Zq {

    /* renamed from: a, reason: collision with root package name */
    public final Lq f12529a;

    /* renamed from: b, reason: collision with root package name */
    public final Nq f12530b;

    /* renamed from: c, reason: collision with root package name */
    public final C1041gs f12531c;

    /* renamed from: d, reason: collision with root package name */
    public final C0906ds f12532d;

    /* renamed from: e, reason: collision with root package name */
    public final Mr f12533e;
    public final C1074hg f;

    public Zq(C1041gs c1041gs, C0906ds c0906ds, Lq lq, Nq nq, C1074hg c1074hg, Mr mr) {
        this.f12529a = lq;
        this.f12530b = nq;
        this.f12531c = c1041gs;
        this.f12532d = c0906ds;
        this.f = c1074hg;
        this.f12533e = mr;
    }

    public final void a(ArrayList arrayList) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            Lq lq = this.f12529a;
            if (lq.f10504i0) {
                String str2 = this.f12530b.f10823b;
                C0906ds c0906ds = this.f12532d;
                c0906ds.getClass();
                P2.o.f4767B.f4776j.getClass();
                K3 k32 = new K3(System.currentTimeMillis(), str2, str, 2);
                Xm xm = c0906ds.f13189a;
                xm.getClass();
                xm.d(new C0709Wb(25, xm, k32));
            } else {
                this.f12531c.b(str, lq.f10534x0, this.f12533e);
            }
        }
    }

    public final void b(int i, ArrayList arrayList) {
        E3.a c02;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            String str = (String) obj;
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.E9)).booleanValue() && C1074hg.b(str)) {
                c02 = this.f.a(str, C0379q.f.f5052e);
            } else {
                c02 = AbstractC1400ot.c0(str);
            }
            C2.h hVar = new C2.h(i, 7, this);
            c02.a(new Kw(0, c02, hVar), AbstractC0613Id.f9539a);
        }
    }
}
