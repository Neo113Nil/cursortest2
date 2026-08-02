package androidx.datastore.preferences.protobuf;

import W5.AbstractC0486a1;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0683g implements Iterable, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final C0683g f9182c = new C0683g(AbstractC0698w.f9256b);

    /* renamed from: d, reason: collision with root package name */
    public static final C0681e f9183d;

    /* renamed from: a, reason: collision with root package name */
    public int f9184a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f9185b;

    static {
        f9183d = AbstractC0679c.a() ? new C0681e(1) : new C0681e(0);
    }

    public C0683g(byte[] bArr) {
        bArr.getClass();
        this.f9185b = bArr;
    }

    public static int m(int i7, int i8, int i9) {
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

    public static C0683g t(byte[] bArr, int i7, int i8) {
        byte[] copyOfRange;
        m(i7, i7 + i8, bArr.length);
        switch (f9183d.f9178a) {
            case 0:
                copyOfRange = Arrays.copyOfRange(bArr, i7, i8 + i7);
                break;
            default:
                copyOfRange = new byte[i8];
                System.arraycopy(bArr, i7, copyOfRange, 0, i8);
                break;
        }
        return new C0683g(copyOfRange);
    }

    public byte A(int i7) {
        return this.f9185b[i7];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0683g) || size() != ((C0683g) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C0683g)) {
            return obj.equals(this);
        }
        C0683g c0683g = (C0683g) obj;
        int i7 = this.f9184a;
        int i8 = c0683g.f9184a;
        if (i7 != 0 && i8 != 0 && i7 != i8) {
            return false;
        }
        int size = size();
        if (size > c0683g.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c0683g.size()) {
            StringBuilder j = AbstractC0486a1.j(size, "Ran off end of other: 0, ", ", ");
            j.append(c0683g.size());
            throw new IllegalArgumentException(j.toString());
        }
        int z4 = z() + size;
        int z7 = z();
        int z8 = c0683g.z();
        while (z7 < z4) {
            if (this.f9185b[z7] != c0683g.f9185b[z8]) {
                return false;
            }
            z7++;
            z8++;
        }
        return true;
    }

    public final int hashCode() {
        int i7 = this.f9184a;
        if (i7 == 0) {
            int size = size();
            int z4 = z();
            int i8 = size;
            for (int i9 = z4; i9 < z4 + size; i9++) {
                i8 = (i8 * 31) + this.f9185b[i9];
            }
            i7 = i8 == 0 ? 1 : i8;
            this.f9184a = i7;
        }
        return i7;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0680d(this);
    }

    public byte l(int i7) {
        return this.f9185b[i7];
    }

    public int size() {
        return this.f9185b.length;
    }

    public final String toString() {
        C0683g c0682f;
        String sb;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            sb = Y4.D.o(this);
        } else {
            StringBuilder sb2 = new StringBuilder();
            int m7 = m(0, 47, size());
            if (m7 == 0) {
                c0682f = f9182c;
            } else {
                c0682f = new C0682f(this.f9185b, z(), m7);
            }
            sb2.append(Y4.D.o(c0682f));
            sb2.append("...");
            sb = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder("<ByteString@");
        sb3.append(hexString);
        sb3.append(" size=");
        sb3.append(size);
        sb3.append(" contents=\"");
        return e1.k.i(sb3, sb, "\">");
    }

    public void y(int i7, byte[] bArr) {
        System.arraycopy(this.f9185b, 0, bArr, 0, i7);
    }

    public int z() {
        return 0;
    }
}
