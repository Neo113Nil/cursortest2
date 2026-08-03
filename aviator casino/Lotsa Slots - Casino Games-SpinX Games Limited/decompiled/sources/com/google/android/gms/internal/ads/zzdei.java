package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdei implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzind zza;

    private zzdei(com.google.android.gms.internal.ads.zzind zzindVar) {
        this.zza = zzindVar;
    }

    public static com.google.android.gms.internal.ads.zzdei zzc(com.google.android.gms.internal.ads.zzind zzindVar) {
        return new com.google.android.gms.internal.ads.zzdei(zzindVar);
    }

    public static com.google.android.gms.internal.ads.zzdeh zzd(java.util.Set set) {
        return new com.google.android.gms.internal.ads.zzdeh(set);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.zzdeh zzb() {
        return new com.google.android.gms.internal.ads.zzdeh(((com.google.android.gms.internal.ads.zzing) this.zza).zzb());
    }
}
