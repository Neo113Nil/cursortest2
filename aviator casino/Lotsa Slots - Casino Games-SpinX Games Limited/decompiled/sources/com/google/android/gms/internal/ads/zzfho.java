package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzfho implements com.google.android.gms.internal.ads.zzgta {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfhs zza;

    zzfho(com.google.android.gms.internal.ads.zzfhs zzfhsVar) {
        java.util.Objects.requireNonNull(zzfhsVar);
        this.zza = zzfhsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgta
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public final /* bridge */ /* synthetic */ java.lang.Object apply(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzg("", (com.google.android.gms.internal.ads.zzegr) obj);
        com.google.android.gms.ads.internal.util.zze.zza("Failed to get a cache key, reverting to legacy flow.");
        com.google.android.gms.internal.ads.zzfhs zzfhsVar = this.zza;
        zzfhsVar.zzd(new com.google.android.gms.internal.ads.zzfhq(null, zzfhsVar.zzb(), null));
        return zzfhsVar.zzc();
    }
}
