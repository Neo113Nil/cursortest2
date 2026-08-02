package V5;

import androidx.annotation.NonNull;
import q6.AbstractC8993d;
import q6.C8990a;

/* loaded from: classes.dex */
final class u<Z> implements v<Z>, C8990a.d {

    /* renamed from: e, reason: collision with root package name */
    private static final x2.f<u<?>> f28294e = C8990a.a(20, new a());

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC8993d f28295a = AbstractC8993d.a();

    /* renamed from: b, reason: collision with root package name */
    private v<Z> f28296b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f28297c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f28298d;

    final class a implements C8990a.b<u<?>> {
        @Override // q6.C8990a.b
        public final u<?> create() {
            return new u<>();
        }
    }

    u() {
    }

    @NonNull
    static <Z> u<Z> c(v<Z> vVar) {
        u<Z> uVar = (u) f28294e.a();
        p6.k.c(uVar, "Argument must not be null");
        ((u) uVar).f28298d = false;
        ((u) uVar).f28297c = true;
        ((u) uVar).f28296b = vVar;
        return uVar;
    }

    @Override // V5.v
    public final synchronized void a() {
        this.f28295a.c();
        this.f28298d = true;
        if (!this.f28297c) {
            this.f28296b.a();
            this.f28296b = null;
            f28294e.b(this);
        }
    }

    @Override // V5.v
    @NonNull
    public final Class<Z> b() {
        return this.f28296b.b();
    }

    @Override // q6.C8990a.d
    @NonNull
    public final AbstractC8993d d() {
        return this.f28295a;
    }

    final synchronized void e() {
        this.f28295a.c();
        if (!this.f28297c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f28297c = false;
        if (this.f28298d) {
            a();
        }
    }

    @Override // V5.v
    @NonNull
    public final Z get() {
        return this.f28296b.get();
    }

    @Override // V5.v
    public final int getSize() {
        return this.f28296b.getSize();
    }
}
