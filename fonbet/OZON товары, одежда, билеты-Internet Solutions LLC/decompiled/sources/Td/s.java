package Td;

import C.o0;
import Td.c;
import Td.o;
import Td.o.a;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

/* loaded from: classes.dex */
final class s extends Td.c {

    /* renamed from: h, reason: collision with root package name */
    private static final int[] f27103h;

    /* renamed from: b, reason: collision with root package name */
    private final int f27104b;

    /* renamed from: c, reason: collision with root package name */
    private final Td.c f27105c;

    /* renamed from: d, reason: collision with root package name */
    private final Td.c f27106d;

    /* renamed from: e, reason: collision with root package name */
    private final int f27107e;

    /* renamed from: f, reason: collision with root package name */
    private final int f27108f;

    /* renamed from: g, reason: collision with root package name */
    private int f27109g;

    /* loaded from: classes10.dex */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Stack<Td.c> f27110a = new Stack<>();

        a() {
        }

        static Td.c a(a aVar, Td.c cVar, Td.c cVar2) {
            aVar.b(cVar);
            aVar.b(cVar2);
            Stack<Td.c> stack = aVar.f27110a;
            Td.c pop = stack.pop();
            while (!stack.isEmpty()) {
                pop = new s(stack.pop(), pop, 0);
            }
            return pop;
        }

