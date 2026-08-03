package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzflu {
    private static com.google.android.gms.internal.ads.zzflu zza;
    private final android.content.Context zzb;
    private final com.google.android.gms.ads.internal.client.zzcv zzc;
    private final java.util.concurrent.atomic.AtomicReference zzd = new java.util.concurrent.atomic.AtomicReference();

    zzflu(android.content.Context context, com.google.android.gms.ads.internal.client.zzcv zzcvVar) {
        this.zzb = context;
        this.zzc = zzcvVar;
    }

    public static com.google.android.gms.internal.ads.zzflu zza(android.content.Context context) {
        synchronized (com.google.android.gms.internal.ads.zzflu.class) {
            com.google.android.gms.internal.ads.zzflu zzfluVar = zza;
            if (zzfluVar != null) {
                return zzfluVar;
            }
            android.content.Context applicationContext = context.getApplicationContext();
            long longValue = ((java.lang.Long) com.google.android.gms.internal.ads.zzbkr.zzb.zze()).longValue();
            com.google.android.gms.ads.internal.client.zzcv zzcvVar = null;
            if (longValue > 0 && longValue <= 261210000) {
                zzcvVar = zzf(applicationContext);
            }
            com.google.android.gms.internal.ads.zzflu zzfluVar2 = new com.google.android.gms.internal.ads.zzflu(applicationContext, zzcvVar);
            zza = zzfluVar2;
            return zzfluVar2;
        }
    }

    static com.google.android.gms.ads.internal.client.zzcv zzf(android.content.Context context) {
        try {
            return com.google.android.gms.ads.internal.client.zzcu.asInterface((android.os.IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(android.content.Context.class).newInstance(context));
        } catch (java.lang.ClassCastException | java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to retrieve lite SDK info.", e);
            return null;
        }
    }

    private final com.google.android.gms.ads.internal.client.zzez zzg() {
        com.google.android.gms.ads.internal.client.zzcv zzcvVar = this.zzc;
        if (zzcvVar != null) {
            try {
                return zzcvVar.getLiteSdkVersion();
            } catch (android.os.RemoteException unused) {
            }
        }
        return null;
    }

    public final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzb(int i, boolean z, int i2) {
        com.google.android.gms.ads.internal.client.zzez zzg;
        com.google.android.gms.ads.internal.zzt.zzc();
        boolean zzH = com.google.android.gms.ads.internal.util.zzs.zzH(this.zzb);
        com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel = new com.google.android.gms.ads.internal.util.client.VersionInfoParcel(com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_VERSION, i2, true, zzH);
        return (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkr.zzc.zze()).booleanValue() && (zzg = zzg()) != null) ? new com.google.android.gms.ads.internal.util.client.VersionInfoParcel(com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_VERSION, zzg.zza(), true, zzH) : versionInfoParcel;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzc(com.google.android.gms.internal.ads.zzbvc zzbvcVar) {
        com.google.android.gms.internal.ads.zzbvc adapterCreator;
        if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkr.zza.zze()).booleanValue()) {
            androidx.compose.animation.core.ComplexDouble$$ExternalSyntheticBackport0.m(this.zzd, null, zzbvcVar);
            return;
        }
        com.google.android.gms.ads.internal.client.zzcv zzcvVar = this.zzc;
        if (zzcvVar != null) {
            try {
                adapterCreator = zzcvVar.getAdapterCreator();
            } catch (android.os.RemoteException unused) {
            }
            java.util.concurrent.atomic.AtomicReference atomicReference = this.zzd;
            if (adapterCreator != null) {
                zzbvcVar = adapterCreator;
            }
            androidx.compose.animation.core.ComplexDouble$$ExternalSyntheticBackport0.m(atomicReference, null, zzbvcVar);
        }
        adapterCreator = null;
        java.util.concurrent.atomic.AtomicReference atomicReference2 = this.zzd;
        if (adapterCreator != null) {
        }
        androidx.compose.animation.core.ComplexDouble$$ExternalSyntheticBackport0.m(atomicReference2, null, zzbvcVar);
    }

    public final com.google.android.gms.internal.ads.zzbvc zzd() {
        return (com.google.android.gms.internal.ads.zzbvc) this.zzd.get();
    }

    public final java.lang.String zze() {
        com.google.android.gms.ads.internal.client.zzez zzg = zzg();
        if (zzg != null) {
            return zzg.zzb();
        }
        return null;
    }
}
