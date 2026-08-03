package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
abstract class zzax {
    private static final com.google.android.gms.ads.internal.client.zzco zza;

    static {
        com.google.android.gms.ads.internal.client.zzco zzcoVar = null;
        try {
            java.lang.Object newInstance = com.google.android.gms.ads.internal.client.zzaw.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            if (newInstance instanceof android.os.IBinder) {
                android.os.IBinder iBinder = (android.os.IBinder) newInstance;
                if (iBinder != null) {
                    android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    zzcoVar = queryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzco ? (com.google.android.gms.ads.internal.client.zzco) queryLocalInterface : new com.google.android.gms.ads.internal.client.zzcm(iBinder);
                }
            } else {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("ClientApi class is not an instance of IBinder.");
            }
        } catch (java.lang.Exception unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to instantiate ClientApi class.");
        }
        zza = zzcoVar;
    }

    zzax() {
    }

    private final java.lang.Object zze() {
        com.google.android.gms.ads.internal.client.zzco zzcoVar = zza;
        if (zzcoVar == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return zzc(zzcoVar);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot invoke local loader using ClientApi class.", e);
            return null;
        }
    }

    private final java.lang.Object zzf() {
        try {
            return zzb();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot invoke remote loader.", e);
            return null;
        }
    }

    protected abstract java.lang.Object zza();

    protected abstract java.lang.Object zzb() throws android.os.RemoteException;

    protected abstract java.lang.Object zzc(com.google.android.gms.ads.internal.client.zzco zzcoVar) throws android.os.RemoteException;

    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object zzd(android.content.Context context, boolean z) {
        boolean z2;
        java.lang.Object zze;
        if (!z) {
            com.google.android.gms.ads.internal.client.zzay.zza();
            if (!com.google.android.gms.ads.internal.util.client.zzf.zzz(context, com.google.android.gms.common.GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Google Play Services is not available.");
                z = true;
            }
        }
        boolean z3 = false;
        boolean z4 = !(com.google.android.gms.dynamite.DynamiteModule.getLocalVersion(context, com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_ID) <= com.google.android.gms.dynamite.DynamiteModule.getRemoteVersion(context, com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_ID));
        com.google.android.gms.internal.ads.zzbiq.zza(context);
        if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkl.zza.zze()).booleanValue()) {
            boolean z5 = z | z4;
            if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkl.zzb.zze()).booleanValue()) {
                z2 = true;
                z3 = true;
                if (z3) {
                    java.lang.Object zzf = zzf();
                    if (zzf == null) {
                        if (com.google.android.gms.ads.internal.client.zzay.zzh().nextInt(((java.lang.Long) com.google.android.gms.internal.ads.zzbkz.zza.zze()).intValue()) == 0) {
                            android.os.Bundle bundle = new android.os.Bundle();
                            bundle.putString("action", "dynamite_load");
                            bundle.putInt("is_missing", 1);
                            com.google.android.gms.ads.internal.client.zzay.zza().zzi(context, com.google.android.gms.ads.internal.client.zzay.zzg().afmaVersion, "gmob-apps", bundle, true);
                        }
                    }
                    zze = zzf == null ? zze() : zzf;
                } else {
                    zze = zze();
                    if (zze == null && !z2) {
                        zze = zzf();
                    }
                }
                return zze != null ? zza() : zze;
            }
            z3 = z5;
        }
        z2 = false;
        if (z3) {
        }
        if (zze != null) {
        }
    }
}
