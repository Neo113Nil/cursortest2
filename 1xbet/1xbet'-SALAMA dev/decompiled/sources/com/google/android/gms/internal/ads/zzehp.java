package com.google.android.gms.internal.ads;

import E2.e;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class zzehp implements e {
    private e zza;

    @Override // E2.e
    public final synchronized void zza(View view) {
        e eVar = this.zza;
        if (eVar != null) {
            eVar.zza(view);
        }
    }

    @Override // E2.e
    public final synchronized void zzb() {
        e eVar = this.zza;
        if (eVar != null) {
            eVar.zzb();
        }
    }

    @Override // E2.e
    public final synchronized void zzc() {
        e eVar = this.zza;
        if (eVar != null) {
            eVar.zzc();
        }
    }

    public final synchronized void zzd(e eVar) {
        this.zza = eVar;
    }
}
