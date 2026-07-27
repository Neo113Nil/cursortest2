package io.appmetrica.analytics.impl;

import e2.AbstractC0292g;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.gf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0521gf implements Cdo {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7376a;

    public C0521gf(Cif cif) {
        boolean z3;
        List<C0547hf> list = cif.f7545b;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C0547hf) it.next()).f7419c == Y7.f6854c) {
                    z3 = false;
                    break;
                }
            }
        }
        z3 = true;
        this.f7376a = z3;
    }

    @Override // io.appmetrica.analytics.impl.Cdo, o2.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C0547hf> invoke(List<? extends C0547hf> list, C0909vf c0909vf) {
        C0547hf c0547hf = new C0547hf(c0909vf.f8514a, c0909vf.f8515b, c0909vf.f8518e);
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C0547hf) it.next()).f7419c == c0909vf.f8518e) {
                    if (c0547hf.f7419c == Y7.f6854c && this.f7376a) {
                        return AbstractC0292g.b0(list, c0547hf);
                    }
                    return null;
                }
            }
        }
        return AbstractC0292g.b0(list, c0547hf);
    }
}
