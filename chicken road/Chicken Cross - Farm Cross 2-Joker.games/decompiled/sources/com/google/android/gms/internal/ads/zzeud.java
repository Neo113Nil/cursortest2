package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes9.dex */
public final class zzeud implements zzdgg {
    private final AtomicReference zza = new AtomicReference();

    public final void zza(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        this.zza.set(zzdqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdgg
    public final void zzm(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzfij.zza(this.zza, new zzfii() { // from class: com.google.android.gms.internal.ads.zzeuc
            @Override // com.google.android.gms.internal.ads.zzfii
            public final /* synthetic */ void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzdq) obj).zze(com.google.android.gms.ads.internal.client.zzt.this);
            }
        });
    }
}
