package com.google.crypto.tink.shaded.protobuf;

import W5.AbstractC0486a1;
import androidx.datastore.preferences.protobuf.C0659d;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0828h extends AbstractC0829i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f11777d;

    public C0828h(byte[] bArr) {
        this.f11781a = 0;
        bArr.getClass();
        this.f11777d = bArr;
    }

    public int A() {
        return 0;
    }

    public byte B(int i7) {
        return this.f11777d[i7];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0829i) || size() != ((AbstractC0829i) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C0828h)) {
            return obj.equals(this);
        }
        C0828h c0828h = (C0828h) obj;
        int i7 = this.f11781a;
        int i8 = c0828h.f11781a;
        if (i7 != 0 && i8 != 0 && i7 != i8) {
            return false;
        }
        int size = size();
        if (size > c0828h.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c0828h.size()) {
            StringBuilder sbJ = AbstractC0486a1.j(size, "Ran off end of other: 0, ", ", ");
            sbJ.append(c0828h.size());
            throw new IllegalArgumentException(sbJ.toString());
        }
        int iA = A() + size;
        int iA2 = A();
        int iA3 = c0828h.A();
        while (iA2 < iA) {
            if (this.f11777d[iA2] != c0828h.f11777d[iA3]) {
                return false;
            }
            iA2++;
            iA3++;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0659d(this);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0829i
    public byte l(int i7) {
        return this.f11777d[i7];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0829i
    public int size() {
        return this.f11777d.length;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0829i
    public void y(int i7, byte[] bArr) {
        System.arraycopy(this.f11777d, 0, bArr, 0, i7);
    }
}
