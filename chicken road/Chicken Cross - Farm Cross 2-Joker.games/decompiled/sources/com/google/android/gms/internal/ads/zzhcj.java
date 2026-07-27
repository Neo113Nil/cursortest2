package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
abstract class zzhcj extends zzhca {
    private List zza;

    zzhcj(zzgxi zzgxiVar, boolean z) {
        super(zzgxiVar, z, true);
        List emptyList = zzgxiVar.isEmpty() ? Collections.emptyList() : zzgym.zzb(zzgxiVar.size());
        for (int i = 0; i < zzgxiVar.size(); i++) {
            emptyList.add(null);
        }
        this.zza = emptyList;
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    final void zzA(int i) {
        super.zzA(i);
        this.zza = null;
    }

    abstract Object zzD(List list);

    @Override // com.google.android.gms.internal.ads.zzhca
    final void zzw(int i, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i, new zzhci(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    final void zzx() {
        List list = this.zza;
        if (list != null) {
            zza(zzD(list));
        }
    }
}
