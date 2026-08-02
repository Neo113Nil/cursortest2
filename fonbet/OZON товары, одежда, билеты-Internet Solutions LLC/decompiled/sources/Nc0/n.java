package Nc0;

import Ae.InterfaceC2395h;
import Ae.O0;
import Ae.x0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class n implements m {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final x0<a> f19008a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<a> f19009b;

    public interface a {

        /* renamed from: Nc0.n$a$a, reason: collision with other inner class name */
        public static final class C0373a implements a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f19010a;

            public C0373a(@NotNull String title) {
                Intrinsics.checkNotNullParameter(title, "title");
                this.f19010a = title;
            }

            @NotNull
            public final String a() {
                return this.f19010a;
            }
        }

        public static final class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f19011a = new b();
        }

        public static final class c implements a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final c f19012a = new c();
        }
    }

    public n() {
        x0<a> a11 = O0.a(a.c.f19012a);
        this.f19008a = a11;
        this.f19009b = a11;
    }

    @Override // Nc0.m
    @NotNull
    public final InterfaceC2395h<a> c() {
        return this.f19009b;
    }

    @Override // Nc0.m
    public final void h() {
        this.f19008a.tryEmit(a.b.f19011a);
    }

    @Override // Nc0.m
    public final void q(String str) {
        this.f19008a.tryEmit(str != null ? new a.C0373a(str) : a.c.f19012a);
    }
}
