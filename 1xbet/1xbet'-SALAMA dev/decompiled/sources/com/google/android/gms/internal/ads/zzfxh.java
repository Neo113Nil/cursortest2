package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
final class zzfxh extends zzfxl {
    final /* synthetic */ Comparator zza;

    public zzfxh(Comparator comparator) {
        this.zza = comparator;
    }

    @Override // com.google.android.gms.internal.ads.zzfxl
    public final Map zza() {
        return new TreeMap(this.zza);
    }
}
