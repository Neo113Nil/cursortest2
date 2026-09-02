package i1;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class u implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final r f1419a;

    /* renamed from: b, reason: collision with root package name */
    public final m1.f f1420b;

    /* renamed from: c, reason: collision with root package name */
    public final t f1421c;

    /* renamed from: d, reason: collision with root package name */
    public C0071b f1422d;

    /* renamed from: e, reason: collision with root package name */
    public final w f1423e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1424f;

    public u(r rVar, w wVar) {
        this.f1419a = rVar;
        this.f1423e = wVar;
        this.f1420b = new m1.f(rVar);
        t tVar = new t(0, this);
        this.f1421c = tVar;
        rVar.getClass();
        tVar.g(0, TimeUnit.MILLISECONDS);
    }

    public final y a() {
        synchronized (this) {
            if (this.f1424f) {
                throw new IllegalStateException("Already Executed");
            }
            this.f1424f = true;
        }
        this.f1420b.f6144c = p1.g.f6437a.j();
        this.f1421c.i();
        this.f1422d.getClass();
        try {
            try {
                C0.t tVar = this.f1419a.f1388a;
                synchronized (tVar) {
                    ((ArrayDeque) tVar.f119d).add(this);
                }
                return b();
            } catch (IOException e2) {
                IOException c2 = c(e2);
                this.f1422d.getClass();
                throw c2;
            }
        } finally {
            this.f1419a.f1388a.d(this);
        }
    }

    public final y b() {
        ArrayList arrayList = new ArrayList();
        r rVar = this.f1419a;
        arrayList.addAll(rVar.f1389b);
        arrayList.add(this.f1420b);
        arrayList.add(new l1.a(1, rVar.f1393f));
        arrayList.add(new k1.a(0));
        arrayList.add(new l1.a(0, rVar));
        arrayList.addAll(rVar.f1390c);
        arrayList.add(new k1.a(1));
        C0071b c0071b = this.f1422d;
        w wVar = this.f1423e;
        return new m1.e(arrayList, null, null, null, 0, wVar, this, c0071b, rVar.f1406s, rVar.f1407t, rVar.f1408u).a(wVar);
    }

    public final IOException c(IOException iOException) {
        if (!this.f1421c.k()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final Object clone() {
        w wVar = this.f1423e;
        r rVar = this.f1419a;
        u uVar = new u(rVar, wVar);
        rVar.f1391d.getClass();
        uVar.f1422d = C0071b.f1292d;
        return uVar;
    }
}
