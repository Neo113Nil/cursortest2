package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzfs implements Runnable {
    private final /* synthetic */ boolean zzalp;
    private final /* synthetic */ zzfr zzalq;

    zzfs(zzfr zzfrVar, boolean z) {
        this.zzalq = zzfrVar;
        this.zzalp = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjt zzjtVar;
        zzjtVar = this.zzalq.zzalo;
        zzjtVar.zzm(this.zzalp);
    }
}
