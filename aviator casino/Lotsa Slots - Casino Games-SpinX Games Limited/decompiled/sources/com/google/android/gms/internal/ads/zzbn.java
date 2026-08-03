package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbn {
    public static final com.google.android.gms.internal.ads.zzbn zza = new com.google.android.gms.internal.ads.zzbn(com.google.android.gms.internal.ads.zzgwm.zzi());
    private final com.google.android.gms.internal.ads.zzgwm zzb;

    static {
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        java.lang.Integer.toString(0, 36);
    }

    public zzbn(java.util.List list) {
        this.zzb = com.google.android.gms.internal.ads.zzgwm.zzq(list);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.zzb.equals(((com.google.android.gms.internal.ads.zzbn) obj).zzb);
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final com.google.android.gms.internal.ads.zzgwm zza() {
        return this.zzb;
    }

    public final boolean zzb(int i) {
        int i2 = 0;
        while (true) {
            com.google.android.gms.internal.ads.zzgwm zzgwmVar = this.zzb;
            if (i2 >= zzgwmVar.size()) {
                return false;
            }
            com.google.android.gms.internal.ads.zzbm zzbmVar = (com.google.android.gms.internal.ads.zzbm) zzgwmVar.get(i2);
            if (zzbmVar.zzb() && zzbmVar.zzd() == i) {
                return true;
            }
            i2++;
        }
    }
}
