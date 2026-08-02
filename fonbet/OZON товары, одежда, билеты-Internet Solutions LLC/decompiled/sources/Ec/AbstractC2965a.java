package Ec;

import Bl0.C2645f;
import Fc.g;
import Kc.C3493a;
import hg.InterfaceC6950c;
import tc.InterfaceC9799a;
import tc.InterfaceC9805g;

/* renamed from: Ec.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC2965a<T, R> implements InterfaceC9799a<T>, InterfaceC9805g<R> {

    /* renamed from: a, reason: collision with root package name */
    protected final InterfaceC9799a<? super R> f7801a;

    /* renamed from: b, reason: collision with root package name */
    protected InterfaceC6950c f7802b;

    /* renamed from: c, reason: collision with root package name */
    protected InterfaceC9805g<T> f7803c;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f7804d;

    /* renamed from: e, reason: collision with root package name */
    protected int f7805e;

    public AbstractC2965a(InterfaceC9799a<? super R> interfaceC9799a) {
        this.f7801a = interfaceC9799a;
    }

    @Override // tc.InterfaceC9804f
    public int a(int i11) {
        InterfaceC9805g<T> interfaceC9805g = this.f7803c;
        if (interfaceC9805g == null || (i11 & 4) != 0) {
            return 0;
        }
        int a11 = interfaceC9805g.a(i11);
        if (a11 == 0) {
            return a11;
        }
        this.f7805e = a11;
        return a11;
    }

    protected final void b(Throwable th2) {
        C2645f.c(th2);
        this.f7802b.cancel();
        onError(th2);
    }

    @Override // hg.InterfaceC6950c
    public final void cancel() {
        this.f7802b.cancel();
    }

    @Override // tc.InterfaceC9808j
    public final void clear() {
        this.f7803c.clear();
    }

    @Override // hg.InterfaceC6949b
    public final void d(InterfaceC6950c interfaceC6950c) {
        if (g.g(this.f7802b, interfaceC6950c)) {
            this.f7802b = interfaceC6950c;
            if (interfaceC6950c instanceof InterfaceC9805g) {
                this.f7803c = (InterfaceC9805g) interfaceC6950c;
            }
            this.f7801a.d(this);
        }
    }

    @Override // tc.InterfaceC9808j
    public final boolean isEmpty() {
        return this.f7803c.isEmpty();
    }

    @Override // hg.InterfaceC6950c
    public final void n(long j11) {
        this.f7802b.n(j11);
    }

    @Override // tc.InterfaceC9808j
    public final boolean offer(R r11) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // hg.InterfaceC6949b
    public void onComplete() {
        if (this.f7804d) {
            return;
        }
        this.f7804d = true;
        this.f7801a.onComplete();
    }

    @Override // hg.InterfaceC6949b
    public void onError(Throwable th2) {
        if (this.f7804d) {
            C3493a.f(th2);
        } else {
            this.f7804d = true;
            this.f7801a.onError(th2);
        }
    }
}
