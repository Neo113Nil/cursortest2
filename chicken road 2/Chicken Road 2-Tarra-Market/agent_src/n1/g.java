package n1;

import a.AbstractC0009a;
import i1.C0071b;
import i1.o;
import i1.r;
import i1.s;
import i1.w;
import i1.x;
import i1.y;
import i1.z;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.util.logging.Logger;
import s1.l;
import s1.m;
import s1.n;

/* loaded from: classes.dex */
public final class g implements m1.b {

    /* renamed from: a, reason: collision with root package name */
    public final r f6192a;

    /* renamed from: b, reason: collision with root package name */
    public final l1.g f6193b;

    /* renamed from: c, reason: collision with root package name */
    public final n f6194c;

    /* renamed from: d, reason: collision with root package name */
    public final m f6195d;

    /* renamed from: e, reason: collision with root package name */
    public int f6196e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f6197f = 262144;

    public g(r rVar, l1.g gVar, n nVar, m mVar) {
        this.f6192a = rVar;
        this.f6193b = gVar;
        this.f6194c = nVar;
        this.f6195d = mVar;
    }

    @Override // m1.b
    public final s1.r a(w wVar, long j2) {
        if ("chunked".equalsIgnoreCase(wVar.f1432c.a("Transfer-Encoding"))) {
            if (this.f6196e == 1) {
                this.f6196e = 2;
                return new b(this);
            }
            throw new IllegalStateException("state: " + this.f6196e);
        }
        if (j2 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f6196e == 1) {
            this.f6196e = 2;
            return new d(this, j2);
        }
        throw new IllegalStateException("state: " + this.f6196e);
    }

    @Override // m1.b
    public final void b() {
        this.f6195d.flush();
    }

    @Override // m1.b
    public final void c() {
        this.f6195d.flush();
    }

    @Override // m1.b
    public final void cancel() {
        l1.c a2 = this.f6193b.a();
        if (a2 != null) {
            j1.d.d(a2.f6091d);
        }
    }

    @Override // m1.b
    public final void d(w wVar) {
        Proxy.Type type = this.f6193b.a().f6090c.f1270b.type();
        StringBuilder sb = new StringBuilder();
        sb.append(wVar.f1431b);
        sb.append(' ');
        o oVar = wVar.f1430a;
        if (oVar.f1376a.equals("https") || type != Proxy.Type.HTTP) {
            sb.append(AbstractC0009a.C(oVar));
        } else {
            sb.append(oVar);
        }
        sb.append(" HTTP/1.1");
        i(wVar.f1432c, sb.toString());
    }

    @Override // m1.b
    public final x e(boolean z2) {
        int i2 = this.f6196e;
        if (i2 != 1 && i2 != 3) {
            throw new IllegalStateException("state: " + this.f6196e);
        }
        try {
            String m2 = this.f6194c.m(this.f6197f);
            this.f6197f -= m2.length();
            H0.b f2 = H0.b.f(m2);
            int i3 = f2.f180b;
            x xVar = new x();
            xVar.f1437b = (s) f2.f181c;
            xVar.f1438c = i3;
            xVar.f1439d = (String) f2.f182d;
            xVar.f1441f = h().c();
            if (z2 && i3 == 100) {
                return null;
            }
            if (i3 == 100) {
                this.f6196e = 3;
                return xVar;
            }
            this.f6196e = 4;
            return xVar;
        } catch (EOFException e2) {
            IOException iOException = new IOException("unexpected end of stream on " + this.f6193b);
            iOException.initCause(e2);
            throw iOException;
        }
    }

    @Override // m1.b
    public final z f(y yVar) {
        int i2 = 1;
        l1.g gVar = this.f6193b;
        gVar.f6118f.getClass();
        yVar.a("Content-Type");
        if (!m1.d.b(yVar)) {
            e g2 = g(0L);
            Logger logger = l.f6634a;
            return new z(0L, new n(g2), i2);
        }
        long j2 = -1;
        if ("chunked".equalsIgnoreCase(yVar.a("Transfer-Encoding"))) {
            o oVar = yVar.f1448a.f1430a;
            if (this.f6196e != 4) {
                throw new IllegalStateException("state: " + this.f6196e);
            }
            this.f6196e = 5;
            c cVar = new c(this, oVar);
            Logger logger2 = l.f6634a;
            return new z(j2, new n(cVar), i2);
        }
        long a2 = m1.d.a(yVar);
        if (a2 != -1) {
            e g3 = g(a2);
            Logger logger3 = l.f6634a;
            return new z(a2, new n(g3), i2);
        }
        if (this.f6196e != 4) {
            throw new IllegalStateException("state: " + this.f6196e);
        }
        this.f6196e = 5;
        gVar.e();
        f fVar = new f(this);
        Logger logger4 = l.f6634a;
        return new z(j2, new n(fVar), i2);
    }

    public final e g(long j2) {
        if (this.f6196e != 4) {
            throw new IllegalStateException("state: " + this.f6196e);
        }
        this.f6196e = 5;
        e eVar = new e(this);
        eVar.f6190e = j2;
        if (j2 == 0) {
            eVar.a(true, null);
        }
        return eVar;
    }

    public final i1.m h() {
        i1.l lVar = new i1.l(0);
        while (true) {
            String m2 = this.f6194c.m(this.f6197f);
            this.f6197f -= m2.length();
            if (m2.length() == 0) {
                return new i1.m(lVar);
            }
            C0071b.f1293e.getClass();
            int indexOf = m2.indexOf(StringUtils.PROCESS_POSTFIX_DELIMITER, 1);
            if (indexOf != -1) {
                lVar.a(m2.substring(0, indexOf), m2.substring(indexOf + 1));
            } else if (m2.startsWith(StringUtils.PROCESS_POSTFIX_DELIMITER)) {
                lVar.a("", m2.substring(1));
            } else {
                lVar.a("", m2);
            }
        }
    }

    public final void i(i1.m mVar, String str) {
        if (this.f6196e != 0) {
            throw new IllegalStateException("state: " + this.f6196e);
        }
        m mVar2 = this.f6195d;
        mVar2.h(str);
        mVar2.h("\r\n");
        int d2 = mVar.d();
        for (int i2 = 0; i2 < d2; i2++) {
            mVar2.h(mVar.b(i2));
            mVar2.h(": ");
            mVar2.h(mVar.e(i2));
            mVar2.h("\r\n");
        }
        mVar2.h("\r\n");
        this.f6196e = 1;
    }
}
