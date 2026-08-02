package com.google.android.play.core.splitcompat;

/* loaded from: classes9.dex */
public final class zzn {
    private static final java.util.regex.Pattern zza = java.util.regex.Pattern.compile("lib/([^/]+)/(.*\\.so)$");
    private final com.google.android.play.core.splitcompat.zze zzb;

    static /* synthetic */ java.util.Set zza(com.google.android.play.core.splitcompat.zzn zznVar, java.util.Set set, com.google.android.play.core.splitcompat.zzt zztVar, java.util.zip.ZipFile zipFile) {
        java.util.HashSet hashSet = new java.util.HashSet();
        zznVar.zzf(zztVar, set, new com.google.android.play.core.splitcompat.zzj(zznVar, hashSet, zztVar, zipFile));
        return hashSet;
    }

    private static void zze(com.google.android.play.core.splitcompat.zzt zztVar, com.google.android.play.core.splitcompat.zzk zzkVar) throws java.io.IOException {
        java.util.zip.ZipFile zipFile;
        try {
            zipFile = new java.util.zip.ZipFile(zztVar.zza());
        } catch (java.io.IOException e) {
            e = e;
            zipFile = null;
        }
        try {
            java.lang.String zzb = zztVar.zzb();
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.Enumeration<? extends java.util.zip.ZipEntry> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                java.util.zip.ZipEntry nextElement = entries.nextElement();
                java.util.regex.Matcher matcher = zza.matcher(nextElement.getName());
                if (matcher.matches()) {
                    java.lang.String group = matcher.group(1);
                    java.lang.String group2 = matcher.group(2);
                    new java.lang.Object[]{zzb, group2, group};
                    java.util.Set set = (java.util.Set) hashMap.get(group);
                    if (set == null) {
                        set = new java.util.HashSet();
                        hashMap.put(group, set);
                    }
                    set.add(new com.google.android.play.core.splitcompat.zzm(nextElement, group2));
                }
            }
            java.util.HashMap hashMap2 = new java.util.HashMap();
            for (java.lang.String str : android.os.Build.SUPPORTED_ABIS) {
                if (hashMap.containsKey(str)) {
                    new java.lang.Object[]{str};
                    for (com.google.android.play.core.splitcompat.zzm zzmVar : (java.util.Set) hashMap.get(str)) {
                        if (hashMap2.containsKey(zzmVar.zza)) {
                            new java.lang.Object[]{zzmVar.zza, str};
                        } else {
                            hashMap2.put(zzmVar.zza, zzmVar);
                            new java.lang.Object[]{zzmVar.zza, str};
                        }
                    }
                } else {
                    new java.lang.Object[]{str};
                }
            }
            zzkVar.zza(zipFile, new java.util.HashSet(hashMap2.values()));
            zipFile.close();
        } catch (java.io.IOException e2) {
            e = e2;
            if (zipFile != null) {
                try {
                    zipFile.close();
                } catch (java.io.IOException e3) {
                    java.lang.Throwable.class.getDeclaredMethod("addSuppressed", java.lang.Throwable.class).invoke(e, e3);
                }
            }
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzf(com.google.android.play.core.splitcompat.zzt zztVar, java.util.Set set, com.google.android.play.core.splitcompat.zzl zzlVar) throws java.io.IOException {
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            com.google.android.play.core.splitcompat.zzm zzmVar = (com.google.android.play.core.splitcompat.zzm) it.next();
            java.io.File zzc = this.zzb.zzc(zztVar.zzb(), zzmVar.zza);
            boolean z = false;
            if (zzc.exists() && zzc.length() == zzmVar.zzb.getSize() && com.google.android.play.core.splitcompat.zze.zzp(zzc)) {
                z = true;
            }
            zzlVar.zza(zzmVar, zzc, z);
        }
    }

    final java.util.Set zzb(com.google.android.play.core.splitcompat.zzt zztVar) throws java.io.IOException {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(true);
        java.util.HashSet hashSet = new java.util.HashSet();
        zze(zztVar, new com.google.android.play.core.splitcompat.zzh(this, zztVar, hashSet, atomicBoolean));
        if (atomicBoolean.get()) {
            return hashSet;
        }
        return null;
    }

    final java.util.Set zzc() throws java.io.IOException {
        java.util.Set<com.google.android.play.core.splitcompat.zzt> zzj = this.zzb.zzj();
        for (java.lang.String str : this.zzb.zzh()) {
            java.util.Iterator it = zzj.iterator();
            while (true) {
                if (!it.hasNext()) {
                    new java.lang.Object[]{str};
                    this.zzb.zzn(str);
                    break;
                }
                if (((com.google.android.play.core.splitcompat.zzt) it.next()).zzb().equals(str)) {
                    break;
                }
            }
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        for (com.google.android.play.core.splitcompat.zzt zztVar : zzj) {
            java.util.HashSet hashSet2 = new java.util.HashSet();
            zze(zztVar, new com.google.android.play.core.splitcompat.zzi(this, hashSet2, zztVar));
            for (java.io.File file : this.zzb.zzi(zztVar.zzb())) {
                if (!hashSet2.contains(file)) {
                    new java.lang.Object[]{file.getAbsolutePath(), zztVar.zzb(), zztVar.zza().getAbsolutePath()};
                    this.zzb.zzo(file);
                }
            }
            hashSet.addAll(hashSet2);
        }
        return hashSet;
    }

    zzn(com.google.android.play.core.splitcompat.zze zzeVar) throws java.io.IOException {
        this.zzb = zzeVar;
    }
}
