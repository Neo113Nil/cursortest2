package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzflj implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        if (zzflm.zzc != null) {
            zzflm.zzc.post(zzflm.zzd);
            zzflm.zzc.postDelayed(zzflm.zze, 200L);
        }
    }
}
