package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzfim implements zzgub {
    final /* synthetic */ zzfiq zza;

    zzfim(zzfiq zzfiqVar) {
        Objects.requireNonNull(zzfiqVar);
        this.zza = zzfiqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzg("", (zzehp) obj);
        com.google.android.gms.ads.internal.util.zze.zza("Failed to get a cache key, reverting to legacy flow.");
        zzfiq zzfiqVar = this.zza;
        zzfiqVar.zzd(new zzfio(null, zzfiqVar.zzb(), null));
        return zzfiqVar.zzc();
    }
}
