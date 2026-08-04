package com.google.protobuf;

import W5.AbstractC0486a1;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.protobuf.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0867k implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0865j f12212b = new C0865j(K.f12113b);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0861h f12213c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12214a = 0;

    static {
        f12213c = AbstractC0851c.a() ? new C0861h(1) : new C0861h(0);
    }

    public static C0865j A(byte[] bArr, int i7, int i8) {
        byte[] bArrCopyOfRange;
        z(i7, i7 + i8, bArr.length);
        switch (f12213c.f12202a) {
            case 0:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i7, i8 + i7);
                break;
            default:
                bArrCopyOfRange = new byte[i8];
                System.arraycopy(bArr, i7, bArrCopyOfRange, 0, i8);
                break;
        }
        return new C0865j(bArrCopyOfRange);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:46:0x0114 A[LOOP:0: B:44:0x010e->B:46:0x0114, LOOP_END] */
    public static AbstractC0867k m(Iterator it, int i7) {
        ArrayDeque arrayDeque;
        AbstractC0867k c0880q0;
        if (i7 < 1) {
            throw new IllegalArgumentException(AbstractC0486a1.f(i7, "length (", ") must be >= 1"));
        }
        if (i7 == 1) {
            return (AbstractC0867k) it.next();
        }
        int i8 = i7 >>> 1;
        AbstractC0867k abstractC0867kM = m(it, i8);
        AbstractC0867k abstractC0867kM2 = m(it, i7 - i8);
        if (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - abstractC0867kM.size() < abstractC0867kM2.size()) {
            throw new IllegalArgumentException("ByteString would be too long: " + abstractC0867kM.size() + "+" + abstractC0867kM2.size());
        }
        if (abstractC0867kM2.size() == 0) {
            return abstractC0867kM;
        }
        if (abstractC0867kM.size() == 0) {
            return abstractC0867kM2;
        }
        int size = abstractC0867kM2.size() + abstractC0867kM.size();
        if (size < 128) {
            int size2 = abstractC0867kM.size();
            int size3 = abstractC0867kM2.size();
            int i9 = size2 + size3;
            byte[] bArr = new byte[i9];
            z(0, size2, abstractC0867kM.size());
            z(0, size2, i9);
            if (size2 > 0) {
                abstractC0867kM.B(0, bArr, 0, size2);
            }
            z(0, size3, abstractC0867kM2.size());
            z(size2, i9, i9);
            if (size3 > 0) {
                abstractC0867kM2.B(0, bArr, size2, size3);
            }
            return new C0865j(bArr);
        }
        if (abstractC0867kM instanceof C0880q0) {
            C0880q0 c0880q1 = (C0880q0) abstractC0867kM;
            AbstractC0867k abstractC0867k = c0880q1.f12265f;
            int size4 = abstractC0867kM2.size() + abstractC0867k.size();
            AbstractC0867k abstractC0867k2 = c0880q1.f12264e;
            if (size4 < 128) {
                int size5 = abstractC0867k.size();
                int size6 = abstractC0867kM2.size();
                int i10 = size5 + size6;
                byte[] bArr2 = new byte[i10];
                z(0, size5, abstractC0867k.size());
                z(0, size5, i10);
                if (size5 > 0) {
                    abstractC0867k.B(0, bArr2, 0, size5);
                }
                z(0, size6, abstractC0867kM2.size());
                z(size5, i10, i10);
                if (size6 > 0) {
                    abstractC0867kM2.B(0, bArr2, size5, size6);
                }
                c0880q0 = new C0880q0(abstractC0867k2, new C0865j(bArr2));
            } else {
                if (abstractC0867k2.C() > abstractC0867k.C()) {
                    if (c0880q1.f12267y > abstractC0867kM2.C()) {
                        return new C0880q0(abstractC0867k2, new C0880q0(abstractC0867k, abstractC0867kM2));
                    }
                }
                if (size >= C0880q0.N(Math.max(abstractC0867kM.C(), abstractC0867kM2.C()) + 1)) {
                    c0880q0 = new C0880q0(abstractC0867kM, abstractC0867kM2);
                } else {
                    X x4 = new X(2);
                    x4.a(abstractC0867kM);
                    x4.a(abstractC0867kM2);
                    arrayDeque = (ArrayDeque) x4.f12168a;
                    c0880q0 = (AbstractC0867k) arrayDeque.pop();
                    while (!arrayDeque.isEmpty()) {
                        c0880q0 = new C0880q0((AbstractC0867k) arrayDeque.pop(), c0880q0);
                    }
                }
            }
        } else if (size >= C0880q0.N(Math.max(abstractC0867kM.C(), abstractC0867kM2.C()) + 1)) {
            c0880q0 = new C0880q0(abstractC0867kM, abstractC0867kM2);
        } else {
            X x7 = new X(2);
            x7.a(abstractC0867kM);
            x7.a(abstractC0867kM2);
            arrayDeque = (ArrayDeque) x7.f12168a;
            c0880q0 = (AbstractC0867k) arrayDeque.pop();
            while (!arrayDeque.isEmpty()) {
                c0880q0 = new C0880q0((AbstractC0867k) arrayDeque.pop(), c0880q0);
            }
        }
        return c0880q0;
    }

    public static void y(int i7, int i8) {
        if (((i8 - (i7 + 1)) | i7) < 0) {
            if (i7 >= 0) {
                throw new ArrayIndexOutOfBoundsException(AbstractC0486a1.e(i7, i8, "Index > length: ", ", "));
            }
            throw new ArrayIndexOutOfBoundsException(p031e1.k.d(i7, "Index < 0: "));
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

    public abstract AbstractC0867k J(int i7, int i8);

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

    public abstract void M(AbstractC0879q abstractC0879q);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iH = this.f12214a;
        if (iH == 0) {
            int size = size();
            iH = H(size, 0, size);
            if (iH == 0) {
                iH = 1;
            }
            this.f12214a = iH;
        }
        return iH;
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public abstract ByteBuffer l();

    public abstract int size();

    public abstract byte t(int i7);

    public final String toString() {
        String strQ;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            strQ = w0.Q(this);
        } else {
            strQ = w0.Q(J(0, 47)) + "...";
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(size);
        sb.append(" contents=\"");
        return p031e1.k.i(sb, strQ, "\">");
    }
}
