package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzcaj implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzcak zzb;

    public zzcaj(zzcak zzcakVar, boolean z4) {
        this.zza = z4;
        this.zzb = zzcakVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzK("windowVisibilityChanged", "isVisible", String.valueOf(this.zza));
    }
}
