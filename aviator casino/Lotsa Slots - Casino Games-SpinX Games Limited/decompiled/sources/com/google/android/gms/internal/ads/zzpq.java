package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzpq {
    private final com.google.android.gms.internal.ads.zzbd zza;
    private com.google.android.gms.internal.ads.zzgwm zzb = com.google.android.gms.internal.ads.zzgwm.zzi();
    private com.google.android.gms.internal.ads.zzgwp zzc = com.google.android.gms.internal.ads.zzgwp.zza();
    private com.google.android.gms.internal.ads.zzxk zzd;
    private com.google.android.gms.internal.ads.zzxk zze;
    private com.google.android.gms.internal.ads.zzxk zzf;

    public zzpq(com.google.android.gms.internal.ads.zzbd zzbdVar) {
        this.zza = zzbdVar;
    }

    private final void zzj(com.google.android.gms.internal.ads.zzbf zzbfVar) {
        com.google.android.gms.internal.ads.zzgwo zzgwoVar = new com.google.android.gms.internal.ads.zzgwo();
        if (this.zzb.isEmpty()) {
            zzk(zzgwoVar, this.zze, zzbfVar);
            if (!java.util.Objects.equals(this.zzf, this.zze)) {
                zzk(zzgwoVar, this.zzf, zzbfVar);
            }
            if (!java.util.Objects.equals(this.zzd, this.zze) && !java.util.Objects.equals(this.zzd, this.zzf)) {
                zzk(zzgwoVar, this.zzd, zzbfVar);
            }
        } else {
            for (int i = 0; i < this.zzb.size(); i++) {
                zzk(zzgwoVar, (com.google.android.gms.internal.ads.zzxk) this.zzb.get(i), zzbfVar);
            }
            if (!this.zzb.contains(this.zzd)) {
                zzk(zzgwoVar, this.zzd, zzbfVar);
            }
        }
        this.zzc = zzgwoVar.zzc();
    }

    private final void zzk(com.google.android.gms.internal.ads.zzgwo zzgwoVar, com.google.android.gms.internal.ads.zzxk zzxkVar, com.google.android.gms.internal.ads.zzbf zzbfVar) {
        if (zzxkVar == null) {
            return;
        }
        if (zzbfVar.zze(zzxkVar.zza) != -1) {
            zzgwoVar.zza(zzxkVar, zzbfVar);
            return;
        }
        com.google.android.gms.internal.ads.zzbf zzbfVar2 = (com.google.android.gms.internal.ads.zzbf) this.zzc.get(zzxkVar);
        if (zzbfVar2 != null) {
            zzgwoVar.zza(zzxkVar, zzbfVar2);
        }
    }

    private static com.google.android.gms.internal.ads.zzxk zzl(com.google.android.gms.internal.ads.zzbb zzbbVar, com.google.android.gms.internal.ads.zzgwm zzgwmVar, com.google.android.gms.internal.ads.zzxk zzxkVar, com.google.android.gms.internal.ads.zzbd zzbdVar) {
        com.google.android.gms.internal.ads.zzbf zzq = zzbbVar.zzq();
        int zzr = zzbbVar.zzr();
        java.lang.Object zzf = zzq.zzg() ? null : zzq.zzf(zzr);
        int zzf2 = (zzbbVar.zzx() || zzq.zzg()) ? -1 : zzq.zzd(zzr, zzbdVar, false).zzf(com.google.android.gms.internal.ads.zzfl.zzs(zzbbVar.zzu()));
        for (int i = 0; i < zzgwmVar.size(); i++) {
            com.google.android.gms.internal.ads.zzxk zzxkVar2 = (com.google.android.gms.internal.ads.zzxk) zzgwmVar.get(i);
            if (zzm(zzxkVar2, zzf, zzbbVar.zzx(), zzbbVar.zzy(), zzbbVar.zzz(), zzf2)) {
                return zzxkVar2;
            }
        }
        if (zzgwmVar.isEmpty() && zzxkVar != null) {
            if (zzm(zzxkVar, zzf, zzbbVar.zzx(), zzbbVar.zzy(), zzbbVar.zzz(), zzf2)) {
                return zzxkVar;
            }
        }
        return null;
    }

    private static boolean zzm(com.google.android.gms.internal.ads.zzxk zzxkVar, java.lang.Object obj, boolean z, int i, int i2, int i3) {
        if (!zzxkVar.zza.equals(obj)) {
            return false;
        }
        if (z) {
            if (zzxkVar.zzb != i || zzxkVar.zzc != i2) {
                return false;
            }
        } else if (zzxkVar.zzb != -1 || zzxkVar.zze != i3) {
            return false;
        }
        return true;
    }

    public final com.google.android.gms.internal.ads.zzxk zza() {
        return this.zzd;
    }

    public final com.google.android.gms.internal.ads.zzxk zzb() {
        return this.zze;
    }

    public final com.google.android.gms.internal.ads.zzxk zzc() {
        return this.zzf;
    }

    public final com.google.android.gms.internal.ads.zzxk zzd() {
        java.lang.Object next;
        java.lang.Object obj;
        if (this.zzb.isEmpty()) {
            return null;
        }
        java.util.List list = this.zzb;
        if (list instanceof java.util.List) {
            java.util.List list2 = list;
            if (list2.isEmpty()) {
                throw new java.util.NoSuchElementException();
            }
            obj = list2.get(list2.size() - 1);
        } else if (list instanceof java.util.SortedSet) {
            obj = ((java.util.SortedSet) list).last();
        } else {
            java.util.Iterator it = list.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            obj = next;
        }
        return (com.google.android.gms.internal.ads.zzxk) obj;
    }

    public final com.google.android.gms.internal.ads.zzbf zze(com.google.android.gms.internal.ads.zzxk zzxkVar) {
        return (com.google.android.gms.internal.ads.zzbf) this.zzc.get(zzxkVar);
    }

    public final void zzf(com.google.android.gms.internal.ads.zzbb zzbbVar) {
        this.zzd = zzl(zzbbVar, this.zzb, this.zze, this.zza);
    }

    public final void zzg(com.google.android.gms.internal.ads.zzbb zzbbVar) {
        this.zzd = zzl(zzbbVar, this.zzb, this.zze, this.zza);
        zzj(zzbbVar.zzq());
    }

    public final void zzh(java.util.List list, com.google.android.gms.internal.ads.zzxk zzxkVar, com.google.android.gms.internal.ads.zzbb zzbbVar) {
        this.zzb = com.google.android.gms.internal.ads.zzgwm.zzq(list);
        if (!list.isEmpty()) {
            this.zze = (com.google.android.gms.internal.ads.zzxk) list.get(0);
            zzxkVar.getClass();
            this.zzf = zzxkVar;
        }
        if (this.zzd == null) {
            this.zzd = zzl(zzbbVar, this.zzb, this.zze, this.zza);
        }
        zzj(zzbbVar.zzq());
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzgwm zzi() {
        return this.zzb;
    }
}
