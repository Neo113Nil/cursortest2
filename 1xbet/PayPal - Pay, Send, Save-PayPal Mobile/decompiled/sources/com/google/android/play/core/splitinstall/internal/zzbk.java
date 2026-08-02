package com.google.android.play.core.splitinstall.internal;

/* loaded from: classes9.dex */
public final class zzbk {
    public static com.google.android.play.core.splitinstall.internal.zzbi zza(java.lang.Object obj, java.lang.String str, java.lang.Class cls) {
        return new com.google.android.play.core.splitinstall.internal.zzbi(obj, zzh(obj, str), cls);
    }

    public static com.google.android.play.core.splitinstall.internal.zzbj zzb(java.lang.Object obj, java.lang.String str, java.lang.Class cls) {
        return new com.google.android.play.core.splitinstall.internal.zzbj(obj, zzh(obj, str), cls);
    }

    public static java.lang.Object zzc(java.lang.Class cls) {
        try {
            java.lang.reflect.Constructor declaredConstructor = cls.getDeclaredConstructor(new java.lang.Class[0]);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor.newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception e) {
            throw new com.google.android.play.core.splitinstall.internal.zzbl(java.lang.String.format("Failed to invoke default constructor on class %s", cls.getName()), e);
        }
    }

    public static java.lang.Object zzd(java.lang.Object obj, java.lang.String str, java.lang.Class cls, java.lang.Class cls2, java.lang.Object obj2) {
        try {
            return cls.cast(zzi(obj.getClass(), str, cls2).invoke(obj, obj2));
        } catch (java.lang.Exception e) {
            throw new com.google.android.play.core.splitinstall.internal.zzbl(java.lang.String.format("Failed to invoke method %s on an object of type %s", str, obj.getClass()), e);
        }
    }

    public static java.lang.Object zze(java.lang.Object obj, java.lang.String str, java.lang.Class cls, java.lang.Class cls2, java.lang.Object obj2, java.lang.Class cls3, java.lang.Object obj3, java.lang.Class cls4, java.lang.Object obj4) {
        try {
            return cls.cast(zzi(obj.getClass(), str, cls2, cls3, cls4).invoke(obj, obj2, obj3, obj4));
        } catch (java.lang.Exception e) {
            throw new com.google.android.play.core.splitinstall.internal.zzbl(java.lang.String.format("Failed to invoke method %s on an object of type %s", str, obj.getClass()), e);
        }
    }

    public static java.lang.Object zzf(java.lang.Class cls, java.lang.String str, java.lang.Class cls2, java.lang.Class cls3, java.lang.Object obj) {
        try {
            return cls2.cast(zzi(cls, "isDexOptNeeded", cls3).invoke(null, obj));
        } catch (java.lang.Exception e) {
            throw new com.google.android.play.core.splitinstall.internal.zzbl(java.lang.String.format("Failed to invoke static method %s on type %s", "isDexOptNeeded", cls), e);
        }
    }

    public static java.lang.Object zzg(java.lang.Class cls, java.lang.String str, java.lang.Class cls2, java.lang.Class cls3, java.lang.Object obj, java.lang.Class cls4, java.lang.Object obj2) {
        try {
            return cls2.cast(zzi(cls, "optimizedPathFor", cls3, cls4).invoke(null, obj, obj2));
        } catch (java.lang.Exception e) {
            throw new com.google.android.play.core.splitinstall.internal.zzbl(java.lang.String.format("Failed to invoke static method %s on type %s", "optimizedPathFor", cls), e);
        }
    }

    private static java.lang.reflect.Field zzh(java.lang.Object obj, java.lang.String str) {
        for (java.lang.Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                java.lang.reflect.Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (java.lang.NoSuchFieldException unused) {
            }
        }
        throw new com.google.android.play.core.splitinstall.internal.zzbl(java.lang.String.format("Failed to find a field named %s on an object of instance %s", str, obj.getClass().getName()));
    }

    private static java.lang.reflect.Method zzi(java.lang.Class cls, java.lang.String str, java.lang.Class... clsArr) {
        for (java.lang.Class cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            try {
                java.lang.reflect.Method declaredMethod = cls2.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (java.lang.NoSuchMethodException unused) {
            }
        }
        throw new com.google.android.play.core.splitinstall.internal.zzbl(java.lang.String.format("Could not find a method named %s with parameters %s in type %s", str, java.util.Arrays.asList(clsArr), cls));
    }
}
