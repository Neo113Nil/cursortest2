package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class zzgap extends zzgac {
    private zzgao zzb;

    public zzgap(zzfwc zzfwcVar, boolean z4, Executor executor, Callable callable) {
        super(zzfwcVar, z4, false);
        this.zzb = new zzgan(this, callable, executor);
        zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzfzr
    public final void zzq() {
        zzgao zzgaoVar = this.zzb;
        if (zzgaoVar != null) {
            zzgaoVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgac
    public final void zzv(int i7, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzgac
    public final void zzw() {
        zzgao zzgaoVar = this.zzb;
        if (zzgaoVar != null) {
            zzgaoVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgac
    public final void zzy(int i7) {
        super.zzy(i7);
        if (i7 == 1) {
            this.zzb = null;
        }
    }
}
