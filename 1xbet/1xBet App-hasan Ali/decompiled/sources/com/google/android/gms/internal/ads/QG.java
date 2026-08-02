package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class QG extends AbstractC0715Xa {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f11199g = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final long f11200b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11201c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11202d;

    /* renamed from: e, reason: collision with root package name */
    public final Q3 f11203e;
    public final C1052h2 f;

    static {
        C0954ev c0954ev = AbstractC1044gv.f13676l;
        C1761wv c1761wv = C1761wv.f16184o;
        List list = Collections.EMPTY_LIST;
        C1761wv c1761wv2 = C1761wv.f16184o;
        C0918e3 c0918e3 = C0918e3.f13233a;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new C1859z2(uri, c1761wv2);
        }
        new C1184k1();
        P4 p42 = P4.f11040z;
    }

    public QG(long j5, long j6, boolean z3, Q3 q32, C1052h2 c1052h2) {
        this.f11200b = j5;
        this.f11201c = j6;
        this.f11202d = z3;
        q32.getClass();
        this.f11203e = q32;
        this.f = c1052h2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0715Xa
    public final int a(Object obj) {
        return f11199g.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0715Xa
    public final int b() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0715Xa
    public final int c() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0715Xa
    public final C1785xa d(int i, C1785xa c1785xa, boolean z3) {
        AbstractC1668us.n(i, 1);
        Object obj = z3 ? f11199g : null;
        C0832c6 c0832c6 = C0832c6.f12972b;
        c1785xa.b(null, obj, 0, this.f11200b, false);
        return c1785xa;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0715Xa
    public final C0603Ha e(int i, C0603Ha c0603Ha, long j5) {
        AbstractC1668us.n(i, 1);
        Object obj = C0603Ha.f9395m;
        c0603Ha.a(this.f11203e, this.f11202d, false, this.f, this.f11201c);
        return c0603Ha;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0715Xa
    public final Object f(int i) {
        AbstractC1668us.n(i, 1);
        return f11199g;
    }
}
