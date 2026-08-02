package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzhs implements Runnable {
    private final /* synthetic */ zzhm zzaps;
    private final /* synthetic */ long zzapv;

    zzhs(zzhm zzhmVar, long j) {
        this.zzaps = zzhmVar;
        this.zzapv = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzhm zzhmVar = this.zzaps;
        long j = this.zzapv;
        zzhmVar.zzab();
        zzhmVar.zzfv();
        zzhmVar.zzch();
        zzhmVar.zzgi().zzjb().log("Resetting analytics data (FE)");
        zzhmVar.zzgd().zzkv();
        if (zzhmVar.zzgk().zzbd(zzhmVar.zzfz().zzah())) {
            zzhmVar.zzgj().zzaly.set(j);
        }
        boolean isEnabled = zzhmVar.zzacv.isEnabled();
        if (!zzhmVar.zzgk().zzho()) {
            zzhmVar.zzgj().zzh(!isEnabled);
        }
        zzhmVar.zzga().resetAnalyticsData();
        zzhmVar.zzapq = !isEnabled;
    }
}
