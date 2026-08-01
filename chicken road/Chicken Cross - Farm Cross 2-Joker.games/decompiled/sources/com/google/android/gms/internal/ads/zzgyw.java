package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzgyw extends zzgza {
    final /* synthetic */ Comparator zza;

    zzgyw(Comparator comparator) {
        this.zza = comparator;
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    final Map zza() {
        return new TreeMap(this.zza);
    }
}
