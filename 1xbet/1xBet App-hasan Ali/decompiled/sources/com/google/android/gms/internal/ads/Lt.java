package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class Lt implements InterfaceC1402ov {

    /* renamed from: k, reason: collision with root package name */
    public final boolean f10553k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f10554l = new ArrayList(1);

    /* renamed from: m, reason: collision with root package name */
    public int f10555m;

    /* renamed from: n, reason: collision with root package name */
    public Ww f10556n;

    public Lt(boolean z3) {
        this.f10553k = z3;
    }

    public final void B(int i) {
        Ww ww = this.f10556n;
        int i5 = AbstractC1260lo.f14419a;
        for (int i6 = 0; i6 < this.f10555m; i6++) {
            ((RB) this.f10554l.get(i6)).g(ww, this.f10553k, i);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    public /* synthetic */ Map b() {
        return Collections.EMPTY_MAP;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    public final void d(RB rb) {
        rb.getClass();
        ArrayList arrayList = this.f10554l;
        if (arrayList.contains(rb)) {
            return;
        }
        arrayList.add(rb);
        this.f10555m++;
    }

    public final void f() {
        Ww ww = this.f10556n;
        int i = AbstractC1260lo.f14419a;
        for (int i5 = 0; i5 < this.f10555m; i5++) {
            ((RB) this.f10554l.get(i5)).c(ww, this.f10553k);
        }
        this.f10556n = null;
    }

    public final void g(Ww ww) {
        for (int i = 0; i < this.f10555m; i++) {
            ((RB) this.f10554l.get(i)).getClass();
        }
    }

    public final void k(Ww ww) {
        this.f10556n = ww;
        for (int i = 0; i < this.f10555m; i++) {
            ((RB) this.f10554l.get(i)).f(this, ww, this.f10553k);
        }
    }
}
