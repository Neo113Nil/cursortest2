package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzglz {
    private final com.google.android.gms.internal.ads.zzaux zza;
    private final long zzb;
    private final long zzc;
    private final java.lang.String zzd;

    private zzglz(com.google.android.gms.internal.ads.zzaux zzauxVar, long j, long j2, java.lang.String str) {
        this.zza = zzauxVar;
        this.zzb = j;
        this.zzc = j2;
        this.zzd = str;
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzglz zza(com.google.android.gms.internal.ads.zzaux zzauxVar, byte[] bArr, boolean z) {
        zzauxVar.zza();
        zzauxVar.zzb(bArr);
        java.util.List list = (java.util.List) zzauxVar.zzc(java.util.Optional.empty());
        long longValue = ((java.lang.Long) list.get(0)).longValue();
        long longValue2 = ((java.lang.Long) list.get(1)).longValue();
        long longValue3 = ((java.lang.Long) list.get(2)).longValue();
        zzauxVar.zzd(longValue, java.util.Optional.empty());
        java.lang.String zza = com.google.android.gms.internal.ads.zzgea.zza(com.google.android.gms.internal.ads.zzava.zza(), false);
        int length = zza.length();
        java.lang.String str = true != z ? "" : "-s";
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 12 + str.length());
        sb.append("3.878096153.");
        sb.append(zza);
        sb.append(str);
        return new com.google.android.gms.internal.ads.zzglz(zzauxVar, longValue2, longValue3, sb.toString());
    }

    final /* synthetic */ java.lang.String zzb(java.util.Map map) {
        return com.google.android.gms.internal.ads.zzgea.zza((byte[]) this.zza.zzd(this.zzb, java.util.Optional.of(map)), true);
    }

    final /* synthetic */ void zzc(java.util.Map map) {
        this.zza.zzd(this.zzc, java.util.Optional.of(map));
    }

    final /* synthetic */ java.lang.String zzd() {
        return this.zzd;
    }
}
