package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class Aw extends AbstractC1672uw {

    /* renamed from: z, reason: collision with root package name */
    public List f7740z;

    public Aw(AbstractC1044gv abstractC1044gv, boolean z3) {
        super(abstractC1044gv, z3, true);
        List arrayList;
        if (abstractC1044gv.isEmpty()) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            int size = abstractC1044gv.size();
            AbstractC0952et.q("initialArraySize", size);
            arrayList = new ArrayList(size);
        }
        for (int i = 0; i < abstractC1044gv.size(); i++) {
            arrayList.add(null);
        }
        this.f7740z = arrayList;
        w();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1672uw
    public final void u(int i, Object obj) {
        List list = this.f7740z;
        if (list != null) {
            list.set(i, new Bw(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1672uw
    public final void v() {
        List<Bw> list = this.f7740z;
        if (list != null) {
            int size = list.size();
            AbstractC0952et.q("initialArraySize", size);
            ArrayList arrayList = new ArrayList(size);
            for (Bw bw : list) {
                arrayList.add(bw != null ? bw.f7916a : null);
            }
            f(Collections.unmodifiableList(arrayList));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1672uw
    public final void x(int i) {
        this.f15935v = null;
        this.f7740z = null;
    }
}
