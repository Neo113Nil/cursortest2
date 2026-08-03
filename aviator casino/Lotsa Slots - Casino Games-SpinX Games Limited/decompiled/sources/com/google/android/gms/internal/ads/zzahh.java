package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzahh extends com.google.android.gms.internal.ads.zzagn {
    final /* synthetic */ com.google.android.gms.internal.ads.zzahb zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzahi zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzahh(com.google.android.gms.internal.ads.zzahi zzahiVar, com.google.android.gms.internal.ads.zzahb zzahbVar, com.google.android.gms.internal.ads.zzahb zzahbVar2) {
        super(zzahbVar);
        this.zza = zzahbVar2;
        java.util.Objects.requireNonNull(zzahiVar);
        this.zzb = zzahiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagn, com.google.android.gms.internal.ads.zzahb
    public final com.google.android.gms.internal.ads.zzagz zzc(long j) {
        com.google.android.gms.internal.ads.zzagz zzc = this.zza.zzc(j);
        com.google.android.gms.internal.ads.zzahc zzahcVar = zzc.zza;
        long j2 = zzahcVar.zzb;
        com.google.android.gms.internal.ads.zzahi zzahiVar = this.zzb;
        com.google.android.gms.internal.ads.zzahc zzahcVar2 = new com.google.android.gms.internal.ads.zzahc(j2, zzahcVar.zzc + zzahiVar.zza());
        com.google.android.gms.internal.ads.zzahc zzahcVar3 = zzc.zzb;
        return new com.google.android.gms.internal.ads.zzagz(zzahcVar2, new com.google.android.gms.internal.ads.zzahc(zzahcVar3.zzb, zzahcVar3.zzc + zzahiVar.zza()));
    }
}
