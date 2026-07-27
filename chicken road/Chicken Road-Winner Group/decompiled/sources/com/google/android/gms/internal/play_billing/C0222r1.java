package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.play_billing.r1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0222r1 implements InterfaceC0231u1 {

    /* renamed from: b, reason: collision with root package name */
    public static final C0184e1 f2806b = new C0184e1(3);

    /* renamed from: a, reason: collision with root package name */
    public final Object f2807a;

    public C0222r1(InterfaceC0231u1... interfaceC0231u1Arr) {
        this.f2807a = interfaceC0231u1Arr;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC0231u1
    public C1 a(Class cls) {
        for (int i3 = 0; i3 < 2; i3++) {
            InterfaceC0231u1 interfaceC0231u1 = ((InterfaceC0231u1[]) this.f2807a)[i3];
            if (interfaceC0231u1.b(cls)) {
                return interfaceC0231u1.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC0231u1
    public boolean b(Class cls) {
        for (int i3 = 0; i3 < 2; i3++) {
            if (((InterfaceC0231u1[]) this.f2807a)[i3].b(cls)) {
                return true;
            }
        }
        return false;
    }

    public void c(int i3, Object obj, D1 d12) {
        Z0 z02 = (Z0) this.f2807a;
        z02.X(i3, 3);
        d12.h((S0) obj, z02.f2719b);
        z02.X(i3, 4);
    }

    public void d(int i3, Object obj, D1 d12) {
        S0 s02 = (S0) obj;
        Z0 z02 = (Z0) this.f2807a;
        z02.Z((i3 << 3) | 2);
        z02.Z(s02.a(d12));
        d12.h(s02, z02.f2719b);
    }

    public C0222r1() {
        A1 a12 = A1.f2595c;
        C0222r1 c0222r1 = new C0222r1(C0184e1.f2745b, f2806b);
        Charset charset = AbstractC0205l1.f2772a;
        this.f2807a = c0222r1;
    }

    public C0222r1(Z0 z02) {
        Charset charset = AbstractC0205l1.f2772a;
        this.f2807a = z02;
        z02.f2719b = this;
    }
}
