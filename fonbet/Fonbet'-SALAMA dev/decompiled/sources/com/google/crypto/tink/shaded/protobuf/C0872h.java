package com.google.crypto.tink.shaded.protobuf;

import W5.AbstractC0486a1;
import androidx.datastore.preferences.protobuf.C0680d;
import java.util.Iterator;

/* renamed from: com.google.crypto.tink.shaded.protobuf.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0872h extends AbstractC0873i {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f11777d;

    public C0872h(byte[] bArr) {
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
        if (!(obj instanceof AbstractC0873i) || size() != ((AbstractC0873i) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C0872h)) {
            return obj.equals(this);
        }
        C0872h c0872h = (C0872h) obj;
        int i7 = this.f11781a;
        int i8 = c0872h.f11781a;
        if (i7 != 0 && i8 != 0 && i7 != i8) {
            return false;
        }
        int size = size();
        if (size > c0872h.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c0872h.size()) {
            StringBuilder j = AbstractC0486a1.j(size, "Ran off end of other: 0, ", ", ");
            j.append(c0872h.size());
            throw new IllegalArgumentException(j.toString());
        }
        int A7 = A() + size;
        int A8 = A();
        int A9 = c0872h.A();
        while (A8 < A7) {
            if (this.f11777d[A8] != c0872h.f11777d[A9]) {
                return false;
            }
            A8++;
            A9++;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0680d(this);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0873i
    public byte l(int i7) {
        return this.f11777d[i7];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0873i
    public int size() {
        return this.f11777d.length;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0873i
    public void y(int i7, byte[] bArr) {
        System.arraycopy(this.f11777d, 0, bArr, 0, i7);
    }
}
