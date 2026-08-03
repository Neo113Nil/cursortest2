package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public abstract class x3 {

    /* renamed from: a, reason: collision with root package name */
    public static final sun.misc.Unsafe f4230a;
    public static final java.lang.Class b;
    public static final com.fyber.inneractive.sdk.protobuf.w3 c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final long g;
    public static final boolean h;

    /* JADX WARN: Can't wrap try/catch for region: R(23:0|1|(2:2|3)|4|(17:6|(1:(1:9)(1:(1:46)))(1:47)|10|(1:12)(1:44)|13|(1:15)(1:43)|16|(3:18|19|20)|35|36|37|(1:39)|(1:32)(1:25)|26|(1:28)|29|30)|48|10|(0)(0)|13|(0)(0)|16|(0)|35|36|37|(0)|(0)|32|26|(0)|29|30|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a4, code lost:
    
        if (r3 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a6, code lost:
    
        r0 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bb, code lost:
    
        if (r3.getType() == java.lang.Long.TYPE) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b1, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0048  */
    static {
        sun.misc.Unsafe unsafe;
        com.fyber.inneractive.sdk.protobuf.w3 w3Var;
        java.lang.reflect.Field field;
        java.lang.reflect.Field field2 = null;
        try {
            unsafe = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.fyber.inneractive.sdk.protobuf.s3());
        } catch (java.lang.Throwable unused) {
            unsafe = null;
        }
        f4230a = unsafe;
        b = com.fyber.inneractive.sdk.protobuf.d.f4183a;
        boolean c2 = c(java.lang.Long.TYPE);
        boolean c3 = c(java.lang.Integer.TYPE);
        if (unsafe != null) {
            if (!com.fyber.inneractive.sdk.protobuf.d.a()) {
                w3Var = new com.fyber.inneractive.sdk.protobuf.v3(unsafe);
            } else if (c2) {
                w3Var = new com.fyber.inneractive.sdk.protobuf.u3(unsafe);
            } else if (c3) {
                w3Var = new com.fyber.inneractive.sdk.protobuf.t3(unsafe);
            }
            c = w3Var;
            d = w3Var != null ? false : w3Var.b();
            e = w3Var != null ? false : w3Var.a();
            f = a(byte[].class);
            a(boolean[].class);
            b(boolean[].class);
            a(int[].class);
            b(int[].class);
            a(long[].class);
            b(long[].class);
            a(float[].class);
            b(float[].class);
            a(double[].class);
            b(double[].class);
            a(java.lang.Object[].class);
            b(java.lang.Object[].class);
            if (com.fyber.inneractive.sdk.protobuf.d.a()) {
                try {
                    field = java.nio.Buffer.class.getDeclaredField("effectiveDirectAddress");
                } catch (java.lang.Throwable unused2) {
                    field = null;
                }
            }
            field = java.nio.Buffer.class.getDeclaredField(com.facebook.appevents.integrity.IntegrityManager.INTEGRITY_TYPE_ADDRESS);
            if (field != null) {
            }
            g = (field2 != null || w3Var == null) ? -1L : w3Var.f4226a.objectFieldOffset(field2);
            h = java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.BIG_ENDIAN;
        }
        w3Var = null;
        c = w3Var;
        d = w3Var != null ? false : w3Var.b();
        e = w3Var != null ? false : w3Var.a();
        f = a(byte[].class);
        a(boolean[].class);
        b(boolean[].class);
        a(int[].class);
        b(int[].class);
        a(long[].class);
        b(long[].class);
        a(float[].class);
        b(float[].class);
        a(double[].class);
        b(double[].class);
        a(java.lang.Object[].class);
        b(java.lang.Object[].class);
        if (com.fyber.inneractive.sdk.protobuf.d.a()) {
        }
        field = java.nio.Buffer.class.getDeclaredField(com.facebook.appevents.integrity.IntegrityManager.INTEGRITY_TYPE_ADDRESS);
        if (field != null) {
        }
        g = (field2 != null || w3Var == null) ? -1L : w3Var.f4226a.objectFieldOffset(field2);
        h = java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.BIG_ENDIAN;
    }

    public static int a(java.lang.Class cls) {
        if (e) {
            return c.f4226a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void b(java.lang.Class cls) {
        if (e) {
            c.f4226a.arrayIndexScale(cls);
        }
    }

    public static int c(java.lang.Object obj, long j) {
        return c.f4226a.getInt(obj, j);
    }

    public static long d(java.lang.Object obj, long j) {
        return c.f4226a.getLong(obj, j);
    }

    public static java.lang.Object e(java.lang.Object obj, long j) {
        return c.f4226a.getObject(obj, j);
    }

    public static void a(java.lang.Object obj, long j, int i) {
        c.f4226a.putInt(obj, j, i);
    }

    public static byte b(java.lang.Object obj, long j) {
        return (byte) ((c(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean c(java.lang.Class cls) {
        if (!com.fyber.inneractive.sdk.protobuf.d.a()) {
            return false;
        }
        try {
            java.lang.Class cls2 = b;
            java.lang.Class cls3 = java.lang.Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, java.lang.Long.TYPE, cls3);
            java.lang.Class cls4 = java.lang.Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, java.lang.Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    public static void b(java.lang.Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        a(obj, j2, ((255 & b2) << i) | (c(obj, j2) & (~(255 << i))));
    }

    public static void a(java.lang.Object obj, long j, long j2) {
        c.f4226a.putLong(obj, j, j2);
    }

    public static void a(long j, java.lang.Object obj, java.lang.Object obj2) {
        c.f4226a.putObject(obj, j, obj2);
    }

    public static byte a(java.lang.Object obj, long j) {
        return (byte) ((c(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static void a(java.lang.Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int c2 = c(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        a(obj, j2, ((255 & b2) << i) | (c2 & (~(255 << i))));
    }

    public static void a(java.lang.Throwable th) {
        java.util.logging.Logger.getLogger(com.fyber.inneractive.sdk.protobuf.x3.class.getName()).log(java.util.logging.Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }
}
