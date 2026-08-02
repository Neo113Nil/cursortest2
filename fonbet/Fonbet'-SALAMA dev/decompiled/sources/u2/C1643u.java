package u2;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import v2.AbstractC1664a;

/* renamed from: u2.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1643u implements InterfaceC1636m {

    /* renamed from: A, reason: collision with root package name */
    public P f16842A;

    /* renamed from: B, reason: collision with root package name */
    public InterfaceC1636m f16843B;

    /* renamed from: a, reason: collision with root package name */
    public final Context f16844a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f16845b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1636m f16846c;

    /* renamed from: d, reason: collision with root package name */
    public z f16847d;

    /* renamed from: e, reason: collision with root package name */
    public C1626c f16848e;

    /* renamed from: f, reason: collision with root package name */
    public C1632i f16849f;

    /* renamed from: x, reason: collision with root package name */
    public InterfaceC1636m f16850x;

    /* renamed from: y, reason: collision with root package name */
    public W f16851y;

    /* renamed from: z, reason: collision with root package name */
    public C1634k f16852z;

    public C1643u(Context context, InterfaceC1636m interfaceC1636m) {
        this.f16844a = context.getApplicationContext();
        interfaceC1636m.getClass();
        this.f16846c = interfaceC1636m;
        this.f16845b = new ArrayList();
    }

    public static void e(InterfaceC1636m interfaceC1636m, U u4) {
        if (interfaceC1636m != null) {
            interfaceC1636m.x(u4);
        }
    }

    public final void b(InterfaceC1636m interfaceC1636m) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f16845b;
            if (i7 >= arrayList.size()) {
                return;
            }
            interfaceC1636m.x((U) arrayList.get(i7));
            i7++;
        }
    }

    @Override // u2.InterfaceC1636m
    public final void close() {
        InterfaceC1636m interfaceC1636m = this.f16843B;
        if (interfaceC1636m != null) {
            try {
                interfaceC1636m.close();
            } finally {
                this.f16843B = null;
            }
        }
    }

    @Override // u2.InterfaceC1636m
    public final Map k() {
        InterfaceC1636m interfaceC1636m = this.f16843B;
        return interfaceC1636m == null ? Collections.emptyMap() : interfaceC1636m.k();
    }

    @Override // u2.InterfaceC1636m
    public final long o(C1640q c1640q) {
        AbstractC1664a.h(this.f16843B == null);
        String scheme = c1640q.f16808a.getScheme();
        int i7 = v2.t.f17153a;
        Uri uri = c1640q.f16808a;
        String scheme2 = uri.getScheme();
        boolean isEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f16844a;
        if (isEmpty || "file".equals(scheme2)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f16847d == null) {
                    z zVar = new z(false);
                    this.f16847d = zVar;
                    b(zVar);
                }
                this.f16843B = this.f16847d;
            } else {
                if (this.f16848e == null) {
                    C1626c c1626c = new C1626c(context);
                    this.f16848e = c1626c;
                    b(c1626c);
                }
                this.f16843B = this.f16848e;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f16848e == null) {
                C1626c c1626c2 = new C1626c(context);
                this.f16848e = c1626c2;
                b(c1626c2);
            }
            this.f16843B = this.f16848e;
        } else if ("content".equals(scheme)) {
            if (this.f16849f == null) {
                C1632i c1632i = new C1632i(context);
                this.f16849f = c1632i;
                b(c1632i);
            }
            this.f16843B = this.f16849f;
        } else {
            boolean equals = "rtmp".equals(scheme);
            InterfaceC1636m interfaceC1636m = this.f16846c;
            if (equals) {
                if (this.f16850x == null) {
                    try {
                        InterfaceC1636m interfaceC1636m2 = (InterfaceC1636m) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.f16850x = interfaceC1636m2;
                        b(interfaceC1636m2);
                    } catch (ClassNotFoundException unused) {
                        Log.w("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e7) {
                        throw new RuntimeException("Error instantiating RTMP extension", e7);
                    }
                    if (this.f16850x == null) {
                        this.f16850x = interfaceC1636m;
                    }
                }
                this.f16843B = this.f16850x;
            } else if ("udp".equals(scheme)) {
                if (this.f16851y == null) {
                    W w7 = new W();
                    this.f16851y = w7;
                    b(w7);
                }
                this.f16843B = this.f16851y;
            } else if ("data".equals(scheme)) {
                if (this.f16852z == null) {
                    C1634k c1634k = new C1634k(false);
                    this.f16852z = c1634k;
                    b(c1634k);
                }
                this.f16843B = this.f16852z;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f16842A == null) {
                    P p5 = new P(context);
                    this.f16842A = p5;
                    b(p5);
                }
                this.f16843B = this.f16842A;
            } else {
                this.f16843B = interfaceC1636m;
            }
        }
        return this.f16843B.o(c1640q);
    }

    @Override // u2.InterfaceC1633j
    public final int read(byte[] bArr, int i7, int i8) {
        InterfaceC1636m interfaceC1636m = this.f16843B;
        interfaceC1636m.getClass();
        return interfaceC1636m.read(bArr, i7, i8);
    }

    @Override // u2.InterfaceC1636m
    public final Uri t() {
        InterfaceC1636m interfaceC1636m = this.f16843B;
        if (interfaceC1636m == null) {
            return null;
        }
        return interfaceC1636m.t();
    }

    @Override // u2.InterfaceC1636m
    public final void x(U u4) {
        u4.getClass();
        this.f16846c.x(u4);
        this.f16845b.add(u4);
        e(this.f16847d, u4);
        e(this.f16848e, u4);
        e(this.f16849f, u4);
        e(this.f16850x, u4);
        e(this.f16851y, u4);
        e(this.f16852z, u4);
        e(this.f16842A, u4);
    }
}
