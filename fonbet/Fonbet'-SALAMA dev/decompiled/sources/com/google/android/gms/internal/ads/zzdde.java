package com.google.android.gms.internal.ads;

import P2.v;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzdde extends zzdag {
    public zzdde(Set set) {
        super(set);
    }

    public final synchronized void zza(final v vVar) {
        zzq(new zzdaf() { // from class: com.google.android.gms.internal.ads.zzddc
            @Override // com.google.android.gms.internal.ads.zzdaf
            public final void zza(Object obj) {
                ((zzddb) obj).zze(v.this);
            }
        });
    }

    public final synchronized void zzb(final String str) {
        zzq(new zzdaf() { // from class: com.google.android.gms.internal.ads.zzddd
            @Override // com.google.android.gms.internal.ads.zzdaf
            public final void zza(Object obj) {
                ((zzddb) obj).zzf(str);
            }
        });
    }
}
