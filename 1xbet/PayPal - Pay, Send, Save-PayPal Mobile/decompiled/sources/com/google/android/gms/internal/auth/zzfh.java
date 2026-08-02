package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
final class zzfh extends com.google.android.gms.internal.auth.zzfl {
    private static final java.lang.Class zza = java.util.Collections.unmodifiableList(java.util.Collections.emptyList()).getClass();

    private zzfh() {
        super(null);
    }

    @Override // com.google.android.gms.internal.auth.zzfl
    final void zza(java.lang.Object obj, long j) {
        java.lang.Object unmodifiableList;
        java.util.List list = (java.util.List) com.google.android.gms.internal.auth.zzhj.zzf(obj, j);
        if (list instanceof com.google.android.gms.internal.auth.zzff) {
            unmodifiableList = ((com.google.android.gms.internal.auth.zzff) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof com.google.android.gms.internal.auth.zzge) && (list instanceof com.google.android.gms.internal.auth.zzez)) {
                com.google.android.gms.internal.auth.zzez zzezVar = (com.google.android.gms.internal.auth.zzez) list;
                if (zzezVar.zzc()) {
                    zzezVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = java.util.Collections.unmodifiableList(list);
        }
        com.google.android.gms.internal.auth.zzhj.zzp(obj, j, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.auth.zzfl
    final void zzb(java.lang.Object obj, java.lang.Object obj2, long j) {
        com.google.android.gms.internal.auth.zzfe zzfeVar;
        java.util.List list = (java.util.List) com.google.android.gms.internal.auth.zzhj.zzf(obj2, j);
        int size = list.size();
        java.util.List list2 = (java.util.List) com.google.android.gms.internal.auth.zzhj.zzf(obj, j);
        if (list2.isEmpty()) {
            list2 = list2 instanceof com.google.android.gms.internal.auth.zzff ? new com.google.android.gms.internal.auth.zzfe(size) : ((list2 instanceof com.google.android.gms.internal.auth.zzge) && (list2 instanceof com.google.android.gms.internal.auth.zzez)) ? ((com.google.android.gms.internal.auth.zzez) list2).zzd(size) : new java.util.ArrayList(size);
            com.google.android.gms.internal.auth.zzhj.zzp(obj, j, list2);
        } else {
            if (zza.isAssignableFrom(list2.getClass())) {
                java.util.ArrayList arrayList = new java.util.ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                com.google.android.gms.internal.auth.zzhj.zzp(obj, j, arrayList);
                zzfeVar = arrayList;
            } else if (list2 instanceof com.google.android.gms.internal.auth.zzhe) {
                com.google.android.gms.internal.auth.zzfe zzfeVar2 = new com.google.android.gms.internal.auth.zzfe(list2.size() + size);
                zzfeVar2.addAll(zzfeVar2.size(), (com.google.android.gms.internal.auth.zzhe) list2);
                com.google.android.gms.internal.auth.zzhj.zzp(obj, j, zzfeVar2);
                zzfeVar = zzfeVar2;
            } else if ((list2 instanceof com.google.android.gms.internal.auth.zzge) && (list2 instanceof com.google.android.gms.internal.auth.zzez)) {
                com.google.android.gms.internal.auth.zzez zzezVar = (com.google.android.gms.internal.auth.zzez) list2;
                if (!zzezVar.zzc()) {
                    list2 = zzezVar.zzd(list2.size() + size);
                    com.google.android.gms.internal.auth.zzhj.zzp(obj, j, list2);
                }
            }
            list2 = zzfeVar;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        com.google.android.gms.internal.auth.zzhj.zzp(obj, j, list);
    }

    /* synthetic */ zzfh(com.google.android.gms.internal.auth.zzfg zzfgVar) {
        super(null);
    }
}
