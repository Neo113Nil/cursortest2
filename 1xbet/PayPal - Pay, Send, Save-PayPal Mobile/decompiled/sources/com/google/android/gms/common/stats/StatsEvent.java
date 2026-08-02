package com.google.android.gms.common.stats;

@java.lang.Deprecated
/* loaded from: classes8.dex */
public abstract class StatsEvent extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {

    public interface Types {
        public static final int EVENT_TYPE_ACQUIRE_WAKE_LOCK = 7;
        public static final int EVENT_TYPE_RELEASE_WAKE_LOCK = 8;
    }

    public final java.lang.String toString() {
        long zza = zza();
        int zzb = zzb();
        java.lang.String zzc = zzc();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zza).length() + 1 + java.lang.String.valueOf(zzb).length() + 3 + zzc.length());
        sb.append(zza);
        sb.append("\t");
        sb.append(zzb);
        sb.append("\t-1");
        sb.append(zzc);
        return sb.toString();
    }

    public abstract long zza();

    public abstract int zzb();

    public abstract java.lang.String zzc();
}
