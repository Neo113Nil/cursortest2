package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbgf {
    static final long zza;
    static final boolean zzb;
    private static final sun.misc.Unsafe zzc;
    private static final java.lang.Class zzd;
    private static final boolean zze;
    private static final com.google.android.libraries.places.internal.zzbge zzf;
    private static final boolean zzg;
    private static final boolean zzh;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0037  */
    static {
        com.google.android.libraries.places.internal.zzbge zzbgeVar;
        boolean z;
        com.google.android.libraries.places.internal.zzbge zzbgeVar2;
        boolean z2;
        java.lang.reflect.Field zzB;
        com.google.android.libraries.places.internal.zzbge zzbgeVar3;
        sun.misc.Unsafe zzq = zzq();
        zzc = zzq;
        zzd = libcore.io.Memory.class;
        boolean zzr = zzr(java.lang.Long.TYPE);
        zze = zzr;
        boolean zzr2 = zzr(java.lang.Integer.TYPE);
        if (zzq != null) {
            if (zzr) {
                zzbgeVar = new com.google.android.libraries.places.internal.zzbgd(zzq);
            } else if (zzr2) {
                zzbgeVar = new com.google.android.libraries.places.internal.zzbgc(zzq);
            }
            zzf = zzbgeVar;
            if (zzbgeVar != null) {
                try {
                    java.lang.Class<?> cls = zzbgeVar.zza.getClass();
                    cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                    cls.getMethod("getLong", java.lang.Object.class, java.lang.Long.TYPE);
                } catch (java.lang.Throwable th) {
                    zzy(th);
                }
                if (zzB() != null) {
                    z = true;
                    zzg = z;
                    zzbgeVar2 = zzf;
                    if (zzbgeVar2 != null) {
                        try {
                            java.lang.Class<?> cls2 = zzbgeVar2.zza.getClass();
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
                            zzy(th2);
                        }
                        zzh = z2;
                        zza = zzz(byte[].class);
                        zzz(boolean[].class);
                        zzA(boolean[].class);
                        zzz(int[].class);
                        zzA(int[].class);
                        zzz(long[].class);
                        zzA(long[].class);
                        zzz(float[].class);
                        zzA(float[].class);
                        zzz(double[].class);
                        zzA(double[].class);
                        zzz(java.lang.Object[].class);
                        zzA(java.lang.Object[].class);
                        zzB = zzB();
                        if (zzB != null && (zzbgeVar3 = zzf) != null) {
                            zzbgeVar3.zza.objectFieldOffset(zzB);
                        }
                        zzb = java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.BIG_ENDIAN;
                    }
                    z2 = false;
                    zzh = z2;
                    zza = zzz(byte[].class);
                    zzz(boolean[].class);
                    zzA(boolean[].class);
                    zzz(int[].class);
                    zzA(int[].class);
                    zzz(long[].class);
                    zzA(long[].class);
                    zzz(float[].class);
                    zzA(float[].class);
                    zzz(double[].class);
                    zzA(double[].class);
                    zzz(java.lang.Object[].class);
                    zzA(java.lang.Object[].class);
                    zzB = zzB();
                    if (zzB != null) {
                        zzbgeVar3.zza.objectFieldOffset(zzB);
                    }
                    zzb = java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.BIG_ENDIAN;
                }
            }
            z = false;
            zzg = z;
            zzbgeVar2 = zzf;
            if (zzbgeVar2 != null) {
            }
            z2 = false;
            zzh = z2;
            zza = zzz(byte[].class);
            zzz(boolean[].class);
            zzA(boolean[].class);
            zzz(int[].class);
            zzA(int[].class);
            zzz(long[].class);
            zzA(long[].class);
            zzz(float[].class);
            zzA(float[].class);
            zzz(double[].class);
            zzA(double[].class);
            zzz(java.lang.Object[].class);
            zzA(java.lang.Object[].class);
            zzB = zzB();
            if (zzB != null) {
            }
            zzb = java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.BIG_ENDIAN;
        }
        zzbgeVar = null;
        zzf = zzbgeVar;
        if (zzbgeVar != null) {
        }
        z = false;
        zzg = z;
        zzbgeVar2 = zzf;
        if (zzbgeVar2 != null) {
        }
        z2 = false;
        zzh = z2;
        zza = zzz(byte[].class);
        zzz(boolean[].class);
        zzA(boolean[].class);
        zzz(int[].class);
        zzA(int[].class);
        zzz(long[].class);
        zzA(long[].class);
        zzz(float[].class);
        zzA(float[].class);
        zzz(double[].class);
        zzA(double[].class);
        zzz(java.lang.Object[].class);
        zzA(java.lang.Object[].class);
        zzB = zzB();
        if (zzB != null) {
        }
        zzb = java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.BIG_ENDIAN;
    }

    private static int zzA(java.lang.Class cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static java.lang.reflect.Field zzC(java.lang.Class cls, java.lang.String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzD(java.lang.Object obj, long j, byte b) {
        sun.misc.Unsafe unsafe = zzf.zza;
        long j2 = (-4) & j;
        int i = unsafe.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j2, ((~(255 << i2)) & i) | ((b & 255) << i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzE(java.lang.Object obj, long j, byte b) {
        sun.misc.Unsafe unsafe = zzf.zza;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        int i2 = (b & 255) << i;
        unsafe.putInt(obj, j2, ((~(255 << i)) & unsafe.getInt(obj, j2)) | i2);
    }

    static java.lang.Object zzc(java.lang.Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (java.lang.InstantiationException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    static int zzd(java.lang.Object obj, long j) {
        return zzf.zza.getInt(obj, j);
    }

    static void zze(java.lang.Object obj, long j, int i) {
        zzf.zza.putInt(obj, j, i);
    }

    static long zzf(java.lang.Object obj, long j) {
        return zzf.zza.getLong(obj, j);
    }

    static void zzg(java.lang.Object obj, long j, long j2) {
        zzf.zza.putLong(obj, j, j2);
    }

    static boolean zzh(java.lang.Object obj, long j) {
        return zzf.zzb(obj, j);
    }

    static void zzi(java.lang.Object obj, long j, boolean z) {
        zzf.zzc(obj, j, z);
    }

    static float zzj(java.lang.Object obj, long j) {
        return zzf.zzd(obj, j);
    }

    static void zzk(java.lang.Object obj, long j, float f) {
        zzf.zze(obj, j, f);
    }

    static double zzl(java.lang.Object obj, long j) {
        return zzf.zzf(obj, j);
    }

    static void zzm(java.lang.Object obj, long j, double d) {
        zzf.zzg(obj, j, d);
    }

    static java.lang.Object zzn(java.lang.Object obj, long j) {
        return zzf.zza.getObject(obj, j);
    }

    static void zzo(java.lang.Object obj, long j, java.lang.Object obj2) {
        zzf.zza.putObject(obj, j, obj2);
    }

    static void zzp(byte[] bArr, long j, byte b) {
        zzf.zza(bArr, zza + j, b);
    }

    static sun.misc.Unsafe zzq() {
        try {
            return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.android.libraries.places.internal.zzbgb());
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean zzr(java.lang.Class cls) {
        try {
            java.lang.Class cls2 = zzd;
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

    static /* synthetic */ boolean zzu(java.lang.Object obj, long j) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    static /* synthetic */ boolean zzv(java.lang.Object obj, long j) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    static /* synthetic */ void zzy(java.lang.Throwable th) {
        java.util.logging.Logger.getLogger(com.google.android.libraries.places.internal.zzbgf.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    private static int zzz(java.lang.Class cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static java.lang.reflect.Field zzB() {
        java.lang.reflect.Field zzC = zzC(java.nio.Buffer.class, "effectiveDirectAddress");
        if (zzC != null) {
            return zzC;
        }
        java.lang.reflect.Field zzC2 = zzC(java.nio.Buffer.class, "address");
        if (zzC2 == null || zzC2.getType() != java.lang.Long.TYPE) {
            return null;
        }
        return zzC2;
    }

    static boolean zzb() {
        return zzg;
    }

    static boolean zza() {
        return zzh;
    }

    private zzbgf() {
    }
}
