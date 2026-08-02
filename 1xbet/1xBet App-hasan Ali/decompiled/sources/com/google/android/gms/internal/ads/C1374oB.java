package com.google.android.gms.internal.ads;

import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.oB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1374oB implements InterfaceC1269lx {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f14777e = {0};

    /* renamed from: a, reason: collision with root package name */
    public final Iz f14778a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14779b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f14780c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f14781d;

    public C1374oB(C1496qz c1496qz) {
        this.f14778a = new C1284mB(((C1419pB) c1496qz.f15193m.f8377l).b());
        C1630tz c1630tz = c1496qz.f15192l;
        this.f14779b = c1630tz.f15744b;
        this.f14780c = c1496qz.f15194n.b();
        if (c1630tz.f15745c.equals(C1091hx.f13819A)) {
            this.f14781d = Arrays.copyOf(f14777e, 1);
        } else {
            this.f14781d = new byte[0];
        }
    }

    public C1374oB(C1720vz c1720vz) {
        C1900zz c1900zz = c1720vz.f16069l;
        String valueOf = String.valueOf(c1900zz.f16801d);
        this.f14778a = new C0901dm("HMAC".concat(valueOf), new SecretKeySpec(((C1419pB) c1720vz.f16070m.f8377l).b(), "HMAC"));
        this.f14779b = c1900zz.f16799b;
        this.f14780c = c1720vz.f16071n.b();
        if (c1900zz.f16800c.equals(C1855yz.f16516d)) {
            this.f14781d = Arrays.copyOf(f14777e, 1);
        } else {
            this.f14781d = new byte[0];
        }
    }

    public C1374oB(C0901dm c0901dm, int i) {
        this.f14778a = c0901dm;
        this.f14779b = i;
        this.f14780c = new byte[0];
        this.f14781d = new byte[0];
        c0901dm.a(i, new byte[0]);
    }
}
