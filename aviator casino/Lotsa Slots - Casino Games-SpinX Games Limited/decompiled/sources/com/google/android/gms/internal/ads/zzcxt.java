package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public class zzcxt implements com.google.android.gms.internal.ads.zzepe {
    protected final com.google.android.gms.internal.ads.zzfkq zza;
    protected final com.google.android.gms.internal.ads.zzfkf zzb;
    private final com.google.android.gms.internal.ads.zzddq zzc;
    private final com.google.android.gms.internal.ads.zzded zzd;
    private final com.google.android.gms.internal.ads.zzfht zze;
    private final com.google.android.gms.internal.ads.zzdck zzf;
    private final com.google.android.gms.internal.ads.zzdhi zzg;
    private final com.google.android.gms.internal.ads.zzdeh zzh;
    private final com.google.android.gms.internal.ads.zzdkn zzi;
    private final com.google.android.gms.internal.ads.zzdbn zzj;
    private final com.google.android.gms.internal.ads.zzeao zzk;

    protected zzcxt(com.google.android.gms.internal.ads.zzcxs zzcxsVar) {
        this.zza = zzcxsVar.zza();
        this.zzb = zzcxsVar.zzb();
        this.zzc = zzcxsVar.zzc();
        this.zzd = zzcxsVar.zzd();
        this.zze = zzcxsVar.zze();
        this.zzf = zzcxsVar.zzf();
        this.zzg = zzcxsVar.zzg();
        this.zzh = zzcxsVar.zzh();
        this.zzi = zzcxsVar.zzi();
        this.zzj = zzcxsVar.zzj();
        this.zzk = zzcxsVar.zzk();
    }

    public void zzd() {
        this.zzc.zzc(null);
    }

    public void zzj() {
        this.zzd.zzg();
        this.zzh.zza(this);
    }

    public final com.google.android.gms.internal.ads.zzddq zzl() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzepe
    public final void zzm() {
        this.zzi.zzi();
    }

    public final com.google.android.gms.internal.ads.zzdck zzn() {
        return this.zzf;
    }

    public final com.google.android.gms.internal.ads.zzdbn zzo() {
        return this.zzj;
    }

    public final com.google.android.gms.internal.ads.zzfht zzp() {
        return this.zze;
    }

    public final com.google.android.gms.internal.ads.zzdgh zzq() {
        return this.zzg.zzn();
    }

    public final com.google.android.gms.internal.ads.zzfkq zzr() {
        return this.zza;
    }

    public final boolean zzs() {
        return this.zzb.zzaq;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzt() {
        com.google.android.gms.internal.ads.zzeao zzeaoVar;
        java.util.List list = this.zzb.zzaC;
        if (list == null || list.isEmpty() || (zzeaoVar = this.zzk) == null) {
            return;
        }
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziL)).booleanValue() || list.isEmpty()) {
            return;
        }
        com.google.android.gms.internal.ads.zzgzb listIterator = ((com.google.android.gms.internal.ads.zzgwm) list).listIterator(0);
        while (listIterator.hasNext()) {
            com.google.android.gms.internal.ads.zzeap zzeapVar = (com.google.android.gms.internal.ads.zzeap) listIterator.next();
            int[] iArr = zzeapVar.zzb;
            int length = iArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (iArr[i] == 1) {
                    zzeaoVar.zza(zzeapVar.zza, 1, com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
                    break;
                }
                i++;
            }
        }
    }
}
