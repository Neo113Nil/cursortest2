package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
abstract class zzgam extends zzgac {
    private List zzb;

    public zzgam(zzfwc zzfwcVar, boolean z4) {
        super(zzfwcVar, z4, true);
        List emptyList = zzfwcVar.isEmpty() ? Collections.emptyList() : zzfwx.zza(zzfwcVar.size());
        for (int i7 = 0; i7 < zzfwcVar.size(); i7++) {
            emptyList.add(null);
        }
        this.zzb = emptyList;
    }

    public abstract Object zzG(List list);

    @Override // com.google.android.gms.internal.ads.zzgac
    public final void zzv(int i7, Object obj) {
        List list = this.zzb;
        if (list != null) {
            list.set(i7, new zzgal(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgac
    public final void zzw() {
        List list = this.zzb;
        if (list != null) {
            zzc(zzG(list));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgac
    public final void zzy(int i7) {
        super.zzy(i7);
        this.zzb = null;
    }
}
