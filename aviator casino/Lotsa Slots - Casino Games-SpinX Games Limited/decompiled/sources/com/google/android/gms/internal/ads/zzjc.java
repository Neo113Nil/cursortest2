package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzjc {
    public final java.lang.String zza;
    public final com.google.android.gms.internal.ads.zzv zzb;
    public final com.google.android.gms.internal.ads.zzv zzc;
    public final int zzd;
    public final int zze;

    public zzjc(java.lang.String str, com.google.android.gms.internal.ads.zzv zzvVar, com.google.android.gms.internal.ads.zzv zzvVar2, int i, int i2) {
        boolean z;
        if (i != 0) {
            z = false;
            i2 = i2 == 0 ? 0 : i2;
            com.google.android.gms.internal.ads.zzgtj.zza(z);
            com.google.android.gms.internal.ads.zzgtj.zza(true ^ android.text.TextUtils.isEmpty(str));
            this.zza = str;
            this.zzb = zzvVar;
            zzvVar2.getClass();
            this.zzc = zzvVar2;
            this.zzd = i;
            this.zze = i2;
        }
        z = true;
        com.google.android.gms.internal.ads.zzgtj.zza(z);
        com.google.android.gms.internal.ads.zzgtj.zza(true ^ android.text.TextUtils.isEmpty(str));
        this.zza = str;
        this.zzb = zzvVar;
        zzvVar2.getClass();
        this.zzc = zzvVar2;
        this.zzd = i;
        this.zze = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzjc zzjcVar = (com.google.android.gms.internal.ads.zzjc) obj;
            if (this.zzd == zzjcVar.zzd && this.zze == zzjcVar.zze && this.zza.equals(zzjcVar.zza) && this.zzb.equals(zzjcVar.zzb) && this.zzc.equals(zzjcVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.zzd + com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zze) * 31) + this.zza.hashCode()) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode();
    }
}
