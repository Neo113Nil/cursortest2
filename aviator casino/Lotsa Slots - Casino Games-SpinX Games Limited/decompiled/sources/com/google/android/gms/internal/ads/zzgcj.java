package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
class zzgcj {
    static final java.lang.String zza = new java.util.UUID(0, 0).toString();
    final com.google.android.gms.internal.ads.zzgci zzb;
    final com.google.android.gms.internal.ads.zzgch zzc;
    private final java.lang.String zzd;
    private final java.lang.String zze;
    private final java.lang.String zzf;
    private final java.lang.String zzg;
    private final java.lang.String zzh;

    zzgcj(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.zzb = com.google.android.gms.internal.ads.zzgci.zza(context);
        this.zzc = com.google.android.gms.internal.ads.zzgch.zza(context);
        this.zzd = str;
        this.zze = str.concat("_3p");
        this.zzf = str2;
        this.zzg = str2.concat("_3p");
        this.zzh = str3;
    }

    private final java.lang.String zzh(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (str2 != null && str3 != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + str2.length() + str3.length());
            sb.append(str);
            sb.append(str2);
            sb.append(str3);
            return java.util.UUID.nameUUIDFromBytes(sb.toString().getBytes(java.nio.charset.StandardCharsets.UTF_8)).toString();
        }
        java.lang.String str4 = this.zzh;
        java.lang.String str5 = kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL;
        java.lang.String str6 = str2 == null ? kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL : "not null";
        int length = str6.length();
        if (str3 != null) {
            str5 = "not null";
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(length + 120 + str5.length());
        sb2.append(str4);
        sb2.append(": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ");
        sb2.append(str6);
        sb2.append(", hashKey is ");
        sb2.append(str5);
        throw new java.lang.IllegalArgumentException(sb2.toString());
    }

    final com.google.android.gms.internal.ads.zzgcg zza(java.lang.String str, java.lang.String str2, long j, boolean z) throws java.io.IOException {
        if (str != null) {
            try {
                java.util.UUID.fromString(str);
                if (!str.equals(zza)) {
                    java.lang.String zze = zze(true);
                    java.lang.String zzc = this.zzb.zzc("paid_3p_hash_key", null);
                    if (zze != null && zzc != null && !zze.equals(zzh(str, str2, zzc))) {
                        return zzb(str, str2);
                    }
                }
            } catch (java.lang.IllegalArgumentException unused) {
            }
            return new com.google.android.gms.internal.ads.zzgcg();
        }
        boolean z2 = str != null;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis < 0) {
            throw new java.lang.IllegalStateException(this.zzh.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        long zzd = zzd(z2);
        if (zzd != -1) {
            if (currentTimeMillis < zzd) {
                this.zzb.zzb(z2 ? this.zzg : this.zzf, java.lang.Long.valueOf(currentTimeMillis));
            } else if (currentTimeMillis >= zzd + j) {
                return zzb(str, str2);
            }
        }
        java.lang.String zze2 = zze(z2);
        return (zze2 != null || z) ? new com.google.android.gms.internal.ads.zzgcg(zze2, zzd(z2)) : zzb(str, str2);
    }

    final com.google.android.gms.internal.ads.zzgcg zzb(java.lang.String str, java.lang.String str2) throws java.io.IOException {
        if (str == null) {
            return zzf(java.util.UUID.randomUUID().toString(), false);
        }
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        this.zzb.zzb("paid_3p_hash_key", uuid);
        return zzf(zzh(str, str2, uuid), true);
    }

    final void zzc(boolean z) throws java.io.IOException {
        java.lang.String str = z ? this.zzg : this.zzf;
        com.google.android.gms.internal.ads.zzgci zzgciVar = this.zzb;
        zzgciVar.zzf(str);
        zzgciVar.zzf(z ? this.zze : this.zzd);
    }

    final long zzd(boolean z) {
        return this.zzb.zzd(z ? this.zzg : this.zzf, -1L);
    }

    final java.lang.String zze(boolean z) {
        return this.zzb.zzc(z ? this.zze : this.zzd, null);
    }

    final com.google.android.gms.internal.ads.zzgcg zzf(java.lang.String str, boolean z) throws java.io.IOException {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis < 0) {
            throw new java.lang.IllegalStateException(this.zzh.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        com.google.android.gms.internal.ads.zzgci zzgciVar = this.zzb;
        zzgciVar.zzb(z ? this.zzg : this.zzf, java.lang.Long.valueOf(currentTimeMillis));
        zzgciVar.zzb(z ? this.zze : this.zzd, str);
        return new com.google.android.gms.internal.ads.zzgcg(str, currentTimeMillis);
    }

    final boolean zzg(boolean z) {
        return this.zzb.zzg(this.zzd);
    }
}
