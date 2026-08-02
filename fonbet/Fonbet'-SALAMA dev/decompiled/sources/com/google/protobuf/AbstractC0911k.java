package com.google.protobuf;

import W5.AbstractC0486a1;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.google.protobuf.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0911k implements Iterable, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final C0909j f12212b = new C0909j(K.f12113b);

    /* renamed from: c, reason: collision with root package name */
    public static final C0905h f12213c;

    /* renamed from: a, reason: collision with root package name */
    public int f12214a = 0;

    static {
        f12213c = AbstractC0895c.a() ? new C0905h(1) : new C0905h(0);
    }

    public static C0909j A(byte[] bArr, int i7, int i8) {
        byte[] copyOfRange;
        z(i7, i7 + i8, bArr.length);
        switch (f12213c.f12202a) {
            case 0:
                copyOfRange = Arrays.copyOfRange(bArr, i7, i8 + i7);
                break;
            default:
                copyOfRange = new byte[i8];
                System.arraycopy(bArr, i7, copyOfRange, 0, i8);
                break;
        }
        return new C0909j(copyOfRange);
    }

    public static AbstractC0911k m(Iterator it, int i7) {
        AbstractC0911k abstractC0911k;
        if (i7 < 1) {
            throw new IllegalArgumentException(AbstractC0486a1.f(i7, "length (", ") must be >= 1"));
        }
        if (i7 == 1) {
            return (AbstractC0911k) it.next();
        }
        int i8 = i7 >>> 1;
        AbstractC0911k m7 = m(it, i8);
        AbstractC0911k m8 = m(it, i7 - i8);
        if (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - m7.size() < m8.size()) {
            throw new IllegalArgumentException("ByteString would be too long: " + m7.size() + "+" + m8.size());
        }
        if (m8.size() == 0) {
            return m7;
        }
        if (m7.size() == 0) {
            return m8;
        }
        int size = m8.size() + m7.size();
        if (size < 128) {
            int size2 = m7.size();
            int size3 = m8.size();
            int i9 = size2 + size3;
            byte[] bArr = new byte[i9];
            z(0, size2, m7.size());
            z(0, size2, i9);
            if (size2 > 0) {
                m7.B(0, bArr, 0, size2);
            }
            z(0, size3, m8.size());
            z(size2, i9, i9);
            if (size3 > 0) {
                m8.B(0, bArr, size2, size3);
            }
            return new C0909j(bArr);
        }
        if (m7 instanceof C0924q0) {
            C0924q0 c0924q0 = (C0924q0) m7;
            AbstractC0911k abstractC0911k2 = c0924q0.f12265f;
            int size4 = m8.size() + abstractC0911k2.size();
            AbstractC0911k abstractC0911k3 = c0924q0.f12264e;
            if (size4 < 128) {
                int size5 = abstractC0911k2.size();
                int size6 = m8.size();
                int i10 = size5 + size6;
                byte[] bArr2 = new byte[i10];
                z(0, size5, abstractC0911k2.size());
                z(0, size5, i10);
                if (size5 > 0) {
                    abstractC0911k2.B(0, bArr2, 0, size5);
                }
                z(0, size6, m8.size());
                z(size5, i10, i10);
                if (size6 > 0) {
                    m8.B(0, bArr2, size5, size6);
                }
                abstractC0911k = new C0924q0(abstractC0911k3, new C0909j(bArr2));
                return abstractC0911k;
            }
            if (abstractC0911k3.C() > abstractC0911k2.C()) {
                if (c0924q0.f12267y > m8.C()) {
                    return new C0924q0(abstractC0911k3, new C0924q0(abstractC0911k2, m8));
                }
            }
        }
        if (size >= C0924q0.N(Math.max(m7.C(), m8.C()) + 1)) {
            abstractC0911k = new C0924q0(m7, m8);
        } else {
            X x4 = new X(2);
            x4.a(m7);
            x4.a(m8);
            ArrayDeque arrayDeque = (ArrayDeque) x4.f12168a;
            abstractC0911k = (AbstractC0911k) arrayDeque.pop();
            while (!arrayDeque.isEmpty()) {
                abstractC0911k = new C0924q0((AbstractC0911k) arrayDeque.pop(), abstractC0911k);
            }
        }
        return abstractC0911k;
    }

    public static void y(int i7, int i8) {
        if (((i8 - (i7 + 1)) | i7) < 0) {
            if (i7 >= 0) {
                throw new ArrayIndexOutOfBoundsException(AbstractC0486a1.e(i7, i8, "Index > length: ", ", "));
            }
            throw new ArrayIndexOutOfBoundsException(e1.k.d(i7, "Index < 0: "));
        }
    }

    public static int z(int i7, int i8, int i9) {
        int i10 = i8 - i7;
        if ((i7 | i8 | i10 | (i9 - i8)) >= 0) {
            return i10;
        }
        if (i7 < 0) {
            throw new IndexOutOfBoundsException(AbstractC0486a1.f(i7, "Beginning index: ", " < 0"));
        }
        if (i8 < i7) {
            throw new IndexOutOfBoundsException(AbstractC0486a1.e(i7, i8, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(AbstractC0486a1.e(i8, i9, "End index: ", " >= "));
    }

    public abstract void B(int i7, byte[] bArr, int i8, int i9);

    public abstract int C();

    public abstract byte D(int i7);

    public abstract boolean E();

    public abstract boolean F();

    public abstract H6.b G();

    public abstract int H(int i7, int i8, int i9);

    public abstract int I(int i7, int i8, int i9);

    public abstract AbstractC0911k J(int i7, int i8);

    public final byte[] K() {
        int size = size();
        if (size == 0) {
            return K.f12113b;
        }
        byte[] bArr = new byte[size];
        B(0, bArr, 0, size);
        return bArr;
    }

    public abstract String L(Charset charset);

    public abstract void M(AbstractC0923q abstractC0923q);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i7 = this.f12214a;
        if (i7 == 0) {
            int size = size();
            i7 = H(size, 0, size);
            if (i7 == 0) {
                i7 = 1;
            }
            this.f12214a = i7;
        }
        return i7;
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public abstract ByteBuffer l();

    public abstract int size();

    public abstract byte t(int i7);

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            str = w0.Q(this);
        } else {
            str = w0.Q(J(0, 47)) + "...";
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(size);
        sb.append(" contents=\"");
        return e1.k.i(sb, str, "\">");
    }
}
