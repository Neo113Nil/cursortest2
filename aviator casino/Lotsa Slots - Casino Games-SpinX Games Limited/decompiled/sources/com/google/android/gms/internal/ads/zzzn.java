package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzzn {
    public static final com.google.android.gms.internal.ads.zzzn zza = new com.google.android.gms.internal.ads.zzzn(new com.google.android.gms.internal.ads.zzbg[0]);
    public final int zzb;
    private final com.google.android.gms.internal.ads.zzgwm zzc;
    private int zzd;

    static {
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        java.lang.Integer.toString(0, 36);
    }

    public zzzn(com.google.android.gms.internal.ads.zzbg... zzbgVarArr) {
        this.zzc = com.google.android.gms.internal.ads.zzgwm.zzr(zzbgVarArr);
        this.zzb = zzbgVarArr.length;
        int i = 0;
        while (i < this.zzc.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.zzc.size(); i3++) {
                if (((com.google.android.gms.internal.ads.zzbg) this.zzc.get(i)).equals(this.zzc.get(i3))) {
                    com.google.android.gms.internal.ads.zzeg.zzf("TrackGroupArray", "", new java.lang.IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzzn zzznVar = (com.google.android.gms.internal.ads.zzzn) obj;
            if (this.zzb == zzznVar.zzb && this.zzc.equals(zzznVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzd;
        if (i != 0) {
            return i;
        }
        int hashCode = this.zzc.hashCode();
        this.zzd = hashCode;
        return hashCode;
    }

    public final java.lang.String toString() {
        return this.zzc.toString();
    }

    public final com.google.android.gms.internal.ads.zzbg zza(int i) {
        return (com.google.android.gms.internal.ads.zzbg) this.zzc.get(i);
    }

    public final int zzb(com.google.android.gms.internal.ads.zzbg zzbgVar) {
        int indexOf = this.zzc.indexOf(zzbgVar);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final com.google.android.gms.internal.ads.zzgwm zzc() {
        return com.google.android.gms.internal.ads.zzgwm.zzq(com.google.android.gms.internal.ads.zzgxm.zzc(this.zzc, com.google.android.gms.internal.ads.zzzm.zza));
    }
}
