package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zztx extends com.google.android.gms.internal.ads.zzvt implements com.google.android.gms.internal.ads.zzmb {
    private final android.content.Context zzb;
    private final com.google.android.gms.internal.ads.zzru zzc;
    private final com.google.android.gms.internal.ads.zzse zzd;
    private final com.google.android.gms.internal.ads.zzvf zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private com.google.android.gms.internal.ads.zzv zzi;
    private com.google.android.gms.internal.ads.zzv zzj;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private int zzp;
    private boolean zzq;
    private long zzr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zztx(android.content.Context context, com.google.android.gms.internal.ads.zzvh zzvhVar, com.google.android.gms.internal.ads.zzvv zzvvVar, boolean z, android.os.Handler handler, com.google.android.gms.internal.ads.zzrv zzrvVar, com.google.android.gms.internal.ads.zzse zzseVar) {
        super(context.getApplicationContext(), 1, zzvhVar, zzvvVar, false, 44100.0f);
        com.google.android.gms.internal.ads.zzvf zzvfVar = android.os.Build.VERSION.SDK_INT >= 35 ? new com.google.android.gms.internal.ads.zzvf(com.google.android.gms.internal.ads.zzve.zzb) : null;
        this.zzb = context.getApplicationContext();
        this.zzd = zzseVar;
        this.zze = zzvfVar;
        this.zzp = -1000;
        this.zzc = new com.google.android.gms.internal.ads.zzru(handler, zzrvVar);
        this.zzr = -9223372036854775807L;
        zzseVar.zza(new com.google.android.gms.internal.ads.zztw(this, null));
    }

    private static java.util.List zzbm(com.google.android.gms.internal.ads.zzvv zzvvVar, com.google.android.gms.internal.ads.zzv zzvVar, boolean z, com.google.android.gms.internal.ads.zzse zzseVar) throws com.google.android.gms.internal.ads.zzvx {
        com.google.android.gms.internal.ads.zzvm zza;
        return zzvVar.zzp == null ? com.google.android.gms.internal.ads.zzgwm.zzi() : (!zzseVar.zzd(zzvVar) || (zza = com.google.android.gms.internal.ads.zzwf.zza()) == null) ? com.google.android.gms.internal.ads.zzwf.zzc(zzvvVar, zzvVar, false, false) : com.google.android.gms.internal.ads.zzgwm.zzj(zza);
    }

    private final int zzbn(com.google.android.gms.internal.ads.zzvm zzvmVar, com.google.android.gms.internal.ads.zzv zzvVar) {
        if ("OMX.google.raw.decoder".equals(zzvmVar.zza) && android.os.Build.VERSION.SDK_INT == 23 && !com.google.android.gms.internal.ads.zzfl.zzP(this.zzb)) {
            return -1;
        }
        return zzvVar.zzq;
    }

    private final void zzbo() {
        long zzg = this.zzd.zzg(zzab());
        if (zzg != Long.MIN_VALUE) {
            if (!this.zzl) {
                zzg = java.lang.Math.max(this.zzk, zzg);
            }
            this.zzk = zzg;
            this.zzl = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvt, com.google.android.gms.internal.ads.zzix
    protected final void zzA(long j, boolean z, boolean z2) throws com.google.android.gms.internal.ads.zzjk {
        super.zzA(j, z, z2);
        this.zzd.zzB();
        this.zzk = j;
        this.zzr = -9223372036854775807L;
        this.zzn = false;
        this.zzo = false;
        this.zzl = true;
    }

    @Override // com.google.android.gms.internal.ads.zzix
    protected final void zzB() {
        this.zzd.zzi();
        this.zzq = true;
    }

    @Override // com.google.android.gms.internal.ads.zzix
    protected final void zzC() {
        zzbo();
        this.zzq = false;
        this.zzd.zzA();
        this.zzo = false;
    }

    @Override // com.google.android.gms.internal.ads.zzvt, com.google.android.gms.internal.ads.zzix
    protected final void zzD() {
        this.zzm = true;
        this.zzi = null;
        this.zzr = -9223372036854775807L;
        this.zzo = false;
        try {
            this.zzd.zzB();
            super.zzD();
        } catch (java.lang.Throwable th) {
            super.zzD();
            throw th;
        } finally {
            this.zzc.zzg(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvt, com.google.android.gms.internal.ads.zzix
    protected final void zzE() {
        this.zzn = false;
        this.zzo = false;
        this.zzr = -9223372036854775807L;
        try {
            super.zzE();
            if (this.zzm) {
                this.zzm = false;
                this.zzd.zzC();
            }
        } catch (java.lang.Throwable th) {
            if (this.zzm) {
                this.zzm = false;
                this.zzd.zzC();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzix
    protected final void zzF() {
        com.google.android.gms.internal.ads.zzvf zzvfVar;
        this.zzd.zzD();
        if (android.os.Build.VERSION.SDK_INT < 35 || (zzvfVar = this.zze) == null) {
            return;
        }
        zzvfVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzna, com.google.android.gms.internal.ads.zznc
    public final java.lang.String zzU() {
        return "MediaCodecAudioRenderer";
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzvf zzaA() {
        return this.zze;
    }

    final /* synthetic */ void zzaB(boolean z) {
        this.zzn = true;
    }

    final /* synthetic */ void zzaC(boolean z) {
        this.zzo = true;
    }

    @Override // com.google.android.gms.internal.ads.zzvt, com.google.android.gms.internal.ads.zzna
    public final boolean zzaa() {
        return this.zzd.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzvt, com.google.android.gms.internal.ads.zzna
    public final boolean zzab() {
        return super.zzab() && this.zzd.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final int zzae(com.google.android.gms.internal.ads.zzvv zzvvVar, com.google.android.gms.internal.ads.zzv zzvVar) throws com.google.android.gms.internal.ads.zzvx {
        int i;
        boolean z;
        java.lang.String str = zzvVar.zzp;
        if (!com.google.android.gms.internal.ads.zzas.zza(str)) {
            return 128;
        }
        int i2 = zzvVar.zzO;
        boolean zzbj = zzbj(zzvVar);
        int i3 = 1;
        if (!zzbj || (i2 != 0 && com.google.android.gms.internal.ads.zzwf.zza() == null)) {
            i = 0;
        } else {
            com.google.android.gms.internal.ads.zzse zzseVar = this.zzd;
            com.google.android.gms.internal.ads.zzqs zzf = zzseVar.zzf(zzvVar);
            if (zzf.zzb) {
                i = true != zzf.zzc ? 512 : 1536;
                if (zzf.zzd) {
                    i |= 2048;
                }
            } else {
                i = 0;
            }
            if (zzseVar.zzd(zzvVar)) {
                return i | 172;
            }
        }
        if (!"audio/raw".equals(str) || this.zzd.zzd(zzvVar)) {
            com.google.android.gms.internal.ads.zzse zzseVar2 = this.zzd;
            if (zzseVar2.zzd(com.google.android.gms.internal.ads.zzfl.zzA(2, zzvVar.zzH, zzvVar.zzI))) {
                java.util.List zzbm = zzbm(zzvvVar, zzvVar, false, zzseVar2);
                if (!zzbm.isEmpty()) {
                    if (zzbj) {
                        com.google.android.gms.internal.ads.zzvm zzvmVar = (com.google.android.gms.internal.ads.zzvm) zzbm.get(0);
                        android.content.Context context = this.zzb;
                        boolean zzc = zzvmVar.zzc(context, zzvVar);
                        if (!zzc) {
                            for (int i4 = 1; i4 < zzbm.size(); i4++) {
                                com.google.android.gms.internal.ads.zzvm zzvmVar2 = (com.google.android.gms.internal.ads.zzvm) zzbm.get(i4);
                                if (zzvmVar2.zzc(context, zzvVar)) {
                                    zzvmVar = zzvmVar2;
                                    z = false;
                                    zzc = true;
                                    break;
                                }
                            }
                        }
                        z = true;
                        int i5 = true != zzc ? 3 : 4;
                        int i6 = 8;
                        if (zzc && zzvmVar.zze(zzvVar)) {
                            i6 = 16;
                        }
                        return i5 | i6 | 32 | (true != zzvmVar.zzg ? 0 : 64) | (true != z ? 0 : 128) | i;
                    }
                    i3 = 2;
                }
            }
        }
        return i3 | 128;
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final java.util.List zzaf(com.google.android.gms.internal.ads.zzvv zzvvVar, com.google.android.gms.internal.ads.zzv zzvVar, boolean z) throws com.google.android.gms.internal.ads.zzvx {
        return com.google.android.gms.internal.ads.zzwf.zze(this.zzb, zzbm(zzvvVar, zzvVar, false, this.zzd), zzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final boolean zzag(com.google.android.gms.internal.ads.zzv zzvVar) {
        zzK();
        return this.zzd.zzd(zzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final com.google.android.gms.internal.ads.zzvg zzah(com.google.android.gms.internal.ads.zzvm zzvmVar, com.google.android.gms.internal.ads.zzv zzvVar, android.media.MediaCrypto mediaCrypto, float f) {
        com.google.android.gms.internal.ads.zzv[] zzJ = zzJ();
        int length = zzJ.length;
        int zzbn = zzbn(zzvmVar, zzvVar);
        if (length != 1) {
            for (com.google.android.gms.internal.ads.zzv zzvVar2 : zzJ) {
                if (zzvmVar.zzf(zzvVar, zzvVar2).zzd != 0) {
                    zzbn = java.lang.Math.max(zzbn, zzbn(zzvmVar, zzvVar2));
                }
            }
        }
        this.zzf = zzbn;
        java.lang.String str = zzvmVar.zza;
        this.zzg = android.os.Build.VERSION.SDK_INT < 24 && "OMX.SEC.aac.dec".equals(str) && com.adjust.sdk.Constants.REFERRER_API_SAMSUNG.equals(android.os.Build.MANUFACTURER) && (android.os.Build.DEVICE.startsWith("zeroflte") || android.os.Build.DEVICE.startsWith("herolte") || android.os.Build.DEVICE.startsWith("heroqlte"));
        this.zzh = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        java.lang.String str2 = zzvmVar.zzc;
        int i = this.zzf;
        android.media.MediaFormat mediaFormat = new android.media.MediaFormat();
        mediaFormat.setString("mime", str2);
        int i2 = zzvVar.zzH;
        mediaFormat.setInteger("channel-count", i2);
        int i3 = zzvVar.zzI;
        mediaFormat.setInteger("sample-rate", i3);
        com.google.android.gms.internal.ads.zzej.zza(mediaFormat, zzvVar.zzs);
        com.google.android.gms.internal.ads.zzej.zzb(mediaFormat, "max-input-size", i);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f && (android.os.Build.VERSION.SDK_INT != 23 || (!"ZTE B2017G".equals(android.os.Build.MODEL) && !"AXON 7 mini".equals(android.os.Build.MODEL)))) {
            mediaFormat.setFloat("operating-rate", f);
        }
        java.lang.String str3 = zzvVar.zzp;
        if ("audio/ac4".equals(str3)) {
            android.util.Pair zze = com.google.android.gms.internal.ads.zzdq.zze(zzvVar);
            if (zze != null) {
                com.google.android.gms.internal.ads.zzej.zzb(mediaFormat, com.google.android.gms.common.Scopes.PROFILE, ((java.lang.Integer) zze.first).intValue());
                com.google.android.gms.internal.ads.zzej.zzb(mediaFormat, com.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL, ((java.lang.Integer) zze.second).intValue());
            }
            if (android.os.Build.VERSION.SDK_INT <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 24 && this.zzd.zze(com.google.android.gms.internal.ads.zzfl.zzA(4, i2, i3)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (android.os.Build.VERSION.SDK_INT >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", java.lang.Math.max(0, -this.zzp));
        }
        if (java.util.Objects.equals(str3, "audio/iamf")) {
            com.google.android.gms.internal.ads.zzqh zzs = this.zzd.zzs();
            if (zzs == null) {
                com.google.android.gms.internal.ads.zzeg.zzc("MediaCodecAudioRenderer", "AudioCapabilities from the AudioSink are null, using default stereo output layout.");
                mediaFormat.setInteger("channel-mask", 12);
                mediaFormat.setInteger("max-output-channel-count", 2);
            } else {
                int zza = com.google.android.gms.internal.ads.zztv.zza(zzs);
                int bitCount = java.lang.Integer.bitCount(zza);
                mediaFormat.setInteger("channel-mask", zza);
                mediaFormat.setInteger("max-output-channel-count", bitCount);
            }
        }
        zzbi(mediaFormat);
        this.zzj = (!"audio/raw".equals(zzvmVar.zzb) || "audio/raw".equals(str3)) ? null : zzvVar;
        return com.google.android.gms.internal.ads.zzvg.zza(zzvmVar, mediaFormat, zzvVar, null, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final com.google.android.gms.internal.ads.zzjc zzai(com.google.android.gms.internal.ads.zzvm zzvmVar, com.google.android.gms.internal.ads.zzv zzvVar, com.google.android.gms.internal.ads.zzv zzvVar2) {
        int i;
        int i2;
        com.google.android.gms.internal.ads.zzjc zzf = zzvmVar.zzf(zzvVar, zzvVar2);
        int i3 = zzf.zze;
        if (zzaF(zzvVar2)) {
            i3 |= 32768;
        }
        if (zzbn(zzvmVar, zzvVar2) > this.zzf) {
            i3 |= 64;
        }
        java.lang.String str = zzvmVar.zza;
        if (i3 != 0) {
            i2 = i3;
            i = 0;
        } else {
            i = zzf.zzd;
            i2 = 0;
        }
        return new com.google.android.gms.internal.ads.zzjc(str, zzvVar, zzvVar2, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final long zzaj(long j, long j2, boolean z) {
        com.google.android.gms.internal.ads.zzse zzseVar = this.zzd;
        boolean z2 = false;
        if (zzseVar.zzn() && this.zzr != -9223372036854775807L) {
            z2 = true;
        }
        if (!this.zzq) {
            return (z2 || super.zzab()) ? 1000000L : 10000L;
        }
        long zzx = zzseVar.zzx();
        if (this.zzo && z2 && zzx != -9223372036854775807L) {
            return java.lang.Math.max(10000L, (long) ((java.lang.Math.min(zzx, this.zzr - j) / (zzj() != null ? zzj().zzb : 1.0f)) / 2.0f));
        }
        return 10000L;
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final float zzak(float f, com.google.android.gms.internal.ads.zzv zzvVar, com.google.android.gms.internal.ads.zzv[] zzvVarArr) {
        int i = -1;
        for (com.google.android.gms.internal.ads.zzv zzvVar2 : zzvVarArr) {
            int i2 = zzvVar2.zzI;
            if (i2 != -1) {
                i = java.lang.Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return i * f;
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final void zzal(java.lang.String str, com.google.android.gms.internal.ads.zzvg zzvgVar, long j, long j2) {
        this.zzc.zzb(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final void zzam(java.lang.String str) {
        this.zzc.zzf(str);
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final void zzan(java.lang.Exception exc) {
        com.google.android.gms.internal.ads.zzeg.zzf("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.zzc.zzj(exc);
    }

    protected final void zzaq() {
        this.zzl = true;
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final void zzar() {
        this.zzd.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final void zzat(com.google.android.gms.internal.ads.zziz zzizVar) {
        this.zzc.zzn(zzizVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final void zzau() throws com.google.android.gms.internal.ads.zzjk {
        try {
            this.zzd.zzl();
            if (zzbe() != -9223372036854775807L) {
                this.zzr = zzbe();
            }
        } catch (com.google.android.gms.internal.ads.zzsd e) {
            throw zzP(e, e.zzc, e.zzb, true != zzaH() ? 5002 : 5003);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final void zzav(com.google.android.gms.internal.ads.zziv zzivVar) {
        com.google.android.gms.internal.ads.zzv zzvVar;
        if (android.os.Build.VERSION.SDK_INT < 29 || (zzvVar = zzivVar.zza) == null || !java.util.Objects.equals(zzvVar.zzp, "audio/opus") || !zzaH()) {
            return;
        }
        java.nio.ByteBuffer byteBuffer = zzivVar.zzf;
        byteBuffer.getClass();
        com.google.android.gms.internal.ads.zzv zzvVar2 = zzivVar.zza;
        zzvVar2.getClass();
        int i = zzvVar2.zzK;
        if (byteBuffer.remaining() == 8) {
            this.zzd.zzy(i, (int) ((byteBuffer.order(java.nio.ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzru zzaz() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzix, com.google.android.gms.internal.ads.zzna
    public final com.google.android.gms.internal.ads.zzmb zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final long zzg() {
        if (zze() == 2) {
            zzbo();
        }
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final boolean zzh() {
        boolean z = this.zzn;
        this.zzn = false;
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final void zzi(com.google.android.gms.internal.ads.zzav zzavVar) {
        this.zzd.zzo(zzavVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final com.google.android.gms.internal.ads.zzav zzj() {
        return this.zzd.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzvt, com.google.android.gms.internal.ads.zzix
    protected final void zzy(boolean z, boolean z2) throws com.google.android.gms.internal.ads.zzjk {
        super.zzy(z, z2);
        this.zzc.zza(this.zza);
        zzK();
        com.google.android.gms.internal.ads.zzse zzseVar = this.zzd;
        zzseVar.zzb(zzL());
        zzseVar.zzc(zzM());
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final com.google.android.gms.internal.ads.zzjc zzao(com.google.android.gms.internal.ads.zzlw zzlwVar) throws com.google.android.gms.internal.ads.zzjk {
        com.google.android.gms.internal.ads.zzv zzvVar = zzlwVar.zzb;
        zzvVar.getClass();
        this.zzi = zzvVar;
        com.google.android.gms.internal.ads.zzjc zzao = super.zzao(zzlwVar);
        this.zzc.zzc(zzvVar, zzao);
        return zzao;
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final boolean zzas(long j, long j2, com.google.android.gms.internal.ads.zzvj zzvjVar, java.nio.ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, com.google.android.gms.internal.ads.zzv zzvVar) throws com.google.android.gms.internal.ads.zzjk {
        byteBuffer.getClass();
        this.zzr = -9223372036854775807L;
        if (this.zzj != null && (i2 & 2) != 0) {
            zzvjVar.getClass();
            zzvjVar.zzc(i, false);
            return true;
        }
        if (z) {
            if (zzvjVar != null) {
                zzvjVar.zzc(i, false);
            }
            this.zza.zzf += i3;
            this.zzd.zzj();
            return true;
        }
        try {
            if (!this.zzd.zzk(byteBuffer, j3, i3)) {
                this.zzr = j3;
                return false;
            }
            if (zzvjVar != null) {
                zzvjVar.zzc(i, false);
            }
            this.zza.zze += i3;
            return true;
        } catch (com.google.android.gms.internal.ads.zzsa e) {
            com.google.android.gms.internal.ads.zzv zzvVar2 = this.zzi;
            if (zzaH()) {
                zzK();
            }
            throw zzP(e, zzvVar2, false, 5001);
        } catch (com.google.android.gms.internal.ads.zzsd e2) {
            if (zzaH()) {
                zzK();
            }
            throw zzP(e2, zzvVar, e2.zzb, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvt, com.google.android.gms.internal.ads.zzix, com.google.android.gms.internal.ads.zzmv
    public final void zzx(int i, java.lang.Object obj) throws com.google.android.gms.internal.ads.zzjk {
        com.google.android.gms.internal.ads.zzvf zzvfVar;
        if (i == 2) {
            com.google.android.gms.internal.ads.zzse zzseVar = this.zzd;
            obj.getClass();
            zzseVar.zzz(((java.lang.Float) obj).floatValue());
            return;
        }
        if (i == 3) {
            com.google.android.gms.internal.ads.zzd zzdVar = (com.google.android.gms.internal.ads.zzd) obj;
            com.google.android.gms.internal.ads.zzse zzseVar2 = this.zzd;
            zzdVar.getClass();
            zzseVar2.zzr(zzdVar);
            return;
        }
        if (i == 6) {
            com.google.android.gms.internal.ads.zze zzeVar = (com.google.android.gms.internal.ads.zze) obj;
            com.google.android.gms.internal.ads.zzse zzseVar3 = this.zzd;
            zzeVar.getClass();
            zzseVar3.zzu(zzeVar);
            return;
        }
        if (i == 12) {
            this.zzd.zzv((android.media.AudioDeviceInfo) obj);
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.zzp = ((java.lang.Integer) obj).intValue();
            com.google.android.gms.internal.ads.zzvj zzaI = zzaI();
            if (zzaI == null || android.os.Build.VERSION.SDK_INT < 35) {
                return;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("importance", java.lang.Math.max(0, -this.zzp));
            zzaI.zzp(bundle);
            return;
        }
        if (i == 19) {
            com.google.android.gms.internal.ads.zzse zzseVar4 = this.zzd;
            obj.getClass();
            zzseVar4.zzw(((java.lang.Integer) obj).intValue());
            return;
        }
        if (i == 9) {
            com.google.android.gms.internal.ads.zzse zzseVar5 = this.zzd;
            obj.getClass();
            zzseVar5.zzq(((java.lang.Boolean) obj).booleanValue());
        } else {
            if (i != 10) {
                super.zzx(i, obj);
                return;
            }
            obj.getClass();
            int intValue = ((java.lang.Integer) obj).intValue();
            this.zzd.zzt(intValue);
            if (android.os.Build.VERSION.SDK_INT < 35 || (zzvfVar = this.zze) == null) {
                return;
            }
            zzvfVar.zza(intValue);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final void zzap(com.google.android.gms.internal.ads.zzv zzvVar, android.media.MediaFormat mediaFormat) throws com.google.android.gms.internal.ads.zzjk {
        int i;
        com.google.android.gms.internal.ads.zzv zzvVar2 = this.zzj;
        com.google.android.gms.internal.ads.zzhaf zzhafVar = null;
        if (zzvVar2 != null) {
            zzvVar = zzvVar2;
        } else if (zzaI() != null) {
            mediaFormat.getClass();
            int zzB = "audio/raw".equals(zzvVar.zzp) ? zzvVar.zzJ : (android.os.Build.VERSION.SDK_INT < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? com.google.android.gms.internal.ads.zzfl.zzB(mediaFormat.getInteger("v-bits-per-sample"), java.nio.ByteOrder.LITTLE_ENDIAN) : 2 : mediaFormat.getInteger("pcm-encoding");
            com.google.android.gms.internal.ads.zzt zztVar = new com.google.android.gms.internal.ads.zzt();
            zztVar.zzo("audio/raw");
            zztVar.zzI(zzB);
            zztVar.zzJ(zzvVar.zzK);
            zztVar.zzK(zzvVar.zzL);
            zztVar.zzl(zzvVar.zzl);
            java.lang.Object obj = zzvVar.zzm;
            zztVar.zza(zzvVar.zza);
            zztVar.zzc(zzvVar.zzb);
            zztVar.zzd(zzvVar.zzc);
            zztVar.zze(zzvVar.zzd);
            zztVar.zzf(zzvVar.zze);
            zztVar.zzg(zzvVar.zzf);
            zztVar.zzG(mediaFormat.getInteger("channel-count"));
            zztVar.zzH(mediaFormat.getInteger("sample-rate"));
            com.google.android.gms.internal.ads.zzv zzO = zztVar.zzO();
            if (this.zzg && zzO.zzH == 6 && (i = zzvVar.zzH) < 6) {
                com.google.android.gms.internal.ads.zzhae zzg = com.google.android.gms.internal.ads.zzhaf.zzg(i);
                for (int i2 = 0; i2 < i; i2++) {
                    zzg.zza(i2);
                }
                zzhafVar = zzg.zzb();
            } else if (this.zzh) {
                zzhafVar = com.google.android.gms.internal.ads.zzahm.zza(zzO.zzH);
            }
            zzvVar = zzO;
        }
        try {
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                if (zzaH()) {
                    zzK();
                }
                com.google.android.gms.internal.ads.zzgtj.zzi(android.os.Build.VERSION.SDK_INT >= 29);
            }
            com.google.android.gms.internal.ads.zzse zzseVar = this.zzd;
            com.google.android.gms.internal.ads.zzrw zzrwVar = new com.google.android.gms.internal.ads.zzrw(zzvVar);
            zzrwVar.zza(zzhafVar);
            zzseVar.zzh(zzrwVar.zzb());
        } catch (com.google.android.gms.internal.ads.zzrz e) {
            throw zzP(e, e.zza, false, 5001);
        }
    }
}
