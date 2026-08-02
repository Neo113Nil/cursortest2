package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class zzagh extends zzagf {
    public final String zza;
    public final String zzb;
    public final String zzc;

    public zzagh(String str, String str2, String str3) {
        super("----");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagh.class == obj.getClass()) {
            zzagh zzaghVar = (zzagh) obj;
            String str = this.zzb;
            String str2 = zzaghVar.zzb;
            int i7 = zzen.zza;
            if (Objects.equals(str, str2) && Objects.equals(this.zza, zzaghVar.zza) && Objects.equals(this.zzc, zzaghVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() + 527;
        int hashCode2 = this.zzb.hashCode() + (hashCode * 31);
        return this.zzc.hashCode() + (hashCode2 * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzagf
    public final String toString() {
        return this.zzf + ": domain=" + this.zza + ", description=" + this.zzb;
    }
}
