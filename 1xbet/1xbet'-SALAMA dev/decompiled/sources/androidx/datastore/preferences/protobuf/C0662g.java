package androidx.datastore.preferences.protobuf;

import W5.AbstractC0486a1;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0662g implements Iterable, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0662g f9182c = new C0662g(AbstractC0677w.f9256b);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0660e f9183d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9184a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f9185b;

    static {
        f9183d = AbstractC0658c.a() ? new C0660e(1) : new C0660e(0);
    }

    public C0662g(byte[] bArr) {
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

    public static C0662g t(byte[] bArr, int i7, int i8) {
        byte[] bArrCopyOfRange;
        m(i7, i7 + i8, bArr.length);
        switch (f9183d.f9178a) {
            case 0:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i7, i8 + i7);
                break;
            default:
                bArrCopyOfRange = new byte[i8];
                System.arraycopy(bArr, i7, bArrCopyOfRange, 0, i8);
                break;
        }
        return new C0662g(bArrCopyOfRange);
    }

    public byte A(int i7) {
        return this.f9185b[i7];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0662g) || size() != ((C0662g) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C0662g)) {
            return obj.equals(this);
        }
        C0662g c0662g = (C0662g) obj;
        int i7 = this.f9184a;
        int i8 = c0662g.f9184a;
        if (i7 != 0 && i8 != 0 && i7 != i8) {
            return false;
        }
        int size = size();
        if (size > c0662g.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c0662g.size()) {
            StringBuilder sbJ = AbstractC0486a1.j(size, "Ran off end of other: 0, ", ", ");
            sbJ.append(c0662g.size());
            throw new IllegalArgumentException(sbJ.toString());
        }
        int iZ = z() + size;
        int iZ2 = z();
        int iZ3 = c0662g.z();
        while (iZ2 < iZ) {
            if (this.f9185b[iZ2] != c0662g.f9185b[iZ3]) {
                return false;
            }
            iZ2++;
            iZ3++;
        }
        return true;
    }

    public final int hashCode() {
        int i7 = this.f9184a;
        if (i7 == 0) {
            int size = size();
            int iZ = z();
            int i8 = size;
            for (int i9 = iZ; i9 < iZ + size; i9++) {
                i8 = (i8 * 31) + this.f9185b[i9];
            }
            i7 = i8 == 0 ? 1 : i8;
            this.f9184a = i7;
        }
        return i7;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0659d(this);
    }

    public byte l(int i7) {
        return this.f9185b[i7];
    }

    public int size() {
        return this.f9185b.length;
    }

    public final String toString() {
        C0662g c0661f;
        String string;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            string = Y4.D.o(this);
        } else {
            StringBuilder sb = new StringBuilder();
            int iM = m(0, 47, size());
            if (iM == 0) {
                c0661f = f9182c;
            } else {
                c0661f = new C0661f(this.f9185b, z(), iM);
            }
            sb.append(Y4.D.o(c0661f));
            sb.append("...");
            string = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(size);
        sb2.append(" contents=\"");
        return p031e1.k.i(sb2, string, "\">");
    }

    public void y(int i7, byte[] bArr) {
        System.arraycopy(this.f9185b, 0, bArr, 0, i7);
    }

    public int z() {
        return 0;
    }
}
