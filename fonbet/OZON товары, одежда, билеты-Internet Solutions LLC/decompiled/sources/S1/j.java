package S1;

import S0.A1;
import S0.C3991w0;
import S0.D1;
import S0.n1;
import androidx.emoji2.text.j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class j implements m {

    /* renamed from: a, reason: collision with root package name */
    private A1<Boolean> f25660a;

    public static final class a extends j.f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3991w0 f25661a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f25662b;

        a(C3991w0 c3991w0, j jVar) {
            this.f25661a = c3991w0;
            this.f25662b = jVar;
        }

        @Override // androidx.emoji2.text.j.f
        public final void a() {
            o oVar;
            oVar = n.f25666a;
            this.f25662b.f25660a = oVar;
        }

        @Override // androidx.emoji2.text.j.f
        public final void b() {
            this.f25661a.setValue(Boolean.TRUE);
            this.f25662b.f25660a = new o(true);
        }
    }

    public j() {
        this.f25660a = androidx.emoji2.text.j.j() ? b() : null;
    }

    private final A1<Boolean> b() {
        C3991w0 f7;
        androidx.emoji2.text.j c11 = androidx.emoji2.text.j.c();
        if (c11.f() == 1) {
            return new o(true);
        }
        f7 = n1.f(Boolean.FALSE, D1.f25195a);
        c11.o(new a(f7, this));
        return f7;
    }

    @NotNull
    public final A1<Boolean> c() {
        o oVar;
        A1<Boolean> a12 = this.f25660a;
        if (a12 != null) {
            Intrinsics.f(a12);
            return a12;
        }
        if (!androidx.emoji2.text.j.j()) {
            oVar = n.f25666a;
            return oVar;
        }
        A1<Boolean> b11 = b();
        this.f25660a = b11;
        return b11;
    }
}
