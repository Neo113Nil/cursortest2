package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
class zzgvl extends zzgwc implements zzgyh {
    protected zzgvl(Map map) {
        super(map);
    }

    @Override // com.google.android.gms.internal.ads.zzgwc
    final Collection zza(Collection collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // com.google.android.gms.internal.ads.zzgwc
    final Collection zzb(Object obj, Collection collection) {
        return zzg(obj, (List) collection, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgwc
    /* bridge */ /* synthetic */ Collection zzc() {
        throw null;
    }
}
