package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbnc {
    private static final java.util.logging.Logger zza = java.util.logging.Logger.getLogger(com.google.android.libraries.places.internal.zzbnc.class.getName());
    private static com.google.android.libraries.places.internal.zzbnc zzb;
    private java.lang.String zzc;
    private final java.util.LinkedHashSet zzd;
    private com.google.common.collect.ImmutableMap zze;

    public zzbnc() {
        new com.google.android.libraries.places.internal.zzbna(this, null);
        this.zzc = "unknown";
        this.zzd = new java.util.LinkedHashSet();
        this.zze = com.google.common.collect.ImmutableMap.of();
    }

    public static com.google.android.libraries.places.internal.zzbnc zzc() {
        com.google.android.libraries.places.internal.zzbnc zzbncVar;
        synchronized (com.google.android.libraries.places.internal.zzbnc.class) {
            if (zzb == null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                try {
                    arrayList.add(java.lang.Class.forName("com.google.android.libraries.places.internal.zzbsf"));
                } catch (java.lang.ClassNotFoundException e) {
                    zza.logp(java.util.logging.Level.FINE, "io.grpc.NameResolverRegistry", "getHardCodedClasses", "Unable to find DNS NameResolver", (java.lang.Throwable) e);
                }
                try {
                    arrayList.add(java.lang.Class.forName("io.grpc.binder.internal.IntentNameResolverProvider"));
                } catch (java.lang.ClassNotFoundException e2) {
                    zza.logp(java.util.logging.Level.FINE, "io.grpc.NameResolverRegistry", "getHardCodedClasses", "Unable to find IntentNameResolverProvider", (java.lang.Throwable) e2);
                }
                java.util.List<com.google.android.libraries.places.internal.zzbmz> zza2 = com.google.android.libraries.places.internal.zzbnl.zza(com.google.android.libraries.places.internal.zzbmz.class, java.util.Collections.unmodifiableList(arrayList), com.google.android.libraries.places.internal.zzbmz.class.getClassLoader(), new com.google.android.libraries.places.internal.zzbnb(null));
                if (zza2.isEmpty()) {
                    zza.logp(java.util.logging.Level.WARNING, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                }
                zzb = new com.google.android.libraries.places.internal.zzbnc();
                for (com.google.android.libraries.places.internal.zzbmz zzbmzVar : zza2) {
                    zza.logp(java.util.logging.Level.FINE, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "Service loader found ".concat(java.lang.String.valueOf(java.lang.String.valueOf(zzbmzVar))));
                    zzb.zze(zzbmzVar);
                }
                zzb.zzf();
            }
            zzbncVar = zzb;
        }
        return zzbncVar;
    }

    private final void zze(com.google.android.libraries.places.internal.zzbmz zzbmzVar) {
        synchronized (this) {
            zzbmzVar.zzc();
            com.google.common.base.Preconditions.checkArgument(true, "isAvailable() returned false");
            this.zzd.add(zzbmzVar);
        }
    }

    private final void zzf() {
        synchronized (this) {
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.Iterator it = this.zzd.iterator();
            java.lang.String str = "unknown";
            char c = 0;
            while (it.hasNext()) {
                com.google.android.libraries.places.internal.zzbmz zzbmzVar = (com.google.android.libraries.places.internal.zzbmz) it.next();
                java.lang.String zzb2 = zzbmzVar.zzb();
                if (((com.google.android.libraries.places.internal.zzbmz) hashMap.get(zzb2)) != null) {
                    zzbmzVar.zzd();
                } else {
                    hashMap.put(zzb2, zzbmzVar);
                }
                zzbmzVar.zzd();
                if (c < 5) {
                    zzbmzVar.zzd();
                    str = zzbmzVar.zzb();
                }
                c = 5;
            }
            this.zze = com.google.common.collect.ImmutableMap.copyOf((java.util.Map) hashMap);
            this.zzc = str;
        }
    }

    public final com.google.android.libraries.places.internal.zzbmz zzb(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return (com.google.android.libraries.places.internal.zzbmz) zzd().get(str.toLowerCase(java.util.Locale.US));
    }

    final java.util.Map zzd() {
        com.google.common.collect.ImmutableMap immutableMap;
        synchronized (this) {
            immutableMap = this.zze;
        }
        return immutableMap;
    }

    public final java.lang.String zza() {
        java.lang.String str;
        synchronized (this) {
            str = this.zzc;
        }
        return str;
    }
}
