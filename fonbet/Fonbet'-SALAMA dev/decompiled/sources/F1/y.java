package F1;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Callable;
import n4.C1468b;
import n4.C1473g;
import p4.InterfaceC1538a;
import s4.C1593a;

/* loaded from: classes.dex */
public final class y implements InterfaceC1538a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2588a = false;

    public synchronized boolean a() {
        if (this.f2588a) {
            return false;
        }
        this.f2588a = true;
        notifyAll();
        return true;
    }

    @Override // p4.InterfaceC1538a
    public void b(C1473g c1473g, C1468b c1468b) {
        f();
    }

    @Override // p4.InterfaceC1538a
    public void c() {
        f();
    }

    @Override // p4.InterfaceC1538a
    public void d(long j) {
        f();
    }

    @Override // p4.InterfaceC1538a
    public void e(C1473g c1473g, v4.r rVar) {
        f();
    }

    public void f() {
        q4.k.b("Transaction expected to already be in progress.", this.f2588a);
    }

    @Override // p4.InterfaceC1538a
    public void h(s4.h hVar, HashSet hashSet) {
        f();
    }

    @Override // p4.InterfaceC1538a
    public void i(s4.h hVar) {
        f();
    }

    @Override // p4.InterfaceC1538a
    public Object j(Callable callable) {
        q4.k.b("runInTransaction called when an existing transaction is already in progress.", !this.f2588a);
        this.f2588a = true;
        try {
            return callable.call();
        } finally {
        }
    }

    @Override // p4.InterfaceC1538a
    public void k(long j, C1468b c1468b, C1473g c1473g) {
        f();
    }

    @Override // p4.InterfaceC1538a
    public void m(s4.h hVar, HashSet hashSet, HashSet hashSet2) {
        f();
    }

    @Override // p4.InterfaceC1538a
    public void n(s4.h hVar) {
        f();
    }

    @Override // p4.InterfaceC1538a
    public List o() {
        return Collections.emptyList();
    }

    @Override // p4.InterfaceC1538a
    public void p(C1473g c1473g, v4.r rVar, long j) {
        f();
    }

    @Override // p4.InterfaceC1538a
    public C1593a u(s4.h hVar) {
        return new C1593a(new v4.l(v4.j.f17184e, hVar.f16173b.f16170g), false, false);
    }

    @Override // p4.InterfaceC1538a
    public void v(s4.h hVar, v4.r rVar) {
        f();
    }

    @Override // p4.InterfaceC1538a
    public void w(s4.h hVar) {
        f();
    }

    @Override // p4.InterfaceC1538a
    public void y(C1473g c1473g, C1468b c1468b) {
        f();
    }
}
