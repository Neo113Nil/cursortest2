package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzeq implements Runnable {
    private final /* synthetic */ zzhk zzaha;
    private final /* synthetic */ zzep zzahb;

    zzeq(zzep zzepVar, zzhk zzhkVar) {
        this.zzahb = zzepVar;
        this.zzaha = zzhkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzaha.zzgl();
        if (zzee.isMainThread()) {
            this.zzaha.zzgh().zzc(this);
            return;
        }
        boolean zzef = this.zzahb.zzef();
        zzep.zza(this.zzahb, 0L);
        if (zzef) {
            this.zzahb.run();
        }
    }
}
