package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzcah implements Runnable {
    final /* synthetic */ zzcak zza;

    public zzcah(zzcak zzcakVar) {
        this.zza = zzcakVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzK("surfaceCreated", new String[0]);
    }
}
