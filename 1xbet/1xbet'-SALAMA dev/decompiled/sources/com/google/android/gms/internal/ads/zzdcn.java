package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zzdcn extends zzdag implements zzdcp {
    public zzdcn(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzdcp
    public final void zzdd() {
        zzq(new zzdaf() { // from class: com.google.android.gms.internal.ads.zzdcm
            @Override // com.google.android.gms.internal.ads.zzdaf
            public final void zza(Object obj) {
                ((zzdcp) obj).zzdd();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcp
    public final void zzu() {
        zzq(new zzdaf() { // from class: com.google.android.gms.internal.ads.zzdcl
            @Override // com.google.android.gms.internal.ads.zzdaf
            public final void zza(Object obj) {
                ((zzdcp) obj).zzu();
            }
        });
    }
}
