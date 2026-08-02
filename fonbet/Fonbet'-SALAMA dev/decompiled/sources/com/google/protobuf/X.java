package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class X {

    /* renamed from: b, reason: collision with root package name */
    public static final C0935z f12167b = new C0935z(1);

    /* renamed from: a, reason: collision with root package name */
    public final Object f12168a;

    public X(AbstractC0923q abstractC0923q) {
        K.a(abstractC0923q, "output");
        this.f12168a = abstractC0923q;
        abstractC0923q.f12261c = this;
    }

    public void a(AbstractC0911k abstractC0911k) {
        if (!abstractC0911k.E()) {
            if (!(abstractC0911k instanceof C0924q0)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + abstractC0911k.getClass());
            }
            C0924q0 c0924q0 = (C0924q0) abstractC0911k;
            a(c0924q0.f12264e);
            a(c0924q0.f12265f);
            return;
        }
        int binarySearch = Arrays.binarySearch(C0924q0.f12262z, abstractC0911k.size());
        if (binarySearch < 0) {
            binarySearch = (-(binarySearch + 1)) - 1;
        }
        int N7 = C0924q0.N(binarySearch + 1);
        ArrayDeque arrayDeque = (ArrayDeque) this.f12168a;
        if (arrayDeque.isEmpty() || ((AbstractC0911k) arrayDeque.peek()).size() >= N7) {
            arrayDeque.push(abstractC0911k);
            return;
        }
        int N8 = C0924q0.N(binarySearch);
        AbstractC0911k abstractC0911k2 = (AbstractC0911k) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((AbstractC0911k) arrayDeque.peek()).size() < N8) {
            abstractC0911k2 = new C0924q0((AbstractC0911k) arrayDeque.pop(), abstractC0911k2);
        }
        C0924q0 c0924q02 = new C0924q0(abstractC0911k2, abstractC0911k);
        while (!arrayDeque.isEmpty()) {
            int binarySearch2 = Arrays.binarySearch(C0924q0.f12262z, c0924q02.f12263d);
            if (binarySearch2 < 0) {
                binarySearch2 = (-(binarySearch2 + 1)) - 1;
            }
            if (((AbstractC0911k) arrayDeque.peek()).size() >= C0924q0.N(binarySearch2 + 1)) {
                break;
            } else {
                c0924q02 = new C0924q0((AbstractC0911k) arrayDeque.pop(), c0924q02);
            }
        }
        arrayDeque.push(c0924q02);
    }

    public void b(int i7, boolean z4) {
        ((AbstractC0923q) this.f12168a).w0(i7, z4);
    }

    public void c(int i7, AbstractC0911k abstractC0911k) {
        ((AbstractC0923q) this.f12168a).y0(i7, abstractC0911k);
    }

    public void d(int i7, double d7) {
        AbstractC0923q abstractC0923q = (AbstractC0923q) this.f12168a;
        abstractC0923q.getClass();
        abstractC0923q.C0(i7, Double.doubleToRawLongBits(d7));
    }

    public void e(int i7, int i8) {
        ((AbstractC0923q) this.f12168a).E0(i7, i8);
    }

    public void f(int i7, int i8) {
        ((AbstractC0923q) this.f12168a).A0(i7, i8);
    }

    public void g(int i7, long j) {
        ((AbstractC0923q) this.f12168a).C0(i7, j);
    }

    public void h(float f7, int i7) {
        AbstractC0923q abstractC0923q = (AbstractC0923q) this.f12168a;
        abstractC0923q.getClass();
        abstractC0923q.A0(i7, Float.floatToRawIntBits(f7));
    }

    public void i(int i7, Object obj, InterfaceC0925r0 interfaceC0925r0) {
        AbstractC0923q abstractC0923q = (AbstractC0923q) this.f12168a;
        abstractC0923q.K0(i7, 3);
        interfaceC0925r0.e((AbstractC0891a) obj, abstractC0923q.f12261c);
        abstractC0923q.K0(i7, 4);
    }

    public void j(int i7, int i8) {
        ((AbstractC0923q) this.f12168a).E0(i7, i8);
    }

    public void k(int i7, long j) {
        ((AbstractC0923q) this.f12168a).N0(i7, j);
    }

    public void l(int i7, Object obj, InterfaceC0925r0 interfaceC0925r0) {
        ((AbstractC0923q) this.f12168a).G0(i7, (AbstractC0891a) obj, interfaceC0925r0);
    }

    public void m(int i7, int i8) {
        ((AbstractC0923q) this.f12168a).A0(i7, i8);
    }

    public void n(int i7, long j) {
        ((AbstractC0923q) this.f12168a).C0(i7, j);
    }

    public void o(int i7, int i8) {
        ((AbstractC0923q) this.f12168a).L0(i7, (i8 >> 31) ^ (i8 << 1));
    }

    public void p(int i7, long j) {
        ((AbstractC0923q) this.f12168a).N0(i7, (j >> 63) ^ (j << 1));
    }

    public void q(int i7, int i8) {
        ((AbstractC0923q) this.f12168a).L0(i7, i8);
    }

    public void r(int i7, long j) {
        ((AbstractC0923q) this.f12168a).N0(i7, j);
    }

    public X(int i7) {
        InterfaceC0898d0 interfaceC0898d0;
        switch (i7) {
            case 2:
                this.f12168a = new ArrayDeque();
                break;
            default:
                try {
                    interfaceC0898d0 = (InterfaceC0898d0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    interfaceC0898d0 = f12167b;
                }
                InterfaceC0898d0[] interfaceC0898d0Arr = {C0935z.f12296b, interfaceC0898d0};
                W w7 = new W();
                w7.f12166a = interfaceC0898d0Arr;
                Charset charset = K.f12112a;
                this.f12168a = w7;
                break;
        }
    }
}
