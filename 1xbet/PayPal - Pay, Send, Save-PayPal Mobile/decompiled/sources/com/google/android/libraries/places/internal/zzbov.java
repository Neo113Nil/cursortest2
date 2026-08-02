package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbov {
    private final com.google.android.libraries.places.internal.zzblt zza;
    private final java.lang.String zzb = (java.lang.String) com.google.common.base.Preconditions.checkNotNull("pick_first", "defaultPolicy");

    zzbov(com.google.android.libraries.places.internal.zzblt zzbltVar, java.lang.String str) {
        this.zza = (com.google.android.libraries.places.internal.zzblt) com.google.common.base.Preconditions.checkNotNull(zzbltVar, "registry");
    }

    @javax.annotation.Nullable
    final com.google.android.libraries.places.internal.zzbms zza(java.util.Map map) {
        java.util.List<com.google.android.libraries.places.internal.zzbzr> unmodifiableList;
        java.lang.String zzg;
        if (map != null) {
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                if (map.containsKey("loadBalancingConfig")) {
                    arrayList.addAll(com.google.android.libraries.places.internal.zzbud.zzb(map, "loadBalancingConfig"));
                }
                if (arrayList.isEmpty() && (zzg = com.google.android.libraries.places.internal.zzbud.zzg(map, "loadBalancingPolicy")) != null) {
                    arrayList.add(java.util.Collections.singletonMap(zzg.toLowerCase(java.util.Locale.ROOT), java.util.Collections.emptyMap()));
                }
                java.util.List<java.util.Map> unmodifiableList2 = java.util.Collections.unmodifiableList(arrayList);
                if (unmodifiableList2 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (java.util.Map map2 : unmodifiableList2) {
                        if (map2.size() != 1) {
                            int size = map2.size();
                            java.lang.String valueOf = java.lang.String.valueOf(map2);
                            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(size).length() + 83 + java.lang.String.valueOf(valueOf).length());
                            sb.append("There are ");
                            sb.append(size);
                            sb.append(" fields in a LoadBalancingConfig object. Exactly one is expected. Config=");
                            sb.append(valueOf);
                            throw new java.lang.RuntimeException(sb.toString());
                        }
                        java.lang.String str = (java.lang.String) ((java.util.Map.Entry) map2.entrySet().iterator().next()).getKey();
                        arrayList2.add(new com.google.android.libraries.places.internal.zzbzr(str, com.google.android.libraries.places.internal.zzbud.zzd(map2, str)));
                    }
                    unmodifiableList = java.util.Collections.unmodifiableList(arrayList2);
                    if (unmodifiableList != null || unmodifiableList.isEmpty()) {
                        return null;
                    }
                    com.google.android.libraries.places.internal.zzblt zzbltVar = this.zza;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    for (com.google.android.libraries.places.internal.zzbzr zzbzrVar : unmodifiableList) {
                        java.lang.String zza = zzbzrVar.zza();
                        com.google.android.libraries.places.internal.zzblr zzb = zzbltVar.zzb(zza);
                        if (zzb != null) {
                            if (!arrayList3.isEmpty()) {
                                java.util.logging.Logger.getLogger(com.google.android.libraries.places.internal.zzbzt.class.getName()).logp(java.util.logging.Level.FINEST, "io.grpc.internal.ServiceConfigUtil", "selectLbPolicyFromList", "{0} specified by Service Config are not available", arrayList3);
                            }
                            com.google.android.libraries.places.internal.zzbms zze = zzb.zze(zzbzrVar.zzb());
                            return zze.zzd() == null ? com.google.android.libraries.places.internal.zzbms.zza(new com.google.android.libraries.places.internal.zzbzs(zzb, zze.zzc())) : zze;
                        }
                        arrayList3.add(zza);
                    }
                    com.google.android.libraries.places.internal.zzbnp zzbnpVar = com.google.android.libraries.places.internal.zzbnp.zzc;
                    java.lang.String obj = arrayList3.toString();
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder(obj.length() + 51);
                    sb2.append("None of ");
                    sb2.append(obj);
                    sb2.append(" specified by Service Config are available.");
                    return com.google.android.libraries.places.internal.zzbms.zzb(zzbnpVar.zze(sb2.toString()));
                }
            } catch (java.lang.RuntimeException e) {
                return com.google.android.libraries.places.internal.zzbms.zzb(com.google.android.libraries.places.internal.zzbnp.zzc.zze("can't parse load balancer configuration").zzd(e));
            }
        }
        unmodifiableList = null;
        if (unmodifiableList != null) {
        }
        return null;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzblr zzb(java.lang.String str, java.lang.String str2) {
        com.google.android.libraries.places.internal.zzblr zzb = this.zza.zzb(str);
        if (zzb != null) {
            return zzb;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 68);
        sb.append("Trying to load '");
        sb.append(str);
        sb.append("' because using default policy, but it's unavailable");
        throw new com.google.android.libraries.places.internal.zzbou(sb.toString(), null);
    }

    final /* synthetic */ java.lang.String zzd() {
        return this.zzb;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzblt zzc() {
        return this.zza;
    }
}
