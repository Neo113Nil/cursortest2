package com.google.android.gms.internal.firebase_database;

/* loaded from: classes.dex */
final class zzbe implements Runnable {
    private final /* synthetic */ zzbc zzff;

    zzbe(zzbc zzbcVar) {
        this.zzff = zzbcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbg zzbgVar;
        zzbg zzbgVar2;
        zzbgVar = this.zzff.zzew;
        if (zzbgVar != null) {
            zzbgVar2 = this.zzff.zzew;
            zzbgVar2.zzm("0");
            this.zzff.zzas();
        }
    }
}
