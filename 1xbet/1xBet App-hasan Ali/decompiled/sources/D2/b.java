package D2;

import L4.B;
import L4.C;
import android.graphics.Bitmap;
import i4.InterfaceC2015a;
import java.util.regex.Pattern;
import kotlin.jvm.internal.l;
import o0.C2202f;
import o4.AbstractC2227e;
import v.AbstractC2528x;
import v.w0;
import y4.C2675c;
import y4.m;
import y4.q;
import y4.z;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f927a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f928b;

    /* renamed from: c, reason: collision with root package name */
    public final long f929c;

    /* renamed from: d, reason: collision with root package name */
    public final long f930d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f931e;
    public final m f;

    public b(C c5) {
        W3.f fVar = W3.f.f6034k;
        final int i = 0;
        this.f927a = G4.d.D(fVar, new InterfaceC2015a(this) { // from class: D2.a

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ b f926l;

            {
                this.f926l = this;
            }

            @Override // i4.InterfaceC2015a
            public final Object invoke() {
                b bVar = this.f926l;
                switch (i) {
                    case 0:
                        C2675c c2675c = C2675c.f21303n;
                        return w0.d(bVar.f);
                    default:
                        String c6 = bVar.f.c("Content-Type");
                        if (c6 != null) {
                            Pattern pattern = q.f21370d;
                            try {
                                return AbstractC2528x.d(c6);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        return null;
                }
            }
        });
        final int i5 = 1;
        this.f928b = G4.d.D(fVar, new InterfaceC2015a(this) { // from class: D2.a

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ b f926l;

            {
                this.f926l = this;
            }

            @Override // i4.InterfaceC2015a
            public final Object invoke() {
                b bVar = this.f926l;
                switch (i5) {
                    case 0:
                        C2675c c2675c = C2675c.f21303n;
                        return w0.d(bVar.f);
                    default:
                        String c6 = bVar.f.c("Content-Type");
                        if (c6 != null) {
                            Pattern pattern = q.f21370d;
                            try {
                                return AbstractC2528x.d(c6);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        return null;
                }
            }
        });
        this.f929c = Long.parseLong(c5.r(Long.MAX_VALUE));
        this.f930d = Long.parseLong(c5.r(Long.MAX_VALUE));
        this.f931e = Integer.parseInt(c5.r(Long.MAX_VALUE)) > 0;
        int parseInt = Integer.parseInt(c5.r(Long.MAX_VALUE));
        C2202f c2202f = new C2202f(1);
        for (int i6 = 0; i6 < parseInt; i6++) {
            String r5 = c5.r(Long.MAX_VALUE);
            Bitmap.Config config = H2.e.f2284a;
            int F02 = AbstractC2227e.F0(r5, ':', 0, 6);
            if (F02 == -1) {
                throw new IllegalArgumentException("Unexpected header: ".concat(r5).toString());
            }
            String substring = r5.substring(0, F02);
            l.e("substring(...)", substring);
            String obj = AbstractC2227e.Q0(substring).toString();
            String substring2 = r5.substring(F02 + 1);
            l.e("substring(...)", substring2);
            c2202f.c(obj, substring2);
        }
        this.f = c2202f.d();
    }

    public final void a(B b3) {
        b3.y(this.f929c);
        b3.o(10);
        b3.y(this.f930d);
        b3.o(10);
        b3.y(this.f931e ? 1L : 0L);
        b3.o(10);
        m mVar = this.f;
        b3.y(mVar.size());
        b3.o(10);
        int size = mVar.size();
        for (int i = 0; i < size; i++) {
            b3.x(mVar.e(i));
            b3.x(": ");
            b3.x(mVar.g(i));
            b3.o(10);
        }
    }

    public b(z zVar) {
        W3.f fVar = W3.f.f6034k;
        final int i = 0;
        this.f927a = G4.d.D(fVar, new InterfaceC2015a(this) { // from class: D2.a

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ b f926l;

            {
                this.f926l = this;
            }

            @Override // i4.InterfaceC2015a
            public final Object invoke() {
                b bVar = this.f926l;
                switch (i) {
                    case 0:
                        C2675c c2675c = C2675c.f21303n;
                        return w0.d(bVar.f);
                    default:
                        String c6 = bVar.f.c("Content-Type");
                        if (c6 != null) {
                            Pattern pattern = q.f21370d;
                            try {
                                return AbstractC2528x.d(c6);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        return null;
                }
            }
        });
        final int i5 = 1;
        this.f928b = G4.d.D(fVar, new InterfaceC2015a(this) { // from class: D2.a

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ b f926l;

            {
                this.f926l = this;
            }

            @Override // i4.InterfaceC2015a
            public final Object invoke() {
                b bVar = this.f926l;
                switch (i5) {
                    case 0:
                        C2675c c2675c = C2675c.f21303n;
                        return w0.d(bVar.f);
                    default:
                        String c6 = bVar.f.c("Content-Type");
                        if (c6 != null) {
                            Pattern pattern = q.f21370d;
                            try {
                                return AbstractC2528x.d(c6);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        return null;
                }
            }
        });
        this.f929c = zVar.f21458u;
        this.f930d = zVar.f21459v;
        this.f931e = zVar.f21452o != null;
        this.f = zVar.f21453p;
    }
}
