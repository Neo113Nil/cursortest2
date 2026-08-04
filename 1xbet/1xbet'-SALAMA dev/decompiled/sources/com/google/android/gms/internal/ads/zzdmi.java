package com.google.android.gms.internal.ads;

import F2.InterfaceC0217a;
import H2.c;
import H2.m;

/* JADX INFO: loaded from: classes.dex */
public final class zzdmi extends zzdls implements zzdcp {
    private zzdcp zza;

    @Override // com.google.android.gms.internal.ads.zzdcp
    public final synchronized void zzdd() {
        zzdcp zzdcpVar = this.zza;
        if (zzdcpVar != null) {
            zzdcpVar.zzdd();
        }
    }

    public final synchronized void zzi(InterfaceC0217a interfaceC0217a, zzbhp zzbhpVar, m mVar, zzbhr zzbhrVar, c cVar, zzdcp zzdcpVar) {
        zzh(interfaceC0217a, zzbhpVar, mVar, zzbhrVar, cVar);
        this.zza = zzdcpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdcp
    public final synchronized void zzu() {
        zzdcp zzdcpVar = this.zza;
        if (zzdcpVar != null) {
            zzdcpVar.zzu();
        }
    }
}
