package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzimt implements com.google.android.gms.internal.ads.zzind, com.google.android.gms.internal.ads.zzimo {
    private static final java.lang.Object zza = new java.lang.Object();
    private volatile com.google.android.gms.internal.ads.zzind zzb;
    private volatile java.lang.Object zzc = zza;

    private zzimt(com.google.android.gms.internal.ads.zzind zzindVar) {
        this.zzb = zzindVar;
    }

    public static com.google.android.gms.internal.ads.zzind zza(com.google.android.gms.internal.ads.zzind zzindVar) {
        return zzindVar instanceof com.google.android.gms.internal.ads.zzimt ? zzindVar : new com.google.android.gms.internal.ads.zzimt(zzindVar);
    }

    public static com.google.android.gms.internal.ads.zzimo zzc(com.google.android.gms.internal.ads.zzind zzindVar) {
        if (zzindVar instanceof com.google.android.gms.internal.ads.zzimo) {
            return (com.google.android.gms.internal.ads.zzimo) zzindVar;
        }
        zzindVar.getClass();
        return new com.google.android.gms.internal.ads.zzimt(zzindVar);
    }

    private final synchronized java.lang.Object zzd() {
        java.lang.Object obj = this.zzc;
        java.lang.Object obj2 = zza;
        if (obj != obj2) {
            return obj;
        }
        java.lang.Object zzb = this.zzb.zzb();
        java.lang.Object obj3 = this.zzc;
        if (obj3 != obj2 && obj3 != zzb) {
            throw new java.lang.IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + zzb + ". This is likely due to a circular dependency.");
        }
        this.zzc = zzb;
        this.zzb = null;
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final java.lang.Object zzb() {
        java.lang.Object obj = this.zzc;
        return obj == zza ? zzd() : obj;
    }
}
