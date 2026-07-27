package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0132g implements Iterable, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final C0132g f2230c = new C0132g(AbstractC0149y.f2301b);

    /* renamed from: d, reason: collision with root package name */
    public static final C0130e f2231d;

    /* renamed from: a, reason: collision with root package name */
    public int f2232a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f2233b;

    static {
        f2231d = AbstractC0128c.a() ? new C0130e(1) : new C0130e(0);
    }

    public C0132g(byte[] bArr) {
        bArr.getClass();
        this.f2233b = bArr;
    }

    public static int c(int i3, int i4, int i5) {
        int i6 = i4 - i3;
        if ((i3 | i4 | i6 | (i5 - i4)) >= 0) {
            return i6;
        }
        if (i3 < 0) {
            throw new IndexOutOfBoundsException(B0.c.i(i3, "Beginning index: ", " < 0"));
        }
        if (i4 < i3) {
            throw new IndexOutOfBoundsException(B0.c.g(i3, i4, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(B0.c.g(i4, i5, "End index: ", " >= "));
    }

    public static C0132g d(byte[] bArr, int i3, int i4) {
        byte[] copyOfRange;
        c(i3, i3 + i4, bArr.length);
        switch (f2231d.f2228a) {
            case 0:
                copyOfRange = Arrays.copyOfRange(bArr, i3, i4 + i3);
                break;
            default:
                copyOfRange = new byte[i4];
                System.arraycopy(bArr, i3, copyOfRange, 0, i4);
                break;
        }
        return new C0132g(copyOfRange);
    }

    public byte b(int i3) {
        return this.f2233b[i3];
    }

    public void e(int i3, byte[] bArr) {
        System.arraycopy(this.f2233b, 0, bArr, 0, i3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0132g) || size() != ((C0132g) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C0132g)) {
            return obj.equals(this);
        }
        C0132g c0132g = (C0132g) obj;
        int i3 = this.f2232a;
        int i4 = c0132g.f2232a;
        if (i3 != 0 && i4 != 0 && i3 != i4) {
            return false;
        }
        int size = size();
        if (size > c0132g.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c0132g.size()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + size + ", " + c0132g.size());
        }
        int f = f() + size;
        int f3 = f();
        int f4 = c0132g.f();
        while (f3 < f) {
            if (this.f2233b[f3] != c0132g.f2233b[f4]) {
                return false;
            }
            f3++;
            f4++;
        }
        return true;
    }

    public int f() {
        return 0;
    }

    public byte g(int i3) {
        return this.f2233b[i3];
    }

    public final int hashCode() {
        int i3 = this.f2232a;
        if (i3 != 0) {
            return i3;
        }
        int size = size();
        int f = f();
        int i4 = size;
        for (int i5 = f; i5 < f + size; i5++) {
            i4 = (i4 * 31) + this.f2233b[i5];
        }
        if (i4 == 0) {
            i4 = 1;
        }
        this.f2232a = i4;
        return i4;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0129d(this);
    }

    public int size() {
        return this.f2233b.length;
    }

    public final String toString() {
        C0132g c0131f;
        String sb;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            sb = F2.b.q(this);
        } else {
            StringBuilder sb2 = new StringBuilder();
            int c3 = c(0, 47, size());
            if (c3 == 0) {
                c0131f = f2230c;
            } else {
                c0131f = new C0131f(this.f2233b, f(), c3);
            }
            sb2.append(F2.b.q(c0131f));
            sb2.append("...");
            sb = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder("<ByteString@");
        sb3.append(hexString);
        sb3.append(" size=");
        sb3.append(size);
        sb3.append(" contents=\"");
        return B0.c.l(sb3, sb, "\">");
    }
}
