package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcjp extends com.google.android.gms.internal.ads.zzhh {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzhp zzb;
    private final com.google.android.gms.internal.ads.zzcjn zzc;
    private final java.lang.String zzd;
    private final int zze;
    private final boolean zzf;
    private java.io.InputStream zzg;
    private boolean zzh;
    private android.net.Uri zzi;
    private volatile com.google.android.gms.internal.ads.zzbhb zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private long zzo;
    private com.google.common.util.concurrent.ListenableFuture zzp;
    private final java.util.concurrent.atomic.AtomicLong zzq;

    public zzcjp(android.content.Context context, com.google.android.gms.internal.ads.zzhp zzhpVar, java.lang.String str, int i, com.google.android.gms.internal.ads.zzin zzinVar, com.google.android.gms.internal.ads.zzcjn zzcjnVar) {
        super(false);
        this.zza = context;
        this.zzb = zzhpVar;
        this.zzc = zzcjnVar;
        this.zzd = str;
        this.zze = i;
        this.zzk = false;
        this.zzl = false;
        this.zzm = false;
        this.zzn = false;
        this.zzo = 0L;
        this.zzq = new java.util.concurrent.atomic.AtomicLong(-1L);
        this.zzp = null;
        this.zzf = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcB)).booleanValue();
        zze(zzinVar);
    }

    private final boolean zzr() {
        if (!this.zzf) {
            return false;
        }
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfn)).booleanValue() || this.zzm) {
            return ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfo)).booleanValue() && !this.zzn;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (!this.zzh) {
            throw new java.io.IOException("Attempt to read closed GcacheDataSource.");
        }
        java.io.InputStream inputStream = this.zzg;
        int read = inputStream != null ? inputStream.read(bArr, i, i2) : this.zzb.zza(bArr, i, i2);
        if (!this.zzf || this.zzg != null) {
            zzh(read);
        }
        return read;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0205  */
    @Override // com.google.android.gms.internal.ads.zzhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzb(com.google.android.gms.internal.ads.zzht zzhtVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzbgy zzbgyVar;
        java.lang.Long l;
        boolean z;
        boolean z2;
        long elapsedRealtime;
        java.lang.StringBuilder sb;
        com.google.android.gms.internal.ads.zzbhn zzbhnVar;
        if (this.zzh) {
            throw new java.io.IOException("Attempt to open an already open GcacheDataSource.");
        }
        boolean z3 = true;
        this.zzh = true;
        android.net.Uri uri = zzhtVar.zza;
        this.zzi = uri;
        boolean z4 = this.zzf;
        if (!z4) {
            zzg(zzhtVar);
        }
        this.zzj = com.google.android.gms.internal.ads.zzbhb.zza(uri);
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfk)).booleanValue()) {
            if (this.zzj != null) {
                this.zzj.zzh = zzhtVar.zze;
                this.zzj.zzi = com.google.android.gms.internal.ads.zzgua.zza(this.zzd);
                this.zzj.zzj = this.zze;
                zzbgyVar = com.google.android.gms.ads.internal.zzt.zzj().zzc(this.zzj);
            } else {
                zzbgyVar = null;
            }
            if (zzbgyVar != null && zzbgyVar.zza()) {
                this.zzk = zzbgyVar.zzd();
                this.zzm = zzbgyVar.zzg();
                this.zzn = zzbgyVar.zze();
                this.zzo = zzbgyVar.zzf();
                this.zzl = true;
                if (!zzr()) {
                    this.zzg = zzbgyVar.zzb();
                    if (this.zzf) {
                        zzg(zzhtVar);
                    }
                    return -1L;
                }
            }
        } else if (this.zzj != null) {
            this.zzj.zzh = zzhtVar.zze;
            this.zzj.zzi = com.google.android.gms.internal.ads.zzgua.zza(this.zzd);
            this.zzj.zzj = this.zze;
            if (this.zzj.zzg) {
                l = (java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfm);
            } else {
                l = (java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfl);
            }
            long longValue = l.longValue();
            long elapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
            com.google.android.gms.ads.internal.zzt.zzz();
            java.util.concurrent.Future zza = com.google.android.gms.internal.ads.zzbhm.zza(this.zza, this.zzj);
            try {
                try {
                    zzbhnVar = (com.google.android.gms.internal.ads.zzbhn) zza.get(longValue, java.util.concurrent.TimeUnit.MILLISECONDS);
                } catch (java.lang.Throwable th) {
                    th = th;
                    z3 = z4;
                }
                try {
                    this.zzk = zzbhnVar.zzc();
                    this.zzm = zzbhnVar.zzd();
                    this.zzn = zzbhnVar.zzf();
                    this.zzo = zzbhnVar.zze();
                } catch (java.lang.InterruptedException unused) {
                    z2 = true;
                    zza.cancel(true);
                    java.lang.Thread.currentThread().interrupt();
                    elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime2;
                    this.zzc.zza(z2, elapsedRealtime);
                    this.zzl = z2;
                    int length = java.lang.String.valueOf(elapsedRealtime).length() + 24;
                    sb = new java.lang.StringBuilder(length);
                    z4 = length;
                    sb.append("Cache connection took ");
                    sb.append(elapsedRealtime);
                    sb.append("ms");
                    com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
                    this.zzl = false;
                    if (this.zzj != null) {
                    }
                    return this.zzb.zzb(zzhtVar);
                } catch (java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException unused2) {
                    z = true;
                    zza.cancel(true);
                    elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime2;
                    this.zzc.zza(z, elapsedRealtime);
                    this.zzl = z;
                    int length2 = java.lang.String.valueOf(elapsedRealtime).length() + 24;
                    sb = new java.lang.StringBuilder(length2);
                    z4 = length2;
                    sb.append("Cache connection took ");
                    sb.append(elapsedRealtime);
                    sb.append("ms");
                    com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
                    this.zzl = false;
                    if (this.zzj != null) {
                    }
                    return this.zzb.zzb(zzhtVar);
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    long elapsedRealtime3 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime2;
                    this.zzc.zza(z3, elapsedRealtime3);
                    this.zzl = z3;
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(elapsedRealtime3).length() + 24);
                    sb2.append("Cache connection took ");
                    sb2.append(elapsedRealtime3);
                    sb2.append("ms");
                    com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
                    throw th;
                }
            } catch (java.lang.InterruptedException unused3) {
                z2 = false;
            } catch (java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException unused4) {
                z = false;
            } catch (java.lang.Throwable th3) {
                th = th3;
                z3 = false;
            }
            if (!zzr()) {
                this.zzg = zzbhnVar.zzb();
                if (z4) {
                    zzg(zzhtVar);
                }
                long elapsedRealtime4 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime2;
                this.zzc.zza(true, elapsedRealtime4);
                this.zzl = true;
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(elapsedRealtime4).length() + 24);
                sb3.append("Cache connection took ");
                sb3.append(elapsedRealtime4);
                sb3.append("ms");
                com.google.android.gms.ads.internal.util.zze.zza(sb3.toString());
                return -1L;
            }
            long elapsedRealtime5 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime2;
            this.zzc.zza(true, elapsedRealtime5);
            this.zzl = true;
            sb = new java.lang.StringBuilder(java.lang.String.valueOf(elapsedRealtime5).length() + 24);
            sb.append("Cache connection took ");
            sb.append(elapsedRealtime5);
            sb.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
        this.zzl = false;
        if (this.zzj != null) {
            com.google.android.gms.internal.ads.zzhs zzb = zzhtVar.zzb();
            zzb.zza(android.net.Uri.parse(this.zzj.zza));
            zzhtVar = zzb.zze();
        }
        return this.zzb.zzb(zzhtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final android.net.Uri zzc() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zzd() throws java.io.IOException {
        if (!this.zzh) {
            throw new java.io.IOException("Attempt to close an already closed GcacheDataSource.");
        }
        this.zzh = false;
        this.zzi = null;
        boolean z = (this.zzf && this.zzg == null) ? false : true;
        java.io.InputStream inputStream = this.zzg;
        if (inputStream != null) {
            com.google.android.gms.common.util.IOUtils.closeQuietly(inputStream);
            this.zzg = null;
        } else {
            this.zzb.zzd();
        }
        if (z) {
            zzi();
        }
    }

    public final boolean zzk() {
        return this.zzk;
    }

    public final boolean zzl() {
        return this.zzl;
    }

    public final boolean zzm() {
        return this.zzm;
    }

    public final boolean zzn() {
        return this.zzn;
    }

    public final long zzo() {
        return this.zzo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long zzp() {
        if (this.zzj != null) {
            java.util.concurrent.atomic.AtomicLong atomicLong = this.zzq;
            if (atomicLong.get() != -1) {
                return atomicLong.get();
            }
            synchronized (this) {
                if (this.zzp == null) {
                    this.zzp = com.google.android.gms.internal.ads.zzcfr.zza.zzc(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzcjo
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ java.lang.Object call() {
                            return com.google.android.gms.internal.ads.zzcjp.this.zzq();
                        }
                    });
                }
            }
            if (this.zzp.isDone()) {
                try {
                    this.zzq.compareAndSet(-1L, ((java.lang.Long) this.zzp.get()).longValue());
                    return this.zzq.get();
                } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
                }
            }
        }
        return -1L;
    }

    final /* synthetic */ java.lang.Long zzq() {
        return java.lang.Long.valueOf(com.google.android.gms.ads.internal.zzt.zzj().zzd(this.zzj));
    }
}
