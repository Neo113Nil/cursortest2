package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzrd {
    private static final java.util.WeakHashMap zza = new java.util.WeakHashMap();
    private static final java.util.WeakHashMap zzb = new java.util.WeakHashMap();

    public static void zza(java.lang.Throwable th) {
        java.lang.Throwable th2;
        com.google.android.libraries.places.internal.zzsf zzsfVar;
        com.google.android.libraries.places.internal.zzrv zzrvVar;
        java.util.WeakHashMap weakHashMap = zzb;
        synchronized (weakHashMap) {
            th2 = th;
            while (th2 != null) {
                try {
                    if (weakHashMap.containsKey(th2)) {
                        break;
                    } else {
                        th2 = th2.getCause();
                    }
                } catch (java.lang.Throwable th3) {
                    throw th3;
                }
            }
            weakHashMap.put(th, java.lang.Boolean.valueOf(th2 != null));
        }
        if (th2 == null) {
            com.google.common.base.Preconditions.checkState(true, "Trace uncaught exception is disabled.");
            java.util.WeakHashMap weakHashMap2 = zza;
            synchronized (weakHashMap2) {
                java.lang.Throwable th4 = th;
                while (th4 != null) {
                    if (weakHashMap2.containsKey(th4)) {
                        break;
                    } else {
                        th4 = th4.getCause();
                    }
                }
                if (th4 == null) {
                    zzsfVar = null;
                } else {
                    com.google.android.libraries.places.internal.zzrz zzrzVar = (com.google.android.libraries.places.internal.zzrz) weakHashMap2.get(th4);
                    weakHashMap2.put(th, zzrzVar);
                    zzsfVar = new com.google.android.libraries.places.internal.zzsf(th4, zzrzVar);
                }
            }
            if (zzsfVar != null || (zzrvVar = com.google.android.libraries.places.internal.zzrh.zzd().zzb) == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (zzrvVar = com.google.android.libraries.places.internal.zzrh.zzd().zzb; zzrvVar != null; zzrvVar = null) {
                arrayList.add(zzrvVar);
            }
            com.google.android.libraries.places.internal.zzqy zzqyVar = new com.google.android.libraries.places.internal.zzqy();
            zzqyVar.zzc(((com.google.android.libraries.places.internal.zzrv) arrayList.get(0)).zzc());
            ((com.google.android.libraries.places.internal.zzrv) arrayList.get(0)).zzi();
            zzqyVar.zzd(-1L);
            com.google.common.collect.ImmutableList.Builder builderWithExpectedSize = com.google.common.collect.ImmutableList.builderWithExpectedSize(arrayList.size());
            com.google.common.collect.ImmutableList.Builder builderWithExpectedSize2 = com.google.common.collect.ImmutableList.builderWithExpectedSize(arrayList.size());
            for (com.google.android.libraries.places.internal.zzrv zzrvVar2 : com.google.common.collect.Lists.reverse(arrayList)) {
                builderWithExpectedSize2.add((com.google.common.collect.ImmutableList.Builder) zzrvVar2.zze());
                builderWithExpectedSize.add((com.google.common.collect.ImmutableList.Builder) zzrvVar2.zzg());
            }
            synchronized (weakHashMap2) {
                zzqyVar.zza(builderWithExpectedSize2.build());
                zzqyVar.zzb(builderWithExpectedSize.build());
                weakHashMap2.put(th, zzqyVar.zze());
            }
        }
    }
}
