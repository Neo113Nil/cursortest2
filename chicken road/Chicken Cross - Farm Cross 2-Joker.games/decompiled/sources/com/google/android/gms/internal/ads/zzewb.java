package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzewb implements zzfdg {
    private final Bundle zza;

    zzewb(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzfdg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = this.zza;
        Bundle bundle2 = (Bundle) obj;
        if (bundle.isEmpty()) {
            return;
        }
        bundle2.putBundle("installed_adapter_data", bundle);
    }
}
