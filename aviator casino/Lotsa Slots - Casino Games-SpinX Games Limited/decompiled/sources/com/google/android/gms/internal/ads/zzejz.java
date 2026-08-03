package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzejz implements com.google.android.gms.internal.ads.zzhbt {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfok zza;

    zzejz(com.google.android.gms.internal.ads.zzekg zzekgVar, com.google.android.gms.internal.ads.zzfok zzfokVar) {
        this.zza = zzfokVar;
        java.util.Objects.requireNonNull(zzekgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(java.lang.Throwable th) {
        java.lang.String message = th.getMessage();
        java.lang.String.valueOf(message);
        java.lang.String valueOf = java.lang.String.valueOf(message);
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to get offline buffered ping database: ".concat(valueOf));
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        try {
            this.zza.zza((android.database.sqlite.SQLiteDatabase) obj);
        } catch (java.lang.Exception e) {
            java.lang.String message = e.getMessage();
            java.lang.String.valueOf(message);
            java.lang.String valueOf = java.lang.String.valueOf(message);
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Error executing function on offline buffered ping database: ".concat(valueOf));
        }
    }
}
