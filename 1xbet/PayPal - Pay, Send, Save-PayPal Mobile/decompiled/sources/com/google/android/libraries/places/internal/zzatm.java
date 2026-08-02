package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzatm extends com.google.android.libraries.places.internal.zzbke {
    private final com.google.common.collect.ImmutableList zza;
    private final java.util.LinkedHashMap zzb;
    private final java.util.Queue zzc;
    private final java.util.LinkedHashMap zzd;
    private final java.util.Set zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private com.google.android.libraries.places.internal.zzbmg zzi;
    private com.google.android.libraries.places.internal.zzbnp zzj;
    private com.google.android.libraries.places.internal.zzbmg zzk;

    zzatm(com.google.android.libraries.places.internal.zzbiw zzbiwVar, com.google.common.collect.ImmutableList immutableList, java.util.Set set, java.util.concurrent.Executor executor) {
        super(zzbiwVar);
        this.zzb = new java.util.LinkedHashMap();
        this.zzc = new java.util.ArrayDeque();
        this.zzd = new java.util.LinkedHashMap();
        this.zza = immutableList;
        this.zzf = immutableList.size();
        this.zze = set;
    }

    private final boolean zzf() {
        return !this.zzb.isEmpty();
    }

    private final void zzg() {
        if (this.zzg) {
            java.util.Queue<com.google.android.libraries.places.internal.zzatl> queue = this.zzc;
            for (com.google.android.libraries.places.internal.zzatl zzatlVar : queue) {
                java.util.Iterator it = com.google.common.collect.Lists.reverse(this.zza.subList(0, zzatlVar.zzd())).iterator();
                while (it.hasNext()) {
                    java.util.Iterator it2 = com.google.common.collect.Lists.reverse((java.util.List) it.next()).iterator();
                    while (it2.hasNext()) {
                        if (this.zze.contains((com.google.android.libraries.places.internal.zzasm) it2.next())) {
                            com.google.common.base.Preconditions.checkNotNull(zzatlVar.zzc(), "Response message cannot be null");
                        }
                    }
                    if (!zzatlVar.zza()) {
                        return;
                    } else {
                        zzatlVar.zze(zzatlVar.zzd() - 1);
                    }
                }
            }
            while (!queue.isEmpty() && ((com.google.android.libraries.places.internal.zzatl) queue.peek()).zzb()) {
                zze().zzb(((com.google.android.libraries.places.internal.zzatl) queue.poll()).zzc());
            }
            zzh();
        }
    }

    private final void zzh() {
        if (!zzf() && this.zzc.isEmpty() && this.zzh) {
            java.util.Iterator it = com.google.common.collect.Lists.reverse(this.zza).iterator();
            while (it.hasNext()) {
                for (com.google.android.libraries.places.internal.zzasm zzasmVar : com.google.common.collect.Lists.reverse((java.util.List) it.next())) {
                    com.google.android.libraries.places.internal.zzbnp zzbnpVar = this.zzj;
                    com.google.android.libraries.places.internal.zzbmg zzbmgVar = this.zzk;
                    this.zze.contains(zzasmVar);
                }
            }
            if (this.zzd.isEmpty()) {
                zze().zzc(this.zzj, this.zzk);
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbiw
    public final void zza(com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        this.zzi = zzbmgVar;
        for (java.util.List list : com.google.common.collect.Lists.reverse(this.zza.subList(0, this.zzf))) {
            this.zzf--;
            java.util.Iterator it = com.google.common.collect.Lists.reverse(list).iterator();
            while (it.hasNext()) {
                this.zze.contains((com.google.android.libraries.places.internal.zzasm) it.next());
            }
            if (zzf()) {
                return;
            }
        }
        zze().zza(this.zzi);
        this.zzg = true;
        zzg();
    }

    @Override // com.google.android.libraries.places.internal.zzbiw
    public final void zzb(java.lang.Object obj) {
        this.zzc.add(new com.google.android.libraries.places.internal.zzatl(this, obj, this.zza.size()));
        zzg();
    }

    @Override // com.google.android.libraries.places.internal.zzbiw
    public final void zzc(com.google.android.libraries.places.internal.zzbnp zzbnpVar, com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        this.zzj = zzbnpVar;
        this.zzk = zzbmgVar;
        this.zzh = true;
        zzh();
    }
}
