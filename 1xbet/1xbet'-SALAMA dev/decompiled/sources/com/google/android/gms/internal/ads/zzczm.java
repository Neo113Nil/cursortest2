package com.google.android.gms.internal.ads;

import java.util.Set;
import p172z2.e;

/* JADX INFO: loaded from: classes.dex */
public final class zzczm extends zzdag implements zzbhr {
    public zzczm(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbhr
    public final synchronized void zzb(final String str, final String str2) {
        zzq(new zzdaf() { // from class: com.google.android.gms.internal.ads.zzczl
            @Override // com.google.android.gms.internal.ads.zzdaf
            public final void zza(Object obj) {
                ((e) obj).onAppEvent(str, str2);
            }
        });
    }
}
