package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzfin implements zzgub {
    final /* synthetic */ zzfiq zza;

    zzfin(zzfiq zzfiqVar) {
        Objects.requireNonNull(zzfiqVar);
        this.zza = zzfiqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        zzcbv zzcbvVar = (zzcbv) obj;
        zzfio zzfioVar = new zzfio(zzcbvVar, new zzfnx(zzcbvVar.zzj), null);
        zzfiq zzfiqVar = this.zza;
        zzfiqVar.zzd(zzfioVar);
        return zzfiqVar.zzc();
    }
}
