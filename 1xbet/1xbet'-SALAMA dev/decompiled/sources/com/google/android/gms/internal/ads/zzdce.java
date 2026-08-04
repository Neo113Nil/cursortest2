package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zzdce extends zzdag implements zzdcg {
    public zzdce(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzdcg
    public final void zzt() {
        zzq(new zzdaf() { // from class: com.google.android.gms.internal.ads.zzdcd
            @Override // com.google.android.gms.internal.ads.zzdaf
            public final void zza(Object obj) {
                ((zzdcg) obj).zzt();
            }
        });
    }
}
