package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
final class zzdm extends com.google.android.gms.internal.play_billing.zzdq {
    private static final java.lang.Class zza = java.util.Collections.unmodifiableList(java.util.Collections.emptyList()).getClass();

    private zzdm() {
        throw null;
    }

    /* synthetic */ zzdm(com.google.android.gms.internal.play_billing.zzdl zzdlVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.zzdq
    final void zza(java.lang.Object obj, long j) {
        java.lang.Object unmodifiableList;
        java.util.List list = (java.util.List) com.google.android.gms.internal.play_billing.zzfp.zzf(obj, j);
        if (list instanceof com.google.android.gms.internal.play_billing.zzdk) {
            unmodifiableList = ((com.google.android.gms.internal.play_billing.zzdk) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof com.google.android.gms.internal.play_billing.zzek) && (list instanceof com.google.android.gms.internal.play_billing.zzcz)) {
                com.google.android.gms.internal.play_billing.zzcz zzczVar = (com.google.android.gms.internal.play_billing.zzcz) list;
                if (zzczVar.zzc()) {
                    zzczVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = java.util.Collections.unmodifiableList(list);
        }
        com.google.android.gms.internal.play_billing.zzfp.zzs(obj, j, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzdq
    final void zzb(java.lang.Object obj, java.lang.Object obj2, long j) {
        com.google.android.gms.internal.play_billing.zzdj zzdjVar;
        java.util.List list = (java.util.List) com.google.android.gms.internal.play_billing.zzfp.zzf(obj2, j);
        int size = list.size();
        java.util.List list2 = (java.util.List) com.google.android.gms.internal.play_billing.zzfp.zzf(obj, j);
        if (list2.isEmpty()) {
            list2 = list2 instanceof com.google.android.gms.internal.play_billing.zzdk ? new com.google.android.gms.internal.play_billing.zzdj(size) : ((list2 instanceof com.google.android.gms.internal.play_billing.zzek) && (list2 instanceof com.google.android.gms.internal.play_billing.zzcz)) ? ((com.google.android.gms.internal.play_billing.zzcz) list2).zzd(size) : new java.util.ArrayList(size);
            com.google.android.gms.internal.play_billing.zzfp.zzs(obj, j, list2);
        } else {
            if (zza.isAssignableFrom(list2.getClass())) {
                java.util.ArrayList arrayList = new java.util.ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                com.google.android.gms.internal.play_billing.zzfp.zzs(obj, j, arrayList);
                zzdjVar = arrayList;
            } else if (list2 instanceof com.google.android.gms.internal.play_billing.zzfk) {
                com.google.android.gms.internal.play_billing.zzdj zzdjVar2 = new com.google.android.gms.internal.play_billing.zzdj(list2.size() + size);
                zzdjVar2.addAll(zzdjVar2.size(), (com.google.android.gms.internal.play_billing.zzfk) list2);
                com.google.android.gms.internal.play_billing.zzfp.zzs(obj, j, zzdjVar2);
                zzdjVar = zzdjVar2;
            } else if ((list2 instanceof com.google.android.gms.internal.play_billing.zzek) && (list2 instanceof com.google.android.gms.internal.play_billing.zzcz)) {
                com.google.android.gms.internal.play_billing.zzcz zzczVar = (com.google.android.gms.internal.play_billing.zzcz) list2;
                if (!zzczVar.zzc()) {
                    list2 = zzczVar.zzd(list2.size() + size);
                    com.google.android.gms.internal.play_billing.zzfp.zzs(obj, j, list2);
                }
            }
            list2 = zzdjVar;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        com.google.android.gms.internal.play_billing.zzfp.zzs(obj, j, list);
    }
}
