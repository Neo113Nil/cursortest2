package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import v0.AbstractC1663a;

/* renamed from: com.google.protobuf.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0909j extends AbstractC0911k {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f12207d;

    public C0909j(byte[] bArr) {
        bArr.getClass();
        this.f12207d = bArr;
    }

    @Override // com.google.protobuf.AbstractC0911k
    public void B(int i7, byte[] bArr, int i8, int i9) {
        System.arraycopy(this.f12207d, i7, bArr, i8, i9);
    }

    @Override // com.google.protobuf.AbstractC0911k
    public final int C() {
        return 0;
    }

    @Override // com.google.protobuf.AbstractC0911k
    public byte D(int i7) {
        return this.f12207d[i7];
    }

    @Override // com.google.protobuf.AbstractC0911k
    public final boolean E() {
        return true;
    }

    @Override // com.google.protobuf.AbstractC0911k
    public final boolean F() {
        int O7 = O();
        return N0.f12134a.U(0, this.f12207d, O7, size() + O7) == 0;
    }

    @Override // com.google.protobuf.AbstractC0911k
    public final H6.b G() {
        return H6.b.g(this.f12207d, O(), size(), true);
    }

    @Override // com.google.protobuf.AbstractC0911k
    public final int H(int i7, int i8, int i9) {
        int O7 = O() + i8;
        Charset charset = K.f12112a;
        for (int i10 = O7; i10 < O7 + i9; i10++) {
            i7 = (i7 * 31) + this.f12207d[i10];
        }
        return i7;
    }

    @Override // com.google.protobuf.AbstractC0911k
    public final int I(int i7, int i8, int i9) {
        int O7 = O() + i8;
        return N0.f12134a.U(i7, this.f12207d, O7, i9 + O7);
    }

    @Override // com.google.protobuf.AbstractC0911k
    public final AbstractC0911k J(int i7, int i8) {
        int z4 = AbstractC0911k.z(i7, i8, size());
        if (z4 == 0) {
            return AbstractC0911k.f12212b;
        }
        return new C0907i(this.f12207d, O() + i7, z4);
    }

    @Override // com.google.protobuf.AbstractC0911k
    public final String L(Charset charset) {
        return new String(this.f12207d, O(), size(), charset);
    }

    @Override // com.google.protobuf.AbstractC0911k
    public final void M(AbstractC0923q abstractC0923q) {
        abstractC0923q.W(this.f12207d, O(), size());
    }

    public final boolean N(C0909j c0909j, int i7, int i8) {
        if (i8 > c0909j.size()) {
            throw new IllegalArgumentException("Length too large: " + i8 + size());
        }
        int i9 = i7 + i8;
        if (i9 > c0909j.size()) {
            StringBuilder g3 = AbstractC1663a.g("Ran off end of other: ", i7, ", ", i8, ", ");
            g3.append(c0909j.size());
            throw new IllegalArgumentException(g3.toString());
        }
        if (!(c0909j instanceof C0909j)) {
            return c0909j.J(i7, i9).equals(J(0, i8));
        }
        int O7 = O() + i8;
        int O8 = O();
        int O9 = c0909j.O() + i7;
        while (O8 < O7) {
            if (this.f12207d[O8] != c0909j.f12207d[O9]) {
                return false;
            }
            O8++;
            O9++;
        }
        return true;
    }

    public int O() {
        return 0;
    }

    @Override // com.google.protobuf.AbstractC0911k
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0911k) || size() != ((AbstractC0911k) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C0909j)) {
            return obj.equals(this);
        }
        C0909j c0909j = (C0909j) obj;
        int i7 = this.f12214a;
        int i8 = c0909j.f12214a;
        if (i7 == 0 || i8 == 0 || i7 == i8) {
            return N(c0909j, 0, size());
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0901f(this);
    }

    @Override // com.google.protobuf.AbstractC0911k
    public final ByteBuffer l() {
        return ByteBuffer.wrap(this.f12207d, O(), size()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.AbstractC0911k
    public int size() {
        return this.f12207d.length;
    }

    @Override // com.google.protobuf.AbstractC0911k
    public byte t(int i7) {
        return this.f12207d[i7];
    }
}
