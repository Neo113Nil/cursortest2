package S;

import C.S;
import androidx.annotation.NonNull;
import androidx.camera.extensions.impl.ExtensionVersionImpl;

/* loaded from: classes8.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static volatile c f25181a;

    private static class a extends c {
        @Override // S.c
        final e a() {
            return null;
        }
    }

    private static class b extends c {

        /* renamed from: c, reason: collision with root package name */
        private static ExtensionVersionImpl f25182c;

        /* renamed from: b, reason: collision with root package name */
        private e f25183b;

        b() {
            if (f25182c == null) {
                f25182c = new ExtensionVersionImpl();
            }
            e f7 = e.f(f25182c.checkApiVersion(S.b.a().d()));
            if (f7 != null && S.b.a().b().c() == f7.c()) {
                this.f25183b = f7;
            }
            S.a("ExtenderVersion", "Selected vendor runtime: " + this.f25183b);
        }

        @Override // S.c
        final e a() {
            return this.f25183b;
        }
    }

    public static boolean b(@NonNull e eVar) {
        c cVar;
        if (f25181a != null) {
            cVar = f25181a;
        } else {
            synchronized (c.class) {
                if (f25181a == null) {
                    try {
                        f25181a = new b();
                    } catch (NoClassDefFoundError unused) {
                        S.a("ExtenderVersion", "No versioning extender found. Falling back to default.");
                        f25181a = new a();
                    }
                }
            }
            cVar = f25181a;
        }
        e a11 = cVar.a();
        int c11 = eVar.c();
        return (a11.c() == c11 ? Integer.compare(a11.d(), eVar.d()) : Integer.compare(a11.c(), c11)) >= 0;
    }

    abstract e a();
}
