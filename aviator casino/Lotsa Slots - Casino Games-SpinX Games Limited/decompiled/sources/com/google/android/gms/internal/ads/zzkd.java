package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzkd implements android.view.SurfaceHolder.Callback, android.view.TextureView.SurfaceTextureListener, com.google.android.gms.internal.ads.zzaep, com.google.android.gms.internal.ads.zzrv, com.google.android.gms.internal.ads.zzzq, com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzby, com.google.android.gms.internal.ads.zzew {
    public static final /* synthetic */ int zzb = 0;
    final /* synthetic */ com.google.android.gms.internal.ads.zzlh zza;

    /* synthetic */ zzkd(com.google.android.gms.internal.ads.zzlh zzlhVar, byte[] bArr) {
        java.util.Objects.requireNonNull(zzlhVar);
        this.zza = zzlhVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i, int i2) {
        com.google.android.gms.internal.ads.zzlh zzlhVar = this.zza;
        zzlhVar.zzQ(surfaceTexture);
        zzlhVar.zzS(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        com.google.android.gms.internal.ads.zzlh zzlhVar = this.zza;
        zzlhVar.zzR(null);
        zzlhVar.zzS(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i, int i2) {
        this.zza.zzS(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.zza.zzS(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        this.zza.zzS(0, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzew
    public final void zza(com.google.android.gms.internal.ads.zzfd zzfdVar) {
        this.zza.zzP(com.google.android.gms.internal.ads.zzjk.zzc(zzfdVar, 1003));
    }

    @Override // com.google.android.gms.internal.ads.zzaep
    public final void zzb(com.google.android.gms.internal.ads.zzjb zzjbVar) {
        this.zza.zzV().zzN(zzjbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaep
    public final void zzc(java.lang.String str, long j, long j2) {
        this.zza.zzV().zzO(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzaep
    public final void zzd(com.google.android.gms.internal.ads.zzv zzvVar, com.google.android.gms.internal.ads.zzjc zzjcVar) {
        this.zza.zzV().zzP(zzvVar, zzjcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaep
    public final void zze(int i, long j) {
        this.zza.zzV().zzQ(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzaep
    public final void zzf(final com.google.android.gms.internal.ads.zzbv zzbvVar) {
        com.google.android.gms.internal.ads.zzea zzeaVar = new com.google.android.gms.internal.ads.zzea() { // from class: com.google.android.gms.internal.ads.zzkb
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj) {
                int i = com.google.android.gms.internal.ads.zzkd.zzb;
                ((com.google.android.gms.internal.ads.zzaz) obj).zzt(com.google.android.gms.internal.ads.zzbv.this);
            }
        };
        com.google.android.gms.internal.ads.zzef zzU = this.zza.zzU();
        zzU.zze(25, zzeaVar);
        zzU.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzaep
    public final void zzg(java.lang.Object obj, long j) {
        com.google.android.gms.internal.ads.zzlh zzlhVar = this.zza;
        zzlhVar.zzV().zzT(obj, j);
        if (zzlhVar.zzab() == obj) {
            com.google.android.gms.internal.ads.zzef zzU = zzlhVar.zzU();
            zzU.zze(26, com.google.android.gms.internal.ads.zzkc.zza);
            zzU.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaep
    public final void zzh(java.lang.String str) {
        this.zza.zzV().zzR(str);
    }

    @Override // com.google.android.gms.internal.ads.zzaep
    public final void zzi(com.google.android.gms.internal.ads.zzjb zzjbVar) {
        this.zza.zzV().zzS(zzjbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaep
    public final void zzj(long j, int i) {
        this.zza.zzV().zzU(j, i);
    }

    @Override // com.google.android.gms.internal.ads.zzaep
    public final void zzk(java.lang.Exception exc) {
        this.zza.zzV().zzV(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    public final void zzl(com.google.android.gms.internal.ads.zzjb zzjbVar) {
        this.zza.zzV().zzC(zzjbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    public final void zzm(java.lang.String str, long j, long j2) {
        this.zza.zzV().zzD(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    public final void zzn(com.google.android.gms.internal.ads.zzv zzvVar, com.google.android.gms.internal.ads.zzjc zzjcVar) {
        this.zza.zzV().zzE(zzvVar, zzjcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    public final void zzo(long j) {
        this.zza.zzV().zzF(j);
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    public final void zzp(int i, long j, long j2) {
        this.zza.zzV().zzG(i, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    public final void zzq(java.lang.String str) {
        this.zza.zzV().zzH(str);
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    public final void zzr(com.google.android.gms.internal.ads.zzjb zzjbVar) {
        this.zza.zzV().zzI(zzjbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    public final void zzs(final boolean z) {
        com.google.android.gms.internal.ads.zzlh zzlhVar = this.zza;
        if (zzlhVar.zzac() == z) {
            return;
        }
        zzlhVar.zzad(z);
        com.google.android.gms.internal.ads.zzef zzU = zzlhVar.zzU();
        zzU.zze(23, new com.google.android.gms.internal.ads.zzea() { // from class: com.google.android.gms.internal.ads.zzjy
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(java.lang.Object obj) {
                int i = com.google.android.gms.internal.ads.zzkd.zzb;
                ((com.google.android.gms.internal.ads.zzaz) obj).zzs(z);
            }
        });
        zzU.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    public final void zzt(java.lang.Exception exc) {
        this.zza.zzV().zzJ(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    public final void zzu(java.lang.Exception exc) {
        this.zza.zzV().zzK(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    public final void zzv(com.google.android.gms.internal.ads.zzry zzryVar) {
        this.zza.zzV().zzL(zzryVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    public final void zzw(com.google.android.gms.internal.ads.zzry zzryVar) {
        this.zza.zzV().zzM(zzryVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    public final void zzx(final int i) {
        this.zza.zzY().zzb(new com.google.android.gms.internal.ads.zzgta() { // from class: com.google.android.gms.internal.ads.zzjz
            @Override // com.google.android.gms.internal.ads.zzgta
            public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                int i2 = com.google.android.gms.internal.ads.zzkd.zzb;
                return java.lang.Integer.valueOf(i);
            }
        }, new com.google.android.gms.internal.ads.zzgta() { // from class: com.google.android.gms.internal.ads.zzka
            @Override // com.google.android.gms.internal.ads.zzgta
            public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                int i2 = com.google.android.gms.internal.ads.zzkd.zzb;
                return java.lang.Integer.valueOf(i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    public final void zzy(com.google.android.gms.internal.ads.zziz zzizVar) {
        this.zza.zzZ().zza(zzizVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaep
    public final void zzz(com.google.android.gms.internal.ads.zziz zzizVar) {
        this.zza.zzaa().zza(zzizVar);
    }
}
