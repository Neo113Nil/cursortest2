package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcoq implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzind zza;
    private final com.google.android.gms.internal.ads.zzind zzb;

    private zzcoq(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2, com.google.android.gms.internal.ads.zzind zzindVar3) {
        this.zza = zzindVar;
        this.zzb = zzindVar2;
    }

    public static com.google.android.gms.internal.ads.zzcoq zzc(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2, com.google.android.gms.internal.ads.zzind zzindVar3) {
        return new com.google.android.gms.internal.ads.zzcoq(zzindVar, zzindVar2, zzindVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.zzcaw zzb() {
        android.content.Context zza = ((com.google.android.gms.internal.ads.zzcns) this.zza).zza();
        com.google.android.gms.internal.ads.zzfqj zzfqjVar = (com.google.android.gms.internal.ads.zzfqj) this.zzb.zzb();
        com.google.android.gms.internal.ads.zzhcg zzc = com.google.android.gms.internal.ads.zzfoa.zzc();
        com.google.android.gms.internal.ads.zzbui zza2 = com.google.android.gms.ads.internal.zzt.zzr().zza(zza, com.google.android.gms.ads.internal.util.client.VersionInfoParcel.forPackage(), zzfqjVar);
        com.google.android.gms.internal.ads.zzbuc zzbucVar = com.google.android.gms.internal.ads.zzbuf.zza;
        zza2.zza("google.afma.request.getAdDictionary", zzbucVar, zzbucVar);
        return new com.google.android.gms.internal.ads.zzcaz(zza, com.google.android.gms.ads.internal.zzt.zzr().zza(zza, com.google.android.gms.ads.internal.util.client.VersionInfoParcel.forPackage(), zzfqjVar).zza("google.afma.sdkConstants.getSdkConstants", zzbucVar, zzbucVar), com.google.android.gms.ads.internal.util.client.VersionInfoParcel.forPackage(), zzc);
    }
}
