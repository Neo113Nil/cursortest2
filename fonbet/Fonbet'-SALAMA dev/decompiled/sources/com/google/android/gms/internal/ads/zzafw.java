package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzafw extends zzagf {
    public final String zza;
    public final String zzb;
    public final int zzc;
    public final byte[] zzd;

    public zzafw(String str, String str2, int i7, byte[] bArr) {
        super("APIC");
        this.zza = str;
        this.zzb = str2;
        this.zzc = i7;
        this.zzd = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafw.class == obj.getClass()) {
            zzafw zzafwVar = (zzafw) obj;
            if (this.zzc == zzafwVar.zzc) {
                String str = this.zza;
                String str2 = zzafwVar.zza;
                int i7 = zzen.zza;
                if (Objects.equals(str, str2) && Objects.equals(this.zzb, zzafwVar.zzb) && Arrays.equals(this.zzd, zzafwVar.zzd)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int hashCode = str != null ? str.hashCode() : 0;
        int i7 = this.zzc;
        String str2 = this.zzb;
        return Arrays.hashCode(this.zzd) + ((((((i7 + 527) * 31) + hashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzagf
    public final String toString() {
        return this.zzf + ": mimeType=" + this.zza + ", description=" + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzagf, com.google.android.gms.internal.ads.zzau
    public final void zza(zzar zzarVar) {
        zzarVar.zza(this.zzd, this.zzc);
    }
}
