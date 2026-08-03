package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
final class zzy {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzad zza;
    private java.lang.String zzb;
    private boolean zzc;
    private com.google.android.gms.internal.measurement.zzii zzd;
    private java.util.BitSet zze;
    private java.util.BitSet zzf;
    private java.util.Map zzg;
    private java.util.Map zzh;

    /* synthetic */ zzy(com.google.android.gms.measurement.internal.zzad zzadVar, java.lang.String str, com.google.android.gms.internal.measurement.zzii zziiVar, java.util.BitSet bitSet, java.util.BitSet bitSet2, java.util.Map map, java.util.Map map2, byte[] bArr) {
        java.util.Objects.requireNonNull(zzadVar);
        this.zza = zzadVar;
        this.zzb = str;
        this.zze = bitSet;
        this.zzf = bitSet2;
        this.zzg = map;
        this.zzh = new androidx.collection.ArrayMap();
        for (java.lang.Integer num : map2.keySet()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add((java.lang.Long) map2.get(num));
            this.zzh.put(num, arrayList);
        }
        this.zzc = false;
        this.zzd = zziiVar;
    }

    final void zza(com.google.android.gms.measurement.internal.zzab zzabVar) {
        int zza = zzabVar.zza();
        java.lang.Boolean bool = zzabVar.zzd;
        if (bool != null) {
            java.util.BitSet bitSet = this.zzf;
            bool.booleanValue();
            bitSet.set(zza, true);
        }
        java.lang.Boolean bool2 = zzabVar.zze;
        if (bool2 != null) {
            this.zze.set(zza, bool2.booleanValue());
        }
        if (zzabVar.zzf != null) {
            java.util.Map map = this.zzg;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(zza);
            java.lang.Long l = (java.lang.Long) map.get(valueOf);
            long longValue = zzabVar.zzf.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.zzg.put(valueOf, java.lang.Long.valueOf(longValue));
            }
        }
        if (zzabVar.zzg != null) {
            java.util.Map map2 = this.zzh;
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(zza);
            java.util.List list = (java.util.List) map2.get(valueOf2);
            if (list == null) {
                list = new java.util.ArrayList();
                this.zzh.put(valueOf2, list);
            }
            if (zzabVar.zzb()) {
                list.clear();
            }
            com.google.android.gms.internal.measurement.zzpq.zza();
            com.google.android.gms.measurement.internal.zzib zzibVar = this.zza.zzu;
            com.google.android.gms.measurement.internal.zzal zzc = zzibVar.zzc();
            java.lang.String str = this.zzb;
            com.google.android.gms.measurement.internal.zzfw zzfwVar = com.google.android.gms.measurement.internal.zzfx.zzaF;
            if (zzc.zzp(str, zzfwVar) && zzabVar.zzc()) {
                list.clear();
            }
            com.google.android.gms.internal.measurement.zzpq.zza();
            if (!zzibVar.zzc().zzp(this.zzb, zzfwVar)) {
                list.add(java.lang.Long.valueOf(zzabVar.zzg.longValue() / 1000));
                return;
            }
            java.lang.Long valueOf3 = java.lang.Long.valueOf(zzabVar.zzg.longValue() / 1000);
            if (list.contains(valueOf3)) {
                return;
            }
            list.add(valueOf3);
        }
    }

    final com.google.android.gms.internal.measurement.zzhg zzb(int i) {
        java.util.ArrayList arrayList;
        java.util.List list;
        com.google.android.gms.internal.measurement.zzhf zzh = com.google.android.gms.internal.measurement.zzhg.zzh();
        zzh.zza(i);
        zzh.zzd(this.zzc);
        com.google.android.gms.internal.measurement.zzii zziiVar = this.zzd;
        if (zziiVar != null) {
            zzh.zzc(zziiVar);
        }
        com.google.android.gms.internal.measurement.zzih zzi = com.google.android.gms.internal.measurement.zzii.zzi();
        zzi.zzc(com.google.android.gms.measurement.internal.zzpj.zzp(this.zze));
        zzi.zza(com.google.android.gms.measurement.internal.zzpj.zzp(this.zzf));
        java.util.Map map = this.zzg;
        if (map == null) {
            arrayList = null;
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(map.size());
            for (java.lang.Integer num : this.zzg.keySet()) {
                int intValue = num.intValue();
                java.lang.Long l = (java.lang.Long) this.zzg.get(num);
                if (l != null) {
                    com.google.android.gms.internal.measurement.zzhp zze = com.google.android.gms.internal.measurement.zzhq.zze();
                    zze.zza(intValue);
                    zze.zzb(l.longValue());
                    arrayList2.add((com.google.android.gms.internal.measurement.zzhq) zze.zzbc());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            zzi.zze(arrayList);
        }
        java.util.Map map2 = this.zzh;
        if (map2 == null) {
            list = java.util.Collections.emptyList();
        } else {
            java.util.ArrayList arrayList3 = new java.util.ArrayList(map2.size());
            for (java.lang.Integer num2 : this.zzh.keySet()) {
                com.google.android.gms.internal.measurement.zzij zzf = com.google.android.gms.internal.measurement.zzik.zzf();
                zzf.zza(num2.intValue());
                java.util.List list2 = (java.util.List) this.zzh.get(num2);
                if (list2 != null) {
                    java.util.Collections.sort(list2);
                    zzf.zzb(list2);
                }
                arrayList3.add((com.google.android.gms.internal.measurement.zzik) zzf.zzbc());
            }
            list = arrayList3;
        }
        zzi.zzg(list);
        zzh.zzb(zzi);
        return (com.google.android.gms.internal.measurement.zzhg) zzh.zzbc();
    }

    final /* synthetic */ java.util.BitSet zzc() {
        return this.zze;
    }

    /* synthetic */ zzy(com.google.android.gms.measurement.internal.zzad zzadVar, java.lang.String str, byte[] bArr) {
        java.util.Objects.requireNonNull(zzadVar);
        this.zza = zzadVar;
        this.zzb = str;
        this.zzc = true;
        this.zze = new java.util.BitSet();
        this.zzf = new java.util.BitSet();
        this.zzg = new androidx.collection.ArrayMap();
        this.zzh = new androidx.collection.ArrayMap();
    }
}
