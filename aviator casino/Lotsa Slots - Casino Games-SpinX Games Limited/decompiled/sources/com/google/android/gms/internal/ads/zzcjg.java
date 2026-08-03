package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcjg extends com.google.android.gms.internal.ads.zzcja implements com.google.android.gms.internal.ads.zzin {
    private static final java.util.concurrent.atomic.AtomicInteger zzo = new java.util.concurrent.atomic.AtomicInteger(0);
    private java.lang.String zzd;
    private final com.google.android.gms.internal.ads.zzchm zze;
    private boolean zzf;
    private final com.google.android.gms.internal.ads.zzcjf zzg;
    private final com.google.android.gms.internal.ads.zzcij zzh;
    private java.nio.ByteBuffer zzi;
    private boolean zzj;
    private final java.lang.Object zzk;
    private final java.lang.String zzl;
    private final int zzm;
    private boolean zzn;

    public zzcjg(com.google.android.gms.internal.ads.zzchn zzchnVar, com.google.android.gms.internal.ads.zzchm zzchmVar) {
        super(zzchnVar);
        this.zze = zzchmVar;
        this.zzg = new com.google.android.gms.internal.ads.zzcjf();
        this.zzh = new com.google.android.gms.internal.ads.zzcij();
        this.zzk = new java.lang.Object();
        this.zzl = (java.lang.String) com.google.android.gms.internal.ads.zzgth.zzd(zzchnVar != null ? zzchnVar.zzn() : null).zza("");
        this.zzm = zzchnVar != null ? zzchnVar.zzp() : 0;
        zzo.incrementAndGet();
    }

    public static int zzr() {
        return zzo.get();
    }

    protected static final java.lang.String zzv(java.lang.String str) {
        java.lang.String zzg = com.google.android.gms.ads.internal.util.client.zzf.zzg(str);
        java.lang.String.valueOf(zzg);
        return "cache:".concat(java.lang.String.valueOf(zzg));
    }

    private final void zzx() {
        int zza = (int) this.zzg.zza();
        int zza2 = (int) this.zzh.zza(this.zzi);
        int position = this.zzi.position();
        int round = java.lang.Math.round(zza2 * (position / zza));
        int zzP = com.google.android.gms.internal.ads.zzche.zzP();
        int zzQ = com.google.android.gms.internal.ads.zzche.zzQ();
        java.lang.String str = this.zzd;
        zzn(str, zzv(str), position, zza, round, zza2, round > 0, zzP, zzQ);
    }

    @Override // com.google.android.gms.internal.ads.zzcja, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzo.decrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.zzin
    public final void zza(com.google.android.gms.internal.ads.zzhp zzhpVar, com.google.android.gms.internal.ads.zzht zzhtVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzin
    public final void zzb(com.google.android.gms.internal.ads.zzhp zzhpVar, com.google.android.gms.internal.ads.zzht zzhtVar, boolean z) {
        if (zzhpVar instanceof com.google.android.gms.internal.ads.zzia) {
            this.zzg.zzb((com.google.android.gms.internal.ads.zzia) zzhpVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzin
    public final void zzc(com.google.android.gms.internal.ads.zzhp zzhpVar, com.google.android.gms.internal.ads.zzht zzhtVar, boolean z, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzin
    public final void zzd(com.google.android.gms.internal.ads.zzhp zzhpVar, com.google.android.gms.internal.ads.zzht zzhtVar, boolean z) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00bb, code lost:
    
        r30.zzn = true;
        zzp(r31, r4, (int) r30.zzh.zza(r30.zzi));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:? -> B:55:0x0165). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.zzcja
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zze(java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        this.zzd = str;
        java.lang.String str5 = "error";
        java.lang.String zzv = zzv(str);
        try {
            com.google.android.gms.internal.ads.zzhw zzhwVar = new com.google.android.gms.internal.ads.zzhw();
            zzhwVar.zzb(this.zzb);
            com.google.android.gms.internal.ads.zzchm zzchmVar = this.zze;
            zzhwVar.zzc(zzchmVar.zzd);
            zzhwVar.zzd(zzchmVar.zze);
            zzhwVar.zze(true);
            zzhwVar.zzf(this);
            com.google.android.gms.internal.ads.zzhp zza = zzhwVar.zza();
            if (zzchmVar.zzi) {
                zza = new com.google.android.gms.internal.ads.zzcih(this.zza, zza, this.zzl, this.zzm, null, null);
            }
            zza.zzb(new com.google.android.gms.internal.ads.zzht(android.net.Uri.parse(str), 0L, -1L, null));
            com.google.android.gms.internal.ads.zzchn zzchnVar = (com.google.android.gms.internal.ads.zzchn) this.zzc.get();
            if (zzchnVar != null) {
                zzchnVar.zzt(zzv, this);
            }
            com.google.android.gms.common.util.Clock zzk = com.google.android.gms.ads.internal.zzt.zzk();
            long currentTimeMillis = zzk.currentTimeMillis();
            long longValue = ((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzam)).longValue();
            long longValue2 = ((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzal)).longValue();
            this.zzi = java.nio.ByteBuffer.allocate(zzchmVar.zzc);
            byte[] bArr = new byte[8192];
            long j = currentTimeMillis;
            while (true) {
                str2 = str5;
                try {
                    int zza2 = zza.zza(bArr, 0, java.lang.Math.min(this.zzi.remaining(), 8192));
                    if (zza2 == -1) {
                        break;
                    }
                    synchronized (this.zzk) {
                        com.google.android.gms.internal.ads.zzhp zzhpVar = zza;
                        try {
                            if (this.zzf) {
                                str3 = zzv;
                            } else {
                                str3 = zzv;
                                try {
                                    this.zzi.put(bArr, 0, zza2);
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    throw th;
                                }
                            }
                            try {
                                if (this.zzi.remaining() <= 0) {
                                    zzx();
                                    break;
                                }
                                str4 = this.zzf;
                                try {
                                    if (str4 != 0) {
                                        int limit = this.zzi.limit();
                                        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(limit).length() + 24);
                                        sb.append("Precache abort at ");
                                        sb.append(limit);
                                        sb.append(" bytes");
                                        throw new java.io.IOException(sb.toString());
                                    }
                                    long currentTimeMillis2 = zzk.currentTimeMillis();
                                    if (currentTimeMillis2 - j >= longValue) {
                                        zzx();
                                        j = currentTimeMillis2;
                                    }
                                    if (currentTimeMillis2 - currentTimeMillis > 1000 * longValue2) {
                                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(longValue2).length() + 29);
                                        sb2.append("Timeout exceeded. Limit: ");
                                        sb2.append(longValue2);
                                        sb2.append(" sec");
                                        throw new java.io.IOException(sb2.toString());
                                    }
                                    str5 = str2;
                                    zza = zzhpVar;
                                    zzv = str3;
                                } catch (java.lang.Exception e) {
                                    e = e;
                                    java.lang.String canonicalName = e.getClass().getCanonicalName();
                                    java.lang.String message = e.getMessage();
                                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(canonicalName).length() + 1 + java.lang.String.valueOf(message).length());
                                    sb3.append(canonicalName);
                                    sb3.append(":");
                                    sb3.append(message);
                                    java.lang.String sb4 = sb3.toString();
                                    java.lang.StringBuilder sb5 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 34 + sb4.length());
                                    sb5.append("Failed to preload url ");
                                    sb5.append(str);
                                    sb5.append(" Exception: ");
                                    sb5.append(sb4);
                                    java.lang.String sb6 = sb5.toString();
                                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                                    com.google.android.gms.ads.internal.util.client.zzo.zzi(sb6);
                                    zzq(str, str3, str4, sb4);
                                    return false;
                                }
                            } catch (java.lang.Exception e2) {
                                e = e2;
                                str4 = str2;
                                java.lang.String canonicalName2 = e.getClass().getCanonicalName();
                                java.lang.String message2 = e.getMessage();
                                java.lang.StringBuilder sb32 = new java.lang.StringBuilder(java.lang.String.valueOf(canonicalName2).length() + 1 + java.lang.String.valueOf(message2).length());
                                sb32.append(canonicalName2);
                                sb32.append(":");
                                sb32.append(message2);
                                java.lang.String sb42 = sb32.toString();
                                java.lang.StringBuilder sb52 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 34 + sb42.length());
                                sb52.append("Failed to preload url ");
                                sb52.append(str);
                                sb52.append(" Exception: ");
                                sb52.append(sb42);
                                java.lang.String sb62 = sb52.toString();
                                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzi(sb62);
                                zzq(str, str3, str4, sb42);
                                return false;
                            }
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                } catch (java.lang.Exception e3) {
                    e = e3;
                    str3 = zzv;
                    str4 = str2;
                    java.lang.String canonicalName22 = e.getClass().getCanonicalName();
                    java.lang.String message22 = e.getMessage();
                    java.lang.StringBuilder sb322 = new java.lang.StringBuilder(java.lang.String.valueOf(canonicalName22).length() + 1 + java.lang.String.valueOf(message22).length());
                    sb322.append(canonicalName22);
                    sb322.append(":");
                    sb322.append(message22);
                    java.lang.String sb422 = sb322.toString();
                    java.lang.StringBuilder sb522 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 34 + sb422.length());
                    sb522.append("Failed to preload url ");
                    sb522.append(str);
                    sb522.append(" Exception: ");
                    sb522.append(sb422);
                    java.lang.String sb622 = sb522.toString();
                    int i22 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi(sb622);
                    zzq(str, str3, str4, sb422);
                    return false;
                }
            }
            return true;
        } catch (java.lang.Exception e4) {
            e = e4;
            str2 = str5;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcja
    public final void zzl() {
        this.zzf = true;
    }

    public final java.lang.String zzs() {
        return this.zzd;
    }

    public final boolean zzt() {
        return this.zzn;
    }

    public final java.nio.ByteBuffer zzu() {
        synchronized (this.zzk) {
            java.nio.ByteBuffer byteBuffer = this.zzi;
            if (byteBuffer != null && !this.zzj) {
                byteBuffer.flip();
                this.zzj = true;
            }
            this.zzf = true;
        }
        return this.zzi;
    }
}
