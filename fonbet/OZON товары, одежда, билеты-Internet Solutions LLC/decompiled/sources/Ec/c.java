package Ec;

import Fc.g;
import hg.InterfaceC6950c;
import io.reactivex.j;
import java.util.concurrent.atomic.AtomicReference;
import tc.InterfaceC9805g;
import tc.InterfaceC9808j;

/* loaded from: classes.dex */
public final class c<T> extends AtomicReference<InterfaceC6950c> implements j<T>, InterfaceC6950c {

    /* renamed from: a, reason: collision with root package name */
    final d<T> f7811a;

    /* renamed from: b, reason: collision with root package name */
    final int f7812b;

    /* renamed from: c, reason: collision with root package name */
    final int f7813c;

    /* renamed from: d, reason: collision with root package name */
    volatile InterfaceC9808j<T> f7814d;

    /* renamed from: e, reason: collision with root package name */
    volatile boolean f7815e;

    /* renamed from: f, reason: collision with root package name */
    long f7816f;

    /* renamed from: g, reason: collision with root package name */
    int f7817g;

    public c(d<T> dVar, int i11) {
        this.f7811a = dVar;
        this.f7812b = i11;
        this.f7813c = i11 - (i11 >> 2);
    }

    public final boolean a() {
        return this.f7815e;
    }

    public final InterfaceC9808j<T> b() {
        return this.f7814d;
    }

    @Override // hg.InterfaceC6950c
    public final void cancel() {
        g.a(this);
    }

    @Override // hg.InterfaceC6949b
    public final void d(InterfaceC6950c interfaceC6950c) {
        if (g.e(this, interfaceC6950c)) {
            if (interfaceC6950c instanceof InterfaceC9805g) {
                InterfaceC9805g interfaceC9805g = (InterfaceC9805g) interfaceC6950c;
                int a11 = interfaceC9805g.a(3);
                if (a11 == 1) {
                    this.f7817g = a11;
                    this.f7814d = interfaceC9805g;
                    this.f7815e = true;
                    this.f7811a.b(this);
                    return;
                }
                if (a11 == 2) {
                    this.f7817g = a11;
                    this.f7814d = interfaceC9805g;
                    int i11 = this.f7812b;
                    interfaceC6950c.n(i11 >= 0 ? i11 : Long.MAX_VALUE);
                    return;
                }
            }
            int i12 = this.f7812b;
            this.f7814d = i12 < 0 ? new Cc.c<>(-i12) : new Cc.b<>(i12);
            int i13 = this.f7812b;
            interfaceC6950c.n(i13 >= 0 ? i13 : Long.MAX_VALUE);
        }
    }

    public final void e() {
        if (this.f7817g != 1) {
            long j11 = this.f7816f + 1;
            if (j11 != this.f7813c) {
                this.f7816f = j11;
            } else {
                this.f7816f = 0L;
                get().n(j11);
            }
        }
    }

    public final void f() {
        this.f7815e = true;
    }

    @Override // hg.InterfaceC6950c
    public final void n(long j11) {
        if (this.f7817g != 1) {
            long j12 = this.f7816f + j11;
            if (j12 < this.f7813c) {
                this.f7816f = j12;
            } else {
                this.f7816f = 0L;
                get().n(j12);
            }
        }
    }

    @Override // hg.InterfaceC6949b
    public final void onComplete() {
        this.f7811a.b(this);
    }

    @Override // hg.InterfaceC6949b
    public final void onError(Throwable th2) {
        this.f7811a.e(this, th2);
    }

    @Override // hg.InterfaceC6949b
    public final void onNext(T t2) {
        int i11 = this.f7817g;
        d<T> dVar = this.f7811a;
        if (i11 == 0) {
            dVar.f(this, t2);
        } else {
            dVar.a();
        }
    }
}
