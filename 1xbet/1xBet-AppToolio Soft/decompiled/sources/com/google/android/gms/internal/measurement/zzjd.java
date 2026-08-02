package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzjd implements Runnable {
    private final /* synthetic */ zziy zzare;

    zzjd(zziy zziyVar) {
        this.zzare = zziyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzik.zza(this.zzare.zzaqv, (zzfa) null);
        this.zzare.zzaqv.zzks();
    }
}
