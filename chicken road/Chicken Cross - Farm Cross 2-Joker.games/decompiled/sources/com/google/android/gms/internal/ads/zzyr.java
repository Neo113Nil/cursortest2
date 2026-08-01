package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzyr implements zzzg {
    final /* synthetic */ zzyu zza;
    private final int zzb;

    public zzyr(zzyu zzyuVar, int i) {
        Objects.requireNonNull(zzyuVar);
        this.zza = zzyuVar;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final boolean zza() {
        return this.zza.zzh(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final void zzb() throws IOException {
        this.zza.zzi(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final int zzc(zzma zzmaVar, zziy zziyVar, int i) {
        return this.zza.zzk(this.zzb, zzmaVar, zziyVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final int zzd(long j) {
        return this.zza.zzp(this.zzb, j);
    }

    final /* synthetic */ int zze() {
        return this.zzb;
    }
}
