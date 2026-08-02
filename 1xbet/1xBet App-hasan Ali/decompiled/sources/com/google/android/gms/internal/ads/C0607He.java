package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.He, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0607He {

    /* renamed from: a, reason: collision with root package name */
    public final C1761wv f9411a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f9412b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f9413c = new ByteBuffer[0];

    /* renamed from: d, reason: collision with root package name */
    public boolean f9414d;

    public C0607He(C1761wv c1761wv) {
        this.f9411a = c1761wv;
        C0684Se c0684Se = C0684Se.f11554e;
        this.f9414d = false;
    }

    public final C0684Se a(C0684Se c0684Se) {
        if (c0684Se.equals(C0684Se.f11554e)) {
            throw new C0938ef(c0684Se);
        }
        int i = 0;
        while (true) {
            C1761wv c1761wv = this.f9411a;
            if (i >= c1761wv.f16186n) {
                return c0684Se;
            }
            InterfaceC1431pf interfaceC1431pf = (InterfaceC1431pf) c1761wv.get(i);
            C0684Se a5 = interfaceC1431pf.a(c0684Se);
            if (interfaceC1431pf.f()) {
                AbstractC1668us.a0(!a5.equals(C0684Se.f11554e));
                c0684Se = a5;
            }
            i++;
        }
    }

    public final void b() {
        ArrayList arrayList = this.f9412b;
        arrayList.clear();
        this.f9414d = false;
        int i = 0;
        while (true) {
            C1761wv c1761wv = this.f9411a;
            if (i >= c1761wv.f16186n) {
                break;
            }
            InterfaceC1431pf interfaceC1431pf = (InterfaceC1431pf) c1761wv.get(i);
            interfaceC1431pf.i();
            if (interfaceC1431pf.f()) {
                arrayList.add(interfaceC1431pf);
            }
            i++;
        }
        this.f9413c = new ByteBuffer[arrayList.size()];
        for (int i5 = 0; i5 <= e(); i5++) {
            this.f9413c[i5] = ((InterfaceC1431pf) arrayList.get(i5)).d();
        }
    }

    public final boolean c() {
        return this.f9414d && ((InterfaceC1431pf) this.f9412b.get(e())).g() && !this.f9413c[e()].hasRemaining();
    }

    public final boolean d() {
        return !this.f9412b.isEmpty();
    }

    public final int e() {
        return this.f9413c.length - 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0607He) {
            C0607He c0607He = (C0607He) obj;
            C1761wv c1761wv = this.f9411a;
            if (c1761wv.f16186n == c0607He.f9411a.f16186n) {
                for (int i = 0; i < c1761wv.f16186n; i++) {
                    if (c1761wv.get(i) == c0607He.f9411a.get(i)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(ByteBuffer byteBuffer) {
        boolean z3;
        do {
            int i = 0;
            z3 = false;
            while (i <= e()) {
                if (!this.f9413c[i].hasRemaining()) {
                    ArrayList arrayList = this.f9412b;
                    InterfaceC1431pf interfaceC1431pf = (InterfaceC1431pf) arrayList.get(i);
                    if (!interfaceC1431pf.g()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.f9413c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : InterfaceC1431pf.f15014a;
                        long remaining = byteBuffer2.remaining();
                        interfaceC1431pf.b(byteBuffer2);
                        this.f9413c[i] = interfaceC1431pf.d();
                        boolean z5 = true;
                        if (remaining - byteBuffer2.remaining() <= 0 && !this.f9413c[i].hasRemaining()) {
                            z5 = false;
                        }
                        z3 |= z5;
                    } else if (!this.f9413c[i].hasRemaining() && i < e()) {
                        ((InterfaceC1431pf) arrayList.get(i + 1)).j();
                    }
                }
                i++;
            }
        } while (z3);
    }

    public final int hashCode() {
        return this.f9411a.hashCode();
    }
}
