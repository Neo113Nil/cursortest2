package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzlh extends com.google.android.gms.internal.ads.zzf implements com.google.android.gms.internal.ads.zzjv {
    public static final /* synthetic */ int zzd = 0;
    private final long zzA;
    private final com.google.android.gms.internal.ads.zzdm zzB;
    private final com.google.android.gms.internal.ads.zzfc zzC;
    private final com.google.android.gms.internal.ads.zzlg zzD;
    private final com.google.android.gms.internal.ads.zzjx zzE;
    private final com.google.android.gms.internal.ads.zzjx zzF;
    private int zzG;
    private int zzH;
    private boolean zzI;
    private com.google.android.gms.internal.ads.zznh zzJ;
    private com.google.android.gms.internal.ads.zzni zzK;
    private com.google.android.gms.internal.ads.zzju zzL;
    private com.google.android.gms.internal.ads.zzax zzM;
    private com.google.android.gms.internal.ads.zzan zzN;
    private java.lang.Object zzO;
    private android.view.Surface zzP;
    private int zzQ;
    private com.google.android.gms.internal.ads.zzeu zzR;
    private com.google.android.gms.internal.ads.zzd zzS;
    private float zzT;
    private boolean zzU;
    private boolean zzV;
    private boolean zzW;
    private int zzX;
    private boolean zzY;
    private com.google.android.gms.internal.ads.zzan zzZ;
    private com.google.android.gms.internal.ads.zzms zzaa;
    private int zzab;
    private long zzac;
    private com.google.android.gms.internal.ads.zzzf zzad;
    final com.google.android.gms.internal.ads.zzabi zzb;
    final com.google.android.gms.internal.ads.zzax zzc;
    private final com.google.android.gms.internal.ads.zzds zze;
    private final android.content.Context zzf;
    private final com.google.android.gms.internal.ads.zzbb zzg;
    private final com.google.android.gms.internal.ads.zzna[] zzh;
    private final com.google.android.gms.internal.ads.zzna[] zzi;
    private final com.google.android.gms.internal.ads.zzabh zzj;
    private final com.google.android.gms.internal.ads.zzdz zzk;
    private final com.google.android.gms.internal.ads.zzls zzl;
    private final com.google.android.gms.internal.ads.zzlu zzm;
    private final com.google.android.gms.internal.ads.zzef zzn;
    private final java.util.concurrent.CopyOnWriteArraySet zzo;
    private final com.google.android.gms.internal.ads.zzbd zzp;
    private final java.util.List zzq;
    private final boolean zzr;
    private final com.google.android.gms.internal.ads.zznm zzs;
    private final android.os.Looper zzt;
    private final com.google.android.gms.internal.ads.zzabq zzu;
    private final com.google.android.gms.internal.ads.zzdo zzv;
    private final com.google.android.gms.internal.ads.zzkd zzw;
    private final com.google.android.gms.internal.ads.zzlc zzx;
    private final com.google.android.gms.internal.ads.zzfr zzy;
    private final com.google.android.gms.internal.ads.zzfs zzz;

    static {
        com.google.android.gms.internal.ads.zzal.zzb("media3.exoplayer");
    }

    public zzlh(com.google.android.gms.internal.ads.zzjt zzjtVar, com.google.android.gms.internal.ads.zzbb zzbbVar) {
        com.google.android.gms.internal.ads.zzdo zzdoVar;
        final com.google.android.gms.internal.ads.zzlh zzlhVar = this;
        zzlhVar.zze = new com.google.android.gms.internal.ads.zzds(com.google.android.gms.internal.ads.zzdo.zza);
        try {
            java.lang.String hexString = java.lang.Integer.toHexString(java.lang.System.identityHashCode(this));
            java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(hexString).length() + 36 + java.lang.String.valueOf(str).length() + 1);
            sb.append("Init ");
            sb.append(hexString);
            sb.append(" [AndroidXMedia3/1.10.0-rc02] [");
            sb.append(str);
            sb.append(com.ironsource.X3.j.e);
            com.google.android.gms.internal.ads.zzeg.zzb("ExoPlayerImpl", sb.toString());
            zzlhVar.zzf = zzjtVar.zza.getApplicationContext();
            zzlhVar.zzs = (com.google.android.gms.internal.ads.zznm) zzjtVar.zzh.apply(zzjtVar.zzb);
            zzlhVar.zzX = zzjtVar.zzj;
            zzlhVar.zzS = zzjtVar.zzk;
            zzlhVar.zzQ = zzjtVar.zzl;
            zzlhVar.zzU = false;
            zzlhVar.zzA = zzjtVar.zzq;
            com.google.android.gms.internal.ads.zzkd zzkdVar = new com.google.android.gms.internal.ads.zzkd(zzlhVar, null);
            zzlhVar.zzw = zzkdVar;
            zzlhVar.zzx = new com.google.android.gms.internal.ads.zzlc(null);
            com.google.android.gms.internal.ads.zzna[] zza = ((com.google.android.gms.internal.ads.zznf) zzjtVar.zzc.zza()).zza(new android.os.Handler(zzjtVar.zzi), zzkdVar, zzkdVar, zzkdVar, zzkdVar);
            zzlhVar.zzh = zza;
            int length = zza.length;
            zzlhVar.zzi = new com.google.android.gms.internal.ads.zzna[2];
            int i = 0;
            while (true) {
                com.google.android.gms.internal.ads.zzna[] zznaVarArr = zzlhVar.zzi;
                int length2 = zznaVarArr.length;
                if (i >= 2) {
                    break;
                }
                com.google.android.gms.internal.ads.zzna zznaVar = zzlhVar.zzh[i];
                zznaVarArr[i] = null;
                i++;
            }
            com.google.android.gms.internal.ads.zzabh zzabhVar = (com.google.android.gms.internal.ads.zzabh) zzjtVar.zze.zza();
            zzlhVar.zzj = zzabhVar;
            com.google.android.gms.internal.ads.zzabq zzabqVar = (com.google.android.gms.internal.ads.zzabq) zzjtVar.zzg.zza();
            zzlhVar.zzu = zzabqVar;
            zzlhVar.zzr = zzjtVar.zzm;
            zzlhVar.zzK = zzjtVar.zzn;
            zzlhVar.zzJ = zzjtVar.zzo;
            android.os.Looper looper = zzjtVar.zzi;
            zzlhVar.zzt = looper;
            com.google.android.gms.internal.ads.zzdo zzdoVar2 = zzjtVar.zzb;
            zzlhVar.zzv = zzdoVar2;
            zzlhVar.zzg = zzbbVar;
            zzlhVar.zzn = new com.google.android.gms.internal.ads.zzef(looper, zzdoVar2, new com.google.android.gms.internal.ads.zzeb() { // from class: com.google.android.gms.internal.ads.zzlb
                @Override // com.google.android.gms.internal.ads.zzeb
                public final /* synthetic */ void zza(java.lang.Object obj, com.google.android.gms.internal.ads.zzs zzsVar) {
                    com.google.android.gms.internal.ads.zzlh.this.zzJ((com.google.android.gms.internal.ads.zzaz) obj, zzsVar);
                }
            });
            java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = new java.util.concurrent.CopyOnWriteArraySet();
            zzlhVar.zzo = copyOnWriteArraySet;
            zzlhVar.zzq = new java.util.ArrayList();
            zzlhVar.zzad = new com.google.android.gms.internal.ads.zzzf(0);
            zzlhVar.zzL = com.google.android.gms.internal.ads.zzju.zza;
            int length3 = zzlhVar.zzh.length;
            com.google.android.gms.internal.ads.zzabi zzabiVar = new com.google.android.gms.internal.ads.zzabi(new com.google.android.gms.internal.ads.zznd[2], new com.google.android.gms.internal.ads.zzaba[2], com.google.android.gms.internal.ads.zzbn.zza, null);
            zzlhVar.zzb = zzabiVar;
            zzlhVar.zzp = new com.google.android.gms.internal.ads.zzbd();
            com.google.android.gms.internal.ads.zzaw zzawVar = new com.google.android.gms.internal.ads.zzaw();
            zzawVar.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            zzabhVar.zzd();
            zzawVar.zzb(29, true);
            zzawVar.zzb(23, false);
            zzawVar.zzb(25, false);
            zzawVar.zzb(33, false);
            zzawVar.zzb(26, false);
            zzawVar.zzb(34, false);
            com.google.android.gms.internal.ads.zzax zze = zzawVar.zze();
            zzlhVar.zzc = zze;
            com.google.android.gms.internal.ads.zzaw zzawVar2 = new com.google.android.gms.internal.ads.zzaw();
            zzawVar2.zzd(zze);
            zzawVar2.zza(4);
            zzawVar2.zza(10);
            zzlhVar.zzM = zzawVar2.zze();
            zzlhVar.zzk = zzdoVar2.zzd(looper, null);
            com.google.android.gms.internal.ads.zzls zzlsVar = new com.google.android.gms.internal.ads.zzls() { // from class: com.google.android.gms.internal.ads.zzke
                @Override // com.google.android.gms.internal.ads.zzls
                public final /* synthetic */ void zza(com.google.android.gms.internal.ads.zzlr zzlrVar) {
                    com.google.android.gms.internal.ads.zzlh.this.zzK(zzlrVar);
                }
            };
            zzlhVar.zzl = zzlsVar;
            zzlhVar.zzaa = com.google.android.gms.internal.ads.zzms.zza(zzabiVar);
            zzlhVar.zzs.zzx(zzbbVar, looper);
            final com.google.android.gms.internal.ads.zzqf zzqfVar = new com.google.android.gms.internal.ads.zzqf(zzjtVar.zzx);
            try {
                com.google.android.gms.internal.ads.zzlu zzluVar = new com.google.android.gms.internal.ads.zzlu(zzlhVar.zzf, zzlhVar.zzh, zzlhVar.zzi, zzabhVar, zzabiVar, (com.google.android.gms.internal.ads.zzly) zzjtVar.zzf.zza(), zzabqVar, 0, false, zzlhVar.zzs, zzlhVar.zzK, zzjtVar.zzz, zzjtVar.zzp, false, false, looper, zzdoVar2, zzlsVar, zzqfVar, null, zzlhVar.zzL, zzlhVar.zzx, zzjtVar.zzy);
                zzlhVar = this;
                zzlhVar.zzm = zzluVar;
                android.os.Looper zzn = zzluVar.zzn();
                zzlhVar.zzT = 1.0f;
                com.google.android.gms.internal.ads.zzan zzanVar = com.google.android.gms.internal.ads.zzan.zza;
                zzlhVar.zzN = zzanVar;
                zzlhVar.zzZ = zzanVar;
                zzlhVar.zzab = -1;
                int i2 = com.google.android.gms.internal.ads.zzcz.zza;
                zzlhVar.zzV = true;
                zzlhVar.zze(zzlhVar.zzs);
                zzabqVar.zzf(new android.os.Handler(looper), zzlhVar.zzs);
                copyOnWriteArraySet.add(zzlhVar.zzw);
                if (android.os.Build.VERSION.SDK_INT >= 31) {
                    final android.content.Context context = zzlhVar.zzf;
                    final boolean z = zzjtVar.zzv;
                    zzdoVar = zzdoVar2;
                    zzdoVar.zzd(zzluVar.zzn(), null).zzm(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzjw
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            com.google.android.gms.internal.ads.zzqb zza2 = com.google.android.gms.internal.ads.zzqb.zza(context);
                            if (zza2 == null) {
                                com.google.android.gms.internal.ads.zzeg.zzc("ExoPlayerImpl", "MediaMetricsService unavailable.");
                                return;
                            }
                            if (z) {
                                zzlhVar.zzD(zza2);
                            }
                            zzqfVar.zzb(zza2.zzb());
                        }
                    });
                } else {
                    zzdoVar = zzdoVar2;
                }
                com.google.android.gms.internal.ads.zzdm zzdmVar = new com.google.android.gms.internal.ads.zzdm(0, zzn, looper, zzdoVar, new com.google.android.gms.internal.ads.zzdl() { // from class: com.google.android.gms.internal.ads.zzkp
                    @Override // com.google.android.gms.internal.ads.zzdl
                    public final /* synthetic */ void zza(java.lang.Object obj, java.lang.Object obj2) {
                        int intValue = ((java.lang.Integer) obj2).intValue();
                        com.google.android.gms.internal.ads.zzlh.this.zzL(((java.lang.Integer) obj).intValue(), intValue);
                    }
                });
                zzlhVar.zzB = zzdmVar;
                zzdmVar.zzd(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzku
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.gms.internal.ads.zzlh.this.zzM();
                    }
                });
                new com.google.android.gms.internal.ads.zzbz(zzjtVar.zza, zzn, zzjtVar.zzi, zzlhVar.zzw, zzdoVar);
                boolean z2 = (zzjtVar.zzs == Integer.MAX_VALUE || zzjtVar.zzt == Integer.MAX_VALUE) ? false : true;
                com.google.android.gms.internal.ads.zzfr zzfrVar = new com.google.android.gms.internal.ads.zzfr(zzjtVar.zza, zzn, zzdoVar);
                zzlhVar.zzy = zzfrVar;
                zzfrVar.zza(z2);
                zzlhVar.zzz = new com.google.android.gms.internal.ads.zzfs(zzjtVar.zza, zzn, zzdoVar);
                int i3 = com.google.android.gms.internal.ads.zzm.zza;
                com.google.android.gms.internal.ads.zzbv zzbvVar = com.google.android.gms.internal.ads.zzbv.zza;
                zzlhVar.zzR = com.google.android.gms.internal.ads.zzeu.zza;
                zzlhVar.zzD = android.os.Build.VERSION.SDK_INT >= 34 ? new com.google.android.gms.internal.ads.zzlg(zzlhVar, zzjtVar.zza, null) : null;
                zzlhVar.zzE = new com.google.android.gms.internal.ads.zzjx(zzlhVar, 1, null);
                zzlhVar.zzF = new com.google.android.gms.internal.ads.zzjx(zzlhVar, 2, null);
                zzlhVar.zzC = new com.google.android.gms.internal.ads.zzfc(this, zzlhVar.zzw, zzdoVar, zzjtVar.zzr, zzjtVar.zzs, zzjtVar.zzt, zzjtVar.zzu);
                zzluVar.zzg(zzlhVar.zzJ);
                zzluVar.zzi(zzlhVar.zzS, false);
                zzlhVar.zzau(1, 3, zzlhVar.zzS);
                zzlhVar.zzau(2, 4, java.lang.Integer.valueOf(zzlhVar.zzQ));
                zzlhVar.zzau(2, 5, 0);
                zzlhVar.zzau(1, 9, java.lang.Boolean.valueOf(zzlhVar.zzU));
                zzlhVar.zzau(6, 8, zzlhVar.zzx);
                zzlhVar.zzau(-1, 16, java.lang.Integer.valueOf(zzlhVar.zzX));
                zzlhVar.zze.zza();
            } catch (java.lang.Throwable th) {
                th = th;
                zzlhVar = this;
                zzlhVar.zze.zza();
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzaf, reason: merged with bridge method [inline-methods] */
    public final void zzP(com.google.android.gms.internal.ads.zzjk zzjkVar) {
        com.google.android.gms.internal.ads.zzms zzmsVar = this.zzaa;
        com.google.android.gms.internal.ads.zzms zzh = zzmsVar.zzh(zzmsVar.zzb);
        zzh.zzq = zzh.zzs;
        zzh.zzr = 0L;
        com.google.android.gms.internal.ads.zzms zzam = zzam(zzh, 1);
        if (zzjkVar != null) {
            zzam = zzam.zzf(zzjkVar);
        }
        this.zzG++;
        this.zzm.zzh();
        zzaj(zzam, 0, false, 5, -9223372036854775807L, -1, false);
    }

    private final int zzag(com.google.android.gms.internal.ads.zzms zzmsVar) {
        com.google.android.gms.internal.ads.zzbf zzbfVar = zzmsVar.zza;
        return zzbfVar.zzg() ? this.zzab : zzbfVar.zzo(zzmsVar.zzb.zza, this.zzp).zzc;
    }

    private final long zzah(com.google.android.gms.internal.ads.zzms zzmsVar) {
        com.google.android.gms.internal.ads.zzxk zzxkVar = zzmsVar.zzb;
        if (!zzxkVar.zzb()) {
            return com.google.android.gms.internal.ads.zzfl.zzr(zzai(zzmsVar));
        }
        com.google.android.gms.internal.ads.zzbf zzbfVar = zzmsVar.zza;
        zzbfVar.zzo(zzxkVar.zza, this.zzp);
        long j = zzmsVar.zzc;
        if (j != -9223372036854775807L) {
            return com.google.android.gms.internal.ads.zzfl.zzr(0L) + com.google.android.gms.internal.ads.zzfl.zzr(j);
        }
        long j2 = zzbfVar.zzb(zzag(zzmsVar), this.zza, 0L).zzl;
        return com.google.android.gms.internal.ads.zzfl.zzr(0L);
    }

    private final long zzai(com.google.android.gms.internal.ads.zzms zzmsVar) {
        com.google.android.gms.internal.ads.zzbf zzbfVar = zzmsVar.zza;
        if (zzbfVar.zzg()) {
            return com.google.android.gms.internal.ads.zzfl.zzs(this.zzac);
        }
        boolean z = zzmsVar.zzp;
        long j = zzmsVar.zzs;
        com.google.android.gms.internal.ads.zzxk zzxkVar = zzmsVar.zzb;
        if (zzxkVar.zzb()) {
            return j;
        }
        zzao(zzbfVar, zzxkVar, j);
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x046b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0475 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0481 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0491 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x049d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00e8  */
    /* JADX WARN: Type inference failed for: r7v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzaj(final com.google.android.gms.internal.ads.zzms zzmsVar, final int i, boolean z, int i2, long j, int i3, boolean z2) {
        com.google.android.gms.internal.ads.zzms zzmsVar2;
        com.google.android.gms.internal.ads.zzbf zzbfVar;
        final int i4;
        boolean z3;
        android.util.Pair pair;
        boolean z4;
        boolean z5;
        int i5;
        boolean booleanValue;
        final com.google.android.gms.internal.ads.zzak zzakVar;
        com.google.android.gms.internal.ads.zzms zzmsVar3;
        java.util.List list;
        int i6;
        com.google.android.gms.internal.ads.zzbf zzq;
        com.google.android.gms.internal.ads.zzan zzw;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        com.google.android.gms.internal.ads.zzjk zzjkVar;
        com.google.android.gms.internal.ads.zzjk zzjkVar2;
        com.google.android.gms.internal.ads.zzabi zzabiVar;
        com.google.android.gms.internal.ads.zzabi zzabiVar2;
        com.google.android.gms.internal.ads.zzf zzfVar;
        com.google.android.gms.internal.ads.zzbf zzq2;
        com.google.android.gms.internal.ads.zzax zzaxVar;
        boolean z11;
        com.google.android.gms.internal.ads.zzbf zzq3;
        boolean z12;
        int i7;
        boolean z13;
        ?? r7;
        com.google.android.gms.internal.ads.zzbf zzq4;
        boolean z14;
        com.google.android.gms.internal.ads.zzbf zzq5;
        com.google.android.gms.internal.ads.zzms zzmsVar4;
        long j2;
        boolean z15;
        int i8;
        boolean z16;
        int i9;
        boolean z17;
        int i10;
        boolean z18;
        com.google.android.gms.internal.ads.zzax zze;
        int i11;
        int i12;
        java.lang.Object obj;
        com.google.android.gms.internal.ads.zzak zzakVar2;
        java.lang.Object obj2;
        long j3;
        long zzak;
        int i13;
        java.lang.Object obj3;
        com.google.android.gms.internal.ads.zzak zzakVar3;
        java.lang.Object obj4;
        int i14 = i2;
        com.google.android.gms.internal.ads.zzms zzmsVar5 = this.zzaa;
        this.zzaa = zzmsVar;
        com.google.android.gms.internal.ads.zzbf zzbfVar2 = zzmsVar5.zza;
        com.google.android.gms.internal.ads.zzbf zzbfVar3 = zzmsVar.zza;
        boolean z19 = !zzbfVar2.equals(zzbfVar3);
        if (zzbfVar3.zzg() && zzbfVar2.zzg()) {
            pair = new android.util.Pair(false, -1);
            zzmsVar2 = zzmsVar5;
            zzbfVar = zzbfVar2;
        } else {
            if (zzbfVar3.zzg() == zzbfVar2.zzg()) {
                com.google.android.gms.internal.ads.zzxk zzxkVar = zzmsVar5.zzb;
                java.lang.Object obj5 = zzxkVar.zza;
                com.google.android.gms.internal.ads.zzbd zzbdVar = this.zzp;
                int i15 = zzbfVar2.zzo(obj5, zzbdVar).zzc;
                com.google.android.gms.internal.ads.zzbe zzbeVar = this.zza;
                java.lang.Object obj6 = zzbfVar2.zzb(i15, zzbeVar, 0L).zzb;
                com.google.android.gms.internal.ads.zzxk zzxkVar2 = zzmsVar.zzb;
                zzmsVar2 = zzmsVar5;
                zzbfVar = zzbfVar2;
                if (obj6.equals(zzbfVar3.zzb(zzbfVar3.zzo(zzxkVar2.zza, zzbdVar).zzc, zzbeVar, 0L).zzb)) {
                    if (!z) {
                        i4 = i14;
                        z3 = false;
                    } else if (i14 != 0) {
                        i4 = i14;
                        z3 = true;
                    } else if (zzxkVar.zzd < zzxkVar2.zzd) {
                        pair = new android.util.Pair(true, 0);
                        z3 = true;
                        i4 = 0;
                    } else {
                        z3 = true;
                        i4 = 0;
                    }
                    pair = new android.util.Pair(false, -1);
                } else {
                    if (!z) {
                        z4 = false;
                        z5 = false;
                    } else if (i14 == 0) {
                        i14 = 0;
                        i5 = 1;
                        z5 = true;
                        android.util.Pair pair2 = new android.util.Pair(true, java.lang.Integer.valueOf(i5));
                        i4 = i14;
                        z3 = z5;
                        pair = pair2;
                    } else {
                        z4 = true;
                        z5 = true;
                    }
                    if (z4 && i14 == 1) {
                        i5 = 2;
                    } else {
                        if (!z19) {
                            throw new java.lang.IllegalStateException();
                        }
                        i5 = 3;
                    }
                    android.util.Pair pair22 = new android.util.Pair(true, java.lang.Integer.valueOf(i5));
                    i4 = i14;
                    z3 = z5;
                    pair = pair22;
                }
                booleanValue = ((java.lang.Boolean) pair.first).booleanValue();
                final int intValue = ((java.lang.Integer) pair.second).intValue();
                if (booleanValue) {
                    zzakVar = null;
                } else {
                    zzakVar = !zzbfVar3.zzg() ? zzbfVar3.zzb(zzbfVar3.zzo(zzmsVar.zzb.zza, this.zzp).zzc, this.zza, 0L).zzd : null;
                    this.zzZ = com.google.android.gms.internal.ads.zzan.zza;
                }
                zzmsVar3 = zzmsVar2;
                if (!booleanValue || !zzmsVar3.zzj.equals(zzmsVar.zzj)) {
                    com.google.android.gms.internal.ads.zzam zza = this.zzZ.zza();
                    list = zzmsVar.zzj;
                    for (i6 = 0; i6 < list.size(); i6++) {
                        com.google.android.gms.internal.ads.zzap zzapVar = (com.google.android.gms.internal.ads.zzap) list.get(i6);
                        for (int i16 = 0; i16 < zzapVar.zza(); i16++) {
                            zzapVar.zzb(i16).zza(zza);
                        }
                    }
                    this.zzZ = zza.zzw();
                }
                zzq = zzq();
                if (zzq.zzg()) {
                    com.google.android.gms.internal.ads.zzak zzakVar4 = zzq.zzb(zzs(), this.zza, 0L).zzd;
                    com.google.android.gms.internal.ads.zzam zza2 = this.zzZ.zza();
                    zza2.zzv(zzakVar4.zzd);
                    zzw = zza2.zzw();
                } else {
                    zzw = this.zzZ;
                }
                boolean z20 = !zzw.equals(this.zzN);
                this.zzN = zzw;
                boolean z21 = zzmsVar3.zzl == zzmsVar.zzl;
                z6 = zzmsVar3.zze == zzmsVar.zze;
                if (!z6 || z21) {
                    zzas();
                }
                boolean z22 = zzmsVar3.zzg == zzmsVar.zzg;
                if (z19) {
                    this.zzn.zze(0, new com.google.android.gms.internal.ads.zzea() { // from class: com.google.android.gms.internal.ads.zzkx
                        @Override // com.google.android.gms.internal.ads.zzea
                        public final /* synthetic */ void zza(java.lang.Object obj7) {
                            int i17 = com.google.android.gms.internal.ads.zzlh.zzd;
                            ((com.google.android.gms.internal.ads.zzaz) obj7).zzb(com.google.android.gms.internal.ads.zzms.this.zza, i);
                        }
                    });
                }
                if (z3) {
                    z7 = z21;
                    z8 = z20;
                    z9 = z6;
                    z10 = z22;
                } else {
                    com.google.android.gms.internal.ads.zzbd zzbdVar2 = new com.google.android.gms.internal.ads.zzbd();
                    if (zzbfVar.zzg()) {
                        z9 = z6;
                        z10 = z22;
                        i11 = i3;
                        i12 = i11;
                        obj = null;
                        zzakVar2 = null;
                        obj2 = null;
                    } else {
                        java.lang.Object obj7 = zzmsVar3.zzb.zza;
                        com.google.android.gms.internal.ads.zzbf zzbfVar4 = zzbfVar;
                        zzbfVar4.zzo(obj7, zzbdVar2);
                        int i17 = zzbdVar2.zzc;
                        int zze2 = zzbfVar4.zze(obj7);
                        com.google.android.gms.internal.ads.zzbe zzbeVar2 = this.zza;
                        z9 = z6;
                        z10 = z22;
                        java.lang.Object obj8 = zzbfVar4.zzb(i17, zzbeVar2, 0L).zzb;
                        zzakVar2 = zzbeVar2.zzd;
                        i11 = i17;
                        obj = obj8;
                        obj2 = obj7;
                        i12 = zze2;
                    }
                    if (i4 == 0) {
                        com.google.android.gms.internal.ads.zzxk zzxkVar3 = zzmsVar3.zzb;
                        if (zzxkVar3.zzb()) {
                            j3 = zzbdVar2.zzh(zzxkVar3.zzb, zzxkVar3.zzc);
                            zzak = zzak(zzmsVar3);
                            java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
                            com.google.android.gms.internal.ads.zzxk zzxkVar4 = zzmsVar3.zzb;
                            final com.google.android.gms.internal.ads.zzba zzbaVar = new com.google.android.gms.internal.ads.zzba(obj, i11, zzakVar2, obj2, i12, com.google.android.gms.internal.ads.zzfl.zzr(j3), com.google.android.gms.internal.ads.zzfl.zzr(zzak), zzxkVar4.zzb, zzxkVar4.zzc);
                            int zzs = zzs();
                            int zzr = zzr();
                            if (this.zzaa.zza.zzg()) {
                                com.google.android.gms.internal.ads.zzms zzmsVar6 = this.zzaa;
                                java.lang.Object obj9 = zzmsVar6.zzb.zza;
                                zzmsVar6.zza.zzo(obj9, this.zzp);
                                int zze3 = this.zzaa.zza.zze(obj9);
                                com.google.android.gms.internal.ads.zzbf zzbfVar5 = this.zzaa.zza;
                                com.google.android.gms.internal.ads.zzbe zzbeVar3 = this.zza;
                                z7 = z21;
                                z8 = z20;
                                i13 = zze3;
                                obj3 = zzbfVar5.zzb(zzs, zzbeVar3, 0L).zzb;
                                zzakVar3 = zzbeVar3.zzd;
                                obj4 = obj9;
                            } else {
                                z7 = z21;
                                z8 = z20;
                                i13 = zzr;
                                obj3 = null;
                                zzakVar3 = null;
                                obj4 = null;
                            }
                            long zzr2 = com.google.android.gms.internal.ads.zzfl.zzr(j);
                            long zzr3 = !this.zzaa.zzb.zzb() ? com.google.android.gms.internal.ads.zzfl.zzr(zzak(this.zzaa)) : zzr2;
                            com.google.android.gms.internal.ads.zzxk zzxkVar5 = this.zzaa.zzb;
                            final com.google.android.gms.internal.ads.zzba zzbaVar2 = new com.google.android.gms.internal.ads.zzba(obj3, zzs, zzakVar3, obj4, i13, zzr2, zzr3, zzxkVar5.zzb, zzxkVar5.zzc);
                            this.zzn.zze(11, new com.google.android.gms.internal.ads.zzea() { // from class: com.google.android.gms.internal.ads.zzky
                                @Override // com.google.android.gms.internal.ads.zzea
                                public final /* synthetic */ void zza(java.lang.Object obj10) {
                                    int i18 = com.google.android.gms.internal.ads.zzlh.zzd;
                                    ((com.google.android.gms.internal.ads.zzaz) obj10).zzo(zzbaVar, zzbaVar2, i4);
                                }
                            });
                        } else {
                            j3 = zzxkVar3.zze != -1 ? zzak(this.zzaa) : zzbdVar2.zzd;
                            zzak = j3;
                            java.lang.String str2 = com.google.android.gms.internal.ads.zzfl.zza;
                            com.google.android.gms.internal.ads.zzxk zzxkVar42 = zzmsVar3.zzb;
                            final com.google.android.gms.internal.ads.zzba zzbaVar3 = new com.google.android.gms.internal.ads.zzba(obj, i11, zzakVar2, obj2, i12, com.google.android.gms.internal.ads.zzfl.zzr(j3), com.google.android.gms.internal.ads.zzfl.zzr(zzak), zzxkVar42.zzb, zzxkVar42.zzc);
                            int zzs2 = zzs();
                            int zzr4 = zzr();
                            if (this.zzaa.zza.zzg()) {
                            }
                            long zzr22 = com.google.android.gms.internal.ads.zzfl.zzr(j);
                            if (!this.zzaa.zzb.zzb()) {
                            }
                            com.google.android.gms.internal.ads.zzxk zzxkVar52 = this.zzaa.zzb;
                            final com.google.android.gms.internal.ads.zzba zzbaVar22 = new com.google.android.gms.internal.ads.zzba(obj3, zzs2, zzakVar3, obj4, i13, zzr22, zzr3, zzxkVar52.zzb, zzxkVar52.zzc);
                            this.zzn.zze(11, new com.google.android.gms.internal.ads.zzea() { // from class: com.google.android.gms.internal.ads.zzky
                                @Override // com.google.android.gms.internal.ads.zzea
                                public final /* synthetic */ void zza(java.lang.Object obj10) {
                                    int i18 = com.google.android.gms.internal.ads.zzlh.zzd;
                                    ((com.google.android.gms.internal.ads.zzaz) obj10).zzo(zzbaVar3, zzbaVar22, i4);
                                }
                            });
                        }
                    } else if (zzmsVar3.zzb.zzb()) {
                        j3 = zzmsVar3.zzs;
                        zzak = zzak(zzmsVar3);
                        java.lang.String str22 = com.google.android.gms.internal.ads.zzfl.zza;
                        com.google.android.gms.internal.ads.zzxk zzxkVar422 = zzmsVar3.zzb;
                        final com.google.android.gms.internal.ads.zzba zzbaVar32 = new com.google.android.gms.internal.ads.zzba(obj, i11, zzakVar2, obj2, i12, com.google.android.gms.internal.ads.zzfl.zzr(j3), com.google.android.gms.internal.ads.zzfl.zzr(zzak), zzxkVar422.zzb, zzxkVar422.zzc);
                        int zzs22 = zzs();
                        int zzr42 = zzr();
                        if (this.zzaa.zza.zzg()) {
                        }
                        long zzr222 = com.google.android.gms.internal.ads.zzfl.zzr(j);
                        if (!this.zzaa.zzb.zzb()) {
                        }
                        com.google.android.gms.internal.ads.zzxk zzxkVar522 = this.zzaa.zzb;
                        final com.google.android.gms.internal.ads.zzba zzbaVar222 = new com.google.android.gms.internal.ads.zzba(obj3, zzs22, zzakVar3, obj4, i13, zzr222, zzr3, zzxkVar522.zzb, zzxkVar522.zzc);
                        this.zzn.zze(11, new com.google.android.gms.internal.ads.zzea() { // from class: com.google.android.gms.internal.ads.zzky
                            @Override // com.google.android.gms.internal.ads.zzea
                            public final /* synthetic */ void zza(java.lang.Object obj10) {
                                int i18 = com.google.android.gms.internal.ads.zzlh.zzd;
                                ((com.google.android.gms.internal.ads.zzaz) obj10).zzo(zzbaVar32, zzbaVar222, i4);
                            }
                        });
                    } else {
                        j3 = zzmsVar3.zzs;
                        zzak = j3;
                        java.lang.String str222 = com.google.android.gms.internal.ads.zzfl.zza;
                        com.google.android.gms.internal.ads.zzxk zzxkVar4222 = zzmsVar3.zzb;
                        final com.google.android.gms.internal.ads.zzba zzbaVar322 = new com.google.android.gms.internal.ads.zzba(obj, i11, zzakVar2, obj2, i12, com.google.android.gms.internal.ads.zzfl.zzr(j3), com.google.android.gms.internal.ads.zzfl.zzr(zzak), zzxkVar4222.zzb, zzxkVar4222.zzc);
                        int zzs222 = zzs();
                        int zzr422 = zzr();
                        if (this.zzaa.zza.zzg()) {
                        }
                        long zzr2222 = com.google.android.gms.internal.ads.zzfl.zzr(j);
                        if (!this.zzaa.zzb.zzb()) {
                        }
                        com.google.android.gms.internal.ads.zzxk zzxkVar5222 = this.zzaa.zzb;
                        final com.google.android.gms.internal.ads.zzba zzbaVar2222 = new com.google.android.gms.internal.ads.zzba(obj3, zzs222, zzakVar3, obj4, i13, zzr2222, zzr3, zzxkVar5222.zzb, zzxkVar5222.zzc);
                        this.zzn.zze(11, new com.google.android.gms.internal.ads.zzea() { // from class: com.google.android.gms.internal.ads.zzky
                            @Override // com.google.android.gms.internal.ads.zzea
                            public final /* synthetic */ void zza(java.lang.Object obj10) {
                                int i18 = com.google.android.gms.internal.ads.zzlh.zzd;
                                ((com.google.android.gms.internal.ads.zzaz) obj10).zzo(zzbaVar322, zzbaVar2222, i4);
                            }
                        });
                    }
                }
                if (!booleanValue) {
                    this.zzn.zze(1, new com.google.android.gms.internal.ads.zzea() { // from class: com.google.android.gms.internal.ads.zzkz
                        @Override // com.google.android.gms.internal.ads.zzea
                        public final /* synthetic */ void zza(java.lang.Object obj10) {
                            int i18 = com.google.android.gms.internal.ads.zzlh.zzd;
                            ((com.google.android.gms.internal.ads.zzaz) obj10).zzc(com.google.android.gms.internal.ads.zzak.this, intValue);
                        }
                    });
                }
                zzjkVar = zzmsVar3.zzf;
                zzjkVar2 = zzmsVar.zzf;
                if (zzjkVar != zzjkVar2) {
                    com.google.android.gms.internal.ads.zzef zzefVar = this.zzn;
                    zzefVar.zze(10, new com.google.android.gms.internal.ads.zzea() { // from class: com.google.android.gms.internal.ads.zzla
                        @Override // com.google.android.gms.internal.ads.zzea
                        public final /* synthetic */ void zza(java.lang.Object obj10) {
                            int i18 = com.google.android.gms.internal.ads.zzlh.zzd;
                            ((com.google.android.gms.internal.ads.zzaz) obj10).zzn(com.google.android.gms.internal.ads.zzms.this.zzf);
                        }
                    });
                    if (zzjkVar2 != null) {
                        zzefVar.zze(10, new com.google.android.gms.internal.ads.zzea() { // from class: com.google.android.gms.internal.ads.zzkf
                            @Override // com.google.android.gms.internal.ads.zzea
                            public final /* synthetic */ void zza(java.lang.Object obj10) {
                                int i18 = com.google.android.gms.internal.ads.zzlh.zzd;
                                ((com.google.android.gms.internal.ads.zzaz) obj10).zzm(com.google.android.gms.internal.ads.zzms.this.zzf);
                            }
                        });
                    }
                }
                zzabiVar = zzmsVar3.zzi;
                zzabiVar2 = zzmsVar.zzi;
                if (zzabiVar != zzabiVar2) {
                    this.zzj.zzq(zzabiVar2.zze);
                    this.zzn.zze(2, new com.google.android.gms.internal.ads.zzea() { // from class: com.google.android.gms.internal.ads.zzkg
                        @Override // com.google.android.gms.internal.ads.zzea
                        public final /* synthetic */ void zza(java.lang.Object obj10) {
                            int i18 = com.google.android.gms.internal.ads.zzlh.zzd;
                            ((com.google.android.gms.internal.ads.zzaz) obj10).zzd(com.google.android.gms.internal.ads.zzms.this.zzi.zzd);
                        }
                    });
                }
                if (z8) {
                    final com.google.android.gms.internal.ads.zzan zzanVar = this.zzN;
                    this.zzn.zze(14, new com.google.android.gms.internal.ads.zzea() { // from class: com.google.android.gms.internal.ads.zzkh
                        @Override // com.google.android.gms.internal.ads.zzea
                        public final /* synthetic */ void zza(java.lang.Object obj10) {
                            int i18 = com.google.android.gms.internal.ads.zzlh.zzd;
                            ((com.google.android.gms.internal.ads.zzaz) obj10).zze(com.google.android.gms.internal.ads.zzan.this);
                        }
                    });
                }
                if (z10) {
                    this.zzn.zze(3, new com.google.android.gms.internal.ads.zzea() { // from class: com.google.android.gms.internal.ads.zzki
                        @Override // com.google.android.gms.internal.ads.zzea
                        public final /* synthetic */ void zza(java.lang.Object obj10) {
                            int i18 = com.google.android.gms.internal.ads.zzlh.zzd;
                            ((com.google.android.gms.internal.ads.zzaz) obj10).zzf(com.google.android.gms.internal.ads.zzms.this.zzg);
                        }
                    });
                }
                if (!z9 || z7) {
                    this.zzn.zze(-1, new com.google.android.gms.internal.ads.zzea() { // from class: com.google.android.gms.internal.ads.zzkj
                        @Override // com.google.android.gms.internal.ads.zzea
                        public final /* synthetic */ void zza(java.lang.Object obj10) {
                            int i18 = com.google.android.gms.internal.ads.zzlh.zzd;
                            com.google.android.gms.internal.ads.zzms zzmsVar7 = com.google.android.gms.internal.ads.zzms.this;
                            ((com.google.android.gms.internal.ads.zzaz) obj10).zzh(zzmsVar7.zzl, zzmsVar7.zze);
                        }
                    });
                }
                if (z9) {
                    this.zzn.zze(4, new com.google.android.gms.internal.ads.zzea() { // from class: com.google.android.gms.internal.ads.zzkk
                        @Override // com.google.android.gms.internal.ads.zzea
                        public final /* synthetic */ void zza(java.lang.Object obj10) {
                            int i18 = com.google.android.gms.internal.ads.zzlh.zzd;
                            ((com.google.android.gms.internal.ads.zzaz) obj10).zzi(com.google.android.gms.internal.ads.zzms.this.zze);
                        }
                    });
                }
                if (!z7 || zzmsVar3.zzm != zzmsVar.zzm) {
                    this.zzn.zze(5, new com.google.android.gms.internal.ads.zzea() { // from class: com.google.android.gms.internal.ads.zzkl
                        @Override // com.google.android.gms.internal.ads.zzea
                        public final /* synthetic */ void zza(java.lang.Object obj10) {
                            int i18 = com.google.android.gms.internal.ads.zzlh.zzd;
                            com.google.android.gms.internal.ads.zzms zzmsVar7 = com.google.android.gms.internal.ads.zzms.this;
                            ((com.google.android.gms.internal.ads.zzaz) obj10).zzj(zzmsVar7.zzl, zzmsVar7.zzm);
                        }
                    });
                }
                if (zzmsVar3.zzn != zzmsVar.zzn) {
                    this.zzn.zze(6, new com.google.android.gms.internal.ads.zzea() { // from class: com.google.android.gms.internal.ads.zzkm
                        @Override // com.google.android.gms.internal.ads.zzea
                        public final /* synthetic */ void zza(java.lang.Object obj10) {
                            int i18 = com.google.android.gms.internal.ads.zzlh.zzd;
                            ((com.google.android.gms.internal.ads.zzaz) obj10).zzk(com.google.android.gms.internal.ads.zzms.this.zzn);
                        }
                    });
                }
                if (zzmsVar3.zzj() != zzmsVar.zzj()) {
                    this.zzn.zze(7, new com.google.android.gms.internal.ads.zzea() { // from class: com.google.android.gms.internal.ads.zzkn
                        @Override // com.google.android.gms.internal.ads.zzea
                        public final /* synthetic */ void zza(java.lang.Object obj10) {
                            int i18 = com.google.android.gms.internal.ads.zzlh.zzd;
                            ((com.google.android.gms.internal.ads.zzaz) obj10).zzl(com.google.android.gms.internal.ads.zzms.this.zzj());
                        }
                    });
                }
                if (!zzmsVar3.zzo.equals(zzmsVar.zzo)) {
                    this.zzn.zze(12, new com.google.android.gms.internal.ads.zzea() { // from class: com.google.android.gms.internal.ads.zzko
                        @Override // com.google.android.gms.internal.ads.zzea
                        public final /* synthetic */ void zza(java.lang.Object obj10) {
                            int i18 = com.google.android.gms.internal.ads.zzlh.zzd;
                            ((com.google.android.gms.internal.ads.zzaz) obj10).zzp(com.google.android.gms.internal.ads.zzms.this.zzo);
                        }
                    });
                }
                com.google.android.gms.internal.ads.zzax zzaxVar2 = this.zzM;
                com.google.android.gms.internal.ads.zzbb zzbbVar = this.zzg;
                com.google.android.gms.internal.ads.zzax zzaxVar3 = this.zzc;
                java.lang.String str3 = com.google.android.gms.internal.ads.zzfl.zza;
                boolean zzx = zzbbVar.zzx();
                zzfVar = (com.google.android.gms.internal.ads.zzf) zzbbVar;
                zzq2 = zzfVar.zzq();
                if (zzq2.zzg()) {
                    zzaxVar = zzaxVar2;
                    if (zzq2.zzb(zzfVar.zzs(), zzfVar.zza, 0L).zzh) {
                        z11 = true;
                        zzq3 = zzfVar.zzq();
                        if (zzq3.zzg()) {
                            i7 = -1;
                            z12 = false;
                        } else {
                            int zzs3 = zzfVar.zzs();
                            zzfVar.zzl();
                            zzfVar.zzm();
                            z12 = false;
                            r7 = 0;
                            int zzi = zzq3.zzi(zzs3, 0, false);
                            i7 = -1;
                            if (zzi != -1) {
                                z13 = true;
                                zzq4 = zzfVar.zzq();
                                if (!zzq4.zzg()) {
                                    int zzs4 = zzfVar.zzs();
                                    zzfVar.zzl();
                                    zzfVar.zzm();
                                    if (zzq4.zzh(zzs4, r7, r7) != i7) {
                                        z14 = true;
                                        zzq5 = zzfVar.zzq();
                                        if (zzq5.zzg()) {
                                            zzmsVar4 = zzmsVar3;
                                            j2 = 0;
                                        } else {
                                            zzmsVar4 = zzmsVar3;
                                            j2 = 0;
                                            if (zzq5.zzb(zzfVar.zzs(), zzfVar.zza, 0L).zzb()) {
                                                z15 = true;
                                                com.google.android.gms.internal.ads.zzbf zzq6 = zzfVar.zzq();
                                                boolean z23 = zzq6.zzg() && zzq6.zzb(zzfVar.zzs(), zzfVar.zza, j2).zzi;
                                                boolean zzg = zzbbVar.zzq().zzg();
                                                com.google.android.gms.internal.ads.zzaw zzawVar = new com.google.android.gms.internal.ads.zzaw();
                                                zzawVar.zzd(zzaxVar3);
                                                boolean z24 = !zzx;
                                                zzawVar.zzb(4, z24);
                                                zzawVar.zzb(5, (z11 || zzx) ? false : true);
                                                if (z13 || zzx) {
                                                    i8 = 6;
                                                    z16 = false;
                                                } else {
                                                    i8 = 6;
                                                    z16 = true;
                                                }
                                                zzawVar.zzb(i8, z16);
                                                zzawVar.zzb(7, zzg && (z13 || !z15 || z11) && !zzx);
                                                zzawVar.zzb(8, (z14 || zzx) ? false : true);
                                                zzawVar.zzb(9, zzg && (z14 || (z15 && z23)) && !zzx);
                                                zzawVar.zzb(10, z24);
                                                if (z11 || zzx) {
                                                    i9 = 11;
                                                    z17 = false;
                                                } else {
                                                    i9 = 11;
                                                    z17 = true;
                                                }
                                                zzawVar.zzb(i9, z17);
                                                if (z11 || zzx) {
                                                    i10 = 12;
                                                    z18 = false;
                                                } else {
                                                    i10 = 12;
                                                    z18 = true;
                                                }
                                                zzawVar.zzb(i10, z18);
                                                zze = zzawVar.zze();
                                                this.zzM = zze;
                                                if (!zze.equals(zzaxVar)) {
                                                    this.zzn.zze(13, new com.google.android.gms.internal.ads.zzea() { // from class: com.google.android.gms.internal.ads.zzkq
                                                        @Override // com.google.android.gms.internal.ads.zzea
                                                        public final /* synthetic */ void zza(java.lang.Object obj10) {
                                                            com.google.android.gms.internal.ads.zzlh.this.zzN((com.google.android.gms.internal.ads.zzaz) obj10);
                                                        }
                                                    });
                                                }
                                                this.zzn.zzf();
                                                boolean z25 = zzmsVar4.zzp;
                                                boolean z26 = zzmsVar.zzp;
                                            }
                                        }
                                        z15 = false;
                                        com.google.android.gms.internal.ads.zzbf zzq62 = zzfVar.zzq();
                                        if (zzq62.zzg()) {
                                        }
                                        boolean zzg2 = zzbbVar.zzq().zzg();
                                        com.google.android.gms.internal.ads.zzaw zzawVar2 = new com.google.android.gms.internal.ads.zzaw();
                                        zzawVar2.zzd(zzaxVar3);
                                        boolean z242 = !zzx;
                                        zzawVar2.zzb(4, z242);
                                        zzawVar2.zzb(5, (z11 || zzx) ? false : true);
                                        if (z13) {
                                        }
                                        i8 = 6;
                                        z16 = false;
                                        zzawVar2.zzb(i8, z16);
                                        zzawVar2.zzb(7, zzg2 && (z13 || !z15 || z11) && !zzx);
                                        zzawVar2.zzb(8, (z14 || zzx) ? false : true);
                                        zzawVar2.zzb(9, zzg2 && (z14 || (z15 && z23)) && !zzx);
                                        zzawVar2.zzb(10, z242);
                                        if (z11) {
                                        }
                                        i9 = 11;
                                        z17 = false;
                                        zzawVar2.zzb(i9, z17);
                                        if (z11) {
                                        }
                                        i10 = 12;
                                        z18 = false;
                                        zzawVar2.zzb(i10, z18);
                                        zze = zzawVar2.zze();
                                        this.zzM = zze;
                                        if (!zze.equals(zzaxVar)) {
                                        }
                                        this.zzn.zzf();
                                        boolean z252 = zzmsVar4.zzp;
                                        boolean z262 = zzmsVar.zzp;
                                    }
                                }
                                z14 = false;
                                zzq5 = zzfVar.zzq();
                                if (zzq5.zzg()) {
                                }
                                z15 = false;
                                com.google.android.gms.internal.ads.zzbf zzq622 = zzfVar.zzq();
                                if (zzq622.zzg()) {
                                }
                                boolean zzg22 = zzbbVar.zzq().zzg();
                                com.google.android.gms.internal.ads.zzaw zzawVar22 = new com.google.android.gms.internal.ads.zzaw();
                                zzawVar22.zzd(zzaxVar3);
                                boolean z2422 = !zzx;
                                zzawVar22.zzb(4, z2422);
                                zzawVar22.zzb(5, (z11 || zzx) ? false : true);
                                if (z13) {
                                }
                                i8 = 6;
                                z16 = false;
                                zzawVar22.zzb(i8, z16);
                                zzawVar22.zzb(7, zzg22 && (z13 || !z15 || z11) && !zzx);
                                zzawVar22.zzb(8, (z14 || zzx) ? false : true);
                                zzawVar22.zzb(9, zzg22 && (z14 || (z15 && z23)) && !zzx);
                                zzawVar22.zzb(10, z2422);
                                if (z11) {
                                }
                                i9 = 11;
                                z17 = false;
                                zzawVar22.zzb(i9, z17);
                                if (z11) {
                                }
                                i10 = 12;
                                z18 = false;
                                zzawVar22.zzb(i10, z18);
                                zze = zzawVar22.zze();
                                this.zzM = zze;
                                if (!zze.equals(zzaxVar)) {
                                }
                                this.zzn.zzf();
                                boolean z2522 = zzmsVar4.zzp;
                                boolean z2622 = zzmsVar.zzp;
                            }
                        }
                        z13 = false;
                        r7 = z12;
                        zzq4 = zzfVar.zzq();
                        if (!zzq4.zzg()) {
                        }
                        z14 = false;
                        zzq5 = zzfVar.zzq();
                        if (zzq5.zzg()) {
                        }
                        z15 = false;
                        com.google.android.gms.internal.ads.zzbf zzq6222 = zzfVar.zzq();
                        if (zzq6222.zzg()) {
                        }
                        boolean zzg222 = zzbbVar.zzq().zzg();
                        com.google.android.gms.internal.ads.zzaw zzawVar222 = new com.google.android.gms.internal.ads.zzaw();
                        zzawVar222.zzd(zzaxVar3);
                        boolean z24222 = !zzx;
                        zzawVar222.zzb(4, z24222);
                        zzawVar222.zzb(5, (z11 || zzx) ? false : true);
                        if (z13) {
                        }
                        i8 = 6;
                        z16 = false;
                        zzawVar222.zzb(i8, z16);
                        zzawVar222.zzb(7, zzg222 && (z13 || !z15 || z11) && !zzx);
                        zzawVar222.zzb(8, (z14 || zzx) ? false : true);
                        zzawVar222.zzb(9, zzg222 && (z14 || (z15 && z23)) && !zzx);
                        zzawVar222.zzb(10, z24222);
                        if (z11) {
                        }
                        i9 = 11;
                        z17 = false;
                        zzawVar222.zzb(i9, z17);
                        if (z11) {
                        }
                        i10 = 12;
                        z18 = false;
                        zzawVar222.zzb(i10, z18);
                        zze = zzawVar222.zze();
                        this.zzM = zze;
                        if (!zze.equals(zzaxVar)) {
                        }
                        this.zzn.zzf();
                        boolean z25222 = zzmsVar4.zzp;
                        boolean z26222 = zzmsVar.zzp;
                    }
                } else {
                    zzaxVar = zzaxVar2;
                }
                z11 = false;
                zzq3 = zzfVar.zzq();
                if (zzq3.zzg()) {
                }
                z13 = false;
                r7 = z12;
                zzq4 = zzfVar.zzq();
                if (!zzq4.zzg()) {
                }
                z14 = false;
                zzq5 = zzfVar.zzq();
                if (zzq5.zzg()) {
                }
                z15 = false;
                com.google.android.gms.internal.ads.zzbf zzq62222 = zzfVar.zzq();
                if (zzq62222.zzg()) {
                }
                boolean zzg2222 = zzbbVar.zzq().zzg();
                com.google.android.gms.internal.ads.zzaw zzawVar2222 = new com.google.android.gms.internal.ads.zzaw();
                zzawVar2222.zzd(zzaxVar3);
                boolean z242222 = !zzx;
                zzawVar2222.zzb(4, z242222);
                zzawVar2222.zzb(5, (z11 || zzx) ? false : true);
                if (z13) {
                }
                i8 = 6;
                z16 = false;
                zzawVar2222.zzb(i8, z16);
                zzawVar2222.zzb(7, zzg2222 && (z13 || !z15 || z11) && !zzx);
                zzawVar2222.zzb(8, (z14 || zzx) ? false : true);
                zzawVar2222.zzb(9, zzg2222 && (z14 || (z15 && z23)) && !zzx);
                zzawVar2222.zzb(10, z242222);
                if (z11) {
                }
                i9 = 11;
                z17 = false;
                zzawVar2222.zzb(i9, z17);
                if (z11) {
                }
                i10 = 12;
                z18 = false;
                zzawVar2222.zzb(i10, z18);
                zze = zzawVar2222.zze();
                this.zzM = zze;
                if (!zze.equals(zzaxVar)) {
                }
                this.zzn.zzf();
                boolean z252222 = zzmsVar4.zzp;
                boolean z262222 = zzmsVar.zzp;
            }
            zzmsVar2 = zzmsVar5;
            zzbfVar = zzbfVar2;
            pair = new android.util.Pair(true, 3);
        }
        i4 = i14;
        z3 = z;
        booleanValue = ((java.lang.Boolean) pair.first).booleanValue();
        final int intValue2 = ((java.lang.Integer) pair.second).intValue();
        if (booleanValue) {
        }
        zzmsVar3 = zzmsVar2;
        if (!booleanValue) {
        }
        com.google.android.gms.internal.ads.zzam zza3 = this.zzZ.zza();
        list = zzmsVar.zzj;
        while (i6 < list.size()) {
        }
        this.zzZ = zza3.zzw();
        zzq = zzq();
        if (zzq.zzg()) {
        }
        boolean z202 = !zzw.equals(this.zzN);
        this.zzN = zzw;
        if (zzmsVar3.zzl == zzmsVar.zzl) {
        }
        if (zzmsVar3.zze == zzmsVar.zze) {
        }
        if (!z6) {
        }
        zzas();
        if (zzmsVar3.zzg == zzmsVar.zzg) {
        }
        if (z19) {
        }
        if (z3) {
        }
        if (!booleanValue) {
        }
        zzjkVar = zzmsVar3.zzf;
        zzjkVar2 = zzmsVar.zzf;
        if (zzjkVar != zzjkVar2) {
        }
        zzabiVar = zzmsVar3.zzi;
        zzabiVar2 = zzmsVar.zzi;
        if (zzabiVar != zzabiVar2) {
        }
        if (z8) {
        }
        if (z10) {
        }
        if (!z9) {
        }
        this.zzn.zze(-1, new com.google.android.gms.internal.ads.zzea() { // from class: com.google.android.gms.internal.ads.zzkj
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj10) {
                int i18 = com.google.android.gms.internal.ads.zzlh.zzd;
                com.google.android.gms.internal.ads.zzms zzmsVar7 = com.google.android.gms.internal.ads.zzms.this;
                ((com.google.android.gms.internal.ads.zzaz) obj10).zzh(zzmsVar7.zzl, zzmsVar7.zze);
            }
        });
        if (z9) {
        }
        if (!z7) {
        }
        this.zzn.zze(5, new com.google.android.gms.internal.ads.zzea() { // from class: com.google.android.gms.internal.ads.zzkl
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj10) {
                int i18 = com.google.android.gms.internal.ads.zzlh.zzd;
                com.google.android.gms.internal.ads.zzms zzmsVar7 = com.google.android.gms.internal.ads.zzms.this;
                ((com.google.android.gms.internal.ads.zzaz) obj10).zzj(zzmsVar7.zzl, zzmsVar7.zzm);
            }
        });
        if (zzmsVar3.zzn != zzmsVar.zzn) {
        }
        if (zzmsVar3.zzj() != zzmsVar.zzj()) {
        }
        if (!zzmsVar3.zzo.equals(zzmsVar.zzo)) {
        }
        com.google.android.gms.internal.ads.zzax zzaxVar22 = this.zzM;
        com.google.android.gms.internal.ads.zzbb zzbbVar2 = this.zzg;
        com.google.android.gms.internal.ads.zzax zzaxVar32 = this.zzc;
        java.lang.String str32 = com.google.android.gms.internal.ads.zzfl.zza;
        boolean zzx2 = zzbbVar2.zzx();
        zzfVar = (com.google.android.gms.internal.ads.zzf) zzbbVar2;
        zzq2 = zzfVar.zzq();
        if (zzq2.zzg()) {
        }
        z11 = false;
        zzq3 = zzfVar.zzq();
        if (zzq3.zzg()) {
        }
        z13 = false;
        r7 = z12;
        zzq4 = zzfVar.zzq();
        if (!zzq4.zzg()) {
        }
        z14 = false;
        zzq5 = zzfVar.zzq();
        if (zzq5.zzg()) {
        }
        z15 = false;
        com.google.android.gms.internal.ads.zzbf zzq622222 = zzfVar.zzq();
        if (zzq622222.zzg()) {
        }
        boolean zzg22222 = zzbbVar2.zzq().zzg();
        com.google.android.gms.internal.ads.zzaw zzawVar22222 = new com.google.android.gms.internal.ads.zzaw();
        zzawVar22222.zzd(zzaxVar32);
        boolean z2422222 = !zzx2;
        zzawVar22222.zzb(4, z2422222);
        zzawVar22222.zzb(5, (z11 || zzx2) ? false : true);
        if (z13) {
        }
        i8 = 6;
        z16 = false;
        zzawVar22222.zzb(i8, z16);
        zzawVar22222.zzb(7, zzg22222 && (z13 || !z15 || z11) && !zzx2);
        zzawVar22222.zzb(8, (z14 || zzx2) ? false : true);
        zzawVar22222.zzb(9, zzg22222 && (z14 || (z15 && z23)) && !zzx2);
        zzawVar22222.zzb(10, z2422222);
        if (z11) {
        }
        i9 = 11;
        z17 = false;
        zzawVar22222.zzb(i9, z17);
        if (z11) {
        }
        i10 = 12;
        z18 = false;
        zzawVar22222.zzb(i10, z18);
        zze = zzawVar22222.zze();
        this.zzM = zze;
        if (!zze.equals(zzaxVar)) {
        }
        this.zzn.zzf();
        boolean z2522222 = zzmsVar4.zzp;
        boolean z2622222 = zzmsVar.zzp;
    }

    private static long zzak(com.google.android.gms.internal.ads.zzms zzmsVar) {
        com.google.android.gms.internal.ads.zzbe zzbeVar = new com.google.android.gms.internal.ads.zzbe();
        com.google.android.gms.internal.ads.zzbd zzbdVar = new com.google.android.gms.internal.ads.zzbd();
        com.google.android.gms.internal.ads.zzbf zzbfVar = zzmsVar.zza;
        zzbfVar.zzo(zzmsVar.zzb.zza, zzbdVar);
        long j = zzmsVar.zzc;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = zzbfVar.zzb(zzbdVar.zzc, zzbeVar, 0L).zzl;
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final com.google.android.gms.internal.ads.zzms zzal(com.google.android.gms.internal.ads.zzms zzmsVar, com.google.android.gms.internal.ads.zzbf zzbfVar, android.util.Pair pair) {
        com.google.android.gms.internal.ads.zzxk zzxkVar;
        com.google.android.gms.internal.ads.zzgtj.zza(zzbfVar.zzg() || pair != null);
        com.google.android.gms.internal.ads.zzbf zzbfVar2 = zzmsVar.zza;
        long zzah = zzah(zzmsVar);
        com.google.android.gms.internal.ads.zzms zzd2 = zzmsVar.zzd(zzbfVar);
        if (zzbfVar.zzg()) {
            com.google.android.gms.internal.ads.zzxk zzb = com.google.android.gms.internal.ads.zzms.zzb();
            long zzs = com.google.android.gms.internal.ads.zzfl.zzs(this.zzac);
            com.google.android.gms.internal.ads.zzms zzh = zzd2.zzc(zzb, zzs, zzs, zzs, 0L, com.google.android.gms.internal.ads.zzzn.zza, this.zzb, com.google.android.gms.internal.ads.zzgwm.zzi()).zzh(zzb);
            zzh.zzq = zzh.zzs;
            return zzh;
        }
        com.google.android.gms.internal.ads.zzxk zzxkVar2 = zzd2.zzb;
        java.lang.Object obj = zzxkVar2.zza;
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        boolean z = !obj.equals(pair.first);
        com.google.android.gms.internal.ads.zzxk zzxkVar3 = z ? new com.google.android.gms.internal.ads.zzxk(pair.first, -1L) : zzxkVar2;
        long longValue = ((java.lang.Long) pair.second).longValue();
        long zzs2 = com.google.android.gms.internal.ads.zzfl.zzs(zzah);
        if (!zzbfVar2.zzg()) {
            com.google.android.gms.internal.ads.zzbd zzbdVar = this.zzp;
            zzbfVar2.zzo(obj, zzbdVar);
            if (!z && zzs2 - longValue == 1) {
                com.google.android.gms.internal.ads.zzbd zzo = zzbfVar2.zzo(obj, zzbdVar);
                zzxkVar = zzxkVar3;
                if (zzs2 == zzo.zzd) {
                    zzs2--;
                }
                if (!z || longValue < zzs2) {
                    com.google.android.gms.internal.ads.zzgtj.zzi(!zzxkVar.zzb());
                    com.google.android.gms.internal.ads.zzms zzh2 = zzd2.zzc(zzxkVar, longValue, longValue, longValue, 0L, !z ? com.google.android.gms.internal.ads.zzzn.zza : zzd2.zzh, !z ? this.zzb : zzd2.zzi, !z ? com.google.android.gms.internal.ads.zzgwm.zzi() : zzd2.zzj).zzh(zzxkVar);
                    zzh2.zzq = longValue;
                    return zzh2;
                }
                if (longValue != zzs2) {
                    com.google.android.gms.internal.ads.zzgtj.zzi(!zzxkVar.zzb());
                    long max = java.lang.Math.max(0L, zzd2.zzr - (longValue - zzs2));
                    long j = zzd2.zzq;
                    if (zzd2.zzk.equals(zzxkVar2)) {
                        j = longValue + max;
                    }
                    com.google.android.gms.internal.ads.zzms zzc = zzd2.zzc(zzxkVar, longValue, longValue, longValue, max, zzd2.zzh, zzd2.zzi, zzd2.zzj);
                    zzc.zzq = j;
                    return zzc;
                }
                int zze = zzbfVar.zze(zzd2.zzk.zza);
                if (zze != -1) {
                    com.google.android.gms.internal.ads.zzbd zzbdVar2 = this.zzp;
                    if (zzbfVar.zzd(zze, zzbdVar2, false).zzc == zzbfVar.zzo(zzxkVar.zza, zzbdVar2).zzc) {
                        return zzd2;
                    }
                }
                java.lang.Object obj2 = zzxkVar.zza;
                com.google.android.gms.internal.ads.zzbd zzbdVar3 = this.zzp;
                zzbfVar.zzo(obj2, zzbdVar3);
                long zzh3 = zzxkVar.zzb() ? zzbdVar3.zzh(zzxkVar.zzb, zzxkVar.zzc) : zzbdVar3.zzd;
                com.google.android.gms.internal.ads.zzms zzh4 = zzd2.zzc(zzxkVar, zzd2.zzs, zzd2.zzs, zzd2.zzd, zzh3 - zzd2.zzs, zzd2.zzh, zzd2.zzi, zzd2.zzj).zzh(zzxkVar);
                zzh4.zzq = zzh3;
                return zzh4;
            }
        }
        zzxkVar = zzxkVar3;
        if (z) {
        }
        com.google.android.gms.internal.ads.zzgtj.zzi(!zzxkVar.zzb());
        com.google.android.gms.internal.ads.zzms zzh22 = zzd2.zzc(zzxkVar, longValue, longValue, longValue, 0L, !z ? com.google.android.gms.internal.ads.zzzn.zza : zzd2.zzh, !z ? this.zzb : zzd2.zzi, !z ? com.google.android.gms.internal.ads.zzgwm.zzi() : zzd2.zzj).zzh(zzxkVar);
        zzh22.zzq = longValue;
        return zzh22;
    }

    private static com.google.android.gms.internal.ads.zzms zzam(com.google.android.gms.internal.ads.zzms zzmsVar, int i) {
        com.google.android.gms.internal.ads.zzms zze = zzmsVar.zze(i);
        return (i == 1 || i == 4) ? zze.zzg(false) : zze;
    }

    private final android.util.Pair zzan(com.google.android.gms.internal.ads.zzbf zzbfVar, int i, long j) {
        if (zzbfVar.zzg()) {
            this.zzab = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.zzac = j;
            return null;
        }
        if (i == -1 || i >= zzbfVar.zza()) {
            i = zzbfVar.zzk(false);
            long j2 = zzbfVar.zzb(i, this.zza, 0L).zzl;
            j = com.google.android.gms.internal.ads.zzfl.zzr(0L);
        }
        return zzbfVar.zzm(this.zza, this.zzp, i, com.google.android.gms.internal.ads.zzfl.zzs(j));
    }

    private final long zzao(com.google.android.gms.internal.ads.zzbf zzbfVar, com.google.android.gms.internal.ads.zzxk zzxkVar, long j) {
        zzbfVar.zzo(zzxkVar.zza, this.zzp);
        return j;
    }

    private final com.google.android.gms.internal.ads.zzmw zzap(com.google.android.gms.internal.ads.zzmv zzmvVar) {
        int zzag = zzag(this.zzaa);
        com.google.android.gms.internal.ads.zzbf zzbfVar = this.zzaa.zza;
        int i = zzag == -1 ? 0 : zzag;
        com.google.android.gms.internal.ads.zzdo zzdoVar = this.zzv;
        com.google.android.gms.internal.ads.zzlu zzluVar = this.zzm;
        return new com.google.android.gms.internal.ads.zzmw(zzluVar, zzmvVar, zzbfVar, i, zzdoVar, zzluVar.zzn());
    }

    private final void zzaq(java.lang.Object obj) {
        java.lang.Object obj2 = this.zzO;
        boolean z = false;
        if (obj2 != null && obj2 != obj) {
            z = true;
        }
        boolean zzl = this.zzm.zzl(obj, z ? this.zzA : -9223372036854775807L);
        if (z) {
            java.lang.Object obj3 = this.zzO;
            android.view.Surface surface = this.zzP;
            if (obj3 == surface) {
                surface.release();
                this.zzP = null;
            }
        }
        this.zzO = obj;
        if (zzl) {
            return;
        }
        zzP(com.google.android.gms.internal.ads.zzjk.zzc(new com.google.android.gms.internal.ads.zzlv(3), 1003));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzar, reason: merged with bridge method [inline-methods] */
    public final void zzS(final int i, final int i2) {
        if (i == this.zzR.zza() && i2 == this.zzR.zzb()) {
            return;
        }
        this.zzR = new com.google.android.gms.internal.ads.zzeu(i, i2);
        com.google.android.gms.internal.ads.zzef zzefVar = this.zzn;
        zzefVar.zze(24, new com.google.android.gms.internal.ads.zzea() { // from class: com.google.android.gms.internal.ads.zzkr
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj) {
                int i3 = com.google.android.gms.internal.ads.zzlh.zzd;
                ((com.google.android.gms.internal.ads.zzaz) obj).zzu(i, i2);
            }
        });
        zzefVar.zzf();
        zzau(2, 14, new com.google.android.gms.internal.ads.zzeu(i, i2));
    }

    private final void zzas() {
        int zzh = zzh();
        if (zzh != 2 && zzh != 3) {
            this.zzy.zzb(false);
            this.zzz.zza(false);
        } else {
            zzat();
            boolean z = this.zzaa.zzp;
            this.zzy.zzb(zzk());
            this.zzz.zza(zzk());
        }
    }

    private final void zzat() {
        this.zze.zzd();
        android.os.Looper looper = this.zzt;
        if (java.lang.Thread.currentThread() != looper.getThread()) {
            java.lang.Object[] objArr = {java.lang.Thread.currentThread().getName(), looper.getThread().getName()};
            java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
            java.lang.String format = java.lang.String.format(java.util.Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", objArr);
            if (this.zzV) {
                throw new java.lang.IllegalStateException(format);
            }
            com.google.android.gms.internal.ads.zzeg.zzd("ExoPlayerImpl", format, this.zzW ? null : new java.lang.IllegalStateException());
            this.zzW = true;
        }
    }

    private final void zzau(int i, int i2, java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzna[] zznaVarArr = this.zzh;
        int length = zznaVarArr.length;
        for (int i3 = 0; i3 < 2; i3++) {
            com.google.android.gms.internal.ads.zzna zznaVar = zznaVarArr[i3];
            if (i == -1 || zznaVar.zza() == i) {
                com.google.android.gms.internal.ads.zzmw zzap = zzap(zznaVar);
                zzap.zzb(i2);
                zzap.zzd(obj);
                zzap.zzg();
            }
        }
        com.google.android.gms.internal.ads.zzna[] zznaVarArr2 = this.zzi;
        int length2 = zznaVarArr2.length;
        for (int i4 = 0; i4 < 2; i4++) {
            com.google.android.gms.internal.ads.zzna zznaVar2 = zznaVarArr2[i4];
            if (zznaVar2 != null && (i == -1 || zznaVar2.zza() == i)) {
                com.google.android.gms.internal.ads.zzmw zzap2 = zzap(zznaVar2);
                zzap2.zzb(i2);
                zzap2.zzd(obj);
                zzap2.zzg();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzA() {
        zzat();
        return zzah(this.zzaa);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzB(float f) {
        zzat();
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        final float max = java.lang.Math.max(0.0f, java.lang.Math.min(f, 1.0f));
        if (this.zzT == max) {
            return;
        }
        this.zzT = max;
        this.zzm.zzj(max);
        com.google.android.gms.internal.ads.zzef zzefVar = this.zzn;
        zzefVar.zze(22, new com.google.android.gms.internal.ads.zzea() { // from class: com.google.android.gms.internal.ads.zzkw
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj) {
                int i = com.google.android.gms.internal.ads.zzlh.zzd;
                ((com.google.android.gms.internal.ads.zzaz) obj).zzr(max);
            }
        });
        zzefVar.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzC(android.view.Surface surface) {
        zzat();
        zzaq(surface);
        int i = surface == null ? 0 : -1;
        zzS(i, i);
    }

    @Override // com.google.android.gms.internal.ads.zzjv
    public final void zzD(com.google.android.gms.internal.ads.zznp zznpVar) {
        this.zzs.zzv(zznpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjv
    public final void zzE(com.google.android.gms.internal.ads.zznp zznpVar) {
        zzat();
        this.zzs.zzw(zznpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjv
    public final int zzF() {
        zzat();
        int length = this.zzh.length;
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzjv
    public final void zzG(com.google.android.gms.internal.ads.zzxm zzxmVar) {
        zzat();
        java.util.List singletonList = java.util.Collections.singletonList(zzxmVar);
        zzat();
        zzat();
        zzag(this.zzaa);
        zzu();
        this.zzG++;
        java.util.List list = this.zzq;
        list.clear();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < singletonList.size(); i++) {
            com.google.android.gms.internal.ads.zzmo zzmoVar = new com.google.android.gms.internal.ads.zzmo((com.google.android.gms.internal.ads.zzxm) singletonList.get(i), this.zzr);
            arrayList.add(zzmoVar);
            list.add(i, new com.google.android.gms.internal.ads.zzld(zzmoVar.zzb, zzmoVar.zza));
        }
        this.zzad = this.zzad.zzg().zzf(0, arrayList.size());
        com.google.android.gms.internal.ads.zzmy zzmyVar = new com.google.android.gms.internal.ads.zzmy(list, this.zzad);
        if (!zzmyVar.zzg() && zzmyVar.zza() < 0) {
            throw new com.google.android.gms.internal.ads.zzw(zzmyVar, -1, -9223372036854775807L);
        }
        int zzk = zzmyVar.zzk(false);
        com.google.android.gms.internal.ads.zzms zzal = zzal(this.zzaa, zzmyVar, zzan(zzmyVar, zzk, -9223372036854775807L));
        int i2 = zzal.zze;
        if (i2 == 1) {
            i2 = 1;
        } else {
            if (!zzmyVar.zzg()) {
                if (zzk != -1) {
                    if (zzk < zzmyVar.zza()) {
                        i2 = 2;
                    }
                }
            }
            i2 = 4;
        }
        com.google.android.gms.internal.ads.zzms zzam = zzam(zzal, i2);
        this.zzm.zzy(arrayList, zzk, com.google.android.gms.internal.ads.zzfl.zzs(-9223372036854775807L), this.zzad);
        zzaj(zzam, 0, (this.zzaa.zzb.zza.equals(zzam.zzb.zza) || this.zzaa.zza.zzg()) ? false : true, 4, zzai(zzam), -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzjv
    public final void zzH() {
        java.lang.String hexString = java.lang.Integer.toHexString(java.lang.System.identityHashCode(this));
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        java.lang.String zza = com.google.android.gms.internal.ads.zzal.zza();
        int length = java.lang.String.valueOf(hexString).length();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 39 + java.lang.String.valueOf(str).length() + 3 + java.lang.String.valueOf(zza).length() + 1);
        sb.append("Release ");
        sb.append(hexString);
        sb.append(" [AndroidXMedia3/1.10.0-rc02] [");
        sb.append(str);
        sb.append("] [");
        sb.append(zza);
        sb.append(com.ironsource.X3.j.e);
        com.google.android.gms.internal.ads.zzeg.zzb("ExoPlayerImpl", sb.toString());
        zzat();
        this.zzy.zzb(false);
        this.zzz.zza(false);
        com.google.android.gms.internal.ads.zzlg zzlgVar = this.zzD;
        if (zzlgVar != null && android.os.Build.VERSION.SDK_INT >= 34) {
            zzlgVar.zza();
        }
        this.zzC.zza();
        if (!this.zzm.zzm()) {
            com.google.android.gms.internal.ads.zzef zzefVar = this.zzn;
            zzefVar.zze(10, com.google.android.gms.internal.ads.zzkv.zza);
            zzefVar.zzf();
        }
        this.zzn.zzg();
        this.zzk.zzl(null);
        com.google.android.gms.internal.ads.zzabq zzabqVar = this.zzu;
        com.google.android.gms.internal.ads.zznm zznmVar = this.zzs;
        zzabqVar.zzg(zznmVar);
        boolean z = this.zzaa.zzp;
        com.google.android.gms.internal.ads.zzms zzam = zzam(this.zzaa, 1);
        this.zzaa = zzam;
        com.google.android.gms.internal.ads.zzms zzh = zzam.zzh(zzam.zzb);
        this.zzaa = zzh;
        zzh.zzq = zzh.zzs;
        this.zzaa.zzr = 0L;
        zznmVar.zzy();
        android.view.Surface surface = this.zzP;
        if (surface != null) {
            surface.release();
            this.zzP = null;
        }
        int i = com.google.android.gms.internal.ads.zzcz.zza;
        this.zzY = true;
    }

    public final com.google.android.gms.internal.ads.zzjk zzI() {
        zzat();
        return this.zzaa.zzf;
    }

    final /* synthetic */ void zzJ(com.google.android.gms.internal.ads.zzaz zzazVar, com.google.android.gms.internal.ads.zzs zzsVar) {
        zzazVar.zza(this.zzg, new com.google.android.gms.internal.ads.zzay(zzsVar));
    }

    final /* synthetic */ void zzK(final com.google.android.gms.internal.ads.zzlr zzlrVar) {
        this.zzk.zzm(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzkt
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzlh.this.zzO(zzlrVar);
            }
        });
    }

    final /* synthetic */ void zzL(int i, final int i2) {
        zzat();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i2);
        zzau(1, 10, valueOf);
        zzau(2, 10, valueOf);
        com.google.android.gms.internal.ads.zzea zzeaVar = new com.google.android.gms.internal.ads.zzea() { // from class: com.google.android.gms.internal.ads.zzks
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj) {
                int i3 = com.google.android.gms.internal.ads.zzlh.zzd;
                ((com.google.android.gms.internal.ads.zzaz) obj).zzq(i2);
            }
        };
        com.google.android.gms.internal.ads.zzef zzefVar = this.zzn;
        zzefVar.zze(21, zzeaVar);
        zzefVar.zzf();
    }

    final /* synthetic */ void zzM() {
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        int generateAudioSessionId = com.google.android.gms.internal.ads.zzcj.zza(this.zzf).generateAudioSessionId();
        if (generateAudioSessionId == -1) {
            generateAudioSessionId = 0;
        }
        com.google.android.gms.internal.ads.zzdm zzdmVar = this.zzB;
        if (((java.lang.Integer) zzdmVar.zza()).intValue() != generateAudioSessionId) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(generateAudioSessionId);
            zzdmVar.zzc(valueOf);
            zzau(1, 10, valueOf);
            zzau(2, 10, valueOf);
        }
    }

    final /* synthetic */ void zzN(com.google.android.gms.internal.ads.zzaz zzazVar) {
        zzazVar.zzg(this.zzM);
    }

    final /* synthetic */ void zzO(com.google.android.gms.internal.ads.zzlr zzlrVar) {
        int i;
        long j;
        int i2 = this.zzG - zzlrVar.zzb;
        this.zzG = i2;
        boolean z = true;
        if (zzlrVar.zzc) {
            this.zzH = zzlrVar.zzd;
            this.zzI = true;
        }
        if (i2 == 0) {
            com.google.android.gms.internal.ads.zzbf zzbfVar = zzlrVar.zza.zza;
            if (!this.zzaa.zza.zzg() && zzbfVar.zzg()) {
                this.zzab = -1;
                this.zzac = 0L;
            }
            if (!zzbfVar.zzg()) {
                java.util.List zzw = ((com.google.android.gms.internal.ads.zzmy) zzbfVar).zzw();
                int size = zzw.size();
                java.util.List list = this.zzq;
                com.google.android.gms.internal.ads.zzgtj.zzi(size == list.size());
                for (int i3 = 0; i3 < zzw.size(); i3++) {
                    ((com.google.android.gms.internal.ads.zzld) list.get(i3)).zzc((com.google.android.gms.internal.ads.zzbf) zzw.get(i3));
                }
            }
            long j2 = -9223372036854775807L;
            if (this.zzI) {
                boolean z2 = zzlrVar.zza.zza.zzg() && this.zzaa.zza.zzg();
                boolean equals = zzlrVar.zza.zzb.equals(this.zzaa.zzb);
                long j3 = zzlrVar.zza.zzd;
                long j4 = this.zzaa.zzs;
                if (z2 || (equals && j3 == j4)) {
                    z = false;
                }
                if (z) {
                    int zzs = zzs();
                    if (zzbfVar.zzg() || zzlrVar.zza.zzb.zzb()) {
                        j = zzlrVar.zza.zzd;
                    } else {
                        com.google.android.gms.internal.ads.zzms zzmsVar = zzlrVar.zza;
                        com.google.android.gms.internal.ads.zzxk zzxkVar = zzmsVar.zzb;
                        j = zzmsVar.zzd;
                        zzao(zzbfVar, zzxkVar, j);
                    }
                    j2 = j;
                    i = zzs;
                    this.zzI = false;
                    zzaj(zzlrVar.zza, 1, z, this.zzH, j2, i, false);
                }
            } else {
                z = false;
            }
            i = -1;
            this.zzI = false;
            zzaj(zzlrVar.zza, 1, z, this.zzH, j2, i, false);
        }
    }

    final /* synthetic */ void zzQ(android.graphics.SurfaceTexture surfaceTexture) {
        android.view.Surface surface = new android.view.Surface(surfaceTexture);
        zzaq(surface);
        this.zzP = surface;
    }

    final /* synthetic */ void zzR(java.lang.Object obj) {
        zzaq(null);
    }

    final /* synthetic */ void zzT(int i, int i2, java.lang.Object obj) {
        zzau(1, 19, obj);
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzef zzU() {
        return this.zzn;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zznm zzV() {
        return this.zzs;
    }

    final /* synthetic */ android.os.Looper zzW() {
        return this.zzt;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzdo zzX() {
        return this.zzv;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzdm zzY() {
        return this.zzB;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzjx zzZ() {
        return this.zzE;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzjx zzaa() {
        return this.zzF;
    }

    final /* synthetic */ java.lang.Object zzab() {
        return this.zzO;
    }

    final /* synthetic */ boolean zzac() {
        return this.zzU;
    }

    final /* synthetic */ void zzad(boolean z) {
        this.zzU = z;
    }

    final /* synthetic */ boolean zzae() {
        return this.zzY;
    }

    @Override // com.google.android.gms.internal.ads.zzf
    protected final void zzc(int i, long j, int i2, boolean z) {
        zzat();
        if (i == -1) {
            return;
        }
        com.google.android.gms.internal.ads.zzgtj.zza(i >= 0);
        com.google.android.gms.internal.ads.zzbf zzbfVar = this.zzaa.zza;
        if (zzbfVar.zzg() || i < zzbfVar.zza()) {
            this.zzs.zzA();
            this.zzG++;
            if (zzx()) {
                com.google.android.gms.internal.ads.zzeg.zzc("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                com.google.android.gms.internal.ads.zzlr zzlrVar = new com.google.android.gms.internal.ads.zzlr(this.zzaa);
                zzlrVar.zza(1);
                this.zzl.zza(zzlrVar);
                return;
            }
            com.google.android.gms.internal.ads.zzms zzmsVar = this.zzaa;
            int i3 = zzmsVar.zze;
            if (i3 == 3 || (i3 == 4 && !zzbfVar.zzg())) {
                zzmsVar = zzam(this.zzaa, 2);
            }
            int zzs = zzs();
            com.google.android.gms.internal.ads.zzms zzal = zzal(zzmsVar, zzbfVar, zzan(zzbfVar, i, j));
            this.zzm.zzf(zzbfVar, i, com.google.android.gms.internal.ads.zzfl.zzs(j));
            zzaj(zzal, 0, true, 1, zzai(zzal), zzs, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final android.os.Looper zzd() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzf(com.google.android.gms.internal.ads.zzaz zzazVar) {
        zzat();
        zzazVar.getClass();
        this.zzn.zzd(zzazVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzg() {
        zzat();
        com.google.android.gms.internal.ads.zzms zzmsVar = this.zzaa;
        if (zzmsVar.zze != 1) {
            return;
        }
        com.google.android.gms.internal.ads.zzms zzf = zzmsVar.zzf(null);
        com.google.android.gms.internal.ads.zzms zzam = zzam(zzf, true != zzf.zza.zzg() ? 2 : 4);
        this.zzG++;
        this.zzm.zzd();
        zzaj(zzam, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzh() {
        zzat();
        return this.zzaa.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzi() {
        zzat();
        return this.zzaa.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzj(boolean z) {
        zzat();
        com.google.android.gms.internal.ads.zzms zzmsVar = this.zzaa;
        int i = zzmsVar.zzn;
        int i2 = 0;
        if (i == 1) {
            if (z) {
                i = 1;
            } else {
                i = 1;
                i2 = 1;
            }
        }
        if (zzmsVar.zzl == z && i == i2 && zzmsVar.zzm == 1) {
            return;
        }
        this.zzG++;
        boolean z2 = zzmsVar.zzp;
        com.google.android.gms.internal.ads.zzms zzi = zzmsVar.zzi(z, 1, i2);
        this.zzm.zze(z, 1, i2);
        zzaj(zzi, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zzk() {
        zzat();
        return this.zzaa.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzl() {
        zzat();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zzm() {
        zzat();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final com.google.android.gms.internal.ads.zzav zzn() {
        zzat();
        return this.zzaa.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzo() {
        zzat();
        zzP(null);
        new com.google.android.gms.internal.ads.zzcz(com.google.android.gms.internal.ads.zzgwm.zzi(), this.zzaa.zzs);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final com.google.android.gms.internal.ads.zzbn zzp() {
        zzat();
        return this.zzaa.zzi.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final com.google.android.gms.internal.ads.zzbf zzq() {
        zzat();
        return this.zzaa.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzr() {
        zzat();
        if (!this.zzaa.zza.zzg()) {
            com.google.android.gms.internal.ads.zzms zzmsVar = this.zzaa;
            return zzmsVar.zza.zze(zzmsVar.zzb.zza);
        }
        int i = this.zzab;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzs() {
        zzat();
        int zzag = zzag(this.zzaa);
        if (zzag == -1) {
            return 0;
        }
        return zzag;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzt() {
        zzat();
        if (!zzx()) {
            com.google.android.gms.internal.ads.zzbf zzq = zzq();
            if (zzq.zzg()) {
                return -9223372036854775807L;
            }
            return com.google.android.gms.internal.ads.zzfl.zzr(zzq.zzb(zzs(), this.zza, 0L).zzm);
        }
        com.google.android.gms.internal.ads.zzms zzmsVar = this.zzaa;
        com.google.android.gms.internal.ads.zzxk zzxkVar = zzmsVar.zzb;
        com.google.android.gms.internal.ads.zzbf zzbfVar = zzmsVar.zza;
        java.lang.Object obj = zzxkVar.zza;
        com.google.android.gms.internal.ads.zzbd zzbdVar = this.zzp;
        zzbfVar.zzo(obj, zzbdVar);
        return com.google.android.gms.internal.ads.zzfl.zzr(zzbdVar.zzh(zzxkVar.zzb, zzxkVar.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzu() {
        zzat();
        return com.google.android.gms.internal.ads.zzfl.zzr(zzai(this.zzaa));
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzv() {
        zzat();
        if (zzx()) {
            com.google.android.gms.internal.ads.zzms zzmsVar = this.zzaa;
            return zzmsVar.zzk.equals(zzmsVar.zzb) ? com.google.android.gms.internal.ads.zzfl.zzr(this.zzaa.zzq) : zzt();
        }
        zzat();
        if (this.zzaa.zza.zzg()) {
            return this.zzac;
        }
        com.google.android.gms.internal.ads.zzms zzmsVar2 = this.zzaa;
        long j = 0;
        if (zzmsVar2.zzk.zzd != zzmsVar2.zzb.zzd) {
            return com.google.android.gms.internal.ads.zzfl.zzr(zzmsVar2.zza.zzb(zzs(), this.zza, 0L).zzm);
        }
        long j2 = zzmsVar2.zzq;
        if (this.zzaa.zzk.zzb()) {
            com.google.android.gms.internal.ads.zzms zzmsVar3 = this.zzaa;
            zzmsVar3.zza.zzo(zzmsVar3.zzk.zza, this.zzp).zzc(this.zzaa.zzk.zzb);
        } else {
            j = j2;
        }
        com.google.android.gms.internal.ads.zzms zzmsVar4 = this.zzaa;
        zzao(zzmsVar4.zza, zzmsVar4.zzk, j);
        return com.google.android.gms.internal.ads.zzfl.zzr(j);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzw() {
        zzat();
        return com.google.android.gms.internal.ads.zzfl.zzr(this.zzaa.zzr);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zzx() {
        zzat();
        return this.zzaa.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzy() {
        zzat();
        if (zzx()) {
            return this.zzaa.zzb.zzb;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzz() {
        zzat();
        if (zzx()) {
            return this.zzaa.zzb.zzc;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zze(com.google.android.gms.internal.ads.zzaz zzazVar) {
        zzazVar.getClass();
        this.zzn.zzc(zzazVar);
    }
}
