package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdqd {
    public static final com.google.android.gms.internal.ads.zzdqd zza = new com.google.android.gms.internal.ads.zzdqd(new com.google.android.gms.internal.ads.zzdqc());
    private final com.google.android.gms.internal.ads.zzbnc zzb;
    private final com.google.android.gms.internal.ads.zzbmz zzc;
    private final com.google.android.gms.internal.ads.zzbnp zzd;
    private final com.google.android.gms.internal.ads.zzbnm zze;
    private final com.google.android.gms.internal.ads.zzbsk zzf;
    private final androidx.collection.SimpleArrayMap zzg;
    private final androidx.collection.SimpleArrayMap zzh;

    private zzdqd(com.google.android.gms.internal.ads.zzdqc zzdqcVar) {
        this.zzb = zzdqcVar.zza;
        this.zzc = zzdqcVar.zzb;
        this.zzd = zzdqcVar.zzc;
        this.zzg = new androidx.collection.SimpleArrayMap(zzdqcVar.zzf);
        this.zzh = new androidx.collection.SimpleArrayMap(zzdqcVar.zzg);
        this.zze = zzdqcVar.zzd;
        this.zzf = zzdqcVar.zze;
    }

    /* synthetic */ zzdqd(com.google.android.gms.internal.ads.zzdqc zzdqcVar, byte[] bArr) {
        this(zzdqcVar);
    }

    public final com.google.android.gms.internal.ads.zzbnc zza() {
        return this.zzb;
    }

    public final com.google.android.gms.internal.ads.zzbmz zzb() {
        return this.zzc;
    }

    public final com.google.android.gms.internal.ads.zzbnp zzc() {
        return this.zzd;
    }

    public final com.google.android.gms.internal.ads.zzbnm zzd() {
        return this.zze;
    }

    public final com.google.android.gms.internal.ads.zzbsk zze() {
        return this.zzf;
    }

    public final com.google.android.gms.internal.ads.zzbni zzf(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return (com.google.android.gms.internal.ads.zzbni) this.zzg.get(str);
    }

    public final com.google.android.gms.internal.ads.zzbnf zzg(java.lang.String str) {
        return (com.google.android.gms.internal.ads.zzbnf) this.zzh.get(str);
    }

    public final java.util.ArrayList zzh() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (this.zzd != null) {
            arrayList.add(java.lang.Integer.toString(6));
        }
        if (this.zzb != null) {
            arrayList.add(java.lang.Integer.toString(1));
        }
        if (this.zzc != null) {
            arrayList.add(java.lang.Integer.toString(2));
        }
        if (!this.zzg.isEmpty()) {
            arrayList.add(java.lang.Integer.toString(3));
        }
        if (this.zzf != null) {
            arrayList.add(java.lang.Integer.toString(7));
        }
        return arrayList;
    }

    public final java.util.ArrayList zzi() {
        androidx.collection.SimpleArrayMap simpleArrayMap = this.zzg;
        java.util.ArrayList arrayList = new java.util.ArrayList(simpleArrayMap.getSize());
        for (int i = 0; i < simpleArrayMap.getSize(); i++) {
            arrayList.add((java.lang.String) simpleArrayMap.keyAt(i));
        }
        return arrayList;
    }
}
