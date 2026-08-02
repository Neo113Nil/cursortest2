package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzdx implements Runnable {
    private final /* synthetic */ long zzaex;
    private final /* synthetic */ zzdu zzaey;

    zzdx(zzdu zzduVar, long j) {
        this.zzaey = zzduVar;
        this.zzaex = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzaey.zzq(this.zzaex);
    }
}
