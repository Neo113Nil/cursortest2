package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcuo implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzind zza;
    private final com.google.android.gms.internal.ads.zzind zzb;

    private zzcuo(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2, com.google.android.gms.internal.ads.zzind zzindVar3) {
        this.zza = zzindVar;
        this.zzb = zzindVar3;
    }

    public static com.google.android.gms.internal.ads.zzcuo zza(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2, com.google.android.gms.internal.ads.zzind zzindVar3) {
        return new com.google.android.gms.internal.ads.zzcuo(zzindVar, zzindVar2, zzindVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        java.util.Set emptySet = ((org.json.JSONObject) this.zzb.zzb()) == null ? java.util.Collections.emptySet() : java.util.Collections.singleton(new com.google.android.gms.internal.ads.zzdkq((com.google.android.gms.internal.ads.zzcug) this.zza.zzb(), com.google.android.gms.internal.ads.zzfoa.zzc()));
        com.google.android.gms.internal.ads.zzinc.zzb(emptySet);
        return emptySet;
    }
}
