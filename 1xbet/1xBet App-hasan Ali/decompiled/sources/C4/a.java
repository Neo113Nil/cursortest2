package C4;

import A.v;
import java.io.IOException;
import y4.p;
import y4.u;
import y4.z;

/* loaded from: classes.dex */
public final class a implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final a f848a = new a();

    @Override // y4.p
    public final z a(D4.f fVar) {
        i iVar = fVar.f976a;
        iVar.getClass();
        synchronized (iVar) {
            try {
                if (!iVar.f887v) {
                    throw new IllegalStateException("released");
                }
                if (iVar.f886u) {
                    throw new IllegalStateException("Check failed.");
                }
                if (iVar.f885t) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        e eVar = iVar.f882q;
        kotlin.jvm.internal.l.c(eVar);
        u uVar = iVar.f876k;
        kotlin.jvm.internal.l.f("client", uVar);
        try {
            D4.d k5 = eVar.a(fVar.f, fVar.f981g, fVar.f982h, uVar.f21416p, !kotlin.jvm.internal.l.a((String) fVar.f980e.f812c, "GET")).k(uVar, fVar);
            kotlin.jvm.internal.l.f("call", iVar);
            kotlin.jvm.internal.l.f("finder", eVar);
            v vVar = new v();
            vVar.f133b = iVar;
            vVar.f134c = eVar;
            vVar.f135d = k5;
            vVar.f136e = k5.h();
            iVar.f884s = vVar;
            iVar.f889x = vVar;
            synchronized (iVar) {
                iVar.f885t = true;
                iVar.f886u = true;
            }
            if (iVar.f888w) {
                throw new IOException("Canceled");
            }
            return D4.f.a(fVar, 0, vVar, null, 61).b(fVar.f980e);
        } catch (l e3) {
            eVar.c(e3.f907l);
            throw e3;
        } catch (IOException e5) {
            eVar.c(e5);
            throw new l(e5);
        }
    }
}
