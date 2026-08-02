package com.google.android.play.core.splitcompat;

/* loaded from: classes.dex */
public class SplitCompat {
    public static final /* synthetic */ int zza = 0;
    private static final java.util.concurrent.atomic.AtomicReference zzb = new java.util.concurrent.atomic.AtomicReference(null);
    private final com.google.android.play.core.splitcompat.zze zzc;
    private final com.google.android.play.core.splitinstall.zzbe zzd;
    private final java.util.Set zze = new java.util.HashSet();
    private final com.google.android.play.core.splitcompat.zza zzf;

    private SplitCompat(android.content.Context context) {
        try {
            com.google.android.play.core.splitcompat.zze zzeVar = new com.google.android.play.core.splitcompat.zze(context);
            this.zzc = zzeVar;
            this.zzf = new com.google.android.play.core.splitcompat.zza(zzeVar);
            this.zzd = new com.google.android.play.core.splitinstall.zzbe(context);
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            throw new com.google.android.play.core.splitinstall.internal.zzbh("Failed to initialize FileStorage", e);
        }
    }

    public static boolean install(android.content.Context context) {
        return zzi(context, false);
    }

    public static boolean installActivity(android.content.Context context) {
        if (zzj()) {
            return false;
        }
        com.google.android.play.core.splitcompat.SplitCompat splitCompat = (com.google.android.play.core.splitcompat.SplitCompat) zzb.get();
        if (splitCompat != null) {
            return splitCompat.zzf.zzb(context, splitCompat.zzf());
        }
        if (context.getApplicationContext() != null) {
            install(context.getApplicationContext());
        }
        return install(context);
    }

    public static boolean zzd(android.content.Context context) {
        return zzi(context, true);
    }

