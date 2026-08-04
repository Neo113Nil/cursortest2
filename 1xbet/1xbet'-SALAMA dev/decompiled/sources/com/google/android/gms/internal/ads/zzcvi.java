package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zzcvi extends zzdag {
    private boolean zzb;

    public zzcvi(Set set) {
        super(set);
        this.zzb = false;
    }

    public final synchronized void zza() {
        if (this.zzb) {
            return;
        }
        zzq(new zzdaf() { // from class: com.google.android.gms.internal.ads.zzcvh
            @Override // com.google.android.gms.internal.ads.zzdaf
            public final void zza(Object obj) {
                ((zzcvk) obj).zzr();
            }
        });
        this.zzb = true;
    }
}
