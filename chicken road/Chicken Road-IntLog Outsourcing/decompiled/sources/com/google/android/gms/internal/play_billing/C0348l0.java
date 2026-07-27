package com.google.android.gms.internal.play_billing;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.play_billing.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0348l0 extends AbstractC0325d1 {

    /* renamed from: b, reason: collision with root package name */
    public static final Unsafe f5199b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f5200c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f5201d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f5202e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f5203f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f5204g;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e3) {
                throw new RuntimeException("Could not initialize intrinsics", e3.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new C0345k0());
        }
        try {
            f5201d = unsafe.objectFieldOffset(AbstractC0354n0.class.getDeclaredField("c"));
            f5200c = unsafe.objectFieldOffset(AbstractC0354n0.class.getDeclaredField("b"));
            f5202e = unsafe.objectFieldOffset(AbstractC0354n0.class.getDeclaredField("a"));
            f5203f = unsafe.objectFieldOffset(C0351m0.class.getDeclaredField("a"));
            f5204g = unsafe.objectFieldOffset(C0351m0.class.getDeclaredField("b"));
            f5199b = unsafe;
        } catch (NoSuchFieldException e6) {
            throw new RuntimeException(e6);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0325d1
    public final void B(C0351m0 c0351m0, Thread thread) {
        f5199b.putObject(c0351m0, f5203f, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0325d1
    public final boolean H(AbstractC0354n0 abstractC0354n0, C0330f0 c0330f0, C0330f0 c0330f02) {
        return AbstractC0363q0.a(f5199b, abstractC0354n0, f5200c, c0330f0, c0330f02);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0325d1
    public final boolean L(AbstractC0354n0 abstractC0354n0, Object obj, Object obj2) {
        return AbstractC0363q0.a(f5199b, abstractC0354n0, f5202e, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0325d1
    public final boolean N(AbstractC0354n0 abstractC0354n0, C0351m0 c0351m0, C0351m0 c0351m02) {
        return AbstractC0363q0.a(f5199b, abstractC0354n0, f5201d, c0351m0, c0351m02);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0325d1
    public final C0330f0 e(AbstractC0354n0 abstractC0354n0) {
        C0330f0 c0330f0;
        C0330f0 c0330f02 = C0330f0.f5178d;
        do {
            c0330f0 = abstractC0354n0.f5217b;
            if (c0330f02 == c0330f0) {
                break;
            }
        } while (!H(abstractC0354n0, c0330f0, c0330f02));
        return c0330f0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0325d1
    public final C0351m0 r(AbstractC0354n0 abstractC0354n0) {
        C0351m0 c0351m0;
        C0351m0 c0351m02 = C0351m0.f5208c;
        do {
            c0351m0 = abstractC0354n0.f5218c;
            if (c0351m02 == c0351m0) {
                break;
            }
        } while (!N(abstractC0354n0, c0351m0, c0351m02));
        return c0351m0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0325d1
    public final void z(C0351m0 c0351m0, C0351m0 c0351m02) {
        f5199b.putObject(c0351m0, f5204g, c0351m02);
    }
}
