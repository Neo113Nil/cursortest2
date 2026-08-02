package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class zzfuj extends zzfva implements zzfws {
    public zzfuj(Map map) {
        super(map);
    }

    @Override // com.google.android.gms.internal.ads.zzfva
    public /* bridge */ /* synthetic */ Collection zza() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfva
    public final Collection zzb(Collection collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // com.google.android.gms.internal.ads.zzfva
    public final Collection zzc(Object obj, Collection collection) {
        return zzh(obj, (List) collection, null);
    }
}
