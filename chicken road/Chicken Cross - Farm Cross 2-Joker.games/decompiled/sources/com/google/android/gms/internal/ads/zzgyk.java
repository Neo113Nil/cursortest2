package com.google.android.gms.internal.ads;

import java.util.ListIterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzgyk extends zzgzz {
    final /* synthetic */ zzgyl zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgyk(zzgyl zzgylVar, ListIterator listIterator) {
        super(listIterator);
        Objects.requireNonNull(zzgylVar);
        this.zza = zzgylVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzy
    final Object zza(Object obj) {
        return this.zza.zzb.apply(obj);
    }
}
