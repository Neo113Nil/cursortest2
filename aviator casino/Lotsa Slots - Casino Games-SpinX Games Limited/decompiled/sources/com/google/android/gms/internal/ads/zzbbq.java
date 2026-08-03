package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbbq implements java.lang.Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbbs zzb;

    zzbbq(com.google.android.gms.internal.ads.zzbbs zzbbsVar, int i, boolean z) {
        this.zza = i;
        java.util.Objects.requireNonNull(zzbbsVar);
        this.zzb = zzbbsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.ads.zzaym zzaymVar;
        int i = this.zza;
        com.google.android.gms.internal.ads.zzbbs zzbbsVar = this.zzb;
        if (i > 0) {
            try {
                java.lang.Thread.sleep(i * 1000);
            } catch (java.lang.InterruptedException unused) {
            }
        }
        try {
            android.content.Context context = zzbbsVar.zza;
            zzaymVar = com.google.android.gms.internal.ads.zzfxn.zza(context, context.getPackageName(), java.lang.Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
        } catch (java.lang.Throwable unused2) {
            zzaymVar = null;
        }
        com.google.android.gms.internal.ads.zzbbs zzbbsVar2 = this.zzb;
        zzbbsVar2.zzs(zzaymVar);
        int i2 = this.zza;
        if (i2 < 4) {
            if (zzaymVar != null && zzaymVar.zza() && !zzaymVar.zzb().equals("0000000000000000000000000000000000000000000000000000000000000000") && zzaymVar.zzg() && zzaymVar.zzh().zza() && zzaymVar.zzh().zzb() != -2) {
                return;
            }
            zzbbsVar2.zzp(i2 + 1, true);
        }
    }
}
