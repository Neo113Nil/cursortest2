package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzcai implements Runnable {
    final /* synthetic */ zzcak zza;

    public zzcai(zzcak zzcakVar) {
        this.zza = zzcakVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzK("surfaceDestroyed", new String[0]);
    }
}
