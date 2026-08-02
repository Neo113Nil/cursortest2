package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.protobuf.q0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0924q0 extends AbstractC0911k {

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f12262z = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, com.google.android.gms.common.api.f.API_PRIORITY_OTHER};

    /* renamed from: d, reason: collision with root package name */
    public final int f12263d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0911k f12264e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC0911k f12265f;

    /* renamed from: x, reason: collision with root package name */
    public final int f12266x;

    /* renamed from: y, reason: collision with root package name */
    public final int f12267y;

    public C0924q0(AbstractC0911k abstractC0911k, AbstractC0911k abstractC0911k2) {
        this.f12264e = abstractC0911k;
        this.f12265f = abstractC0911k2;
        int size = abstractC0911k.size();
        this.f12266x = size;
        this.f12263d = abstractC0911k2.size() + size;
        this.f12267y = Math.max(abstractC0911k.C(), abstractC0911k2.C()) + 1;
    }

    public static int N(int i7) {
        return i7 >= 47 ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : f12262z[i7];
    }

    @Override // com.google.protobuf.AbstractC0911k
    public final void B(int i7, byte[] bArr, int i8, int i9) {
        int i10 = i7 + i9;
        AbstractC0911k abstractC0911k = this.f12264e;
        int i11 = this.f12266x;
        if (i10 <= i11) {
            abstractC0911k.B(i7, bArr, i8, i9);
            return;
        }
        AbstractC0911k abstractC0911k2 = this.f12265f;
        if (i7 >= i11) {
            abstractC0911k2.B(i7 - i11, bArr, i8, i9);
            return;
        }
        int i12 = i11 - i7;
        abstractC0911k.B(i7, bArr, i8, i12);
        abstractC0911k2.B(0, bArr, i8 + i12, i9 - i12);
    }

    @Override // com.google.protobuf.AbstractC0911k
    public final int C() {
        return this.f12267y;
    }

    @Override // com.google.protobuf.AbstractC0911k
    public final byte D(int i7) {
        int i8 = this.f12266x;
        return i7 < i8 ? this.f12264e.D(i7) : this.f12265f.D(i7 - i8);
    }

    @Override // com.google.protobuf.AbstractC0911k
    public final boolean E() {
        return this.f12263d >= N(this.f12267y);
    }

    @Override // com.google.protobuf.AbstractC0911k
    public final boolean F() {
        int I7 = this.f12264e.I(0, 0, this.f12266x);
        AbstractC0911k abstractC0911k = this.f12265f;
        return abstractC0911k.I(I7, 0, abstractC0911k.size()) == 0;
    }

    @Override // com.google.protobuf.AbstractC0911k
    public final H6.b G() {
        C0909j c0909j;
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque(this.f12267y);
        arrayDeque.push(this);
        AbstractC0911k abstractC0911k = this.f12264e;
        while (abstractC0911k instanceof C0924q0) {
            C0924q0 c0924q0 = (C0924q0) abstractC0911k;
            arrayDeque.push(c0924q0);
            abstractC0911k = c0924q0.f12264e;
        }
        C0909j c0909j2 = (C0909j) abstractC0911k;
        while (true) {
            if (!(c0909j2 != null)) {
                Iterator it = arrayList.iterator();
                int i7 = 0;
                int i8 = 0;
                while (it.hasNext()) {
                    ByteBuffer byteBuffer = (ByteBuffer) it.next();
                    i8 += byteBuffer.remaining();
                    i7 = byteBuffer.hasArray() ? i7 | 1 : byteBuffer.isDirect() ? i7 | 2 : i7 | 4;
                }
                if (i7 == 2) {
                    return new C0915m(arrayList, i8);
                }
                N n2 = new N();
                n2.f12125a = arrayList.iterator();
                n2.f12127c = 0;
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    n2.f12127c++;
                }
                n2.f12128d = -1;
                if (!n2.a()) {
                    n2.f12126b = K.f12114c;
                    n2.f12128d = 0;
                    n2.f12129e = 0;
                    n2.f12133z = 0L;
                }
                return new C0917n(n2);
            }
            if (c0909j2 == null) {
                throw new NoSuchElementException();
            }
            while (true) {
                if (arrayDeque.isEmpty()) {
                    c0909j = null;
                    break;
                }
                AbstractC0911k abstractC0911k2 = ((C0924q0) arrayDeque.pop()).f12265f;
                while (abstractC0911k2 instanceof C0924q0) {
                    C0924q0 c0924q02 = (C0924q0) abstractC0911k2;
                    arrayDeque.push(c0924q02);
                    abstractC0911k2 = c0924q02.f12264e;
                }
                c0909j = (C0909j) abstractC0911k2;
                if (!c0909j.isEmpty()) {
                    break;
                }
            }
            arrayList.add(c0909j2.l());
            c0909j2 = c0909j;
        }
    }

    @Override // com.google.protobuf.AbstractC0911k
    public final int H(int i7, int i8, int i9) {
        int i10 = i8 + i9;
        AbstractC0911k abstractC0911k = this.f12264e;
        int i11 = this.f12266x;
        if (i10 <= i11) {
            return abstractC0911k.H(i7, i8, i9);
        }
        AbstractC0911k abstractC0911k2 = this.f12265f;
        if (i8 >= i11) {
            return abstractC0911k2.H(i7, i8 - i11, i9);
        }
        int i12 = i11 - i8;
        return abstractC0911k2.H(abstractC0911k.H(i7, i8, i12), 0, i9 - i12);
    }

    @Override // com.google.protobuf.AbstractC0911k
    public final int I(int i7, int i8, int i9) {
        int i10 = i8 + i9;
        AbstractC0911k abstractC0911k = this.f12264e;
        int i11 = this.f12266x;
        if (i10 <= i11) {
            return abstractC0911k.I(i7, i8, i9);
        }
        AbstractC0911k abstractC0911k2 = this.f12265f;
        if (i8 >= i11) {
            return abstractC0911k2.I(i7, i8 - i11, i9);
        }
        int i12 = i11 - i8;
        return abstractC0911k2.I(abstractC0911k.I(i7, i8, i12), 0, i9 - i12);
    }

    @Override // com.google.protobuf.AbstractC0911k
    public final AbstractC0911k J(int i7, int i8) {
        int i9 = this.f12263d;
        int z4 = AbstractC0911k.z(i7, i8, i9);
        if (z4 == 0) {
            return AbstractC0911k.f12212b;
        }
        if (z4 == i9) {
            return this;
        }
        AbstractC0911k abstractC0911k = this.f12264e;
        int i10 = this.f12266x;
        if (i8 <= i10) {
            return abstractC0911k.J(i7, i8);
        }
        AbstractC0911k abstractC0911k2 = this.f12265f;
        return i7 >= i10 ? abstractC0911k2.J(i7 - i10, i8 - i10) : new C0924q0(abstractC0911k.J(i7, abstractC0911k.size()), abstractC0911k2.J(0, i8 - i10));
    }

    @Override // com.google.protobuf.AbstractC0911k
    public final String L(Charset charset) {
        return new String(K(), charset);
    }

    @Override // com.google.protobuf.AbstractC0911k
    public final void M(AbstractC0923q abstractC0923q) {
        this.f12264e.M(abstractC0923q);
        this.f12265f.M(abstractC0923q);
    }

    @Override // com.google.protobuf.AbstractC0911k
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0911k)) {
            return false;
        }
        AbstractC0911k abstractC0911k = (AbstractC0911k) obj;
        int size = abstractC0911k.size();
        int i7 = this.f12263d;
        if (i7 != size) {
            return false;
        }
        if (i7 == 0) {
            return true;
        }
        int i8 = this.f12214a;
        int i9 = abstractC0911k.f12214a;
        if (i8 != 0 && i9 != 0 && i8 != i9) {
            return false;
        }
        B4.b0 b0Var = new B4.b0(this);
        C0909j a2 = b0Var.a();
        B4.b0 b0Var2 = new B4.b0(abstractC0911k);
        C0909j a4 = b0Var2.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int size2 = a2.size() - i10;
            int size3 = a4.size() - i11;
            int min = Math.min(size2, size3);
            if (!(i10 == 0 ? a2.N(a4, i11, min) : a4.N(a2, i10, min))) {
                return false;
            }
            i12 += min;
            if (i12 >= i7) {
                if (i12 == i7) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == size2) {
                a2 = b0Var.a();
                i10 = 0;
            } else {
                i10 += min;
            }
            if (min == size3) {
                a4 = b0Var2.a();
                i11 = 0;
            } else {
                i11 += min;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0922p0(this);
    }

    @Override // com.google.protobuf.AbstractC0911k
    public final ByteBuffer l() {
        return ByteBuffer.wrap(K()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.AbstractC0911k
    public final int size() {
        return this.f12263d;
    }

    @Override // com.google.protobuf.AbstractC0911k
    public final byte t(int i7) {
        AbstractC0911k.y(i7, this.f12263d);
        return D(i7);
    }
}
