package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzkg implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzaey, zzrz, zzzu, zzwo, zzby, zzex {
    public static final /* synthetic */ int zzb = 0;
    final /* synthetic */ zzlk zza;

    /* synthetic */ zzkg(zzlk zzlkVar, byte[] bArr) {
        Objects.requireNonNull(zzlkVar);
        this.zza = zzlkVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zzlk zzlkVar = this.zza;
        zzlkVar.zzQ(surfaceTexture);
        zzlkVar.zzS(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzlk zzlkVar = this.zza;
        zzlkVar.zzR(null);
        zzlkVar.zzS(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.zza.zzS(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.zza.zzS(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.zza.zzS(0, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzex
    public final void zza(zzfe zzfeVar) {
        this.zza.zzP(zzjn.zzc(zzfeVar, 1003));
    }

    @Override // com.google.android.gms.internal.ads.zzaey
    public final void zzb(zzje zzjeVar) {
        this.zza.zzV().zzN(zzjeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaey
    public final void zzc(String str, long j, long j2) {
        this.zza.zzV().zzO(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzaey
    public final void zzd(zzv zzvVar, zzjf zzjfVar) {
        this.zza.zzV().zzP(zzvVar, zzjfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaey
    public final void zze(int i, long j) {
        this.zza.zzV().zzQ(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzaey
    public final void zzf(final zzbv zzbvVar) {
        zzeb zzebVar = new zzeb() { // from class: com.google.android.gms.internal.ads.zzke
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
                int i = zzkg.zzb;
                ((zzaz) obj).zzt(zzbv.this);
            }
        };
        zzeg zzU = this.zza.zzU();
        zzU.zze(25, zzebVar);
        zzU.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzaey
    public final void zzg(Object obj, long j) {
        zzlk zzlkVar = this.zza;
        zzlkVar.zzV().zzT(obj, j);
        if (zzlkVar.zzab() == obj) {
            zzeg zzU = zzlkVar.zzU();
            zzU.zze(26, zzkf.zza);
            zzU.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaey
    public final void zzh(String str) {
        this.zza.zzV().zzR(str);
    }

    @Override // com.google.android.gms.internal.ads.zzaey
    public final void zzi(zzje zzjeVar) {
        this.zza.zzV().zzS(zzjeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaey
    public final void zzj(long j, int i) {
        this.zza.zzV().zzU(j, i);
    }

    @Override // com.google.android.gms.internal.ads.zzaey
    public final void zzk(Exception exc) {
        this.zza.zzV().zzV(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final void zzl(zzje zzjeVar) {
        this.zza.zzV().zzC(zzjeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final void zzm(String str, long j, long j2) {
        this.zza.zzV().zzD(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final void zzn(zzv zzvVar, zzjf zzjfVar) {
        this.zza.zzV().zzE(zzvVar, zzjfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final void zzo(long j) {
        this.zza.zzV().zzF(j);
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final void zzp(int i, long j, long j2) {
        this.zza.zzV().zzG(i, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final void zzq(String str) {
        this.zza.zzV().zzH(str);
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final void zzr(zzje zzjeVar) {
        this.zza.zzV().zzI(zzjeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final void zzs(final boolean z) {
        zzlk zzlkVar = this.zza;
        if (zzlkVar.zzac() == z) {
            return;
        }
        zzlkVar.zzad(z);
        zzeg zzU = zzlkVar.zzU();
        zzU.zze(23, new zzeb() { // from class: com.google.android.gms.internal.ads.zzkb
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
                int i = zzkg.zzb;
                ((zzaz) obj).zzs(z);
            }
        });
        zzU.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final void zzt(Exception exc) {
        this.zza.zzV().zzJ(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final void zzu(Exception exc) {
        this.zza.zzV().zzK(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final void zzv(zzsc zzscVar) {
        this.zza.zzV().zzL(zzscVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final void zzw(zzsc zzscVar) {
        this.zza.zzV().zzM(zzscVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final void zzx(final int i) {
        this.zza.zzY().zzb(new zzgub() { // from class: com.google.android.gms.internal.ads.zzkc
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ Object apply(Object obj) {
                int i2 = zzkg.zzb;
                return Integer.valueOf(i);
            }
        }, new zzgub() { // from class: com.google.android.gms.internal.ads.zzkd
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ Object apply(Object obj) {
                int i2 = zzkg.zzb;
                return Integer.valueOf(i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final void zzy(zzjc zzjcVar) {
        this.zza.zzZ().zza(zzjcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaey
    public final void zzz(zzjc zzjcVar) {
        this.zza.zzaa().zza(zzjcVar);
    }
}
