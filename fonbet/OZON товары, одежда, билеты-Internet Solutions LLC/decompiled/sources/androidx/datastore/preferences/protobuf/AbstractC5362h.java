package androidx.datastore.preferences.protobuf;

import B0.A0;
import N3.C3660k;
import androidx.datastore.preferences.protobuf.AbstractC5365k;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: androidx.datastore.preferences.protobuf.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5362h implements Iterable<Byte>, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC5362h f42524b = new g(C5378y.f42629b);

    /* renamed from: c, reason: collision with root package name */
    private static final d f42525c;

    /* renamed from: a, reason: collision with root package name */
    private int f42526a = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.h$a */
    /* loaded from: classes8.dex */
    static abstract class a implements Iterator {
        @Override // java.util.Iterator
        public final Object next() {
            return Byte.valueOf(((C5361g) this).nextByte());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.h$b */
    /* loaded from: classes8.dex */
    private static final class b implements d {
        b() {
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5362h.d
        public final byte[] copyFrom(byte[] bArr, int i11, int i12) {
            return Arrays.copyOfRange(bArr, i11, i12 + i11);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.h$c */
    /* loaded from: classes8.dex */
    private static final class c extends g {

        /* renamed from: e, reason: collision with root package name */
        private final int f42527e;

        /* renamed from: f, reason: collision with root package name */
        private final int f42528f;

        c(byte[] bArr, int i11, int i12) {
            super(bArr);
            AbstractC5362h.b(i11, i11 + i12, bArr.length);
            this.f42527e = i11;
            this.f42528f = i12;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5362h.g, androidx.datastore.preferences.protobuf.AbstractC5362h
        public final byte a(int i11) {
            int i12 = this.f42528f;
            if (((i12 - (i11 + 1)) | i11) >= 0) {
                return this.f42531d[this.f42527e + i11];
            }
            if (i11 < 0) {
                throw new ArrayIndexOutOfBoundsException(Ej.b.a(i11, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(A0.a(i11, i12, "Index > length: ", ", "));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5362h.g, androidx.datastore.preferences.protobuf.AbstractC5362h
        protected final void f(int i11, byte[] bArr) {
            System.arraycopy(this.f42531d, this.f42527e, bArr, 0, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5362h.g, androidx.datastore.preferences.protobuf.AbstractC5362h
        final byte g(int i11) {
            return this.f42531d[this.f42527e + i11];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5362h.g
        protected final int s() {
            return this.f42527e;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5362h.g, androidx.datastore.preferences.protobuf.AbstractC5362h
        public final int size() {
            return this.f42528f;
        }

        Object writeReplace() {
            return new g(m());
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.h$d */
    private interface d {
        byte[] copyFrom(byte[] bArr, int i11, int i12);
    }

    /* renamed from: androidx.datastore.preferences.protobuf.h$e */
    /* loaded from: classes8.dex */
    static final class e {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC5365k f42529a;

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f42530b;

        e(int i11) {
            byte[] bArr = new byte[i11];
            this.f42530b = bArr;
            int i12 = AbstractC5365k.f42576d;
            this.f42529a = new AbstractC5365k.b(i11, bArr);
        }

        public final AbstractC5362h a() {
            if (this.f42529a.l() == 0) {
                return new g(this.f42530b);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        }

        public final AbstractC5365k b() {
            return this.f42529a;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.h$f */
    static abstract class f extends AbstractC5362h {
        @Override // androidx.datastore.preferences.protobuf.AbstractC5362h, java.lang.Iterable
        public final Iterator<Byte> iterator() {
            return new C5361g(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.datastore.preferences.protobuf.h$g */
    static class g extends f {

        /* renamed from: d, reason: collision with root package name */
        protected final byte[] f42531d;

        g(byte[] bArr) {
            bArr.getClass();
            this.f42531d = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5362h
        public byte a(int i11) {
            return this.f42531d[i11];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5362h
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC5362h) || size() != ((AbstractC5362h) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof g)) {
                return obj.equals(this);
            }
            g gVar = (g) obj;
            int i11 = i();
            int i12 = gVar.i();
            if (i11 != 0 && i12 != 0 && i11 != i12) {
                return false;
            }
            int size = size();
            if (size > gVar.size()) {
                throw new IllegalArgumentException("Length too large: " + size + size());
            }
            if (size > gVar.size()) {
                StringBuilder f7 = P4.f.f(size, "Ran off end of other: 0, ", ", ");
                f7.append(gVar.size());
                throw new IllegalArgumentException(f7.toString());
            }
            int s11 = s() + size;
            int s12 = s();
            int s13 = gVar.s();
            while (s12 < s11) {
                if (this.f42531d[s12] != gVar.f42531d[s13]) {
                    return false;
                }
                s12++;
                s13++;
            }
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5362h
        protected void f(int i11, byte[] bArr) {
            System.arraycopy(this.f42531d, 0, bArr, 0, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5362h
        byte g(int i11) {
            return this.f42531d[i11];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5362h
        protected final int h(int i11, int i12) {
            int s11 = s();
            byte[] bArr = C5378y.f42629b;
            for (int i13 = s11; i13 < s11 + i12; i13++) {
                i11 = (i11 * 31) + this.f42531d[i13];
            }
            return i11;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5362h
        public final AbstractC5362h l(int i11) {
            int b11 = AbstractC5362h.b(0, i11, size());
            if (b11 == 0) {
                return AbstractC5362h.f42524b;
            }
            return new c(this.f42531d, s(), b11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5362h
        final void n(AbstractC5365k abstractC5365k) throws IOException {
            abstractC5365k.a(this.f42531d, s(), size());
        }

        protected int s() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5362h
        public int size() {
            return this.f42531d.length;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.h$h, reason: collision with other inner class name */
    private static final class C0780h implements d {
        @Override // androidx.datastore.preferences.protobuf.AbstractC5362h.d
        public final byte[] copyFrom(byte[] bArr, int i11, int i12) {
            byte[] bArr2 = new byte[i12];
            System.arraycopy(bArr, i11, bArr2, 0, i12);
            return bArr2;
        }
    }

    static {
        f42525c = C5358d.b() ? new C0780h() : new b();
    }

    AbstractC5362h() {
    }

    static int b(int i11, int i12, int i13) {
        int i14 = i12 - i11;
        if ((i11 | i12 | i14 | (i13 - i12)) >= 0) {
            return i14;
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException(T7.E.a(i11, "Beginning index: ", " < 0"));
        }
        if (i12 < i11) {
            throw new IndexOutOfBoundsException(A0.a(i11, i12, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(A0.a(i12, i13, "End index: ", " >= "));
    }

    public static AbstractC5362h e(int i11, int i12, byte[] bArr) {
        b(i11, i11 + i12, bArr.length);
        return new g(f42525c.copyFrom(bArr, i11, i12));
    }

    public abstract byte a(int i11);

    public abstract boolean equals(Object obj);

    protected abstract void f(int i11, byte[] bArr);

    abstract byte g(int i11);

    protected abstract int h(int i11, int i12);

    public final int hashCode() {
        int i11 = this.f42526a;
        if (i11 == 0) {
            int size = size();
            i11 = h(size, size);
            if (i11 == 0) {
                i11 = 1;
            }
            this.f42526a = i11;
        }
        return i11;
    }

    protected final int i() {
        return this.f42526a;
    }

    @Override // java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new C5361g(this);
    }

    public abstract AbstractC5362h l(int i11);

    public final byte[] m() {
        int size = size();
        if (size == 0) {
            return C5378y.f42629b;
        }
        byte[] bArr = new byte[size];
        f(size, bArr);
        return bArr;
    }

    abstract void n(AbstractC5365k abstractC5365k) throws IOException;

    public abstract int size();

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return C.o0.c(C3660k.c(size(), "<ByteString@", hexString, " size=", " contents=\""), size() <= 50 ? k0.a(this) : C.o0.c(new StringBuilder(), k0.a(l(47)), "..."), "\">");
    }
}
