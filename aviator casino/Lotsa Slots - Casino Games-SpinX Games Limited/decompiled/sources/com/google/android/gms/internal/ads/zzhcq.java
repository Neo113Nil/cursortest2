package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzhcq implements java.lang.Runnable {
    com.google.android.gms.internal.ads.zzhcs zza;

    zzhcq(com.google.android.gms.internal.ads.zzhcs zzhcsVar) {
        this.zza = zzhcsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.common.util.concurrent.ListenableFuture zzf;
        com.google.android.gms.internal.ads.zzhcs zzhcsVar = this.zza;
        if (zzhcsVar == null || (zzf = zzhcsVar.zzf()) == null) {
            return;
        }
        this.zza = null;
        if (zzf.isDone()) {
            zzhcsVar.zzk(zzf);
            return;
        }
        try {
            java.util.concurrent.ScheduledFuture zzx = zzhcsVar.zzx();
            zzhcsVar.zzy(null);
            java.lang.String str = "Timed out";
            if (zzx != null) {
                try {
                    long abs = java.lang.Math.abs(zzx.getDelay(java.util.concurrent.TimeUnit.MILLISECONDS));
                    if (abs > 10) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(abs).length() + 55);
                        sb.append("Timed out (timeout delayed by ");
                        sb.append(abs);
                        sb.append(" ms after scheduled time)");
                        str = sb.toString();
                    }
                } catch (java.lang.Throwable th) {
                    zzhcsVar.zzb(new com.google.android.gms.internal.ads.zzhcr(str, null));
                    throw th;
                }
            }
            java.lang.String obj = zzf.toString();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(str.length() + 2 + obj.length());
            sb2.append(str);
            sb2.append(": ");
            sb2.append(obj);
            zzhcsVar.zzb(new com.google.android.gms.internal.ads.zzhcr(sb2.toString(), null));
        } finally {
            zzf.cancel(true);
        }
    }
}
