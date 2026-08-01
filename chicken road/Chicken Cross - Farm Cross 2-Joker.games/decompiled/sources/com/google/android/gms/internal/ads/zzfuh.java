package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzfuh implements zzbga {
    final /* synthetic */ zzfuj zza;

    zzfuh(zzfuj zzfujVar) {
        Objects.requireNonNull(zzfujVar);
        this.zza = zzfujVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zza(boolean z) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzD)).booleanValue()) {
            this.zza.zzj(z);
        }
    }
}
