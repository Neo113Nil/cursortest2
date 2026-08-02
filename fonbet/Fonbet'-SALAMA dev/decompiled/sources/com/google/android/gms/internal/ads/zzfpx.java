package com.google.android.gms.internal.ads;

import android.content.Context;
import e1.k;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import t.e;

/* loaded from: classes.dex */
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
        StringBuilder d7 = e.d(this.zzh, ": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ");
        d7.append(str2 == null ? "null" : "not null");
        d7.append(", hashKey is ");
        d7.append(str3 == null ? "null" : "not null");
        throw new IllegalArgumentException(d7.toString());
    }

    public final long zza(boolean z4) {
        return this.zzb.zza(z4 ? this.zzg : this.zzf, -1L);
    }

    public final zzfpu zzb(String str, String str2, long j, boolean z4) {
        if (str != null) {
            try {
                UUID.fromString(str);
                if (!str.equals(zza)) {
                    String zze = zze(true);
                    String zzc = this.zzb.zzc("paid_3p_hash_key", null);
                    if (zze != null && zzc != null && !zze.equals(zzh(str, str2, zzc))) {
                        return zzc(str, str2);
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new zzfpu();
        }
        boolean z7 = str != null;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < 0) {
            throw new IllegalStateException(this.zzh.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        long zza2 = zza(z7);
        if (zza2 != -1) {
            if (currentTimeMillis < zza2) {
                this.zzb.zzd(z7 ? this.zzg : this.zzf, Long.valueOf(currentTimeMillis));
            } else if (currentTimeMillis >= zza2 + j) {
                return zzc(str, str2);
            }
        }
        String zze2 = zze(z7);
        return (zze2 != null || z4) ? new zzfpu(zze2, zza(z7)) : zzc(str, str2);
    }

    public final zzfpu zzc(String str, String str2) {
        if (str == null) {
            return zzd(UUID.randomUUID().toString(), false);
        }
        String uuid = UUID.randomUUID().toString();
        this.zzb.zzd("paid_3p_hash_key", uuid);
        return zzd(zzh(str, str2, uuid), true);
    }

    public final zzfpu zzd(String str, boolean z4) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < 0) {
            throw new IllegalStateException(this.zzh.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        this.zzb.zzd(z4 ? this.zzg : this.zzf, Long.valueOf(currentTimeMillis));
        this.zzb.zzd(z4 ? this.zze : this.zzd, str);
        return new zzfpu(str, currentTimeMillis);
    }

    public final String zze(boolean z4) {
        return this.zzb.zzc(z4 ? this.zze : this.zzd, null);
    }

    public final void zzf(boolean z4) {
        this.zzb.zze(z4 ? this.zzg : this.zzf);
        this.zzb.zze(z4 ? this.zze : this.zzd);
    }

    public final boolean zzg(boolean z4) {
        return this.zzb.zzg(this.zzd);
    }
}
