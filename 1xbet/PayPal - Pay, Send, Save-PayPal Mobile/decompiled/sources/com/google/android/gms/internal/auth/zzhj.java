package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
final class zzhj {
    static final boolean zza;
    private static final sun.misc.Unsafe zzb;
    private static final java.lang.Class zzc;
    private static final boolean zzd;
    private static final com.google.android.gms.internal.auth.zzhi zze;
    private static final boolean zzf;
    private static final boolean zzg;

    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003a  */
    static {
        com.google.android.gms.internal.auth.zzhi zzhiVar;
        boolean z;
        com.google.android.gms.internal.auth.zzhi zzhiVar2;
        boolean z2;
        java.lang.reflect.Field zzy;
        com.google.android.gms.internal.auth.zzhi zzhiVar3;
        sun.misc.Unsafe zzg2 = zzg();
        zzb = zzg2;
        int i = com.google.android.gms.internal.auth.zzds.zza;
        zzc = libcore.io.Memory.class;
        boolean zzs = zzs(java.lang.Long.TYPE);
        zzd = zzs;
        boolean zzs2 = zzs(java.lang.Integer.TYPE);
        if (zzg2 != null) {
            if (zzs) {
                zzhiVar = new com.google.android.gms.internal.auth.zzhh(zzg2);
            } else if (zzs2) {
                zzhiVar = new com.google.android.gms.internal.auth.zzhg(zzg2);
            }
            zze = zzhiVar;
            if (zzhiVar != null) {
                try {
                    java.lang.Class<?> cls = zzhiVar.zza.getClass();
                    cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                    cls.getMethod("getLong", java.lang.Object.class, java.lang.Long.TYPE);
                } catch (java.lang.Throwable th) {
                    zzh(th);
                }
                if (zzy() != null) {
                    z = true;
                    zzf = z;
                    zzhiVar2 = zze;
                    if (zzhiVar2 != null) {
                        try {
                            java.lang.Class<?> cls2 = zzhiVar2.zza.getClass();
                            cls2.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                            cls2.getMethod("arrayBaseOffset", java.lang.Class.class);
                            cls2.getMethod("arrayIndexScale", java.lang.Class.class);
                            cls2.getMethod("getInt", java.lang.Object.class, java.lang.Long.TYPE);
                            cls2.getMethod("putInt", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                            cls2.getMethod("getLong", java.lang.Object.class, java.lang.Long.TYPE);
                            cls2.getMethod("putLong", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Long.TYPE);
                            cls2.getMethod("getObject", java.lang.Object.class, java.lang.Long.TYPE);
                            cls2.getMethod("putObject", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Object.class);
                            z2 = true;
                        } catch (java.lang.Throwable th2) {
                            zzh(th2);
                        }
                        zzg = z2;
                        zzw(byte[].class);
                        zzw(boolean[].class);
                        zzx(boolean[].class);
                        zzw(int[].class);
                        zzx(int[].class);
                        zzw(long[].class);
                        zzx(long[].class);
                        zzw(float[].class);
                        zzx(float[].class);
                        zzw(double[].class);
                        zzx(double[].class);
                        zzw(java.lang.Object[].class);
                        zzx(java.lang.Object[].class);
                        zzy = zzy();
                        if (zzy != null && (zzhiVar3 = zze) != null) {
                            zzhiVar3.zza.objectFieldOffset(zzy);
                        }
                        zza = java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.BIG_ENDIAN;
                    }
                    z2 = false;
                    zzg = z2;
                    zzw(byte[].class);
                    zzw(boolean[].class);
                    zzx(boolean[].class);
                    zzw(int[].class);
                    zzx(int[].class);
                    zzw(long[].class);
                    zzx(long[].class);
                    zzw(float[].class);
                    zzx(float[].class);
                    zzw(double[].class);
                    zzx(double[].class);
                    zzw(java.lang.Object[].class);
                    zzx(java.lang.Object[].class);
                    zzy = zzy();
                    if (zzy != null) {
                        zzhiVar3.zza.objectFieldOffset(zzy);
                    }
                    zza = java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.BIG_ENDIAN;
                }
            }
            z = false;
            zzf = z;
            zzhiVar2 = zze;
            if (zzhiVar2 != null) {
            }
            z2 = false;
            zzg = z2;
            zzw(byte[].class);
            zzw(boolean[].class);
            zzx(boolean[].class);
            zzw(int[].class);
            zzx(int[].class);
            zzw(long[].class);
            zzx(long[].class);
            zzw(float[].class);
            zzx(float[].class);
            zzw(double[].class);
            zzx(double[].class);
            zzw(java.lang.Object[].class);
            zzx(java.lang.Object[].class);
            zzy = zzy();
            if (zzy != null) {
            }
            zza = java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.BIG_ENDIAN;
        }
        zzhiVar = null;
        zze = zzhiVar;
        if (zzhiVar != null) {
        }
        z = false;
        zzf = z;
        zzhiVar2 = zze;
        if (zzhiVar2 != null) {
        }
        z2 = false;
        zzg = z2;
        zzw(byte[].class);
        zzw(boolean[].class);
        zzx(boolean[].class);
        zzw(int[].class);
        zzx(int[].class);
        zzw(long[].class);
        zzx(long[].class);
        zzw(float[].class);
        zzx(float[].class);
        zzw(double[].class);
        zzx(double[].class);
        zzw(java.lang.Object[].class);
        zzx(java.lang.Object[].class);
        zzy = zzy();
        if (zzy != null) {
        }
        zza = java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.BIG_ENDIAN;
    }

    static double zza(java.lang.Object obj, long j) {
        return zze.zza(obj, j);
    }

    static float zzb(java.lang.Object obj, long j) {
        return zze.zzb(obj, j);
    }

    static int zzc(java.lang.Object obj, long j) {
        return zze.zza.getInt(obj, j);
    }

    static long zzd(java.lang.Object obj, long j) {
        return zze.zza.getLong(obj, j);
    }

    static java.lang.Object zze(java.lang.Class cls) {
        try {
            return zzb.allocateInstance(cls);
        } catch (java.lang.InstantiationException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    static java.lang.Object zzf(java.lang.Object obj, long j) {
        return zze.zza.getObject(obj, j);
    }

    static sun.misc.Unsafe zzg() {
        try {
            return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.android.gms.internal.auth.zzhf());
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    static /* synthetic */ void zzh(java.lang.Throwable th) {
        java.util.logging.Logger.getLogger(com.google.android.gms.internal.auth.zzhj.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    static /* synthetic */ void zzi(java.lang.Object obj, long j, boolean z) {
        com.google.android.gms.internal.auth.zzhi zzhiVar = zze;
        long j2 = (-4) & j;
        int i = zzhiVar.zza.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        zzhiVar.zza.putInt(obj, j2, ((~(255 << i2)) & i) | ((z ? 1 : 0) << i2));
    }

    static /* synthetic */ void zzj(java.lang.Object obj, long j, boolean z) {
        com.google.android.gms.internal.auth.zzhi zzhiVar = zze;
        long j2 = (-4) & j;
        int i = zzhiVar.zza.getInt(obj, j2);
        int i2 = (((int) j) & 3) << 3;
        zzhiVar.zza.putInt(obj, j2, ((~(255 << i2)) & i) | ((z ? 1 : 0) << i2));
    }

    static void zzk(java.lang.Object obj, long j, boolean z) {
        zze.zzc(obj, j, z);
    }

    static void zzl(java.lang.Object obj, long j, double d) {
        zze.zzd(obj, j, d);
    }

    static void zzm(java.lang.Object obj, long j, float f) {
        zze.zze(obj, j, f);
    }

    static void zzn(java.lang.Object obj, long j, int i) {
        zze.zza.putInt(obj, j, i);
    }

    static void zzo(java.lang.Object obj, long j, long j2) {
        zze.zza.putLong(obj, j, j2);
    }

    static void zzp(java.lang.Object obj, long j, java.lang.Object obj2) {
        zze.zza.putObject(obj, j, obj2);
    }

    static /* synthetic */ boolean zzq(java.lang.Object obj, long j) {
        return ((byte) ((zze.zza.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    static /* synthetic */ boolean zzr(java.lang.Object obj, long j) {
        return ((byte) ((zze.zza.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean zzs(java.lang.Class cls) {
        int i = com.google.android.gms.internal.auth.zzds.zza;
        try {
            java.lang.Class cls2 = zzc;
            cls2.getMethod("peekLong", cls, java.lang.Boolean.TYPE);
            cls2.getMethod("pokeLong", cls, java.lang.Long.TYPE, java.lang.Boolean.TYPE);
            cls2.getMethod("pokeInt", cls, java.lang.Integer.TYPE, java.lang.Boolean.TYPE);
            cls2.getMethod("peekInt", cls, java.lang.Boolean.TYPE);
            cls2.getMethod("pokeByte", cls, java.lang.Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
            cls2.getMethod("peekByteArray", cls, byte[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
            return true;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    static boolean zzt(java.lang.Object obj, long j) {
        return zze.zzf(obj, j);
    }

    private static int zzw(java.lang.Class cls) {
        if (zzg) {
            return zze.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzx(java.lang.Class cls) {
        if (zzg) {
            return zze.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static java.lang.reflect.Field zzy() {
        int i = com.google.android.gms.internal.auth.zzds.zza;
        java.lang.reflect.Field zzz = zzz(java.nio.Buffer.class, "effectiveDirectAddress");
        if (zzz != null) {
            return zzz;
        }
        java.lang.reflect.Field zzz2 = zzz(java.nio.Buffer.class, "address");
        if (zzz2 == null || zzz2.getType() != java.lang.Long.TYPE) {
            return null;
        }
        return zzz2;
    }

    private static java.lang.reflect.Field zzz(java.lang.Class cls, java.lang.String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    static boolean zzv() {
        return zzf;
    }

    static boolean zzu() {
        return zzg;
    }

    private zzhj() {
    }
}
