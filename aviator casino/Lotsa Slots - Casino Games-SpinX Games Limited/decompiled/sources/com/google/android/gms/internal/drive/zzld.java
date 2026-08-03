package com.google.android.gms.internal.drive;

/* loaded from: classes4.dex */
final class zzld extends com.google.android.gms.internal.drive.zzla {
    private zzld() {
        super();
    }

    @Override // com.google.android.gms.internal.drive.zzla
    final void zza(java.lang.Object obj, long j) {
        zzc(obj, j).zzbp();
    }

    @Override // com.google.android.gms.internal.drive.zzla
    final <E> void zza(java.lang.Object obj, java.lang.Object obj2, long j) {
        com.google.android.gms.internal.drive.zzkp zzc = zzc(obj, j);
        com.google.android.gms.internal.drive.zzkp zzc2 = zzc(obj2, j);
        int size = zzc.size();
        int size2 = zzc2.size();
        if (size > 0 && size2 > 0) {
            if (!zzc.zzbo()) {
                zzc = zzc.zzr(size2 + size);
            }
            zzc.addAll(zzc2);
        }
        if (size > 0) {
            zzc2 = zzc;
        }
        com.google.android.gms.internal.drive.zznd.zza(obj, j, zzc2);
    }

    private static <E> com.google.android.gms.internal.drive.zzkp<E> zzc(java.lang.Object obj, long j) {
        return (com.google.android.gms.internal.drive.zzkp) com.google.android.gms.internal.drive.zznd.zzo(obj, j);
    }
}
