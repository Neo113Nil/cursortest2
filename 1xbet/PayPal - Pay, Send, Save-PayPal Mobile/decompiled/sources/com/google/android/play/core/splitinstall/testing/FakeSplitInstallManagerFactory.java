package com.google.android.play.core.splitinstall.testing;

/* loaded from: classes9.dex */
public final class FakeSplitInstallManagerFactory {
    private static com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager zza;

    public static com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager create(android.content.Context context) {
        try {
            java.io.File zzb = com.google.android.play.core.splitinstall.zzu.zza(context).zzb();
            if (zzb == null) {
                throw new com.google.android.play.core.common.LocalTestingException("Failed to retrieve local testing directory path");
            }
            if (zzb.exists()) {
                return create(context, zzb);
            }
            throw new com.google.android.play.core.common.LocalTestingException(java.lang.String.format("Local testing directory not found: %s", zzb));
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public static com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager createNewInstance(android.content.Context context, final java.io.File file) {
        com.google.android.play.core.splitcompat.SplitCompat.install(context);
        return new com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager(context, file, new com.google.android.play.core.splitinstall.zzs(context, context.getPackageName()), new com.google.android.play.core.splitinstall.internal.zzby() { // from class: com.google.android.play.core.splitinstall.testing.zzs
            @Override // com.google.android.play.core.splitinstall.internal.zzby
            public final java.lang.Object zza() {
                return com.google.android.play.core.splitinstall.testing.zzaa.zza(file);
            }
        });
    }

    public static com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager create(android.content.Context context, java.io.File file) {
        com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager fakeSplitInstallManager;
        synchronized (com.google.android.play.core.splitinstall.testing.FakeSplitInstallManagerFactory.class) {
            com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager fakeSplitInstallManager2 = zza;
            if (fakeSplitInstallManager2 == null) {
                zza = createNewInstance(context, file);
            } else if (!fakeSplitInstallManager2.zzc().getAbsolutePath().equals(file.getAbsolutePath())) {
                throw new java.lang.RuntimeException(java.lang.String.format("Different module directories used to initialize FakeSplitInstallManager: '%s' and '%s'", zza.zzc().getAbsolutePath(), file.getAbsolutePath()));
            }
            fakeSplitInstallManager = zza;
        }
        return fakeSplitInstallManager;
    }

    private FakeSplitInstallManagerFactory() {
    }
}
