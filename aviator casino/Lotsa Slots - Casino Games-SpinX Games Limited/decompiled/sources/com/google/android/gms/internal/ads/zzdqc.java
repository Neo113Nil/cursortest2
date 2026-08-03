package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdqc {
    com.google.android.gms.internal.ads.zzbnc zza;
    com.google.android.gms.internal.ads.zzbmz zzb;
    com.google.android.gms.internal.ads.zzbnp zzc;
    com.google.android.gms.internal.ads.zzbnm zzd;
    com.google.android.gms.internal.ads.zzbsk zze;
    final androidx.collection.SimpleArrayMap zzf = new androidx.collection.SimpleArrayMap();
    final androidx.collection.SimpleArrayMap zzg = new androidx.collection.SimpleArrayMap();

    public final com.google.android.gms.internal.ads.zzdqc zza(com.google.android.gms.internal.ads.zzbnc zzbncVar) {
        this.zza = zzbncVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzdqc zzb(com.google.android.gms.internal.ads.zzbmz zzbmzVar) {
        this.zzb = zzbmzVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzdqc zzc(com.google.android.gms.internal.ads.zzbnp zzbnpVar) {
        this.zzc = zzbnpVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzdqc zzd(com.google.android.gms.internal.ads.zzbnm zzbnmVar) {
        this.zzd = zzbnmVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzdqc zze(com.google.android.gms.internal.ads.zzbsk zzbskVar) {
        this.zze = zzbskVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzdqc zzf(java.lang.String str, com.google.android.gms.internal.ads.zzbni zzbniVar, com.google.android.gms.internal.ads.zzbnf zzbnfVar) {
        this.zzf.put(str, zzbniVar);
        if (zzbnfVar != null) {
            this.zzg.put(str, zzbnfVar);
        }
        return this;
    }

    public final com.google.android.gms.internal.ads.zzdqd zzg() {
        return new com.google.android.gms.internal.ads.zzdqd(this, null);
    }
}
