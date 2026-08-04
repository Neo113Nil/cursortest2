package com.google.android.gms.internal.ads;

import I2.J;
import J2.j;
import android.content.Context;
import android.os.RemoteException;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class zzdfe implements zzcuq, zzdbu {
    private final zzbxi zza;
    private final Context zzb;
    private final zzbxm zzc;
    private final View zzd;
    private String zze;
    private final zzbbd.zza.EnumC0000zza zzf;

    public zzdfe(zzbxi zzbxiVar, Context context, zzbxm zzbxmVar, View view, zzbbd.zza.EnumC0000zza enumC0000zza) {
        this.zza = zzbxiVar;
        this.zzb = context;
        this.zzc = zzbxmVar;
        this.zzd = view;
        this.zzf = enumC0000zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcuq
    public final void zza() {
        this.zza.zzb(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcuq
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzcuq
    public final void zzc() {
        View view = this.zzd;
        if (view != null && this.zze != null) {
            this.zzc.zzo(view.getContext(), this.zze);
        }
        this.zza.zzb(true);
    }

    @Override // com.google.android.gms.internal.ads.zzcuq
    public final void zzdq(zzbva zzbvaVar, String str, String str2) {
        if (this.zzc.zzp(this.zzb)) {
            try {
                zzbxm zzbxmVar = this.zzc;
                Context context = this.zzb;
                zzbxmVar.zzl(context, zzbxmVar.zzb(context), this.zza.zza(), zzbvaVar.zzc(), zzbvaVar.zzb());
            } catch (RemoteException e7) {
                int i7 = J.f3546b;
                j.h("Remote Exception to get reward item.", e7);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcuq
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcuq
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbu
    public final void zzk() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbu
    public final void zzl() {
        if (this.zzf == zzbbd.zza.EnumC0000zza.APP_OPEN) {
            return;
        }
        String strZzd = this.zzc.zzd(this.zzb);
        this.zze = strZzd;
        this.zze = String.valueOf(strZzd).concat(this.zzf == zzbbd.zza.EnumC0000zza.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
    }
}
