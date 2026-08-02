package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.xx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1808xx implements InterfaceC1402ov {

    /* renamed from: k, reason: collision with root package name */
    public final Context f16353k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f16354l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final Dy f16355m;

    /* renamed from: n, reason: collision with root package name */
    public C0958ez f16356n;

    /* renamed from: o, reason: collision with root package name */
    public Ht f16357o;

    /* renamed from: p, reason: collision with root package name */
    public C1670uu f16358p;

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC1402ov f16359q;

    /* renamed from: r, reason: collision with root package name */
    public C1689vC f16360r;

    /* renamed from: s, reason: collision with root package name */
    public Ju f16361s;

    /* renamed from: t, reason: collision with root package name */
    public C1670uu f16362t;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC1402ov f16363u;

    public C1808xx(Context context, Dy dy) {
        this.f16353k = context.getApplicationContext();
        this.f16355m = dy;
    }

    public static final void g(InterfaceC1402ov interfaceC1402ov, RB rb) {
        if (interfaceC1402ov != null) {
            interfaceC1402ov.d(rb);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    public final long a(Ww ww) {
        AbstractC1668us.a0(this.f16363u == null);
        String scheme = ww.f12125a.getScheme();
        int i = AbstractC1260lo.f14419a;
        Uri uri = ww.f12125a;
        String scheme2 = uri.getScheme();
        boolean isEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f16353k;
        if (isEmpty || "file".equals(scheme2)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f16356n == null) {
                    C0958ez c0958ez = new C0958ez(false);
                    this.f16356n = c0958ez;
                    f(c0958ez);
                }
                this.f16363u = this.f16356n;
            } else {
                if (this.f16357o == null) {
                    Ht ht = new Ht(context);
                    this.f16357o = ht;
                    f(ht);
                }
                this.f16363u = this.f16357o;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f16357o == null) {
                Ht ht2 = new Ht(context);
                this.f16357o = ht2;
                f(ht2);
            }
            this.f16363u = this.f16357o;
        } else if ("content".equals(scheme)) {
            if (this.f16358p == null) {
                C1670uu c1670uu = new C1670uu(context, 0);
                this.f16358p = c1670uu;
                f(c1670uu);
            }
            this.f16363u = this.f16358p;
        } else {
            boolean equals = "rtmp".equals(scheme);
            Dy dy = this.f16355m;
            if (equals) {
                if (this.f16359q == null) {
                    try {
                        InterfaceC1402ov interfaceC1402ov = (InterfaceC1402ov) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.f16359q = interfaceC1402ov;
                        f(interfaceC1402ov);
                    } catch (ClassNotFoundException unused) {
                        JB.l("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e3) {
                        throw new RuntimeException("Error instantiating RTMP extension", e3);
                    }
                    if (this.f16359q == null) {
                        this.f16359q = dy;
                    }
                }
                this.f16363u = this.f16359q;
            } else if ("udp".equals(scheme)) {
                if (this.f16360r == null) {
                    C1689vC c1689vC = new C1689vC();
                    this.f16360r = c1689vC;
                    f(c1689vC);
                }
                this.f16363u = this.f16360r;
            } else if ("data".equals(scheme)) {
                if (this.f16361s == null) {
                    Ju ju = new Ju(false);
                    this.f16361s = ju;
                    f(ju);
                }
                this.f16363u = this.f16361s;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f16362t == null) {
                    C1670uu c1670uu2 = new C1670uu(context, 1);
                    this.f16362t = c1670uu2;
                    f(c1670uu2);
                }
                this.f16363u = this.f16362t;
            } else {
                this.f16363u = dy;
            }
        }
        return this.f16363u.a(ww);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    public final Map b() {
        InterfaceC1402ov interfaceC1402ov = this.f16363u;
        return interfaceC1402ov == null ? Collections.EMPTY_MAP : interfaceC1402ov.b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    public final void d(RB rb) {
        rb.getClass();
        this.f16355m.d(rb);
        this.f16354l.add(rb);
        g(this.f16356n, rb);
        g(this.f16357o, rb);
        g(this.f16358p, rb);
        g(this.f16359q, rb);
        g(this.f16360r, rb);
        g(this.f16361s, rb);
        g(this.f16362t, rb);
    }

    @Override // com.google.android.gms.internal.ads.DE
    public final int e(byte[] bArr, int i, int i5) {
        InterfaceC1402ov interfaceC1402ov = this.f16363u;
        interfaceC1402ov.getClass();
        return interfaceC1402ov.e(bArr, i, i5);
    }

    public final void f(InterfaceC1402ov interfaceC1402ov) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f16354l;
            if (i >= arrayList.size()) {
                return;
            }
            interfaceC1402ov.d((RB) arrayList.get(i));
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    public final Uri i() {
        InterfaceC1402ov interfaceC1402ov = this.f16363u;
        if (interfaceC1402ov == null) {
            return null;
        }
        return interfaceC1402ov.i();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    public final void j() {
        InterfaceC1402ov interfaceC1402ov = this.f16363u;
        if (interfaceC1402ov != null) {
            try {
                interfaceC1402ov.j();
            } finally {
                this.f16363u = null;
            }
        }
    }
}
