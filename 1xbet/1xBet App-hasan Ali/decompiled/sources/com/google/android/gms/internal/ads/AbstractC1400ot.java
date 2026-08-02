package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.regex.Pattern;
import n.AbstractC2107A;

/* renamed from: com.google.android.gms.internal.ads.ot, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1400ot {

    /* renamed from: k, reason: collision with root package name */
    public static Boolean f14869k;

    public static void A(byte b3, byte b5, byte b6, char[] cArr, int i) {
        if (!b0(b5)) {
            if (b3 == -32) {
                if (b5 >= -96) {
                    b3 = -32;
                }
            }
            if (b3 == -19) {
                if (b5 < -96) {
                    b3 = -19;
                }
            }
            if (!b0(b6)) {
                cArr[i] = (char) (((b3 & 15) << 12) | ((b5 & 63) << 6) | (b6 & 63));
                return;
            }
        }
        throw new XB("Protocol message had invalid UTF-8.");
    }

    public static void B(int i, int i5) {
        if (i < 0 || i > i5) {
            throw new IndexOutOfBoundsException(k0(i, i5, "index"));
        }
    }

    public static void C(int i, Object[] objArr) {
        for (int i5 = 0; i5 < i; i5++) {
            if (objArr[i5] == null) {
                throw new NullPointerException(AbstractC2107A.q("at index ", i5));
            }
        }
    }

    public static void D(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static boolean E(double d5) {
        return Math.getExponent(d5) <= 1023;
    }

    public static byte[] F(byte[]... bArr) {
        int i = 0;
        int i5 = 0;
        while (true) {
            if (i >= bArr.length) {
                byte[] bArr2 = new byte[i5];
                int i6 = 0;
                for (byte[] bArr3 : bArr) {
                    int length = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr2, i6, length);
                    i6 += length;
                }
                return bArr2;
            }
            int length2 = bArr[i].length;
            if (i5 > Integer.MAX_VALUE - length2) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            i5 += length2;
            i++;
        }
    }

    public static int G(int i, int i5) {
        int[] iArr = {i, i5};
        int i6 = iArr[0];
        for (char c5 = 1; c5 < 2; c5 = 2) {
            int i7 = iArr[1];
            if (i7 > i6) {
                i6 = i7;
            }
        }
        int[] iArr2 = {i6, 1073741823};
        int i8 = iArr2[0];
        for (char c6 = 1; c6 < 2; c6 = 2) {
            int i9 = iArr2[1];
            if (i9 < i8) {
                i8 = i9;
            }
        }
        return i8;
    }

    public static int H(int i, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i] : ((int[]) obj)[i];
    }

    public static long I(int i, byte[] bArr) {
        int i5 = bArr[i] & 255;
        int i6 = bArr[i + 1] & 255;
        int i7 = bArr[i + 2] & 255;
        return (((bArr[i + 3] & 255) << 24) | (i6 << 8) | i5 | (i7 << 16)) & 4294967295L;
    }

    public static long J(long j5, long j6) {
        AbstractC0952et.r("a", j5);
        AbstractC0952et.r("b", j6);
        if (j5 == 0) {
            return j6;
        }
        if (j6 == 0) {
            return j5;
        }
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j5);
        long j7 = j5 >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j6);
        long j8 = j6 >> numberOfTrailingZeros2;
        while (j7 != j8) {
            long j9 = j7 - j8;
            long j10 = (j9 >> 63) & j9;
            long j11 = (j9 - j10) - j10;
            j7 = j11 >> Long.numberOfTrailingZeros(j11);
            j8 += j10;
        }
        return j7 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    public static void K(byte b3, byte b5, char[] cArr, int i) {
        if (b3 < -62 || b0(b5)) {
            throw new XB("Protocol message had invalid UTF-8.");
        }
        cArr[i] = (char) (((b3 & 31) << 6) | (b5 & 63));
    }

    public static void L(Class cls, Object obj) {
        if (obj == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }

    public static void M(String str, Object obj) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final byte[] N(int i, byte[] bArr, byte[] bArr2) {
        if (bArr.length - 16 < i) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[16];
        for (int i5 = 0; i5 < 16; i5++) {
            bArr3[i5] = (byte) (bArr[i5 + i] ^ bArr2[i5]);
        }
        return bArr3;
    }

    public static int O(byte[] bArr) {
        int length = bArr.length;
        if (length >= 4) {
            return (bArr[3] & 255) | ((bArr[2] & 255) << 8) | (bArr[0] << 24) | ((bArr[1] & 255) << 16);
        }
        throw new IllegalArgumentException(AbstractC0952et.F("array too small: %s < %s", Integer.valueOf(length), 4));
    }

    public static long P(long j5, long j6) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j6) + Long.numberOfLeadingZeros(j6) + Long.numberOfLeadingZeros(~j5) + Long.numberOfLeadingZeros(j5);
        if (numberOfLeadingZeros > 65) {
            return j5 * j6;
        }
        long j7 = j5 ^ j6;
        long j8 = (j7 >>> 63) + Long.MAX_VALUE;
        if (!((numberOfLeadingZeros < 64) | ((j6 == Long.MIN_VALUE) & (j5 < 0)))) {
            long j9 = j5 * j6;
            if (j5 == 0 || j9 / j5 == j6) {
                return j9;
            }
        }
        return j8;
    }

    public static Object Q(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            throw new IllegalArgumentException(AbstractC2107A.q("must be power of 2 between 2^1 and 2^30: ", i));
        }
        return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
    }

    public static void R(byte[] bArr, long j5, int i) {
        for (int i5 = 0; i5 < 4; i5++) {
            bArr[i + i5] = (byte) (255 & j5);
            j5 >>= 8;
        }
    }

    public static final void S(byte[] bArr, String str, P.W w5) {
        StringBuilder sb = new StringBuilder("os.arch:");
        sb.append(System.getProperty("os.arch"));
        sb.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb.append("supported_abis:");
                sb.append(Arrays.toString(strArr));
                sb.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb.append("CPU_ABI:");
        sb.append(Build.CPU_ABI);
        sb.append(";CPU_ABI2:");
        sb.append(Build.CPU_ABI2);
        sb.append(";");
        if (bArr != null) {
            sb.append("ELF:");
            sb.append(Arrays.toString(bArr));
            sb.append(";");
        }
        if (str != null) {
            sb.append("dbg:");
            sb.append(str);
            sb.append(";");
        }
        w5.j(4007, 0L, null, null, sb.toString());
    }

    public static int T(long j5) {
        if (j5 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j5 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j5;
    }

    public static C0822bw U(E3.a aVar, Class cls, InterfaceC1311mu interfaceC1311mu, Qw qw) {
        C0822bw c0822bw = new C0822bw(aVar, cls, interfaceC1311mu);
        aVar.a(c0822bw, AbstractC0952et.R(qw, c0822bw));
        return c0822bw;
    }

    public static void V(int i, int i5, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i5;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i5;
        } else {
            ((int[]) obj)[i] = i5;
        }
    }

    public static void W(boolean z3) {
        if (!z3) {
            throw new IllegalArgumentException();
        }
    }

    public static C0777aw X(E3.a aVar, Class cls, InterfaceC1897zw interfaceC1897zw, Executor executor) {
        C0777aw c0777aw = new C0777aw(aVar, cls, interfaceC1897zw);
        aVar.a(c0777aw, AbstractC0952et.R(executor, c0777aw));
        return c0777aw;
    }

    public static void Y(String str, boolean z3) {
        if (!z3) {
            throw new IllegalArgumentException(str);
        }
    }

    public static Lw Z(Throwable th) {
        th.getClass();
        Lw lw = new Lw();
        lw.g(th);
        return lw;
    }

    public static int a(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static List a0(int... iArr) {
        int length = iArr.length;
        return length == 0 ? Collections.EMPTY_LIST : new Yv(0, length, iArr);
    }

    public static long b(double d5) {
        Y("not a normal value", E(d5));
        int exponent = Math.getExponent(d5);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d5) & 4503599627370495L;
        return exponent == -1023 ? doubleToRawLongBits + doubleToRawLongBits : doubleToRawLongBits | 4503599627370496L;
    }

    public static boolean b0(byte b3) {
        return b3 > -65;
    }

    public static long c(long j5, long j6) {
        long j7 = j5 + j6;
        if (((j5 ^ j6) < 0) || ((j5 ^ j7) >= 0)) {
            return j7;
        }
        throw new ArithmeticException("overflow: checkedAdd(" + j5 + ", " + j6 + ")");
    }

    public static Mw c0(Object obj) {
        return obj == null ? Mw.f10750l : new Mw(obj);
    }

    public static Rt d(D3.o oVar) {
        Rt rt = new Rt();
        rt.f11464r = oVar;
        Ew ew = Ew.f8627k;
        Dp dp = new Dp(6, rt);
        oVar.getClass();
        oVar.f967b.e(new D3.i(ew, dp));
        oVar.i();
        return rt;
    }

    public static void d0(boolean z3, String str, long j5) {
        if (!z3) {
            throw new IllegalArgumentException(AbstractC0952et.F(str, Long.valueOf(j5)));
        }
    }

    public static InterfaceC1805xu e(InterfaceC1805xu interfaceC1805xu) {
        return !(interfaceC1805xu instanceof C1895zu) ? interfaceC1805xu instanceof C1850yu ? interfaceC1805xu : interfaceC1805xu instanceof Serializable ? new C1850yu(interfaceC1805xu) : new C1895zu(interfaceC1805xu) : interfaceC1805xu;
    }

    public static int[] e0(AbstractC1177jv abstractC1177jv) {
        Object[] array = abstractC1177jv.toArray(AbstractC0821bv.f12926k);
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static Object f(Future future) {
        Object obj;
        boolean z3 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z3 = true;
            } catch (Throwable th) {
                if (z3) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static RunnableFutureC0823bx f0(InterfaceC1852yw interfaceC1852yw, Qw qw) {
        RunnableFutureC0823bx runnableFutureC0823bx = new RunnableFutureC0823bx();
        runnableFutureC0823bx.f12927r = new C0778ax(runnableFutureC0823bx, interfaceC1852yw);
        qw.execute(runnableFutureC0823bx);
        return runnableFutureC0823bx;
    }

    public static void g(byte b3, byte b5, byte b6, byte b7, char[] cArr, int i) {
        if (!b0(b5)) {
            if ((((b5 + 112) + (b3 << 28)) >> 30) == 0 && !b0(b6) && !b0(b7)) {
                int i5 = ((b3 & 7) << 18) | ((b5 & 63) << 12) | ((b6 & 63) << 6) | (b7 & 63);
                cArr[i] = (char) ((i5 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i5 & 1023) + 56320);
                return;
            }
        }
        throw new XB("Protocol message had invalid UTF-8.");
    }

    public static void g0(int i, int i5, int i6) {
        if (i < 0 || i5 < i || i5 > i6) {
            throw new IndexOutOfBoundsException((i < 0 || i > i6) ? k0(i, i6, "start index") : (i5 < 0 || i5 > i6) ? k0(i5, i6, "end index") : AbstractC0952et.F("end index (%s) must not be less than start index (%s)", Integer.valueOf(i5), Integer.valueOf(i)));
        }
    }

    public static void h(int i) {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
    }

    public static C1582sw h0(E3.a aVar, InterfaceC1311mu interfaceC1311mu, Executor executor) {
        C1582sw c1582sw = new C1582sw(aVar, interfaceC1311mu);
        aVar.a(c1582sw, AbstractC0952et.R(executor, c1582sw));
        return c1582sw;
    }

    public static void i(int i, int i5) {
        String F5;
        if (i < 0 || i >= i5) {
            if (i < 0) {
                F5 = AbstractC0952et.F("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i5 < 0) {
                    throw new IllegalArgumentException(AbstractC2107A.q("negative size: ", i5));
                }
                F5 = AbstractC0952et.F("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i5));
            }
            throw new IndexOutOfBoundsException(F5);
        }
    }

    public static void i0(String str, boolean z3) {
        if (!z3) {
            throw new IllegalStateException(str);
        }
    }

    public static void j(Fx fx) {
        C1091hx c1091hx;
        ArrayList arrayList = new ArrayList();
        My my = My.f10755b;
        Iterator it = ((HashMap) fx.f9145m).values().iterator();
        while (it.hasNext()) {
            for (C1048gz c1048gz : (List) it.next()) {
                int i = c1048gz.f13690e - 2;
                if (i == 1) {
                    c1091hx = C1091hx.f13821m;
                } else if (i == 2) {
                    c1091hx = C1091hx.f13822n;
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    c1091hx = C1091hx.f13823o;
                }
                String str = c1048gz.f13689d;
                if (str.startsWith("type.googleapis.com/google.crypto.")) {
                    str = str.substring(34);
                }
                arrayList.add(new Ny(c1091hx, c1048gz.f13688c, str, c1048gz.f13687b.name()));
            }
        }
        C1048gz c1048gz2 = (C1048gz) fx.f9143k;
        Integer valueOf = c1048gz2 != null ? Integer.valueOf(c1048gz2.f13688c) : null;
        if (valueOf != null) {
            try {
                int intValue = valueOf.intValue();
                int size = arrayList.size();
                int i5 = 0;
                while (i5 < size) {
                    int i6 = ((Ny) arrayList.get(i5)).f10876b;
                    i5++;
                    if (i6 == intValue) {
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            } catch (GeneralSecurityException e3) {
                throw new IllegalStateException(e3);
            }
        }
        Collections.unmodifiableList(arrayList);
    }

    public static C1537rw j0(E3.a aVar, InterfaceC1897zw interfaceC1897zw, Executor executor) {
        int i = AbstractRunnableC1627tw.f15739t;
        executor.getClass();
        C1537rw c1537rw = new C1537rw(aVar, interfaceC1897zw);
        aVar.a(c1537rw, AbstractC0952et.R(executor, c1537rw));
        return c1537rw;
    }

    public static String k0(int i, int i5, String str) {
        if (i < 0) {
            return AbstractC0952et.F("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i5 >= 0) {
            return AbstractC0952et.F("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i5));
        }
        throw new IllegalArgumentException(AbstractC2107A.q("negative size: ", i5));
    }

    public static void l(String str, Object obj) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static E3.a l0(E3.a aVar, long j5, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (aVar.isDone()) {
            return aVar;
        }
        Zw zw = new Zw();
        zw.f12543r = aVar;
        RunnableC1303mm runnableC1303mm = new RunnableC1303mm();
        runnableC1303mm.f14534l = zw;
        zw.f12544s = scheduledExecutorService.schedule(runnableC1303mm, j5, timeUnit);
        aVar.a(runnableC1303mm, Ew.f8627k);
        return zw;
    }

    public static final void m(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        if (i < 0 || byteBuffer2.remaining() < i || byteBuffer3.remaining() < i || byteBuffer.remaining() < i) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i5 = 0; i5 < i; i5++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static Object m0(Future future) {
        if (future.isDone()) {
            return f(future);
        }
        throw new IllegalStateException(AbstractC0952et.F("Future was expected to be done: %s", future));
    }

    public static /* synthetic */ void n(AtomicReference atomicReference, RuntimeException runtimeException) {
        while (!atomicReference.compareAndSet(null, runtimeException)) {
            if (atomicReference.get() != null && atomicReference.get() != null) {
                return;
            }
        }
    }

    public static Object n0(C0634Ld c0634Ld) {
        try {
            return f(c0634Ld);
        } catch (ExecutionException e3) {
            if (e3.getCause() instanceof Error) {
                throw new Fw((Error) e3.getCause());
            }
            throw new D2.e(e3.getCause());
        }
    }

    public static boolean p(int i, boolean z3) {
        int i5 = i & 7;
        if (i5 != 4) {
            return z3 && i5 == 3;
        }
        return true;
    }

    public static boolean q(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static /* synthetic */ boolean r(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AbstractC1403ow abstractC1403ow, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(abstractC1403ow, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(abstractC1403ow) != obj && atomicReferenceFieldUpdater.get(abstractC1403ow) != obj) {
                return false;
            }
        }
        return true;
    }

    public static byte[] s(byte[] bArr, byte[] bArr2) {
        long I5 = I(0, bArr) & 67108863;
        int i = 3;
        long I6 = (I(3, bArr) >> 2) & 67108611;
        long I7 = (I(6, bArr) >> 4) & 67092735;
        long I8 = (I(9, bArr) >> 6) & 66076671;
        long I9 = (I(12, bArr) >> 8) & 1048575;
        byte[] bArr3 = new byte[17];
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        int i5 = 0;
        while (true) {
            int length = bArr2.length;
            if (i5 >= length) {
                long j10 = j5 + (j6 >> 26);
                long j11 = j10 & 67108863;
                long j12 = j7 + (j10 >> 26);
                long j13 = j12 & 67108863;
                long j14 = j8 + (j12 >> 26);
                long j15 = j14 & 67108863;
                long j16 = ((j14 >> 26) * 5) + j9;
                long j17 = j16 >> 26;
                long j18 = j16 & 67108863;
                long j19 = j18 + 5;
                long j20 = (j6 & 67108863) + j17;
                long j21 = j20 + (j19 >> 26);
                long j22 = j11 + (j21 >> 26);
                long j23 = j13 + (j22 >> 26);
                long j24 = (j15 + (j23 >> 26)) - 67108864;
                long j25 = j24 >> 63;
                long j26 = ~j25;
                long j27 = (j20 & j25) | (j21 & 67108863 & j26);
                long j28 = (j11 & j25) | (j22 & 67108863 & j26);
                long j29 = (j13 & j25) | (j23 & 67108863 & j26);
                long j30 = (j15 & j25) | (j24 & j26);
                long I10 = I(16, bArr) + (((j18 & j25) | (j19 & 67108863 & j26) | (j27 << 26)) & 4294967295L);
                long I11 = I(20, bArr) + (((j27 >> 6) | (j28 << 20)) & 4294967295L);
                long I12 = I(24, bArr) + (((j28 >> 12) | (j29 << 14)) & 4294967295L);
                long I13 = I(28, bArr) + (((j29 >> 18) | (j30 << 8)) & 4294967295L);
                byte[] bArr4 = new byte[16];
                R(bArr4, I10 & 4294967295L, 0);
                long j31 = I11 + (I10 >> 32);
                R(bArr4, j31 & 4294967295L, 4);
                long j32 = I12 + (j31 >> 32);
                R(bArr4, j32 & 4294967295L, 8);
                R(bArr4, (I13 + (j32 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
            int min = Math.min(16, length - i5);
            System.arraycopy(bArr2, i5, bArr3, 0, min);
            bArr3[min] = 1;
            if (min != 16) {
                Arrays.fill(bArr3, min + 1, 17, (byte) 0);
            }
            long j33 = I9 * 5;
            long j34 = I8 * 5;
            long j35 = I7 * 5;
            long I14 = j9 + (I(0, bArr3) & 67108863);
            long I15 = j6 + ((I(i, bArr3) >> 2) & 67108863);
            long I16 = j5 + ((I(6, bArr3) >> 4) & 67108863);
            long I17 = j7 + ((I(9, bArr3) >> 6) & 67108863);
            long j36 = I6;
            long I18 = j8 + (((I(12, bArr3) >> 8) & 67108863) | (bArr3[16] << 24));
            long j37 = I15 * I5;
            long j38 = I15 * j36;
            long j39 = I16 * I5;
            long j40 = I15 * I7;
            long j41 = I16 * j36;
            long j42 = I17 * I5;
            long j43 = I15 * I8;
            long j44 = I16 * I7;
            long j45 = I17 * j36;
            long j46 = I18 * I5;
            long j47 = (I6 * 5 * I18) + (I17 * j35) + (I16 * j34) + (I15 * j33) + (I14 * I5);
            long j48 = j47 & 67108863;
            long j49 = I17 * j34;
            long j50 = j35 * I18;
            long j51 = j50 + j49 + (I16 * j33) + (I14 * j36) + j37 + (j47 >> 26);
            long j52 = j34 * I18;
            long j53 = j52 + (I17 * j33) + (I14 * I7) + j38 + j39 + (j51 >> 26);
            long j54 = (I18 * j33) + (I14 * I8) + j40 + j41 + j42 + (j53 >> 26);
            long j55 = (I14 * I9) + j43 + j44 + j45 + j46 + (j54 >> 26);
            long j56 = ((j55 >> 26) * 5) + j48;
            j6 = (j51 & 67108863) + (j56 >> 26);
            i5 += 16;
            j5 = j53 & 67108863;
            j7 = j54 & 67108863;
            j8 = j55 & 67108863;
            j9 = j56 & 67108863;
            I6 = j36;
            i = 3;
        }
    }

    public static int t(long j5) {
        int i = (int) j5;
        d0(((long) i) == j5, "Out of range: %s", j5);
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int u(Context context, P.W w5) {
        P.W w6;
        int i;
        char c5;
        int i5;
        FileInputStream fileInputStream;
        byte[] bArr;
        int i6;
        File file = new File(new File(context.getApplicationInfo().dataDir), "lib");
        if (file.exists()) {
            w6 = w5;
            i = 1;
            c5 = 0;
            File[] listFiles = file.listFiles(new Tv(Pattern.compile(".*\\.so$", 2)));
            if (listFiles != null && listFiles.length != 0) {
                try {
                    fileInputStream = new FileInputStream(listFiles[0]);
                    try {
                        bArr = new byte[20];
                    } finally {
                    }
                } catch (IOException e3) {
                    S(null, e3.toString(), w6);
                }
                if (fileInputStream.read(bArr) == 20) {
                    byte[] bArr2 = {0, 0};
                    if (bArr[5] != 2) {
                        bArr2[0] = bArr[19];
                        bArr2[1] = bArr[18];
                        short s2 = ByteBuffer.wrap(bArr2).getShort();
                        if (s2 == 3) {
                            fileInputStream.close();
                            i5 = 5;
                        } else if (s2 == 40) {
                            fileInputStream.close();
                            i5 = 3;
                        } else if (s2 == 62) {
                            fileInputStream.close();
                            i5 = 7;
                        } else if (s2 == 183) {
                            fileInputStream.close();
                            i5 = 6;
                        } else if (s2 != 243) {
                            S(bArr, null, w6);
                        } else {
                            fileInputStream.close();
                            i5 = 8;
                        }
                        if (i5 == 1000) {
                            HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
                            String property = System.getProperty("os.arch");
                            if (TextUtils.isEmpty(property) || !hashSet.contains(property)) {
                                try {
                                    String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
                                    if (strArr != null && strArr.length > 0) {
                                        property = strArr[c5];
                                    }
                                } catch (IllegalAccessException e5) {
                                    w6.g(2024, 0L, e5);
                                } catch (NoSuchFieldException e6) {
                                    w6.g(2024, 0L, e6);
                                }
                                property = Build.CPU_ABI;
                                if (property == null) {
                                    property = Build.CPU_ABI2;
                                }
                            }
                            if (TextUtils.isEmpty(property)) {
                                S(null, "Empty dev arch", w6);
                            } else if (property.equalsIgnoreCase("i686") || property.equalsIgnoreCase("x86")) {
                                i6 = 5;
                            } else if (property.equalsIgnoreCase("x86_64")) {
                                i6 = 7;
                            } else if (property.equalsIgnoreCase("arm64-v8a")) {
                                i6 = 6;
                            } else if (property.equalsIgnoreCase("armeabi-v7a") || property.equalsIgnoreCase("armv71")) {
                                i6 = 3;
                            } else if (property.equalsIgnoreCase("riscv64")) {
                                i6 = 8;
                            } else {
                                S(null, property, w6);
                            }
                            i6 = i;
                        } else {
                            i6 = i5;
                        }
                        w6.j(5018, 0L, null, null, i6 != i ? i6 != 3 ? i6 != 5 ? i6 != 6 ? i6 != 7 ? i6 != 8 ? "null" : "RISCV64" : "X86_64" : "ARM64" : "X86" : "ARM7" : "UNSUPPORTED");
                        return i6;
                    }
                    S(bArr, null, w6);
                }
                fileInputStream.close();
                i5 = 1;
                if (i5 == 1000) {
                }
                w6.j(5018, 0L, null, null, i6 != i ? i6 != 3 ? i6 != 5 ? i6 != 6 ? i6 != 7 ? i6 != 8 ? "null" : "RISCV64" : "X86_64" : "ARM64" : "X86" : "ARM7" : "UNSUPPORTED");
                return i6;
            }
            w6.j(5017, 0L, null, null, "No .so");
        } else {
            i = 1;
            c5 = 0;
            w6 = w5;
            w6.j(5017, 0L, null, null, "No lib/");
        }
        i5 = 1000;
        if (i5 == 1000) {
        }
        w6.j(5018, 0L, null, null, i6 != i ? i6 != 3 ? i6 != 5 ? i6 != 6 ? i6 != 7 ? i6 != 8 ? "null" : "RISCV64" : "X86_64" : "ARM64" : "X86" : "ARM7" : "UNSUPPORTED");
        return i6;
    }

    public static int v(Object obj) {
        return a(obj == null ? 0 : obj.hashCode());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r5 != (-1)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        V(r1, r7, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        r12[r5] = (r12[r5] & r4) | (r7 & r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int w(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int v4 = v(obj);
        int i5 = v4 & i;
        int H5 = H(i5, obj3);
        if (H5 != 0) {
            int i6 = ~i;
            int i7 = v4 & i6;
            int i8 = -1;
            while (true) {
                int i9 = H5 - 1;
                int i10 = iArr[i9];
                int i11 = i10 & i;
                if ((i10 & i6) != i7 || !q(obj, objArr[i9]) || (objArr2 != null && !q(obj2, objArr2[i9]))) {
                    if (i11 == 0) {
                        break;
                    }
                    i8 = i9;
                    H5 = i11;
                }
            }
        }
        return -1;
    }

    public static long x(long j5, long j6, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j7 = j5 / j6;
        long j8 = j5 - (j6 * j7);
        if (j8 == 0) {
            return j7;
        }
        int i = ((int) ((j5 ^ j6) >> 63)) | 1;
        switch (Xv.f12258a[roundingMode.ordinal()]) {
            case 1:
                AbstractC0952et.J(false);
                return j7;
            case 2:
                return j7;
            case 3:
                if (i >= 0) {
                    return j7;
                }
                break;
            case 4:
                break;
            case 5:
                if (i <= 0) {
                    return j7;
                }
                break;
            case 6:
            case 7:
            case 8:
                long abs = Math.abs(j8);
                long abs2 = abs - (Math.abs(j6) - abs);
                if (abs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j7) == 0)) {
                        return j7;
                    }
                } else if (abs2 <= 0) {
                    return j7;
                }
                break;
            default:
                throw new AssertionError();
        }
        return j7 + i;
    }

    public static AbstractC1400ot y(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new C1735wD(cls.getSimpleName(), 0) : new C1735wD(cls.getSimpleName(), 1);
    }

    public static AbstractList z(List list, InterfaceC1311mu interfaceC1311mu) {
        return AbstractC2107A.A(list) ? new C1447pv(list, interfaceC1311mu) : new C1492qv(list, interfaceC1311mu);
    }

    public abstract void k(String str);

    public abstract void o(byte[] bArr, int i, int i5);
}
