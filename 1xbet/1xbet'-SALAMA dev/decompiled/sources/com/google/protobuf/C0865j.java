package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.protobuf.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0865j extends AbstractC0867k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f12207d;

    public C0865j(byte[] bArr) {
        bArr.getClass();
        this.f12207d = bArr;
    }

    @Override // com.google.protobuf.AbstractC0867k
    public void B(int i7, byte[] bArr, int i8, int i9) {
        System.arraycopy(this.f12207d, i7, bArr, i8, i9);
    }

    @Override // com.google.protobuf.AbstractC0867k
    public final int C() {
        return 0;
    }

    @Override // com.google.protobuf.AbstractC0867k
    public byte D(int i7) {
        return this.f12207d[i7];
    }

    @Override // com.google.protobuf.AbstractC0867k
    public final boolean E() {
        return true;
    }

    @Override // com.google.protobuf.AbstractC0867k
    public final boolean F() {
        int iO = O();
        return N0.f12134a.U(0, this.f12207d, iO, size() + iO) == 0;
    }

    @Override // com.google.protobuf.AbstractC0867k
    public final H6.b G() {
        return H6.b.g(this.f12207d, O(), size(), true);
    }

    @Override // com.google.protobuf.AbstractC0867k
    public final int H(int i7, int i8, int i9) {
        int iO = O() + i8;
        Charset charset = K.f12112a;
        for (int i10 = iO; i10 < iO + i9; i10++) {
            i7 = (i7 * 31) + this.f12207d[i10];
        }
        return i7;
    }

    @Override // com.google.protobuf.AbstractC0867k
    public final int I(int i7, int i8, int i9) {
        int iO = O() + i8;
        return N0.f12134a.U(i7, this.f12207d, iO, i9 + iO);
    }

    @Override // com.google.protobuf.AbstractC0867k
    public final AbstractC0867k J(int i7, int i8) {
        int iZ = AbstractC0867k.z(i7, i8, size());
        if (iZ == 0) {
            return AbstractC0867k.f12212b;
        }
        return new C0863i(this.f12207d, O() + i7, iZ);
    }

    @Override // com.google.protobuf.AbstractC0867k
    public final String L(Charset charset) {
        return new String(this.f12207d, O(), size(), charset);
    }

    @Override // com.google.protobuf.AbstractC0867k
    public final void M(AbstractC0879q abstractC0879q) {
        abstractC0879q.W(this.f12207d, O(), size());
    }

    public final boolean N(C0865j c0865j, int i7, int i8) {
        if (i8 > c0865j.size()) {
            throw new IllegalArgumentException("Length too large: " + i8 + size());
        }
        int i9 = i7 + i8;
        if (i9 > c0865j.size()) {
            StringBuilder sbG = p150v0.a.g("Ran off end of other: ", i7, ", ", i8, ", ");
            sbG.append(c0865j.size());
            throw new IllegalArgumentException(sbG.toString());
        }
        if (!(c0865j instanceof C0865j)) {
            return c0865j.J(i7, i9).equals(J(0, i8));
        }
        int iO = O() + i8;
        int iO2 = O();
        int iO3 = c0865j.O() + i7;
        while (iO2 < iO) {
            if (this.f12207d[iO2] != c0865j.f12207d[iO3]) {
                return false;
            }
            iO2++;
            iO3++;
        }
        return true;
    }

    public int O() {
        return 0;
    }

    @Override // com.google.protobuf.AbstractC0867k
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0867k) || size() != ((AbstractC0867k) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C0865j)) {
            return obj.equals(this);
        }
        C0865j c0865j = (C0865j) obj;
        int i7 = this.f12214a;
        int i8 = c0865j.f12214a;
        if (i7 == 0 || i8 == 0 || i7 == i8) {
            return N(c0865j, 0, size());
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0857f(this);
    }

    @Override // com.google.protobuf.AbstractC0867k
    public final ByteBuffer l() {
        return ByteBuffer.wrap(this.f12207d, O(), size()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.AbstractC0867k
    public int size() {
        return this.f12207d.length;
    }

    @Override // com.google.protobuf.AbstractC0867k
    public byte t(int i7) {
        return this.f12207d[i7];
    }
}
