package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzezu implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzind zza;
    private final com.google.android.gms.internal.ads.zzind zzb;
    private final com.google.android.gms.internal.ads.zzind zzc;

    private zzezu(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2, com.google.android.gms.internal.ads.zzind zzindVar3, com.google.android.gms.internal.ads.zzind zzindVar4) {
        this.zza = zzindVar2;
        this.zzb = zzindVar3;
        this.zzc = zzindVar4;
    }

    public static com.google.android.gms.internal.ads.zzezu zzc(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2, com.google.android.gms.internal.ads.zzind zzindVar3, com.google.android.gms.internal.ads.zzind zzindVar4) {
        return new com.google.android.gms.internal.ads.zzezu(zzindVar, zzindVar2, zzindVar3, zzindVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.zzezs zzb() {
        return new com.google.android.gms.internal.ads.zzezs(com.google.android.gms.internal.ads.zzfoa.zzc(), ((com.google.android.gms.internal.ads.zzcvj) this.zza).zza(), (android.content.Context) this.zzb.zzb(), ((com.google.android.gms.internal.ads.zzing) this.zzc).zzb());
    }
}
