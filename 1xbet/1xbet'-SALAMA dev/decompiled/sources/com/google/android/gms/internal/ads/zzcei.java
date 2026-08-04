package com.google.android.gms.internal.ads;

import H2.m;

/* JADX INFO: loaded from: classes.dex */
final class zzcei implements m {
    private final zzceb zza;
    private final m zzb;

    public zzcei(zzceb zzcebVar, m mVar) {
        this.zza = zzcebVar;
        this.zzb = mVar;
    }

    @Override // H2.m
    public final void zzdE() {
    }

    @Override // H2.m
    public final void zzdi() {
    }

    @Override // H2.m
    public final void zzdo() {
        m mVar = this.zzb;
        if (mVar != null) {
            mVar.zzdo();
        }
    }

    @Override // H2.m
    public final void zzdp() {
        m mVar = this.zzb;
        if (mVar != null) {
            mVar.zzdp();
        }
        this.zza.zzaa();
    }

    @Override // H2.m
    public final void zzdr() {
        m mVar = this.zzb;
        if (mVar != null) {
            mVar.zzdr();
        }
    }

    @Override // H2.m
    public final void zzds(int i7) {
        m mVar = this.zzb;
        if (mVar != null) {
            mVar.zzds(i7);
        }
        this.zza.zzY();
    }
}
