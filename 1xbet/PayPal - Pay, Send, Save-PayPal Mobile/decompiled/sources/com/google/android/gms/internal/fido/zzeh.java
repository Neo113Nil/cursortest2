package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
public final class zzeh {
    public static com.google.android.gms.internal.fido.zzeg zza() {
        try {
            try {
                try {
                    return (com.google.android.gms.internal.fido.zzeg) com.google.android.gms.internal.fido.zzel.class.getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
                } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.NoClassDefFoundError | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
                    return (com.google.android.gms.internal.fido.zzeg) com.google.common.flogger.backend.google.GooglePlatform.class.getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
                }
            } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.NoClassDefFoundError | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused2) {
                return (com.google.android.gms.internal.fido.zzeg) com.google.common.flogger.backend.system.DefaultPlatform.class.getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            }
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.NoClassDefFoundError | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused3) {
            return null;
        }
    }
}
