package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzzl extends com.google.android.gms.internal.ads.zzwy {
    private final com.google.android.gms.internal.ads.zzak zzc;

    private zzzl(com.google.android.gms.internal.ads.zzbf zzbfVar, com.google.android.gms.internal.ads.zzak zzakVar) {
        super(zzbfVar);
        this.zzc = zzakVar;
    }

    public static com.google.android.gms.internal.ads.zzzl zzp(com.google.android.gms.internal.ads.zzbf zzbfVar, com.google.android.gms.internal.ads.zzak zzakVar) {
        return zzbfVar instanceof com.google.android.gms.internal.ads.zzzl ? new com.google.android.gms.internal.ads.zzzl(((com.google.android.gms.internal.ads.zzzl) zzbfVar).zzb, zzakVar) : new com.google.android.gms.internal.ads.zzzl(zzbfVar, zzakVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwy, com.google.android.gms.internal.ads.zzbf
    public final com.google.android.gms.internal.ads.zzbe zzb(int i, com.google.android.gms.internal.ads.zzbe zzbeVar, long j) {
        this.zzb.zzb(i, zzbeVar, j);
        com.google.android.gms.internal.ads.zzak zzakVar = this.zzc;
        zzbeVar.zzd = zzakVar;
        com.google.android.gms.internal.ads.zzag zzagVar = zzakVar.zzb;
        zzbeVar.zzc = null;
        return zzbeVar;
    }
}
