package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zzdcy extends zzdag implements zzbjq {
    public zzdcy(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbjq
    public final void zza(final zzbvm zzbvmVar) {
        zzq(new zzdaf() { // from class: com.google.android.gms.internal.ads.zzdcx
            @Override // com.google.android.gms.internal.ads.zzdaf
            public final void zza(Object obj) {
                ((zzbjq) obj).zza(zzbvmVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbjq
    public final void zzb() {
        zzq(new zzdaf() { // from class: com.google.android.gms.internal.ads.zzdcw
            @Override // com.google.android.gms.internal.ads.zzdaf
            public final void zza(Object obj) {
                ((zzbjq) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbjq
    public final synchronized void zzc() {
        zzq(new zzdaf() { // from class: com.google.android.gms.internal.ads.zzdcv
            @Override // com.google.android.gms.internal.ads.zzdaf
            public final void zza(Object obj) {
                ((zzbjq) obj).zzc();
            }
        });
    }
}
