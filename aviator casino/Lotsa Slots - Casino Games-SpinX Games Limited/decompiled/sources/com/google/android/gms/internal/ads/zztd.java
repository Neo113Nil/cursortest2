package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zztd implements com.google.android.gms.internal.ads.zzrf {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zztc zzb;
    private final float zzc;
    private com.google.android.gms.internal.ads.zzef zzd;
    private com.google.android.gms.internal.ads.zzdo zze;
    private com.google.android.gms.internal.ads.zzqh zzf;
    private com.google.android.gms.internal.ads.zzqn zzg;
    private android.os.Looper zzh;
    private android.content.Context zzi;
    private final com.google.android.gms.internal.ads.zzth zzj;

    /* synthetic */ zztd(com.google.android.gms.internal.ads.zztb zztbVar, byte[] bArr) {
        this.zza = zztbVar.zzd();
        com.google.android.gms.internal.ads.zzth zzg = zztbVar.zzg();
        zzg.getClass();
        this.zzj = zzg;
        this.zzf = zztbVar.zze();
        this.zzb = zztbVar.zzd() != null ? new com.google.android.gms.internal.ads.zztc(this, null) : null;
        this.zzc = 8.0f;
        this.zze = com.google.android.gms.internal.ads.zzdo.zza;
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"audioCapabilities"})
    private final void zzk(com.google.android.gms.internal.ads.zzqy zzqyVar) {
        android.content.Context context;
        zzl();
        com.google.android.gms.internal.ads.zzqn zzqnVar = this.zzg;
        if (zzqnVar == null && (context = this.zza) != null) {
            com.google.android.gms.internal.ads.zzqn zzqnVar2 = new com.google.android.gms.internal.ads.zzqn(context, new com.google.android.gms.internal.ads.zzqm() { // from class: com.google.android.gms.internal.ads.zzta
                @Override // com.google.android.gms.internal.ads.zzqm
                public final /* synthetic */ void zza(com.google.android.gms.internal.ads.zzqh zzqhVar) {
                    com.google.android.gms.internal.ads.zztd.this.zzh(zzqhVar);
                }
            }, zzqyVar.zzb, zzqyVar.zzc);
            this.zzg = zzqnVar2;
            this.zzf = zzqnVar2.zzd();
        } else if (zzqnVar != null) {
            android.media.AudioDeviceInfo audioDeviceInfo = zzqyVar.zzc;
            if (audioDeviceInfo != null) {
                zzqnVar.zzc(audioDeviceInfo);
            }
            this.zzg.zzb(zzqyVar.zzb);
        }
        this.zzf.getClass();
    }

    private final void zzl() {
        if (this.zza == null) {
            return;
        }
        android.os.Looper myLooper = android.os.Looper.myLooper();
        android.os.Looper looper = this.zzh;
        boolean z = looper == null || looper == myLooper;
        java.lang.String zzm = zzm(looper);
        java.lang.String zzm2 = zzm(myLooper);
        if (!z) {
            throw new java.lang.IllegalStateException(com.google.android.gms.internal.ads.zzgua.zzd("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", zzm, zzm2));
        }
        this.zzh = myLooper;
    }

    private static java.lang.String zzm(android.os.Looper looper) {
        return looper == null ? kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL : looper.getThread().getName();
    }

    @Override // com.google.android.gms.internal.ads.zzrf
    public final com.google.android.gms.internal.ads.zzra zza(com.google.android.gms.internal.ads.zzqy zzqyVar) {
        zzk(zzqyVar);
        com.google.android.gms.internal.ads.zzth zzthVar = this.zzj;
        com.google.android.gms.internal.ads.zzv zzvVar = zzqyVar.zza;
        com.google.android.gms.internal.ads.zzd zzdVar = zzqyVar.zzb;
        com.google.android.gms.internal.ads.zzqs zza = zzthVar.zza(zzvVar, zzdVar);
        com.google.android.gms.internal.ads.zzqz zzqzVar = new com.google.android.gms.internal.ads.zzqz();
        int i = 0;
        if (!java.util.Objects.equals(zzvVar.zzp, "audio/raw") ? this.zzf.zzf(zzvVar, zzdVar) != null : zzvVar.zzJ == 2) {
            i = 2;
        }
        zzqzVar.zzd(i);
        zzqzVar.zza(zza.zzb);
        zzqzVar.zzb(zza.zzc);
        zzqzVar.zzc(zza.zzd);
        return zzqzVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzrf
    public final com.google.android.gms.internal.ads.zzre zzb(com.google.android.gms.internal.ads.zzqy zzqyVar) throws com.google.android.gms.internal.ads.zzqw {
        int i;
        int intValue;
        int i2;
        int i3;
        int i4;
        zzk(zzqyVar);
        com.google.android.gms.internal.ads.zzv zzvVar = zzqyVar.zza;
        java.lang.String str = zzvVar.zzp;
        if (java.util.Objects.equals(str, "audio/raw")) {
            i2 = zzvVar.zzJ;
            com.google.android.gms.internal.ads.zzgtj.zza(com.google.android.gms.internal.ads.zzfl.zzD(i2));
            i = zzvVar.zzI;
            int i5 = zzvVar.zzH;
            intValue = com.google.android.gms.internal.ads.zzfl.zzE(i5);
            i3 = com.google.android.gms.internal.ads.zzfl.zzG(i2) * i5;
            i4 = 0;
        } else {
            i = zzvVar.zzI;
            com.google.android.gms.internal.ads.zzqs zzqsVar = com.google.android.gms.internal.ads.zzqs.zza;
            android.util.Pair zzf = this.zzf.zzf(zzvVar, zzqyVar.zzb);
            if (zzf == null) {
                java.lang.String valueOf = java.lang.String.valueOf(zzvVar);
                java.lang.String.valueOf(valueOf);
                throw new com.google.android.gms.internal.ads.zzqw("Unable to configure passthrough for: ".concat(java.lang.String.valueOf(valueOf)));
            }
            int intValue2 = ((java.lang.Integer) zzf.first).intValue();
            intValue = ((java.lang.Integer) zzf.second).intValue();
            i2 = intValue2;
            i3 = -1;
            i4 = 2;
        }
        int i6 = zzvVar.zzj;
        int i7 = (java.util.Objects.equals(str, "audio/vnd.dts.hd;profile=lbr") && i6 == -1) ? 768000 : i6;
        int i8 = zzqyVar.zzf;
        if (i8 == -1) {
            com.google.android.gms.internal.ads.zzgtj.zzi(android.media.AudioTrack.getMinBufferSize(i, intValue, i2) != -2);
            int i9 = i3 != -1 ? i3 : 1;
            i8 = (((java.lang.Math.max(r0, com.google.android.gms.internal.ads.zztt.zzb(r0, i2, i4, i9, i, i7)) + i9) - 1) / i9) * i9;
        }
        com.google.android.gms.internal.ads.zzrd zzrdVar = new com.google.android.gms.internal.ads.zzrd();
        zzrdVar.zzb(i);
        zzrdVar.zzc(intValue);
        zzrdVar.zza(i2);
        zzrdVar.zze(i8);
        zzrdVar.zzg(zzqyVar.zzd);
        zzrdVar.zzf(zzqyVar.zzb);
        zzrdVar.zzd(false);
        zzrdVar.zzh(zzqyVar.zze);
        return new com.google.android.gms.internal.ads.zzre(zzrdVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzrf
    public final void zzc(com.google.android.gms.internal.ads.zzrc zzrcVar) {
        zzl();
        if (this.zzd == null) {
            this.zzd = new com.google.android.gms.internal.ads.zzef(java.lang.Thread.currentThread());
        }
        this.zzd.zzc(zzrcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrf
    public final void zzd(com.google.android.gms.internal.ads.zzdo zzdoVar) {
        this.zze = zzdoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzrf
    public final void zze() {
        com.google.android.gms.internal.ads.zzef zzefVar = this.zzd;
        if (zzefVar != null) {
            zzefVar.zzg();
        }
        com.google.android.gms.internal.ads.zzqn zzqnVar = this.zzg;
        if (zzqnVar != null) {
            zzqnVar.zze();
        }
    }

    public final com.google.android.gms.internal.ads.zzsy zzf(com.google.android.gms.internal.ads.zzre zzreVar) throws com.google.android.gms.internal.ads.zzrb {
        android.content.Context context;
        try {
            int i = zzreVar.zzg;
            int i2 = zzreVar.zzh;
            android.content.Context context2 = null;
            if (i2 != -1 && (context = this.zza) != null && android.os.Build.VERSION.SDK_INT >= 34) {
                android.content.Context context3 = this.zzi;
                if (context3 == null || context3.getDeviceId() != i2) {
                    this.zzi = context.createDeviceContext(i2);
                }
                context2 = this.zzi;
                i = 0;
            }
            android.media.AudioTrack.Builder sessionId = new android.media.AudioTrack.Builder().setAudioAttributes(zzreVar.zzf.zza()).setAudioFormat(new android.media.AudioFormat.Builder().setSampleRate(zzreVar.zzb).setChannelMask(zzreVar.zzc).setEncoding(zzreVar.zza).build()).setTransferMode(1).setBufferSizeInBytes(zzreVar.zze).setSessionId(i);
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                sessionId.setOffloadedPlayback(false);
            }
            if (android.os.Build.VERSION.SDK_INT >= 34 && context2 != null) {
                sessionId.setContext(context2);
            }
            android.media.AudioTrack build = sessionId.build();
            if (build.getState() == 1) {
                return new com.google.android.gms.internal.ads.zzsy(build, zzreVar, this.zzb, this.zzc, this.zze);
            }
            try {
                build.release();
            } catch (java.lang.Exception unused) {
            }
            throw new com.google.android.gms.internal.ads.zzrb();
        } catch (java.lang.IllegalArgumentException | java.lang.UnsupportedOperationException e) {
            throw new com.google.android.gms.internal.ads.zzrb(e);
        }
    }

    public final com.google.android.gms.internal.ads.zzqh zzg() {
        return this.zzf;
    }

    final void zzh(com.google.android.gms.internal.ads.zzqh zzqhVar) {
        zzl();
        com.google.android.gms.internal.ads.zzqh zzqhVar2 = this.zzf;
        if (zzqhVar2 == null || zzqhVar.equals(zzqhVar2)) {
            return;
        }
        this.zzf = zzqhVar;
        com.google.android.gms.internal.ads.zzef zzefVar = this.zzd;
        if (zzefVar != null) {
            zzefVar.zze(-1, com.google.android.gms.internal.ads.zzsz.zza);
            zzefVar.zzf();
        }
    }

    final /* synthetic */ void zzi(com.google.android.gms.internal.ads.zzqh zzqhVar) {
        this.zzf = zzqhVar;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzqn zzj() {
        return this.zzg;
    }
}
