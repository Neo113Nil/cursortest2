package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
final class zzhl extends androidx.collection.LruCache {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzhs zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzhl(com.google.android.gms.measurement.internal.zzhs zzhsVar, int i) {
        super(20);
        java.util.Objects.requireNonNull(zzhsVar);
        this.zza = zzhsVar;
    }

    @Override // androidx.collection.LruCache
    protected final /* bridge */ /* synthetic */ java.lang.Object create(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        return this.zza.zzC(str);
    }
}
