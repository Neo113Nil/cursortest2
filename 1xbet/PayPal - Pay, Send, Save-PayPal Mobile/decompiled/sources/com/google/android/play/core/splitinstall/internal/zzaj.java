package com.google.android.play.core.splitinstall.internal;

/* loaded from: classes9.dex */
final class zzaj implements java.lang.Runnable {
    final /* synthetic */ java.util.List zza;
    final /* synthetic */ com.google.android.play.core.splitinstall.zzf zzb;
    final /* synthetic */ com.google.android.play.core.splitinstall.internal.zzak zzc;

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.play.core.splitinstall.internal.zzam zzamVar;
        try {
            zzamVar = this.zzc.zzc;
            if (zzamVar.zzb(this.zza)) {
                com.google.android.play.core.splitinstall.internal.zzak.zzc(this.zzc, this.zzb);
            } else {
                com.google.android.play.core.splitinstall.internal.zzak.zzb(this.zzc, this.zza, this.zzb);
            }
        } catch (java.lang.Exception unused) {
            this.zzb.zzb(-11);
        }
    }

    zzaj(com.google.android.play.core.splitinstall.internal.zzak zzakVar, java.util.List list, com.google.android.play.core.splitinstall.zzf zzfVar) {
        this.zzc = zzakVar;
        this.zza = list;
        this.zzb = zzfVar;
    }
}
