package com.google.android.play.core.splitcompat;

/* loaded from: classes9.dex */
final class zzr implements java.lang.Runnable {
    final /* synthetic */ java.util.Set zza;
    final /* synthetic */ com.google.android.play.core.splitcompat.SplitCompat zzb;

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.zzg(this.zza);
        } catch (java.lang.Exception unused) {
        }
    }

    zzr(com.google.android.play.core.splitcompat.SplitCompat splitCompat, java.util.Set set) {
        this.zzb = splitCompat;
        this.zza = set;
    }
}
