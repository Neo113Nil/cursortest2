package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzbve implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbvl zza;

    zzbve(com.google.android.libraries.places.internal.zzbvl zzbvlVar) {
        java.util.Objects.requireNonNull(zzbvlVar);
        this.zza = zzbvlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.libraries.places.internal.zzbkq zzbkqVar;
        java.util.ArrayList arrayList;
        com.google.android.libraries.places.internal.zzbvl zzbvlVar = this.zza;
        java.lang.Object obj = zzbvlVar.zzf().get();
        zzbkqVar = com.google.android.libraries.places.internal.zzbvr.zzh;
        if (obj == zzbkqVar) {
            zzbvlVar.zzf().set(null);
        }
        com.google.android.libraries.places.internal.zzbvr zzbvrVar = zzbvlVar.zza;
        if (zzbvrVar.zzI() != null) {
            java.util.Iterator it = zzbvrVar.zzI().iterator();
            while (it.hasNext()) {
                ((com.google.android.libraries.places.internal.zzbvk) it.next()).zze("Channel is forcefully shutdown", null);
            }
        }
        com.google.android.libraries.places.internal.zzbvq zzM = zzbvrVar.zzM();
        com.google.android.libraries.places.internal.zzbnp zzbnpVar = com.google.android.libraries.places.internal.zzbvr.zzb;
        zzM.zza(zzbnpVar);
        synchronized (zzM.zza) {
            arrayList = new java.util.ArrayList(zzM.zzb);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((com.google.android.libraries.places.internal.zzbpl) arrayList.get(i)).zzl(zzbnpVar);
        }
        zzM.zzd.zzL().zze(zzbnpVar);
    }
}
