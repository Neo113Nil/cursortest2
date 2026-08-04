package com.google.android.gms.internal.p002firebaseauthapi;

import io.sentry.SentryLockReason;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
final class zzamp {
    static final boolean zza;
    private static final Unsafe zzb;
    private static final Class<?> zzc;
    private static final boolean zzd;
    private static final boolean zze;
    private static final zzb zzf;
    private static final boolean zzg;
    private static final boolean zzh;
    private static final long zzi;

    public static final class zza extends zzb {
        public zza(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamp.zzb
        public final double zza(Object obj, long j) {
            return Double.longBitsToDouble(zze(obj, j));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamp.zzb
        public final float zzb(Object obj, long j) {
            return Float.intBitsToFloat(zzd(obj, j));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamp.zzb
        public final boolean zzc(Object obj, long j) {
            return zzamp.zza ? zzamp.zzf(obj, j) : zzamp.zzg(obj, j);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamp.zzb
        public final void zza(Object obj, long j, boolean z4) {
            if (zzamp.zza) {
                zzamp.zza(obj, j, z4);
            } else {
                zzamp.zzb(obj, j, z4);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamp.zzb
        public final void zza(Object obj, long j, byte b7) {
            if (!zzamp.zza) {
                zzamp.zzd(obj, j, b7);
            } else {
                zzamp.zzc(obj, j, b7);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamp.zzb
        public final void zza(Object obj, long j, double d7) {
            zza(obj, j, Double.doubleToLongBits(d7));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamp.zzb
        public final void zza(Object obj, long j, float f7) {
            zza(obj, j, Float.floatToIntBits(f7));
        }
    }

    public static abstract class zzb {
        Unsafe zza;

        public zzb(Unsafe unsafe) {
            this.zza = unsafe;
        }

        public abstract double zza(Object obj, long j);

        public abstract void zza(Object obj, long j, byte b7);

        public abstract void zza(Object obj, long j, double d7);

        public abstract void zza(Object obj, long j, float f7);

        public final void zza(Object obj, long j, int i7) {
            this.zza.putInt(obj, j, i7);
        }

        public abstract void zza(Object obj, long j, boolean z4);

        public abstract float zzb(Object obj, long j);

        public final boolean zzb() {
            Unsafe unsafe = this.zza;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return zzamp.zze() != null;
            } catch (Throwable th) {
                zzamp.zza(th);
                return false;
            }
        }

        public abstract boolean zzc(Object obj, long j);

        public final int zzd(Object obj, long j) {
            return this.zza.getInt(obj, j);
        }

        public final long zze(Object obj, long j) {
            return this.zza.getLong(obj, j);
        }

        public final void zza(Object obj, long j, long j3) {
            this.zza.putLong(obj, j, j3);
        }

        public final boolean zza() {
            Unsafe unsafe = this.zza;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                zzamp.zza(th);
                return false;
            }
        }
    }

    public static final class zzc extends zzb {
        public zzc(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamp.zzb
        public final double zza(Object obj, long j) {
            return Double.longBitsToDouble(zze(obj, j));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamp.zzb
        public final float zzb(Object obj, long j) {
            return Float.intBitsToFloat(zzd(obj, j));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamp.zzb
        public final boolean zzc(Object obj, long j) {
            return zzamp.zza ? zzamp.zzf(obj, j) : zzamp.zzg(obj, j);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamp.zzb
        public final void zza(Object obj, long j, boolean z4) {
            if (zzamp.zza) {
                zzamp.zza(obj, j, z4);
            } else {
                zzamp.zzb(obj, j, z4);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamp.zzb
        public final void zza(Object obj, long j, byte b7) {
            if (!zzamp.zza) {
                zzamp.zzd(obj, j, b7);
            } else {
                zzamp.zzc(obj, j, b7);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamp.zzb
        public final void zza(Object obj, long j, double d7) {
            zza(obj, j, Double.doubleToLongBits(d7));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamp.zzb
        public final void zza(Object obj, long j, float f7) {
            zza(obj, j, Float.floatToIntBits(f7));
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x002e  */
    static {
        zzb zzaVar;
        Unsafe unsafeZzb = zzb();
        zzb = unsafeZzb;
        zzc = zzaii.zza();
        boolean zZzd = zzd(Long.TYPE);
        zzd = zZzd;
        boolean zZzd2 = zzd(Integer.TYPE);
        zze = zZzd2;
        if (unsafeZzb == null) {
            zzaVar = null;
        } else if (zZzd) {
            zzaVar = new zzc(unsafeZzb);
        } else if (zZzd2) {
            zzaVar = new zza(unsafeZzb);
        } else {
            zzaVar = null;
        }
        zzf = zzaVar;
        zzg = zzaVar == null ? false : zzaVar.zzb();
        zzh = zzaVar == null ? false : zzaVar.zza();
        zzi = zzb(byte[].class);
        zzb(boolean[].class);
        zzc(boolean[].class);
        zzb(int[].class);
        zzc(int[].class);
        zzb(long[].class);
        zzc(long[].class);
        zzb(float[].class);
        zzc(float[].class);
        zzb(double[].class);
        zzc(double[].class);
        zzb(Object[].class);
        zzc(Object[].class);
        Field fieldZze = zze();
        if (fieldZze != null && zzaVar != null) {
            zzaVar.zza.objectFieldOffset(fieldZze);
        }
        zza = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zzamp() {
    }

    private static int zzc(Class<?> cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    public static long zzd(Object obj, long j) {
        return zzf.zze(obj, j);
    }

    public static Object zze(Object obj, long j) {
        return zzf.zza.getObject(obj, j);
    }

    public static /* synthetic */ boolean zzf(Object obj, long j) {
        return ((byte) (zzc(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3)))) != 0;
    }

    public static /* synthetic */ boolean zzg(Object obj, long j) {
        return ((byte) (zzc(obj, (-4) & j) >>> ((int) ((j & 3) << 3)))) != 0;
    }

    public static boolean zzh(Object obj, long j) {
        return zzf.zzc(obj, j);
    }

    public static float zzb(Object obj, long j) {
        return zzf.zzb(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzd(Object obj, long j, byte b7) {
        long j3 = (-4) & j;
        int i7 = (((int) j) & 3) << 3;
        zza(obj, j3, ((255 & b7) << i7) | (zzc(obj, j3) & (~(255 << i7))));
    }

    public static double zza(Object obj, long j) {
        return zzf.zza(obj, j);
    }

    private static int zzb(Class<?> cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static int zzc(Object obj, long j) {
        return zzf.zzd(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field zze() {
        Field fieldZza = zza((Class<?>) Buffer.class, "effectiveDirectAddress");
        if (fieldZza != null) {
            return fieldZza;
        }
        Field fieldZza2 = zza((Class<?>) Buffer.class, SentryLockReason.JsonKeys.ADDRESS);
        if (fieldZza2 == null || fieldZza2.getType() != Long.TYPE) {
            return null;
        }
        return fieldZza2;
    }

    public static <T> T zza(Class<T> cls) {
        try {
            return (T) zzb.allocateInstance(cls);
        } catch (InstantiationException e7) {
            throw new IllegalStateException(e7);
        }
    }

    public static void zzc(Object obj, long j, boolean z4) {
        zzf.zza(obj, j, z4);
    }

    private static boolean zzd(Class<?> cls) {
        try {
            Class<?> cls2 = zzc;
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

    public static Unsafe zzb() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzamr());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzc(Object obj, long j, byte b7) {
        long j3 = (-4) & j;
        int iZzc = zzc(obj, j3);
        int i7 = ((~((int) j)) & 3) << 3;
        zza(obj, j3, ((255 & b7) << i7) | (iZzc & (~(255 << i7))));
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ void zza(Throwable th) {
        Logger.getLogger(zzamp.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(String.valueOf(th)));
    }

    public static /* synthetic */ void zzb(Object obj, long j, boolean z4) {
        zzd(obj, j, z4 ? (byte) 1 : (byte) 0);
    }

    public static boolean zzc() {
        return zzh;
    }

    public static /* synthetic */ void zza(Object obj, long j, boolean z4) {
        zzc(obj, j, z4 ? (byte) 1 : (byte) 0);
    }

    public static void zza(byte[] bArr, long j, byte b7) {
        zzf.zza((Object) bArr, zzi + j, b7);
    }

    public static void zza(Object obj, long j, double d7) {
        zzf.zza(obj, j, d7);
    }

    public static void zza(Object obj, long j, float f7) {
        zzf.zza(obj, j, f7);
    }

    public static void zza(Object obj, long j, int i7) {
        zzf.zza(obj, j, i7);
    }

    public static boolean zzd() {
        return zzg;
    }

    public static void zza(Object obj, long j, long j3) {
        zzf.zza(obj, j, j3);
    }

    public static void zza(Object obj, long j, Object obj2) {
        zzf.zza.putObject(obj, j, obj2);
    }
}
