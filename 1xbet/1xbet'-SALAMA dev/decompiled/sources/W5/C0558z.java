package W5;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: renamed from: W5.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0558z extends AbstractC0490c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f2 f7409e = new f2(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f2 f7410f = new f2(3);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final f2 f7411x = new f2(4);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final f2 f7412y = new f2(5);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final f2 f7413z = new f2(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f7414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayDeque f7415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7417d;

    public C0558z() {
        new ArrayDeque(2);
        this.f7414a = new ArrayDeque();
    }

    @Override // W5.AbstractC0490c
    public final void b() throws IOException {
        ArrayDeque arrayDeque = this.f7415b;
        ArrayDeque arrayDeque2 = this.f7414a;
        if (arrayDeque == null) {
            this.f7415b = new ArrayDeque(Math.min(arrayDeque2.size(), 16));
        }
        while (!this.f7415b.isEmpty()) {
            ((AbstractC0490c) this.f7415b.remove()).close();
        }
        this.f7417d = true;
        AbstractC0490c abstractC0490c = (AbstractC0490c) arrayDeque2.peek();
        if (abstractC0490c != null) {
            abstractC0490c.b();
        }
    }

    @Override // W5.AbstractC0490c
    public final boolean c() {
        Iterator it = this.f7414a.iterator();
        while (it.hasNext()) {
            if (!((AbstractC0490c) it.next()).c()) {
                return false;
            }
        }
        return true;
    }

    @Override // W5.AbstractC0490c, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        while (true) {
            ArrayDeque arrayDeque = this.f7414a;
            if (arrayDeque.isEmpty()) {
                break;
            } else {
                ((AbstractC0490c) arrayDeque.remove()).close();
            }
        }
        if (this.f7415b != null) {
            while (!this.f7415b.isEmpty()) {
                ((AbstractC0490c) this.f7415b.remove()).close();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [W5.c] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [W5.c] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [W5.z] */
    /* JADX WARN: Type inference failed for: r1v3, types: [W5.z] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // W5.AbstractC0490c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC0490c d(int i7) throws IOException {
        AbstractC0490c abstractC0490cD;
        int i8;
        AbstractC0490c abstractC0490cD2;
        ?? r7;
        ?? r8;
        if (i7 <= 0) {
            return AbstractC0551w1.f7386a;
        }
        a(i7);
        this.f7416c -= i7;
        ?? r9 = 0;
        ?? c0558z = 0;
        while (true) {
            ArrayDeque arrayDeque = this.f7414a;
            AbstractC0490c abstractC0490c = (AbstractC0490c) arrayDeque.peek();
            int i9 = abstractC0490c.i();
            if (i9 > i7) {
                abstractC0490cD2 = abstractC0490c.d(i7);
                i8 = 0;
            } else {
                if (this.f7417d) {
                    abstractC0490cD = abstractC0490c.d(i9);
                    n();
                } else {
                    abstractC0490cD = (AbstractC0490c) arrayDeque.poll();
                }
                AbstractC0490c abstractC0490c2 = abstractC0490cD;
                i8 = i7 - i9;
                abstractC0490cD2 = abstractC0490c2;
            }
            if (r9 == 0) {
                r8 = abstractC0490cD2;
            } else {
                if (c0558z == 0) {
                    c0558z = new C0558z(i8 != 0 ? Math.min(arrayDeque.size() + 2, 16) : 2);
                    c0558z.k(r9);
                    r9 = c0558z;
                }
                c0558z.k(abstractC0490cD2);
                r8 = r9;
                r7 = c0558z;
            }
            if (i8 <= 0) {
                break;
            }
            r7 = c0558z;
            i7 = i8;
            r9 = r8;
            c0558z = r7;
        }
        return r8;
    }

    @Override // W5.AbstractC0490c
    public final void e(OutputStream outputStream, int i7) throws IOException {
        o(f7413z, i7, outputStream, 0);
    }

    @Override // W5.AbstractC0490c
    public final void f(ByteBuffer byteBuffer) {
        p(f7412y, byteBuffer.remaining(), byteBuffer, 0);
    }

    @Override // W5.AbstractC0490c
    public final void g(byte[] bArr, int i7, int i8) {
        p(f7411x, i8, bArr, i7);
    }

    @Override // W5.AbstractC0490c
    public final int h() {
        return p(f7409e, 1, null, 0);
    }

    @Override // W5.AbstractC0490c
    public final int i() {
        return this.f7416c;
    }

    @Override // W5.AbstractC0490c
    public final void j(int i7) {
        p(f7410f, i7, null, 0);
    }

    public final void k(AbstractC0490c abstractC0490c) throws IOException {
        boolean z4 = this.f7417d;
        ArrayDeque arrayDeque = this.f7414a;
        boolean z7 = z4 && arrayDeque.isEmpty();
        if (abstractC0490c instanceof C0558z) {
            C0558z c0558z = (C0558z) abstractC0490c;
            while (!c0558z.f7414a.isEmpty()) {
                arrayDeque.add((AbstractC0490c) c0558z.f7414a.remove());
            }
            this.f7416c += c0558z.f7416c;
            c0558z.f7416c = 0;
            c0558z.close();
        } else {
            arrayDeque.add(abstractC0490c);
            this.f7416c = abstractC0490c.i() + this.f7416c;
        }
        if (z7) {
            ((AbstractC0490c) arrayDeque.peek()).b();
        }
    }

    public final void n() throws IOException {
        boolean z4 = this.f7417d;
        ArrayDeque arrayDeque = this.f7414a;
        if (!z4) {
            ((AbstractC0490c) arrayDeque.remove()).close();
            return;
        }
        this.f7415b.add((AbstractC0490c) arrayDeque.remove());
        AbstractC0490c abstractC0490c = (AbstractC0490c) arrayDeque.peek();
        if (abstractC0490c != null) {
            abstractC0490c.b();
        }
    }

    public final int o(InterfaceC0555y interfaceC0555y, int i7, Object obj, int i8) throws IOException {
        a(i7);
        ArrayDeque arrayDeque = this.f7414a;
        if (!arrayDeque.isEmpty() && ((AbstractC0490c) arrayDeque.peek()).i() == 0) {
            n();
        }
        while (i7 > 0 && !arrayDeque.isEmpty()) {
            AbstractC0490c abstractC0490c = (AbstractC0490c) arrayDeque.peek();
            int iMin = Math.min(i7, abstractC0490c.i());
            i8 = interfaceC0555y.c(abstractC0490c, iMin, obj, i8);
            i7 -= iMin;
            this.f7416c -= iMin;
            if (((AbstractC0490c) arrayDeque.peek()).i() == 0) {
                n();
            }
        }
        if (i7 <= 0) {
            return i8;
        }
        throw new AssertionError("Failed executing read operation");
    }

    public final int p(f2 f2Var, int i7, Object obj, int i8) {
        try {
            return o(f2Var, i7, obj, i8);
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }

    @Override // W5.AbstractC0490c
    public final void reset() {
        if (!this.f7417d) {
            throw new InvalidMarkException();
        }
        ArrayDeque arrayDeque = this.f7414a;
        AbstractC0490c abstractC0490c = (AbstractC0490c) arrayDeque.peek();
        if (abstractC0490c != null) {
            int i7 = abstractC0490c.i();
            abstractC0490c.reset();
            this.f7416c = (abstractC0490c.i() - i7) + this.f7416c;
        }
        while (true) {
            AbstractC0490c abstractC0490c2 = (AbstractC0490c) this.f7415b.pollLast();
            if (abstractC0490c2 == null) {
                return;
            }
            abstractC0490c2.reset();
            arrayDeque.addFirst(abstractC0490c2);
            this.f7416c = abstractC0490c2.i() + this.f7416c;
        }
    }

    public C0558z(int i7) {
        new ArrayDeque(2);
        this.f7414a = new ArrayDeque(i7);
    }
}
