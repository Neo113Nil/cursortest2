package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes.dex */
final class zzte {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;

    public zzte(String str, boolean z4, boolean z7) {
        this.zza = str;
        this.zzb = z4;
        this.zzc = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == zzte.class) {
            zzte zzteVar = (zzte) obj;
            if (TextUtils.equals(this.zza, zzteVar.zza) && this.zzb == zzteVar.zzb && this.zzc == zzteVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() + 31) * 31) + (true != this.zzb ? 1237 : 1231)) * 31) + (true != this.zzc ? 1237 : 1231);
    }
}
