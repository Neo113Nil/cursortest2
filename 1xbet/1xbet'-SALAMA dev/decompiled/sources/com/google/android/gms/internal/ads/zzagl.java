package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zzagl extends zzagf {
    public final String zza;
    public final String zzb;

    public zzagl(String str, String str2, String str3) {
        super(str);
        this.zza = str2;
        this.zzb = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagl.class == obj.getClass()) {
            zzagl zzaglVar = (zzagl) obj;
            if (this.zzf.equals(zzaglVar.zzf)) {
                String str = this.zza;
                String str2 = zzaglVar.zza;
                int i7 = zzen.zza;
                if (Objects.equals(str, str2) && Objects.equals(this.zzb, zzaglVar.zzb)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzf.hashCode() + 527;
        String str = this.zza;
        return this.zzb.hashCode() + (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzagf
    public final String toString() {
        return this.zzf + ": url=" + this.zzb;
    }
}
