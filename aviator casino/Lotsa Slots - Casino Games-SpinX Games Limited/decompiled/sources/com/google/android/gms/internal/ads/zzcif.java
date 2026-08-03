package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcif extends com.google.android.gms.internal.ads.zzcgt implements android.view.TextureView.SurfaceTextureListener, com.google.android.gms.internal.ads.zzchd {
    private final com.google.android.gms.internal.ads.zzchn zzc;
    private final com.google.android.gms.internal.ads.zzcho zzd;
    private final com.google.android.gms.internal.ads.zzchm zze;
    private final com.google.android.gms.internal.ads.zzdzl zzf;
    private com.google.android.gms.internal.ads.zzcgs zzg;
    private android.view.Surface zzh;
    private com.google.android.gms.internal.ads.zzche zzi;
    private java.lang.String zzj;
    private java.lang.String[] zzk;
    private boolean zzl;
    private int zzm;
    private com.google.android.gms.internal.ads.zzchl zzn;
    private final boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private int zzr;
    private int zzs;
    private float zzt;

    public zzcif(android.content.Context context, com.google.android.gms.internal.ads.zzcho zzchoVar, com.google.android.gms.internal.ads.zzchn zzchnVar, boolean z, boolean z2, com.google.android.gms.internal.ads.zzchm zzchmVar, com.google.android.gms.internal.ads.zzdzl zzdzlVar) {
        super(context);
        this.zzm = 1;
        this.zzc = zzchnVar;
        this.zzd = zzchoVar;
        this.zzo = z;
        this.zze = zzchmVar;
        zzchoVar.zza(this);
        this.zzf = zzdzlVar;
    }

    private final boolean zzT() {
        com.google.android.gms.internal.ads.zzche zzcheVar = this.zzi;
        return (zzcheVar == null || !zzcheVar.zzB() || this.zzl) ? false : true;
    }

    private final boolean zzU() {
        return zzT() && this.zzm != 1;
    }

    private final void zzV(boolean z, java.lang.Integer num) {
        com.google.android.gms.internal.ads.zzche zzcheVar = this.zzi;
        if (zzcheVar != null && !z) {
            zzcheVar.zzn(num);
            return;
        }
        if (this.zzj == null || this.zzh == null) {
            return;
        }
        if (z) {
            if (!zzT()) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("No valid ExoPlayerAdapter exists when switch source.");
                return;
            } else {
                zzcheVar.zzw();
                zzW();
            }
        }
        if (this.zzj.startsWith("cache:")) {
            com.google.android.gms.internal.ads.zzcja zzr = this.zzc.zzr(this.zzj);
            if (zzr instanceof com.google.android.gms.internal.ads.zzcjj) {
                com.google.android.gms.internal.ads.zzche zza = ((com.google.android.gms.internal.ads.zzcjj) zzr).zza();
                this.zzi = zza;
                zza.zzn(num);
                if (!this.zzi.zzB()) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Precached video player has been released.");
                    return;
                }
            } else {
                if (!(zzr instanceof com.google.android.gms.internal.ads.zzcjg)) {
                    java.lang.String str = this.zzj;
                    java.lang.String.valueOf(str);
                    java.lang.String valueOf = java.lang.String.valueOf(str);
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Stream cache miss: ".concat(valueOf));
                    return;
                }
                com.google.android.gms.internal.ads.zzcjg zzcjgVar = (com.google.android.gms.internal.ads.zzcjg) zzr;
                java.lang.String zzF = zzF();
                java.nio.ByteBuffer zzu = zzcjgVar.zzu();
                boolean zzt = zzcjgVar.zzt();
                java.lang.String zzs = zzcjgVar.zzs();
                if (zzs == null) {
                    int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Stream cache URL is null.");
                    return;
                } else {
                    com.google.android.gms.internal.ads.zzche zzE = zzE(num);
                    this.zzi = zzE;
                    zzE.zzr(new android.net.Uri[]{android.net.Uri.parse(zzs)}, zzF, zzu, zzt);
                }
            }
        } else {
            this.zzi = zzE(num);
            java.lang.String zzF2 = zzF();
            android.net.Uri[] uriArr = new android.net.Uri[this.zzk.length];
            int i5 = 0;
            while (true) {
                java.lang.String[] strArr = this.zzk;
                if (i5 >= strArr.length) {
                    break;
                }
                uriArr[i5] = android.net.Uri.parse(strArr[i5]);
                i5++;
            }
            this.zzi.zzq(uriArr, zzF2);
        }
        this.zzi.zzs(this);
        zzX(this.zzh, false);
        if (this.zzi.zzB()) {
            int zzC = this.zzi.zzC();
            this.zzm = zzC;
            if (zzC == 3) {
                zzY();
            }
        }
    }

    private final void zzW() {
        if (this.zzi != null) {
            zzX(null, true);
            com.google.android.gms.internal.ads.zzche zzcheVar = this.zzi;
            if (zzcheVar != null) {
                zzcheVar.zzs(null);
                this.zzi.zzt();
                this.zzi = null;
            }
            this.zzm = 1;
            this.zzl = false;
            this.zzp = false;
            this.zzq = false;
        }
    }

    private final void zzX(android.view.Surface surface, boolean z) {
        com.google.android.gms.internal.ads.zzche zzcheVar = this.zzi;
        if (zzcheVar == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Trying to set surface before player is initialized.");
            return;
        }
        try {
            zzcheVar.zzu(surface, z);
        } catch (java.io.IOException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("", e);
        }
    }

    private final void zzY() {
        if (this.zzp) {
            return;
        }
        this.zzp = true;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzchs
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzcif.this.zzH();
            }
        });
        zzq();
        this.zzd.zzb();
        if (this.zzq) {
            zze();
        }
    }

    private static java.lang.String zzZ(java.lang.String str, java.lang.Exception exc) {
        java.lang.String canonicalName = exc.getClass().getCanonicalName();
        java.lang.String message = exc.getMessage();
        int length = java.lang.String.valueOf(canonicalName).length();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 1 + length + 1 + java.lang.String.valueOf(message).length());
        sb.append(str);
        sb.append(com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING);
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        return sb.toString();
    }

    private final void zzaa() {
        zzab(this.zzr, this.zzs);
    }

    private final void zzab(int i, int i2) {
        float f = i2 > 0 ? i / i2 : 1.0f;
        if (this.zzt != f) {
            this.zzt = f;
            requestLayout();
        }
    }

    private final void zzac() {
        com.google.android.gms.internal.ads.zzche zzcheVar = this.zzi;
        if (zzcheVar != null) {
            zzcheVar.zzM(true);
        }
    }

    private final void zzad() {
        com.google.android.gms.internal.ads.zzche zzcheVar = this.zzi;
        if (zzcheVar != null) {
            zzcheVar.zzM(false);
        }
    }

    @Override // android.view.TextureView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = this.zzt;
        if (f != 0.0f && this.zzn == null) {
            float f2 = measuredWidth;
            float f3 = f2 / measuredHeight;
            if (f > f3) {
                measuredHeight = (int) (f2 / f);
            }
            if (f < f3) {
                measuredWidth = (int) (measuredHeight * f);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        com.google.android.gms.internal.ads.zzchl zzchlVar = this.zzn;
        if (zzchlVar != null) {
            zzchlVar.zzc(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i, int i2) {
        com.google.android.gms.internal.ads.zzdzl zzdzlVar;
        if (this.zzo) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzoL)).booleanValue() && (zzdzlVar = this.zzf) != null) {
                com.google.android.gms.internal.ads.zzdzk zza = zzdzlVar.zza();
                zza.zzc("action", "svp_aepv");
                zza.zzd();
            }
            com.google.android.gms.internal.ads.zzchl zzchlVar = new com.google.android.gms.internal.ads.zzchl(getContext());
            this.zzn = zzchlVar;
            zzchlVar.zzb(surfaceTexture, i, i2);
            com.google.android.gms.internal.ads.zzchl zzchlVar2 = this.zzn;
            zzchlVar2.start();
            android.graphics.SurfaceTexture zze = zzchlVar2.zze();
            if (zze != null) {
                surfaceTexture = zze;
            } else {
                this.zzn.zzd();
                this.zzn = null;
            }
        }
        android.view.Surface surface = new android.view.Surface(surfaceTexture);
        this.zzh = surface;
        if (this.zzi == null) {
            zzV(false, null);
        } else {
            zzX(surface, true);
            if (!this.zze.zza) {
                zzac();
            }
        }
        if (this.zzr == 0 || this.zzs == 0) {
            zzab(i, i2);
        } else {
            zzaa();
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzchz
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzcif.this.zzM();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        zzf();
        com.google.android.gms.internal.ads.zzchl zzchlVar = this.zzn;
        if (zzchlVar != null) {
            zzchlVar.zzd();
            this.zzn = null;
        }
        if (this.zzi != null) {
            zzad();
            android.view.Surface surface = this.zzh;
            if (surface != null) {
                surface.release();
            }
            this.zzh = null;
            zzX(null, true);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcib
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzcif.this.zzO();
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, final int i, final int i2) {
        com.google.android.gms.internal.ads.zzchl zzchlVar = this.zzn;
        if (zzchlVar != null) {
            zzchlVar.zzc(i, i2);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcia
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzcif.this.zzN(i, i2);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
        this.zzd.zzd(this);
        this.zza.zzb(surfaceTexture, this.zzg);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 46);
        sb.append("AdExoPlayerView3 window visibility changed to ");
        sb.append(i);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcic
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzcif.this.zzP(i);
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void zzA(int i) {
        com.google.android.gms.internal.ads.zzche zzcheVar = this.zzi;
        if (zzcheVar != null) {
            zzcheVar.zzy(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void zzB(int i) {
        com.google.android.gms.internal.ads.zzche zzcheVar = this.zzi;
        if (zzcheVar != null) {
            zzcheVar.zzz(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void zzC(int i) {
        com.google.android.gms.internal.ads.zzche zzcheVar = this.zzi;
        if (zzcheVar != null) {
            zzcheVar.zzA(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzD() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzchu
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzcif.this.zzS();
            }
        });
    }

    final com.google.android.gms.internal.ads.zzche zzE(java.lang.Integer num) {
        com.google.android.gms.internal.ads.zzchm zzchmVar = this.zze;
        com.google.android.gms.internal.ads.zzchn zzchnVar = this.zzc;
        com.google.android.gms.internal.ads.zzckc zzckcVar = new com.google.android.gms.internal.ads.zzckc(zzchnVar.getContext(), zzchmVar, zzchnVar, num);
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("ExoPlayerAdapter initialized.");
        return zzckcVar;
    }

    final java.lang.String zzF() {
        com.google.android.gms.internal.ads.zzchn zzchnVar = this.zzc;
        return com.google.android.gms.ads.internal.zzt.zzc().zze(zzchnVar.getContext(), zzchnVar.zzs().afmaVersion);
    }

    final /* synthetic */ void zzG() {
        float zzc = this.zzb.zzc();
        com.google.android.gms.internal.ads.zzche zzcheVar = this.zzi;
        if (zzcheVar == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Trying to set volume before player is initialized.");
            return;
        }
        try {
            zzcheVar.zzv(zzc, false);
        } catch (java.io.IOException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("", e);
        }
    }

    final /* synthetic */ void zzH() {
        com.google.android.gms.internal.ads.zzcgs zzcgsVar = this.zzg;
        if (zzcgsVar != null) {
            zzcgsVar.zzb();
        }
    }

    final /* synthetic */ void zzI() {
        com.google.android.gms.internal.ads.zzcgs zzcgsVar = this.zzg;
        if (zzcgsVar != null) {
            zzcgsVar.zze();
        }
    }

    final /* synthetic */ void zzJ(java.lang.String str) {
        com.google.android.gms.internal.ads.zzcgs zzcgsVar = this.zzg;
        if (zzcgsVar != null) {
            zzcgsVar.zzf("ExoPlayerAdapter error", str);
        }
    }

    final /* synthetic */ void zzK() {
        com.google.android.gms.internal.ads.zzcgs zzcgsVar = this.zzg;
        if (zzcgsVar != null) {
            zzcgsVar.zzc();
        }
    }

    final /* synthetic */ void zzL() {
        com.google.android.gms.internal.ads.zzcgs zzcgsVar = this.zzg;
        if (zzcgsVar != null) {
            zzcgsVar.zzd();
        }
    }

    final /* synthetic */ void zzM() {
        com.google.android.gms.internal.ads.zzcgs zzcgsVar = this.zzg;
        if (zzcgsVar != null) {
            zzcgsVar.zza();
        }
    }

    final /* synthetic */ void zzN(int i, int i2) {
        com.google.android.gms.internal.ads.zzcgs zzcgsVar = this.zzg;
        if (zzcgsVar != null) {
            zzcgsVar.zzj(i, i2);
        }
    }

    final /* synthetic */ void zzO() {
        com.google.android.gms.internal.ads.zzcgs zzcgsVar = this.zzg;
        if (zzcgsVar != null) {
            zzcgsVar.zzh();
        }
    }

    final /* synthetic */ void zzP(int i) {
        com.google.android.gms.internal.ads.zzcgs zzcgsVar = this.zzg;
        if (zzcgsVar != null) {
            zzcgsVar.onWindowVisibilityChanged(i);
        }
    }

    final /* synthetic */ void zzQ(boolean z, long j) {
        this.zzc.zzu(z, j);
    }

    final /* synthetic */ void zzR(java.lang.String str) {
        com.google.android.gms.internal.ads.zzcgs zzcgsVar = this.zzg;
        if (zzcgsVar != null) {
            zzcgsVar.zzg("ExoPlayerAdapter exception", str);
        }
    }

    final /* synthetic */ void zzS() {
        com.google.android.gms.internal.ads.zzcgs zzcgsVar = this.zzg;
        if (zzcgsVar != null) {
            zzcgsVar.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final java.lang.String zza() {
        return "ExoPlayer/2".concat(true != this.zzo ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void zzb(com.google.android.gms.internal.ads.zzcgs zzcgsVar) {
        this.zzg = zzcgsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void zzc(java.lang.String str) {
        if (str != null) {
            zzx(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void zzd() {
        if (zzT()) {
            this.zzi.zzw();
            zzW();
        }
        com.google.android.gms.internal.ads.zzcho zzchoVar = this.zzd;
        zzchoVar.zzf();
        this.zzb.zze();
        zzchoVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void zze() {
        if (!zzU()) {
            this.zzq = true;
            return;
        }
        if (this.zze.zza) {
            zzac();
        }
        this.zzi.zzE(true);
        this.zzd.zze();
        this.zzb.zzd();
        this.zza.zza();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzchx
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzcif.this.zzK();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void zzf() {
        if (zzU()) {
            if (this.zze.zza) {
                zzad();
            }
            this.zzi.zzE(false);
            this.zzd.zzf();
            this.zzb.zze();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzchy
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzcif.this.zzL();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final int zzg() {
        if (zzU()) {
            return (int) this.zzi.zzH();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final int zzh() {
        if (zzU()) {
            return (int) this.zzi.zzD();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void zzi(int i) {
        if (zzU()) {
            this.zzi.zzx(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void zzj(float f, float f2) {
        com.google.android.gms.internal.ads.zzchl zzchlVar = this.zzn;
        if (zzchlVar != null) {
            zzchlVar.zzf(f, f2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final int zzk() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final int zzl() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final long zzm() {
        com.google.android.gms.internal.ads.zzche zzcheVar = this.zzi;
        if (zzcheVar != null) {
            return zzcheVar.zzI();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final long zzn() {
        com.google.android.gms.internal.ads.zzche zzcheVar = this.zzi;
        if (zzcheVar != null) {
            return zzcheVar.zzJ();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final long zzo() {
        com.google.android.gms.internal.ads.zzche zzcheVar = this.zzi;
        if (zzcheVar != null) {
            return zzcheVar.zzK();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final int zzp() {
        com.google.android.gms.internal.ads.zzche zzcheVar = this.zzi;
        if (zzcheVar != null) {
            return zzcheVar.zzL();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcgt, com.google.android.gms.internal.ads.zzchq
    public final void zzq() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcie
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzcif.this.zzG();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzr(final boolean z, final long j) {
        if (this.zzc != null) {
            com.google.android.gms.internal.ads.zzcfr.zzf.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcid
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzcif.this.zzQ(z, j);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzs(int i) {
        if (this.zzm != i) {
            this.zzm = i;
            if (i == 3) {
                zzY();
                return;
            }
            if (i != 4) {
                return;
            }
            if (this.zze.zza) {
                zzad();
            }
            this.zzd.zzf();
            this.zzb.zze();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzchv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzcif.this.zzI();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzt(int i, int i2) {
        this.zzr = i;
        this.zzs = i2;
        zzaa();
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzu(java.lang.String str, java.lang.Exception exc) {
        final java.lang.String zzZ = zzZ(str, exc);
        java.lang.String concat = "ExoPlayerAdapter error: ".concat(zzZ);
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(concat);
        this.zzl = true;
        if (this.zze.zza) {
            zzad();
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzchw
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzcif.this.zzJ(zzZ);
            }
        });
        com.google.android.gms.ads.internal.zzt.zzh().zzh(exc, "AdExoPlayerView.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzv(java.lang.String str, java.lang.Exception exc) {
        final java.lang.String zzZ = zzZ("onLoadException", exc);
        java.lang.String concat = "ExoPlayerAdapter exception: ".concat(zzZ);
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(concat);
        com.google.android.gms.ads.internal.zzt.zzh().zzh(exc, "AdExoPlayerView.onException");
        com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcht
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzcif.this.zzR(zzZ);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final java.lang.Integer zzw() {
        com.google.android.gms.internal.ads.zzche zzcheVar = this.zzi;
        if (zzcheVar != null) {
            return zzcheVar.zzj();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void zzy(int i) {
        com.google.android.gms.internal.ads.zzche zzcheVar = this.zzi;
        if (zzcheVar != null) {
            zzcheVar.zzF(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void zzz(int i) {
        com.google.android.gms.internal.ads.zzche zzcheVar = this.zzi;
        if (zzcheVar != null) {
            zzcheVar.zzG(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void zzx(java.lang.String str, java.lang.String[] strArr, java.lang.Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.zzk = new java.lang.String[]{str};
        } else {
            this.zzk = (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length);
        }
        java.lang.String str2 = this.zzj;
        boolean z = false;
        if (this.zze.zzk && str2 != null && !str.equals(str2) && this.zzm == 4) {
            z = true;
        }
        this.zzj = str;
        zzV(z, num);
    }
}
