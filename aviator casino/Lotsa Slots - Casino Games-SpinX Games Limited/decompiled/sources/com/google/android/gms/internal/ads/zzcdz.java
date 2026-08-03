package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
@javax.annotation.ParametersAreNonnullByDefault
/* loaded from: classes4.dex */
public final class zzcdz {
    private final java.util.concurrent.atomic.AtomicReference zzb = new java.util.concurrent.atomic.AtomicReference(null);
    private final java.lang.Object zzc = new java.lang.Object();
    private java.lang.String zzd = null;
    final java.util.concurrent.atomic.AtomicBoolean zza = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.util.concurrent.atomic.AtomicInteger zze = new java.util.concurrent.atomic.AtomicInteger(-1);
    private final java.util.concurrent.atomic.AtomicReference zzf = new java.util.concurrent.atomic.AtomicReference(null);
    private final java.util.concurrent.atomic.AtomicReference zzg = new java.util.concurrent.atomic.AtomicReference(null);
    private final java.util.concurrent.ConcurrentMap zzh = new java.util.concurrent.ConcurrentHashMap(9);
    private final java.lang.Object zzi = new java.lang.Object();

    public static final android.os.Bundle zzq(java.util.Map map) {
        android.os.Bundle bundle = new android.os.Bundle();
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                try {
                    if (java.util.Objects.equals(str, "value")) {
                        bundle.putDouble(str, java.lang.Double.parseDouble((java.lang.String) map.get(str)));
                    } else {
                        bundle.putString(str, (java.lang.String) map.get(str));
                    }
                } catch (java.lang.NullPointerException | java.lang.NumberFormatException unused) {
                }
            }
        }
        return bundle;
    }

    static final boolean zzr(android.content.Context context) {
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzaX)).booleanValue()) {
            return false;
        }
        if (com.google.android.gms.dynamite.DynamiteModule.getLocalVersion(context, com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_ID) < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzaY)).intValue()) {
            return false;
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzaZ)).booleanValue()) {
            try {
                context.getClassLoader().loadClass(com.unity3d.services.core.fid.Constants.FID_CLASS);
                return false;
            } catch (java.lang.ClassNotFoundException unused) {
            }
        }
        return true;
    }

    private final void zzs(android.content.Context context, java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        if (zza(context)) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            try {
                bundle2.putLong("_aeid", java.lang.Long.parseLong(str2));
            } catch (java.lang.NullPointerException | java.lang.NumberFormatException e) {
                java.lang.String.valueOf(str2);
                java.lang.String valueOf = java.lang.String.valueOf(str2);
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Invalid event ID: ".concat(valueOf), e);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (zzx(context, "com.google.android.gms.measurement.AppMeasurement", this.zzf, true)) {
                java.util.concurrent.ConcurrentMap concurrentMap = this.zzh;
                java.lang.reflect.Method method = (java.lang.reflect.Method) concurrentMap.get("logEventInternal");
                if (method == null) {
                    try {
                        method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", java.lang.String.class, java.lang.String.class, android.os.Bundle.class);
                        concurrentMap.put("logEventInternal", method);
                    } catch (java.lang.Exception unused) {
                        zzw("logEventInternal", true);
                        method = null;
                    }
                }
                try {
                    method.invoke(this.zzf.get(), "am", str, bundle2);
                } catch (java.lang.Exception unused2) {
                    zzw("logEventInternal", true);
                }
            }
        }
    }

    private final java.lang.reflect.Method zzt(android.content.Context context, java.lang.String str) {
        java.util.concurrent.ConcurrentMap concurrentMap = this.zzh;
        java.lang.reflect.Method method = (java.lang.reflect.Method) concurrentMap.get(str);
        if (method != null) {
            return method;
        }
        try {
            java.lang.reflect.Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new java.lang.Class[0]);
            concurrentMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (java.lang.Exception unused) {
            zzw(str, false);
            return null;
        }
    }

    private final void zzu(android.content.Context context, java.lang.String str, java.lang.String str2) {
        if (zzx(context, "com.google.android.gms.measurement.AppMeasurement", this.zzf, true)) {
            java.util.concurrent.ConcurrentMap concurrentMap = this.zzh;
            java.lang.reflect.Method method = (java.lang.reflect.Method) concurrentMap.get(str2);
            if (method == null) {
                try {
                    method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, java.lang.String.class);
                    concurrentMap.put(str2, method);
                } catch (java.lang.Exception unused) {
                    zzw(str2, false);
                    method = null;
                }
            }
            try {
                method.invoke(this.zzf.get(), str);
                java.lang.StringBuilder sb = new java.lang.StringBuilder(str2.length() + 37 + java.lang.String.valueOf(str).length());
                sb.append("Invoke Firebase method ");
                sb.append(str2);
                sb.append(", Ad Unit Id: ");
                sb.append(str);
                com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
            } catch (java.lang.Exception unused2) {
                zzw(str2, false);
            }
        }
    }

    private final java.lang.Object zzv(java.lang.String str, android.content.Context context) {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.zzf;
        if (!zzx(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
            return null;
        }
        try {
            return zzt(context, str).invoke(atomicReference.get(), new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            zzw(str, true);
            return null;
        }
    }

    private final void zzw(java.lang.String str, boolean z) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.zza;
        if (atomicBoolean.get()) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 30);
        sb.append("Invoke Firebase method ");
        sb.append(str);
        sb.append(" error.");
        java.lang.String sb2 = sb.toString();
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2);
        if (z) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            atomicBoolean.set(true);
        }
    }

    private final boolean zzx(android.content.Context context, java.lang.String str, java.util.concurrent.atomic.AtomicReference atomicReference, boolean z) {
        if (atomicReference.get() == null) {
            try {
                androidx.compose.animation.core.ComplexDouble$$ExternalSyntheticBackport0.m(atomicReference, null, context.getClassLoader().loadClass(str).getDeclaredMethod(com.unity3d.services.core.fid.Constants.GET_INSTANCE, android.content.Context.class).invoke(null, context));
            } catch (java.lang.Exception unused) {
                zzw(com.unity3d.services.core.fid.Constants.GET_INSTANCE, z);
                return false;
            }
        }
        return true;
    }

    public final boolean zza(android.content.Context context) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzaP)).booleanValue() && !this.zza.get()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzba)).booleanValue()) {
                return true;
            }
            java.util.concurrent.atomic.AtomicInteger atomicInteger = this.zze;
            if (atomicInteger.get() == -1) {
                com.google.android.gms.ads.internal.client.zzay.zza();
                if (!com.google.android.gms.ads.internal.util.client.zzf.zzz(context, com.google.android.gms.common.GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE)) {
                    com.google.android.gms.ads.internal.client.zzay.zza();
                    if (com.google.android.gms.ads.internal.util.client.zzf.zzA(context)) {
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        atomicInteger.set(0);
                    }
                }
                atomicInteger.set(1);
            }
            if (atomicInteger.get() == 1) {
                return true;
            }
        }
        return false;
    }

    public final void zzb(android.content.Context context, com.google.android.gms.ads.internal.client.zzfr zzfrVar) {
        com.google.android.gms.internal.ads.zzcea.zzb(context).zza().zzc(zzfrVar);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbc)).booleanValue() && zza(context) && zzr(context)) {
            synchronized (this.zzi) {
            }
        }
    }

    public final void zzc(android.content.Context context, com.google.android.gms.ads.internal.client.zzm zzmVar) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbc)).booleanValue() && zza(context) && zzr(context)) {
            synchronized (this.zzi) {
            }
        }
    }

    public final void zzd(android.content.Context context, java.lang.String str) {
        if (zza(context)) {
            zzu(context, str, "beginAdUnitExposure");
        }
    }

    public final void zze(android.content.Context context, java.lang.String str) {
        if (zza(context)) {
            zzu(context, str, "endAdUnitExposure");
        }
    }

    public final java.lang.String zzf(android.content.Context context) {
        if (zza(context)) {
            java.util.concurrent.atomic.AtomicReference atomicReference = this.zzf;
            if (zzx(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
                try {
                    java.lang.String str = (java.lang.String) zzt(context, "getCurrentScreenName").invoke(atomicReference.get(), new java.lang.Object[0]);
                    if (str == null) {
                        str = (java.lang.String) zzt(context, "getCurrentScreenClass").invoke(atomicReference.get(), new java.lang.Object[0]);
                    }
                    return str == null ? "" : str;
                } catch (java.lang.Exception unused) {
                    zzw("getCurrentScreenName", false);
                }
            }
        }
        return "";
    }

    @java.lang.Deprecated
    public final void zzg(android.content.Context context, java.lang.String str) {
        if (zza(context) && (context instanceof android.app.Activity) && zzx(context, com.unity3d.services.core.fid.Constants.FID_CLASS, this.zzg, false)) {
            java.util.concurrent.ConcurrentMap concurrentMap = this.zzh;
            java.lang.reflect.Method method = (java.lang.reflect.Method) concurrentMap.get("setCurrentScreen");
            if (method == null) {
                try {
                    method = context.getClassLoader().loadClass(com.unity3d.services.core.fid.Constants.FID_CLASS).getDeclaredMethod("setCurrentScreen", android.app.Activity.class, java.lang.String.class, java.lang.String.class);
                    concurrentMap.put("setCurrentScreen", method);
                } catch (java.lang.Exception unused) {
                    zzw("setCurrentScreen", false);
                    method = null;
                }
            }
            try {
                method.invoke(this.zzg.get(), (android.app.Activity) context, str, context.getPackageName());
            } catch (java.lang.Exception unused2) {
                zzw("setCurrentScreen", false);
            }
        }
    }

    public final java.lang.String zzh(android.content.Context context) {
        if (!zza(context)) {
            return null;
        }
        synchronized (this.zzc) {
            java.lang.String str = this.zzd;
            if (str != null) {
                return str;
            }
            java.lang.String str2 = (java.lang.String) zzv("getGmpAppId", context);
            this.zzd = str2;
            return str2;
        }
    }

    public final java.lang.String zzi(final android.content.Context context) {
        java.util.concurrent.ExecutorService threadPoolExecutor;
        if (!zza(context)) {
            return null;
        }
        long longValue = ((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzaV)).longValue();
        if (longValue < 0) {
            return (java.lang.String) zzv(com.unity3d.services.core.fid.Constants.GET_APP_INSTANCE_ID, context);
        }
        java.util.concurrent.atomic.AtomicReference atomicReference = this.zzb;
        if (atomicReference.get() == null) {
            if (com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()) {
                threadPoolExecutor = com.google.android.gms.internal.ads.zzgal.zza().zza(((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzaW)).intValue(), new com.google.android.gms.internal.ads.zzcdx(this), 2);
            } else {
                com.google.android.gms.internal.ads.zzbih zzbihVar = com.google.android.gms.internal.ads.zzbiq.zzaW;
                threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).intValue(), ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).intValue(), 1L, java.util.concurrent.TimeUnit.MINUTES, new java.util.concurrent.LinkedBlockingQueue(), new com.google.android.gms.internal.ads.zzcdx(this));
            }
            androidx.compose.animation.core.ComplexDouble$$ExternalSyntheticBackport0.m(atomicReference, null, threadPoolExecutor);
        }
        try {
            return (java.lang.String) ((java.util.concurrent.ExecutorService) atomicReference.get()).submit(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzcdy
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ java.lang.Object call() {
                    return com.google.android.gms.internal.ads.zzcdz.this.zzp(context);
                }
            }).get(longValue, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.util.concurrent.TimeoutException unused) {
            return "TIME_OUT";
        } catch (java.lang.Exception unused2) {
            return null;
        }
    }

    public final java.lang.String zzj(android.content.Context context) {
        java.lang.Object zzv;
        if (zza(context) && (zzv = zzv("generateEventId", context)) != null) {
            return zzv.toString();
        }
        return null;
    }

    public final void zzk(android.content.Context context, java.lang.String str, java.util.Map map) {
        zzs(context, "_ac", str, zzq(map));
    }

    public final void zzl(android.content.Context context, java.lang.String str, java.util.Map map) {
        zzs(context, "_ai", str, zzq(map));
    }

    public final void zzm(android.content.Context context, java.lang.String str) {
        zzs(context, "_aq", str, null);
    }

    public final void zzn(android.content.Context context, java.lang.String str) {
        zzs(context, "_aa", str, null);
    }

    public final void zzo(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
        if (zza(context)) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i);
            zzs(context, "_ar", str, bundle);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str3).length() + 64 + java.lang.String.valueOf(i).length());
            sb.append("Log a Firebase reward video event, reward type: ");
            sb.append(str3);
            sb.append(", reward value: ");
            sb.append(i);
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
    }

    final /* synthetic */ java.lang.String zzp(android.content.Context context) {
        return (java.lang.String) zzv(com.unity3d.services.core.fid.Constants.GET_APP_INSTANCE_ID, context);
    }
}
