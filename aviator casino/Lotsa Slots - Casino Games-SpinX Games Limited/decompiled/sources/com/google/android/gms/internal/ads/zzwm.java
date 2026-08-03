package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzwm implements com.google.android.gms.internal.ads.zzyd {
    private final com.google.android.gms.internal.ads.zzage zza;
    private com.google.android.gms.internal.ads.zzafy zzb;
    private com.google.android.gms.internal.ads.zzafz zzc;

    public zzwm(com.google.android.gms.internal.ads.zzage zzageVar) {
        this.zza = zzageVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0054, code lost:
    
        if (r6.zzn() != r11) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007a, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0077, code lost:
    
        if (r6.zzn() != r11) goto L38;
     */
    @Override // com.google.android.gms.internal.ads.zzyd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(com.google.android.gms.internal.ads.zzj zzjVar, android.net.Uri uri, java.util.Map map, long j, long j2, com.google.android.gms.internal.ads.zzagb zzagbVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzafp zzafpVar = new com.google.android.gms.internal.ads.zzafp(zzjVar, j, j2);
        this.zzc = zzafpVar;
        if (this.zzb != null) {
            return;
        }
        com.google.android.gms.internal.ads.zzafy[] zzb = this.zza.zzb(uri, map);
        int length = zzb.length;
        com.google.android.gms.internal.ads.zzgwj zzv = com.google.android.gms.internal.ads.zzgwm.zzv(length);
        if (length == 1) {
            this.zzb = zzb[0];
        } else {
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                com.google.android.gms.internal.ads.zzafy zzafyVar = zzb[i];
                try {
                } catch (java.io.EOFException unused) {
                    if (this.zzb == null) {
                    }
                } catch (java.lang.Throwable th) {
                    com.google.android.gms.internal.ads.zzgtj.zzi(this.zzb != null || zzafpVar.zzn() == j);
                    zzafpVar.zzl();
                    throw th;
                }
                if (zzafyVar.zza(zzafpVar)) {
                    this.zzb = zzafyVar;
                    com.google.android.gms.internal.ads.zzgtj.zzi(zzafyVar != null || zzafpVar.zzn() == j);
                    zzafpVar.zzl();
                } else {
                    zzv.zzh(zzafyVar.zzb());
                    if (this.zzb == null) {
                    }
                    boolean z = true;
                    com.google.android.gms.internal.ads.zzgtj.zzi(z);
                    zzafpVar.zzl();
                    i++;
                }
            }
            if (this.zzb == null) {
                java.lang.String zzd = com.google.android.gms.internal.ads.zzgtd.zzd(com.google.android.gms.internal.ads.zzgxm.zzc(com.google.android.gms.internal.ads.zzgwm.zzr(zzb), com.google.android.gms.internal.ads.zzwl.zza), ", ");
                java.lang.StringBuilder sb = new java.lang.StringBuilder(zzd.length() + 58);
                sb.append("None of the available extractors (");
                sb.append(zzd);
                sb.append(") could read the stream.");
                throw new com.google.android.gms.internal.ads.zzzo(sb.toString(), uri, zzv.zzi());
            }
        }
        this.zzb.zzc(zzagbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzyd
    public final void zzb() {
        com.google.android.gms.internal.ads.zzafy zzafyVar = this.zzb;
        if (zzafyVar != null) {
            zzafyVar.zzf();
            this.zzb = null;
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzyd
    public final void zzc() {
        com.google.android.gms.internal.ads.zzafy zzafyVar = this.zzb;
        if (zzafyVar != null && (zzafyVar instanceof com.google.android.gms.internal.ads.zzakp)) {
            ((com.google.android.gms.internal.ads.zzakp) zzafyVar).zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyd
    public final long zzd() {
        com.google.android.gms.internal.ads.zzafz zzafzVar = this.zzc;
        if (zzafzVar != null) {
            return zzafzVar.zzn();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzyd
    public final void zze(long j, long j2) {
        com.google.android.gms.internal.ads.zzafy zzafyVar = this.zzb;
        zzafyVar.getClass();
        zzafyVar.zze(j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzyd
    public final int zzf(com.google.android.gms.internal.ads.zzagy zzagyVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzafz zzafzVar;
        com.google.android.gms.internal.ads.zzafy zzafyVar = this.zzb;
        if (zzafyVar == null || (zzafzVar = this.zzc) == null) {
            throw null;
        }
        return zzafyVar.zzd(zzafzVar, zzagyVar);
    }
}
