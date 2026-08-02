package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzju implements Runnable {
    private final /* synthetic */ zzjy zzasm;
    private final /* synthetic */ zzjt zzasn;

    zzju(zzjt zzjtVar, zzjy zzjyVar) {
        this.zzasn = zzjtVar;
        this.zzasm = zzjyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzasn.zza(this.zzasm);
        this.zzasn.start();
    }
}
