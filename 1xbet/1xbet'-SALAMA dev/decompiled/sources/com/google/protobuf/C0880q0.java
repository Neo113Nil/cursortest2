package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.protobuf.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0880q0 extends AbstractC0867k {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f12262z = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, com.google.android.gms.common.api.f.API_PRIORITY_OTHER};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC0867k f12264e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AbstractC0867k f12265f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f12266x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f12267y;

    public C0880q0(AbstractC0867k abstractC0867k, AbstractC0867k abstractC0867k2) {
        this.f12264e = abstractC0867k;
        this.f12265f = abstractC0867k2;
        int size = abstractC0867k.size();
        this.f12266x = size;
        this.f12263d = abstractC0867k2.size() + size;
        this.f12267y = Math.max(abstractC0867k.C(), abstractC0867k2.C()) + 1;
    }

    public static int N(int i7) {
        return i7 >= 47 ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : f12262z[i7];
    }

    @Override // com.google.protobuf.AbstractC0867k
    public final void B(int i7, byte[] bArr, int i8, int i9) {
        int i10 = i7 + i9;
        AbstractC0867k abstractC0867k = this.f12264e;
        int i11 = this.f12266x;
        if (i10 <= i11) {
            abstractC0867k.B(i7, bArr, i8, i9);
            return;
        }
        AbstractC0867k abstractC0867k2 = this.f12265f;
        if (i7 >= i11) {
            abstractC0867k2.B(i7 - i11, bArr, i8, i9);
            return;
        }
        int i12 = i11 - i7;
        abstractC0867k.B(i7, bArr, i8, i12);
        abstractC0867k2.B(0, bArr, i8 + i12, i9 - i12);
    }

    @Override // com.google.protobuf.AbstractC0867k
    public final int C() {
        return this.f12267y;
    }

    @Override // com.google.protobuf.AbstractC0867k
    public final byte D(int i7) {
        int i8 = this.f12266x;
        return i7 < i8 ? this.f12264e.D(i7) : this.f12265f.D(i7 - i8);
    }

    @Override // com.google.protobuf.AbstractC0867k
    public final boolean E() {
        return this.f12263d >= N(this.f12267y);
    }

    @Override // com.google.protobuf.AbstractC0867k
    public final boolean F() {
        int I7 = this.f12264e.I(0, 0, this.f12266x);
        AbstractC0867k abstractC0867k = this.f12265f;
        return abstractC0867k.I(I7, 0, abstractC0867k.size()) == 0;
    }

    @Override // com.google.protobuf.AbstractC0867k
    public final H6.b G() {
        C0865j c0865j;
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque(this.f12267y);
        arrayDeque.push(this);
        AbstractC0867k abstractC0867k = this.f12264e;
        while (abstractC0867k instanceof C0880q0) {
            C0880q0 c0880q0 = (C0880q0) abstractC0867k;
            arrayDeque.push(c0880q0);
            abstractC0867k = c0880q0.f12264e;
        }
        C0865j c0865j2 = (C0865j) abstractC0867k;
        while (true) {
            if (!(c0865j2 != null)) {
                int i7 = 0;
                int iRemaining = 0;
                for (ByteBuffer byteBuffer : arrayList) {
                    iRemaining += byteBuffer.remaining();
                    i7 = byteBuffer.hasArray() ? i7 | 1 : byteBuffer.isDirect() ? i7 | 2 : i7 | 4;
                }
                if (i7 == 2) {
                    return new C0871m(arrayList, iRemaining);
                }
                N n2 = new N();
                n2.f12125a = arrayList.iterator();
                n2.f12127c = 0;
                for (ByteBuffer byteBuffer2 : arrayList) {
                    n2.f12127c++;
                }
                n2.f12128d = -1;
                if (!n2.a()) {
                    n2.f12126b = K.f12114c;
                    n2.f12128d = 0;
                    n2.f12129e = 0;
                    n2.f12133z = 0L;
                }
                return new C0873n(n2);
            }
            if (c0865j2 == null) {
                throw new NoSuchElementException();
            }
            do {
                if (arrayDeque.isEmpty()) {
                    c0865j = null;
                    break;
                }
                AbstractC0867k abstractC0867k2 = ((C0880q0) arrayDeque.pop()).f12265f;
                while (abstractC0867k2 instanceof C0880q0) {
                    C0880q0 c0880q1 = (C0880q0) abstractC0867k2;
                    arrayDeque.push(c0880q1);
                    abstractC0867k2 = c0880q1.f12264e;
                }
                c0865j = (C0865j) abstractC0867k2;
            } while (c0865j.isEmpty());
            arrayList.add(c0865j2.l());
            c0865j2 = c0865j;
        }
    }

    @Override // com.google.protobuf.AbstractC0867k
    public final int H(int i7, int i8, int i9) {
        int i10 = i8 + i9;
        AbstractC0867k abstractC0867k = this.f12264e;
        int i11 = this.f12266x;
        if (i10 <= i11) {
            return abstractC0867k.H(i7, i8, i9);
        }
        AbstractC0867k abstractC0867k2 = this.f12265f;
        if (i8 >= i11) {
            return abstractC0867k2.H(i7, i8 - i11, i9);
        }
        int i12 = i11 - i8;
        return abstractC0867k2.H(abstractC0867k.H(i7, i8, i12), 0, i9 - i12);
    }

    @Override // com.google.protobuf.AbstractC0867k
    public final int I(int i7, int i8, int i9) {
        int i10 = i8 + i9;
        AbstractC0867k abstractC0867k = this.f12264e;
        int i11 = this.f12266x;
        if (i10 <= i11) {
            return abstractC0867k.I(i7, i8, i9);
        }
        AbstractC0867k abstractC0867k2 = this.f12265f;
        if (i8 >= i11) {
            return abstractC0867k2.I(i7, i8 - i11, i9);
        }
        int i12 = i11 - i8;
        return abstractC0867k2.I(abstractC0867k.I(i7, i8, i12), 0, i9 - i12);
    }

    @Override // com.google.protobuf.AbstractC0867k
    public final AbstractC0867k J(int i7, int i8) {
        int i9 = this.f12263d;
        int iZ = AbstractC0867k.z(i7, i8, i9);
        if (iZ == 0) {
            return AbstractC0867k.f12212b;
        }
        if (iZ == i9) {
            return this;
        }
        AbstractC0867k abstractC0867k = this.f12264e;
        int i10 = this.f12266x;
        if (i8 <= i10) {
            return abstractC0867k.J(i7, i8);
        }
        AbstractC0867k abstractC0867k2 = this.f12265f;
        return i7 >= i10 ? abstractC0867k2.J(i7 - i10, i8 - i10) : new C0880q0(abstractC0867k.J(i7, abstractC0867k.size()), abstractC0867k2.J(0, i8 - i10));
    }

    @Override // com.google.protobuf.AbstractC0867k
    public final String L(Charset charset) {
        return new String(K(), charset);
    }

    @Override // com.google.protobuf.AbstractC0867k
    public final void M(AbstractC0879q abstractC0879q) {
        this.f12264e.M(abstractC0879q);
        this.f12265f.M(abstractC0879q);
    }

    @Override // com.google.protobuf.AbstractC0867k
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0867k)) {
            return false;
        }
        AbstractC0867k abstractC0867k = (AbstractC0867k) obj;
        int size = abstractC0867k.size();
        int i7 = this.f12263d;
        if (i7 != size) {
            return false;
        }
        if (i7 == 0) {
            return true;
        }
        int i8 = this.f12214a;
        int i9 = abstractC0867k.f12214a;
        if (i8 != 0 && i9 != 0 && i8 != i9) {
            return false;
        }
        B4.b0 b0Var = new B4.b0(this);
        C0865j c0865jA = b0Var.a();
        B4.b0 b0Var2 = new B4.b0(abstractC0867k);
        C0865j c0865jA2 = b0Var2.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int size2 = c0865jA.size() - i10;
            int size3 = c0865jA2.size() - i11;
            int iMin = Math.min(size2, size3);
            if (!(i10 == 0 ? c0865jA.N(c0865jA2, i11, iMin) : c0865jA2.N(c0865jA, i10, iMin))) {
                return false;
            }
            i12 += iMin;
            if (i12 >= i7) {
                if (i12 == i7) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == size2) {
                c0865jA = b0Var.a();
                i10 = 0;
            } else {
                i10 += iMin;
            }
            if (iMin == size3) {
                c0865jA2 = b0Var2.a();
                i11 = 0;
            } else {
                i11 += iMin;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0878p0(this);
    }

    @Override // com.google.protobuf.AbstractC0867k
    public final ByteBuffer l() {
        return ByteBuffer.wrap(K()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.AbstractC0867k
    public final int size() {
        return this.f12263d;
    }

    @Override // com.google.protobuf.AbstractC0867k
    public final byte t(int i7) {
        AbstractC0867k.y(i7, this.f12263d);
        return D(i7);
    }
}
