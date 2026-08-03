package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzab {
    private com.google.android.gms.internal.measurement.zzaa zza;
    private com.google.android.gms.internal.measurement.zzaa zzb;
    private final java.util.List zzc;

    public zzab() {
        this.zza = new com.google.android.gms.internal.measurement.zzaa("", 0L, null);
        this.zzb = new com.google.android.gms.internal.measurement.zzaa("", 0L, null);
        this.zzc = new java.util.ArrayList();
    }

    public final /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        com.google.android.gms.internal.measurement.zzab zzabVar = new com.google.android.gms.internal.measurement.zzab(this.zza.clone());
        java.util.Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzabVar.zzc.add(((com.google.android.gms.internal.measurement.zzaa) it.next()).clone());
        }
        return zzabVar;
    }

    public final com.google.android.gms.internal.measurement.zzaa zza() {
        return this.zza;
    }

    public final void zzb(com.google.android.gms.internal.measurement.zzaa zzaaVar) {
        this.zza = zzaaVar;
        this.zzb = zzaaVar.clone();
        this.zzc.clear();
    }

    public final com.google.android.gms.internal.measurement.zzaa zzc() {
        return this.zzb;
    }

    public final void zzd(com.google.android.gms.internal.measurement.zzaa zzaaVar) {
        this.zzb = zzaaVar;
    }

    public final void zze(java.lang.String str, long j, java.util.Map map) {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.lang.String str2 : map.keySet()) {
            hashMap.put(str2, com.google.android.gms.internal.measurement.zzaa.zzh(str2, this.zza.zze(str2), map.get(str2)));
        }
        this.zzc.add(new com.google.android.gms.internal.measurement.zzaa(str, j, hashMap));
    }

    public final java.util.List zzf() {
        return this.zzc;
    }

    public zzab(com.google.android.gms.internal.measurement.zzaa zzaaVar) {
        this.zza = zzaaVar;
        this.zzb = zzaaVar.clone();
        this.zzc = new java.util.ArrayList();
    }
}
