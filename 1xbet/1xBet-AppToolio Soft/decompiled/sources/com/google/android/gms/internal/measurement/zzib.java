package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzib implements Runnable {
    private final /* synthetic */ boolean zzadp;
    private final /* synthetic */ zzhm zzaps;

    zzib(zzhm zzhmVar, boolean z) {
        this.zzaps = zzhmVar;
        this.zzadp = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzaps.zzi(this.zzadp);
    }
}
