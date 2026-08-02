package com.google.android.play.core.splitinstall.internal;

/* loaded from: classes9.dex */
final class zzay implements com.google.android.play.core.splitinstall.internal.zzan {
    public static void zzc(java.lang.ClassLoader classLoader, java.util.Set set, com.google.android.play.core.splitinstall.internal.zzax zzaxVar) {
        if (set.isEmpty()) {
            return;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(((java.io.File) it.next()).getParentFile());
        }
        java.lang.Object zzc = com.google.android.play.core.splitinstall.internal.zzat.zzc(classLoader);
        com.google.android.play.core.splitinstall.internal.zzbj zzb = com.google.android.play.core.splitinstall.internal.zzbk.zzb(zzc, "nativeLibraryDirectories", java.util.List.class);
        synchronized (com.google.android.play.core.splitinstall.zzn.class) {
            java.util.ArrayList arrayList = new java.util.ArrayList((java.util.Collection) zzb.zzc());
            hashSet.removeAll(arrayList);
            arrayList.addAll(hashSet);
            zzb.zze(arrayList);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.Object[] zza = zzaxVar.zza(zzc, new java.util.ArrayList(hashSet), null, arrayList2);
        if (arrayList2.isEmpty()) {
            synchronized (com.google.android.play.core.splitinstall.zzn.class) {
                com.google.android.play.core.splitinstall.internal.zzbk.zza(zzc, "nativeLibraryPathElements", java.lang.Object.class).zzb(java.util.Arrays.asList(zza));
            }
            return;
        }
        com.google.android.play.core.splitinstall.internal.zzbh zzbhVar = new com.google.android.play.core.splitinstall.internal.zzbh("Error in makePathElements");
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            try {
                java.lang.Throwable.class.getDeclaredMethod("addSuppressed", java.lang.Throwable.class).invoke(zzbhVar, (java.io.IOException) arrayList2.get(i));
            } catch (java.lang.Exception unused) {
            }
        }
        throw zzbhVar;
    }

    public static boolean zzd(java.lang.ClassLoader classLoader, java.io.File file, java.io.File file2, boolean z, java.lang.String str) {
        return com.google.android.play.core.splitinstall.internal.zzat.zze(classLoader, file, file2, z, new com.google.android.play.core.splitinstall.internal.zzav(), "zip", new com.google.android.play.core.splitinstall.internal.zzaq());
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzan
    public final void zza(java.lang.ClassLoader classLoader, java.util.Set set) {
        zzc(classLoader, set, new com.google.android.play.core.splitinstall.internal.zzaw());
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzan
    public final boolean zzb(java.lang.ClassLoader classLoader, java.io.File file, java.io.File file2, boolean z) {
        return zzd(classLoader, file, file2, z, "zip");
    }

    zzay() {
    }
}