        private void b(Td.c cVar) {
            int i11;
            if (!cVar.i()) {
                if (!(cVar instanceof s)) {
                    String valueOf = String.valueOf(cVar.getClass());
                    throw new IllegalArgumentException(o0.c(new StringBuilder(valueOf.length() + 49), "Has a new type of ByteString been created? Found ", valueOf));
                }
                s sVar = (s) cVar;
                b(sVar.f27105c);
                b(sVar.f27106d);
                return;
            }
            int binarySearch = Arrays.binarySearch(s.f27103h, cVar.size());
            if (binarySearch < 0) {
                binarySearch = (-(binarySearch + 1)) - 1;
            }
            int i12 = s.f27103h[binarySearch + 1];
            Stack<Td.c> stack = this.f27110a;
            if (stack.isEmpty() || stack.peek().size() >= i12) {
                stack.push(cVar);
                return;
            }
            int i13 = s.f27103h[binarySearch];
            Td.c pop = stack.pop();
            while (true) {
                i11 = 0;
                if (stack.isEmpty() || stack.peek().size() >= i13) {
                    break;
                } else {
                    pop = new s(stack.pop(), pop, i11);
                }
            }
            s sVar2 = new s(pop, cVar, i11);
            while (!stack.isEmpty()) {
                int binarySearch2 = Arrays.binarySearch(s.f27103h, sVar2.size());
                if (binarySearch2 < 0) {
                    binarySearch2 = (-(binarySearch2 + 1)) - 1;
                }
                if (stack.peek().size() >= s.f27103h[binarySearch2 + 1]) {
                    break;
                } else {
                    sVar2 = new s(stack.pop(), sVar2, i11);
                }
            }
            stack.push(sVar2);
        }
    }

    /* loaded from: classes10.dex */
    private static class b implements Iterator<o> {

        /* renamed from: a, reason: collision with root package name */
        private final Stack<s> f27111a = new Stack<>();

        /* renamed from: b, reason: collision with root package name */
        private o f27112b;

        b(Td.c cVar) {
            while (cVar instanceof s) {
                s sVar = (s) cVar;
                this.f27111a.push(sVar);
                cVar = sVar.f27105c;
            }
            this.f27112b = (o) cVar;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o next() {
            o oVar;
            o oVar2 = this.f27112b;
            if (oVar2 == null) {
                throw new NoSuchElementException();
            }
            while (true) {
                Stack<s> stack = this.f27111a;
                if (!stack.isEmpty()) {
                    Object obj = stack.pop().f27106d;
                    while (obj instanceof s) {
                        s sVar = (s) obj;
                        stack.push(sVar);
                        obj = sVar.f27105c;
                    }
                    oVar = (o) obj;
                    if (oVar.f27098b.length != 0) {
                        break;
                    }
                } else {
                    oVar = null;
                    break;
                }
            }
            this.f27112b = oVar;
            return oVar2;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f27112b != null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes10.dex */
    private class c implements c.a {

        /* renamed from: a, reason: collision with root package name */
        private final b f27113a;

        /* renamed from: b, reason: collision with root package name */
        private c.a f27114b;

        /* renamed from: c, reason: collision with root package name */
        int f27115c;

        c(s sVar) {
            b bVar = new b(sVar);
            this.f27113a = bVar;
            this.f27114b = bVar.next().new a();
            this.f27115c = sVar.size();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f27115c > 0;
        }

        @Override // java.util.Iterator
        public final Byte next() {
            if (!((o.a) this.f27114b).hasNext()) {
                this.f27114b = this.f27113a.next().new a();
            }
            this.f27115c--;
            return Byte.valueOf(((o.a) this.f27114b).nextByte());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i11 = 1;
        int i12 = 1;
        while (i11 > 0) {
            arrayList.add(Integer.valueOf(i11));
            int i13 = i12 + i11;
            i12 = i11;
            i11 = i13;
        }
        arrayList.add(Integer.MAX_VALUE);
        f27103h = new int[arrayList.size()];
        int i14 = 0;
        while (true) {
            int[] iArr = f27103h;
            if (i14 >= iArr.length) {
                return;
            }
            iArr[i14] = ((Integer) arrayList.get(i14)).intValue();
            i14++;
        }
    }

    /* synthetic */ s(Td.c cVar, Td.c cVar2, int i11) {
        this(cVar, cVar2);
    }

    static Td.c x(Td.c cVar, Td.c cVar2) {
        s sVar = cVar instanceof s ? (s) cVar : null;
        if (cVar2.size() == 0) {
            return cVar;
        }
        if (cVar.size() == 0) {
            return cVar2;
        }
        int size = cVar2.size() + cVar.size();
        if (size < 128) {
            int size2 = cVar.size();
            int size3 = cVar2.size();
            byte[] bArr = new byte[size2 + size3];
            cVar.f(bArr, 0, 0, size2);
            cVar2.f(bArr, 0, size2, size3);
            return new o(bArr);
        }
        if (sVar != null) {
            Td.c cVar3 = sVar.f27106d;
            if (cVar2.size() + cVar3.size() < 128) {
                int size4 = cVar3.size();
                int size5 = cVar2.size();
                byte[] bArr2 = new byte[size4 + size5];
                cVar3.f(bArr2, 0, 0, size4);
                cVar2.f(bArr2, 0, size4, size5);
                return new s(sVar.f27105c, new o(bArr2));
            }
        }
        if (sVar != null) {
            Td.c cVar4 = sVar.f27105c;
            int h11 = cVar4.h();
            Td.c cVar5 = sVar.f27106d;
            if (h11 > cVar5.h()) {
                if (sVar.f27108f > cVar2.h()) {
                    return new s(cVar4, new s(cVar5, cVar2));
                }
            }
        }
        return size >= f27103h[Math.max(cVar.h(), cVar2.h()) + 1] ? new s(cVar, cVar2) : a.a(new a(), cVar, cVar2);
    }

    public final boolean equals(Object obj) {
        int q11;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Td.c) {
            Td.c cVar = (Td.c) obj;
            int size = cVar.size();
            int i11 = this.f27104b;
            if (i11 == size) {
                if (i11 == 0) {
                    return true;
                }
                if (this.f27109g == 0 || (q11 = cVar.q()) == 0 || this.f27109g == q11) {
                    b bVar = new b(this);
                    o oVar = (o) bVar.next();
                    b bVar2 = new b(cVar);
                    o oVar2 = (o) bVar2.next();
                    int i12 = 0;
                    int i13 = 0;
                    int i14 = 0;
                    while (true) {
                        int length = oVar.f27098b.length - i12;
                        int length2 = oVar2.f27098b.length - i13;
                        int min = Math.min(length, length2);
                        if (!(i12 == 0 ? oVar.u(oVar2, i13, min) : oVar2.u(oVar, i12, min))) {
                            break;
                        }
                        i14 += min;
                        if (i14 >= i11) {
                            if (i14 == i11) {
                                return true;
                            }
                            throw new IllegalStateException();
                        }
                        if (min == length) {
                            oVar = (o) bVar.next();
                            i12 = 0;
                        } else {
                            i12 += min;
                        }
                        if (min == length2) {
                            oVar2 = (o) bVar2.next();
                            i13 = 0;
                        } else {
                            i13 += min;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // Td.c
    protected final void g(byte[] bArr, int i11, int i12, int i13) {
        int i14 = i11 + i13;
        Td.c cVar = this.f27105c;
        int i15 = this.f27107e;
        if (i14 <= i15) {
            cVar.g(bArr, i11, i12, i13);
            return;
        }
        Td.c cVar2 = this.f27106d;
        if (i11 >= i15) {
            cVar2.g(bArr, i11 - i15, i12, i13);
            return;
        }
        int i16 = i15 - i11;
        cVar.g(bArr, i11, i12, i16);
        cVar2.g(bArr, 0, i12 + i16, i13 - i16);
    }

    @Override // Td.c
    protected final int h() {
        return this.f27108f;
    }

    public final int hashCode() {
        int i11 = this.f27109g;
        if (i11 == 0) {
            int i12 = this.f27104b;
            i11 = n(i12, 0, i12);
            if (i11 == 0) {
                i11 = 1;
            }
            this.f27109g = i11;
        }
        return i11;
    }

    @Override // Td.c
    protected final boolean i() {
        return this.f27104b >= f27103h[this.f27108f];
    }

    @Override // Td.c, java.lang.Iterable
    public final Iterator<Byte> iterator() {
        return new c(this);
    }

    @Override // Td.c
    public final boolean k() {
        int o11 = this.f27105c.o(0, 0, this.f27107e);
        Td.c cVar = this.f27106d;
        return cVar.o(o11, 0, cVar.size()) == 0;
    }

    @Override // Td.c
    /* renamed from: l */
    public final c.a iterator() {
        return new c(this);
    }

    @Override // Td.c
    protected final int n(int i11, int i12, int i13) {
        int i14 = i12 + i13;
        Td.c cVar = this.f27105c;
        int i15 = this.f27107e;
        if (i14 <= i15) {
            return cVar.n(i11, i12, i13);
        }
        Td.c cVar2 = this.f27106d;
        if (i12 >= i15) {
            return cVar2.n(i11, i12 - i15, i13);
        }
        int i16 = i15 - i12;
        return cVar2.n(cVar.n(i11, i12, i16), 0, i13 - i16);
    }

    @Override // Td.c
    protected final int o(int i11, int i12, int i13) {
        int i14 = i12 + i13;
        Td.c cVar = this.f27105c;
        int i15 = this.f27107e;
        if (i14 <= i15) {
            return cVar.o(i11, i12, i13);
        }
        Td.c cVar2 = this.f27106d;
        if (i12 >= i15) {
            return cVar2.o(i11, i12 - i15, i13);
        }
        int i16 = i15 - i12;
        return cVar2.o(cVar.o(i11, i12, i16), 0, i13 - i16);
    }

    @Override // Td.c
    protected final int q() {
        return this.f27109g;
    }

    @Override // Td.c
    public final String r() throws UnsupportedEncodingException {
        byte[] bArr;
        int i11 = this.f27104b;
        if (i11 == 0) {
            bArr = i.f27091a;
        } else {
            byte[] bArr2 = new byte[i11];
            g(bArr2, 0, 0, i11);
            bArr = bArr2;
        }
        return new String(bArr, "UTF-8");
    }

    @Override // Td.c
    public final int size() {
        return this.f27104b;
    }

    @Override // Td.c
    final void t(OutputStream outputStream, int i11, int i12) throws IOException {
        int i13 = i11 + i12;
        Td.c cVar = this.f27105c;
        int i14 = this.f27107e;
        if (i13 <= i14) {
            cVar.t(outputStream, i11, i12);
            return;
        }
        Td.c cVar2 = this.f27106d;
        if (i11 >= i14) {
            cVar2.t(outputStream, i11 - i14, i12);
            return;
        }
        int i15 = i14 - i11;
        cVar.t(outputStream, i11, i15);
        cVar2.t(outputStream, 0, i12 - i15);
    }

    private s(Td.c cVar, Td.c cVar2) {
        this.f27109g = 0;
        this.f27105c = cVar;
        this.f27106d = cVar2;
        int size = cVar.size();
        this.f27107e = size;
        this.f27104b = cVar2.size() + size;
        this.f27108f = Math.max(cVar.h(), cVar2.h()) + 1;
    }
}
