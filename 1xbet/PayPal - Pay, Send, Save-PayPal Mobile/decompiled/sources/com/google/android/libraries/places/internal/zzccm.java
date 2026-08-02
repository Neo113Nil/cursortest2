package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzccm {
    private final java.lang.Class zza;
    private final java.lang.String zzb;
    private final java.lang.Class[] zzc;

    private final java.lang.reflect.Method zzd(java.lang.Class cls) {
        java.lang.Class cls2;
        java.lang.reflect.Method zze = zze(cls, this.zzb, this.zzc);
        if (zze == null || (cls2 = this.zza) == null || cls2.isAssignableFrom(zze.getReturnType())) {
            return zze;
        }
        return null;
    }

    private static java.lang.reflect.Method zze(java.lang.Class cls, java.lang.String str, java.lang.Class[] clsArr) {
        if (cls == null) {
            return null;
        }
        try {
            if ((cls.getModifiers() & 1) == 0) {
                return zze(cls.getSuperclass(), str, clsArr);
            }
            java.lang.reflect.Method method = cls.getMethod(str, clsArr);
            try {
                if (1 != (method.getModifiers() & 1)) {
                    return null;
                }
            } catch (java.lang.NoSuchMethodException unused) {
            }
            return method;
        } catch (java.lang.NoSuchMethodException unused2) {
            return null;
        }
    }

    public final boolean zza(java.lang.Object obj) {
        return zzd(obj.getClass()) != null;
    }

    public final java.lang.Object zzb(java.lang.Object obj, java.lang.Object... objArr) {
        try {
            java.lang.reflect.Method zzd = zzd(obj.getClass());
            if (zzd == null) {
                return null;
            }
            try {
                return zzd.invoke(obj, objArr);
            } catch (java.lang.IllegalAccessException unused) {
                return null;
            }
        } catch (java.lang.reflect.InvocationTargetException e) {
            java.lang.Throwable targetException = e.getTargetException();
            if (targetException instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) targetException);
            }
            java.lang.AssertionError assertionError = new java.lang.AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public final java.lang.Object zzc(java.lang.Object obj, java.lang.Object... objArr) {
        try {
            java.lang.reflect.Method zzd = zzd(obj.getClass());
            if (zzd != null) {
                try {
                    return zzd.invoke(obj, objArr);
                } catch (java.lang.IllegalAccessException e) {
                    java.lang.AssertionError assertionError = new java.lang.AssertionError("Unexpectedly could not call: ".concat(zzd.toString()));
                    assertionError.initCause(e);
                    throw assertionError;
                }
            }
            java.lang.String str = this.zzb;
            java.lang.String valueOf = java.lang.String.valueOf(obj);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 33 + java.lang.String.valueOf(valueOf).length());
            sb.append("Method ");
            sb.append(str);
            sb.append(" not supported for object ");
            sb.append(valueOf);
            throw new java.lang.AssertionError(sb.toString());
        } catch (java.lang.reflect.InvocationTargetException e2) {
            java.lang.Throwable targetException = e2.getTargetException();
            if (targetException instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) targetException);
            }
            java.lang.AssertionError assertionError2 = new java.lang.AssertionError("Unexpected exception");
            assertionError2.initCause(targetException);
            throw assertionError2;
        }
    }

    public zzccm(java.lang.Class cls, java.lang.String str, java.lang.Class... clsArr) {
        this.zza = cls;
        this.zzb = str;
        this.zzc = clsArr;
    }
}
