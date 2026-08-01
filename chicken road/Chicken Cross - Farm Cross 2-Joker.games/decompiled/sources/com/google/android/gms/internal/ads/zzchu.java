package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzchu {
    private final Context zza;
    private final zzcif zzb;
    private final ViewGroup zzc;
    private final zzeaj zzd;
    private zzcht zze;

    public zzchu(Context context, ViewGroup viewGroup, zzclm zzclmVar, zzeaj zzeajVar) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = viewGroup;
        this.zzb = zzclmVar;
        this.zze = null;
        this.zzd = zzeajVar;
    }

    public final Integer zza() {
        zzcht zzchtVar = this.zze;
        if (zzchtVar != null) {
            return zzchtVar.zzl();
        }
        return null;
    }

    public final void zzb(int i, int i2, int i3, int i4) {
        Preconditions.checkMainThread("The underlay may only be modified from the UI thread.");
        zzcht zzchtVar = this.zze;
        if (zzchtVar != null) {
            zzchtVar.zzn(i, i2, i3, i4);
        }
    }

    public final void zzc(int i, int i2, int i3, int i4, int i5, boolean z, zzcie zzcieVar) {
        if (this.zze != null) {
            return;
        }
        zzcif zzcifVar = this.zzb;
        zzbjn.zza(zzcifVar.zzq().zzc(), zzcifVar.zzi(), "vpr2");
        zzcht zzchtVar = new zzcht(this.zza, zzcifVar, i5, z, zzcifVar.zzq().zzc(), zzcieVar, this.zzd);
        this.zze = zzchtVar;
        this.zzc.addView(zzchtVar, 0, new ViewGroup.LayoutParams(-1, -1));
        this.zze.zzn(i, i2, i3, i4);
        zzcifVar.zzdn(false);
    }

    public final zzcht zzd() {
        return this.zze;
    }

    public final void zze() {
        Preconditions.checkMainThread("onPause must be called from the UI thread.");
        zzcht zzchtVar = this.zze;
        if (zzchtVar != null) {
            zzchtVar.zzr();
        }
    }

    public final void zzf() {
        Preconditions.checkMainThread("onDestroy must be called from the UI thread.");
        zzcht zzchtVar = this.zze;
        if (zzchtVar != null) {
            zzchtVar.zzE();
            this.zzc.removeView(this.zze);
            this.zze = null;
        }
    }

    public final void zzg(int i) {
        zzcht zzchtVar = this.zze;
        if (zzchtVar != null) {
            zzchtVar.zzm(i);
        }
    }
}
