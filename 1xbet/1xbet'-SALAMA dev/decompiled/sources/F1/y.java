package F1;

import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Callable;
import p098n4.C0929b;
import p098n4.C0934g;

/* JADX INFO: loaded from: classes.dex */
public final class y implements p114p4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2588a = false;

    public synchronized boolean a() {
        if (this.f2588a) {
            return false;
        }
        this.f2588a = true;
        notifyAll();
        return true;
    }

    @Override // p114p4.a
    public void b(C0934g c0934g, C0929b c0929b) {
        f();
    }

    @Override // p114p4.a
    public void c() {
        f();
    }

    @Override // p114p4.a
    public void d(long j) {
        f();
    }

    @Override // p114p4.a
    public void e(C0934g c0934g, v4.r rVar) {
        f();
    }

    public void f() {
        p120q4.k.b("Transaction expected to already be in progress.", this.f2588a);
    }

    @Override // p114p4.a
    public void h(p134s4.h hVar, HashSet hashSet) {
        f();
    }

    @Override // p114p4.a
    public void i(p134s4.h hVar) {
        f();
    }

    @Override // p114p4.a
    public Object j(Callable callable) {
        p120q4.k.b("runInTransaction called when an existing transaction is already in progress.", !this.f2588a);
        this.f2588a = true;
        try {
            Object objCall = callable.call();
            this.f2588a = false;
            return objCall;
        } catch (Throwable th) {
            try {
                Log.e("NoopPersistenceManager", "Caught Throwable.", th);
                throw new RuntimeException(th);
            } catch (Throwable th2) {
                this.f2588a = false;
                throw th2;
            }
        }
    }

    @Override // p114p4.a
    public void k(long j, C0929b c0929b, C0934g c0934g) {
        f();
    }

    @Override // p114p4.a
    public void m(p134s4.h hVar, HashSet hashSet, HashSet hashSet2) {
        f();
    }

    @Override // p114p4.a
    public void n(p134s4.h hVar) {
        f();
    }

    @Override // p114p4.a
    public List o() {
        return Collections.emptyList();
    }

    @Override // p114p4.a
    public void p(C0934g c0934g, v4.r rVar, long j) {
        f();
    }

    @Override // p114p4.a
    public p134s4.a u(p134s4.h hVar) {
        return new p134s4.a(new v4.l(v4.j.f17190e, hVar.f16179b.f16176g), false, false);
    }

    @Override // p114p4.a
    public void v(p134s4.h hVar, v4.r rVar) {
        f();
    }

    @Override // p114p4.a
    public void w(p134s4.h hVar) {
        f();
    }

    @Override // p114p4.a
    public void y(C0934g c0934g, C0929b c0929b) {
        f();
    }
}
