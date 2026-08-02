package Pe;

import Cf0.O;
import Le.InterfaceC3583a;
import Oe.C3685d;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class d implements InterfaceC3583a<c> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d f22283a = new d();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Me.f f22284b = a.f22285b;

    private static final class a implements Me.f {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f22285b = new a();

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private static final String f22286c = "kotlinx.serialization.json.JsonArray";

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Me.f f22287a;

        private a() {
            m elementSerializer = m.f22295a;
            Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
            this.f22287a = new C3685d(elementSerializer).b();
        }

        @Override // Me.f
        public final boolean b() {
            return this.f22287a.b();
        }

        @Override // Me.f
        @NotNull
        public final Me.f c(int i11) {
            return this.f22287a.c(i11);
        }

        @Override // Me.f
        public final int d() {
            return this.f22287a.d();
        }

        @Override // Me.f
        @NotNull
        public final String e(int i11) {
            return this.f22287a.e(i11);
        }

        @Override // Me.f
        @NotNull
        public final String f() {
            return f22286c;
        }

        @Override // Me.f
        @NotNull
        public final List<Annotation> getAnnotations() {
            return this.f22287a.getAnnotations();
        }

        @Override // Me.f
        @NotNull
        public final Me.m getKind() {
            return this.f22287a.getKind();
        }

        @Override // Me.f
        public final boolean isInline() {
            return this.f22287a.isInline();
        }
    }

    @Override // Le.f
    @NotNull
    public final Me.f b() {
        return f22284b;
    }

    @Override // Le.f
    public final void c(Ne.a encoder, Object obj) {
        c value = (c) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        O.c(encoder);
        m elementSerializer = m.f22295a;
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        new C3685d(elementSerializer).c(encoder, value);
    }
}
