package com.google.android.gms.internal.ads;

import F2.InterfaceC0217a;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zzcuo extends zzdag implements InterfaceC0217a {
    public zzcuo(Set set) {
        super(set);
    }

    @Override // F2.InterfaceC0217a
    public final void onAdClicked() {
        zzq(new zzdaf() { // from class: com.google.android.gms.internal.ads.zzcun
            @Override // com.google.android.gms.internal.ads.zzdaf
            public final void zza(Object obj) {
                ((InterfaceC0217a) obj).onAdClicked();
            }
        });
    }
}
