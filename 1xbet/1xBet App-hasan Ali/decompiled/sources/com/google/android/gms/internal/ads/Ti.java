package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class Ti extends BC implements L5 {

    /* renamed from: m, reason: collision with root package name */
    public final WeakHashMap f11658m;

    /* renamed from: n, reason: collision with root package name */
    public final Context f11659n;

    /* renamed from: o, reason: collision with root package name */
    public final Lq f11660o;

    public Ti(Context context, Set set, Lq lq) {
        super(set);
        this.f11658m = new WeakHashMap(1);
        this.f11659n = context;
        this.f11660o = lq;
    }

    public final synchronized void p1(View view) {
        try {
            M5 m5 = (M5) this.f11658m.get(view);
            if (m5 == null) {
                M5 m52 = new M5(this.f11659n, view);
                m52.f10598v.add(this);
                m52.c(3);
                this.f11658m.put(view, m52);
                m5 = m52;
            }
            if (this.f11660o.f10486X) {
                A7 a7 = F7.f8873o1;
                Q2.r rVar = Q2.r.f5053d;
                if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
                    m5.f10595s.f(((Long) rVar.f5056c.a(F7.f8867n1)).longValue());
                    return;
                }
            }
            m5.f10595s.f(M5.f10586y);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.L5
    public final synchronized void z0(K5 k5) {
        n1(new C1529ro(18, k5));
    }
}
