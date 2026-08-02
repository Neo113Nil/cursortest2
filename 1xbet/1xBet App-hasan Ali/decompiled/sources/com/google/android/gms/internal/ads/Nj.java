package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final /* synthetic */ class Nj implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f10804k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f10805l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f10806m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f10807n;

    public /* synthetic */ Nj(int i, int i5, Object obj, Object obj2) {
        this.f10804k = i5;
        this.f10806m = obj;
        this.f10805l = i;
        this.f10807n = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10804k) {
            case 0:
                Iterator it = ((CopyOnWriteArraySet) this.f10806m).iterator();
                while (it.hasNext()) {
                    C1525rk c1525rk = (C1525rk) it.next();
                    if (!c1525rk.f15370d) {
                        int i = this.f10805l;
                        if (i != -1) {
                            c1525rk.f15368b.a(i);
                        }
                        c1525rk.f15369c = true;
                        ((Yj) this.f10807n).mo11k(c1525rk.f15367a);
                    }
                }
                break;
            default:
                ((AbstractC1672uw) this.f10806m).t(this.f10805l, (E3.a) this.f10807n);
                break;
        }
    }
}
