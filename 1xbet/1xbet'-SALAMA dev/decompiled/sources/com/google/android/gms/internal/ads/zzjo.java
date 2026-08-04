package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* JADX INFO: loaded from: classes.dex */
final class zzjo implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzabl, zzpq, zzwy, zzto, zzhn, zzhk {
    public static final /* synthetic */ int zzb = 0;
    final /* synthetic */ zzjs zza;

    public /* synthetic */ zzjo(zzjs zzjsVar, zzjr zzjrVar) {
        this.zza = zzjsVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i8) {
        zzjs.zzO(this.zza, surfaceTexture);
        this.zza.zzac(i7, i8);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.zza.zzae(null);
        this.zza.zzac(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i8) {
        this.zza.zzac(i7, i8);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i7, int i8, int i9) {
        this.zza.zzac(i8, i9);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.zza.zzac(0, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzpq
    public final void zza(Exception exc) {
        this.zza.zzr.zzw(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzpq
    public final void zzb(String str, long j, long j3) {
        this.zza.zzr.zzx(str, j, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzpq
    public final void zzc(String str) {
        this.zza.zzr.zzy(str);
    }

    @Override // com.google.android.gms.internal.ads.zzpq
    public final void zzd(zzhq zzhqVar) {
        this.zza.zzr.zzz(zzhqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpq
    public final void zze(zzhq zzhqVar) {
        this.zza.zzr.zzA(zzhqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpq
    public final void zzf(zzz zzzVar, zzhr zzhrVar) {
        this.zza.zzr.zzB(zzzVar, zzhrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpq
    public final void zzg(long j) {
        this.zza.zzr.zzC(j);
    }

    @Override // com.google.android.gms.internal.ads.zzpq
    public final void zzh(Exception exc) {
        this.zza.zzr.zzD(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzpq
    public final void zzi(zzpr zzprVar) {
        this.zza.zzr.zzE(zzprVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpq
    public final void zzj(zzpr zzprVar) {
        this.zza.zzr.zzF(zzprVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpq
    public final void zzk(int i7, long j, long j3) {
        this.zza.zzr.zzG(i7, j, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzl(int i7, long j) {
        this.zza.zzr.zzH(i7, j);
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzm(Object obj, long j) {
        this.zza.zzr.zzI(obj, j);
        zzjs zzjsVar = this.zza;
        if (zzjsVar.zzJ == obj) {
            zzdp zzdpVar = zzjsVar.zzm;
            zzdpVar.zzd(26, new zzdm() { // from class: com.google.android.gms.internal.ads.zzjn
                @Override // com.google.android.gms.internal.ads.zzdm
                public final void zza(Object obj2) {
                }
            });
            zzdpVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpq
    public final void zzn(final boolean z4) {
        zzjs zzjsVar = this.zza;
        if (zzjsVar.zzP == z4) {
            return;
        }
        zzjsVar.zzP = z4;
        zzdp zzdpVar = this.zza.zzm;
        zzdpVar.zzd(23, new zzdm() { // from class: com.google.android.gms.internal.ads.zzjl
            @Override // com.google.android.gms.internal.ads.zzdm
            public final void zza(Object obj) {
                ((zzbe) obj).zzo(z4);
            }
        });
        zzdpVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzo(Exception exc) {
        this.zza.zzr.zzK(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzp(String str, long j, long j3) {
        this.zza.zzr.zzL(str, j, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzq(String str) {
        this.zza.zzr.zzM(str);
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzr(zzhq zzhqVar) {
        this.zza.zzr.zzN(zzhqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzs(zzhq zzhqVar) {
        this.zza.zzr.zzO(zzhqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzt(long j, int i7) {
        this.zza.zzr.zzP(j, i7);
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzu(zzz zzzVar, zzhr zzhrVar) {
        this.zza.zzr.zzQ(zzzVar, zzhrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzv(final zzcc zzccVar) {
        zzdp zzdpVar = this.zza.zzm;
        zzdpVar.zzd(25, new zzdm() { // from class: com.google.android.gms.internal.ads.zzjm
            @Override // com.google.android.gms.internal.ads.zzdm
            public final void zza(Object obj) {
                ((zzbe) obj).zzs(zzccVar);
            }
        });
        zzdpVar.zzc();
    }
}
