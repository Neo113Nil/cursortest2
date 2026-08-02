package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzgo implements Runnable {
    private final /* synthetic */ zzhl zzaoz;
    private final /* synthetic */ zzgn zzapa;

    zzgo(zzgn zzgnVar, zzhl zzhlVar) {
        this.zzapa = zzgnVar;
        this.zzaoz = zzhlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzapa.zza(this.zzaoz);
        this.zzapa.start();
    }
}
