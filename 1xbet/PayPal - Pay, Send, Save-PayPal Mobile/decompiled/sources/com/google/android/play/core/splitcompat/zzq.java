package com.google.android.play.core.splitcompat;

/* loaded from: classes9.dex */
final class zzq implements java.lang.Runnable {
    final /* synthetic */ com.google.android.play.core.splitcompat.SplitCompat zza;

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.play.core.splitcompat.zze zzeVar;
        try {
            zzeVar = this.zza.zzc;
            zzeVar.zzk();
        } catch (java.lang.Exception unused) {
        }
    }

    zzq(com.google.android.play.core.splitcompat.SplitCompat splitCompat) {
        this.zza = splitCompat;
    }
}
