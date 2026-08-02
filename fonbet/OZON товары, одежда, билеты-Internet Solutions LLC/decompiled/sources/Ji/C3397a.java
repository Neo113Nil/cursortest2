package Ji;

import Hj0.C3147d;
import Hj0.C3153j;
import Jb.d;
import Jb.j;
import Ji.b;
import O7.h;
import Qi.C3878b;
import Qi.C3879c;
import Ti.c;
import Ti.i;
import Ui.C4069c;
import android.content.Context;
import com.google.mlkit.common.sdkinternal.C;
import ru.ozon.android.gallery.media.view.GalleryActivity;
import s10.f;
import ti.C9876a;
import zi.C11125b;

/* renamed from: Ji.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3397a {

    /* renamed from: Ji.a$a, reason: collision with other inner class name */
    private static final class C0279a implements b.a {

        /* renamed from: a, reason: collision with root package name */
        private Pi.a f14800a;

        @Override // Ji.b.a
        public final b.a a(Pi.a aVar) {
            this.f14800a = aVar;
            return this;
        }

        @Override // Ji.b.a
        public final Ji.b build() {
            j.a(Pi.a.class, this.f14800a);
            return new b(this.f14800a);
        }
    }

    /* renamed from: Ji.a$b */
    private static final class b implements Ji.b {

        /* renamed from: a, reason: collision with root package name */
        private Pc.a<Context> f14801a;

        /* renamed from: b, reason: collision with root package name */
        private Pc.a<Oi.b> f14802b;

        /* renamed from: c, reason: collision with root package name */
        private C3147d f14803c;

        /* renamed from: d, reason: collision with root package name */
        private f f14804d;

        /* renamed from: Ji.a$b$a, reason: collision with other inner class name */
        private static final class C0280a implements Pc.a<Context> {

            /* renamed from: a, reason: collision with root package name */
            private final Pi.a f14805a;

            C0280a(Pi.a aVar) {
                this.f14805a = aVar;
            }

            @Override // Pc.a
            public final Context get() {
                Context a11 = this.f14805a.a();
                j.c(a11);
                return a11;
            }
        }

        b(Pi.a aVar) {
            C0280a c0280a = new C0280a(aVar);
            this.f14801a = c0280a;
            Pc.a<Oi.b> b11 = d.b(new C3153j(c0280a, Mi.b.a()));
            this.f14802b = b11;
            this.f14803c = new C3147d(b11, Mi.b.a(), C3879c.a());
            this.f14804d = new f(this.f14802b, 1);
        }

        @Override // Ji.b
        public final void a(C9876a c9876a) {
            C.a(c9876a, this.f14804d);
        }

        @Override // Ji.b
        public final void b(GalleryActivity galleryActivity) {
            c.b(new i(), galleryActivity);
        }

        @Override // Ji.b
        public final void c(C4069c c4069c) {
            h.i(c4069c, this.f14803c);
            h.g(c4069c, new i());
        }

        @Override // Ji.b
        public final void d(C11125b c11125b) {
            h.h(c11125b, new i());
            h.f(c11125b, this.f14802b.get());
            h.e(c11125b, new C3878b());
        }
    }

    public static b.a a() {
        return new C0279a();
    }
}
