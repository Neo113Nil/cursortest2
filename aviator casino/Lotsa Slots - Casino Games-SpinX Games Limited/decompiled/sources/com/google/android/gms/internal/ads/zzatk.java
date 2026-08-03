package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzatk {
    public final java.lang.Object zza;
    public final com.google.android.gms.internal.ads.zzasn zzb;
    public final com.google.android.gms.internal.ads.zzatn zzc;
    public boolean zzd;

    private zzatk(com.google.android.gms.internal.ads.zzatn zzatnVar) {
        this.zzd = false;
        this.zza = null;
        this.zzb = null;
        this.zzc = zzatnVar;
    }

    private zzatk(java.lang.Object obj, com.google.android.gms.internal.ads.zzasn zzasnVar) {
        this.zzd = false;
        this.zza = obj;
        this.zzb = zzasnVar;
        this.zzc = null;
    }

    public static com.google.android.gms.internal.ads.zzatk zza(java.lang.Object obj, com.google.android.gms.internal.ads.zzasn zzasnVar) {
        return new com.google.android.gms.internal.ads.zzatk(obj, zzasnVar);
    }

    public static com.google.android.gms.internal.ads.zzatk zzb(com.google.android.gms.internal.ads.zzatn zzatnVar) {
        return new com.google.android.gms.internal.ads.zzatk(zzatnVar);
    }

    public final boolean zzc() {
        return this.zzc == null;
    }
}
