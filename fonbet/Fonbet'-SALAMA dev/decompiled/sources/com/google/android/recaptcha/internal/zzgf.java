package com.google.android.recaptcha.internal;

import g6.AbstractC1158g;
import g6.C1167p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import t6.h;

/* loaded from: classes.dex */
public final class zzgf {
    private List zza = C1167p.f13302a;

    public final long zza(long[] jArr) {
        List list = this.zza;
        List v02 = AbstractC1158g.v0(jArr);
        h.e(list, "<this>");
        ArrayList arrayList = new ArrayList(v02.size() + list.size());
        arrayList.addAll(list);
        arrayList.addAll(v02);
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = Long.valueOf(((Number) next).longValue() ^ ((Number) it.next()).longValue());
        }
        return ((Number) next).longValue();
    }

    public final void zzb(long[] jArr) {
        this.zza = AbstractC1158g.v0(jArr);
    }
}
