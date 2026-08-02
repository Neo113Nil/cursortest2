package Td;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class c implements Iterable<Byte> {

    /* renamed from: a, reason: collision with root package name */
    public static final c f27045a = new o(new byte[0]);

    /* loaded from: classes10.dex */
    public interface a extends Iterator<Byte> {
    }

    c() {
    }

    private static c a(Iterator<c> it, int i11) {
        if (i11 == 1) {
            return it.next();
        }
        int i12 = i11 >>> 1;
        return a(it, i12).b(a(it, i11 - i12));
    }

    public static c c(ArrayList arrayList) {
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((c) it.next());
            }
            arrayList = arrayList2;
        }
        return arrayList.isEmpty() ? f27045a : a(arrayList.iterator(), arrayList.size());
    }

    public static c e(String str) {
        try {
            return new o(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e11) {
            throw new RuntimeException("UTF-8 not supported?", e11);
        }
    }

    public static b m() {
        return new b();
    }

    public final c b(c cVar) {
        int size = size();
        int size2 = cVar.size();
        if (size + size2 < 2147483647L) {
            return s.x(this, cVar);
        }
        StringBuilder sb2 = new StringBuilder(53);
        sb2.append("ByteString would be too long: ");
        sb2.append(size);
        sb2.append("+");
        sb2.append(size2);
        throw new IllegalArgumentException(sb2.toString());
    }

    public final void f(byte[] bArr, int i11, int i12, int i13) {
        if (i11 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Source offset < 0: ");
            sb2.append(i11);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i12 < 0) {
            StringBuilder sb3 = new StringBuilder(30);
            sb3.append("Target offset < 0: ");
            sb3.append(i12);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        if (i13 < 0) {
            StringBuilder sb4 = new StringBuilder(23);
            sb4.append("Length < 0: ");
            sb4.append(i13);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
        int i14 = i11 + i13;
        if (i14 > size()) {
            StringBuilder sb5 = new StringBuilder(34);
            sb5.append("Source end offset < 0: ");
            sb5.append(i14);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
        int i15 = i12 + i13;
        if (i15 <= bArr.length) {
            if (i13 > 0) {
                g(bArr, i11, i12, i13);
            }
        } else {
            StringBuilder sb6 = new StringBuilder(34);
            sb6.append("Target end offset < 0: ");
            sb6.append(i15);
            throw new IndexOutOfBoundsException(sb6.toString());
        }
    }

    protected abstract void g(byte[] bArr, int i11, int i12, int i13);

    protected abstract int h();

    protected abstract boolean i();

    public abstract boolean k();

    @Override // java.lang.Iterable
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public abstract a iterator();

    protected abstract int n(int i11, int i12, int i13);

    protected abstract int o(int i11, int i12, int i13);

    protected abstract int q();

    public abstract String r() throws UnsupportedEncodingException;

    public final String s() {
        try {
            return r();
        } catch (UnsupportedEncodingException e11) {
            throw new RuntimeException("UTF-8 not supported?", e11);
        }
    }

    public abstract int size();

    abstract void t(OutputStream outputStream, int i11, int i12) throws IOException;

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public static final class b extends OutputStream {

        /* renamed from: f, reason: collision with root package name */
        private static final byte[] f27046f = new byte[0];

        /* renamed from: c, reason: collision with root package name */
        private int f27049c;

        /* renamed from: e, reason: collision with root package name */
        private int f27051e;

        /* renamed from: a, reason: collision with root package name */
        private final int f27047a = UserVerificationMethods.USER_VERIFY_PATTERN;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<c> f27048b = new ArrayList<>();

        /* renamed from: d, reason: collision with root package name */
        private byte[] f27050d = new byte[UserVerificationMethods.USER_VERIFY_PATTERN];

        b() {
        }

        private void c(int i11) {
            this.f27048b.add(new o(this.f27050d));
            int length = this.f27049c + this.f27050d.length;
            this.f27049c = length;
            this.f27050d = new byte[Math.max(this.f27047a, Math.max(i11, length >>> 1))];
            this.f27051e = 0;
        }

        private void d() {
            int i11 = this.f27051e;
            byte[] bArr = this.f27050d;
            int length = bArr.length;
            ArrayList<c> arrayList = this.f27048b;
            if (i11 >= length) {
                arrayList.add(new o(this.f27050d));
                this.f27050d = f27046f;
            } else if (i11 > 0) {
                byte[] bArr2 = new byte[i11];
                System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i11));
                arrayList.add(new o(bArr2));
            }
            this.f27049c += this.f27051e;
            this.f27051e = 0;
        }

        public final synchronized c j() {
            d();
            return c.c(this.f27048b);
        }

        public final String toString() {
            int i11;
            String hexString = Integer.toHexString(System.identityHashCode(this));
            synchronized (this) {
                i11 = this.f27049c + this.f27051e;
            }
            return String.format("<ByteString.Output@%s size=%d>", hexString, Integer.valueOf(i11));
        }

        @Override // java.io.OutputStream
        public final synchronized void write(int i11) {
            try {
                if (this.f27051e == this.f27050d.length) {
                    c(1);
                }
                byte[] bArr = this.f27050d;
                int i12 = this.f27051e;
                this.f27051e = i12 + 1;
                bArr[i12] = (byte) i11;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // java.io.OutputStream
        public final synchronized void write(byte[] bArr, int i11, int i12) {
            try {
                byte[] bArr2 = this.f27050d;
                int length = bArr2.length;
                int i13 = this.f27051e;
                if (i12 <= length - i13) {
                    System.arraycopy(bArr, i11, bArr2, i13, i12);
                    this.f27051e += i12;
                } else {
                    int length2 = bArr2.length - i13;
                    System.arraycopy(bArr, i11, bArr2, i13, length2);
                    int i14 = i12 - length2;
                    c(i14);
                    System.arraycopy(bArr, i11 + length2, this.f27050d, 0, i14);
                    this.f27051e = i14;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
