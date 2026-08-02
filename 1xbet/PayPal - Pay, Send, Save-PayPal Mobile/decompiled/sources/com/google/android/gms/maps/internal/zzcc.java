package com.google.android.gms.maps.internal;

/* loaded from: classes8.dex */
public final class zzcc {
    private static final java.lang.String zza = "zzcc";
    private static android.content.Context zzb;
    private static volatile com.google.android.gms.maps.internal.zzf zzc;
    private static final java.util.Queue zzd = new java.util.concurrent.ConcurrentLinkedQueue();

    public static com.google.android.gms.maps.internal.zzf zza(android.content.Context context, com.google.android.gms.maps.MapsInitializer.Renderer renderer) throws com.google.android.gms.common.GooglePlayServicesNotAvailableException {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        java.lang.String str = zza;
        android.util.Log.d(str, "preferredRenderer: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(renderer))));
        if (zzc == null) {
            int isGooglePlayServicesAvailable = com.google.android.gms.common.GooglePlayServicesUtil.isGooglePlayServicesAvailable(context, 13400000);
            if (isGooglePlayServicesAvailable != 0) {
                throw new com.google.android.gms.common.GooglePlayServicesNotAvailableException(isGooglePlayServicesAvailable);
            }
            zzc = zze(context, renderer);
            try {
                int zzd2 = zzc.zzd();
                java.lang.String packageName = context.getPackageName();
                if (zzd2 != 2 || packageName.equals("com.google.android.apps.photos")) {
                    android.util.Log.d(str, "not early loading native code");
                } else {
                    android.util.Log.d(str, "early loading native code");
                    try {
                        zzc.zzn(com.google.android.gms.dynamic.ObjectWrapper.wrap(zzd(context, renderer)));
                    } catch (android.os.RemoteException e) {
                        throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
                    } catch (java.lang.UnsatisfiedLinkError unused) {
                        android.util.Log.w(zza, "Caught UnsatisfiedLinkError attempting to load the LATEST renderer's native library. Attempting to use the LEGACY renderer instead.");
                        zzb = null;
                        zzc = zze(context, com.google.android.gms.maps.MapsInitializer.Renderer.LEGACY);
                    }
                }
                try {
                    zzc.zzl(com.google.android.gms.dynamic.ObjectWrapper.wrap(((android.content.Context) java.util.Objects.requireNonNull(zzd(context, renderer))).getResources()), 20000000);
                    while (true) {
                        java.util.Queue queue = zzd;
                        if (queue.isEmpty()) {
                            break;
                        }
                        try {
                            ((com.google.android.gms.maps.zzaj) com.google.android.gms.common.internal.Preconditions.checkNotNull((com.google.android.gms.maps.zzaj) queue.poll())).zza(zzc);
                        } catch (android.os.RemoteException e2) {
                            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e2);
                        }
                    }
                } catch (android.os.RemoteException e3) {
                    throw new com.google.android.gms.maps.model.RuntimeRemoteException(e3);
                }
            } catch (android.os.RemoteException e4) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e4);
            }
        }
        return zzc;
    }

    public static void zzb(com.google.android.gms.maps.zzaj zzajVar) throws android.os.RemoteException {
        if (zzc != null) {
            zzajVar.zza(zzc);
        } else {
            zzd.add(zzajVar);
        }
    }

    private static android.content.Context zzc(java.lang.Exception exc, android.content.Context context) {
        android.util.Log.e(zza, "Failed to load maps module, use pre-Chimera", exc);
        return com.google.android.gms.common.GooglePlayServicesUtil.getRemoteContext(context);
    }

    private static android.content.Context zzd(android.content.Context context, com.google.android.gms.maps.MapsInitializer.Renderer renderer) {
        android.content.Context zzc2;
        android.content.Context context2 = zzb;
        if (context2 != null) {
            return context2;
        }
        java.lang.String str = renderer == com.google.android.gms.maps.MapsInitializer.Renderer.LEGACY ? "com.google.android.gms.maps_legacy_dynamite" : "com.google.android.gms.maps_core_dynamite";
        try {
            zzc2 = com.google.android.gms.dynamite.DynamiteModule.load(context, com.google.android.gms.dynamite.DynamiteModule.PREFER_REMOTE, str).getModuleContext();
        } catch (java.lang.Exception e) {
            if (str.equals("com.google.android.gms.maps_dynamite")) {
                zzc2 = zzc(e, context);
            } else {
                try {
                    android.util.Log.d(zza, "Attempting to load maps_dynamite again.");
                    zzc2 = com.google.android.gms.dynamite.DynamiteModule.load(context, com.google.android.gms.dynamite.DynamiteModule.PREFER_REMOTE, "com.google.android.gms.maps_dynamite").getModuleContext();
                } catch (java.lang.Exception e2) {
                    zzc2 = zzc(e2, context);
                }
            }
        }
        zzb = zzc2;
        if (zzc2 != null) {
            return zzc2;
        }
        throw new java.lang.RuntimeException("Unable to load maps module, maps container context is null");
    }

    private static com.google.android.gms.maps.internal.zzf zze(android.content.Context context, com.google.android.gms.maps.MapsInitializer.Renderer renderer) {
        android.util.Log.i(zza, "Making Creator dynamically");
        try {
            android.os.IBinder iBinder = (android.os.IBinder) zzf(((java.lang.ClassLoader) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzd(context, renderer).getClassLoader())).loadClass("com.google.android.gms.maps.internal.CreatorImpl"));
            if (iBinder == null) {
                throw new java.lang.RuntimeException("Unable to load maps module, IBinder for com.google.android.gms.maps.internal.CreatorImpl is null");
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
            return queryLocalInterface instanceof com.google.android.gms.maps.internal.zzf ? (com.google.android.gms.maps.internal.zzf) queryLocalInterface : new com.google.android.gms.maps.internal.zze(iBinder);
        } catch (java.lang.ClassNotFoundException e) {
            throw new java.lang.IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl", e);
        }
    }

    private static java.lang.Object zzf(java.lang.Class cls) {
        try {
            return cls.newInstance();
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.IllegalStateException("Unable to call the default constructor of ".concat(java.lang.String.valueOf(cls.getName())), e);
        } catch (java.lang.InstantiationException e2) {
            throw new java.lang.IllegalStateException("Unable to instantiate the dynamic class ".concat(java.lang.String.valueOf(cls.getName())), e2);
        }
    }
}
