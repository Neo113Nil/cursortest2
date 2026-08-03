package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzgm {
    protected static final java.util.concurrent.atomic.AtomicReference zza = new java.util.concurrent.atomic.AtomicReference();
    protected static final java.util.concurrent.atomic.AtomicReference zzb = new java.util.concurrent.atomic.AtomicReference();
    protected static final java.util.concurrent.atomic.AtomicReference zzc = new java.util.concurrent.atomic.AtomicReference();
    private final com.google.android.gms.measurement.internal.zzgl zzd;

    public zzgm(com.google.android.gms.measurement.internal.zzgl zzglVar) {
        this.zzd = zzglVar;
    }

    private static final java.lang.String zzg(java.lang.String str, java.lang.String[] strArr, java.lang.String[] strArr2, java.util.concurrent.atomic.AtomicReference atomicReference) {
        java.lang.String str2;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(strArr);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(strArr2);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(atomicReference);
        com.google.android.gms.common.internal.Preconditions.checkArgument(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (java.util.Objects.equals(str, strArr[i])) {
                synchronized (atomicReference) {
                    java.lang.String[] strArr3 = (java.lang.String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new java.lang.String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i];
                    if (str2 == null) {
                        str2 = strArr2[i] + "(" + strArr[i] + ")";
                        strArr3[i] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    protected final java.lang.String zza(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zzg(str, com.google.android.gms.measurement.internal.zzjl.zzc, com.google.android.gms.measurement.internal.zzjl.zza, zza);
    }

    protected final java.lang.String zzb(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zzg(str, com.google.android.gms.measurement.internal.zzjm.zzb, com.google.android.gms.measurement.internal.zzjm.zza, zzb);
    }

    protected final java.lang.String zzc(java.lang.String str) {
        if (str == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return zzg(str, com.google.android.gms.measurement.internal.zzjn.zzb, com.google.android.gms.measurement.internal.zzjn.zza, zzc);
        }
        return "experiment_id(" + str + ")";
    }

    protected final java.lang.String zzd(com.google.android.gms.measurement.internal.zzbg zzbgVar) {
        com.google.android.gms.measurement.internal.zzgl zzglVar = this.zzd;
        if (!zzglVar.zza()) {
            return zzbgVar.toString();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("origin=");
        sb.append(zzbgVar.zzc);
        sb.append(",name=");
        sb.append(zza(zzbgVar.zza));
        sb.append(",params=");
        com.google.android.gms.measurement.internal.zzbe zzbeVar = zzbgVar.zzb;
        sb.append(zzbeVar == null ? null : !zzglVar.zza() ? zzbeVar.toString() : zze(zzbeVar.zzf()));
        return sb.toString();
    }

    protected final java.lang.String zze(android.os.Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return bundle.toString();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Bundle[{");
        for (java.lang.String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(zzb(str));
            sb.append(com.ironsource.X3.j.b);
            java.lang.Object obj = bundle.get(str);
            sb.append(obj instanceof android.os.Bundle ? zzf(new java.lang.Object[]{obj}) : obj instanceof java.lang.Object[] ? zzf((java.lang.Object[]) obj) : obj instanceof java.util.ArrayList ? zzf(((java.util.ArrayList) obj).toArray()) : java.lang.String.valueOf(obj));
        }
        sb.append("}]");
        return sb.toString();
    }

    protected final java.lang.String zzf(java.lang.Object[] objArr) {
        if (objArr == null) {
            return okhttp3.HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(com.ironsource.X3.j.d);
        for (java.lang.Object obj : objArr) {
            java.lang.String zze = obj instanceof android.os.Bundle ? zze((android.os.Bundle) obj) : java.lang.String.valueOf(obj);
            if (zze != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(zze);
            }
        }
        sb.append(com.ironsource.X3.j.e);
        return sb.toString();
    }
}
