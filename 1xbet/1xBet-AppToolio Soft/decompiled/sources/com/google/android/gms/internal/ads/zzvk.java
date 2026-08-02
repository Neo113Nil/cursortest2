package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
final class zzvk implements com.google.android.gms.ads.internal.gmsg.zzv<zzwb> {
    private final /* synthetic */ zzvw zzbqi;
    private final /* synthetic */ zzuu zzbqj;
    private final /* synthetic */ zzvf zzbqk;

    zzvk(zzvf zzvfVar, zzvw zzvwVar, zzuu zzuuVar) {
        this.zzbqk = zzvfVar;
        this.zzbqi = zzvwVar;
        this.zzbqj = zzuuVar;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.zzv
    public final /* synthetic */ void zza(zzwb zzwbVar, Map map) {
        Object obj;
        zzalo zzaloVar;
        obj = this.zzbqk.mLock;
        synchronized (obj) {
            if (this.zzbqi.getStatus() != -1 && this.zzbqi.getStatus() != 1) {
                this.zzbqk.zzbqb = 0;
                zzaloVar = this.zzbqk.zzbpy;
                zzaloVar.zze(this.zzbqj);
                this.zzbqi.zzk(this.zzbqj);
                this.zzbqk.zzbqa = this.zzbqi;
                zzakb.v("Successfully loaded JS Engine.");
            }
        }
    }
}
