package com.google.android.gms.internal.measurement;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class zzabr {
    private static final zzd zzbww;
    private static final boolean zzbwx;
    private static final boolean zzbwy;
    private static final long zzbwz;
    private static final long zzbxa;
    private static final long zzbxb;
    private static final long zzbxc;
    private static final long zzbxd;
    private static final long zzbxe;
    private static final long zzbxf;
    private static final long zzbxg;
    private static final long zzbxh;
    private static final long zzbxi;
    private static final long zzbxj;
    private static final long zzbxk;
    private static final long zzbxl;
    private static final long zzbxm;
    private static final long zzbxn;
    private static final boolean zzbxo;
    private static final Logger logger = Logger.getLogger(zzabr.class.getName());
    private static final Unsafe zzbvq = zzvg();
    private static final Class<?> zzbtc = zzza.zztl();
    private static final boolean zzbwu = zzk(Long.TYPE);
    private static final boolean zzbwv = zzk(Integer.TYPE);

    static final class zza extends zzd {
        zza(Unsafe unsafe) {
            super(unsafe);
        }
    }

    static final class zzb extends zzd {
        zzb(Unsafe unsafe) {
            super(unsafe);
        }
    }

    static final class zzc extends zzd {
        zzc(Unsafe unsafe) {
            super(unsafe);
        }
    }

    static abstract class zzd {
        Unsafe zzbxp;

        zzd(Unsafe unsafe) {
            this.zzbxp = unsafe;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0105  */
    static {
        zzd zzcVar;
        Field zza2;
        if (zzbvq != null) {
            if (!zzza.zztk()) {
                zzcVar = new zzc(zzbvq);
            } else if (zzbwu) {
                zzcVar = new zzb(zzbvq);
            } else if (zzbwv) {
                zzcVar = new zza(zzbvq);
            }
            zzbww = zzcVar;
            zzbwx = zzvi();
            zzbwy = zzvh();
            zzbwz = zzi(byte[].class);
            zzbxa = zzi(boolean[].class);
            zzbxb = zzj(boolean[].class);
            zzbxc = zzi(int[].class);
            zzbxd = zzj(int[].class);
            zzbxe = zzi(long[].class);
            zzbxf = zzj(long[].class);
            zzbxg = zzi(float[].class);
            zzbxh = zzj(float[].class);
            zzbxi = zzi(double[].class);
            zzbxj = zzj(double[].class);
            zzbxk = zzi(Object[].class);
            zzbxl = zzj(Object[].class);
            zzbxm = zza(zzvj());
            zza2 = zza(String.class, FirebaseAnalytics.Param.VALUE);
            if (zza2 != null || zza2.getType() != char[].class) {
                zza2 = null;
            }
            zzbxn = zza(zza2);
            zzbxo = ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN;
        }
        zzcVar = null;
        zzbww = zzcVar;
        zzbwx = zzvi();
        zzbwy = zzvh();
        zzbwz = zzi(byte[].class);
        zzbxa = zzi(boolean[].class);
        zzbxb = zzj(boolean[].class);
        zzbxc = zzi(int[].class);
        zzbxd = zzj(int[].class);
        zzbxe = zzi(long[].class);
        zzbxf = zzj(long[].class);
        zzbxg = zzi(float[].class);
        zzbxh = zzj(float[].class);
        zzbxi = zzi(double[].class);
        zzbxj = zzj(double[].class);
        zzbxk = zzi(Object[].class);
        zzbxl = zzj(Object[].class);
        zzbxm = zza(zzvj());
        zza2 = zza(String.class, FirebaseAnalytics.Param.VALUE);
        if (zza2 != null) {
        }
        zza2 = null;
        zzbxn = zza(zza2);
        zzbxo = ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN;
    }

    private zzabr() {
    }

    private static long zza(Field field) {
        zzd zzdVar;
        if (field == null || (zzdVar = zzbww) == null) {
            return -1L;
        }
        return zzdVar.zzbxp.objectFieldOffset(field);
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static int zzi(Class<?> cls) {
        if (zzbwy) {
            return zzbww.zzbxp.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzj(Class<?> cls) {
        if (zzbwy) {
            return zzbww.zzbxp.arrayIndexScale(cls);
        }
        return -1;
    }

    private static boolean zzk(Class<?> cls) {
        if (!zzza.zztk()) {
            return false;
        }
        try {
            Class<?> cls2 = zzbtc;
            cls2.getMethod("peekLong", cls, Boolean.TYPE);
            cls2.getMethod("pokeLong", cls, Long.TYPE, Boolean.TYPE);
            cls2.getMethod("pokeInt", cls, Integer.TYPE, Boolean.TYPE);
            cls2.getMethod("peekInt", cls, Boolean.TYPE);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            cls2.getMethod("peekByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static Unsafe zzvg() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzabs());
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean zzvh() {
        Unsafe unsafe = zzbvq;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            cls.getMethod("getInt", Object.class, Long.TYPE);
            cls.getMethod("putInt", Object.class, Long.TYPE, Integer.TYPE);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            cls.getMethod("putLong", Object.class, Long.TYPE, Long.TYPE);
            cls.getMethod("getObject", Object.class, Long.TYPE);
            cls.getMethod("putObject", Object.class, Long.TYPE, Object.class);
            if (zzza.zztk()) {
                return true;
            }
            cls.getMethod("getByte", Object.class, Long.TYPE);
            cls.getMethod("putByte", Object.class, Long.TYPE, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, Long.TYPE);
            cls.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, Long.TYPE);
            cls.getMethod("putFloat", Object.class, Long.TYPE, Float.TYPE);
            cls.getMethod("getDouble", Object.class, Long.TYPE);
            cls.getMethod("putDouble", Object.class, Long.TYPE, Double.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger2 = logger;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger2.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    private static boolean zzvi() {
        Unsafe unsafe = zzbvq;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            if (zzvj() == null) {
                return false;
            }
            if (zzza.zztk()) {
                return true;
            }
            cls.getMethod("getByte", Long.TYPE);
            cls.getMethod("putByte", Long.TYPE, Byte.TYPE);
            cls.getMethod("getInt", Long.TYPE);
            cls.getMethod("putInt", Long.TYPE, Integer.TYPE);
            cls.getMethod("getLong", Long.TYPE);
            cls.getMethod("putLong", Long.TYPE, Long.TYPE);
            cls.getMethod("copyMemory", Long.TYPE, Long.TYPE, Long.TYPE);
            cls.getMethod("copyMemory", Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger2 = logger;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger2.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    private static Field zzvj() {
        Field zza2;
        if (zzza.zztk() && (zza2 = zza(Buffer.class, "effectiveDirectAddress")) != null) {
            return zza2;
        }
        Field zza3 = zza(Buffer.class, "address");
        if (zza3 == null || zza3.getType() != Long.TYPE) {
            return null;
        }
        return zza3;
    }
}
