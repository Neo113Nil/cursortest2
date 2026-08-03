package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public final class zzam {
    private final android.content.Context zza;
    private final java.util.concurrent.atomic.AtomicReference zzb = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference zzc = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference zzd = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference zze = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference zzf = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference zzg = new java.util.concurrent.atomic.AtomicReference();

    zzam(android.app.Application application) {
        this.zza = application.getApplicationContext();
    }

    public final java.lang.Object zza(java.lang.String str) {
        java.lang.Object obj;
        java.util.concurrent.atomic.AtomicReference atomicReference = this.zzf;
        if (atomicReference.get() == null || (obj = ((android.os.Bundle) atomicReference.get()).get(str)) == null) {
            return null;
        }
        if (obj instanceof java.lang.Boolean) {
            return (java.lang.Boolean) obj;
        }
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        return null;
    }

    public final void zzb(android.content.Context context) {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.zzf;
        if (atomicReference.get() == null) {
            try {
                atomicReference.set(com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData);
            } catch (android.content.pm.PackageManager.NameNotFoundException | java.lang.NullPointerException e) {
                android.util.Log.w("UserMessagingPlatform", "Failed to get metadata. ", e);
            }
        }
    }

    public final void zzc(java.util.Map map) {
        android.util.Log.d("UserMessagingPlatform", "Update Firebase: ".concat(map.toString()));
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.lang.String str : map.keySet()) {
            try {
                hashMap.put((java.lang.Enum) ((java.lang.reflect.Method) this.zze.get()).invoke(null, str), (java.lang.Enum) ((java.lang.reflect.Method) this.zzd.get()).invoke(null, map.get(str)));
            } catch (java.lang.Exception e) {
                android.util.Log.w("UserMessagingPlatform", "Failed to invoke the Firebase static method.", e);
            }
        }
        java.util.concurrent.atomic.AtomicReference atomicReference = this.zzc;
        if (atomicReference.get() == null || hashMap.isEmpty()) {
            return;
        }
        try {
            ((java.lang.reflect.Method) atomicReference.get()).invoke(this.zzb.get(), hashMap);
        } catch (java.lang.Exception e2) {
            android.util.Log.w("UserMessagingPlatform", "Failed to invoke Firebase method. ", e2);
        }
    }

    public final boolean zzd() {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.zzg;
        if (atomicReference.get() != null) {
            return ((java.lang.Boolean) atomicReference.get()).booleanValue();
        }
        android.content.Context context = this.zza;
        if (context == null) {
            atomicReference.set(false);
            return false;
        }
        try {
            java.lang.Class<?> cls = java.lang.Class.forName(com.unity3d.services.core.fid.Constants.FID_CLASS);
            this.zzb.set(cls.getDeclaredMethod(com.unity3d.services.core.fid.Constants.GET_INSTANCE, android.content.Context.class).invoke(null, context));
            this.zzc.set(cls.getDeclaredMethod("setConsent", java.util.Map.class));
            java.lang.Class<?> cls2 = java.lang.Class.forName("com.google.firebase.analytics.FirebaseAnalytics$ConsentStatus");
            java.lang.Class<?> cls3 = java.lang.Class.forName("com.google.firebase.analytics.FirebaseAnalytics$ConsentType");
            java.lang.reflect.Method declaredMethod = cls2.getDeclaredMethod("valueOf", java.lang.String.class);
            java.lang.reflect.Method declaredMethod2 = cls3.getDeclaredMethod("valueOf", java.lang.String.class);
            this.zzd.set(declaredMethod);
            this.zze.set(declaredMethod2);
            this.zzg.set(true);
            return true;
        } catch (java.lang.Exception e) {
            android.util.Log.w("UserMessagingPlatform", "No Firebase class found. ", e);
            this.zzg.set(false);
            return false;
        }
    }
}
