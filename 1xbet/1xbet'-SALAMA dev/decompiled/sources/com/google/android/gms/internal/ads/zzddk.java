package com.google.android.gms.internal.ads;

import java.util.Set;
import p167y2.x;

/* JADX INFO: loaded from: classes.dex */
public final class zzddk extends zzdag {
    private boolean zzb;

    public zzddk(Set set) {
        super(set);
    }

    public final void zza() {
        zzq(new zzdaf() { // from class: com.google.android.gms.internal.ads.zzddh
            @Override // com.google.android.gms.internal.ads.zzdaf
            public final void zza(Object obj) {
                ((x) obj).onVideoEnd();
            }
        });
    }

    public final void zzb() {
        zzq(new zzdaf() { // from class: com.google.android.gms.internal.ads.zzddg
            @Override // com.google.android.gms.internal.ads.zzdaf
            public final void zza(Object obj) {
                ((x) obj).onVideoPause();
            }
        });
    }

    public final synchronized void zzc() {
        try {
            if (!this.zzb) {
                zzq(new zzddi());
                this.zzb = true;
            }
            zzq(new zzdaf() { // from class: com.google.android.gms.internal.ads.zzddj
                @Override // com.google.android.gms.internal.ads.zzdaf
                public final void zza(Object obj) {
                    ((x) obj).onVideoPlay();
                }
            });
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzd() {
        zzq(new zzddi());
        this.zzb = true;
    }
}
