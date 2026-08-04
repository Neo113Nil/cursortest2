package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import p031e1.k;
import p136t.e;

/* JADX INFO: loaded from: classes.dex */
class zzfpx {
    static final String zza = new UUID(0, 0).toString();
    final zzfpw zzb;
    final zzfpv zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;
    private final String zzh;

    public zzfpx(Context context, String str, String str2, String str3) {
        this.zzb = zzfpw.zzb(context);
        this.zzc = zzfpv.zza(context);
        this.zzd = str;
        this.zze = str.concat("_3p");
        this.zzf = str2;
        this.zzg = str2.concat("_3p");
        this.zzh = str3;
    }

    private final String zzh(String str, String str2, String str3) {
        if (str2 != null && str3 != null) {
            return UUID.nameUUIDFromBytes(k.f(str, str2, str3).getBytes(StandardCharsets.UTF_8)).toString();
        }
        StringBuilder sbD = e.d(this.zzh, ": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ");
        sbD.append(str2 == null ? "null" : "not null");
        sbD.append(", hashKey is ");
        sbD.append(str3 == null ? "null" : "not null");
        throw new IllegalArgumentException(sbD.toString());
    }

    public final long zza(boolean z4) {
        return this.zzb.zza(z4 ? this.zzg : this.zzf, -1L);
    }

    public final zzfpu zzb(String str, String str2, long j, boolean z4) throws IOException {
        if (str != null) {
            try {
                UUID.fromString(str);
                if (!str.equals(zza)) {
                    String strZze = zze(true);
                    String strZzc = this.zzb.zzc("paid_3p_hash_key", null);
                    if (strZze != null && strZzc != null && !strZze.equals(zzh(str, str2, strZzc))) {
                        return zzc(str, str2);
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new zzfpu();
        }
        boolean z7 = str != null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            throw new IllegalStateException(this.zzh.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        long jZza = zza(z7);
        if (jZza != -1) {
            if (jCurrentTimeMillis < jZza) {
                this.zzb.zzd(z7 ? this.zzg : this.zzf, Long.valueOf(jCurrentTimeMillis));
            } else if (jCurrentTimeMillis >= jZza + j) {
                return zzc(str, str2);
            }
        }
        String strZze2 = zze(z7);
        return (strZze2 != null || z4) ? new zzfpu(strZze2, zza(z7)) : zzc(str, str2);
    }

    public final zzfpu zzc(String str, String str2) throws IOException {
        if (str == null) {
            return zzd(UUID.randomUUID().toString(), false);
        }
        String string = UUID.randomUUID().toString();
        this.zzb.zzd("paid_3p_hash_key", string);
        return zzd(zzh(str, str2, string), true);
    }

    public final zzfpu zzd(String str, boolean z4) throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            throw new IllegalStateException(this.zzh.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        this.zzb.zzd(z4 ? this.zzg : this.zzf, Long.valueOf(jCurrentTimeMillis));
        this.zzb.zzd(z4 ? this.zze : this.zzd, str);
        return new zzfpu(str, jCurrentTimeMillis);
    }

    public final String zze(boolean z4) {
        return this.zzb.zzc(z4 ? this.zze : this.zzd, null);
    }

    public final void zzf(boolean z4) throws IOException {
        this.zzb.zze(z4 ? this.zzg : this.zzf);
        this.zzb.zze(z4 ? this.zze : this.zzd);
    }

    public final boolean zzg(boolean z4) {
        return this.zzb.zzg(this.zzd);
    }
}
