package com.google.android.gms.internal.ads;

import m3.InterfaceC1436a;

/* loaded from: classes.dex */
public final class zzeki implements zzesh {
    private final InterfaceC1436a zza;
    private final zzfba zzb;

    public zzeki(InterfaceC1436a interfaceC1436a, zzfba zzfbaVar) {
        this.zza = interfaceC1436a;
        this.zzb = zzfbaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final int zza() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final I3.b zzb() {
        InterfaceC1436a interfaceC1436a = this.zza;
        zzfba zzfbaVar = this.zzb;
        ((m3.b) interfaceC1436a).getClass();
        return zzgbc.zzh(new zzekj(zzfbaVar, System.currentTimeMillis()));
    }
}
