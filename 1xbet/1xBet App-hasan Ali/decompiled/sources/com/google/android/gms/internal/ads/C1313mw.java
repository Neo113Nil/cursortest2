package com.google.android.gms.internal.ads;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.ads.mw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1313mw extends AbstractC0952et {

    /* renamed from: m, reason: collision with root package name */
    public static final Unsafe f14547m;

    /* renamed from: n, reason: collision with root package name */
    public static final long f14548n;

    /* renamed from: o, reason: collision with root package name */
    public static final long f14549o;

    /* renamed from: p, reason: collision with root package name */
    public static final long f14550p;

    /* renamed from: q, reason: collision with root package name */
    public static final long f14551q;

    /* renamed from: r, reason: collision with root package name */
    public static final long f14552r;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e3) {
                throw new RuntimeException("Could not initialize intrinsics", e3.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new C1268lw());
        }
        try {
            f14549o = unsafe.objectFieldOffset(AbstractC1403ow.class.getDeclaredField("m"));
            f14548n = unsafe.objectFieldOffset(AbstractC1403ow.class.getDeclaredField("l"));
            f14550p = unsafe.objectFieldOffset(AbstractC1403ow.class.getDeclaredField("k"));
            f14551q = unsafe.objectFieldOffset(C1358nw.class.getDeclaredField("a"));
            f14552r = unsafe.objectFieldOffset(C1358nw.class.getDeclaredField("b"));
            f14547m = unsafe;
        } catch (NoSuchFieldException e5) {
            throw new RuntimeException(e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0952et
    public final C1358nw C(AbstractC1403ow abstractC1403ow) {
        C1358nw c1358nw;
        C1358nw c1358nw2 = C1358nw.f14731c;
        do {
            c1358nw = abstractC1403ow.f14876m;
            if (c1358nw2 == c1358nw) {
                break;
            }
        } while (!d0(abstractC1403ow, c1358nw, c1358nw2));
        return c1358nw;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0952et
    public final void N(C1358nw c1358nw, C1358nw c1358nw2) {
        f14547m.putObject(c1358nw, f14552r, c1358nw2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0952et
    public final void S(C1358nw c1358nw, Thread thread) {
        f14547m.putObject(c1358nw, f14551q, thread);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0952et
    public final boolean Y(AbstractC1403ow abstractC1403ow, C1000fw c1000fw, C1000fw c1000fw2) {
        return AbstractC1493qw.a(f14547m, abstractC1403ow, f14548n, c1000fw, c1000fw2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0952et
    public final boolean b0(AbstractC1403ow abstractC1403ow, Object obj, Object obj2) {
        return AbstractC1493qw.a(f14547m, abstractC1403ow, f14550p, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0952et
    public final boolean d0(AbstractC1403ow abstractC1403ow, C1358nw c1358nw, C1358nw c1358nw2) {
        return AbstractC1493qw.a(f14547m, abstractC1403ow, f14549o, c1358nw, c1358nw2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0952et
    public final C1000fw h(AbstractC1403ow abstractC1403ow) {
        C1000fw c1000fw;
        C1000fw c1000fw2 = C1000fw.f13528d;
        do {
            c1000fw = abstractC1403ow.f14875l;
            if (c1000fw2 == c1000fw) {
                break;
            }
        } while (!Y(abstractC1403ow, c1000fw, c1000fw2));
        return c1000fw;
    }
}
