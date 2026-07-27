package com.google.android.gms.internal.play_billing;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.play_billing.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0204l0 extends AbstractC0181d1 {

    /* renamed from: b, reason: collision with root package name */
    public static final Unsafe f2767b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f2768c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f2769d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f2770e;
    public static final long f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f2771g;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e3) {
                throw new RuntimeException("Could not initialize intrinsics", e3.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new C0201k0());
        }
        try {
            f2769d = unsafe.objectFieldOffset(AbstractC0210n0.class.getDeclaredField("c"));
            f2768c = unsafe.objectFieldOffset(AbstractC0210n0.class.getDeclaredField("b"));
            f2770e = unsafe.objectFieldOffset(AbstractC0210n0.class.getDeclaredField("a"));
            f = unsafe.objectFieldOffset(C0207m0.class.getDeclaredField("a"));
            f2771g = unsafe.objectFieldOffset(C0207m0.class.getDeclaredField("b"));
            f2767b = unsafe;
        } catch (NoSuchFieldException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0181d1
    public final boolean D(AbstractC0210n0 abstractC0210n0, Object obj, Object obj2) {
        return AbstractC0219q0.a(f2767b, abstractC0210n0, f2770e, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0181d1
    public final boolean F(AbstractC0210n0 abstractC0210n0, C0207m0 c0207m0, C0207m0 c0207m02) {
        return AbstractC0219q0.a(f2767b, abstractC0210n0, f2769d, c0207m0, c0207m02);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0181d1
    public final C0186f0 d(AbstractC0210n0 abstractC0210n0) {
        C0186f0 c0186f0;
        C0186f0 c0186f02 = C0186f0.f2747d;
        do {
            c0186f0 = abstractC0210n0.f2783b;
            if (c0186f02 == c0186f0) {
                break;
            }
        } while (!z(abstractC0210n0, c0186f0, c0186f02));
        return c0186f0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0181d1
    public final C0207m0 o(AbstractC0210n0 abstractC0210n0) {
        C0207m0 c0207m0;
        C0207m0 c0207m02 = C0207m0.f2775c;
        do {
            c0207m0 = abstractC0210n0.f2784c;
            if (c0207m02 == c0207m0) {
                break;
            }
        } while (!F(abstractC0210n0, c0207m0, c0207m02));
        return c0207m0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0181d1
    public final void s(C0207m0 c0207m0, C0207m0 c0207m02) {
        f2767b.putObject(c0207m0, f2771g, c0207m02);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0181d1
    public final void u(C0207m0 c0207m0, Thread thread) {
        f2767b.putObject(c0207m0, f, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0181d1
    public final boolean z(AbstractC0210n0 abstractC0210n0, C0186f0 c0186f0, C0186f0 c0186f02) {
        return AbstractC0219q0.a(f2767b, abstractC0210n0, f2768c, c0186f0, c0186f02);
    }
}
