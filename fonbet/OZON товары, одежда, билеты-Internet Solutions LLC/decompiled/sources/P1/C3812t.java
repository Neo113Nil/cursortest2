package P1;

import P1.AbstractC3809p;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* renamed from: P1.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3812t implements AbstractC3809p.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3796c f21590a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3798e f21591b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Y f21592c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C3817y f21593d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final K f21594e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Function1<W, Object> f21595f;

    public C3812t(C3796c c3796c, C3798e c3798e) {
        Y b11 = C3813u.b();
        C3817y c3817y = new C3817y(C3813u.a());
        K k11 = new K();
        this.f21590a = c3796c;
        this.f21591b = c3798e;
        this.f21592c = b11;
        this.f21593d = c3817y;
        this.f21594e = k11;
        this.f21595f = new r(this);
    }

    public static final Z e(C3812t c3812t, W w11) {
        c3812t.getClass();
        return c3812t.f21592c.c(w11, new C3811s(c3812t, w11));
    }

    @Override // P1.AbstractC3809p.a
    @NotNull
    public final Z a(AbstractC3809p abstractC3809p, @NotNull F f7, int i11, int i12) {
        C3798e c3798e = this.f21591b;
        c3798e.getClass();
        F a11 = c3798e.a(f7);
        this.f21590a.getClass();
        W w11 = new W(abstractC3809p, a11, i11, i12, null);
        return this.f21592c.c(w11, new C3811s(this, w11));
    }

    @NotNull
    public final C3796c f() {
        return this.f21590a;
    }
}
