package com.google.android.gms.internal.ads;

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
public abstract class CC {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f7971a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f7972b;

    /* renamed from: c, reason: collision with root package name */
    public static final BC f7973c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f7974d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f7975e;
    public static final long f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f7976g;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f7977h;

    /* JADX WARN: Can't wrap try/catch for region: R(21:0|1|(18:(1:66)(1:(1:68))|4|(7:44|45|46|47|48|(4:52|53|(1:55)|58)|(15:51|7|(15:37|38|39|40|10|11|12|(3:27|28|(7:32|15|(1:19)|20|(1:22)(1:26)|23|24))|14|15|(2:17|19)|20|(0)(0)|23|24)|9|10|11|12|(0)|14|15|(0)|20|(0)(0)|23|24))|6|7|(0)|9|10|11|12|(0)|14|15|(0)|20|(0)(0)|23|24)|3|4|(0)|6|7|(0)|9|10|11|12|(0)|14|15|(0)|20|(0)(0)|23|24) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x016f, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x007a, code lost:
    
        if (r0.getType() == r6) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0172 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004e  */
    static {
        BC c1869zC;
        Field field;
        boolean z3;
        BC bc;
        boolean z5;
        Field field2;
        Field field3;
        long j5;
        BC bc2;
        Unsafe j6 = j();
        f7971a = j6;
        int i = AbstractC1553sB.f15428a;
        f7972b = Memory.class;
        Class<?> cls = Long.TYPE;
        boolean q5 = q(cls);
        Class<?> cls2 = Integer.TYPE;
        boolean q6 = q(cls2);
        if (j6 != null) {
            if (q5) {
                c1869zC = new AC(j6);
            } else if (q6) {
                c1869zC = new C1869zC(j6);
            }
            f7973c = c1869zC;
            if (c1869zC != null) {
                try {
                    Class<?> cls3 = ((Unsafe) c1869zC.f7794k).getClass();
                    cls3.getMethod("objectFieldOffset", Field.class);
                    cls3.getMethod("getLong", Object.class, cls);
                    try {
                        field = Buffer.class.getDeclaredField("effectiveDirectAddress");
                    } catch (Throwable unused) {
                        field = null;
                    }
                    if (field == null) {
                        try {
                            field = Buffer.class.getDeclaredField("address");
                        } catch (Throwable unused2) {
                            field = null;
                        }
                        if (field != null) {
                        }
                        field = null;
                    }
                } catch (Throwable th) {
                    Logger.getLogger(CC.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
                }
                if (field != null) {
                    z3 = true;
                    f7974d = z3;
                    bc = f7973c;
                    if (bc != null) {
                        try {
                            Class<?> cls4 = ((Unsafe) bc.f7794k).getClass();
                            cls4.getMethod("objectFieldOffset", Field.class);
                            cls4.getMethod("arrayBaseOffset", Class.class);
                            cls4.getMethod("arrayIndexScale", Class.class);
                            cls4.getMethod("getInt", Object.class, cls);
                            cls4.getMethod("putInt", Object.class, cls, cls2);
                            cls4.getMethod("getLong", Object.class, cls);
                            cls4.getMethod("putLong", Object.class, cls, cls);
                            cls4.getMethod("getObject", Object.class, cls);
                            cls4.getMethod("putObject", Object.class, cls, Object.class);
                            z5 = true;
                        } catch (Throwable th2) {
                            Logger.getLogger(CC.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                        }
                        f7975e = z5;
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
                        a(Object[].class);
                        b(Object[].class);
                        int i5 = AbstractC1553sB.f15428a;
                        field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
                        if (field2 == null) {
                            try {
                                field2 = Buffer.class.getDeclaredField("address");
                            } catch (Throwable unused3) {
                                field2 = null;
                            }
                            if (field2 == null || field2.getType() != cls) {
                                field3 = null;
                                j5 = -1;
                                if (field3 != null && (bc2 = f7973c) != null) {
                                    j5 = ((Unsafe) bc2.f7794k).objectFieldOffset(field3);
                                }
                                f7976g = j5;
                                f7977h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                            }
                        }
                        field3 = field2;
                        j5 = -1;
                        if (field3 != null) {
                            j5 = ((Unsafe) bc2.f7794k).objectFieldOffset(field3);
                        }
                        f7976g = j5;
                        f7977h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                    }
                    z5 = false;
                    f7975e = z5;
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
                    a(Object[].class);
                    b(Object[].class);
                    int i52 = AbstractC1553sB.f15428a;
                    field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
                    if (field2 == null) {
                    }
                    field3 = field2;
                    j5 = -1;
                    if (field3 != null) {
                    }
                    f7976g = j5;
                    f7977h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                }
            }
            z3 = false;
            f7974d = z3;
            bc = f7973c;
            if (bc != null) {
            }
            z5 = false;
            f7975e = z5;
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
            a(Object[].class);
            b(Object[].class);
            int i522 = AbstractC1553sB.f15428a;
            field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            if (field2 == null) {
            }
            field3 = field2;
            j5 = -1;
            if (field3 != null) {
            }
            f7976g = j5;
            f7977h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        }
        c1869zC = null;
        f7973c = c1869zC;
        if (c1869zC != null) {
        }
        z3 = false;
        f7974d = z3;
        bc = f7973c;
        if (bc != null) {
        }
        z5 = false;
        f7975e = z5;
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
        a(Object[].class);
        b(Object[].class);
        int i5222 = AbstractC1553sB.f15428a;
        field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
        if (field2 == null) {
        }
        field3 = field2;
        j5 = -1;
        if (field3 != null) {
        }
        f7976g = j5;
        f7977h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static int a(Class cls) {
        if (f7975e) {
            return ((Unsafe) f7973c.f7794k).arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void b(Class cls) {
        if (f7975e) {
            ((Unsafe) f7973c.f7794k).arrayIndexScale(cls);
        }
    }

    public static void c(Object obj, long j5, byte b3) {
        BC bc = f7973c;
        long j6 = (-4) & j5;
        int i = ((Unsafe) bc.f7794k).getInt(obj, j6);
        int i5 = ((~((int) j5)) & 3) << 3;
        ((Unsafe) bc.f7794k).putInt(obj, j6, ((255 & b3) << i5) | (i & (~(255 << i5))));
    }

    public static void d(Object obj, long j5, byte b3) {
        BC bc = f7973c;
        long j6 = (-4) & j5;
        int i = (((int) j5) & 3) << 3;
        ((Unsafe) bc.f7794k).putInt(obj, j6, ((255 & b3) << i) | (((Unsafe) bc.f7794k).getInt(obj, j6) & (~(255 << i))));
    }

    public static int e(long j5, Object obj) {
        return ((Unsafe) f7973c.f7794k).getInt(obj, j5);
    }

    public static long f(ByteBuffer byteBuffer) {
        return ((Unsafe) f7973c.f7794k).getLong(byteBuffer, f7976g);
    }

    public static long g(long j5, Object obj) {
        return ((Unsafe) f7973c.f7794k).getLong(obj, j5);
    }

    public static Object h(Class cls) {
        try {
            return f7971a.allocateInstance(cls);
        } catch (InstantiationException e3) {
            throw new IllegalStateException(e3);
        }
    }

    public static Object i(long j5, Object obj) {
        return ((Unsafe) f7973c.f7794k).getObject(obj, j5);
    }

    public static Unsafe j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C1824yC());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void k(byte[] bArr, long j5, byte b3) {
        f7973c.f1(bArr, f + j5, b3);
    }

    public static void l(int i, long j5, Object obj) {
        ((Unsafe) f7973c.f7794k).putInt(obj, j5, i);
    }

    public static void m(Object obj, long j5, long j6) {
        ((Unsafe) f7973c.f7794k).putLong(obj, j5, j6);
    }

    public static void n(Object obj, long j5, Object obj2) {
        ((Unsafe) f7973c.f7794k).putObject(obj, j5, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean o(long j5, Object obj) {
        return ((byte) ((((Unsafe) f7973c.f7794k).getInt(obj, (-4) & j5) >>> ((int) (((~j5) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean p(long j5, Object obj) {
        return ((byte) ((((Unsafe) f7973c.f7794k).getInt(obj, (-4) & j5) >>> ((int) ((j5 & 3) << 3))) & 255)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean q(Class cls) {
        int i = AbstractC1553sB.f15428a;
        try {
            Class cls2 = f7972b;
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
}
