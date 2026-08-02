package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import n.AbstractC2107A;

/* renamed from: com.google.android.gms.internal.ads.yB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1823yB implements Iterable, Serializable {

    /* renamed from: l, reason: collision with root package name */
    public static final C1733wB f16414l = new C1733wB(VB.f11872b);

    /* renamed from: k, reason: collision with root package name */
    public int f16415k = 0;

    static {
        int i = AbstractC1553sB.f15428a;
    }

    public static AbstractC1823yB f(Iterator it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(L1.a.l(i, "length (", ") must be >= 1"));
        }
        if (i == 1) {
            return (AbstractC1823yB) it.next();
        }
        int i5 = i >>> 1;
        AbstractC1823yB f = f(it, i5);
        AbstractC1823yB f5 = f(it, i - i5);
        if (Integer.MAX_VALUE - f.g() < f5.g()) {
            throw new IllegalArgumentException(L1.a.k(f.g(), f5.g(), "ByteString would be too long: ", "+"));
        }
        if (f5.g() == 0) {
            return f;
        }
        if (f.g() == 0) {
            return f5;
        }
        int g5 = f5.g() + f.g();
        if (g5 < 128) {
            int g6 = f.g();
            int g7 = f5.g();
            int i6 = g6 + g7;
            byte[] bArr = new byte[i6];
            o(0, g6, f.g());
            o(0, g6, i6);
            if (g6 > 0) {
                f.h(0, 0, g6, bArr);
            }
            o(0, g7, f5.g());
            o(g6, i6, i6);
            if (g7 > 0) {
                f5.h(0, g6, g7, bArr);
            }
            return new C1733wB(bArr);
        }
        if (f instanceof C1509rC) {
            C1509rC c1509rC = (C1509rC) f;
            AbstractC1823yB abstractC1823yB = c1509rC.f15280o;
            int g8 = f5.g() + abstractC1823yB.g();
            AbstractC1823yB abstractC1823yB2 = c1509rC.f15279n;
            if (g8 < 128) {
                int g9 = abstractC1823yB.g();
                int g10 = f5.g();
                int i7 = g9 + g10;
                byte[] bArr2 = new byte[i7];
                o(0, g9, abstractC1823yB.g());
                o(0, g9, i7);
                if (g9 > 0) {
                    abstractC1823yB.h(0, 0, g9, bArr2);
                }
                o(0, g10, f5.g());
                o(g9, i7, i7);
                if (g10 > 0) {
                    f5.h(0, g9, g10, bArr2);
                }
                return new C1509rC(abstractC1823yB2, new C1733wB(bArr2));
            }
            if (abstractC1823yB2.i() > abstractC1823yB.i() && c1509rC.f15282q > f5.i()) {
                return new C1509rC(abstractC1823yB2, new C1509rC(abstractC1823yB, f5));
            }
        }
        if (g5 >= C1509rC.t(Math.max(f.i(), f5.i()) + 1)) {
            return new C1509rC(f, f5);
        }
        Hq hq = new Hq(7);
        hq.f(f);
        hq.f(f5);
        ArrayDeque arrayDeque = (ArrayDeque) hq.f9491l;
        AbstractC1823yB abstractC1823yB3 = (AbstractC1823yB) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            abstractC1823yB3 = new C1509rC((AbstractC1823yB) arrayDeque.pop(), abstractC1823yB3);
        }
        return abstractC1823yB3;
    }

    public static int o(int i, int i5, int i6) {
        int i7 = i5 - i;
        if ((i | i5 | i7 | (i6 - i5)) >= 0) {
            return i7;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(L1.a.l(i, "Beginning index: ", " < 0"));
        }
        if (i5 < i) {
            throw new IndexOutOfBoundsException(L1.a.k(i, i5, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(L1.a.k(i5, i6, "End index: ", " >= "));
    }

    public static AbstractC1823yB q(ArrayList arrayList) {
        int size;
        if (AbstractC2107A.A(arrayList)) {
            size = arrayList.size();
        } else {
            int size2 = arrayList.size();
            size = 0;
            int i = 0;
            while (i < size2) {
                arrayList.get(i);
                i++;
                size++;
            }
        }
        return size == 0 ? f16414l : f(arrayList.iterator(), size);
    }

    public static C1733wB r(byte[] bArr, int i, int i5) {
        o(i, i + i5, bArr.length);
        byte[] bArr2 = new byte[i5];
        System.arraycopy(bArr, i, bArr2, 0, i5);
        return new C1733wB(bArr2);
    }

    public static void s(int i, int i5) {
        if (((i5 - (i + 1)) | i) < 0) {
            if (i >= 0) {
                throw new ArrayIndexOutOfBoundsException(L1.a.k(i, i5, "Index > length: ", ", "));
            }
            throw new ArrayIndexOutOfBoundsException(AbstractC2107A.q("Index < 0: ", i));
        }
    }

    public final byte[] c() {
        int g5 = g();
        if (g5 == 0) {
            return VB.f11872b;
        }
        byte[] bArr = new byte[g5];
        h(0, 0, g5, bArr);
        return bArr;
    }

    public abstract byte d(int i);

    public abstract byte e(int i);

    public abstract boolean equals(Object obj);

    public abstract int g();

    public abstract void h(int i, int i5, int i6, byte[] bArr);

    public final int hashCode() {
        int i = this.f16415k;
        if (i == 0) {
            int g5 = g();
            i = k(g5, 0, g5);
            if (i == 0) {
                i = 1;
            }
            this.f16415k = i;
        }
        return i;
    }

    public abstract int i();

    public abstract boolean j();

    public abstract int k(int i, int i5, int i6);

    public abstract AbstractC1823yB l(int i, int i5);

    public abstract AbstractC1674uy m();

    public abstract void n(EB eb);

    @Override // java.lang.Iterable
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Lv iterator() {
        return new C1643uB(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int g5 = g();
        String m5 = g() <= 50 ? AbstractC0952et.m(this) : AbstractC0952et.m(l(0, 47)).concat("...");
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(g5);
        sb.append(" contents=\"");
        return AbstractC2107A.u(sb, m5, "\">");
    }
}
