package com.google.android.gms.maps;

/* loaded from: classes8.dex */
public final class MapsInitializer {
    private static final java.lang.String zza = "MapsInitializer";
    private static boolean zzb = false;
    private static com.google.android.gms.maps.MapsInitializer.Renderer zzc = com.google.android.gms.maps.MapsInitializer.Renderer.LEGACY;

    public enum Renderer {
        LEGACY,
        LATEST
    }

    public static int initialize(android.content.Context context) {
        int initialize;
        synchronized (com.google.android.gms.maps.MapsInitializer.class) {
            initialize = initialize(context, null, null);
        }
        return initialize;
    }

    public static int initialize(android.content.Context context, com.google.android.gms.maps.MapsInitializer.Renderer renderer, com.google.android.gms.maps.OnMapsSdkInitializedCallback onMapsSdkInitializedCallback) {
        synchronized (com.google.android.gms.maps.MapsInitializer.class) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Context is null");
            if (!zzb) {
                try {
                    com.google.android.gms.maps.internal.zzf zza2 = com.google.android.gms.maps.internal.zzcc.zza(context, renderer);
                    try {
                        com.google.android.gms.maps.CameraUpdateFactory.zza(zza2.zze());
                        com.google.android.gms.maps.model.BitmapDescriptorFactory.zza(zza2.zzj());
                        int i = 1;
                        zzb = true;
                        if (renderer != null) {
                            int ordinal = renderer.ordinal();
                            if (ordinal != 0) {
                                if (ordinal != 1) {
                                    throw new java.lang.RuntimeException(null, null);
                                }
                                i = 2;
                            }
                        } else {
                            i = 0;
                        }
                        try {
                            if (zza2.zzd() == 2) {
                                zzc = com.google.android.gms.maps.MapsInitializer.Renderer.LATEST;
                            }
                            zza2.zzm(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), i);
                        } catch (android.os.RemoteException unused) {
                        }
                        if (onMapsSdkInitializedCallback != null) {
                            onMapsSdkInitializedCallback.onMapsSdkInitialized(zzc);
                        }
                    } catch (android.os.RemoteException e) {
                        throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
                    }
                } catch (com.google.android.gms.common.GooglePlayServicesNotAvailableException e2) {
                    return e2.errorCode;
                }
            } else if (onMapsSdkInitializedCallback != null) {
                onMapsSdkInitializedCallback.onMapsSdkInitialized(zzc);
            }
        }
        return 0;
    }

    private MapsInitializer() {
    }
}
