package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class X {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0891z f12167b = new C0891z(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f12168a;

    public X(AbstractC0879q abstractC0879q) {
        K.a(abstractC0879q, "output");
        this.f12168a = abstractC0879q;
        abstractC0879q.f12261c = this;
    }

    public void a(AbstractC0867k abstractC0867k) {
        if (!abstractC0867k.E()) {
            if (!(abstractC0867k instanceof C0880q0)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + abstractC0867k.getClass());
            }
            C0880q0 c0880q0 = (C0880q0) abstractC0867k;
            a(c0880q0.f12264e);
            a(c0880q0.f12265f);
            return;
        }
        int iBinarySearch = Arrays.binarySearch(C0880q0.f12262z, abstractC0867k.size());
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        int iN = C0880q0.N(iBinarySearch + 1);
        ArrayDeque arrayDeque = (ArrayDeque) this.f12168a;
        if (arrayDeque.isEmpty() || ((AbstractC0867k) arrayDeque.peek()).size() >= iN) {
            arrayDeque.push(abstractC0867k);
            return;
        }
        int iN2 = C0880q0.N(iBinarySearch);
        AbstractC0867k c0880q1 = (AbstractC0867k) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((AbstractC0867k) arrayDeque.peek()).size() < iN2) {
            c0880q1 = new C0880q0((AbstractC0867k) arrayDeque.pop(), c0880q1);
        }
        C0880q0 c0880q2 = new C0880q0(c0880q1, abstractC0867k);
        while (!arrayDeque.isEmpty()) {
            int iBinarySearch2 = Arrays.binarySearch(C0880q0.f12262z, c0880q2.f12263d);
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((AbstractC0867k) arrayDeque.peek()).size() >= C0880q0.N(iBinarySearch2 + 1)) {
                break;
            } else {
                c0880q2 = new C0880q0((AbstractC0867k) arrayDeque.pop(), c0880q2);
            }
        }
        arrayDeque.push(c0880q2);
    }

    public void b(int i7, boolean z4) {
        ((AbstractC0879q) this.f12168a).w0(i7, z4);
    }

    public void c(int i7, AbstractC0867k abstractC0867k) {
        ((AbstractC0879q) this.f12168a).y0(i7, abstractC0867k);
    }

    public void d(int i7, double d7) {
        AbstractC0879q abstractC0879q = (AbstractC0879q) this.f12168a;
        abstractC0879q.getClass();
        abstractC0879q.C0(i7, Double.doubleToRawLongBits(d7));
    }

    public void e(int i7, int i8) {
        ((AbstractC0879q) this.f12168a).E0(i7, i8);
    }

    public void f(int i7, int i8) {
        ((AbstractC0879q) this.f12168a).A0(i7, i8);
    }

    public void g(int i7, long j) {
        ((AbstractC0879q) this.f12168a).C0(i7, j);
    }

    public void h(float f7, int i7) {
        AbstractC0879q abstractC0879q = (AbstractC0879q) this.f12168a;
        abstractC0879q.getClass();
        abstractC0879q.A0(i7, Float.floatToRawIntBits(f7));
    }

    public void i(int i7, Object obj, InterfaceC0881r0 interfaceC0881r0) {
        AbstractC0879q abstractC0879q = (AbstractC0879q) this.f12168a;
        abstractC0879q.K0(i7, 3);
        interfaceC0881r0.e((AbstractC0847a) obj, abstractC0879q.f12261c);
        abstractC0879q.K0(i7, 4);
    }

    public void j(int i7, int i8) {
        ((AbstractC0879q) this.f12168a).E0(i7, i8);
    }

    public void k(int i7, long j) {
        ((AbstractC0879q) this.f12168a).N0(i7, j);
    }

    public void l(int i7, Object obj, InterfaceC0881r0 interfaceC0881r0) {
        ((AbstractC0879q) this.f12168a).G0(i7, (AbstractC0847a) obj, interfaceC0881r0);
    }

    public void m(int i7, int i8) {
        ((AbstractC0879q) this.f12168a).A0(i7, i8);
    }

    public void n(int i7, long j) {
        ((AbstractC0879q) this.f12168a).C0(i7, j);
    }

    public void o(int i7, int i8) {
        ((AbstractC0879q) this.f12168a).L0(i7, (i8 >> 31) ^ (i8 << 1));
    }

    public void p(int i7, long j) {
        ((AbstractC0879q) this.f12168a).N0(i7, (j >> 63) ^ (j << 1));
    }

    public void q(int i7, int i8) {
        ((AbstractC0879q) this.f12168a).L0(i7, i8);
    }

    public void r(int i7, long j) {
        ((AbstractC0879q) this.f12168a).N0(i7, j);
    }

    public X(int i7) {
        InterfaceC0854d0 interfaceC0854d0;
        switch (i7) {
            case 2:
                this.f12168a = new ArrayDeque();
                break;
            default:
                try {
                    interfaceC0854d0 = (InterfaceC0854d0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    interfaceC0854d0 = f12167b;
                }
                InterfaceC0854d0[] interfaceC0854d0Arr = {C0891z.f12296b, interfaceC0854d0};
                W w7 = new W();
                w7.f12166a = interfaceC0854d0Arr;
                Charset charset = K.f12112a;
                this.f12168a = w7;
                break;
        }
    }
}
