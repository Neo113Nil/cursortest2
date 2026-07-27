package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzbsc implements zzhcg {
    final /* synthetic */ zzbru zza;

    zzbsc(zzbsg zzbsgVar, zzbru zzbruVar) {
        this.zza = zzbruVar;
        Objects.requireNonNull(zzbsgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final /* bridge */ /* synthetic */ ListenableFuture zza(Object obj) throws Exception {
        zzcgo zzcgoVar = new zzcgo();
        ((zzbsa) obj).zze(this.zza, new zzbsb(this, zzcgoVar));
        return zzcgoVar;
    }
}
