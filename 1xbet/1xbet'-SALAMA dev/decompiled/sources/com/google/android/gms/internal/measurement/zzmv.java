package com.google.android.gms.internal.measurement;

import io.sentry.SentryLockReason;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
final class zzmv {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd;
    private static final boolean zze;
    private static final zzmu zzf;
    private static final boolean zzg;
    private static final boolean zzh;

    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    static {
        boolean z4;
        boolean z7;
        zzmu zzmuVar;
        Unsafe unsafeZzg = zzg();
        zzc = unsafeZzg;
        zzd = zzin.zza();
        Class cls = Long.TYPE;
        boolean zZzv = zzv(cls);
        zze = zZzv;
        boolean zZzv2 = zzv(Integer.TYPE);
        zzmu zzmsVar = null;
        if (unsafeZzg != null) {
            if (zZzv) {
                zzmsVar = new zzmt(unsafeZzg);
            } else if (zZzv2) {
                zzmsVar = new zzms(unsafeZzg);
            }
        }
        zzf = zzmsVar;
        if (zzmsVar == null) {
            z4 = false;
        } else {
            try {
                Class<?> cls2 = zzmsVar.zza.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("getLong", Object.class, cls);
                if (zzB() == null) {
                    z4 = false;
                } else {
                    z4 = true;
                }
            } catch (Throwable th) {
                zzh(th);
            }
        }
        zzg = z4;
        zzmu zzmuVar2 = zzf;
        if (zzmuVar2 == null) {
            z7 = false;
        } else {
            try {
                Class<?> cls3 = zzmuVar2.zza.getClass();
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
                z7 = false;
            }
        }
        zzh = z7;
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
        zzz(Object[].class);
        zzA(Object[].class);
        Field fieldZzB = zzB();
        if (fieldZzB != null && (zzmuVar = zzf) != null) {
            zzmuVar.zzl(fieldZzB);
        }
        zzb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zzmv() {
    }

    private static int zzA(Class cls) {
        if (zzh) {
            return zzf.zzi(cls);
        }
        return -1;
    }

    private static Field zzB() {
        int i7 = zzin.zza;
        Field fieldZzC = zzC(Buffer.class, "effectiveDirectAddress");
        if (fieldZzC != null) {
            return fieldZzC;
        }
        Field fieldZzC2 = zzC(Buffer.class, SentryLockReason.JsonKeys.ADDRESS);
        if (fieldZzC2 == null || fieldZzC2.getType() != Long.TYPE) {
            return null;
        }
        return fieldZzC2;
    }

    private static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzD(Object obj, long j, byte b7) {
        long j3 = (-4) & j;
        zzmu zzmuVar = zzf;
        int iZzj = zzmuVar.zzj(obj, j3);
        int i7 = ((~((int) j)) & 3) << 3;
        zzmuVar.zzn(obj, j3, ((255 & b7) << i7) | (iZzj & (~(255 << i7))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzE(Object obj, long j, byte b7) {
        long j3 = (-4) & j;
        zzmu zzmuVar = zzf;
        int i7 = (((int) j) & 3) << 3;
        zzmuVar.zzn(obj, j3, ((255 & b7) << i7) | (zzmuVar.zzj(obj, j3) & (~(255 << i7))));
    }

    public static double zza(Object obj, long j) {
        return zzf.zza(obj, j);
    }

    public static float zzb(Object obj, long j) {
        return zzf.zzb(obj, j);
    }

    public static int zzc(Object obj, long j) {
        return zzf.zzj(obj, j);
    }

    public static long zzd(Object obj, long j) {
        return zzf.zzk(obj, j);
    }

    public static Object zze(Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e7) {
            throw new IllegalStateException(e7);
        }
    }

    public static Object zzf(Object obj, long j) {
        return zzf.zzm(obj, j);
    }

    public static Unsafe zzg() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzmr());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void zzh(Throwable th) {
        Logger.getLogger(zzmv.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    public static void zzm(Object obj, long j, boolean z4) {
        zzf.zzc(obj, j, z4);
    }

    public static void zzn(byte[] bArr, long j, byte b7) {
        zzf.zzd(bArr, zza + j, b7);
    }

    public static void zzo(Object obj, long j, double d7) {
        zzf.zze(obj, j, d7);
    }

    public static void zzp(Object obj, long j, float f7) {
        zzf.zzf(obj, j, f7);
    }

    public static void zzq(Object obj, long j, int i7) {
        zzf.zzn(obj, j, i7);
    }

    public static void zzr(Object obj, long j, long j3) {
        zzf.zzo(obj, j, j3);
    }

    public static void zzs(Object obj, long j, Object obj2) {
        zzf.zzp(obj, j, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean zzt(Object obj, long j) {
        return ((byte) ((zzf.zzj(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean zzu(Object obj, long j) {
        return ((byte) ((zzf.zzj(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static boolean zzv(Class cls) {
        int i7 = zzin.zza;
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

    public static boolean zzw(Object obj, long j) {
        return zzf.zzg(obj, j);
    }

    public static boolean zzx() {
        return zzh;
    }

    public static boolean zzy() {
        return zzg;
    }

    private static int zzz(Class cls) {
        if (zzh) {
            return zzf.zzh(cls);
        }
        return -1;
    }
}
