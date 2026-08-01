package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzgzc extends zzgvl {
    final transient zzgvc zza;

    zzgzc(Map map, zzgvc zzgvcVar) {
        super(map);
        this.zza = zzgvcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgvl, com.google.android.gms.internal.ads.zzgwc
    protected final /* bridge */ /* synthetic */ Collection zzc() {
        return (List) this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgwc, com.google.android.gms.internal.ads.zzgwf
    final Set zzh() {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgwc, com.google.android.gms.internal.ads.zzgwf
    final Map zzl() {
        return zzm();
    }
}
