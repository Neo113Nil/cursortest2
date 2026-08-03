package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzinf {
    private final java.util.List zza;
    private final java.util.List zzb;

    /* synthetic */ zzinf(int i, int i2, com.google.android.gms.internal.ads.zzine zzineVar) {
        this.zza = com.google.android.gms.internal.ads.zzimr.zza(i);
        this.zzb = com.google.android.gms.internal.ads.zzimr.zza(i2);
    }

    public final com.google.android.gms.internal.ads.zzinf zza(com.google.android.gms.internal.ads.zzind zzindVar) {
        this.zza.add(zzindVar);
        return this;
    }

    public final com.google.android.gms.internal.ads.zzinf zzb(com.google.android.gms.internal.ads.zzind zzindVar) {
        this.zzb.add(zzindVar);
        return this;
    }

    public final com.google.android.gms.internal.ads.zzing zzc() {
        return new com.google.android.gms.internal.ads.zzing(this.zza, this.zzb, null);
    }
}
