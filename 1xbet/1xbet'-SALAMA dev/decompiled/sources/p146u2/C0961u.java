package p146u2;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import p151v2.a;
import p151v2.t;

/* JADX INFO: renamed from: u2.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0961u implements InterfaceC0954m {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public P f16848A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public InterfaceC0954m f16849B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f16851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC0954m f16852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z f16853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0944c f16854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0950i f16855f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public InterfaceC0954m f16856x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public W f16857y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C0952k f16858z;

    public C0961u(Context context, InterfaceC0954m interfaceC0954m) {
        this.f16850a = context.getApplicationContext();
        interfaceC0954m.getClass();
        this.f16852c = interfaceC0954m;
        this.f16851b = new ArrayList();
    }

    public static void e(InterfaceC0954m interfaceC0954m, U u4) {
        if (interfaceC0954m != null) {
            interfaceC0954m.x(u4);
        }
    }

    public final void b(InterfaceC0954m interfaceC0954m) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f16851b;
            if (i7 >= arrayList.size()) {
                return;
            }
            interfaceC0954m.x((U) arrayList.get(i7));
            i7++;
        }
    }

    @Override // p146u2.InterfaceC0954m
    public final void close() {
        InterfaceC0954m interfaceC0954m = this.f16849B;
        if (interfaceC0954m != null) {
            try {
                interfaceC0954m.close();
            } finally {
                this.f16849B = null;
            }
        }
    }

    @Override // p146u2.InterfaceC0954m
    public final Map k() {
        InterfaceC0954m interfaceC0954m = this.f16849B;
        return interfaceC0954m == null ? Collections.emptyMap() : interfaceC0954m.k();
    }

    @Override // p146u2.InterfaceC0954m
    public final long o(C0958q c0958q) {
        a.h(this.f16849B == null);
        String scheme = c0958q.f16814a.getScheme();
        int i7 = t.f17159a;
        Uri uri = c0958q.f16814a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f16850a;
        if (zIsEmpty || "file".equals(scheme2)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f16853d == null) {
                    z zVar = new z(false);
                    this.f16853d = zVar;
                    b(zVar);
                }
                this.f16849B = this.f16853d;
            } else {
                if (this.f16854e == null) {
                    C0944c c0944c = new C0944c(context);
                    this.f16854e = c0944c;
                    b(c0944c);
                }
                this.f16849B = this.f16854e;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f16854e == null) {
                C0944c c0944c2 = new C0944c(context);
                this.f16854e = c0944c2;
                b(c0944c2);
            }
            this.f16849B = this.f16854e;
        } else if ("content".equals(scheme)) {
            if (this.f16855f == null) {
                C0950i c0950i = new C0950i(context);
                this.f16855f = c0950i;
                b(c0950i);
            }
            this.f16849B = this.f16855f;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            InterfaceC0954m interfaceC0954m = this.f16852c;
            if (zEquals) {
                if (this.f16856x == null) {
                    try {
                        InterfaceC0954m interfaceC0954m2 = (InterfaceC0954m) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.f16856x = interfaceC0954m2;
                        b(interfaceC0954m2);
                    } catch (ClassNotFoundException unused) {
                        Log.w("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e7) {
                        throw new RuntimeException("Error instantiating RTMP extension", e7);
                    }
                    if (this.f16856x == null) {
                        this.f16856x = interfaceC0954m;
                    }
                }
                this.f16849B = this.f16856x;
            } else if ("udp".equals(scheme)) {
                if (this.f16857y == null) {
                    W w7 = new W();
                    this.f16857y = w7;
                    b(w7);
                }
                this.f16849B = this.f16857y;
            } else if ("data".equals(scheme)) {
                if (this.f16858z == null) {
                    C0952k c0952k = new C0952k(false);
                    this.f16858z = c0952k;
                    b(c0952k);
                }
                this.f16849B = this.f16858z;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f16848A == null) {
                    P p5 = new P(context);
                    this.f16848A = p5;
                    b(p5);
                }
                this.f16849B = this.f16848A;
            } else {
                this.f16849B = interfaceC0954m;
            }
        }
        return this.f16849B.o(c0958q);
    }

    @Override // p146u2.InterfaceC0951j
    public final int read(byte[] bArr, int i7, int i8) {
        InterfaceC0954m interfaceC0954m = this.f16849B;
        interfaceC0954m.getClass();
        return interfaceC0954m.read(bArr, i7, i8);
    }

    @Override // p146u2.InterfaceC0954m
    public final Uri t() {
        InterfaceC0954m interfaceC0954m = this.f16849B;
        if (interfaceC0954m == null) {
            return null;
        }
        return interfaceC0954m.t();
    }

    @Override // p146u2.InterfaceC0954m
    public final void x(U u4) {
        u4.getClass();
        this.f16852c.x(u4);
        this.f16851b.add(u4);
        e(this.f16853d, u4);
        e(this.f16854e, u4);
        e(this.f16855f, u4);
        e(this.f16856x, u4);
        e(this.f16857y, u4);
        e(this.f16858z, u4);
        e(this.f16848A, u4);
    }
}
