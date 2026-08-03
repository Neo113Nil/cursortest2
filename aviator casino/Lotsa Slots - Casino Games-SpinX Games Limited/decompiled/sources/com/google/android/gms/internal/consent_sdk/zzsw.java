package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
final class zzsw {
    static final long zza;
    static final boolean zzb;
    private static final sun.misc.Unsafe zzc;
    private static final java.lang.Class zzd;
    private static final boolean zze;
    private static final com.google.android.gms.internal.consent_sdk.zzsv zzf;
    private static final boolean zzg;
    private static final boolean zzh;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    static {
        boolean z;
        com.google.android.gms.internal.consent_sdk.zzsv zzsvVar;
        boolean z2;
        java.lang.reflect.Field zzB;
        com.google.android.gms.internal.consent_sdk.zzsv zzsvVar2;
        sun.misc.Unsafe zzg2 = zzg();
        zzc = zzg2;
        int i = com.google.android.gms.internal.consent_sdk.zzpc.zza;
        zzd = libcore.io.Memory.class;
        boolean zzv = zzv(java.lang.Long.TYPE);
        zze = zzv;
        boolean zzv2 = zzv(java.lang.Integer.TYPE);
        com.google.android.gms.internal.consent_sdk.zzsv zzsvVar3 = null;
        if (zzg2 != null) {
            if (zzv) {
                zzsvVar3 = new com.google.android.gms.internal.consent_sdk.zzsu(zzg2);
            } else if (zzv2) {
                zzsvVar3 = new com.google.android.gms.internal.consent_sdk.zzst(zzg2);
            }
        }
        zzf = zzsvVar3;
        if (zzsvVar3 != null) {
            try {
                java.lang.Class<?> cls = zzsvVar3.zza.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls.getMethod("getLong", java.lang.Object.class, java.lang.Long.TYPE);
            } catch (java.lang.Throwable th) {
                zzh(th);
            }
            if (zzB() != null) {
                z = true;
                zzg = z;
                zzsvVar = zzf;
                if (zzsvVar != null) {
                    try {
                        java.lang.Class<?> cls2 = zzsvVar.zza.getClass();
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
                    if (zzB != null && (zzsvVar2 = zzf) != null) {
                        zzsvVar2.zza.objectFieldOffset(zzB);
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
                    zzsvVar2.zza.objectFieldOffset(zzB);
                }
                zzb = java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.BIG_ENDIAN;
            }
        }
        z = false;
        zzg = z;
        zzsvVar = zzf;
        if (zzsvVar != null) {
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

    private zzsw() {
    }

    private static int zzA(java.lang.Class cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static java.lang.reflect.Field zzB() {
        int i = com.google.android.gms.internal.consent_sdk.zzpc.zza;
        java.lang.reflect.Field zzC = zzC(java.nio.Buffer.class, "effectiveDirectAddress");
        if (zzC != null) {
            return zzC;
        }
        java.lang.reflect.Field zzC2 = zzC(java.nio.Buffer.class, com.facebook.appevents.integrity.IntegrityManager.INTEGRITY_TYPE_ADDRESS);
        if (zzC2 == null || zzC2.getType() != java.lang.Long.TYPE) {
            return null;
        }
        return zzC2;
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
        unsafe.putInt(obj, j2, ((255 & b) << i2) | (i & (~(255 << i2))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzE(java.lang.Object obj, long j, byte b) {
        sun.misc.Unsafe unsafe = zzf.zza;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b) << i) | (unsafe.getInt(obj, j2) & (~(255 << i))));
    }

    static double zza(java.lang.Object obj, long j) {
        return zzf.zza(obj, j);
    }

    static float zzb(java.lang.Object obj, long j) {
        return zzf.zzb(obj, j);
    }

    static int zzc(java.lang.Object obj, long j) {
        return zzf.zza.getInt(obj, j);
    }

    static long zzd(java.lang.Object obj, long j) {
        return zzf.zza.getLong(obj, j);
    }

    static java.lang.Object zze(java.lang.Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (java.lang.InstantiationException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    static java.lang.Object zzf(java.lang.Object obj, long j) {
        return zzf.zza.getObject(obj, j);
    }

    static sun.misc.Unsafe zzg() {
        try {
            return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.android.gms.internal.consent_sdk.zzss());
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void zzh(java.lang.Throwable th) {
        java.util.logging.Logger.getLogger(com.google.android.gms.internal.consent_sdk.zzsw.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    static void zzm(java.lang.Object obj, long j, boolean z) {
        zzf.zzc(obj, j, z);
    }

    static void zzn(byte[] bArr, long j, byte b) {
        zzf.zzd(bArr, zza + j, b);
    }

    static void zzo(java.lang.Object obj, long j, double d) {
        zzf.zze(obj, j, d);
    }

    static void zzp(java.lang.Object obj, long j, float f) {
        zzf.zzf(obj, j, f);
    }

    static void zzq(java.lang.Object obj, long j, int i) {
        zzf.zza.putInt(obj, j, i);
    }

    static void zzr(java.lang.Object obj, long j, long j2) {
        zzf.zza.putLong(obj, j, j2);
    }

    static void zzs(java.lang.Object obj, long j, java.lang.Object obj2) {
        zzf.zza.putObject(obj, j, obj2);
    }

    static /* bridge */ /* synthetic */ boolean zzt(java.lang.Object obj, long j) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean zzu(java.lang.Object obj, long j) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean zzv(java.lang.Class cls) {
        int i = com.google.android.gms.internal.consent_sdk.zzpc.zza;
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

    static boolean zzw(java.lang.Object obj, long j) {
        return zzf.zzg(obj, j);
    }

    static boolean zzx() {
        return zzh;
    }

    static boolean zzy() {
        return zzg;
    }

    private static int zzz(java.lang.Class cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }
}
