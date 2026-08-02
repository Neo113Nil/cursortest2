package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbmn {
    private static com.google.android.libraries.places.internal.zzbmn zza;
    private final java.lang.Object zzb = new java.lang.Object();
    private final java.util.Set zzc = new java.util.HashSet();
    private com.google.android.libraries.places.internal.zzbmm[] zzd = new com.google.android.libraries.places.internal.zzbmm[5];
    private int zze;

    zzbmn() {
    }

    public static com.google.android.libraries.places.internal.zzbmn zza() {
        com.google.android.libraries.places.internal.zzbmn zzbmnVar;
        synchronized (com.google.android.libraries.places.internal.zzbmn.class) {
            if (zza == null) {
                zza = new com.google.android.libraries.places.internal.zzbmn();
            }
            zzbmnVar = zza;
        }
        return zzbmnVar;
    }

    private final void zze() {
        com.google.android.libraries.places.internal.zzbmm[] zzbmmVarArr = this.zzd;
        this.zzd = (com.google.android.libraries.places.internal.zzbmm[]) java.util.Arrays.copyOf(zzbmmVarArr, zzbmmVarArr.length + 5);
    }

    public final java.util.List zzb() {
        java.util.List unmodifiableList;
        synchronized (this.zzb) {
            unmodifiableList = java.util.Collections.unmodifiableList(java.util.Arrays.asList((com.google.android.libraries.places.internal.zzbmm[]) java.util.Arrays.copyOfRange(this.zzd, 0, this.zze)));
        }
        return unmodifiableList;
    }

    public final com.google.android.libraries.places.internal.zzblu zzc(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, java.util.List list2, boolean z) {
        com.google.android.libraries.places.internal.zzblu zzbluVar;
        com.google.common.base.Preconditions.checkArgument(!com.google.common.base.Strings.isNullOrEmpty(str), "missing metric name");
        com.google.common.base.Preconditions.checkNotNull(str2, com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION);
        com.google.common.base.Preconditions.checkNotNull(str3, "unit");
        com.google.common.base.Preconditions.checkNotNull(list, "requiredLabelKeys");
        com.google.common.base.Preconditions.checkNotNull(list2, "optionalLabelKeys");
        synchronized (this.zzb) {
            java.util.Set set = this.zzc;
            if (set.contains(str)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 32);
                sb.append("Metric with name ");
                sb.append(str);
                sb.append(" already exists");
                throw new java.lang.IllegalStateException(sb.toString());
            }
            int i = this.zze;
            if (i + 1 == this.zzd.length) {
                zze();
            }
            zzbluVar = new com.google.android.libraries.places.internal.zzblu(i, str, str2, str3, list, list2, false);
            this.zzd[i] = zzbluVar;
            set.add(str);
            this.zze++;
        }
        return zzbluVar;
    }

    public final com.google.android.libraries.places.internal.zzblv zzd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, java.util.List list2, boolean z) {
        com.google.android.libraries.places.internal.zzblv zzblvVar;
        com.google.common.base.Preconditions.checkArgument(!com.google.common.base.Strings.isNullOrEmpty("grpc.subchannel.open_connections"), "missing metric name");
        com.google.common.base.Preconditions.checkNotNull("EXPERIMENTAL. Number of open connections.", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION);
        com.google.common.base.Preconditions.checkNotNull("{connection}", "unit");
        com.google.common.base.Preconditions.checkNotNull(list, "requiredLabelKeys");
        com.google.common.base.Preconditions.checkNotNull(list2, "optionalLabelKeys");
        synchronized (this.zzb) {
            java.util.Set set = this.zzc;
            if (set.contains("grpc.subchannel.open_connections")) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(64);
                sb.append("Metric with name grpc.subchannel.open_connections already exists");
                throw new java.lang.IllegalStateException(sb.toString());
            }
            int i = this.zze;
            if (i + 1 == this.zzd.length) {
                zze();
            }
            zzblvVar = new com.google.android.libraries.places.internal.zzblv(i, "grpc.subchannel.open_connections", "EXPERIMENTAL. Number of open connections.", "{connection}", list, list2, false);
            this.zzd[i] = zzblvVar;
            set.add("grpc.subchannel.open_connections");
            this.zze++;
        }
        return zzblvVar;
    }
}
