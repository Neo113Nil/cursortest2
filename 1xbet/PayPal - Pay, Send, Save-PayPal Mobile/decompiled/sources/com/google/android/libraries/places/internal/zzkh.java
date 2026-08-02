package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzkh {
    static final java.util.List zza(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.libraries.places.internal.zzaww zzawwVar = (com.google.android.libraries.places.internal.zzaww) it.next();
            int zza = zzawwVar.zza();
            int zzc = zzawwVar.zzc();
            int zza2 = zzawwVar.zza();
            com.google.android.libraries.places.api.model.zzfr zzc2 = com.google.android.libraries.places.api.model.zzfs.zzc();
            zzc2.zza(zza);
            zzc2.zzb(zzc - zza2);
            arrayList.add(zzc2.zzc());
        }
        return arrayList;
    }

    zzkh() {
    }
}
