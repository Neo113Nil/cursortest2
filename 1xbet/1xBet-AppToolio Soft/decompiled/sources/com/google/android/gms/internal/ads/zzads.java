package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzads implements Runnable {
    private final /* synthetic */ zzadk zzccn;

    zzads(zzadk zzadkVar) {
        this.zzccn = zzadkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        obj = this.zzccn.zzbzh;
        synchronized (obj) {
            if (this.zzccn.zzccj == null) {
                return;
            }
            this.zzccn.onStop();
            this.zzccn.zzc(2, "Timed out waiting for ad response.");
        }
    }
}
