package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzblt {
    private static final java.util.logging.Logger zza = java.util.logging.Logger.getLogger(com.google.android.libraries.places.internal.zzblt.class.getName());
    private static com.google.android.libraries.places.internal.zzblt zzb;
    private static final java.lang.Iterable zzc;
    private final java.util.LinkedHashSet zzd = new java.util.LinkedHashSet();
    private final java.util.LinkedHashMap zze = new java.util.LinkedHashMap();

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            arrayList.add(java.lang.Class.forName("com.google.android.libraries.places.internal.zzbxj"));
        } catch (java.lang.ClassNotFoundException e) {
            zza.logp(java.util.logging.Level.WARNING, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find pick-first LoadBalancer", (java.lang.Throwable) e);
        }
        try {
            arrayList.add(java.lang.Class.forName("com.google.android.libraries.places.internal.zzcet"));
        } catch (java.lang.ClassNotFoundException e2) {
            zza.logp(java.util.logging.Level.FINE, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find round-robin LoadBalancer", (java.lang.Throwable) e2);
        }
        zzc = java.util.Collections.unmodifiableList(arrayList);
    }

    public static com.google.android.libraries.places.internal.zzblt zza() {
        com.google.android.libraries.places.internal.zzblt zzbltVar;
        synchronized (com.google.android.libraries.places.internal.zzblt.class) {
            if (zzb == null) {
                java.util.List<com.google.android.libraries.places.internal.zzblr> zza2 = com.google.android.libraries.places.internal.zzbnl.zza(com.google.android.libraries.places.internal.zzblr.class, zzc, com.google.android.libraries.places.internal.zzblr.class.getClassLoader(), new com.google.android.libraries.places.internal.zzbls());
                zzb = new com.google.android.libraries.places.internal.zzblt();
                for (com.google.android.libraries.places.internal.zzblr zzblrVar : zza2) {
                    zza.logp(java.util.logging.Level.FINE, "io.grpc.LoadBalancerRegistry", "getDefaultRegistry", "Service loader found ".concat(java.lang.String.valueOf(java.lang.String.valueOf(zzblrVar))));
                    zzb.zzc(zzblrVar);
                }
                zzb.zzd();
            }
            zzbltVar = zzb;
        }
        return zzbltVar;
    }

    private final void zzc(com.google.android.libraries.places.internal.zzblr zzblrVar) {
        synchronized (this) {
            zzblrVar.zzb();
            com.google.common.base.Preconditions.checkArgument(true, "isAvailable() returned false");
            this.zzd.add(zzblrVar);
        }
    }

    private final void zzd() {
        synchronized (this) {
            java.util.LinkedHashMap linkedHashMap = this.zze;
            linkedHashMap.clear();
            java.util.Iterator it = this.zzd.iterator();
            while (it.hasNext()) {
                com.google.android.libraries.places.internal.zzblr zzblrVar = (com.google.android.libraries.places.internal.zzblr) it.next();
                java.lang.String zzd = zzblrVar.zzd();
                if (((com.google.android.libraries.places.internal.zzblr) linkedHashMap.get(zzd)) != null) {
                    zzblrVar.zzc();
                } else {
                    linkedHashMap.put(zzd, zzblrVar);
                }
            }
        }
    }

    @javax.annotation.Nullable
    public final com.google.android.libraries.places.internal.zzblr zzb(java.lang.String str) {
        com.google.android.libraries.places.internal.zzblr zzblrVar;
        synchronized (this) {
            zzblrVar = (com.google.android.libraries.places.internal.zzblr) this.zze.get(com.google.common.base.Preconditions.checkNotNull(str, "policy"));
        }
        return zzblrVar;
    }
}
