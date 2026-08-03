package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
final class zzhn implements com.google.android.gms.internal.measurement.zzo {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzhs zzb;

    zzhn(com.google.android.gms.measurement.internal.zzhs zzhsVar, java.lang.String str) {
        this.zza = str;
        java.util.Objects.requireNonNull(zzhsVar);
        this.zzb = zzhsVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzo
    public final java.lang.String zza(java.lang.String str) {
        java.util.Map map = (java.util.Map) this.zzb.zzD().get(this.zza);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (java.lang.String) map.get(str);
    }
}
