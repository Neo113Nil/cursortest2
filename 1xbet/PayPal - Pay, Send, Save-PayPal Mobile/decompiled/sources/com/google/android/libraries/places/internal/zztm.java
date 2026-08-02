package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public abstract class zztm implements com.google.android.libraries.places.internal.zztn {
    public static final com.google.android.libraries.places.internal.zztm zza = new com.google.android.libraries.places.internal.zztk();

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LogSite{ class=");
        sb.append(zza());
        sb.append(", method=");
        sb.append(zzb());
        sb.append(", line=");
        sb.append(zzc());
        if (zzd() != null) {
            sb.append(", file=");
            sb.append(zzd());
        }
        if (zze() != null) {
            sb.append(", filePath=");
            sb.append(zze());
        }
        sb.append(" }");
        return sb.toString();
    }

    public abstract java.lang.String zza();

    public abstract java.lang.String zzb();

    public abstract int zzc();

    public abstract java.lang.String zzd();

    public java.lang.String zze() {
        return null;
    }
}