    public static boolean zze() {
        return zzb.get() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.Set zzf() {
        java.util.HashSet hashSet;
        synchronized (this.zze) {
            hashSet = new java.util.HashSet(this.zze);
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg(java.util.Set set) throws java.io.IOException {
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            com.google.android.play.core.splitcompat.zze.zzl(this.zzc.zzg((java.lang.String) it.next()));
        }
        this.zzd.zzb();
    }

    private final void zzh(android.content.Context context, boolean z) throws java.io.IOException {
        java.util.zip.ZipFile zipFile;
        synchronized (this) {
            if (z) {
                this.zzc.zzk();
            } else {
                com.google.android.play.core.splitcompat.zzd.zza().execute(new com.google.android.play.core.splitcompat.zzq(this));
            }
            java.lang.String packageName = context.getPackageName();
            try {
                android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
                java.util.List<java.lang.String> arrayList = packageInfo.splitNames == null ? new java.util.ArrayList() : java.util.Arrays.asList(packageInfo.splitNames);
                java.util.Set<com.google.android.play.core.splitcompat.zzt> zzj = this.zzc.zzj();
                java.util.Set zza2 = this.zzd.zza();
                java.util.HashSet hashSet = new java.util.HashSet();
                java.util.Iterator it = zzj.iterator();
                while (it.hasNext()) {
                    java.lang.String zzb2 = ((com.google.android.play.core.splitcompat.zzt) it.next()).zzb();
                    if (arrayList.contains(zzb2) || zza2.contains(com.google.android.play.core.splitinstall.zzs.zzb(zzb2))) {
                        hashSet.add(zzb2);
                        it.remove();
                    }
                }
                if (z) {
                    zzg(hashSet);
                } else if (!hashSet.isEmpty()) {
                    com.google.android.play.core.splitcompat.zzd.zza().execute(new com.google.android.play.core.splitcompat.zzr(this, hashSet));
                }
                java.util.HashSet hashSet2 = new java.util.HashSet();
                java.util.Iterator it2 = zzj.iterator();
                while (it2.hasNext()) {
                    java.lang.String zzb3 = ((com.google.android.play.core.splitcompat.zzt) it2.next()).zzb();
                    if (!com.google.android.play.core.splitinstall.zzs.zze(zzb3)) {
                        hashSet2.add(zzb3);
                    }
                }
                for (java.lang.String str : arrayList) {
                    if (!com.google.android.play.core.splitinstall.zzs.zze(str)) {
                        hashSet2.add(str);
                    }
                }
                java.util.HashSet<com.google.android.play.core.splitcompat.zzt> hashSet3 = new java.util.HashSet(zzj.size());
                for (com.google.android.play.core.splitcompat.zzt zztVar : zzj) {
                    if (zztVar.zzb().startsWith("config.") || hashSet2.contains(com.google.android.play.core.splitinstall.zzs.zzb(zztVar.zzb()))) {
                        hashSet3.add(zztVar);
                    }
                }
                com.google.android.play.core.splitcompat.zzn zznVar = new com.google.android.play.core.splitcompat.zzn(this.zzc);
                com.google.android.play.core.splitinstall.internal.zzan zza3 = com.google.android.play.core.splitinstall.internal.zzao.zza();
                java.lang.ClassLoader classLoader = context.getClassLoader();
                if (z) {
                    zza3.zza(classLoader, zznVar.zzc());
                } else {
                    java.util.Iterator it3 = hashSet3.iterator();
                    while (it3.hasNext()) {
                        java.util.Set zzb4 = zznVar.zzb((com.google.android.play.core.splitcompat.zzt) it3.next());
                        if (zzb4 == null) {
                            it3.remove();
                        } else {
                            zza3.zza(classLoader, zzb4);
                        }
                    }
                }
                java.util.HashSet hashSet4 = new java.util.HashSet();
                for (com.google.android.play.core.splitcompat.zzt zztVar2 : hashSet3) {
                    try {
                        zipFile = new java.util.zip.ZipFile(zztVar2.zza());
                    } catch (java.io.IOException e) {
                        e = e;
                        zipFile = null;
                    }
                    try {
                        java.util.zip.ZipEntry entry = zipFile.getEntry("classes.dex");
                        zipFile.close();
                        if (entry != null && !zza3.zzb(classLoader, this.zzc.zza(zztVar2.zzb()), zztVar2.zza(), z)) {
                            zztVar2.zza();
                        }
                        hashSet4.add(zztVar2.zza());
                    } catch (java.io.IOException e2) {
                        e = e2;
                        if (zipFile != null) {
                            try {
                                zipFile.close();
                            } catch (java.io.IOException e3) {
                                try {
                                    java.lang.Throwable.class.getDeclaredMethod("addSuppressed", java.lang.Throwable.class).invoke(e, e3);
                                } catch (java.lang.Exception unused) {
                                }
                            }
                        }
                        throw e;
                    }
                }
                this.zzf.zza(context, hashSet4);
                java.util.HashSet hashSet5 = new java.util.HashSet();
                for (com.google.android.play.core.splitcompat.zzt zztVar3 : hashSet3) {
                    if (hashSet4.contains(zztVar3.zza())) {
                        zztVar3.zzb();
                        hashSet5.add(zztVar3.zzb());
                    } else {
                        zztVar3.zzb();
                    }
                }
                synchronized (this.zze) {
                    this.zze.addAll(hashSet5);
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException e4) {
                throw new java.io.IOException(java.lang.String.format("Cannot load data for application '%s'", packageName), e4);
            }
        }
    }

    private static boolean zzi(final android.content.Context context, boolean z) {
        boolean z2;
        if (zzj()) {
            return false;
        }
        java.util.concurrent.atomic.AtomicReference atomicReference = zzb;
        com.google.android.play.core.splitcompat.SplitCompat splitCompat = new com.google.android.play.core.splitcompat.SplitCompat(context);
        while (true) {
            if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, null, splitCompat)) {
                z2 = true;
                break;
            }
            if (atomicReference.get() != null) {
                z2 = false;
                break;
            }
        }
        com.google.android.play.core.splitcompat.SplitCompat splitCompat2 = (com.google.android.play.core.splitcompat.SplitCompat) zzb.get();
        if (z2) {
            com.google.android.play.core.splitinstall.zzo.INSTANCE.zzb(new com.google.android.play.core.splitinstall.internal.zzak(context, com.google.android.play.core.splitcompat.zzd.zza(), new com.google.android.play.core.splitinstall.internal.zzam(context, splitCompat2.zzc, new com.google.android.play.core.splitinstall.internal.zzah()), splitCompat2.zzc, new com.google.android.play.core.splitcompat.zzs()));
            com.google.android.play.core.splitinstall.zzr.zzb(new com.google.android.play.core.splitcompat.zzp(splitCompat2));
            com.google.android.play.core.splitcompat.zzd.zza().execute(new java.lang.Runnable() { // from class: com.google.android.play.core.splitcompat.zzo
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        com.google.android.play.core.splitinstall.zzx.zzg(context).zzc(true);
                    } catch (java.lang.SecurityException unused) {
                    }
                }
            });
        }
        try {
            splitCompat2.zzh(context, z);
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    private static boolean zzj() {
        return false;
    }
}
