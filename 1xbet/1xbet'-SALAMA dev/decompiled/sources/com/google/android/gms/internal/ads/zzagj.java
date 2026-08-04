package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zzagj extends zzagf {
    public final String zza;
    public final byte[] zzb;

    public zzagj(String str, byte[] bArr) {
        super("PRIV");
        this.zza = str;
        this.zzb = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagj.class == obj.getClass()) {
            zzagj zzagjVar = (zzagj) obj;
            String str = this.zza;
            String str2 = zzagjVar.zza;
            int i7 = zzen.zza;
            if (Objects.equals(str, str2) && Arrays.equals(this.zzb, zzagjVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() + 527;
        return Arrays.hashCode(this.zzb) + (iHashCode * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzagf
    public final String toString() {
        return this.zzf + ": owner=" + this.zza;
    }
}
