package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
final class zzbg implements com.google.android.gms.internal.ads.zzati {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ com.google.android.gms.ads.internal.util.zzbi zzb;

    zzbg(com.google.android.gms.ads.internal.util.zzbl zzblVar, java.lang.String str, com.google.android.gms.ads.internal.util.zzbi zzbiVar) {
        this.zza = str;
        this.zzb = zzbiVar;
        java.util.Objects.requireNonNull(zzblVar);
    }

    @Override // com.google.android.gms.internal.ads.zzati
    public final void zza(com.google.android.gms.internal.ads.zzatn zzatnVar) {
        java.lang.String str = this.zza;
        java.lang.String zzatnVar2 = zzatnVar.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 21 + java.lang.String.valueOf(zzatnVar2).length());
        sb.append("Failed to load URL: ");
        sb.append(str);
        sb.append("\n");
        sb.append(zzatnVar2);
        java.lang.String sb2 = sb.toString();
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2);
        this.zzb.zza((java.lang.Object) null);
    }
}
