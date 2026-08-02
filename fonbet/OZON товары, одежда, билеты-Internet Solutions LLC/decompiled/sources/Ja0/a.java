package Ja0;

import Ga0.e;
import Ja0.b;
import Jb.d;
import Jb.f;
import android.app.Application;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: Ja0.a$a, reason: collision with other inner class name */
    private static final class C0269a implements b.a {
        @Override // Ja0.b.a
        public final Ja0.b create(Application application) {
            application.getClass();
            return new b(application);
        }
    }

    private static final class b implements Ja0.b {

        /* renamed from: a, reason: collision with root package name */
        private Pc.a<Fa0.a> f14329a;

        b(Application application) {
            this.f14329a = d.b(new e(f.a(application), 0));
        }

        @Override // Ja0.b
        public final Fa0.a a() {
            return this.f14329a.get();
        }
    }

    public static b.a a() {
        return new C0269a();
    }
}
