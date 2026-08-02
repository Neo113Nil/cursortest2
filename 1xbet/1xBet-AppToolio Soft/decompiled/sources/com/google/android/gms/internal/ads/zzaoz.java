package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzaoz implements Runnable {
    private final /* synthetic */ zzaov zzcxf;
    private final /* synthetic */ String zzcxg;
    private final /* synthetic */ String zzcxh;

    zzaoz(zzaov zzaovVar, String str, String str2) {
        this.zzcxf = zzaovVar;
        this.zzcxg = str;
        this.zzcxh = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzapf zzapfVar;
        zzapf zzapfVar2;
        zzapfVar = this.zzcxf.zzcxd;
        if (zzapfVar != null) {
            zzapfVar2 = this.zzcxf.zzcxd;
            zzapfVar2.zzg(this.zzcxg, this.zzcxh);
        }
    }
}
