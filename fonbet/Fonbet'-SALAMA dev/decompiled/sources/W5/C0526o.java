package W5;

import U5.AbstractC0457y;
import e6.AbstractC1053b;
import e6.C1052a;
import e6.C1054c;
import java.io.InputStream;
import java.util.logging.Logger;
import n1.C1450e;

/* renamed from: W5.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0526o extends D {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7297c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.support.v4.media.session.t f7298d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7299e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0526o(android.support.v4.media.session.t tVar, U5.b0 b0Var) {
        super(((C0537s) tVar.f8078d).f7330f, 0);
        this.f7298d = tVar;
        this.f7299e = b0Var;
    }

    @Override // W5.D
    public final void c() {
        switch (this.f7297c) {
            case 0:
                android.support.v4.media.session.t tVar = this.f7298d;
                AbstractC1053b.c();
                try {
                    C1054c c1054c = ((C0537s) tVar.f8078d).f7326b;
                    AbstractC1053b.a();
                    AbstractC1053b.f12736a.getClass();
                    if (((U5.l0) tVar.f8077c) == null) {
                        try {
                            ((AbstractC0457y) tVar.f8076b).h((U5.b0) this.f7299e);
                        } catch (Throwable th) {
                            U5.l0 g3 = U5.l0.f6537f.f(th).g("Failed to read headers");
                            tVar.f8077c = g3;
                            ((C0537s) tVar.f8078d).j.f(g3);
                        }
                    }
                    AbstractC1053b.f12736a.getClass();
                    return;
                } catch (Throwable th2) {
                    try {
                        AbstractC1053b.f12736a.getClass();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            default:
                AbstractC1053b.c();
                try {
                    C1054c c1054c2 = ((C0537s) this.f7298d.f8078d).f7326b;
                    AbstractC1053b.a();
                    C1052a c1052a = AbstractC1053b.f12736a;
                    c1052a.getClass();
                    e();
                    c1052a.getClass();
                    return;
                } catch (Throwable th4) {
                    try {
                        AbstractC1053b.f12736a.getClass();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
        }
    }

    public void e() {
        android.support.v4.media.session.t tVar = this.f7298d;
        U5.l0 l0Var = (U5.l0) tVar.f8077c;
        C0537s c0537s = (C0537s) tVar.f8078d;
        C1450e c1450e = (C1450e) this.f7299e;
        if (l0Var != null) {
            Logger logger = AbstractC0494d0.f7163a;
            while (true) {
                InputStream w7 = c1450e.w();
                if (w7 == null) {
                    return;
                } else {
                    AbstractC0494d0.b(w7);
                }
            }
        } else {
            while (true) {
                try {
                    InputStream w8 = c1450e.w();
                    if (w8 == null) {
                        return;
                    }
                    try {
                        ((AbstractC0457y) tVar.f8076b).i(c0537s.f7325a.d(w8));
                        w8.close();
                    } catch (Throwable th) {
                        AbstractC0494d0.b(w8);
                        throw th;
                    }
                } catch (Throwable th2) {
                    Logger logger2 = AbstractC0494d0.f7163a;
                    while (true) {
                        InputStream w9 = c1450e.w();
                        if (w9 == null) {
                            U5.l0 g3 = U5.l0.f6537f.f(th2).g("Failed to read message.");
                            tVar.f8077c = g3;
                            c0537s.j.f(g3);
                            return;
                        }
                        AbstractC0494d0.b(w9);
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0526o(android.support.v4.media.session.t tVar, C1450e c1450e) {
        super(((C0537s) tVar.f8078d).f7330f, 0);
        this.f7298d = tVar;
        this.f7299e = c1450e;
    }
}
