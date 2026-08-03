package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzpu implements com.google.android.gms.internal.ads.zzqd {
    public static final com.google.android.gms.internal.ads.zzgub zza = com.google.android.gms.internal.ads.zzps.zza;
    private static final java.util.Random zzb = new java.util.Random();
    private final com.google.android.gms.internal.ads.zzbe zzc;
    private final com.google.android.gms.internal.ads.zzbd zzd;
    private final java.util.HashMap zze;
    private com.google.android.gms.internal.ads.zzqc zzf;
    private com.google.android.gms.internal.ads.zzbf zzg;
    private java.lang.String zzh;
    private long zzi;

    public zzpu() {
        throw null;
    }

    public zzpu(com.google.android.gms.internal.ads.zzgub zzgubVar) {
        this.zzc = new com.google.android.gms.internal.ads.zzbe();
        this.zzd = new com.google.android.gms.internal.ads.zzbd();
        this.zze = new java.util.HashMap();
        this.zzg = com.google.android.gms.internal.ads.zzbf.zza;
        this.zzi = -1L;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER})
    private final void zzl(com.google.android.gms.internal.ads.zznn zznnVar) {
        if (zznnVar.zzb.zzg()) {
            java.lang.String str = this.zzh;
            if (str != null) {
                com.google.android.gms.internal.ads.zzpt zzptVar = (com.google.android.gms.internal.ads.zzpt) this.zze.get(str);
                zzptVar.getClass();
                zzm(zzptVar);
                return;
            }
            return;
        }
        com.google.android.gms.internal.ads.zzpt zzptVar2 = (com.google.android.gms.internal.ads.zzpt) this.zze.get(this.zzh);
        int i = zznnVar.zzc;
        com.google.android.gms.internal.ads.zzxk zzxkVar = zznnVar.zzd;
        this.zzh = zzo(i, zzxkVar).zze();
        zzc(zznnVar);
        if (zzxkVar == null || !zzxkVar.zzb()) {
            return;
        }
        if (zzptVar2 != null) {
            if (zzptVar2.zzg() == zzxkVar.zzd && zzptVar2.zzh() != null) {
                com.google.android.gms.internal.ads.zzxk zzh = zzptVar2.zzh();
                if (zzh.zzb == zzxkVar.zzb) {
                    com.google.android.gms.internal.ads.zzxk zzh2 = zzptVar2.zzh();
                    if (zzh2.zzc == zzxkVar.zzc) {
                        return;
                    }
                }
            }
        }
        zzo(i, new com.google.android.gms.internal.ads.zzxk(zzxkVar.zza, zzxkVar.zzd));
    }

    private final void zzm(com.google.android.gms.internal.ads.zzpt zzptVar) {
        if (zzptVar.zzg() != -1 && zzptVar.zzi()) {
            this.zzi = zzptVar.zzg();
        }
        this.zzh = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final long zzi() {
        com.google.android.gms.internal.ads.zzpt zzptVar = (com.google.android.gms.internal.ads.zzpt) this.zze.get(this.zzh);
        return (zzptVar == null || zzptVar.zzg() == -1) ? this.zzi + 1 : zzptVar.zzg();
    }

    private final com.google.android.gms.internal.ads.zzpt zzo(int i, com.google.android.gms.internal.ads.zzxk zzxkVar) {
        java.util.HashMap hashMap = this.zze;
        long j = Long.MAX_VALUE;
        com.google.android.gms.internal.ads.zzpt zzptVar = null;
        for (com.google.android.gms.internal.ads.zzpt zzptVar2 : hashMap.values()) {
            zzptVar2.zzc(i, zzxkVar);
            if (zzptVar2.zzb(i, zzxkVar)) {
                long zzg = zzptVar2.zzg();
                if (zzg == -1 || zzg < j) {
                    zzptVar = zzptVar2;
                    j = zzg;
                } else if (zzg == j) {
                    java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
                    if (zzptVar.zzh() != null && zzptVar2.zzh() != null) {
                        zzptVar = zzptVar2;
                    }
                }
            }
        }
        if (zzptVar != null) {
            return zzptVar;
        }
        java.lang.String zzp = zzp();
        com.google.android.gms.internal.ads.zzpt zzptVar3 = new com.google.android.gms.internal.ads.zzpt(this, zzp, i, zzxkVar);
        hashMap.put(zzp, zzptVar3);
        return zzptVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String zzp() {
        byte[] bArr = new byte[12];
        zzb.nextBytes(bArr);
        return android.util.Base64.encodeToString(bArr, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final void zza(com.google.android.gms.internal.ads.zzqc zzqcVar) {
        this.zzf = zzqcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final synchronized java.lang.String zzb(com.google.android.gms.internal.ads.zzbf zzbfVar, com.google.android.gms.internal.ads.zzxk zzxkVar) {
        return zzo(zzbfVar.zzo(zzxkVar.zza, this.zzd).zzc, zzxkVar).zze();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0022, code lost:
    
        if (r2 < zzn()) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:
    
        if (r2.zzf() != r10.zzc) goto L40;
     */
    @Override // com.google.android.gms.internal.ads.zzqd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzc(com.google.android.gms.internal.ads.zznn zznnVar) {
        this.zzf.getClass();
        com.google.android.gms.internal.ads.zzbf zzbfVar = zznnVar.zzb;
        if (!zzbfVar.zzg()) {
            com.google.android.gms.internal.ads.zzxk zzxkVar = zznnVar.zzd;
            if (zzxkVar != null) {
                long j = zzxkVar.zzd;
                if (j != -1) {
                }
                com.google.android.gms.internal.ads.zzpt zzptVar = (com.google.android.gms.internal.ads.zzpt) this.zze.get(this.zzh);
                if (zzptVar != null) {
                    if (zzptVar.zzg() == -1) {
                    }
                }
            }
            int i = zznnVar.zzc;
            com.google.android.gms.internal.ads.zzpt zzo = zzo(i, zzxkVar);
            if (this.zzh == null) {
                this.zzh = zzo.zze();
            }
            if (zzxkVar != null && zzxkVar.zzb()) {
                java.lang.Object obj = zzxkVar.zza;
                long j2 = zzxkVar.zzd;
                int i2 = zzxkVar.zzb;
                com.google.android.gms.internal.ads.zzpt zzo2 = zzo(i, new com.google.android.gms.internal.ads.zzxk(obj, j2, i2));
                if (!zzo2.zzi()) {
                    zzo2.zzj(true);
                    com.google.android.gms.internal.ads.zzbd zzbdVar = this.zzd;
                    zzbfVar.zzo(obj, zzbdVar);
                    zzbdVar.zzc(i2);
                    java.lang.Math.max(0L, com.google.android.gms.internal.ads.zzfl.zzr(0L) + com.google.android.gms.internal.ads.zzfl.zzr(0L));
                }
            }
            if (!zzo.zzi()) {
                zzo.zzj(true);
            }
            if (zzo.zze().equals(this.zzh) && !zzo.zzk()) {
                zzo.zzl(true);
                this.zzf.zzc(zznnVar, zzo.zze());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final synchronized void zzd(com.google.android.gms.internal.ads.zznn zznnVar) {
        this.zzf.getClass();
        com.google.android.gms.internal.ads.zzbf zzbfVar = this.zzg;
        this.zzg = zznnVar.zzb;
        java.util.Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.zzpt zzptVar = (com.google.android.gms.internal.ads.zzpt) it.next();
            if (!zzptVar.zza(zzbfVar, this.zzg) || zzptVar.zzd(zznnVar)) {
                it.remove();
                if (zzptVar.zze().equals(this.zzh)) {
                    zzm(zzptVar);
                }
                if (zzptVar.zzi()) {
                    this.zzf.zzd(zznnVar, zzptVar.zze(), false);
                }
            }
        }
        zzl(zznnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final synchronized void zze(com.google.android.gms.internal.ads.zznn zznnVar, int i) {
        this.zzf.getClass();
        java.util.Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.zzpt zzptVar = (com.google.android.gms.internal.ads.zzpt) it.next();
            if (zzptVar.zzd(zznnVar)) {
                it.remove();
                boolean equals = zzptVar.zze().equals(this.zzh);
                if (equals) {
                    zzm(zzptVar);
                }
                if (zzptVar.zzi()) {
                    boolean z = false;
                    if (i == 0 && equals && zzptVar.zzk()) {
                        z = true;
                    }
                    this.zzf.zzd(zznnVar, zzptVar.zze(), z);
                }
            }
        }
        zzl(zznnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final synchronized java.lang.String zzf() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final synchronized void zzg(com.google.android.gms.internal.ads.zznn zznnVar) {
        com.google.android.gms.internal.ads.zzqc zzqcVar;
        java.lang.String str = this.zzh;
        if (str != null) {
            com.google.android.gms.internal.ads.zzpt zzptVar = (com.google.android.gms.internal.ads.zzpt) this.zze.get(str);
            zzptVar.getClass();
            com.google.android.gms.internal.ads.zzpt zzptVar2 = zzptVar;
            zzm(zzptVar);
        }
        java.util.Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.zzpt zzptVar3 = (com.google.android.gms.internal.ads.zzpt) it.next();
            it.remove();
            if (zzptVar3.zzi() && (zzqcVar = this.zzf) != null) {
                zzqcVar.zzd(zznnVar, zzptVar3.zze(), false);
            }
        }
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzbe zzj() {
        return this.zzc;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzbd zzk() {
        return this.zzd;
    }
}
