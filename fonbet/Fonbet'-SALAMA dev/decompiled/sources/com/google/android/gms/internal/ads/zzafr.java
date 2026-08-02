package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzafr implements zzau {
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final long zzd;
    public final byte[] zze;
    private int zzf;

    static {
        zzx zzxVar = new zzx();
        zzxVar.zzad("application/id3");
        zzxVar.zzaj();
        zzx zzxVar2 = new zzx();
        zzxVar2.zzad("application/x-scte35");
        zzxVar2.zzaj();
    }

    public zzafr(String str, String str2, long j, long j3, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j;
        this.zzd = j3;
        this.zze = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafr.class == obj.getClass()) {
            zzafr zzafrVar = (zzafr) obj;
            if (this.zzc == zzafrVar.zzc && this.zzd == zzafrVar.zzd) {
                String str = this.zza;
                String str2 = zzafrVar.zza;
                int i7 = zzen.zza;
                if (Objects.equals(str, str2) && Objects.equals(this.zzb, zzafrVar.zzb) && Arrays.equals(this.zze, zzafrVar.zze)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.zzf;
        if (i7 != 0) {
            return i7;
        }
        int hashCode = this.zza.hashCode() + 527;
        int hashCode2 = this.zzb.hashCode() + (hashCode * 31);
        long j = this.zzc;
        long j3 = this.zzd;
        int hashCode3 = Arrays.hashCode(this.zze) + (((((hashCode2 * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) j3)) * 31);
        this.zzf = hashCode3;
        return hashCode3;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.zza + ", id=" + this.zzd + ", durationMs=" + this.zzc + ", value=" + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzau
    public final /* synthetic */ void zza(zzar zzarVar) {
    }
}
