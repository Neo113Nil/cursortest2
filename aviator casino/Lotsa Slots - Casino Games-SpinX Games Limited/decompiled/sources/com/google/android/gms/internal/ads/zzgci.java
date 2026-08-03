package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgci {
    private static com.google.android.gms.internal.ads.zzgci zza;
    private final java.lang.String zzb;
    private final android.content.SharedPreferences zzc;

    private zzgci(android.content.Context context) {
        this.zzb = context.getPackageName();
        this.zzc = context.getSharedPreferences("paid_storage_sp", 0);
    }

    static com.google.android.gms.internal.ads.zzgci zza(android.content.Context context) {
        if (zza == null) {
            zza = new com.google.android.gms.internal.ads.zzgci(context);
        }
        return zza;
    }

    final void zzb(java.lang.String str, java.lang.Object obj) throws java.io.IOException {
        boolean commit;
        if (obj instanceof java.lang.String) {
            commit = this.zzc.edit().putString(str, (java.lang.String) obj).commit();
        } else if (obj instanceof java.lang.Long) {
            commit = this.zzc.edit().putLong(str, ((java.lang.Long) obj).longValue()).commit();
        } else if (obj instanceof java.lang.Boolean) {
            commit = this.zzc.edit().putBoolean(str, ((java.lang.Boolean) obj).booleanValue()).commit();
        } else {
            if (!(obj instanceof java.lang.Integer)) {
                java.lang.String valueOf = java.lang.String.valueOf(obj.getClass());
                java.lang.String str2 = this.zzb;
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 33 + java.lang.String.valueOf(str2).length());
                sb.append("Unexpected object class ");
                sb.append(valueOf);
                sb.append(" for app ");
                sb.append(str2);
                android.util.Log.e("GpidLifecycleSPHandler", sb.toString());
                java.lang.String str3 = this.zzb;
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(str.length() + 25 + java.lang.String.valueOf(str3).length());
                sb2.append("Failed to store ");
                sb2.append(str);
                sb2.append(" for app ");
                sb2.append(str3);
                throw new java.io.IOException(sb2.toString());
            }
            commit = this.zzc.edit().putInt(str, ((java.lang.Integer) obj).intValue()).commit();
        }
        if (commit) {
            return;
        }
        java.lang.String str32 = this.zzb;
        java.lang.StringBuilder sb22 = new java.lang.StringBuilder(str.length() + 25 + java.lang.String.valueOf(str32).length());
        sb22.append("Failed to store ");
        sb22.append(str);
        sb22.append(" for app ");
        sb22.append(str32);
        throw new java.io.IOException(sb22.toString());
    }

    @javax.annotation.Nullable
    final java.lang.String zzc(java.lang.String str, java.lang.String str2) {
        return this.zzc.getString(str, null);
    }

    final long zzd(java.lang.String str, long j) {
        return this.zzc.getLong(str, -1L);
    }

    final boolean zze(java.lang.String str, boolean z) {
        return this.zzc.getBoolean(str, true);
    }

    final void zzf(java.lang.String str) throws java.io.IOException {
        if (this.zzc.edit().remove(str).commit()) {
            return;
        }
        java.lang.String str2 = this.zzb;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 26 + java.lang.String.valueOf(str2).length());
        sb.append("Failed to remove ");
        sb.append(str);
        sb.append(" for app ");
        sb.append(str2);
        throw new java.io.IOException(sb.toString());
    }

    final boolean zzg(java.lang.String str) {
        return this.zzc.contains(str);
    }
}
