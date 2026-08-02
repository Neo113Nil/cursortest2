package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class zzaga extends zzagf {
    public final String zza;
    public final String zzb;
    public final String zzc;

    public zzaga(String str, String str2, String str3) {
        super("COMM");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaga.class == obj.getClass()) {
            zzaga zzagaVar = (zzaga) obj;
            String str = this.zzb;
            String str2 = zzagaVar.zzb;
            int i7 = zzen.zza;
            if (Objects.equals(str, str2) && Objects.equals(this.zza, zzagaVar.zza) && Objects.equals(this.zzc, zzagaVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzb.hashCode() + ((this.zza.hashCode() + 527) * 31);
        String str = this.zzc;
        return (hashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzagf
    public final String toString() {
        return this.zzf + ": language=" + this.zza + ", description=" + this.zzb + ", text=" + this.zzc;
    }
}
