package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
class zzgvw extends zzgvp implements SortedMap {
    SortedSet zzd;
    final /* synthetic */ zzgwc zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgvw(zzgwc zzgwcVar, SortedMap sortedMap) {
        super(zzgwcVar, sortedMap);
        Objects.requireNonNull(zzgwcVar);
        this.zze = zzgwcVar;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return zzg().comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return zzg().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new zzgvw(this.zze, zzg().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return zzg().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new zzgvw(this.zze, zzg().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new zzgvw(this.zze, zzg().tailMap(obj));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgys
    /* renamed from: zze */
    public SortedSet zzh() {
        return new zzgvx(this.zze, zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzgvp, com.google.android.gms.internal.ads.zzgys, java.util.AbstractMap, java.util.Map
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.zzd;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet zzh = zzh();
        this.zzd = zzh;
        return zzh;
    }

    SortedMap zzg() {
        return (SortedMap) this.zza;
    }
}
