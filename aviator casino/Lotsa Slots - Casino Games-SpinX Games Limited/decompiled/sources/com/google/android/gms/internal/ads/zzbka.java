package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public class zzbka {
    private final java.lang.String zza;
    private final java.lang.Object zzb;
    private final int zzc;

    protected zzbka(java.lang.String str, java.lang.Object obj, int i) {
        this.zza = str;
        this.zzb = obj;
        this.zzc = i;
    }

    public static com.google.android.gms.internal.ads.zzbka zza(java.lang.String str, boolean z) {
        return new com.google.android.gms.internal.ads.zzbka(str, java.lang.Boolean.valueOf(z), 1);
    }

    public static com.google.android.gms.internal.ads.zzbka zzb(java.lang.String str, long j) {
        return new com.google.android.gms.internal.ads.zzbka(str, java.lang.Long.valueOf(j), 2);
    }

    public static com.google.android.gms.internal.ads.zzbka zzc(java.lang.String str, double d) {
        return new com.google.android.gms.internal.ads.zzbka(str, java.lang.Double.valueOf(d), 3);
    }

    public static com.google.android.gms.internal.ads.zzbka zzd(java.lang.String str, java.lang.String str2) {
        return new com.google.android.gms.internal.ads.zzbka("gad:dynamite_module:experiment_id", "", 4);
    }

    public final java.lang.Object zze() {
        com.google.android.gms.internal.ads.zzblg zza = com.google.android.gms.internal.ads.zzbli.zza();
        if (zza != null) {
            int i = this.zzc - 1;
            return i != 0 ? i != 1 ? i != 2 ? zza.zzd(this.zza, (java.lang.String) this.zzb) : zza.zzc(this.zza, ((java.lang.Double) this.zzb).doubleValue()) : zza.zzb(this.zza, ((java.lang.Long) this.zzb).longValue()) : zza.zza(this.zza, ((java.lang.Boolean) this.zzb).booleanValue());
        }
        if (com.google.android.gms.internal.ads.zzbli.zzb() != null) {
            com.google.android.gms.internal.ads.zzbli.zzb().zza();
        }
        return this.zzb;
    }
}
