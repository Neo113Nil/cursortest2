package Td;

import C.o0;
import Td.c;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
class o extends c {

    /* renamed from: b, reason: collision with root package name */
    protected final byte[] f27098b;

    /* renamed from: c, reason: collision with root package name */
    private int f27099c = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes10.dex */
    class a implements c.a {

        /* renamed from: a, reason: collision with root package name */
        private int f27100a = 0;

        /* renamed from: b, reason: collision with root package name */
        private final int f27101b;

        a() {
            this.f27101b = o.this.f27098b.length;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f27100a < this.f27101b;
        }

        @Override // java.util.Iterator
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        public final byte nextByte() {
            try {
                byte[] bArr = o.this.f27098b;
                int i11 = this.f27100a;
                this.f27100a = i11 + 1;
                return bArr[i11];
            } catch (ArrayIndexOutOfBoundsException e11) {
                throw new NoSuchElementException(e11.getMessage());
            }
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    o(byte[] bArr) {
        this.f27098b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c) || size() != ((c) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof o) {
            return u((o) obj, 0, size());
        }
        if (obj instanceof s) {
            return obj.equals(this);
        }
        String valueOf = String.valueOf(obj.getClass());
        throw new IllegalArgumentException(o0.c(new StringBuilder(valueOf.length() + 49), "Has a new type of ByteString been created? Found ", valueOf));
    }

    @Override // Td.c
    protected void g(byte[] bArr, int i11, int i12, int i13) {
        System.arraycopy(this.f27098b, i11, bArr, i12, i13);
    }

    @Override // Td.c
    protected final int h() {
        return 0;
    }

    public final int hashCode() {
        int i11 = this.f27099c;
        if (i11 == 0) {
            int size = size();
            i11 = n(size, 0, size);
            if (i11 == 0) {
                i11 = 1;
            }
            this.f27099c = i11;
        }
        return i11;
    }

    @Override // Td.c
    protected final boolean i() {
        return true;
    }

    @Override // Td.c, java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new a();
    }

    @Override // Td.c
    public final boolean k() {
        byte[] bArr = this.f27098b;
        return x.d(bArr, 0, bArr.length) == 0;
    }

    @Override // Td.c
    /* renamed from: l */
    public c.a iterator() {
        return new a();
    }

    @Override // Td.c
    protected final int n(int i11, int i12, int i13) {
        for (int i14 = i12; i14 < i12 + i13; i14++) {
            i11 = (i11 * 31) + this.f27098b[i14];
        }
        return i11;
    }

    @Override // Td.c
    protected final int o(int i11, int i12, int i13) {
        return x.c(i11, this.f27098b, i12, i13 + i12);
    }

    @Override // Td.c
    protected final int q() {
        return this.f27099c;
    }

    @Override // Td.c
    public final String r() throws UnsupportedEncodingException {
        byte[] bArr = this.f27098b;
        return new String(bArr, 0, bArr.length, "UTF-8");
    }

    @Override // Td.c
    public int size() {
        return this.f27098b.length;
    }

    @Override // Td.c
    final void t(OutputStream outputStream, int i11, int i12) throws IOException {
        outputStream.write(this.f27098b, i11, i12);
    }

    final boolean u(o oVar, int i11, int i12) {
        byte[] bArr = oVar.f27098b;
        int length = bArr.length;
        byte[] bArr2 = this.f27098b;
        if (i12 > length) {
            int length2 = bArr2.length;
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(i12);
            sb2.append(length2);
            throw new IllegalArgumentException(sb2.toString());
        }
        int i13 = i11 + i12;
        int length3 = bArr.length;
        byte[] bArr3 = oVar.f27098b;
        if (i13 <= length3) {
            int i14 = 0;
            while (i14 < i12) {
                if (bArr2[i14] != bArr3[i11]) {
                    return false;
                }
                i14++;
                i11++;
            }
            return true;
        }
        int length4 = bArr3.length;
        StringBuilder sb3 = new StringBuilder(59);
        sb3.append("Ran off end of other: ");
        sb3.append(i11);
        sb3.append(", ");
        sb3.append(i12);
        sb3.append(", ");
        sb3.append(length4);
        throw new IllegalArgumentException(sb3.toString());
    }
}
