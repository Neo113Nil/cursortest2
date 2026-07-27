package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzaia implements zzahk {
    final /* synthetic */ zzaic zza;
    private final long zzb;

    public zzaia(zzaic zzaicVar, long j) {
        Objects.requireNonNull(zzaicVar);
        this.zza = zzaicVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final zzahi zzc(long j) {
        zzaic zzaicVar = this.zza;
        zzahi zzg = zzaicVar.zzh()[0].zzg(j);
        for (int i = 1; i < zzaicVar.zzh().length; i++) {
            zzahi zzg2 = zzaicVar.zzh()[i].zzg(j);
            if (zzg2.zza.zzc < zzg.zza.zzc) {
                zzg = zzg2;
            }
        }
        return zzg;
    }
}
