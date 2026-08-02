package com.google.android.gms.internal.firebase_database;

/* loaded from: classes.dex */
final class zzbj implements Runnable {
    private final /* synthetic */ zzbh zzfh;
    private final /* synthetic */ String zzfi;

    zzbj(zzbh zzbhVar, String str) {
        this.zzfh = zzbhVar;
        this.zzfi = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzfh.zzff.zzl(this.zzfi);
    }
}
