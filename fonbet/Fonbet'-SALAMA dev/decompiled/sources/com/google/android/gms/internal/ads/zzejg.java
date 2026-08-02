package com.google.android.gms.internal.ads;

import F2.InterfaceC0265y0;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzejg implements zzcxb {
    private final AtomicReference zza = new AtomicReference();

    public final void zza(InterfaceC0265y0 interfaceC0265y0) {
        this.zza.set(interfaceC0265y0);
    }

    @Override // com.google.android.gms.internal.ads.zzcxb
    public final void zzh(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzexk.zza(this.zza, new zzexj() { // from class: com.google.android.gms.internal.ads.zzejf
            @Override // com.google.android.gms.internal.ads.zzexj
            public final void zza(Object obj) {
                ((InterfaceC0265y0) obj).c0(com.google.android.gms.ads.internal.client.zzt.this);
            }
        });
    }
}
