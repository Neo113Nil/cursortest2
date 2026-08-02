package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
final class zzgk {
    public static final /* synthetic */ int zza = 0;
    private static final java.lang.Class zzb;
    private static final com.google.android.gms.internal.auth.zzgz zzc;
    private static final com.google.android.gms.internal.auth.zzgz zzd;

    static {
        java.lang.Class<?> cls;
        java.lang.Class<?> cls2;
        com.google.android.gms.internal.auth.zzgz zzgzVar = null;
        try {
            cls = java.lang.Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (java.lang.Throwable unused) {
            cls = null;
        }
        zzb = cls;
        try {
            cls2 = java.lang.Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (java.lang.Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                zzgzVar = (com.google.android.gms.internal.auth.zzgz) cls2.getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            } catch (java.lang.Throwable unused3) {
            }
        }
        zzc = zzgzVar;
        zzd = new com.google.android.gms.internal.auth.zzhb();
    }

    static java.lang.Object zzc(java.lang.Object obj, int i, int i2, java.lang.Object obj2, com.google.android.gms.internal.auth.zzgz zzgzVar) {
        if (obj2 == null) {
            obj2 = zzgzVar.zza(obj);
        }
        zzgzVar.zzd(obj2, i, i2);
        return obj2;
    }

    static void zzd(com.google.android.gms.internal.auth.zzgz zzgzVar, java.lang.Object obj, java.lang.Object obj2) {
        zzgzVar.zzf(obj, zzgzVar.zzc(zzgzVar.zzb(obj), zzgzVar.zzb(obj2)));
    }

    public static void zze(java.lang.Class cls) {
        java.lang.Class cls2;
        if (!com.google.android.gms.internal.auth.zzev.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new java.lang.IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean zzf(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static com.google.android.gms.internal.auth.zzgz zzb() {
        return zzd;
    }

    public static com.google.android.gms.internal.auth.zzgz zza() {
        return zzc;
    }
}
