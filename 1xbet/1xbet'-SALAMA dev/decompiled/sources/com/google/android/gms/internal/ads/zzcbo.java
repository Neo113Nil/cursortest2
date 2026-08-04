package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import I2.P;
import J2.j;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzcbo extends zzcac implements TextureView.SurfaceTextureListener, zzcam {
    private final zzcaw zzc;
    private final zzcax zzd;
    private final zzcav zze;
    private final zzdqq zzf;
    private zzcab zzg;
    private Surface zzh;
    private zzcan zzi;
    private String zzj;
    private String[] zzk;
    private boolean zzl;
    private int zzm;
    private zzcau zzn;
    private final boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private int zzr;
    private int zzs;
    private float zzt;

    public zzcbo(Context context, zzcax zzcaxVar, zzcaw zzcawVar, boolean z4, boolean z7, zzcav zzcavVar, zzdqq zzdqqVar) {
        super(context);
        this.zzm = 1;
        this.zzc = zzcawVar;
        this.zzd = zzcaxVar;
        this.zzo = z4;
        this.zze = zzcavVar;
        zzcaxVar.zza(this);
        this.zzf = zzdqqVar;
    }

    public static /* synthetic */ void zzG(zzcbo zzcboVar) {
        zzcab zzcabVar = zzcboVar.zzg;
        if (zzcabVar != null) {
            zzcabVar.zzi();
        }
    }

    public static /* synthetic */ void zzH(zzcbo zzcboVar, int i7) {
        zzcab zzcabVar = zzcboVar.zzg;
        if (zzcabVar != null) {
            zzcabVar.onWindowVisibilityChanged(i7);
        }
    }

    public static /* synthetic */ void zzI(zzcbo zzcboVar, String str) {
        zzcab zzcabVar = zzcboVar.zzg;
        if (zzcabVar != null) {
            zzcabVar.zzb("ExoPlayerAdapter error", str);
        }
    }

    public static /* synthetic */ void zzJ(zzcbo zzcboVar) {
        zzcab zzcabVar = zzcboVar.zzg;
        if (zzcabVar != null) {
            zzcabVar.zze();
        }
    }

    public static /* synthetic */ void zzK(zzcbo zzcboVar) {
        zzcab zzcabVar = zzcboVar.zzg;
        if (zzcabVar != null) {
            zzcabVar.zza();
        }
    }

    public static /* synthetic */ void zzL(zzcbo zzcboVar) {
        zzcab zzcabVar = zzcboVar.zzg;
        if (zzcabVar != null) {
            zzcabVar.zzh();
        }
    }

    public static /* synthetic */ void zzM(zzcbo zzcboVar) {
        float fZza = zzcboVar.zzb.zza();
        zzcan zzcanVar = zzcboVar.zzi;
        if (zzcanVar == null) {
            int i7 = J.f3546b;
            j.g("Trying to set volume before player is initialized.");
            return;
        }
        try {
            zzcanVar.zzT(fZza, false);
        } catch (IOException e7) {
            int i8 = J.f3546b;
            j.h("", e7);
        }
    }

    public static /* synthetic */ void zzN(zzcbo zzcboVar) {
        zzcab zzcabVar = zzcboVar.zzg;
        if (zzcabVar != null) {
            zzcabVar.zzd();
        }
    }

    public static /* synthetic */ void zzO(zzcbo zzcboVar, int i7, int i8) {
        zzcab zzcabVar = zzcboVar.zzg;
        if (zzcabVar != null) {
            zzcabVar.zzj(i7, i8);
        }
    }

    public static /* synthetic */ void zzP(zzcbo zzcboVar) {
        zzcab zzcabVar = zzcboVar.zzg;
        if (zzcabVar != null) {
            zzcabVar.zzf();
        }
    }

    public static /* synthetic */ void zzQ(zzcbo zzcboVar, String str) {
        zzcab zzcabVar = zzcboVar.zzg;
        if (zzcabVar != null) {
            zzcabVar.zzc("ExoPlayerAdapter exception", str);
        }
    }

    public static /* synthetic */ void zzS(zzcbo zzcboVar) {
        zzcab zzcabVar = zzcboVar.zzg;
        if (zzcabVar != null) {
            zzcabVar.zzg();
        }
    }

    private static String zzT(String str, Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    private final void zzU() {
        zzcan zzcanVar = this.zzi;
        if (zzcanVar != null) {
            zzcanVar.zzQ(true);
        }
    }

    private final void zzV() {
        if (this.zzp) {
            return;
        }
        this.zzp = true;
        P.f3579l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbn
            @Override // java.lang.Runnable
            public final void run() {
                zzcbo.zzP(this.zza);
            }
        });
        zzn();
        this.zzd.zzb();
        if (this.zzq) {
            zzp();
        }
    }

    private final void zzW(boolean z4, Integer num) {
        zzcan zzcanVar = this.zzi;
        if (zzcanVar != null && !z4) {
            zzcanVar.zzP(num);
            return;
        }
        if (this.zzj == null || this.zzh == null) {
            return;
        }
        if (z4) {
            if (!zzad()) {
                int i7 = J.f3546b;
                j.g("No valid ExoPlayerAdapter exists when switch source.");
                return;
            } else {
                zzcanVar.zzU();
                zzY();
            }
        }
        if (this.zzj.startsWith("cache:")) {
            zzcci zzcciVarZzo = this.zzc.zzo(this.zzj);
            if (zzcciVarZzo instanceof zzccr) {
                zzcan zzcanVarZza = ((zzccr) zzcciVarZzo).zza();
                this.zzi = zzcanVarZza;
                zzcanVarZza.zzP(num);
                if (!this.zzi.zzV()) {
                    int i8 = J.f3546b;
                    j.g("Precached video player has been released.");
                    return;
                }
            } else {
                if (!(zzcciVarZzo instanceof zzcco)) {
                    String strValueOf = String.valueOf(this.zzj);
                    int i9 = J.f3546b;
                    j.g("Stream cache miss: ".concat(strValueOf));
                    return;
                }
                zzcco zzccoVar = (zzcco) zzcciVarZzo;
                String strZzF = zzF();
                ByteBuffer byteBufferZzl = zzccoVar.zzl();
                boolean zZzm = zzccoVar.zzm();
                String strZzk = zzccoVar.zzk();
                if (strZzk == null) {
                    int i10 = J.f3546b;
                    j.g("Stream cache URL is null.");
                    return;
                } else {
                    zzcan zzcanVarZzE = zzE(num);
                    this.zzi = zzcanVarZzE;
                    zzcanVarZzE.zzG(new Uri[]{Uri.parse(strZzk)}, strZzF, byteBufferZzl, zZzm);
                }
            }
        } else {
            this.zzi = zzE(num);
            String strZzF2 = zzF();
            Uri[] uriArr = new Uri[this.zzk.length];
            int i11 = 0;
            while (true) {
                String[] strArr = this.zzk;
                if (i11 >= strArr.length) {
                    break;
                }
                uriArr[i11] = Uri.parse(strArr[i11]);
                i11++;
            }
            this.zzi.zzF(uriArr, strZzF2);
        }
        this.zzi.zzL(this);
        zzZ(this.zzh, false);
        if (this.zzi.zzV()) {
            int iZzt = this.zzi.zzt();
            this.zzm = iZzt;
            if (iZzt == 3) {
                zzV();
            }
        }
    }

    private final void zzX() {
        zzcan zzcanVar = this.zzi;
        if (zzcanVar != null) {
            zzcanVar.zzQ(false);
        }
    }

    private final void zzY() {
        if (this.zzi != null) {
            zzZ(null, true);
            zzcan zzcanVar = this.zzi;
            if (zzcanVar != null) {
                zzcanVar.zzL(null);
                this.zzi.zzH();
                this.zzi = null;
            }
            this.zzm = 1;
            this.zzl = false;
            this.zzp = false;
            this.zzq = false;
        }
    }

    private final void zzZ(Surface surface, boolean z4) {
        zzcan zzcanVar = this.zzi;
        if (zzcanVar == null) {
            int i7 = J.f3546b;
            j.g("Trying to set surface before player is initialized.");
            return;
        }
        try {
            zzcanVar.zzS(surface, z4);
        } catch (IOException e7) {
            int i8 = J.f3546b;
            j.h("", e7);
        }
    }

    private final void zzaa() {
        zzab(this.zzr, this.zzs);
    }

    private final void zzab(int i7, int i8) {
        float f7 = i8 > 0 ? i7 / i8 : 1.0f;
        if (this.zzt != f7) {
            this.zzt = f7;
            requestLayout();
        }
    }

    private final boolean zzac() {
        return zzad() && this.zzm != 1;
    }

    private final boolean zzad() {
        zzcan zzcanVar = this.zzi;
        return (zzcanVar == null || !zzcanVar.zzV() || this.zzl) ? false : true;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f7 = this.zzt;
        if (f7 != 0.0f && this.zzn == null) {
            float f8 = measuredWidth;
            float f9 = f8 / measuredHeight;
            if (f7 > f9) {
                measuredHeight = (int) (f8 / f7);
            }
            if (f7 < f9) {
                measuredWidth = (int) (measuredHeight * f7);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        zzcau zzcauVar = this.zzn;
        if (zzcauVar != null) {
            zzcauVar.zzc(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i8) {
        zzdqq zzdqqVar;
        if (this.zzo) {
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zznh)).booleanValue() && (zzdqqVar = this.zzf) != null) {
                zzdqp zzdqpVarZza = zzdqqVar.zza();
                zzdqpVarZza.zzb("action", "svp_aepv");
                zzdqpVarZza.zzj();
            }
            zzcau zzcauVar = new zzcau(getContext());
            this.zzn = zzcauVar;
            zzcauVar.zzd(surfaceTexture, i7, i8);
            zzcau zzcauVar2 = this.zzn;
            zzcauVar2.start();
            SurfaceTexture surfaceTextureZzb = zzcauVar2.zzb();
            if (surfaceTextureZzb != null) {
                surfaceTexture = surfaceTextureZzb;
            } else {
                this.zzn.zze();
                this.zzn = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.zzh = surface;
        if (this.zzi == null) {
            zzW(false, null);
        } else {
            zzZ(surface, true);
            if (!this.zze.zza) {
                zzU();
            }
        }
        if (this.zzr == 0 || this.zzs == 0) {
            zzab(i7, i8);
        } else {
            zzaa();
        }
        P.f3579l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbk
            @Override // java.lang.Runnable
            public final void run() {
                zzcbo.zzL(this.zza);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzo();
        zzcau zzcauVar = this.zzn;
        if (zzcauVar != null) {
            zzcauVar.zze();
            this.zzn = null;
        }
        if (this.zzi != null) {
            zzX();
            Surface surface = this.zzh;
            if (surface != null) {
                surface.release();
            }
            this.zzh = null;
            zzZ(null, true);
        }
        P.f3579l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbg
            @Override // java.lang.Runnable
            public final void run() {
                zzcbo.zzG(this.zza);
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i7, final int i8) {
        zzcau zzcauVar = this.zzn;
        if (zzcauVar != null) {
            zzcauVar.zzc(i7, i8);
        }
        P.f3579l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbf
            @Override // java.lang.Runnable
            public final void run() {
                zzcbo.zzO(this.zza, i7, i8);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzd.zzf(this);
        this.zza.zza(surfaceTexture, this.zzg);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(final int i7) {
        J.k("AdExoPlayerView3 window visibility changed to " + i7);
        P.f3579l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbe
            @Override // java.lang.Runnable
            public final void run() {
                zzcbo.zzH(this.zza, i7);
            }
        });
        super.onWindowVisibilityChanged(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final void zzA(int i7) {
        zzcan zzcanVar = this.zzi;
        if (zzcanVar != null) {
            zzcanVar.zzN(i7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final void zzB(int i7) {
        zzcan zzcanVar = this.zzi;
        if (zzcanVar != null) {
            zzcanVar.zzR(i7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final void zzC(String str, String[] strArr, Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.zzk = new String[]{str};
        } else {
            this.zzk = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.zzj;
        boolean z4 = false;
        if (this.zze.zzk && str2 != null && !str.equals(str2) && this.zzm == 4) {
            z4 = true;
        }
        this.zzj = str;
        zzW(z4, num);
    }

    @Override // com.google.android.gms.internal.ads.zzcam
    public final void zzD(int i7, int i8) {
        this.zzr = i7;
        this.zzs = i8;
        zzaa();
    }

    public final zzcan zzE(Integer num) {
        zzcav zzcavVar = this.zze;
        zzcaw zzcawVar = this.zzc;
        zzcdj zzcdjVar = new zzcdj(zzcawVar.getContext(), zzcavVar, zzcawVar, num);
        int i7 = J.f3546b;
        j.f("ExoPlayerAdapter initialized.");
        return zzcdjVar;
    }

    public final String zzF() {
        zzcaw zzcawVar = this.zzc;
        return o.f1952C.f1957c.x(zzcawVar.getContext(), zzcawVar.zzm().f10834a);
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final int zza() {
        if (zzac()) {
            return (int) this.zzi.zzy();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final int zzb() {
        zzcan zzcanVar = this.zzi;
        if (zzcanVar != null) {
            return zzcanVar.zzr();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final int zzc() {
        if (zzac()) {
            return (int) this.zzi.zzz();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final int zzd() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final int zze() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final long zzf() {
        zzcan zzcanVar = this.zzi;
        if (zzcanVar != null) {
            return zzcanVar.zzx();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final long zzg() {
        zzcan zzcanVar = this.zzi;
        if (zzcanVar != null) {
            return zzcanVar.zzA();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final long zzh() {
        zzcan zzcanVar = this.zzi;
        if (zzcanVar != null) {
            return zzcanVar.zzB();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcam
    public final void zzi(final boolean z4, final long j) {
        if (this.zzc != null) {
            zzbza.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbh
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzc.zzv(z4, j);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final String zzj() {
        return "ExoPlayer/2".concat(true != this.zzo ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.zzcam
    public final void zzk(String str, Exception exc) {
        final String strZzT = zzT(str, exc);
        String strConcat = "ExoPlayerAdapter error: ".concat(strZzT);
        int i7 = J.f3546b;
        j.g(strConcat);
        this.zzl = true;
        if (this.zze.zza) {
            zzX();
        }
        P.f3579l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbl
            @Override // java.lang.Runnable
            public final void run() {
                zzcbo.zzI(this.zza, strZzT);
            }
        });
        o.f1952C.f1961g.zzv(exc, "AdExoPlayerView.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcam
    public final void zzl(String str, Exception exc) {
        final String strZzT = zzT("onLoadException", exc);
        String strConcat = "ExoPlayerAdapter exception: ".concat(strZzT);
        int i7 = J.f3546b;
        j.g(strConcat);
        o.f1952C.f1961g.zzv(exc, "AdExoPlayerView.onException");
        P.f3579l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbi
            @Override // java.lang.Runnable
            public final void run() {
                zzcbo.zzQ(this.zza, strZzT);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcam
    public final void zzm(int i7) {
        if (this.zzm != i7) {
            this.zzm = i7;
            if (i7 == 3) {
                zzV();
                return;
            }
            if (i7 != 4) {
                return;
            }
            if (this.zze.zza) {
                zzX();
            }
            this.zzd.zze();
            this.zzb.zzc();
            P.f3579l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbm
                @Override // java.lang.Runnable
                public final void run() {
                    zzcbo.zzK(this.zza);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcac, com.google.android.gms.internal.ads.zzcaz
    public final void zzn() {
        P.f3579l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbd
            @Override // java.lang.Runnable
            public final void run() {
                zzcbo.zzM(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final void zzo() {
        if (zzac()) {
            if (this.zze.zza) {
                zzX();
            }
            this.zzi.zzO(false);
            this.zzd.zze();
            this.zzb.zzc();
            P.f3579l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbj
                @Override // java.lang.Runnable
                public final void run() {
                    zzcbo.zzN(this.zza);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final void zzp() {
        if (!zzac()) {
            this.zzq = true;
            return;
        }
        if (this.zze.zza) {
            zzU();
        }
        this.zzi.zzO(true);
        this.zzd.zzc();
        this.zzb.zzb();
        this.zza.zzb();
        P.f3579l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbc
            @Override // java.lang.Runnable
            public final void run() {
                zzcbo.zzJ(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final void zzq(int i7) {
        if (zzac()) {
            this.zzi.zzI(i7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final void zzr(zzcab zzcabVar) {
        this.zzg = zzcabVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final void zzs(String str) {
        if (str != null) {
            zzC(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final void zzt() {
        if (zzad()) {
            this.zzi.zzU();
            zzY();
        }
        this.zzd.zze();
        this.zzb.zzc();
        this.zzd.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final void zzu(float f7, float f8) {
        zzcau zzcauVar = this.zzn;
        if (zzcauVar != null) {
            zzcauVar.zzf(f7, f8);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcam
    public final void zzv() {
        P.f3579l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbb
            @Override // java.lang.Runnable
            public final void run() {
                zzcbo.zzS(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final Integer zzw() {
        zzcan zzcanVar = this.zzi;
        if (zzcanVar != null) {
            return zzcanVar.zzC();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final void zzx(int i7) {
        zzcan zzcanVar = this.zzi;
        if (zzcanVar != null) {
            zzcanVar.zzJ(i7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final void zzy(int i7) {
        zzcan zzcanVar = this.zzi;
        if (zzcanVar != null) {
            zzcanVar.zzK(i7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final void zzz(int i7) {
        zzcan zzcanVar = this.zzi;
        if (zzcanVar != null) {
            zzcanVar.zzM(i7);
        }
    }
}
