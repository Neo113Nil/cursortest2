package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzgzi extends zzgxm {
    final /* synthetic */ zzgzj zza;

    zzgzi(zzgzj zzgzjVar) {
        Objects.requireNonNull(zzgzjVar);
        this.zza = zzgzjVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzgzj zzgzjVar = this.zza;
        zzguk.zzm(i, zzgzjVar.zzx(), "index");
        int i2 = i + i;
        return new AbstractMap.SimpleImmutableEntry(Objects.requireNonNull(zzgzjVar.zzw()[i2]), Objects.requireNonNull(zzgzjVar.zzw()[i2 + 1]));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzgxi
    public final boolean zzf() {
        return true;
    }
}
