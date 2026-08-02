package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbzl extends com.google.android.libraries.places.internal.zzbmx {
    private final boolean zza;
    private final com.google.android.libraries.places.internal.zzbov zzb;

    public zzbzl(boolean z, int i, int i2, com.google.android.libraries.places.internal.zzbov zzbovVar) {
        this.zza = z;
        this.zzb = (com.google.android.libraries.places.internal.zzbov) com.google.common.base.Preconditions.checkNotNull(zzbovVar, "autoLoadBalancerFactory");
    }

    @Override // com.google.android.libraries.places.internal.zzbmx
    public final com.google.android.libraries.places.internal.zzbms zza(java.util.Map map) {
        java.lang.Object zzc;
        com.google.android.libraries.places.internal.zzbze zzbzeVar;
        com.google.android.libraries.places.internal.zzbwb zzbwbVar;
        java.util.Map zzd;
        try {
            com.google.android.libraries.places.internal.zzbms zza = this.zzb.zza(map);
            com.google.android.libraries.places.internal.zzbvz zzbvzVar = null;
            if (zza == null) {
                zzc = null;
            } else {
                if (zza.zzd() != null) {
                    return com.google.android.libraries.places.internal.zzbms.zzb(zza.zzd());
                }
                zzc = zza.zzc();
            }
            boolean z = this.zza;
            if (!z || map == null || (zzd = com.google.android.libraries.places.internal.zzbud.zzd(map, "retryThrottling")) == null) {
                zzbzeVar = null;
            } else {
                float floatValue = com.google.android.libraries.places.internal.zzbud.zze(zzd, "maxTokens").floatValue();
                float floatValue2 = com.google.android.libraries.places.internal.zzbud.zze(zzd, "tokenRatio").floatValue();
                com.google.common.base.Preconditions.checkState(floatValue > 0.0f, "maxToken should be greater than zero");
                com.google.common.base.Preconditions.checkState(floatValue2 > 0.0f, "tokenRatio should be greater than zero");
                zzbzeVar = new com.google.android.libraries.places.internal.zzbze(floatValue, floatValue2);
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.HashMap hashMap2 = new java.util.HashMap();
            java.util.Map zzd2 = map == null ? null : com.google.android.libraries.places.internal.zzbud.zzd(map, "healthCheckConfig");
            java.util.List<java.util.Map> zzb = com.google.android.libraries.places.internal.zzbud.zzb(map, "methodConfig");
            if (zzb == null) {
                zzbwbVar = new com.google.android.libraries.places.internal.zzbwb(null, hashMap, hashMap2, zzbzeVar, zzc, zzd2);
            } else {
                for (java.util.Map map2 : zzb) {
                    com.google.android.libraries.places.internal.zzbvz zzbvzVar2 = new com.google.android.libraries.places.internal.zzbvz(map2, z, 5, 5);
                    java.util.List<java.util.Map> zzb2 = com.google.android.libraries.places.internal.zzbud.zzb(map2, "name");
                    if (zzb2 != null && !zzb2.isEmpty()) {
                        for (java.util.Map map3 : zzb2) {
                            java.lang.String zzg = com.google.android.libraries.places.internal.zzbud.zzg(map3, "service");
                            java.lang.String zzg2 = com.google.android.libraries.places.internal.zzbud.zzg(map3, "method");
                            if (com.google.common.base.Strings.isNullOrEmpty(zzg)) {
                                com.google.common.base.Preconditions.checkArgument(com.google.common.base.Strings.isNullOrEmpty(zzg2), "missing service name for method %s", zzg2);
                                com.google.common.base.Preconditions.checkArgument(zzbvzVar == null, "Duplicate default method config in service config %s", map);
                                zzbvzVar = zzbvzVar2;
                            } else if (com.google.common.base.Strings.isNullOrEmpty(zzg2)) {
                                com.google.common.base.Preconditions.checkArgument(!hashMap2.containsKey(zzg), "Duplicate service %s", zzg);
                                hashMap2.put(zzg, zzbvzVar2);
                            } else {
                                java.lang.String zzh = com.google.android.libraries.places.internal.zzbml.zzh(zzg, zzg2);
                                com.google.common.base.Preconditions.checkArgument(!hashMap.containsKey(zzh), "Duplicate method name %s", zzh);
                                hashMap.put(zzh, zzbvzVar2);
                            }
                        }
                    }
                }
                zzbwbVar = new com.google.android.libraries.places.internal.zzbwb(zzbvzVar, hashMap, hashMap2, zzbzeVar, zzc, zzd2);
            }
            return com.google.android.libraries.places.internal.zzbms.zza(zzbwbVar);
        } catch (java.lang.RuntimeException e) {
            return com.google.android.libraries.places.internal.zzbms.zzb(com.google.android.libraries.places.internal.zzbnp.zzc.zze("failed to parse service config").zzd(e));
        }
    }
}
