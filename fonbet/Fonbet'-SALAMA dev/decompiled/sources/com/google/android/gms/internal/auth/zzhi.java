package com.google.android.gms.internal.auth;

import io.sentry.SentryLockReason;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class zzhi {
    static final boolean zza;
    private static final Unsafe zzb;
    private static final Class zzc;
    private static final boolean zzd;
    private static final zzhh zze;
    private static final boolean zzf;
    private static final boolean zzg;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    static {
        boolean z4;
        zzhh zzhhVar;
        boolean z7;
        Field zzy;
        zzhh zzhhVar2;
        Unsafe zzg2 = zzg();
        zzb = zzg2;
        zzc = zzdr.zza();
        Class cls = Long.TYPE;
        boolean zzs = zzs(cls);
        zzd = zzs;
        boolean zzs2 = zzs(Integer.TYPE);
        zzhh zzhhVar3 = null;
        if (zzg2 != null) {
            if (zzs) {
                zzhhVar3 = new zzhg(zzg2);
            } else if (zzs2) {
                zzhhVar3 = new zzhf(zzg2);
            }
        }
        zze = zzhhVar3;
        if (zzhhVar3 != null) {
            try {
                Class<?> cls2 = zzhhVar3.zza.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("getLong", Object.class, cls);
            } catch (Throwable th) {
                zzh(th);
            }
            if (zzy() != null) {
                z4 = true;
                zzf = z4;
                zzhhVar = zze;
                if (zzhhVar != null) {
                    try {
                        Class<?> cls3 = zzhhVar.zza.getClass();
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
                        zzh(th2);
                    }
                    zzg = z7;
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
                    zzw(Object[].class);
                    zzx(Object[].class);
                    zzy = zzy();
                    if (zzy != null && (zzhhVar2 = zze) != null) {
                        zzhhVar2.zzk(zzy);
                    }
                    zza = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                }
                z7 = false;
                zzg = z7;
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
                zzw(Object[].class);
                zzx(Object[].class);
                zzy = zzy();
                if (zzy != null) {
                    zzhhVar2.zzk(zzy);
                }
                zza = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
            }
        }
        z4 = false;
        zzf = z4;
        zzhhVar = zze;
        if (zzhhVar != null) {
        }
        z7 = false;
        zzg = z7;
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
        zzw(Object[].class);
        zzx(Object[].class);
        zzy = zzy();
        if (zzy != null) {
        }
        zza = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zzhi() {
    }

    public static double zza(Object obj, long j) {
        return zze.zza(obj, j);
    }

    public static float zzb(Object obj, long j) {
        return zze.zzb(obj, j);
    }

    public static int zzc(Object obj, long j) {
        return zze.zzi(obj, j);
    }

    public static long zzd(Object obj, long j) {
        return zze.zzj(obj, j);
    }

    public static Object zze(Class cls) {
        try {
            return zzb.allocateInstance(cls);
        } catch (InstantiationException e7) {
            throw new IllegalStateException(e7);
        }
    }

    public static Object zzf(Object obj, long j) {
        return zze.zzl(obj, j);
    }

    public static Unsafe zzg() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzhe());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void zzh(Throwable th) {
        Logger.getLogger(zzhi.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    public static /* synthetic */ void zzi(Object obj, long j, boolean z4) {
        long j3 = (-4) & j;
        zzhh zzhhVar = zze;
        int zzi = zzhhVar.zzi(obj, j3);
        int i7 = ((~((int) j)) & 3) << 3;
        zzhhVar.zzm(obj, j3, ((z4 ? 1 : 0) << i7) | ((~(255 << i7)) & zzi));
    }

    public static /* synthetic */ void zzj(Object obj, long j, boolean z4) {
        long j3 = (-4) & j;
        zzhh zzhhVar = zze;
        int i7 = (((int) j) & 3) << 3;
        zzhhVar.zzm(obj, j3, ((z4 ? 1 : 0) << i7) | ((~(255 << i7)) & zzhhVar.zzi(obj, j3)));
    }

    public static void zzk(Object obj, long j, boolean z4) {
        zze.zzc(obj, j, z4);
    }

    public static void zzl(Object obj, long j, double d7) {
        zze.zzd(obj, j, d7);
    }

    public static void zzm(Object obj, long j, float f7) {
        zze.zze(obj, j, f7);
    }

    public static void zzn(Object obj, long j, int i7) {
        zze.zzm(obj, j, i7);
    }

    public static void zzo(Object obj, long j, long j3) {
        zze.zzn(obj, j, j3);
    }

    public static void zzp(Object obj, long j, Object obj2) {
        zze.zzo(obj, j, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean zzq(Object obj, long j) {
        return ((byte) ((zze.zzi(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean zzr(Object obj, long j) {
        return ((byte) ((zze.zzi(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static boolean zzs(Class cls) {
        int i7 = zzdr.zza;
        try {
            Class cls2 = zzc;
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

    public static boolean zzt(Object obj, long j) {
        return zze.zzf(obj, j);
    }

    public static boolean zzu() {
        return zzg;
    }

    public static boolean zzv() {
        return zzf;
    }

    private static int zzw(Class cls) {
        if (zzg) {
            return zze.zzg(cls);
        }
        return -1;
    }

    private static int zzx(Class cls) {
        if (zzg) {
            return zze.zzh(cls);
        }
        return -1;
    }

    private static Field zzy() {
        int i7 = zzdr.zza;
        Field zzz = zzz(Buffer.class, "effectiveDirectAddress");
        if (zzz != null) {
            return zzz;
        }
        Field zzz2 = zzz(Buffer.class, SentryLockReason.JsonKeys.ADDRESS);
        if (zzz2 == null || zzz2.getType() != Long.TYPE) {
            return null;
        }
        return zzz2;
    }

    private static Field zzz(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
