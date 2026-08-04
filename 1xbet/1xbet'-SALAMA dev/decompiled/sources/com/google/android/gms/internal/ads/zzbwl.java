package com.google.android.gms.internal.ads;

import p167y2.m;
import p167y2.s;

/* JADX INFO: loaded from: classes.dex */
public final class zzbwl extends zzbvv {
    private m zza;
    private s zzb;

    public final void zzb(m mVar) {
        this.zza = mVar;
    }

    public final void zzc(s sVar) {
        this.zzb = sVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final void zze() {
        m mVar = this.zza;
        if (mVar != null) {
            mVar.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final void zzf() {
        m mVar = this.zza;
        if (mVar != null) {
            mVar.d();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final void zzg() {
        m mVar = this.zza;
        if (mVar != null) {
            mVar.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final void zzh(int i7) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final void zzi(com.google.android.gms.ads.internal.client.zze zzeVar) {
        m mVar = this.zza;
        if (mVar != null) {
            mVar.c(zzeVar.j());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final void zzj() {
        m mVar = this.zza;
        if (mVar != null) {
            mVar.e();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final void zzk(zzbvq zzbvqVar) {
        s sVar = this.zzb;
        if (sVar != null) {
            sVar.onUserEarnedReward(new zzbwd(zzbvqVar));
        }
    }
}
