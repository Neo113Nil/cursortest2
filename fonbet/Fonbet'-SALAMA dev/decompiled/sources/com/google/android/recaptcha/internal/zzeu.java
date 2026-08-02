package com.google.android.recaptcha.internal;

import g6.AbstractC1158g;
import g6.AbstractC1161j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zzeu implements zzfe {
    public static final zzeu zza = new zzeu();

    private zzeu() {
    }

    private static final boolean zzb(List list) {
        ArrayList arrayList = new ArrayList(AbstractC1161j.N0(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(((zzrr) it.next()).zzP()));
        }
        return !arrayList.contains(Boolean.FALSE);
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i7, zzek zzekVar, zzrr... zzrrVarArr) {
        if (!zzb(AbstractC1158g.w0(zzrrVarArr))) {
            throw new zzby(4, 5, null);
        }
        for (zzrr zzrrVar : zzrrVarArr) {
            zzekVar.zzc().zzb(zzrrVar.zzi());
        }
    }
}
