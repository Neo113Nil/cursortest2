package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class zzfxo extends zzfuj {
    final transient zzftz zza;

    public zzfxo(Map map, zzftz zzftzVar) {
        super(map);
        this.zza = zzftzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuj, com.google.android.gms.internal.ads.zzfva
    public final /* bridge */ /* synthetic */ Collection zza() {
        return (List) this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzfva, com.google.android.gms.internal.ads.zzfvd
    public final Map zzj() {
        return zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzfva, com.google.android.gms.internal.ads.zzfvd
    public final Set zzl() {
        return zzm();
    }
}
