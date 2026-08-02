package p000;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: f0 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0194f0 extends kd0 {

    /* JADX INFO: renamed from: e */
    public static final Unsafe f2214e;

    /* JADX INFO: renamed from: f */
    public static final long f2215f;

    /* JADX INFO: renamed from: g */
    public static final long f2216g;

    /* JADX INFO: renamed from: h */
    public static final long f2217h;

    /* JADX INFO: renamed from: i */
    public static final long f2218i;

    /* JADX INFO: renamed from: j */
    public static final long f2219j;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e) {
                C0270h1.m2189e("Could not initialize intrinsics", e.getCause());
                return;
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new C0157e0());
        }
        try {
            f2216g = unsafe.objectFieldOffset(AbstractC0269h0.class.getDeclaredField("l"));
            f2215f = unsafe.objectFieldOffset(AbstractC0269h0.class.getDeclaredField("k"));
            f2217h = unsafe.objectFieldOffset(AbstractC0269h0.class.getDeclaredField("j"));
            f2218i = unsafe.objectFieldOffset(C0231g0.class.getDeclaredField("a"));
            f2219j = unsafe.objectFieldOffset(C0231g0.class.getDeclaredField("b"));
            f2214e = unsafe;
        } catch (NoSuchFieldException e2) {
            dd0.m1163h(e2);
        } catch (RuntimeException e3) {
            throw e3;
        }
    }

    @Override // p000.kd0
    /* JADX INFO: renamed from: c */
    public final boolean mo1540c(AbstractC0269h0 abstractC0269h0, C0785v c0785v, C0785v c0785v2) {
        return AbstractC0081c0.m823a(f2214e, abstractC0269h0, f2215f, c0785v, c0785v2);
    }

    @Override // p000.kd0
    /* JADX INFO: renamed from: d */
    public final boolean mo1541d(AbstractC0269h0 abstractC0269h0, Object obj, Object obj2) {
        return AbstractC0121d0.m1070a(f2214e, abstractC0269h0, f2217h, obj, obj2);
    }

    @Override // p000.kd0
    /* JADX INFO: renamed from: e */
    public final boolean mo1542e(AbstractC0269h0 abstractC0269h0, C0231g0 c0231g0, C0231g0 c0231g1) {
        return AbstractC0045b0.m546a(f2214e, abstractC0269h0, f2216g, c0231g0, c0231g1);
    }

    @Override // p000.kd0
    /* JADX INFO: renamed from: g */
    public final C0785v mo1543g(AbstractC0269h0 abstractC0269h0) {
        C0785v c0785v;
        C0785v c0785v2 = C0785v.f7972d;
        do {
            c0785v = abstractC0269h0.f2978k;
            if (c0785v2 == c0785v) {
                break;
            }
        } while (!mo1540c(abstractC0269h0, c0785v, c0785v2));
        return c0785v;
    }

    @Override // p000.kd0
    /* JADX INFO: renamed from: h */
    public final C0231g0 mo1544h(AbstractC0269h0 abstractC0269h0) {
        C0231g0 c0231g0;
        C0231g0 c0231g1 = C0231g0.f2566c;
        do {
            c0231g0 = abstractC0269h0.f2979l;
            if (c0231g1 == c0231g0) {
                break;
            }
        } while (!mo1542e(abstractC0269h0, c0231g0, c0231g1));
        return c0231g0;
    }

    @Override // p000.kd0
    /* JADX INFO: renamed from: k */
    public final void mo1545k(C0231g0 c0231g0, C0231g0 c0231g1) {
        f2214e.putObject(c0231g0, f2219j, c0231g1);
    }

    @Override // p000.kd0
    /* JADX INFO: renamed from: l */
    public final void mo1546l(C0231g0 c0231g0, Thread thread) {
        f2214e.putObject(c0231g0, f2218i, thread);
    }
}
