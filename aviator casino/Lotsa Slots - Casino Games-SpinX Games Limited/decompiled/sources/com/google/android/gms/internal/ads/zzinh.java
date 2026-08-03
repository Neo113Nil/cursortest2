package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzinh implements com.google.android.gms.internal.ads.zzind {
    private static final java.lang.Object zza = new java.lang.Object();
    private volatile com.google.android.gms.internal.ads.zzind zzb;
    private volatile java.lang.Object zzc = zza;

    private zzinh(com.google.android.gms.internal.ads.zzind zzindVar) {
        this.zzb = zzindVar;
    }

    public static com.google.android.gms.internal.ads.zzind zza(com.google.android.gms.internal.ads.zzind zzindVar) {
        return ((zzindVar instanceof com.google.android.gms.internal.ads.zzinh) || (zzindVar instanceof com.google.android.gms.internal.ads.zzimt)) ? zzindVar : new com.google.android.gms.internal.ads.zzinh(zzindVar);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final java.lang.Object zzb() {
        java.lang.Object obj = this.zzc;
        if (obj != zza) {
            return obj;
        }
        com.google.android.gms.internal.ads.zzind zzindVar = this.zzb;
        if (zzindVar == null) {
            return this.zzc;
        }
        java.lang.Object zzb = zzindVar.zzb();
        this.zzc = zzb;
        this.zzb = null;
        return zzb;
    }
}
