package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* loaded from: classes.dex */
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
        zzly zzlyVar;
        zzlyVar = this.zza.zzr;
        zzlyVar.zzw(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzpq
    public final void zzb(String str, long j, long j3) {
        zzly zzlyVar;
        zzlyVar = this.zza.zzr;
        zzlyVar.zzx(str, j, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzpq
    public final void zzc(String str) {
        zzly zzlyVar;
        zzlyVar = this.zza.zzr;
        zzlyVar.zzy(str);
    }

    @Override // com.google.android.gms.internal.ads.zzpq
    public final void zzd(zzhq zzhqVar) {
        zzly zzlyVar;
        zzlyVar = this.zza.zzr;
        zzlyVar.zzz(zzhqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpq
    public final void zze(zzhq zzhqVar) {
        zzly zzlyVar;
        zzlyVar = this.zza.zzr;
        zzlyVar.zzA(zzhqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpq
    public final void zzf(zzz zzzVar, zzhr zzhrVar) {
        zzly zzlyVar;
        zzlyVar = this.zza.zzr;
        zzlyVar.zzB(zzzVar, zzhrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpq
    public final void zzg(long j) {
        zzly zzlyVar;
        zzlyVar = this.zza.zzr;
        zzlyVar.zzC(j);
    }

    @Override // com.google.android.gms.internal.ads.zzpq
    public final void zzh(Exception exc) {
        zzly zzlyVar;
        zzlyVar = this.zza.zzr;
        zzlyVar.zzD(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzpq
    public final void zzi(zzpr zzprVar) {
        zzly zzlyVar;
        zzlyVar = this.zza.zzr;
        zzlyVar.zzE(zzprVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpq
    public final void zzj(zzpr zzprVar) {
        zzly zzlyVar;
        zzlyVar = this.zza.zzr;
        zzlyVar.zzF(zzprVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpq
    public final void zzk(int i7, long j, long j3) {
        zzly zzlyVar;
        zzlyVar = this.zza.zzr;
        zzlyVar.zzG(i7, j, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzl(int i7, long j) {
        zzly zzlyVar;
        zzlyVar = this.zza.zzr;
        zzlyVar.zzH(i7, j);
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzm(Object obj, long j) {
        zzly zzlyVar;
        Object obj2;
        zzdp zzdpVar;
        zzlyVar = this.zza.zzr;
        zzlyVar.zzI(obj, j);
        zzjs zzjsVar = this.zza;
        obj2 = zzjsVar.zzJ;
        if (obj2 == obj) {
            zzdpVar = zzjsVar.zzm;
            zzdpVar.zzd(26, new zzdm() { // from class: com.google.android.gms.internal.ads.zzjn
                @Override // com.google.android.gms.internal.ads.zzdm
                public final void zza(Object obj3) {
                }
            });
            zzdpVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpq
    public final void zzn(final boolean z4) {
        boolean z7;
        zzdp zzdpVar;
        zzjs zzjsVar = this.zza;
        z7 = zzjsVar.zzP;
        if (z7 == z4) {
            return;
        }
        zzjsVar.zzP = z4;
        zzdpVar = this.zza.zzm;
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
        zzly zzlyVar;
        zzlyVar = this.zza.zzr;
        zzlyVar.zzK(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzp(String str, long j, long j3) {
        zzly zzlyVar;
        zzlyVar = this.zza.zzr;
        zzlyVar.zzL(str, j, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzq(String str) {
        zzly zzlyVar;
        zzlyVar = this.zza.zzr;
        zzlyVar.zzM(str);
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzr(zzhq zzhqVar) {
        zzly zzlyVar;
        zzlyVar = this.zza.zzr;
        zzlyVar.zzN(zzhqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzs(zzhq zzhqVar) {
        zzly zzlyVar;
        zzlyVar = this.zza.zzr;
        zzlyVar.zzO(zzhqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzt(long j, int i7) {
        zzly zzlyVar;
        zzlyVar = this.zza.zzr;
        zzlyVar.zzP(j, i7);
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzu(zzz zzzVar, zzhr zzhrVar) {
        zzly zzlyVar;
        zzlyVar = this.zza.zzr;
        zzlyVar.zzQ(zzzVar, zzhrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zzv(final zzcc zzccVar) {
        zzdp zzdpVar;
        zzdpVar = this.zza.zzm;
        zzdpVar.zzd(25, new zzdm() { // from class: com.google.android.gms.internal.ads.zzjm
            @Override // com.google.android.gms.internal.ads.zzdm
            public final void zza(Object obj) {
                ((zzbe) obj).zzs(zzcc.this);
            }
        });
        zzdpVar.zzc();
    }
}
