package com.google.android.libraries.places.api;

/* loaded from: classes4.dex */
public final class Places {
    private static final com.google.android.libraries.places.internal.zzmp zza = new com.google.android.libraries.places.internal.zzmp();
    private static volatile com.google.android.libraries.places.internal.zzmn zzb;

    public static void addInternalUsageAttributionId(java.lang.String str) {
        com.google.android.libraries.places.internal.zzeo.zza(str);
    }

    public static com.google.android.libraries.places.api.net.PlacesClient createClient(android.content.Context context) {
        com.google.android.libraries.places.api.net.PlacesClient zzb2;
        synchronized (com.google.android.libraries.places.api.Places.class) {
            try {
                com.google.common.base.Preconditions.checkNotNull(context, "Context must not be null.");
                zzb2 = zzb(context, com.google.android.libraries.places.internal.zzmz.zzd(context).zze());
            } catch (java.lang.Error | java.lang.RuntimeException e) {
                com.google.android.libraries.places.internal.zznb.zzb(e);
                throw e;
            }
        }
        return zzb2;
    }

    public static void deinitialize() {
        synchronized (com.google.android.libraries.places.api.Places.class) {
            zza.zzd();
        }
    }

    @java.lang.Deprecated
    public static void initialize(android.content.Context context, java.lang.String str) {
        try {
            zza(context, str, null, false);
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }

    public static void initializeWithNewPlacesApiEnabled(android.content.Context context, java.lang.String str) {
        try {
            zza(context, str, null, true);
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }

    public static boolean isInitialized() {
        boolean zzb2;
        synchronized (com.google.android.libraries.places.api.Places.class) {
            try {
                zzb2 = zza.zzb();
            } catch (java.lang.Error | java.lang.RuntimeException e) {
                com.google.android.libraries.places.internal.zznb.zzb(e);
                throw e;
            }
        }
        return zzb2;
    }

    public static void setPlacesAppCheckTokenProvider(com.google.android.libraries.places.api.auth.PlacesAppCheckTokenProvider placesAppCheckTokenProvider) {
        zza.zzc(placesAppCheckTokenProvider);
    }

    public static void zza(android.content.Context context, java.lang.String str, java.util.Locale locale, boolean z) {
        synchronized (com.google.android.libraries.places.api.Places.class) {
            try {
                com.google.common.base.Preconditions.checkNotNull(context, "Application context must not be null.");
                com.google.common.base.Preconditions.checkNotNull(str, "API Key must not be null.");
                com.google.common.base.Preconditions.checkArgument(!str.isEmpty(), "API Key must not be empty.");
                com.google.android.libraries.places.internal.zznb.zza(context.getApplicationContext());
                zza.zza(str, locale, z);
            } catch (java.lang.Error | java.lang.RuntimeException e) {
                com.google.android.libraries.places.internal.zznb.zzb(e);
                throw e;
            }
        }
    }

    public static com.google.android.libraries.places.api.net.PlacesClient zzb(android.content.Context context, com.google.android.libraries.places.internal.zzmz zzmzVar) {
        com.google.android.libraries.places.api.net.PlacesClient zzc;
        synchronized (com.google.android.libraries.places.api.Places.class) {
            try {
                com.google.common.base.Preconditions.checkNotNull(context, "Context must not be null.");
                com.google.common.base.Preconditions.checkNotNull(zzmzVar, "ClientProfile must not be null.");
                com.google.common.base.Preconditions.checkState(isInitialized(), "Places must be initialized first.");
                com.google.android.libraries.places.internal.zzmm zza2 = com.google.android.libraries.places.internal.zzme.zza();
                zza2.zzd(context);
                zza2.zzc(zza);
                zza2.zzb(zzmzVar);
                zzc = zza2.zza().zzc();
            } catch (java.lang.Error | java.lang.RuntimeException e) {
                com.google.android.libraries.places.internal.zznb.zzb(e);
                throw e;
            }
        }
        return zzc;
    }

    @java.lang.Deprecated
    public static void initialize(android.content.Context context, java.lang.String str, java.util.Locale locale) {
        try {
            zza(context, str, locale, false);
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }

    public static void initializeWithNewPlacesApiEnabled(android.content.Context context, java.lang.String str, java.util.Locale locale) {
        try {
            zza(context, str, locale, true);
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }

    public static com.google.android.libraries.places.internal.zzmp zzc() {
        com.google.android.libraries.places.internal.zzmp zzmpVar;
        synchronized (com.google.android.libraries.places.api.Places.class) {
            zzmpVar = zza;
        }
        return zzmpVar;
    }

    private Places() {
    }
}
