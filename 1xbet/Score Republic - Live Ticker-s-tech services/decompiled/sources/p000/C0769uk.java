package p000;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: renamed from: uk */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0769uk extends AbstractC0527o0 {

    /* JADX INFO: renamed from: n */
    public static final o31 f7829n = new o31(17);

    /* JADX INFO: renamed from: o */
    public static final nc1 f7830o = new nc1(17);

    /* JADX INFO: renamed from: p */
    public static final wa0 f7831p = new wa0(18);

    /* JADX INFO: renamed from: q */
    public static final o31 f7832q = new o31(18);

    /* JADX INFO: renamed from: r */
    public static final nc1 f7833r = new nc1(18);

    /* JADX INFO: renamed from: j */
    public final ArrayDeque f7834j;

    /* JADX INFO: renamed from: k */
    public ArrayDeque f7835k;

    /* JADX INFO: renamed from: l */
    public int f7836l;

    /* JADX INFO: renamed from: m */
    public boolean f7837m;

    public C0769uk() {
        new ArrayDeque(2);
        this.f7834j = new ArrayDeque();
    }

    @Override // p000.AbstractC0527o0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        while (true) {
            ArrayDeque arrayDeque = this.f7834j;
            if (arrayDeque.isEmpty()) {
                break;
            } else {
                ((AbstractC0527o0) arrayDeque.remove()).close();
            }
        }
        if (this.f7835k != null) {
            while (!this.f7835k.isEmpty()) {
                ((AbstractC0527o0) this.f7835k.remove()).close();
            }
        }
    }

    @Override // p000.AbstractC0527o0
    /* JADX INFO: renamed from: e */
    public final void mo824e() throws IOException {
        ArrayDeque arrayDeque = this.f7835k;
        ArrayDeque arrayDeque2 = this.f7834j;
        if (arrayDeque == null) {
            this.f7835k = new ArrayDeque(Math.min(arrayDeque2.size(), 16));
        }
        while (!this.f7835k.isEmpty()) {
            ((AbstractC0527o0) this.f7835k.remove()).close();
        }
        this.f7837m = true;
        AbstractC0527o0 abstractC0527o0 = (AbstractC0527o0) arrayDeque2.peek();
        if (abstractC0527o0 != null) {
            abstractC0527o0.mo824e();
        }
    }

    @Override // p000.AbstractC0527o0
    /* JADX INFO: renamed from: i */
    public final boolean mo3609i() {
        Iterator it = this.f7834j.iterator();
        while (it.hasNext()) {
            if (!((AbstractC0527o0) it.next()).mo3609i()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [o0] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [o0] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [uk] */
    /* JADX WARN: Type inference failed for: r1v3, types: [uk] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // p000.AbstractC0527o0
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC0527o0 mo825j(int i) throws IOException {
        AbstractC0527o0 abstractC0527o0Mo825j;
        int i2;
        AbstractC0527o0 abstractC0527o0Mo825j2;
        ?? r1;
        ?? r0;
        if (i <= 0) {
            return d01.f1505a;
        }
        m3608a(i);
        this.f7836l -= i;
        ?? r2 = 0;
        ?? c0769uk = 0;
        while (true) {
            ArrayDeque arrayDeque = this.f7834j;
            AbstractC0527o0 abstractC0527o0 = (AbstractC0527o0) arrayDeque.peek();
            int iMo830q = abstractC0527o0.mo830q();
            if (iMo830q > i) {
                abstractC0527o0Mo825j2 = abstractC0527o0.mo825j(i);
                i2 = 0;
            } else {
                if (this.f7837m) {
                    abstractC0527o0Mo825j = abstractC0527o0.mo825j(iMo830q);
                    m4930u();
                } else {
                    abstractC0527o0Mo825j = (AbstractC0527o0) arrayDeque.poll();
                }
                AbstractC0527o0 abstractC0527o1 = abstractC0527o0Mo825j;
                i2 = i - iMo830q;
                abstractC0527o0Mo825j2 = abstractC0527o1;
            }
            if (r2 == 0) {
                r0 = abstractC0527o0Mo825j2;
            } else {
                if (c0769uk == 0) {
                    c0769uk = new C0769uk(i2 != 0 ? Math.min(arrayDeque.size() + 2, 16) : 2);
                    c0769uk.m4929t(r2);
                    r2 = c0769uk;
                }
                c0769uk.m4929t(abstractC0527o0Mo825j2);
                r0 = r2;
                r1 = c0769uk;
            }
            if (i2 <= 0) {
                break;
            }
            r1 = c0769uk;
            i = i2;
            r2 = r0;
            c0769uk = r1;
        }
        return r0;
    }

    @Override // p000.AbstractC0527o0
    /* JADX INFO: renamed from: l */
    public final void mo826l(OutputStream outputStream, int i) throws IOException {
        m4931v(f7833r, i, outputStream, 0);
    }

    @Override // p000.AbstractC0527o0
    /* JADX INFO: renamed from: m */
    public final void mo827m(ByteBuffer byteBuffer) {
        m4932w(f7832q, byteBuffer.remaining(), byteBuffer, 0);
    }

    @Override // p000.AbstractC0527o0
    /* JADX INFO: renamed from: o */
    public final void mo828o(byte[] bArr, int i, int i2) {
        m4932w(f7831p, i2, bArr, i);
    }

    @Override // p000.AbstractC0527o0
    /* JADX INFO: renamed from: p */
    public final int mo829p() {
        return m4932w(f7829n, 1, null, 0);
    }

    @Override // p000.AbstractC0527o0
    /* JADX INFO: renamed from: q */
    public final int mo830q() {
        return this.f7836l;
    }

    @Override // p000.AbstractC0527o0
    /* JADX INFO: renamed from: r */
    public final void mo831r() {
        if (!this.f7837m) {
            throw new InvalidMarkException();
        }
        ArrayDeque arrayDeque = this.f7834j;
        AbstractC0527o0 abstractC0527o0 = (AbstractC0527o0) arrayDeque.peek();
        if (abstractC0527o0 != null) {
            int iMo830q = abstractC0527o0.mo830q();
            abstractC0527o0.mo831r();
            this.f7836l = (abstractC0527o0.mo830q() - iMo830q) + this.f7836l;
        }
        while (true) {
            AbstractC0527o0 abstractC0527o1 = (AbstractC0527o0) this.f7835k.pollLast();
            if (abstractC0527o1 == null) {
                return;
            }
            abstractC0527o1.mo831r();
            arrayDeque.addFirst(abstractC0527o1);
            this.f7836l = abstractC0527o1.mo830q() + this.f7836l;
        }
    }

    @Override // p000.AbstractC0527o0
    /* JADX INFO: renamed from: s */
    public final void mo832s(int i) {
        m4932w(f7830o, i, null, 0);
    }

    /* JADX INFO: renamed from: t */
    public final void m4929t(AbstractC0527o0 abstractC0527o0) throws IOException {
        boolean z = this.f7837m;
        ArrayDeque arrayDeque = this.f7834j;
        boolean z2 = z && arrayDeque.isEmpty();
        if (abstractC0527o0 instanceof C0769uk) {
            C0769uk c0769uk = (C0769uk) abstractC0527o0;
            ArrayDeque arrayDeque2 = c0769uk.f7834j;
            while (!arrayDeque2.isEmpty()) {
                arrayDeque.add((AbstractC0527o0) arrayDeque2.remove());
            }
            this.f7836l += c0769uk.f7836l;
            c0769uk.f7836l = 0;
            c0769uk.close();
        } else {
            arrayDeque.add(abstractC0527o0);
            this.f7836l = abstractC0527o0.mo830q() + this.f7836l;
        }
        if (z2) {
            ((AbstractC0527o0) arrayDeque.peek()).mo824e();
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m4930u() throws IOException {
        boolean z = this.f7837m;
        ArrayDeque arrayDeque = this.f7834j;
        if (!z) {
            ((AbstractC0527o0) arrayDeque.remove()).close();
            return;
        }
        this.f7835k.add((AbstractC0527o0) arrayDeque.remove());
        AbstractC0527o0 abstractC0527o0 = (AbstractC0527o0) arrayDeque.peek();
        if (abstractC0527o0 != null) {
            abstractC0527o0.mo824e();
        }
    }

    /* JADX INFO: renamed from: v */
    public final int m4931v(InterfaceC0732tk interfaceC0732tk, int i, Object obj, int i2) throws IOException {
        m3608a(i);
        ArrayDeque arrayDeque = this.f7834j;
        if (!arrayDeque.isEmpty() && ((AbstractC0527o0) arrayDeque.peek()).mo830q() == 0) {
            m4930u();
        }
        while (i > 0 && !arrayDeque.isEmpty()) {
            AbstractC0527o0 abstractC0527o0 = (AbstractC0527o0) arrayDeque.peek();
            int iMin = Math.min(i, abstractC0527o0.mo830q());
            i2 = interfaceC0732tk.mo3521y(abstractC0527o0, iMin, obj, i2);
            i -= iMin;
            this.f7836l -= iMin;
            if (((AbstractC0527o0) arrayDeque.peek()).mo830q() == 0) {
                m4930u();
            }
        }
        if (i <= 0) {
            return i2;
        }
        throw new AssertionError("Failed executing read operation");
    }

    /* JADX INFO: renamed from: w */
    public final int m4932w(InterfaceC0695sk interfaceC0695sk, int i, Object obj, int i2) {
        try {
            return m4931v(interfaceC0695sk, i, obj, i2);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public C0769uk(int i) {
        new ArrayDeque(2);
        this.f7834j = new ArrayDeque(i);
    }
}
