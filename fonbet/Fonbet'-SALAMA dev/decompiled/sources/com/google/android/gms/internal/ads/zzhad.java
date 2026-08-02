package com.google.android.gms.internal.ads;

import io.sentry.SentryLockReason;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class zzhad {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd;
    private static final boolean zze;
    private static final zzhac zzf;
    private static final boolean zzg;
    private static final boolean zzh;
    private static final long zzi;

    /* JADX WARN: Removed duplicated region for block: B:15:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    static {
        boolean z4;
        zzhac zzhacVar;
        boolean z7;
        Field zzE;
        long j;
        zzhac zzhacVar2;
        Unsafe zzi2 = zzi();
        zzc = zzi2;
        int i7 = zzgvl.zza;
        zzd = Memory.class;
        Class cls = Long.TYPE;
        boolean zzy = zzy(cls);
        zze = zzy;
        boolean zzy2 = zzy(Integer.TYPE);
        zzhac zzhacVar3 = null;
        if (zzi2 != null) {
            if (zzy) {
                zzhacVar3 = new zzhab(zzi2);
            } else if (zzy2) {
                zzhacVar3 = new zzhaa(zzi2);
            }
        }
        zzf = zzhacVar3;
        if (zzhacVar3 != null) {
            try {
                Class<?> cls2 = zzhacVar3.zza.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("getLong", Object.class, cls);
            } catch (Throwable th) {
                zzj(th);
            }
            if (zzE() != null) {
                z4 = true;
                zzg = z4;
                zzhacVar = zzf;
                if (zzhacVar != null) {
                    try {
                        Class<?> cls3 = zzhacVar.zza.getClass();
                        cls3.getMethod("objectFieldOffset", Field.class);
                        cls3.getMethod("arrayBaseOffset", Class.class);
                        cls3.getMethod("arrayIndexScale", Class.class);
                        Class cls4 = Long.TYPE;
                        cls3.getMethod("getInt", Object.class, cls4);
                        cls3.getMethod("putInt", Object.class, cls4, Integer.TYPE);
                        cls3.getMethod("getLong", Object.class, cls4);
                        cls3.getMethod("putLong", Object.class, cls4, cls4);
                        cls3.getMethod("getObject", Object.class, cls4);
                        cls3.getMethod("putObject", Object.class, cls4, Object.class);
                        z7 = true;
                    } catch (Throwable th2) {
                        zzj(th2);
                    }
                    zzh = z7;
                    zza = zzC(byte[].class);
                    zzC(boolean[].class);
                    zzD(boolean[].class);
                    zzC(int[].class);
                    zzD(int[].class);
                    zzC(long[].class);
                    zzD(long[].class);
                    zzC(float[].class);
                    zzD(float[].class);
                    zzC(double[].class);
                    zzD(double[].class);
                    zzC(Object[].class);
                    zzD(Object[].class);
                    zzE = zzE();
                    j = -1;
                    if (zzE != null && (zzhacVar2 = zzf) != null) {
                        j = zzhacVar2.zza.objectFieldOffset(zzE);
                    }
                    zzi = j;
                    zzb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                }
                z7 = false;
                zzh = z7;
                zza = zzC(byte[].class);
                zzC(boolean[].class);
                zzD(boolean[].class);
                zzC(int[].class);
                zzD(int[].class);
                zzC(long[].class);
                zzD(long[].class);
                zzC(float[].class);
                zzD(float[].class);
                zzC(double[].class);
                zzD(double[].class);
                zzC(Object[].class);
                zzD(Object[].class);
                zzE = zzE();
                j = -1;
                if (zzE != null) {
                    j = zzhacVar2.zza.objectFieldOffset(zzE);
                }
                zzi = j;
                zzb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
            }
        }
        z4 = false;
        zzg = z4;
        zzhacVar = zzf;
        if (zzhacVar != null) {
        }
        z7 = false;
        zzh = z7;
        zza = zzC(byte[].class);
        zzC(boolean[].class);
        zzD(boolean[].class);
        zzC(int[].class);
        zzD(int[].class);
        zzC(long[].class);
        zzD(long[].class);
        zzC(float[].class);
        zzD(float[].class);
        zzC(double[].class);
        zzD(double[].class);
        zzC(Object[].class);
        zzD(Object[].class);
        zzE = zzE();
        j = -1;
        if (zzE != null) {
        }
        zzi = j;
        zzb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zzhad() {
    }

    public static boolean zzA() {
        return zzh;
    }

    public static boolean zzB() {
        return zzg;
    }

    private static int zzC(Class cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzD(Class cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zzE() {
        int i7 = zzgvl.zza;
        Field zzF = zzF(Buffer.class, "effectiveDirectAddress");
        if (zzF != null) {
            return zzF;
        }
        Field zzF2 = zzF(Buffer.class, SentryLockReason.JsonKeys.ADDRESS);
        if (zzF2 == null || zzF2.getType() != Long.TYPE) {
            return null;
        }
        return zzF2;
    }

    private static Field zzF(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzG(Object obj, long j, byte b7) {
        zzhac zzhacVar = zzf;
        long j3 = (-4) & j;
        int i7 = zzhacVar.zza.getInt(obj, j3);
        int i8 = ((~((int) j)) & 3) << 3;
        zzhacVar.zza.putInt(obj, j3, ((255 & b7) << i8) | (i7 & (~(255 << i8))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzH(Object obj, long j, byte b7) {
        zzhac zzhacVar = zzf;
        long j3 = (-4) & j;
        int i7 = (((int) j) & 3) << 3;
        zzhacVar.zza.putInt(obj, j3, ((255 & b7) << i7) | (zzhacVar.zza.getInt(obj, j3) & (~(255 << i7))));
    }

    public static byte zza(long j) {
        return zzf.zza(j);
    }

    public static double zzb(Object obj, long j) {
        return zzf.zzb(obj, j);
    }

    public static float zzc(Object obj, long j) {
        return zzf.zzc(obj, j);
    }

    public static int zzd(Object obj, long j) {
        return zzf.zza.getInt(obj, j);
    }

    public static long zze(ByteBuffer byteBuffer) {
        zzhac zzhacVar = zzf;
        return zzhacVar.zza.getLong(byteBuffer, zzi);
    }

    public static long zzf(Object obj, long j) {
        return zzf.zza.getLong(obj, j);
    }

    public static Object zzg(Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e7) {
            throw new IllegalStateException(e7);
        }
    }

    public static Object zzh(Object obj, long j) {
        return zzf.zza.getObject(obj, j);
    }

    public static Unsafe zzi() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzgzz());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void zzj(Throwable th) {
        Logger.getLogger(zzhad.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    public static void zzo(long j, byte[] bArr, long j3, long j7) {
        zzf.zzd(j, bArr, j3, j7);
    }

    public static void zzp(Object obj, long j, boolean z4) {
        zzf.zze(obj, j, z4);
    }

    public static void zzq(byte[] bArr, long j, byte b7) {
        zzf.zzf(bArr, zza + j, b7);
    }

    public static void zzr(Object obj, long j, double d7) {
        zzf.zzg(obj, j, d7);
    }

    public static void zzs(Object obj, long j, float f7) {
        zzf.zzh(obj, j, f7);
    }

    public static void zzt(Object obj, long j, int i7) {
        zzf.zza.putInt(obj, j, i7);
    }

    public static void zzu(Object obj, long j, long j3) {
        zzf.zza.putLong(obj, j, j3);
    }

    public static void zzv(Object obj, long j, Object obj2) {
        zzf.zza.putObject(obj, j, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean zzw(Object obj, long j) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean zzx(Object obj, long j) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static boolean zzy(Class cls) {
        int i7 = zzgvl.zza;
        try {
            Class cls2 = zzd;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean zzz(Object obj, long j) {
        return zzf.zzi(obj, j);
    }
}
