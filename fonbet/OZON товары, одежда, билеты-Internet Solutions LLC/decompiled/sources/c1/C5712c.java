package c1;

import c1.AbstractC5716g;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: c1.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5712c extends C5711b {

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final C5711b f56222o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f56223p;

    public C5712c(int i11, @NotNull C5718i c5718i, Function1<Object, Unit> function1, Function1<Object, Unit> function12, @NotNull C5711b c5711b) {
        super(i11, c5718i, function1, function12);
        this.f56222o = c5711b;
        c5711b.m();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0079 A[Catch: all -> 0x006c, TryCatch #0 {all -> 0x006c, blocks: (B:11:0x002e, B:13:0x0033, B:16:0x0038, B:21:0x0052, B:23:0x005a, B:24:0x0071, B:26:0x0079, B:27:0x007e, B:35:0x0063, B:36:0x006e), top: B:10:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bd  */
    @Override // c1.C5711b
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC5716g B() {
        HashMap hashMap;
        if (this.f56222o.C() || this.f56222o.e()) {
            return new AbstractC5716g.a(0);
        }
        androidx.collection.M<InterfaceC5704H> elements = D();
        int f7 = f();
        if (elements != null) {
            C5711b c5711b = this.f56222o;
            hashMap = C5721l.m(c5711b, this, c5711b.g());
        } else {
            hashMap = null;
        }
        synchronized (C5721l.D()) {
            try {
                C5721l.w(this);
                if (elements != null && elements.f38665d != 0) {
                    AbstractC5716g H11 = H(this.f56222o.f(), hashMap, this.f56222o.g());
                    if (!Intrinsics.d(H11, AbstractC5716g.b.f56232a)) {
                        return H11;
                    }
                    androidx.collection.M<InterfaceC5704H> D11 = this.f56222o.D();
                    if (D11 != null) {
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        D11.j(elements);
                    } else {
                        this.f56222o.N(elements);
                        N(null);
                    }
                    if (this.f56222o.f() < f7) {
                        this.f56222o.A();
                    }
                    C5711b c5711b2 = this.f56222o;
                    c5711b2.v(c5711b2.g().l(f7).k(E()));
                    this.f56222o.I(f7);
                    this.f56222o.K(y());
                    this.f56222o.J(E());
                    this.f56222o.L(F());
                    Unit unit = Unit.f71690a;
                    M();
                    if (!this.f56223p) {
                        this.f56223p = true;
                        this.f56222o.n();
                    }
                    return AbstractC5716g.b.f56232a;
                }
                b();
                if (this.f56222o.f() < f7) {
                }
                C5711b c5711b22 = this.f56222o;
                c5711b22.v(c5711b22.g().l(f7).k(E()));
                this.f56222o.I(f7);
                this.f56222o.K(y());
                this.f56222o.J(E());
                this.f56222o.L(F());
                Unit unit2 = Unit.f71690a;
                M();
                if (!this.f56223p) {
                }
                return AbstractC5716g.b.f56232a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // c1.C5711b, c1.AbstractC5715f
    public final void d() {
        if (e()) {
            return;
        }
        super.d();
        if (this.f56223p) {
            return;
        }
        this.f56223p = true;
        this.f56222o.n();
    }
}
