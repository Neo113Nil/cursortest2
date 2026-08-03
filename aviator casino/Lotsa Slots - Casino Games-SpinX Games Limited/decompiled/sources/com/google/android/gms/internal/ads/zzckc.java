package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzckc extends com.google.android.gms.internal.ads.zzche implements com.google.android.gms.internal.ads.zzin, com.google.android.gms.internal.ads.zznp {
    public static final /* synthetic */ int zza = 0;
    private final android.content.Context zzb;
    private final com.google.android.gms.internal.ads.zzcjm zzc;
    private final com.google.android.gms.internal.ads.zzaay zzd;
    private final com.google.android.gms.internal.ads.zzchm zze;
    private final java.lang.ref.WeakReference zzf;
    private final com.google.android.gms.internal.ads.zzyt zzg;
    private com.google.android.gms.internal.ads.zzjv zzh;
    private java.nio.ByteBuffer zzi;
    private boolean zzj;
    private com.google.android.gms.internal.ads.zzchd zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private final java.lang.String zzo;
    private final int zzp;
    private java.lang.Integer zzr;
    private final java.util.ArrayList zzs;
    private volatile com.google.android.gms.internal.ads.zzcjp zzt;
    private final java.lang.Object zzq = new java.lang.Object();
    private final java.util.Set zzu = new java.util.HashSet();

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e3, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcB)).booleanValue() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e9, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ec, code lost:
    
        if (r5.zzl == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ee, code lost:
    
        r6 = new com.google.android.gms.internal.ads.zzcjs(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0105, code lost:
    
        if (r5.zzi == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0107, code lost:
    
        r5 = new com.google.android.gms.internal.ads.zzcjv(r3, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x010f, code lost:
    
        r4 = r3.zzi;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0111, code lost:
    
        if (r4 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0117, code lost:
    
        if (r4.limit() <= 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0119, code lost:
    
        r4 = new byte[r3.zzi.limit()];
        r3.zzi.get(r4);
        r5 = new com.google.android.gms.internal.ads.zzcjw(r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x010e, code lost:
    
        r5 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f6, code lost:
    
        if (r5.zzh <= 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f8, code lost:
    
        r6 = new com.google.android.gms.internal.ads.zzcju(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fe, code lost:
    
        r6 = new com.google.android.gms.internal.ads.zzcjt(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e7, code lost:
    
        if (r5.zzi == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzckc(android.content.Context context, com.google.android.gms.internal.ads.zzchm zzchmVar, com.google.android.gms.internal.ads.zzchn zzchnVar, java.lang.Integer num) {
        final com.google.android.gms.internal.ads.zzho zzhoVar;
        this.zzb = context;
        this.zze = zzchmVar;
        this.zzr = num;
        this.zzf = new java.lang.ref.WeakReference(zzchnVar);
        com.google.android.gms.internal.ads.zzcjm zzcjmVar = new com.google.android.gms.internal.ads.zzcjm();
        this.zzc = zzcjmVar;
        com.google.android.gms.internal.ads.zzaay zzaayVar = new com.google.android.gms.internal.ads.zzaay(context);
        this.zzd = zzaayVar;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("SimpleExoPlayerAdapter initialize ".concat(toString()));
        }
        zzf().incrementAndGet();
        com.google.android.gms.internal.ads.zznj zznjVar = new com.google.android.gms.internal.ads.zznj(context, new com.google.android.gms.internal.ads.zznf() { // from class: com.google.android.gms.internal.ads.zzcjx
            @Override // com.google.android.gms.internal.ads.zznf
            public final /* synthetic */ com.google.android.gms.internal.ads.zzna[] zza(android.os.Handler handler, com.google.android.gms.internal.ads.zzaep zzaepVar, com.google.android.gms.internal.ads.zzrv zzrvVar, com.google.android.gms.internal.ads.zzzq zzzqVar, com.google.android.gms.internal.ads.zzwi zzwiVar) {
                return com.google.android.gms.internal.ads.zzckc.this.zzW(handler, zzaepVar, zzrvVar, zzzqVar, zzwiVar);
            }
        });
        zznjVar.zza(zzaayVar);
        zznjVar.zzb(zzcjmVar);
        com.google.android.gms.internal.ads.zznk zzc = zznjVar.zzc();
        this.zzh = zzc;
        zzc.zzD(this);
        final boolean z = false;
        this.zzl = 0;
        this.zzn = 0L;
        this.zzm = 0;
        this.zzs = new java.util.ArrayList();
        this.zzt = null;
        this.zzo = (java.lang.String) com.google.android.gms.internal.ads.zzgth.zzd(zzchnVar != null ? zzchnVar.zzn() : null).zza("");
        this.zzp = zzchnVar != null ? zzchnVar.zzp() : 0;
        final java.lang.String zze = com.google.android.gms.ads.internal.zzt.zzc().zze(context, zzchnVar.zzs().afmaVersion);
        if (!this.zzj || this.zzi.limit() <= 0) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcJ)).booleanValue()) {
            }
        } else {
            final byte[] bArr = new byte[this.zzi.limit()];
            this.zzi.get(bArr);
            zzhoVar = new com.google.android.gms.internal.ads.zzho() { // from class: com.google.android.gms.internal.ads.zzcjr
                @Override // com.google.android.gms.internal.ads.zzho
                public final /* synthetic */ com.google.android.gms.internal.ads.zzhp zza() {
                    int i = com.google.android.gms.internal.ads.zzckc.zza;
                    return new com.google.android.gms.internal.ads.zzhk(bArr);
                }
            };
        }
        this.zzg = new com.google.android.gms.internal.ads.zzyt(zzhoVar, ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzp)).booleanValue() ? com.google.android.gms.internal.ads.zzcjz.zza : com.google.android.gms.internal.ads.zzcjy.zza);
    }

    private final boolean zzY() {
        return this.zzt != null && this.zzt.zzl();
    }

    public final void finalize() {
        zzf().decrementAndGet();
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzche
    public final void zzA(int i) {
        java.util.Iterator it = this.zzu.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.zzcjl zzcjlVar = (com.google.android.gms.internal.ads.zzcjl) ((java.lang.ref.WeakReference) it.next()).get();
            if (zzcjlVar != null) {
                zzcjlVar.zzk(i);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzche
    public final boolean zzB() {
        return this.zzh != null;
    }

    @Override // com.google.android.gms.internal.ads.zzche
    public final int zzC() {
        return this.zzh.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzche
    public final long zzD() {
        return this.zzh.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzche
    public final void zzE(boolean z) {
        this.zzh.zzj(z);
    }

    @Override // com.google.android.gms.internal.ads.zzche
    public final void zzF(int i) {
        this.zzc.zzk(i);
    }

    @Override // com.google.android.gms.internal.ads.zzche
    public final void zzG(int i) {
        this.zzc.zzl(i);
    }

    @Override // com.google.android.gms.internal.ads.zzche
    public final long zzH() {
        return this.zzh.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzche
    public final long zzI() {
        if (zzY()) {
            return 0L;
        }
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzche
    public final long zzJ() {
        if (zzY() && this.zzt.zzm()) {
            return java.lang.Math.min(this.zzl, this.zzt.zzo());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzche
    public final long zzK() {
        if (zzY()) {
            return this.zzt.zzp();
        }
        synchronized (this.zzq) {
            while (true) {
                java.util.ArrayList arrayList = this.zzs;
                if (!arrayList.isEmpty()) {
                    long j = this.zzn;
                    java.util.Map zzj = ((com.google.android.gms.internal.ads.zzii) arrayList.remove(0)).zzj();
                    long j2 = 0;
                    if (zzj != null) {
                        java.util.Iterator it = zzj.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                            if (entry != null) {
                                try {
                                    if (entry.getKey() != null && com.google.android.gms.internal.ads.zzgss.zze("content-length", (java.lang.CharSequence) entry.getKey()) && entry.getValue() != null && ((java.util.List) entry.getValue()).get(0) != null) {
                                        j2 = java.lang.Long.parseLong((java.lang.String) ((java.util.List) entry.getValue()).get(0));
                                        break;
                                    }
                                } catch (java.lang.NumberFormatException unused) {
                                    continue;
                                }
                            }
                        }
                    }
                    this.zzn = j + j2;
                }
            }
        }
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzche
    public final int zzL() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzche
    public final void zzM(boolean z) {
        if (this.zzh == null) {
            return;
        }
        int i = 0;
        while (true) {
            this.zzh.zzF();
            if (i >= 2) {
                return;
            }
            com.google.android.gms.internal.ads.zzaay zzaayVar = this.zzd;
            com.google.android.gms.internal.ads.zzaal zzd = zzaayVar.zzc().zzd();
            zzd.zzy(i, !z);
            zzaayVar.zzf(zzd);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzche
    public final long zzN() {
        return this.zzh.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzche
    public final long zzO() {
        return this.zzl;
    }

    final com.google.android.gms.internal.ads.zzxm zzR(android.net.Uri uri) {
        com.google.android.gms.internal.ads.zzz zzzVar = new com.google.android.gms.internal.ads.zzz();
        zzzVar.zzb(uri);
        com.google.android.gms.internal.ads.zzak zzc = zzzVar.zzc();
        com.google.android.gms.internal.ads.zzyt zzytVar = this.zzg;
        zzytVar.zza(this.zze.zzf);
        return zzytVar.zzb(zzc);
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzhp zzS(java.lang.String str, boolean z) {
        com.google.android.gms.internal.ads.zzckc zzckcVar = true != z ? null : this;
        com.google.android.gms.internal.ads.zzchm zzchmVar = this.zze;
        return new com.google.android.gms.internal.ads.zzckf(str, zzckcVar, zzchmVar.zzd, zzchmVar.zze, zzchmVar.zzm, zzchmVar.zzn);
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzhp zzT(java.lang.String str, boolean z) {
        com.google.android.gms.internal.ads.zzhw zzhwVar = new com.google.android.gms.internal.ads.zzhw();
        zzhwVar.zzb(str);
        zzhwVar.zzf(true != z ? null : this);
        com.google.android.gms.internal.ads.zzchm zzchmVar = this.zze;
        zzhwVar.zzc(zzchmVar.zzd);
        zzhwVar.zzd(zzchmVar.zze);
        zzhwVar.zze(true);
        return zzhwVar.zza();
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzhp zzU(java.lang.String str, boolean z) {
        com.google.android.gms.internal.ads.zzckc zzckcVar = true != z ? null : this;
        com.google.android.gms.internal.ads.zzchm zzchmVar = this.zze;
        com.google.android.gms.internal.ads.zzcjl zzcjlVar = new com.google.android.gms.internal.ads.zzcjl(str, zzckcVar, zzchmVar.zzd, zzchmVar.zze, zzchmVar.zzh);
        this.zzu.add(new java.lang.ref.WeakReference(zzcjlVar));
        return zzcjlVar;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzhp zzV(com.google.android.gms.internal.ads.zzho zzhoVar) {
        com.google.android.gms.internal.ads.zzhp zza2 = zzhoVar.zza();
        com.google.android.gms.internal.ads.zzcjn zzcjnVar = new com.google.android.gms.internal.ads.zzcjn() { // from class: com.google.android.gms.internal.ads.zzcka
            @Override // com.google.android.gms.internal.ads.zzcjn
            public final /* synthetic */ void zza(boolean z, long j) {
                com.google.android.gms.internal.ads.zzckc.this.zzX(z, j);
            }
        };
        return new com.google.android.gms.internal.ads.zzcjp(this.zzb, zza2, this.zzo, this.zzp, this, zzcjnVar);
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzna[] zzW(android.os.Handler handler, com.google.android.gms.internal.ads.zzaep zzaepVar, com.google.android.gms.internal.ads.zzrv zzrvVar, com.google.android.gms.internal.ads.zzzq zzzqVar, com.google.android.gms.internal.ads.zzwi zzwiVar) {
        com.google.android.gms.internal.ads.zzvv zzvvVar = com.google.android.gms.internal.ads.zzvv.zzb;
        android.content.Context context = this.zzb;
        com.google.android.gms.internal.ads.zztx zztxVar = new com.google.android.gms.internal.ads.zztx(context, new com.google.android.gms.internal.ads.zzvb(context, null, null), zzvvVar, false, handler, zzrvVar, new com.google.android.gms.internal.ads.zztk(context).zza());
        com.google.android.gms.internal.ads.zzadc zzadcVar = new com.google.android.gms.internal.ads.zzadc(context);
        zzadcVar.zza(zzvvVar);
        zzadcVar.zzb(handler);
        zzadcVar.zzc(zzaepVar);
        return new com.google.android.gms.internal.ads.zzna[]{zztxVar, zzadcVar.zzd()};
    }

    final /* synthetic */ void zzX(boolean z, long j) {
        com.google.android.gms.internal.ads.zzchd zzchdVar = this.zzk;
        if (zzchdVar != null) {
            zzchdVar.zzr(z, j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzin
    public final void zza(com.google.android.gms.internal.ads.zzhp zzhpVar, com.google.android.gms.internal.ads.zzht zzhtVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzin
    public final void zzb(com.google.android.gms.internal.ads.zzhp zzhpVar, com.google.android.gms.internal.ads.zzht zzhtVar, boolean z) {
        if (zzhpVar instanceof com.google.android.gms.internal.ads.zzii) {
            synchronized (this.zzq) {
                this.zzs.add((com.google.android.gms.internal.ads.zzii) zzhpVar);
            }
        } else if (zzhpVar instanceof com.google.android.gms.internal.ads.zzcjp) {
            this.zzt = (com.google.android.gms.internal.ads.zzcjp) zzhpVar;
            final com.google.android.gms.internal.ads.zzchn zzchnVar = (com.google.android.gms.internal.ads.zzchn) this.zzf.get();
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcB)).booleanValue() && zzchnVar != null && this.zzt.zzk()) {
                final java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("gcacheHit", java.lang.String.valueOf(this.zzt.zzm()));
                hashMap.put("gcacheDownloaded", java.lang.String.valueOf(this.zzt.zzn()));
                com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzckb
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        int i = com.google.android.gms.internal.ads.zzckc.zza;
                        com.google.android.gms.internal.ads.zzchn.this.zze("onGcacheInfoEvent", hashMap);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzin
    public final void zzc(com.google.android.gms.internal.ads.zzhp zzhpVar, com.google.android.gms.internal.ads.zzht zzhtVar, boolean z, int i) {
        this.zzl += i;
    }

    @Override // com.google.android.gms.internal.ads.zzin
    public final void zzd(com.google.android.gms.internal.ads.zzhp zzhpVar, com.google.android.gms.internal.ads.zzht zzhtVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zznp
    public /* synthetic */ void zzde(com.google.android.gms.internal.ads.zznn zznnVar, com.google.android.gms.internal.ads.zzba zzbaVar, com.google.android.gms.internal.ads.zzba zzbaVar2, int i) {
        com.google.android.gms.internal.ads.zznp.CC.$default$zzde(this, zznnVar, zzbaVar, zzbaVar2, i);
    }

    @Override // com.google.android.gms.internal.ads.zznp
    public /* synthetic */ void zzdf(com.google.android.gms.internal.ads.zznn zznnVar, com.google.android.gms.internal.ads.zzxg zzxgVar) {
        com.google.android.gms.internal.ads.zznp.CC.$default$zzdf(this, zznnVar, zzxgVar);
    }

    @Override // com.google.android.gms.internal.ads.zznp
    public /* synthetic */ void zzdg(com.google.android.gms.internal.ads.zznn zznnVar, int i, long j, long j2) {
        com.google.android.gms.internal.ads.zznp.CC.$default$zzdg(this, zznnVar, i, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zznp
    public /* synthetic */ void zzdh(com.google.android.gms.internal.ads.zznn zznnVar, com.google.android.gms.internal.ads.zzjb zzjbVar) {
        com.google.android.gms.internal.ads.zznp.CC.$default$zzdh(this, zznnVar, zzjbVar);
    }

    @Override // com.google.android.gms.internal.ads.zznp
    public /* synthetic */ void zzdi(com.google.android.gms.internal.ads.zzbb zzbbVar, com.google.android.gms.internal.ads.zzno zznoVar) {
        com.google.android.gms.internal.ads.zznp.CC.$default$zzdi(this, zzbbVar, zznoVar);
    }

    @Override // com.google.android.gms.internal.ads.zznp
    public final void zze(com.google.android.gms.internal.ads.zznn zznnVar, int i) {
        com.google.android.gms.internal.ads.zzchd zzchdVar = this.zzk;
        if (zzchdVar != null) {
            zzchdVar.zzs(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zznp
    public final void zzg(com.google.android.gms.internal.ads.zznn zznnVar, com.google.android.gms.internal.ads.zzau zzauVar) {
        com.google.android.gms.internal.ads.zzchd zzchdVar = this.zzk;
        if (zzchdVar != null) {
            zzchdVar.zzu("onPlayerError", zzauVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zznp
    public final void zzh(com.google.android.gms.internal.ads.zznn zznnVar, com.google.android.gms.internal.ads.zzxb zzxbVar, com.google.android.gms.internal.ads.zzxg zzxgVar, java.io.IOException iOException, boolean z) {
        com.google.android.gms.internal.ads.zzchd zzchdVar = this.zzk;
        if (zzchdVar != null) {
            if (this.zze.zzj) {
                zzchdVar.zzv("onLoadException", iOException);
            } else {
                zzchdVar.zzu("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzche
    public final java.lang.Integer zzj() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zznp
    public final void zzk(com.google.android.gms.internal.ads.zznn zznnVar, com.google.android.gms.internal.ads.zzv zzvVar, com.google.android.gms.internal.ads.zzjc zzjcVar) {
        com.google.android.gms.internal.ads.zzchn zzchnVar = (com.google.android.gms.internal.ads.zzchn) this.zzf.get();
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcB)).booleanValue() || zzchnVar == null) {
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str = zzvVar.zzo;
        if (str != null) {
            hashMap.put("audioMime", str);
        }
        java.lang.String str2 = zzvVar.zzp;
        if (str2 != null) {
            hashMap.put("audioSampleMime", str2);
        }
        java.lang.String str3 = zzvVar.zzk;
        if (str3 != null) {
            hashMap.put("audioCodec", str3);
        }
        zzchnVar.zze("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zznp
    public final void zzl(com.google.android.gms.internal.ads.zznn zznnVar, com.google.android.gms.internal.ads.zzv zzvVar, com.google.android.gms.internal.ads.zzjc zzjcVar) {
        com.google.android.gms.internal.ads.zzchn zzchnVar = (com.google.android.gms.internal.ads.zzchn) this.zzf.get();
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcB)).booleanValue() || zzchnVar == null) {
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("frameRate", java.lang.String.valueOf(zzvVar.zzA));
        hashMap.put("bitRate", java.lang.String.valueOf(zzvVar.zzj));
        int i = zzvVar.zzw;
        int i2 = zzvVar.zzx;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 1 + java.lang.String.valueOf(i2).length());
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        hashMap.put("resolution", sb.toString());
        java.lang.String str = zzvVar.zzo;
        if (str != null) {
            hashMap.put("videoMime", str);
        }
        java.lang.String str2 = zzvVar.zzp;
        if (str2 != null) {
            hashMap.put("videoSampleMime", str2);
        }
        java.lang.String str3 = zzvVar.zzk;
        if (str3 != null) {
            hashMap.put("videoCodec", str3);
        }
        zzchnVar.zze("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zznp
    public final void zzm(com.google.android.gms.internal.ads.zznn zznnVar, int i, long j) {
        this.zzm += i;
    }

    @Override // com.google.android.gms.internal.ads.zzche
    public final void zzn(java.lang.Integer num) {
        this.zzr = num;
    }

    @Override // com.google.android.gms.internal.ads.zznp
    public final void zzo(com.google.android.gms.internal.ads.zznn zznnVar, java.lang.Object obj, long j) {
        com.google.android.gms.internal.ads.zzchd zzchdVar = this.zzk;
        if (zzchdVar != null) {
            zzchdVar.zzD();
        }
    }

    @Override // com.google.android.gms.internal.ads.zznp
    public final void zzp(com.google.android.gms.internal.ads.zznn zznnVar, com.google.android.gms.internal.ads.zzbv zzbvVar) {
        com.google.android.gms.internal.ads.zzchd zzchdVar = this.zzk;
        if (zzchdVar != null) {
            zzchdVar.zzt(zzbvVar.zzb, zzbvVar.zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzche
    public final void zzq(android.net.Uri[] uriArr, java.lang.String str) {
        zzr(uriArr, str, java.nio.ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.zzche
    public final void zzs(com.google.android.gms.internal.ads.zzchd zzchdVar) {
        this.zzk = zzchdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzche
    public final void zzt() {
        com.google.android.gms.internal.ads.zzjv zzjvVar = this.zzh;
        if (zzjvVar != null) {
            zzjvVar.zzE(this);
            this.zzh.zzH();
            this.zzh = null;
            zzi().decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzche
    public final void zzu(android.view.Surface surface, boolean z) {
        com.google.android.gms.internal.ads.zzjv zzjvVar = this.zzh;
        if (zzjvVar != null) {
            zzjvVar.zzC(surface);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzche
    public final void zzv(float f, boolean z) {
        com.google.android.gms.internal.ads.zzjv zzjvVar = this.zzh;
        if (zzjvVar != null) {
            zzjvVar.zzB(f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzche
    public final void zzw() {
        this.zzh.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzche
    public final void zzx(long j) {
        this.zzh.zzb(j);
    }

    @Override // com.google.android.gms.internal.ads.zzche
    public final void zzy(int i) {
        this.zzc.zzm(i);
    }

    @Override // com.google.android.gms.internal.ads.zzche
    public final void zzz(int i) {
        this.zzc.zzn(i);
    }

    @Override // com.google.android.gms.internal.ads.zzche
    public final void zzr(android.net.Uri[] uriArr, java.lang.String str, java.nio.ByteBuffer byteBuffer, boolean z) {
        com.google.android.gms.internal.ads.zzxm zzybVar;
        if (this.zzh != null) {
            this.zzi = byteBuffer;
            this.zzj = z;
            int length = uriArr.length;
            if (length == 1) {
                zzybVar = zzR(uriArr[0]);
            } else {
                com.google.android.gms.internal.ads.zzxm[] zzxmVarArr = new com.google.android.gms.internal.ads.zzxm[length];
                for (int i = 0; i < uriArr.length; i++) {
                    zzxmVarArr[i] = zzR(uriArr[i]);
                }
                zzybVar = new com.google.android.gms.internal.ads.zzyb(false, false, new com.google.android.gms.internal.ads.zzwv(), zzxmVarArr);
            }
            this.zzh.zzG(zzybVar);
            this.zzh.zzg();
            zzi().incrementAndGet();
        }
    }
}
