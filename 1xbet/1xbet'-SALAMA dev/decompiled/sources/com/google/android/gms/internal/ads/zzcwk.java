package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zzcwk extends zzdag implements zzbhp {
    private final Bundle zzb;

    public zzcwk(Set set) {
        super(set);
        this.zzb = new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final synchronized void zza(String str, Bundle bundle) {
        this.zzb.putAll(bundle);
        zzq(new zzdaf() { // from class: com.google.android.gms.internal.ads.zzcwj
            @Override // com.google.android.gms.internal.ads.zzdaf
            public final void zza(Object obj) {
                ((S2.a) obj).onAdMetadataChanged();
            }
        });
    }

    public final synchronized Bundle zzb() {
        return new Bundle(this.zzb);
    }
}
