package Pe;

import Cf0.O;
import Le.InterfaceC3583a;
import Oe.C3705y;
import Oe.Z;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.T;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class u implements InterfaceC3583a<t> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final u f22305a = new u();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Me.f f22306b = a.f22307b;

    private static final class a implements Me.f {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f22307b = new a();

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private static final String f22308c = "kotlinx.serialization.json.JsonObject";

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Me.f f22309a;

        private a() {
            Intrinsics.checkNotNullParameter(T.f71792a, "<this>");
            Z z11 = Z.f20279a;
            m mVar = m.f22295a;
            Z keySerializer = Z.f20279a;
            m valueSerializer = m.f22295a;
            Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
            Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
            this.f22309a = new C3705y().b();
        }

        @Override // Me.f
        public final boolean b() {
            return this.f22309a.b();
        }

        @Override // Me.f
        @NotNull
        public final Me.f c(int i11) {
            return this.f22309a.c(i11);
        }

        @Override // Me.f
        public final int d() {
            return this.f22309a.d();
        }

        @Override // Me.f
        @NotNull
        public final String e(int i11) {
            return this.f22309a.e(i11);
        }

        @Override // Me.f
        @NotNull
        public final String f() {
            return f22308c;
        }

        @Override // Me.f
        @NotNull
        public final List<Annotation> getAnnotations() {
            return this.f22309a.getAnnotations();
        }

        @Override // Me.f
        @NotNull
        public final Me.m getKind() {
            return this.f22309a.getKind();
        }

        @Override // Me.f
        public final boolean isInline() {
            return this.f22309a.isInline();
        }
    }

    @Override // Le.f
    @NotNull
    public final Me.f b() {
        return f22306b;
    }

    @Override // Le.f
    public final void c(Ne.a encoder, Object obj) {
        t value = (t) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        O.c(encoder);
        Intrinsics.checkNotNullParameter(T.f71792a, "<this>");
        Z z11 = Z.f20279a;
        m mVar = m.f22295a;
        Z keySerializer = Z.f20279a;
        m valueSerializer = m.f22295a;
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        new C3705y().c(encoder, value);
    }
}
