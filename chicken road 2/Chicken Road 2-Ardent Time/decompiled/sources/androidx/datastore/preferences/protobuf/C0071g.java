package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0071g implements java.lang.Iterable, java.io.Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final androidx.datastore.preferences.protobuf.C0071g f2301c = new androidx.datastore.preferences.protobuf.C0071g(androidx.datastore.preferences.protobuf.AbstractC0088y.f2377b);

    /* renamed from: d, reason: collision with root package name */
    public static final androidx.datastore.preferences.protobuf.C0069e f2302d;

    /* renamed from: a, reason: collision with root package name */
    public int f2303a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f2304b;

    static {
        f2302d = androidx.datastore.preferences.protobuf.AbstractC0067c.a() ? new androidx.datastore.preferences.protobuf.C0069e(1) : new androidx.datastore.preferences.protobuf.C0069e(0);
    }

    public C0071g(byte[] bArr) {
        bArr.getClass();
        this.f2304b = bArr;
    }

    public static int b(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) >= 0) {
            return i5;
        }
        if (i2 < 0) {
            throw new java.lang.IndexOutOfBoundsException(B1.a.g(i2, "Beginning index: ", " < 0"));
        }
        if (i3 < i2) {
            throw new java.lang.IndexOutOfBoundsException(B1.a.h("Beginning index larger than ending index: ", i2, i3, ", "));
        }
        throw new java.lang.IndexOutOfBoundsException(B1.a.h("End index: ", i3, i4, " >= "));
    }

    public static androidx.datastore.preferences.protobuf.C0071g c(byte[] bArr, int i2, int i3) {
        byte[] copyOfRange;
        b(i2, i2 + i3, bArr.length);
        switch (f2302d.f2298a) {
            case 0:
                copyOfRange = java.util.Arrays.copyOfRange(bArr, i2, i3 + i2);
                break;
            default:
                copyOfRange = new byte[i3];
                java.lang.System.arraycopy(bArr, i2, copyOfRange, 0, i3);
                break;
        }
        return new androidx.datastore.preferences.protobuf.C0071g(copyOfRange);
    }

    public byte a(int i2) {
        return this.f2304b[i2];
    }

    public void d(int i2, byte[] bArr) {
        java.lang.System.arraycopy(this.f2304b, 0, bArr, 0, i2);
    }

    public int e() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.datastore.preferences.protobuf.C0071g) || size() != ((androidx.datastore.preferences.protobuf.C0071g) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof androidx.datastore.preferences.protobuf.C0071g)) {
            return obj.equals(this);
        }
        androidx.datastore.preferences.protobuf.C0071g c0071g = (androidx.datastore.preferences.protobuf.C0071g) obj;
        int i2 = this.f2303a;
        int i3 = c0071g.f2303a;
        if (i2 != 0 && i3 != 0 && i2 != i3) {
            return false;
        }
        int size = size();
        if (size > c0071g.size()) {
            throw new java.lang.IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c0071g.size()) {
            throw new java.lang.IllegalArgumentException("Ran off end of other: 0, " + size + ", " + c0071g.size());
        }
        int e2 = e() + size;
        int e3 = e();
        int e4 = c0071g.e();
        while (e3 < e2) {
            if (this.f2304b[e3] != c0071g.f2304b[e4]) {
                return false;
            }
            e3++;
            e4++;
        }
        return true;
    }

    public byte f(int i2) {
        return this.f2304b[i2];
    }

    public final int hashCode() {
        int i2 = this.f2303a;
        if (i2 == 0) {
            int size = size();
            int e2 = e();
            int i3 = size;
            for (int i4 = e2; i4 < e2 + size; i4++) {
                i3 = (i3 * 31) + this.f2304b[i4];
            }
            i2 = i3 == 0 ? 1 : i3;
            this.f2303a = i2;
        }
        return i2;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.C0068d(this);
    }

    public int size() {
        return this.f2304b.length;
    }

    public final java.lang.String toString() {
        androidx.datastore.preferences.protobuf.C0071g c0070f;
        java.lang.String sb;
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String hexString = java.lang.Integer.toHexString(java.lang.System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            sb = Q1.l.k(this);
        } else {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            int b2 = b(0, 47, size());
            if (b2 == 0) {
                c0070f = f2301c;
            } else {
                c0070f = new androidx.datastore.preferences.protobuf.C0070f(this.f2304b, e(), b2);
            }
            sb2.append(Q1.l.k(c0070f));
            sb2.append("...");
            sb = sb2.toString();
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("<ByteString@");
        sb3.append(hexString);
        sb3.append(" size=");
        sb3.append(size);
        sb3.append(" contents=\"");
        return B1.a.j(sb3, sb, "\">");
    }
}
