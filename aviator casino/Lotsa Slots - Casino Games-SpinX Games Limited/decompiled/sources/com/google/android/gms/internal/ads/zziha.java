package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zziha {
    static final long zza;
    static final boolean zzb;
    private static final sun.misc.Unsafe zzc;
    private static final java.lang.Class zzd;
    private static final boolean zze;
    private static final com.google.android.gms.internal.ads.zzigz zzf;
    private static final boolean zzg;
    private static final long zzh;

    /* JADX WARN: Removed duplicated region for block: B:25:0x0150  */
    static {
        boolean z;
        java.lang.reflect.Field zzC;
        long j;
        com.google.android.gms.internal.ads.zzigz zzigzVar;
        sun.misc.Unsafe zzr = zzr();
        zzc = zzr;
        int i = com.google.android.gms.internal.ads.zzicn.zza;
        zzd = libcore.io.Memory.class;
        boolean zzs = zzs(java.lang.Long.TYPE);
        zze = zzs;
        boolean zzs2 = zzs(java.lang.Integer.TYPE);
        com.google.android.gms.internal.ads.zzigz zzigzVar2 = null;
        if (zzr != null) {
            if (zzs) {
                zzigzVar2 = new com.google.android.gms.internal.ads.zzigy(zzr);
            } else if (zzs2) {
                zzigzVar2 = new com.google.android.gms.internal.ads.zzigx(zzr);
            }
        }
        zzf = zzigzVar2;
        if (zzigzVar2 != null) {
            try {
                java.lang.Class<?> cls = zzigzVar2.zza.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls.getMethod("getLong", java.lang.Object.class, java.lang.Long.TYPE);
                zzC();
            } catch (java.lang.Throwable th) {
                zzz(th);
            }
        }
        com.google.android.gms.internal.ads.zzigz zzigzVar3 = zzf;
        if (zzigzVar3 != null) {
            try {
                java.lang.Class<?> cls2 = zzigzVar3.zza.getClass();
                cls2.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls2.getMethod("arrayBaseOffset", java.lang.Class.class);
                cls2.getMethod("arrayIndexScale", java.lang.Class.class);
                cls2.getMethod("getInt", java.lang.Object.class, java.lang.Long.TYPE);
                cls2.getMethod("putInt", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                cls2.getMethod("getLong", java.lang.Object.class, java.lang.Long.TYPE);
                cls2.getMethod("putLong", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Long.TYPE);
                cls2.getMethod("getObject", java.lang.Object.class, java.lang.Long.TYPE);
                cls2.getMethod("putObject", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Object.class);
                z = true;
            } catch (java.lang.Throwable th2) {
                zzz(th2);
            }
            zzg = z;
            zza = zzA(byte[].class);
            zzA(boolean[].class);
            zzB(boolean[].class);
            zzA(int[].class);
            zzB(int[].class);
            zzA(long[].class);
            zzB(long[].class);
            zzA(float[].class);
            zzB(float[].class);
            zzA(double[].class);
            zzB(double[].class);
            zzA(java.lang.Object[].class);
            zzB(java.lang.Object[].class);
            zzC = zzC();
            j = -1;
            if (zzC != null && (zzigzVar = zzf) != null) {
                j = zzigzVar.zza.objectFieldOffset(zzC);
            }
            zzh = j;
            zzb = java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.BIG_ENDIAN;
        }
        z = false;
        zzg = z;
        zza = zzA(byte[].class);
        zzA(boolean[].class);
        zzB(boolean[].class);
        zzA(int[].class);
        zzB(int[].class);
        zzA(long[].class);
        zzB(long[].class);
        zzA(float[].class);
        zzB(float[].class);
        zzA(double[].class);
        zzB(double[].class);
        zzA(java.lang.Object[].class);
        zzB(java.lang.Object[].class);
        zzC = zzC();
        j = -1;
        if (zzC != null) {
            j = zzigzVar.zza.objectFieldOffset(zzC);
        }
        zzh = j;
        zzb = java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.BIG_ENDIAN;
    }

    private zziha() {
    }

    private static int zzA(java.lang.Class cls) {
        if (zzg) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzB(java.lang.Class cls) {
        if (zzg) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static java.lang.reflect.Field zzC() {
        int i = com.google.android.gms.internal.ads.zzicn.zza;
        java.lang.reflect.Field zzD = zzD(java.nio.Buffer.class, "effectiveDirectAddress");
        if (zzD != null) {
            return zzD;
        }
        java.lang.reflect.Field zzD2 = zzD(java.nio.Buffer.class, com.facebook.appevents.integrity.IntegrityManager.INTEGRITY_TYPE_ADDRESS);
        if (zzD2 == null || zzD2.getType() != java.lang.Long.TYPE) {
            return null;
        }
        return zzD2;
    }

    private static java.lang.reflect.Field zzD(java.lang.Class cls, java.lang.String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzE(java.lang.Object obj, long j, byte b) {
        sun.misc.Unsafe unsafe = zzf.zza;
        long j2 = (-4) & j;
        int i = unsafe.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b) << i2) | (i & (~(255 << i2))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzF(java.lang.Object obj, long j, byte b) {
        sun.misc.Unsafe unsafe = zzf.zza;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b) << i) | (unsafe.getInt(obj, j2) & (~(255 << i))));
    }

    static boolean zza() {
        return zzg;
    }

    static java.lang.Object zzb(java.lang.Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (java.lang.InstantiationException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    static int zzc(java.lang.Object obj, long j) {
        return zzf.zza.getInt(obj, j);
    }

    static void zzd(java.lang.Object obj, long j, int i) {
        zzf.zza.putInt(obj, j, i);
    }

    static long zze(java.lang.Object obj, long j) {
        return zzf.zza.getLong(obj, j);
    }

    static void zzf(java.lang.Object obj, long j, long j2) {
        zzf.zza.putLong(obj, j, j2);
    }

    static boolean zzg(java.lang.Object obj, long j) {
        return zzf.zzb(obj, j);
    }

    static void zzh(java.lang.Object obj, long j, boolean z) {
        zzf.zzc(obj, j, z);
    }

    static float zzi(java.lang.Object obj, long j) {
        return zzf.zzd(obj, j);
    }

    static void zzj(java.lang.Object obj, long j, float f) {
        zzf.zze(obj, j, f);
    }

    static double zzk(java.lang.Object obj, long j) {
        return zzf.zzf(obj, j);
    }

    static void zzl(java.lang.Object obj, long j, double d) {
        zzf.zzg(obj, j, d);
    }

    static java.lang.Object zzm(java.lang.Object obj, long j) {
        return zzf.zza.getObject(obj, j);
    }

    static void zzn(java.lang.Object obj, long j, java.lang.Object obj2) {
        zzf.zza.putObject(obj, j, obj2);
    }

    static void zzo(byte[] bArr, long j, byte b) {
        zzf.zza(bArr, zza + j, b);
    }

    static byte zzp(long j) {
        return zzf.zzh(j);
    }

    static long zzq(java.nio.ByteBuffer byteBuffer) {
        com.google.android.gms.internal.ads.zzigz zzigzVar = zzf;
        return zzigzVar.zza.getLong(byteBuffer, zzh);
    }

    static sun.misc.Unsafe zzr() {
        sun.misc.Unsafe unsafe;
        try {
            unsafe = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.android.gms.internal.ads.zzigw());
        } catch (java.lang.Throwable unused) {
            unsafe = null;
        }
        if (unsafe == null) {
            return null;
        }
        try {
            unsafe.arrayBaseOffset(byte[].class);
            return unsafe;
        } catch (java.lang.Exception unused2) {
            java.util.logging.Logger.getLogger(com.google.android.gms.internal.ads.zziha.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean zzs(java.lang.Class cls) {
        int i = com.google.android.gms.internal.ads.zzicn.zza;
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

    static /* synthetic */ boolean zzv(java.lang.Object obj, long j) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    static /* synthetic */ boolean zzw(java.lang.Object obj, long j) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    static /* synthetic */ void zzz(java.lang.Throwable th) {
        java.util.logging.Logger.getLogger(com.google.android.gms.internal.ads.zziha.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }
}
