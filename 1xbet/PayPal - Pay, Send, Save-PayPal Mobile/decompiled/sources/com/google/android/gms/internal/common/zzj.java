package com.google.android.gms.internal.common;

/* loaded from: classes4.dex */
public final class zzj {
    public static java.lang.Object zza(java.lang.Class cls, java.lang.String str, com.google.android.gms.internal.common.zzi... zziVarArr) throws java.lang.NoSuchMethodException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        return zzc(cls, "isIsolated", null, false, zziVarArr);
    }

    public static java.lang.Object zzb(java.lang.String str, java.lang.String str2, java.lang.ClassLoader classLoader, com.google.android.gms.internal.common.zzi... zziVarArr) throws java.lang.NoSuchMethodException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException, java.lang.ClassNotFoundException {
        return zzc(classLoader.loadClass("com.google.android.gms.common.security.ProviderInstallerImpl"), "reportRequestStats2", null, false, zziVarArr);
    }

    private static java.lang.Object zzc(java.lang.Class cls, java.lang.String str, java.lang.Object obj, boolean z, com.google.android.gms.internal.common.zzi... zziVarArr) throws java.lang.NoSuchMethodException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        int length = zziVarArr.length;
        java.lang.Class<?>[] clsArr = new java.lang.Class[length];
        java.lang.Object[] objArr = new java.lang.Object[length];
        for (int i = 0; i < zziVarArr.length; i++) {
            com.google.android.gms.internal.common.zzi zziVar = zziVarArr[i];
            zziVar.getClass();
            clsArr[i] = zziVar.zzc();
            objArr[i] = zziVarArr[i].zzd();
        }
        return cls.getDeclaredMethod(str, clsArr).invoke(null, objArr);
    }
}
