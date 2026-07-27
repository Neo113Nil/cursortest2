package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.unity.purchasing.BuildConfig;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzcoa implements zzbay {
    private final Context zza;
    private final zzged zzb;

    zzcoa(Context context, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdI)).intValue();
        int i = intValue != 1 ? (intValue == 2 || intValue != 3) ? 3 : 4 : 2;
        zzgez zze = zzgfa.zze();
        zze.zza(((Float) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdO)).floatValue());
        zzgfa zzgfaVar = (zzgfa) zze.zzbu();
        zzgfb zzi = zzgfc.zzi();
        zzi.zza(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdP)).booleanValue());
        zzi.zzb(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdR)).longValue());
        zzgfc zzgfcVar = (zzgfc) zzi.zzbu();
        zzgeg zzx = zzgei.zzx();
        zzx.zzl(i);
        zzx.zzd(versionInfoParcel.afmaVersion);
        zzx.zzm(3);
        zzx.zza(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdp)).booleanValue());
        zzx.zzb(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdS)).booleanValue());
        zzx.zzc(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdT)).booleanValue());
        zzx.zzj(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdF)).intValue() == -1);
        zzx.zzi(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdH)).intValue());
        zzx.zzg(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdQ)).longValue());
        zzx.zzf(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdG)).intValue());
        zzx.zze(zzgfaVar);
        zzx.zzh(zzgfcVar);
        zzx.zzk(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzew)).booleanValue());
        zzged zza = zzged.zza(context, zzcgj.zza, (zzgei) zzx.zzbu());
        this.zzb = zza;
        zza.zzb();
    }

    public final String zza() {
        int zzh = this.zzb.zzh() - 1;
        return zzh != 1 ? zzh != 2 ? zzh != 3 ? "uns" : "3.0" : "2.0" : BuildConfig.VERSION_NAME;
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final void zzd(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return;
        }
        this.zzb.zzg(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    @Deprecated
    public final void zze(int i, int i2, int i3) {
        com.google.android.gms.ads.internal.client.zzay.zza();
        Context context = this.zza;
        float zzE = com.google.android.gms.ads.internal.util.client.zzf.zzE(context, i);
        com.google.android.gms.ads.internal.client.zzay.zza();
        float zzE2 = com.google.android.gms.ads.internal.util.client.zzf.zzE(context, i2);
        zzged zzgedVar = this.zzb;
        long j = i3;
        MotionEvent obtain = MotionEvent.obtain(0L, j, 0, zzE, zzE2, 0);
        zzgedVar.zzg(obtain);
        obtain.recycle();
        com.google.android.gms.ads.internal.client.zzay.zza();
        float zzE3 = com.google.android.gms.ads.internal.util.client.zzf.zzE(context, i);
        com.google.android.gms.ads.internal.client.zzay.zza();
        MotionEvent obtain2 = MotionEvent.obtain(0L, j, 2, zzE3, com.google.android.gms.ads.internal.util.client.zzf.zzE(context, i2), 0);
        zzgedVar.zzg(obtain2);
        obtain2.recycle();
        com.google.android.gms.ads.internal.client.zzay.zza();
        float zzE4 = com.google.android.gms.ads.internal.util.client.zzf.zzE(context, i);
        com.google.android.gms.ads.internal.client.zzay.zza();
        MotionEvent obtain3 = MotionEvent.obtain(0L, j, 1, zzE4, com.google.android.gms.ads.internal.util.client.zzf.zzE(context, i2), 0);
        zzgedVar.zzg(obtain3);
        obtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final String zzf(Context context, String str, View view, Activity activity) {
        return this.zzb.zze(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final String zzg(Context context, String str, View view) {
        return this.zzb.zze(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final void zzh(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final void zzi(StackTraceElement[] stackTraceElementArr) {
        this.zzb.zzf(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final String zzj(Context context, View view, Activity activity) {
        return this.zzb.zzd(context, null, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final String zzk(Context context) {
        return this.zzb.zzc(context);
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final String zzl(Context context) {
        return this.zzb.zzc(context);
    }
}
