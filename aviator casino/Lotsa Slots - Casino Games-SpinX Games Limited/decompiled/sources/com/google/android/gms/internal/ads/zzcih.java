package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcih implements com.google.android.gms.internal.ads.zzhp {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzhp zzb;
    private final java.lang.String zzc;
    private final int zzd;
    private final boolean zze;
    private java.io.InputStream zzf;
    private boolean zzg;
    private android.net.Uri zzh;
    private volatile com.google.android.gms.internal.ads.zzbhb zzi;
    private boolean zzj = false;
    private boolean zzk = false;
    private com.google.android.gms.internal.ads.zzht zzl;

    public zzcih(android.content.Context context, com.google.android.gms.internal.ads.zzhp zzhpVar, java.lang.String str, int i, com.google.android.gms.internal.ads.zzin zzinVar, com.google.android.gms.internal.ads.zzcig zzcigVar) {
        this.zza = context;
        this.zzb = zzhpVar;
        this.zzc = str;
        this.zzd = i;
        new java.util.concurrent.atomic.AtomicLong(-1L);
        this.zze = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcB)).booleanValue();
    }

    private final boolean zzf() {
        if (!this.zze) {
            return false;
        }
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfn)).booleanValue() || this.zzj) {
            return ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfo)).booleanValue() && !this.zzk;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (!this.zzg) {
            throw new java.io.IOException("Attempt to read closed CacheDataSource.");
        }
        java.io.InputStream inputStream = this.zzf;
        return inputStream != null ? inputStream.read(bArr, i, i2) : this.zzb.zza(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final long zzb(com.google.android.gms.internal.ads.zzht zzhtVar) throws java.io.IOException {
        java.lang.Long l;
        if (this.zzg) {
            throw new java.io.IOException("Attempt to open an already open CacheDataSource.");
        }
        this.zzg = true;
        android.net.Uri uri = zzhtVar.zza;
        this.zzh = uri;
        this.zzl = zzhtVar;
        this.zzi = com.google.android.gms.internal.ads.zzbhb.zza(uri);
        com.google.android.gms.internal.ads.zzbgy zzbgyVar = null;
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfk)).booleanValue()) {
            if (this.zzi != null) {
                this.zzi.zzh = zzhtVar.zze;
                this.zzi.zzi = com.google.android.gms.internal.ads.zzgua.zza(this.zzc);
                this.zzi.zzj = this.zzd;
                zzbgyVar = com.google.android.gms.ads.internal.zzt.zzj().zzc(this.zzi);
            }
            if (zzbgyVar != null && zzbgyVar.zza()) {
                this.zzj = zzbgyVar.zzg();
                this.zzk = zzbgyVar.zze();
                if (!zzf()) {
                    this.zzf = zzbgyVar.zzb();
                    return -1L;
                }
            }
        } else if (this.zzi != null) {
            this.zzi.zzh = zzhtVar.zze;
            this.zzi.zzi = com.google.android.gms.internal.ads.zzgua.zza(this.zzc);
            this.zzi.zzj = this.zzd;
            if (this.zzi.zzg) {
                l = (java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfm);
            } else {
                l = (java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfl);
            }
            long longValue = l.longValue();
            com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
            com.google.android.gms.ads.internal.zzt.zzz();
            java.util.concurrent.Future zza = com.google.android.gms.internal.ads.zzbhm.zza(this.zza, this.zzi);
            try {
                try {
                    com.google.android.gms.internal.ads.zzbhn zzbhnVar = (com.google.android.gms.internal.ads.zzbhn) zza.get(longValue, java.util.concurrent.TimeUnit.MILLISECONDS);
                    zzbhnVar.zzc();
                    this.zzj = zzbhnVar.zzd();
                    this.zzk = zzbhnVar.zzf();
                    zzbhnVar.zze();
                    if (!zzf()) {
                        this.zzf = zzbhnVar.zzb();
                    }
                } catch (java.lang.InterruptedException unused) {
                    zza.cancel(false);
                    java.lang.Thread.currentThread().interrupt();
                } catch (java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException unused2) {
                    zza.cancel(false);
                }
            } catch (java.lang.Throwable unused3) {
            }
            com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
            throw null;
        }
        if (this.zzi != null) {
            com.google.android.gms.internal.ads.zzhs zzb = zzhtVar.zzb();
            zzb.zza(android.net.Uri.parse(this.zzi.zza));
            this.zzl = zzb.zze();
        }
        return this.zzb.zzb(this.zzl);
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final android.net.Uri zzc() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zzd() throws java.io.IOException {
        if (!this.zzg) {
            throw new java.io.IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.zzg = false;
        this.zzh = null;
        java.io.InputStream inputStream = this.zzf;
        if (inputStream == null) {
            this.zzb.zzd();
        } else {
            com.google.android.gms.common.util.IOUtils.closeQuietly(inputStream);
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zze(com.google.android.gms.internal.ads.zzin zzinVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public /* synthetic */ java.util.Map zzj() {
        java.util.Map emptyMap;
        emptyMap = java.util.Collections.emptyMap();
        return emptyMap;
    }
}
