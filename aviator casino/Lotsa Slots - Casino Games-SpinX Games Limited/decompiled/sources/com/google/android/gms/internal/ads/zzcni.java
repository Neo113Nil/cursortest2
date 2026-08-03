package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcni implements com.google.android.gms.internal.ads.zzbak {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzgda zzb;

    zzcni(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        int intValue = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdD)).intValue();
        int i = intValue != 1 ? (intValue == 2 || intValue != 3) ? 3 : 4 : 2;
        com.google.android.gms.internal.ads.zzgdw zze = com.google.android.gms.internal.ads.zzgdx.zze();
        zze.zza(((java.lang.Float) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdJ)).floatValue());
        com.google.android.gms.internal.ads.zzgdx zzgdxVar = (com.google.android.gms.internal.ads.zzgdx) zze.zzbu();
        com.google.android.gms.internal.ads.zzgdy zzi = com.google.android.gms.internal.ads.zzgdz.zzi();
        zzi.zza(((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdK)).booleanValue());
        zzi.zzb(((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdM)).longValue());
        com.google.android.gms.internal.ads.zzgdz zzgdzVar = (com.google.android.gms.internal.ads.zzgdz) zzi.zzbu();
        com.google.android.gms.internal.ads.zzgdd zzw = com.google.android.gms.internal.ads.zzgdf.zzw();
        zzw.zzi(i);
        zzw.zzb(versionInfoParcel.afmaVersion);
        zzw.zzj(3);
        zzw.zza(((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdk)).booleanValue());
        zzw.zzh(((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdA)).intValue() == -1);
        zzw.zzg(((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdC)).intValue());
        zzw.zze(((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdL)).longValue());
        zzw.zzd(((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdB)).intValue());
        zzw.zzc(zzgdxVar);
        zzw.zzf(zzgdzVar);
        com.google.android.gms.internal.ads.zzgda zza = com.google.android.gms.internal.ads.zzgda.zza(context, com.google.android.gms.internal.ads.zzcfr.zza, (com.google.android.gms.internal.ads.zzgdf) zzw.zzbu());
        this.zzb = zza;
        zza.zzb();
    }

    public final java.lang.String zza() {
        int zzh = this.zzb.zzh() - 1;
        return zzh != 1 ? zzh != 2 ? zzh != 3 ? "uns" : "3.0" : com.ironsource.M6.k0 : "1.0";
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final void zzd(android.view.MotionEvent motionEvent) {
        if (motionEvent == null) {
            return;
        }
        this.zzb.zzg(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    @java.lang.Deprecated
    public final void zze(int i, int i2, int i3) {
        com.google.android.gms.ads.internal.client.zzay.zza();
        android.content.Context context = this.zza;
        float zzE = com.google.android.gms.ads.internal.util.client.zzf.zzE(context, i);
        com.google.android.gms.ads.internal.client.zzay.zza();
        float zzE2 = com.google.android.gms.ads.internal.util.client.zzf.zzE(context, i2);
        com.google.android.gms.internal.ads.zzgda zzgdaVar = this.zzb;
        long j = i3;
        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(0L, j, 0, zzE, zzE2, 0);
        zzgdaVar.zzg(obtain);
        obtain.recycle();
        com.google.android.gms.ads.internal.client.zzay.zza();
        float zzE3 = com.google.android.gms.ads.internal.util.client.zzf.zzE(context, i);
        com.google.android.gms.ads.internal.client.zzay.zza();
        android.view.MotionEvent obtain2 = android.view.MotionEvent.obtain(0L, j, 2, zzE3, com.google.android.gms.ads.internal.util.client.zzf.zzE(context, i2), 0);
        zzgdaVar.zzg(obtain2);
        obtain2.recycle();
        com.google.android.gms.ads.internal.client.zzay.zza();
        float zzE4 = com.google.android.gms.ads.internal.util.client.zzf.zzE(context, i);
        com.google.android.gms.ads.internal.client.zzay.zza();
        android.view.MotionEvent obtain3 = android.view.MotionEvent.obtain(0L, j, 1, zzE4, com.google.android.gms.ads.internal.util.client.zzf.zzE(context, i2), 0);
        zzgdaVar.zzg(obtain3);
        obtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final java.lang.String zzf(android.content.Context context, java.lang.String str, android.view.View view, android.app.Activity activity) {
        return this.zzb.zze(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final java.lang.String zzg(android.content.Context context, java.lang.String str, android.view.View view) {
        return this.zzb.zze(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final void zzh(android.view.View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final void zzi(java.lang.StackTraceElement[] stackTraceElementArr) {
        this.zzb.zzf(java.util.Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final java.lang.String zzj(android.content.Context context, android.view.View view, android.app.Activity activity) {
        return this.zzb.zzd(context, null, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final java.lang.String zzk(android.content.Context context) {
        return this.zzb.zzc(context);
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final java.lang.String zzl(android.content.Context context) {
        return this.zzb.zzc(context);
    }
}
