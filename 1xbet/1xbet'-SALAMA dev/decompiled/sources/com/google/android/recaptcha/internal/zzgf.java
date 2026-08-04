package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p050g6.g;
import p050g6.p;
import t6.h;

/* JADX INFO: loaded from: classes.dex */
public final class zzgf {
    private List zza = p.f13308a;

    public final long zza(long[] jArr) {
        List list = this.zza;
        List listV0 = g.v0(jArr);
        h.e(list, "<this>");
        ArrayList arrayList = new ArrayList(listV0.size() + list.size());
        arrayList.addAll(list);
        arrayList.addAll(listV0);
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
        this.zza = g.v0(jArr);
    }
}
