package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.rC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1509rC extends AbstractC1823yB {

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f15277r = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* renamed from: m, reason: collision with root package name */
    public final int f15278m;

    /* renamed from: n, reason: collision with root package name */
    public final AbstractC1823yB f15279n;

    /* renamed from: o, reason: collision with root package name */
    public final AbstractC1823yB f15280o;

    /* renamed from: p, reason: collision with root package name */
    public final int f15281p;

    /* renamed from: q, reason: collision with root package name */
    public final int f15282q;

    public C1509rC(AbstractC1823yB abstractC1823yB, AbstractC1823yB abstractC1823yB2) {
        this.f15279n = abstractC1823yB;
        this.f15280o = abstractC1823yB2;
        int g5 = abstractC1823yB.g();
        this.f15281p = g5;
        this.f15278m = abstractC1823yB2.g() + g5;
        this.f15282q = Math.max(abstractC1823yB.i(), abstractC1823yB2.i()) + 1;
    }

    public static int t(int i) {
        int[] iArr = f15277r;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1823yB
    public final byte d(int i) {
        AbstractC1823yB.s(i, this.f15278m);
        return e(i);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1823yB
    public final byte e(int i) {
        int i5 = this.f15281p;
        return i < i5 ? this.f15279n.e(i) : this.f15280o.e(i - i5);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1823yB
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1823yB) {
            AbstractC1823yB abstractC1823yB = (AbstractC1823yB) obj;
            int g5 = abstractC1823yB.g();
            int i = this.f15278m;
            if (i == g5) {
                if (i == 0) {
                    return true;
                }
                int i5 = this.f16415k;
                int i6 = abstractC1823yB.f16415k;
                if (i5 == 0 || i6 == 0 || i5 == i6) {
                    C1465qC c1465qC = new C1465qC(this);
                    C1733wB next = c1465qC.next();
                    C1465qC c1465qC2 = new C1465qC(abstractC1823yB);
                    C1733wB next2 = c1465qC2.next();
                    int i7 = 0;
                    int i8 = 0;
                    int i9 = 0;
                    while (true) {
                        int g6 = next.g() - i7;
                        int g7 = next2.g() - i8;
                        int min = Math.min(g6, g7);
                        if (!(i7 == 0 ? next.u(next2, i8, min) : next2.u(next, i7, min))) {
                            break;
                        }
                        i9 += min;
                        if (i9 >= i) {
                            if (i9 == i) {
                                return true;
                            }
                            throw new IllegalStateException();
                        }
                        if (min == g6) {
                            next = c1465qC.next();
                            i7 = 0;
                        } else {
                            i7 += min;
                        }
                        if (min == g7) {
                            next2 = c1465qC2.next();
                            i8 = 0;
                        } else {
                            i8 += min;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1823yB
    public final int g() {
        return this.f15278m;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1823yB
    public final void h(int i, int i5, int i6, byte[] bArr) {
        int i7 = i + i6;
        AbstractC1823yB abstractC1823yB = this.f15279n;
        int i8 = this.f15281p;
        if (i7 <= i8) {
            abstractC1823yB.h(i, i5, i6, bArr);
            return;
        }
        AbstractC1823yB abstractC1823yB2 = this.f15280o;
        if (i >= i8) {
            abstractC1823yB2.h(i - i8, i5, i6, bArr);
            return;
        }
        int i9 = i8 - i;
        abstractC1823yB.h(i, i5, i9, bArr);
        abstractC1823yB2.h(0, i5 + i9, i6 - i9, bArr);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1823yB
    public final int i() {
        return this.f15282q;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1823yB, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C1420pC(this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1823yB
    public final boolean j() {
        return this.f15278m >= t(this.f15282q);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1823yB
    public final int k(int i, int i5, int i6) {
        int i7 = i5 + i6;
        AbstractC1823yB abstractC1823yB = this.f15279n;
        int i8 = this.f15281p;
        if (i7 <= i8) {
            return abstractC1823yB.k(i, i5, i6);
        }
        AbstractC1823yB abstractC1823yB2 = this.f15280o;
        if (i5 >= i8) {
            return abstractC1823yB2.k(i, i5 - i8, i6);
        }
        int i9 = i8 - i5;
        return abstractC1823yB2.k(abstractC1823yB.k(i, i5, i9), 0, i6 - i9);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1823yB
    public final AbstractC1823yB l(int i, int i5) {
        int i6 = this.f15278m;
        int o5 = AbstractC1823yB.o(i, i5, i6);
        if (o5 == 0) {
            return AbstractC1823yB.f16414l;
        }
        if (o5 == i6) {
            return this;
        }
        AbstractC1823yB abstractC1823yB = this.f15279n;
        int i7 = this.f15281p;
        if (i5 <= i7) {
            return abstractC1823yB.l(i, i5);
        }
        AbstractC1823yB abstractC1823yB2 = this.f15280o;
        if (i < i7) {
            return new C1509rC(abstractC1823yB.l(i, abstractC1823yB.g()), abstractC1823yB2.l(0, i5 - i7));
        }
        return abstractC1823yB2.l(i - i7, i5 - i7);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1823yB
    public final AbstractC1674uy m() {
        C1733wB c1733wB;
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque(this.f15282q);
        arrayDeque.push(this);
        AbstractC1823yB abstractC1823yB = this.f15279n;
        while (abstractC1823yB instanceof C1509rC) {
            C1509rC c1509rC = (C1509rC) abstractC1823yB;
            arrayDeque.push(c1509rC);
            abstractC1823yB = c1509rC.f15279n;
        }
        C1733wB c1733wB2 = (C1733wB) abstractC1823yB;
        while (true) {
            if (!(c1733wB2 != null)) {
                int size = arrayList.size();
                int i = 0;
                int i5 = 0;
                int i6 = 0;
                while (i6 < size) {
                    Object obj = arrayList.get(i6);
                    i6++;
                    ByteBuffer byteBuffer = (ByteBuffer) obj;
                    i5 += byteBuffer.remaining();
                    i = byteBuffer.hasArray() ? i | 1 : byteBuffer.isDirect() ? i | 2 : i | 4;
                }
                if (i == 2) {
                    return new AB(i5, arrayList);
                }
                YB yb = new YB();
                yb.f12283k = arrayList.iterator();
                yb.f12285m = 0;
                int size2 = arrayList.size();
                int i7 = 0;
                while (i7 < size2) {
                    Object obj2 = arrayList.get(i7);
                    i7++;
                    yb.f12285m++;
                }
                yb.f12286n = -1;
                if (!yb.d()) {
                    yb.f12284l = VB.f11873c;
                    yb.f12286n = 0;
                    yb.f12287o = 0;
                    yb.f12291s = 0L;
                }
                return new BB(yb);
            }
            if (c1733wB2 == null) {
                throw new NoSuchElementException();
            }
            while (true) {
                if (arrayDeque.isEmpty()) {
                    c1733wB = null;
                    break;
                }
                AbstractC1823yB abstractC1823yB2 = ((C1509rC) arrayDeque.pop()).f15280o;
                while (abstractC1823yB2 instanceof C1509rC) {
                    C1509rC c1509rC2 = (C1509rC) abstractC1823yB2;
                    arrayDeque.push(c1509rC2);
                    abstractC1823yB2 = c1509rC2.f15279n;
                }
                c1733wB = (C1733wB) abstractC1823yB2;
                if (c1733wB.g() != 0) {
                    break;
                }
            }
            arrayList.add(ByteBuffer.wrap(c1733wB2.f16097m, c1733wB2.t(), c1733wB2.g()).asReadOnlyBuffer());
            c1733wB2 = c1733wB;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1823yB
    public final void n(EB eb) {
        this.f15279n.n(eb);
        this.f15280o.n(eb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1823yB
    /* renamed from: p */
    public final Lv iterator() {
        return new C1420pC(this);
    }
}
