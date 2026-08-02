package com.google.android.gms.internal.firebase_auth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class zzdt extends zzdr {
    private static final Class<?> zzsv = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzdt() {
        super();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <L> List<L> zza(Object obj, long j, int i) {
        zzdp zzdpVar;
        List<L> zzc = zzc(obj, j);
        if (zzc.isEmpty()) {
            List<L> zzdpVar2 = zzc instanceof zzdq ? new zzdp(i) : new ArrayList<>(i);
            zzfv.zza(obj, j, zzdpVar2);
            return zzdpVar2;
        }
        if (zzsv.isAssignableFrom(zzc.getClass())) {
            ArrayList arrayList = new ArrayList(zzc.size() + i);
            arrayList.addAll(zzc);
            zzdpVar = arrayList;
        } else {
            if (!(zzc instanceof zzfs)) {
                return zzc;
            }
            zzdp zzdpVar3 = new zzdp(zzc.size() + i);
            zzdpVar3.addAll((zzfs) zzc);
            zzdpVar = zzdpVar3;
        }
        zzfv.zza(obj, j, zzdpVar);
        return zzdpVar;
    }

    private static <E> List<E> zzc(Object obj, long j) {
        return (List) zzfv.zzp(obj, j);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzdr
    final <L> List<L> zza(Object obj, long j) {
        return zza(obj, j, 10);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzdr
    final <E> void zza(Object obj, Object obj2, long j) {
        List zzc = zzc(obj2, j);
        List zza = zza(obj, j, zzc.size());
        int size = zza.size();
        int size2 = zzc.size();
        if (size > 0 && size2 > 0) {
            zza.addAll(zzc);
        }
        if (size > 0) {
            zzc = zza;
        }
        zzfv.zza(obj, j, zzc);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzdr
    final void zzb(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) zzfv.zzp(obj, j);
        if (list instanceof zzdq) {
            unmodifiableList = ((zzdq) list).zzep();
        } else if (zzsv.isAssignableFrom(list.getClass())) {
            return;
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzfv.zza(obj, j, unmodifiableList);
    }
}
