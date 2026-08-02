package com.google.android.play.core.splitinstall.internal;

/* loaded from: classes9.dex */
final class zzat implements com.google.android.play.core.splitinstall.internal.zzan {
    static java.lang.Object zzc(java.lang.ClassLoader classLoader) {
        return com.google.android.play.core.splitinstall.internal.zzbk.zzb(classLoader, "pathList", java.lang.Object.class).zzc();
    }

    static void zzd(java.lang.ClassLoader classLoader, java.util.Set set) {
        if (set.isEmpty()) {
            return;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            java.io.File file = (java.io.File) it.next();
            file.getParentFile().getAbsolutePath();
            hashSet.add(file.getParentFile());
        }
        com.google.android.play.core.splitinstall.internal.zzbi zza = com.google.android.play.core.splitinstall.internal.zzbk.zza(zzc(classLoader), "nativeLibraryDirectories", java.io.File.class);
        hashSet.removeAll(java.util.Arrays.asList((java.io.File[]) zza.zzc()));
        synchronized (com.google.android.play.core.splitinstall.zzn.class) {
            hashSet.size();
            zza.zzb(hashSet);
        }
    }

    static boolean zze(java.lang.ClassLoader classLoader, java.io.File file, java.io.File file2, boolean z, com.google.android.play.core.splitinstall.internal.zzas zzasVar, java.lang.String str, com.google.android.play.core.splitinstall.internal.zzar zzarVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.Object zzc = zzc(classLoader);
        com.google.android.play.core.splitinstall.internal.zzbi zza = com.google.android.play.core.splitinstall.internal.zzbk.zza(zzc, "dexElements", java.lang.Object.class);
        java.util.List asList = java.util.Arrays.asList((java.lang.Object[]) zza.zzc());
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = asList.iterator();
        while (it.hasNext()) {
            arrayList2.add((java.io.File) com.google.android.play.core.splitinstall.internal.zzbk.zzb(it.next(), str, java.io.File.class).zzc());
        }
        if (arrayList2.contains(file2)) {
            return true;
        }
        if (!z && !zzarVar.zza(zzc, file2, file)) {
            file2.getPath();
            return false;
        }
        zza.zza(java.util.Arrays.asList(zzasVar.zza(zzc, new java.util.ArrayList(java.util.Collections.singleton(file2)), file, arrayList)));
        if (arrayList.isEmpty()) {
            return true;
        }
        com.google.android.play.core.splitinstall.internal.zzbh zzbhVar = new com.google.android.play.core.splitinstall.internal.zzbh("DexPathList.makeDexElement failed");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                java.lang.Throwable.class.getDeclaredMethod("addSuppressed", java.lang.Throwable.class).invoke(zzbhVar, (java.io.IOException) arrayList.get(i));
            } catch (java.lang.Exception unused) {
            }
        }
        com.google.android.play.core.splitinstall.internal.zzbk.zza(zzc, "dexElementsSuppressedExceptions", java.io.IOException.class).zza(arrayList);
        throw zzbhVar;
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzan
    public final void zza(java.lang.ClassLoader classLoader, java.util.Set set) {
        zzd(classLoader, set);
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzan
    public final boolean zzb(java.lang.ClassLoader classLoader, java.io.File file, java.io.File file2, boolean z) {
        return zze(classLoader, file, file2, z, new com.google.android.play.core.splitinstall.internal.zzap(), "zip", new com.google.android.play.core.splitinstall.internal.zzaq());
    }

    zzat() {
    }
}
