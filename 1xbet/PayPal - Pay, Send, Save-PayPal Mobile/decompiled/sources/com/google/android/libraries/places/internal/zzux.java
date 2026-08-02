package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzux extends com.google.android.libraries.places.internal.zzva {
    private final java.util.Map zza;
    private final java.util.Map zzb;
    private final com.google.android.libraries.places.internal.zzuz zzc;
    private final com.google.android.libraries.places.internal.zzuy zzd;

    /* synthetic */ zzux(com.google.android.libraries.places.internal.zzuw zzuwVar, byte[] bArr) {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.zza = hashMap;
        java.util.HashMap hashMap2 = new java.util.HashMap();
        this.zzb = hashMap2;
        hashMap.putAll(zzuwVar.zzd());
        hashMap2.putAll(zzuwVar.zze());
        this.zzc = zzuwVar.zzf();
        this.zzd = zzuwVar.zzg();
    }

    @Override // com.google.android.libraries.places.internal.zzva
    protected final void zza(com.google.android.libraries.places.internal.zztv zztvVar, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzuz zzuzVar = (com.google.android.libraries.places.internal.zzuz) this.zza.get(zztvVar);
        if (zzuzVar != null) {
            zzuzVar.zza(zztvVar, obj, obj2);
        } else {
            this.zzc.zza(zztvVar, obj, obj2);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzva
    protected final void zzb(com.google.android.libraries.places.internal.zztv zztvVar, java.util.Iterator it, java.lang.Object obj) {
        com.google.android.libraries.places.internal.zzuy zzuyVar = (com.google.android.libraries.places.internal.zzuy) this.zzb.get(zztvVar);
        if (zzuyVar != null) {
            zzuyVar.zza(zztvVar, it, obj);
            return;
        }
        com.google.android.libraries.places.internal.zzuy zzuyVar2 = this.zzd;
        if (zzuyVar2 != null && !this.zza.containsKey(zztvVar)) {
            zzuyVar2.zza(zztvVar, it, obj);
        } else {
            while (it.hasNext()) {
                zza(zztvVar, it.next(), obj);
            }
        }
    }
}
