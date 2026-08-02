package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.InterfaceC0831e;

/* loaded from: classes4.dex */
final class zzy extends zzah {
    private final InterfaceC0831e<Status> zza;

    public zzy(InterfaceC0831e<Status> interfaceC0831e) {
        this.zza = interfaceC0831e;
    }

    @Override // com.google.android.gms.internal.location.zzai
    public final void zzb(zzaa zzaaVar) {
        this.zza.setResult(zzaaVar.getStatus());
    }

    @Override // com.google.android.gms.internal.location.zzai
    public final void zzc() {
    }
}
