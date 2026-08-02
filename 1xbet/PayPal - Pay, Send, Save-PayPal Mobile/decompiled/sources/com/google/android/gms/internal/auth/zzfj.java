package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
final class zzfj extends com.google.android.gms.internal.auth.zzfl {
    private zzfj() {
        super(null);
    }

    @Override // com.google.android.gms.internal.auth.zzfl
    final void zza(java.lang.Object obj, long j) {
        ((com.google.android.gms.internal.auth.zzez) com.google.android.gms.internal.auth.zzhj.zzf(obj, j)).zzb();
    }

    @Override // com.google.android.gms.internal.auth.zzfl
    final void zzb(java.lang.Object obj, java.lang.Object obj2, long j) {
        com.google.android.gms.internal.auth.zzez zzezVar = (com.google.android.gms.internal.auth.zzez) com.google.android.gms.internal.auth.zzhj.zzf(obj, j);
        com.google.android.gms.internal.auth.zzez zzezVar2 = (com.google.android.gms.internal.auth.zzez) com.google.android.gms.internal.auth.zzhj.zzf(obj2, j);
        int size = zzezVar.size();
        int size2 = zzezVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzezVar.zzc()) {
                zzezVar = zzezVar.zzd(size2 + size);
            }
            zzezVar.addAll(zzezVar2);
        }
        if (size > 0) {
            zzezVar2 = zzezVar;
        }
        com.google.android.gms.internal.auth.zzhj.zzp(obj, j, zzezVar2);
    }

    /* synthetic */ zzfj(com.google.android.gms.internal.auth.zzfi zzfiVar) {
        super(null);
    }
}
