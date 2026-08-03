package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzmr {
    private final com.google.android.gms.internal.ads.zzqf zza;
    private final com.google.android.gms.internal.ads.zzmq zze;
    private final com.google.android.gms.internal.ads.zznm zzh;
    private final com.google.android.gms.internal.ads.zzdz zzi;
    private boolean zzj;
    private com.google.android.gms.internal.ads.zzin zzk;
    private com.google.android.gms.internal.ads.zzzf zzl = new com.google.android.gms.internal.ads.zzzf(0);
    private final java.util.IdentityHashMap zzc = new java.util.IdentityHashMap();
    private final java.util.Map zzd = new java.util.HashMap();
    private final java.util.List zzb = new java.util.ArrayList();
    private final java.util.HashMap zzf = new java.util.HashMap();
    private final java.util.Set zzg = new java.util.HashSet();

    public zzmr(com.google.android.gms.internal.ads.zzmq zzmqVar, com.google.android.gms.internal.ads.zznm zznmVar, com.google.android.gms.internal.ads.zzdz zzdzVar, com.google.android.gms.internal.ads.zzqf zzqfVar) {
        this.zza = zzqfVar;
        this.zze = zzmqVar;
        this.zzh = zznmVar;
        this.zzi = zzdzVar;
    }

    private final void zzr() {
        java.util.Iterator it = this.zzg.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.zzmo zzmoVar = (com.google.android.gms.internal.ads.zzmo) it.next();
            if (zzmoVar.zzc.isEmpty()) {
                zzs(zzmoVar);
                it.remove();
            }
        }
    }

    private final void zzs(com.google.android.gms.internal.ads.zzmo zzmoVar) {
        com.google.android.gms.internal.ads.zzmn zzmnVar = (com.google.android.gms.internal.ads.zzmn) this.zzf.get(zzmoVar);
        if (zzmnVar != null) {
            zzmnVar.zza.zzr(zzmnVar.zzb);
        }
    }

    private final void zzt(int i, int i2) {
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            }
            com.google.android.gms.internal.ads.zzmo zzmoVar = (com.google.android.gms.internal.ads.zzmo) this.zzb.remove(i2);
            this.zzd.remove(zzmoVar.zzb);
            zzu(i2, -zzmoVar.zza.zzz().zza());
            zzmoVar.zze = true;
            if (this.zzj) {
                zzw(zzmoVar);
            }
        }
    }

    private final void zzu(int i, int i2) {
        while (true) {
            java.util.List list = this.zzb;
            if (i >= list.size()) {
                return;
            }
            ((com.google.android.gms.internal.ads.zzmo) list.get(i)).zzd += i2;
            i++;
        }
    }

    private final void zzv(com.google.android.gms.internal.ads.zzmo zzmoVar) {
        com.google.android.gms.internal.ads.zzxf zzxfVar = zzmoVar.zza;
        com.google.android.gms.internal.ads.zzxl zzxlVar = new com.google.android.gms.internal.ads.zzxl() { // from class: com.google.android.gms.internal.ads.zzmp
            @Override // com.google.android.gms.internal.ads.zzxl
            public final /* synthetic */ void zza(com.google.android.gms.internal.ads.zzxm zzxmVar, com.google.android.gms.internal.ads.zzbf zzbfVar) {
                com.google.android.gms.internal.ads.zzmr.this.zzi(zzxmVar, zzbfVar);
            }
        };
        com.google.android.gms.internal.ads.zzmm zzmmVar = new com.google.android.gms.internal.ads.zzmm(this, zzmoVar);
        this.zzf.put(zzmoVar, new com.google.android.gms.internal.ads.zzmn(zzxfVar, zzxlVar, zzmmVar));
        zzxfVar.zzl(new android.os.Handler(com.google.android.gms.internal.ads.zzfl.zzf(), null), zzmmVar);
        zzxfVar.zzn(new android.os.Handler(com.google.android.gms.internal.ads.zzfl.zzf(), null), zzmmVar);
        zzxfVar.zzp(zzxlVar, this.zzk, this.zza);
    }

    private final void zzw(com.google.android.gms.internal.ads.zzmo zzmoVar) {
        if (zzmoVar.zze && zzmoVar.zzc.isEmpty()) {
            com.google.android.gms.internal.ads.zzmn zzmnVar = (com.google.android.gms.internal.ads.zzmn) this.zzf.remove(zzmoVar);
            zzmnVar.getClass();
            com.google.android.gms.internal.ads.zzxm zzxmVar = zzmnVar.zza;
            zzxmVar.zzs(zzmnVar.zzb);
            com.google.android.gms.internal.ads.zzmm zzmmVar = zzmnVar.zzc;
            zzxmVar.zzm(zzmmVar);
            zzxmVar.zzo(zzmmVar);
            this.zzg.remove(zzmoVar);
        }
    }

    public final com.google.android.gms.internal.ads.zzbf zza(int i, int i2, java.util.List list) {
        com.google.android.gms.internal.ads.zzgtj.zza(i >= 0 && i <= i2 && i2 <= zzc());
        com.google.android.gms.internal.ads.zzgtj.zza(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            ((com.google.android.gms.internal.ads.zzmo) this.zzb.get(i3)).zza.zzA((com.google.android.gms.internal.ads.zzak) list.get(i3 - i));
        }
        return zzh();
    }

    public final boolean zzb() {
        return this.zzj;
    }

    public final int zzc() {
        return this.zzb.size();
    }

    public final void zzd(com.google.android.gms.internal.ads.zzin zzinVar) {
        com.google.android.gms.internal.ads.zzgtj.zzi(!this.zzj);
        this.zzk = zzinVar;
        int i = 0;
        while (true) {
            java.util.List list = this.zzb;
            if (i >= list.size()) {
                this.zzj = true;
                return;
            }
            com.google.android.gms.internal.ads.zzmo zzmoVar = (com.google.android.gms.internal.ads.zzmo) list.get(i);
            zzv(zzmoVar);
            this.zzg.add(zzmoVar);
            i++;
        }
    }

    public final com.google.android.gms.internal.ads.zzxi zze(com.google.android.gms.internal.ads.zzxk zzxkVar, com.google.android.gms.internal.ads.zzabl zzablVar, long j) {
        int i = com.google.android.gms.internal.ads.zzmy.zzb;
        android.util.Pair pair = (android.util.Pair) zzxkVar.zza;
        java.lang.Object obj = pair.first;
        com.google.android.gms.internal.ads.zzxk zza = zzxkVar.zza(pair.second);
        com.google.android.gms.internal.ads.zzmo zzmoVar = (com.google.android.gms.internal.ads.zzmo) this.zzd.get(obj);
        zzmoVar.getClass();
        this.zzg.add(zzmoVar);
        com.google.android.gms.internal.ads.zzmn zzmnVar = (com.google.android.gms.internal.ads.zzmn) this.zzf.get(zzmoVar);
        if (zzmnVar != null) {
            zzmnVar.zza.zzq(zzmnVar.zzb);
        }
        zzmoVar.zzc.add(zza);
        com.google.android.gms.internal.ads.zzxc zzG = zzmoVar.zza.zzG(zza, zzablVar, j);
        this.zzc.put(zzG, zzmoVar);
        zzr();
        return zzG;
    }

    public final void zzf(com.google.android.gms.internal.ads.zzxi zzxiVar) {
        java.util.IdentityHashMap identityHashMap = this.zzc;
        com.google.android.gms.internal.ads.zzmo zzmoVar = (com.google.android.gms.internal.ads.zzmo) identityHashMap.remove(zzxiVar);
        zzmoVar.getClass();
        zzmoVar.zza.zzD(zzxiVar);
        zzmoVar.zzc.remove(((com.google.android.gms.internal.ads.zzxc) zzxiVar).zza);
        if (!identityHashMap.isEmpty()) {
            zzr();
        }
        zzw(zzmoVar);
    }

    public final void zzg() {
        for (com.google.android.gms.internal.ads.zzmn zzmnVar : this.zzf.values()) {
            try {
                zzmnVar.zza.zzs(zzmnVar.zzb);
            } catch (java.lang.RuntimeException e) {
                com.google.android.gms.internal.ads.zzeg.zzf("MediaSourceList", "Failed to release child source.", e);
            }
            com.google.android.gms.internal.ads.zzxm zzxmVar = zzmnVar.zza;
            com.google.android.gms.internal.ads.zzmm zzmmVar = zzmnVar.zzc;
            zzxmVar.zzm(zzmmVar);
            zzxmVar.zzo(zzmmVar);
        }
        this.zzf.clear();
        this.zzg.clear();
        this.zzj = false;
    }

    public final com.google.android.gms.internal.ads.zzbf zzh() {
        java.util.List list = this.zzb;
        if (list.isEmpty()) {
            return com.google.android.gms.internal.ads.zzbf.zza;
        }
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            com.google.android.gms.internal.ads.zzmo zzmoVar = (com.google.android.gms.internal.ads.zzmo) list.get(i2);
            zzmoVar.zzd = i;
            i += zzmoVar.zza.zzz().zza();
        }
        return new com.google.android.gms.internal.ads.zzmy(list, this.zzl);
    }

    final /* synthetic */ void zzi(com.google.android.gms.internal.ads.zzxm zzxmVar, com.google.android.gms.internal.ads.zzbf zzbfVar) {
        this.zze.zzo();
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zznm zzj() {
        return this.zzh;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzdz zzk() {
        return this.zzi;
    }

    public final com.google.android.gms.internal.ads.zzbf zzl(java.util.List list, com.google.android.gms.internal.ads.zzzf zzzfVar) {
        java.util.List list2 = this.zzb;
        zzt(0, list2.size());
        return zzm(list2.size(), list, zzzfVar);
    }

    public final com.google.android.gms.internal.ads.zzbf zzm(int i, java.util.List list, com.google.android.gms.internal.ads.zzzf zzzfVar) {
        if (!list.isEmpty()) {
            this.zzl = zzzfVar;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                com.google.android.gms.internal.ads.zzmo zzmoVar = (com.google.android.gms.internal.ads.zzmo) list.get(i2 - i);
                if (i2 > 0) {
                    com.google.android.gms.internal.ads.zzmo zzmoVar2 = (com.google.android.gms.internal.ads.zzmo) this.zzb.get(i2 - 1);
                    zzmoVar.zzc(zzmoVar2.zzd + zzmoVar2.zza.zzz().zza());
                } else {
                    zzmoVar.zzc(0);
                }
                zzu(i2, zzmoVar.zza.zzz().zza());
                this.zzb.add(i2, zzmoVar);
                this.zzd.put(zzmoVar.zzb, zzmoVar);
                if (this.zzj) {
                    zzv(zzmoVar);
                    if (this.zzc.isEmpty()) {
                        this.zzg.add(zzmoVar);
                    } else {
                        zzs(zzmoVar);
                    }
                }
            }
        }
        return zzh();
    }

    public final com.google.android.gms.internal.ads.zzbf zzn(int i, int i2, com.google.android.gms.internal.ads.zzzf zzzfVar) {
        boolean z = false;
        if (i >= 0 && i <= i2 && i2 <= zzc()) {
            z = true;
        }
        com.google.android.gms.internal.ads.zzgtj.zza(z);
        this.zzl = zzzfVar;
        zzt(i, i2);
        return zzh();
    }

    public final com.google.android.gms.internal.ads.zzbf zzo(int i, int i2, int i3, com.google.android.gms.internal.ads.zzzf zzzfVar) {
        com.google.android.gms.internal.ads.zzgtj.zza(zzc() >= 0);
        this.zzl = null;
        return zzh();
    }

    public final com.google.android.gms.internal.ads.zzbf zzp(com.google.android.gms.internal.ads.zzzf zzzfVar) {
        int zzc = zzc();
        if (zzzfVar.zza() != zzc) {
            zzzfVar = zzzfVar.zzg().zzf(0, zzc);
        }
        this.zzl = zzzfVar;
        return zzh();
    }

    public final com.google.android.gms.internal.ads.zzzf zzq() {
        return this.zzl;
    }
}
