package Ub;

import androidx.annotation.NonNull;
import bc.AbstractC5626b;
import bc.C5637m;
import dc.AbstractC6136a;
import ru.ozon.app.android.data.markdown.MarkWonLinkResolver;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final Vb.r f27486a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC5626b f27487b;

    /* renamed from: c, reason: collision with root package name */
    private final Gc.d f27488c;

    /* renamed from: d, reason: collision with root package name */
    private final b f27489d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC6136a f27490e;

    /* renamed from: f, reason: collision with root package name */
    private final C5637m f27491f;

    /* renamed from: g, reason: collision with root package name */
    private final j f27492g;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private Vb.r f27493a;

        /* renamed from: b, reason: collision with root package name */
        private AbstractC5626b f27494b;

        /* renamed from: c, reason: collision with root package name */
        private Gc.d f27495c;

        /* renamed from: d, reason: collision with root package name */
        private b f27496d;

        /* renamed from: e, reason: collision with root package name */
        private AbstractC6136a f27497e;

        /* renamed from: f, reason: collision with root package name */
        private C5637m f27498f;

        /* renamed from: g, reason: collision with root package name */
        private j f27499g;

        @NonNull
        public final void h(@NonNull AbstractC5626b abstractC5626b) {
            this.f27494b = abstractC5626b;
        }

        @NonNull
        public final f i(@NonNull Vb.r rVar, @NonNull j jVar) {
            this.f27493a = rVar;
            this.f27499g = jVar;
            if (this.f27494b == null) {
                this.f27494b = AbstractC5626b.c();
            }
            if (this.f27495c == null) {
                this.f27495c = new Gc.d();
            }
            if (this.f27496d == null) {
                this.f27496d = new c();
            }
            if (this.f27497e == null) {
                this.f27497e = AbstractC6136a.a();
            }
            if (this.f27498f == null) {
                this.f27498f = new C5637m();
            }
            return new f(this);
        }

        @NonNull
        public final void j(@NonNull MarkWonLinkResolver markWonLinkResolver) {
            this.f27496d = markWonLinkResolver;
        }
    }

    f(a aVar) {
        this.f27486a = aVar.f27493a;
        this.f27487b = aVar.f27494b;
        this.f27488c = aVar.f27495c;
        this.f27489d = aVar.f27496d;
        this.f27490e = aVar.f27497e;
        this.f27491f = aVar.f27498f;
        this.f27492g = aVar.f27499g;
    }

    @NonNull
    public final AbstractC5626b a() {
        return this.f27487b;
    }

    @NonNull
    public final AbstractC6136a b() {
        return this.f27490e;
    }

    @NonNull
    public final C5637m c() {
        return this.f27491f;
    }

    @NonNull
    public final b d() {
        return this.f27489d;
    }

    @NonNull
    public final j e() {
        return this.f27492g;
    }

    @NonNull
    public final Gc.d f() {
        return this.f27488c;
    }

    @NonNull
    public final Vb.r g() {
        return this.f27486a;
    }
}
