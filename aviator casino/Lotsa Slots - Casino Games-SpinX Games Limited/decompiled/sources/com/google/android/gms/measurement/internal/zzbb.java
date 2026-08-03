package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzbb {
    final java.lang.String zza;
    final java.lang.String zzb;
    final java.lang.String zzc;
    final long zzd;
    final long zze;
    final com.google.android.gms.measurement.internal.zzbe zzf;

    zzbb(com.google.android.gms.measurement.internal.zzib zzibVar, java.lang.String str, java.lang.String str2, java.lang.String str3, long j, long j2, android.os.Bundle bundle) {
        com.google.android.gms.measurement.internal.zzbe zzbeVar;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str3);
        this.zza = str2;
        this.zzb = str3;
        this.zzc = true == android.text.TextUtils.isEmpty(str) ? null : str;
        this.zzd = j;
        this.zze = j2;
        if (j2 != 0 && j2 > j) {
            zzibVar.zzaV().zze().zzb("Event created with reverse previous/current timestamps. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzbeVar = new com.google.android.gms.measurement.internal.zzbe(new android.os.Bundle());
        } else {
            android.os.Bundle bundle2 = new android.os.Bundle(bundle);
            java.util.Iterator<java.lang.String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                java.lang.String next = it.next();
                if (next == null) {
                    zzibVar.zzaV().zzb().zza("Param name can't be null");
                    it.remove();
                } else {
                    java.lang.Object zzE = zzibVar.zzk().zzE(next, bundle2.get(next));
                    if (zzE == null) {
                        zzibVar.zzaV().zze().zzb("Param value can't be null", zzibVar.zzl().zzb(next));
                        it.remove();
                    } else {
                        zzibVar.zzk().zzM(bundle2, next, zzE);
                    }
                }
            }
            zzbeVar = new com.google.android.gms.measurement.internal.zzbe(bundle2);
        }
        this.zzf = zzbeVar;
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.zzf.toString();
        java.lang.String str = this.zza;
        int length = java.lang.String.valueOf(str).length();
        java.lang.String str2 = this.zzb;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 22 + java.lang.String.valueOf(str2).length() + 10 + obj.length() + 1);
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        sb.append("', params=");
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }

    final com.google.android.gms.measurement.internal.zzbb zza(com.google.android.gms.measurement.internal.zzib zzibVar, long j) {
        return new com.google.android.gms.measurement.internal.zzbb(zzibVar, this.zzc, this.zza, this.zzb, this.zzd, j, this.zzf);
    }

    private zzbb(com.google.android.gms.measurement.internal.zzib zzibVar, java.lang.String str, java.lang.String str2, java.lang.String str3, long j, long j2, com.google.android.gms.measurement.internal.zzbe zzbeVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str3);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzbeVar);
        this.zza = str2;
        this.zzb = str3;
        this.zzc = true == android.text.TextUtils.isEmpty(str) ? null : str;
        this.zzd = j;
        this.zze = j2;
        if (j2 != 0 && j2 > j) {
            zzibVar.zzaV().zze().zzc("Event created with reverse previous/current timestamps. appId, name", com.google.android.gms.measurement.internal.zzgt.zzl(str2), com.google.android.gms.measurement.internal.zzgt.zzl(str3));
        }
        this.zzf = zzbeVar;
    }
}
