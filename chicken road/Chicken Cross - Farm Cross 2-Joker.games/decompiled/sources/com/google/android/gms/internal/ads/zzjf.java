package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzjf {
    public final String zza;
    public final zzv zzb;
    public final zzv zzc;
    public final int zzd;
    public final int zze;

    public zzjf(String str, zzv zzvVar, zzv zzvVar2, int i, int i2) {
        boolean z;
        if (i != 0) {
            z = false;
            i2 = i2 == 0 ? 0 : i2;
            zzguk.zza(z);
            zzguk.zza(true ^ TextUtils.isEmpty(str));
            this.zza = str;
            this.zzb = zzvVar;
            zzvVar2.getClass();
            this.zzc = zzvVar2;
            this.zzd = i;
            this.zze = i2;
        }
        z = true;
        zzguk.zza(z);
        zzguk.zza(true ^ TextUtils.isEmpty(str));
        this.zza = str;
        this.zzb = zzvVar;
        zzvVar2.getClass();
        this.zzc = zzvVar2;
        this.zzd = i;
        this.zze = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzjf zzjfVar = (zzjf) obj;
            if (this.zzd == zzjfVar.zzd && this.zze == zzjfVar.zze && this.zza.equals(zzjfVar.zza) && this.zzb.equals(zzjfVar.zzb) && this.zzc.equals(zzjfVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.zzd + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zze) * 31) + this.zza.hashCode()) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode();
    }
}
