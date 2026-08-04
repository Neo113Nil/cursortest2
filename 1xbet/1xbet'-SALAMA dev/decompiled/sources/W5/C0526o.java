package W5;

import U5.AbstractC0457y;
import java.io.InputStream;
import java.util.logging.Logger;

/* JADX INFO: renamed from: W5.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0526o extends D {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7297c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.support.v4.media.session.t f7298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
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
                p036e6.b.c();
                try {
                    p036e6.c cVar = ((C0537s) tVar.f8078d).f7326b;
                    p036e6.b.a();
                    p036e6.b.f12742a.getClass();
                    if (((U5.l0) tVar.f8077c) == null) {
                        try {
                            ((AbstractC0457y) tVar.f8076b).h((U5.b0) this.f7299e);
                        } catch (Throwable th) {
                            U5.l0 l0VarG = U5.l0.f6537f.f(th).g("Failed to read headers");
                            tVar.f8077c = l0VarG;
                            ((C0537s) tVar.f8078d).j.f(l0VarG);
                        }
                        break;
                    }
                    p036e6.b.f12742a.getClass();
                    return;
                } catch (Throwable th2) {
                    try {
                        p036e6.b.f12742a.getClass();
                        break;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            default:
                p036e6.b.c();
                try {
                    p036e6.c cVar2 = ((C0537s) this.f7298d.f8078d).f7326b;
                    p036e6.b.a();
                    p036e6.a aVar = p036e6.b.f12742a;
                    aVar.getClass();
                    e();
                    aVar.getClass();
                    return;
                } catch (Throwable th4) {
                    try {
                        p036e6.b.f12742a.getClass();
                        break;
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
        p096n1.e eVar = (p096n1.e) this.f7299e;
        if (l0Var != null) {
            Logger logger = AbstractC0494d0.f7163a;
            while (true) {
                InputStream inputStreamW = eVar.w();
                if (inputStreamW == null) {
                    return;
                } else {
                    AbstractC0494d0.b(inputStreamW);
                }
            }
        } else {
            while (true) {
                try {
                    InputStream inputStreamW2 = eVar.w();
                    if (inputStreamW2 == null) {
                        return;
                    }
                    try {
                        ((AbstractC0457y) tVar.f8076b).i(c0537s.f7325a.d(inputStreamW2));
                        inputStreamW2.close();
                    } catch (Throwable th) {
                        AbstractC0494d0.b(inputStreamW2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    Logger logger2 = AbstractC0494d0.f7163a;
                    while (true) {
                        InputStream inputStreamW3 = eVar.w();
                        if (inputStreamW3 == null) {
                            U5.l0 l0VarG = U5.l0.f6537f.f(th2).g("Failed to read message.");
                            tVar.f8077c = l0VarG;
                            c0537s.j.f(l0VarG);
                            return;
                        }
                        AbstractC0494d0.b(inputStreamW3);
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0526o(android.support.v4.media.session.t tVar, p096n1.e eVar) {
        super(((C0537s) tVar.f8078d).f7330f, 0);
        this.f7298d = tVar;
        this.f7299e = eVar;
    }
}
